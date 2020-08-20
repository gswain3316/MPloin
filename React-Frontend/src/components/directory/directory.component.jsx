import React, { Component } from "react";
import { TeamJson } from "../resources/team-details";
import Card from "../card/employee-card.component";
import "./directory.styles.css";

class Directory extends Component {
  // constructor(props) {
  //   super(props);

  // }
  render() {
    return (
      <div className="directory">
        {" "}
        {TeamJson.teams.teamMembers.map(({ employeeId, ...otherProps }) => {
          return <Card key={employeeId} {...otherProps} />;
        })}
      </div>
    );
  }
}

export default Directory;
