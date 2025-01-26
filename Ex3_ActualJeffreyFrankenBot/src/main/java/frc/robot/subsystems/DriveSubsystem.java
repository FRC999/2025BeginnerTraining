// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

  private DifferentialDrive robotChassis;
  private SparkMax motorOne;
  private SparkMax motorTwo;
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    motorOne = new SparkMax(54, MotorType.kBrushless);
    motorTwo = new SparkMax(57, MotorType.kBrushless);
    
    SparkMaxConfig motorOneConfig = new SparkMaxConfig();
    SparkMaxConfig motorTwoConfig = new SparkMaxConfig();

    motorOne.configure(motorOneConfig, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
    motorTwoConfig.inverted(true);
    motorTwo.configure(motorTwoConfig, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);

    robotChassis = new DifferentialDrive(motorOne, motorTwo);

    SendableRegistry.addChild(robotChassis, motorOne); 
    SendableRegistry.addChild(robotChassis, motorTwo);


  }

  public void dynamicSpeedChange(double moveFirst, double moveSecond) {
    robotChassis.tankDrive(moveFirst, moveSecond);
  }

  @Override
  public void periodic() {
    // This method will be ca lled once per scheduler run
  }
}
