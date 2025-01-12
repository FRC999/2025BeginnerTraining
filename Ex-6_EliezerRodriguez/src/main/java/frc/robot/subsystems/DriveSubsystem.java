// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  public SparkMax motor = new SparkMax(57, MotorType.kBrushless);

  public DriveSubsystem() {
    SparkMaxConfig smc = new SparkMaxConfig();
    motor.configure(smc, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  }

  public void runMotor(){
    System.out.println("Running 0.3");
    motor.set(0.3);
  }

  public void stopMotor(){
    System.out.println("Running 0");
    motor.set(0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
