import React from "react";
import { Route, Switch } from "react-router-dom";
import Directory from "./components/directory/directory.component";
import HomePage from "../src/pages/home-page.component";
import NavBar from "./components/nav/nav-bar.component";
import SignInAndSignUpPage from "../src/pages/sign-in-and-sign-up.component";
import "./App.css";

function App() {
  return (
    <div className="App">
      <NavBar />
      <Switch>
        <Route path={"/directory"} component={Directory} />
        <Route exact path={"/"} component={HomePage} />
        <Route path={"/directory"} component={Directory} />
        <Route exact path={"/signin"} render={() => <SignInAndSignUpPage />} />
      </Switch>
    </div>
  );
}

export default App;
