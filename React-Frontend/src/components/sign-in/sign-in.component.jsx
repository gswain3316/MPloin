import React from "react";
import FormInput from "../form-input/form-input.component";
import CustomButton from "../buttons/custom-btn.component";
import { Link } from "react-router-dom";
import "./sign-in.styles.scss";

class SignIn extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      username: "",
      password: "",
    };
  }

  handleSubmit() {
    console.log("submit handled");
  }

  handleChange() {
    console.log("change handled");
  }

  handleClick = () => {
    console.log("All good");
  };

  render() {
    return (
      <div className="sign-in">
        <h2>I already have an account</h2>
        <span>Sign in with your email and password</span>

        <form onSubmit={this.handleSubmit}>
          <FormInput
            name="username"
            type="email"
            handleChange={this.handleChange}
            value={this.state.username}
            label="Username"
            required
          />
          <FormInput
            name="password"
            type="password"
            value={this.state.password}
            handleChange={this.handleChange}
            label="Password"
            required
          />
          <div className="buttons">
            <CustomButton type="submit"> Sign in </CustomButton>
            <Link to="/signup">
              <CustomButton isAdditionalSignUpButton>Sign Up</CustomButton>
            </Link>
          </div>
        </form>
      </div>
    );
  }
}

export default SignIn;
