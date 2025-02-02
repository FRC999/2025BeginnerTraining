// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.ColorMatch;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ColorSensorSubsystem extends SubsystemBase {
  /** Creates a new ColourSensorSubsystem. */

  public final I2C.Port i2cPort = I2C.Port.kMXP;
  private ColorSensorV3 colorSensor = new ColorSensorV3(i2cPort);
  public static boolean isColorSensor;
  double InfraredSensor = colorSensor.getIR();

  private final ColorMatch colorMatcher = new ColorMatch();
  private final Color BlueThing = new Color(0.143, 0.427, 0.429);
  private final Color GreenThing = new Color(0.197, 0.561, 0.240);
  private final Color RedThing = new Color(0.561, 0.232, 0.114);
  private final Color YellowThing = new Color(0.361, 0.524, 0.113);

  public ColorSensorSubsystem() {
    colorMatcher.addColorMatch(BlueThing);
    colorMatcher.addColorMatch(GreenThing);
    colorMatcher.addColorMatch(RedThing);
    colorMatcher.addColorMatch(YellowThing);
  }

  public String getColor(Color color){
    ColorMatchResult match = colorMatcher.matchClosestColor(color);
    String colorString;
    if(match.color == BlueThing){
      colorString = "Blue";
    } else if (match.color == RedThing){
      colorString = "Red";
    } else if (match.color == GreenThing){
      colorString = "Green";
    } else if (match.color == YellowThing){
      colorString = "Yellow";
    } else {
      colorString = "What the Sigma";
    } 

    return colorString;

  }

  public int getDistance(){
    return colorSensor.getProximity();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    Color detectedColor =  colorSensor.getColor();

    SmartDashboard.putString("Color: ", getColor(detectedColor));
    SmartDashboard.putNumber("Distance: ", getDistance());
  }
}
