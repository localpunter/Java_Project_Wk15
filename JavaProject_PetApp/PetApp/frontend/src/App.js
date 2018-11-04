import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBarHome from './navbars/NavBarHome'
import './App.css';

class App extends Component {
  render() {
    return (
      <Router>
        <React.Fragment>
        <NavBarHome />
        </React.Fragment>
      </Router>
    );
  }
}

export default App;
