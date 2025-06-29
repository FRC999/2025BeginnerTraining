// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  public static SparkMax spark;
  private Spark pidController;
    public DriveSubsystem() {
      spark = new SparkMax(1,MotorType.kBrushless);
      SparkMaxConfig config = new SparkMaxConfig();
      spark.configure(config,SparkBase.ResetMode.kResetSafeParameters,SparkBase.PersistMode.kPersistParameters);

      PIDController  = new spark.getPIDController();

    }

    public boolean pressed(XboxController c){
        return c.getXButton();
    }
  
    public void moveMotor1000(){
        while (spark.getAbsoluteEncoder().getPosition() <= 1000){
            spark.set(.3);
        }
        spark.set(0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
