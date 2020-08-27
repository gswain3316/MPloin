import React from "react";
import FormGroup from "@material-ui/core/FormGroup";
import FormControlLabel from "@material-ui/core/FormControlLabel";
import Switch from "@material-ui/core/Switch";

export default function SwitchLabels() {
  return (
    <FormGroup row>
      <FormControlLabel control={<Switch />} label="In Office" />
      <FormControlLabel disabled control={<Switch />} label="OOO" />
    </FormGroup>
  );
}
