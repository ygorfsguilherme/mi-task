package com.guilherme.mitask.webSecurityConfig;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guilherme.mitask.exceptions.NoAuthorizedException;
import com.guilherme.mitask.model.User;
import com.guilherme.mitask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
public class AuthTokenFilter extends OncePerRequestFilter {
    private TokenService tokenService;
    private UserRepository userRepository;

    @Autowired
    public AuthTokenFilter(TokenService tokenService, UserRepository userRepository) {
        this.tokenService = tokenService;
        this.userRepository = userRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String token = getToken(request);
        boolean tokenValid = this.tokenService.isTokenValid(token);

        try {
            if(tokenValid){
                authenticate(token);
            }

            if (token != null && !tokenValid){
                throw new NoAuthorizedException();
            }

            filterChain.doFilter(request, response);
        } catch (Exception ex) {
            ((HttpServletResponse) response).setStatus(403);
            response.getOutputStream().write(ex.toString().getBytes());
        }
    }

    private void authenticate(String token) throws Exception {
        try {
            String username = tokenService.getUsername(token);
            User user = userRepository.findByName(username);

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                    user, null, user.getAuthorities());

            SecurityContextHolder.getContext().setAuthentication(authentication);

        } catch (Exception e) {
            throw new NoAuthorizedException();
        }
    }

    private String getToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");

		if (token == null || !token.startsWith("Bearer ")) {
            return null;
        }

        return token.substring(7);
    }

}
