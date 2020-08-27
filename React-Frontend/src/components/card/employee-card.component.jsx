import React, { Component } from "react";
import "./employee-card.styles.css";
import VisibilityOffIcon from "@material-ui/icons/VisibilityOff";
import RemoveRedEyeIcon from "@material-ui/icons/RemoveRedEye";
import SwitchLabels from "../material-items/switch-button.component";
import FloatingActionButtons from "../material-items/action-buttons.component";
import BadgeAvatars from "../material-items/avatars.component";
// import TemporaryDrawer from "../material-items/drawer-bottom.component";

class Card extends Component {
  constructor(props) {
    super(props);
    this.state = { isHovering: false };
  }

  handleMouseHover = () => {
    this.setState((prevState) => ({ isHovering: !prevState.isHovering }));
  };

  render() {
    const { employeeName, loggedIn, seatNo } = this.props;

    return (
      <div
        key="employeeId"
        className="card-item"
        onMouseEnter={this.handleMouseHover}
        onMouseLeave={this.handleMouseHover}
      >
        {loggedIn === "true" ? <RemoveRedEyeIcon /> : <VisibilityOffIcon />}

        <SwitchLabels />
        <BadgeAvatars employeeName={employeeName} />

        <h2>{employeeName}</h2>

        <span>Seat No: {seatNo}</span>

        {this.state.isHovering && (
          <span>
            <FloatingActionButtons />
          </span>
        )}
      </div>
    );
  }
}

export default Card;
