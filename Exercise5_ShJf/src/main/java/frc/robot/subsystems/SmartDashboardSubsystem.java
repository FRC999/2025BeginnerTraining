// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class SmartDashboardSubsystem extends SubsystemBase {
  /** Creates a new SmartDashboardSubsystem. */
  public SmartDashboardSubsystem() {
    
  }

  public void updateSmartDashboard() {

    SmartDashboard.putNumber("NavX Roll: ", RobotContainer.navXSubsystem.getRoll());
    SmartDashboard.putNumber("Pigeon Pitch: ", RobotContainer.pigeonSubsystem.getPitch());
    SmartDashboard.putNumber("Pigeon Yaw: ", RobotContainer.pigeonSubsystem.getYaw());
    SmartDashboard.putNumber("Pigeon Roll: ", RobotContainer.pigeonSubsystem.getRoll());
  }
  @Override
  public void periodic() {
    updateSmartDashboard();
    // This method will be called once per scheduler run
  }
}