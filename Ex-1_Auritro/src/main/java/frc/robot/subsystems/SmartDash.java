// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class SmartDash extends SubsystemBase {
  /** Creates a new SmartDash. */
  public SmartDash() {}

  @Override
  public void periodic() {
    SmartDashboard.putNumber("NAsliderValue", RobotContainer.getValOfAxis());
   // This method will be called once per scheduler run
  }
}
