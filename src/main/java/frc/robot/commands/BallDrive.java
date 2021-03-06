/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import static frc.robot.Constants.FLIGHT_TWIST;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class BallDrive extends CommandBase {
  /**
   * Creates a new TankDrive.
   * 
   * Asher was here
   * 
   */
  public BallDrive() {
    addRequirements(Robot.ballTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //the motor only moves if the trigger is held down, I've commented everywhere that deals with this with a little catchphrase...
     double flightTwist = Robot.m_RC.GetShotgunRawAxis(FLIGHT_TWIST);
      if (frc.robot.Constants.triggerTwoStatus == true) {
        Robot.ballTrain.setBallMotor(flightTwist);
      } else {
        Robot.ballTrain.setBallMotor(0);
      }
      // Robot.ballTrain.setBallMotor(flightTwist);

  }


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.ballTrain.setBallMotor(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
