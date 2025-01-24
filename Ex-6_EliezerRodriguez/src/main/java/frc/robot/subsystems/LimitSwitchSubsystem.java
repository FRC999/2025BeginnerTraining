// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimitSwitchSubsystem extends SubsystemBase {
  public static DigitalInput limitSwitch;

  /** Creates a new LimitSwitchSubsystem. */
  public LimitSwitchSubsystem() {

    //Initialize the limit switch (WOWIE)
        if(limitSwitch == null) {
          try {
            limitSwitch = new DigitalInput(9);
          } catch (Exception e) {
            System.out.println("No Limit Switch Value D:");
          }
        }
  }

  public boolean GetSwitchValue(){
    return !limitSwitch.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
