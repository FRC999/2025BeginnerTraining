// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  private SparkMax motor;
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    motor = new SparkMax(4, MotorType.kBrushless);
  }

  public void startMotor() {
    motor.set(0.3);
  }

  public void stopMotor() {
    motor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
