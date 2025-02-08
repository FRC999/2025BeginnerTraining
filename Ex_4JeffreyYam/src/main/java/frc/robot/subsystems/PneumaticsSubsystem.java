// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {
  /** Creates a new PneumaticsSubsystem. */
  private static DoubleSolenoid solenoid;
  private Compressor compressor;
  private PneumaticsControlModule PCM = new PneumaticsControlModule(0);


  public PneumaticsSubsystem() {
    solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,7, 0);
    compressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    runCompressor();
  }

  public void runCompressor() {
    compressor.enableDigital();
  }

  public void disableCompressor() {
    compressor.disable();
  }

  public void pistonExtend() {
    solenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void pistonRetract() {
    solenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public PneumaticsControlModule PCMValue() {
    return PCM;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
