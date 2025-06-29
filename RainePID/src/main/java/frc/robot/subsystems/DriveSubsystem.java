// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  private static SparkMax sparkMotor;
  private SparkClosedLoopController sparkController;
  //private RelativeEncoder sparkEncoder;
    public DriveSubsystem() {
      sparkMotor = new SparkMax(1,MotorType.kBrushless);
      sparkController = sparkMotor.getClosedLoopController();
      //sparkEncoder = sparkMotor.getAlternateEncoder();

      // spark = new Spark(1,MotorType.kBrushless);
      // SparkMaxConfig config = new SparkMaxConfig();
      // spark.configure(config,SparkBase.ResetMode.kResetSafeParameters,SparkBase.PersistMode.kPersistParameters);

      // PIDController  = spark.getPIDController();

    }
  
    public void moveMotor1000(){
        sparkController.setReference(1000, ControlType.kPosition);
    }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
