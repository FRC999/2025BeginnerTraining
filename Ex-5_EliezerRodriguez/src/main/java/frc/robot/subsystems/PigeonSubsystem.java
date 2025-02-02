// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PigeonSubsystem extends SubsystemBase {
  /** Creates a new PigeonSubsystem. */
  private TalonSRX talon = new TalonSRX(4); 
  private PigeonIMU pigeon = new PigeonIMU(talon);

  public PigeonSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public double getPitch(){
    return pigeon.getPitch();
  }

  public double getRoll(){
    return pigeon.getRoll();
  }
  
  public double getYaw(){
    return pigeon.getYaw();
  }
}
