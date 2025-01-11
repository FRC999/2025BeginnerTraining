// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSystem. */
  private SparkMax motor1;
  private SparkMax motor2;
  
  public DriveSubsystem() {
    motor1 = new SparkMax(57, MotorType.kBrushless);
    motor2 = new SparkMax(54, MotorType.kBrushless);
    var maxConfig = new SparkMaxConfig(); // var takes place of SparkMaxConfig
    maxConfig.follow(motor1);
  
    //maxConfig.follow(motor1, true);
    motor2.configure(maxConfig, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
  }
  public void doSomething(double speed){
    System.out.println("TEST2 " + speed);
    motor1.set(speed);
    System.out.println("TEST4");
  }
  public void dontDoSomething(){
    System.out.println("TEST3");
    motor1.set(0);  
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
