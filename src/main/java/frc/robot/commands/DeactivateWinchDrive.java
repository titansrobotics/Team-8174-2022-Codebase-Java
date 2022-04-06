/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//just makes frc.robot.Constants.triggerStatus = false;

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class DeactivateWinchDrive extends CommandBase {
  /**
   * Creates a new TankDrive.
   * 
   * Asher was here
   * 
   */
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    frc.robot.Constants.triggerTwoStatus = false;

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    frc.robot.Constants.triggerTwoStatus = false;

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // frc.robot.Constants.triggerStatus = false;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
