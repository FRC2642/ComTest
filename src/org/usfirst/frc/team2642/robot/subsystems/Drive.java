package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.OI;
import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.MecanumDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class Drive extends Subsystem {
	RobotDrive robotDrive = new RobotDrive(RobotMap.frontLeft,RobotMap.frontRight,RobotMap.backLeft,RobotMap.backRight);
    Joystick stick = OI.stick;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void ControlDrive(){
    	robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getRawAxis(4), 0);
    }
	public void StopDrive(){
    	robotDrive.mecanumDrive_Cartesian(0, 0, 0, 0);
	}
	
	
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MecanumDrive());
    }
	public static void CommandDrive() {
		// TODO Auto-generated method stub
		
	}
}

