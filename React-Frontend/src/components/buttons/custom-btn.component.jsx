import React from "react";

import "./custom-buttom.styles.scss";

const CustomButton = ({
  children,
  isAdditionalSignUpButton,
  inverted,
  ...otherProps
}) => (
  <button
    className={`${inverted ? "inverted" : ""} ${
      isAdditionalSignUpButton ? "additional-sign-up" : ""
    } custom-button`}
    {...otherProps}
  >
    {children}
  </button>
);

export default CustomButton;
