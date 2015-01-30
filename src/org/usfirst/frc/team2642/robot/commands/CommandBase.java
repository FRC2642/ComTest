package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.subsystems.Drive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 */
public abstract class CommandBase extends Command {

	public static Drive drive = new Drive();
	
	
	public CommandBase() {

	}

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putData(drive);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
