import React, { Component } from "react";
import { Link } from "react-router-dom";

class HomePage extends Component {
  render() {
    return (
      <div>
        <h1>We are Under Construction Now!!!</h1>
        <Link to="/directory">
          <h2>Temporary Link to Team</h2>
        </Link>
      </div>
    );
  }
}

export default HomePage;
