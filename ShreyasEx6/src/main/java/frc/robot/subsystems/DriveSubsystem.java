// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  public SparkMax motor = new SparkMax(57 MotorType.kBrushless);
  public DriveSubsystem() {
    SparkMaxConfig smc = new SparkMaxConfig();
    motor.configure(smc ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
