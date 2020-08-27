import React from "react";
import { Route, Switch } from "react-router-dom";
import Directory from "./components/directory/directory.component";
import HomePage from "../src/pages/home-page.component";
import SignIn from "../src/components/sign-in/sign-in.component";
import SignUp from "../src/components/sign-up/sign-up.component";
import "./App.css";

function App() {
  return (
    <div className="App">
      <Switch>
        <Route path={"/directory"} component={Directory} />
        <Route exact path={"/"} component={HomePage} />
        <Route path={"/directory"} component={Directory} />
        <Route exact path={"/signin"} render={() => <SignIn />} />
        <Route exact path={"/signup"} component={SignUp} />
      </Switch>
    </div>
  );
}

export default App;
