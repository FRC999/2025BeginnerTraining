// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.studica.frc.AHRS;
import com.studica.frc.AHRS.NavXComType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class NavXSubsystem extends SubsystemBase {
  /** Creates a new NavXSubsystem. */
  public AHRS navX = new AHRS(NavXComType.kMXP_SPI);
  public NavXSubsystem() {}

  public double getPitch() {
    return navX.getPitch();
  }

  public double getRoll() {
    return navX.getRoll();
  }

  public double getYaw() {
    return navX.getYaw();
  }

  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
}
