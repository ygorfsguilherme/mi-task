import React from 'react'
import ReactDOM from 'react-dom/client'
import AppRouter from './utils/router';
import './index.scss'

import { BrowserRouter as Router, Routes, Route, useLocation } from "react-router-dom";

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <Router>
      <AppRouter />
    </Router>
  </React.StrictMode>
)
