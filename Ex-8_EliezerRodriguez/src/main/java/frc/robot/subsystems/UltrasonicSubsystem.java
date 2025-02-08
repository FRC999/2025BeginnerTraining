// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.StopRobotCommand;

public class UltrasonicSubsystem extends SubsystemBase {
  /** Creates a new UltrasonicSubsystem. */
private final AnalogInput sensor = new AnalogInput(2);
double voltage_scale_factor = 5/RobotController.getVoltage5V();

  public UltrasonicSubsystem() {}
  
  public double getDistanceInInches(){
    return sensor.getValue() * voltage_scale_factor * 0.0492;
  }

  @Override
  public void periodic() {
    if (getDistanceInInches() < 20) {
      new StopRobotCommand();
    }
    
    // This method will be called once per scheduler run
  }
}
