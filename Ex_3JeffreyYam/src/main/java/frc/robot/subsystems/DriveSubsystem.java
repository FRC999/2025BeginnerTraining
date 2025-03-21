// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  private DifferentialDrive robotChassis;
  private SparkMax firstMotor;
  private SparkMax secondMotor;

  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    firstMotor = new SparkMax(54, MotorType.kBrushless);
    secondMotor = new SparkMax(57, MotorType.kBrushless);
    
    SparkMaxConfig maxConfigFirst = new SparkMaxConfig();
    SparkMaxConfig maxConfigSecond = new SparkMaxConfig();

    firstMotor.configure(maxConfigFirst, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
    maxConfigSecond.inverted(true);
    secondMotor.configure(maxConfigSecond, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);

    robotChassis = new DifferentialDrive(firstMotor, secondMotor);

    SendableRegistry.addChild(robotChassis, firstMotor);
    SendableRegistry.addChild(robotChassis, secondMotor);
    //followMotor.configure(maxConfig, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
  }

public void dynamicSpeedChange (double move, double moveOther) {
  robotChassis.tankDrive(move, moveOther);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
