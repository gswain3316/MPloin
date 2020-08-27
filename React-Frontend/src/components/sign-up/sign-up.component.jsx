import React from "react";
import FormInput from "../form-input/form-input.component";
import CustomButton from "../buttons/custom-btn.component";
import "./sign-up.styles.scss";

class SignUp extends React.Component {
  constructor() {
    super();

    this.state = {
      fullName: "",
      email: "",
      password: "",
      confirmPassword: "",
      seatNumber: "",
    };
  }

  handleSubmit() {
    console.log("submit handled");
  }

  handleChange() {
    console.log("change handled");
  }

  render() {
    const {
      fullName,
      email,
      password,
      confirmPassword,
      seatNumber,
    } = this.state;
    return (
      <div className="sign-up">
        <h2 className="title">Create an account</h2>
        <span>Sign up with your email and password</span>
        <form className="sign-up-form" onSubmit={this.handleSubmit}>
          <FormInput
            type="email"
            name="email"
            value={email}
            onChange={this.handleChange}
            label="Username"
            required
          />
          <FormInput
            type="text"
            name="name"
            value={fullName}
            onChange={this.handleChange}
            label="Full Name"
            required
          />
          <FormInput
            type="password"
            name="password"
            value={password}
            onChange={this.handleChange}
            label="Password"
            required
          />
          <FormInput
            type="password"
            name="confirmPassword"
            value={confirmPassword}
            onChange={this.handleChange}
            label="Confirm Password"
            required
          />
          <FormInput
            type="text"
            name="seatNumber"
            value={seatNumber}
            onChange={this.handleChange}
            label="Seat Number"
            required
          />
          <CustomButton type="submit">Create Account</CustomButton>
        </form>
      </div>
    );
  }
}

export default SignUp;
