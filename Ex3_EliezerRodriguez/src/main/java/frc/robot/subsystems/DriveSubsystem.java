// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  private SparkMax leadMotor;
  private SparkMax followMotor;
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    leadMotor = new SparkMax(54, MotorType.kBrushless);
    followMotor = new SparkMax(57, MotorType.kBrushless);

    SparkMaxConfig maxConfig = new SparkMaxConfig();
    maxConfig.follow(leadMotor);
  }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
