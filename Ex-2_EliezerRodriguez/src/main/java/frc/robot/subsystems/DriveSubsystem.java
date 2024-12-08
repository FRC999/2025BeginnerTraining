// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  private SparkMax leadMotor;
  private SparkMax followMotor;

  private SparkBaseConfig leadingMotor;
  private SparkBaseConfig followingMotor;

  private SparkBase leadingMotorBase;
  private SparkBase followingMotorBase;
  
  private SparkBase.ResetMode leadingMotorReset;
  private SparkBase.ResetMode followingMotorReset;

  private SparkBase.PersistMode leadingMotorPersist;
  private SparkBase.PersistMode followingMotorPersist;

  /** Creates a new DriveSubsystem. */

  public DriveSubsystem() {
    leadMotor = new SparkMax(57, MotorType.kBrushless);
    followMotor = new SparkMax(54, MotorType.kBrushless);



    leadMotor.configure(leadingMotor, leadingMotorReset, leadingMotorPersist);
    
    followingMotor.follow(leadingMotorBase, false);
    followMotor.configure(followingMotor, followingMotorReset, followingMotorPersist);
    
  }

  

  public void startMotor() {
    leadMotor.set(0.3);
  }

  public void stopMotor() {
    leadMotor.set(0);
  }

  public void analogMotor(double val){
    leadMotor.set(val);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
