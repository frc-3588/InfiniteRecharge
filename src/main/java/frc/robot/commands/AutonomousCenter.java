/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class AutonomousCenter extends Command {
  private final double VERTICAL_MAX_ROTATIONS = Robot.chassis.getTotalCounts(Robot.chassis.BACKWARDSDISTANCE);

  public AutonomousCenter() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.chassis.setTankDrivePower(-1 * Robot.chassis.NORMAL, -1 * Robot.chassis.NORMAL);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if (Robot.chassis.getAverageEncoderValue() < VERTICAL_MAX_ROTATIONS) {
      return false;
    } else {
      return true;
    }
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.chassis.setTankDrivePower(Robot.chassis.STOP, Robot.chassis.STOP);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
