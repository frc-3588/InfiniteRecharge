// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.subsystems.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
public JoystickButton acquisitionConveyerButton;
public Joystick driverController;
public JoystickButton cameraServoUpButton;
public JoystickButton cameraServoDownButton;
public JoystickButton cameraServoShooterButton;
public JoystickButton shooterOnButton;
public JoystickButton acquisitionOnButton;
public JoystickButton climbingOpenLockButton;
public JoystickButton climbingCloseLockButton;
public Joystick operatorController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public final int LEFT_THUMB = 1;
    public final int RIGHT_THUMB = 3;

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

operatorController = new Joystick(1);

climbingCloseLockButton = new JoystickButton(operatorController, 1);
climbingCloseLockButton.whenPressed(new ClimbCloseLockCommand());
climbingOpenLockButton = new JoystickButton(operatorController, 1);
climbingOpenLockButton.whenPressed(new ClimbOpenLockCommand());
acquisitionOnButton = new JoystickButton(operatorController, 5);
acquisitionOnButton.whileHeld(new AcquisitionOnCommand());
shooterOnButton = new JoystickButton(operatorController, 4);
shooterOnButton.whileHeld(new ShooterOnCommand());
cameraServoShooterButton = new JoystickButton(operatorController, 3);
cameraServoShooterButton.whenPressed(new ServoShooterCommand());
cameraServoDownButton = new JoystickButton(operatorController, 2);
cameraServoDownButton.whileHeld(new CameraServoDownCommand());
cameraServoUpButton = new JoystickButton(operatorController, 1);
cameraServoUpButton.whileHeld(new CameraServoUpCommand());
driverController = new Joystick(0);

acquisitionConveyerButton = new JoystickButton(driverController, 1);
acquisitionConveyerButton.whileHeld(new AcquisitionConveyerMotorOn());


        // SmartDashboard Buttons
        SmartDashboard.putData("CameraServoUpCommand", new CameraServoUpCommand());
        SmartDashboard.putData("CameraServoDownCommand", new CameraServoDownCommand());
        SmartDashboard.putData("ServoShooterCommand", new ServoShooterCommand());
        SmartDashboard.putData("ManualClimbCommand", new ManualClimbCommand());
        SmartDashboard.putData("AutonomousCommand", new AutonomousCommand());
        SmartDashboard.putData("DriveCommand", new DriveCommand());
        SmartDashboard.putData("AcquisitionOnCommand", new AcquisitionOnCommand());
        SmartDashboard.putData("AcquisitionOffCommand", new AcquisitionOffCommand());
        SmartDashboard.putData("ShooterOnCommand", new ShooterOnCommand());
        SmartDashboard.putData("ShooterOffCommand", new ShooterOffCommand());
        SmartDashboard.putData("AutonomousCenterGroup", new AutonomousCenterGroup());
        SmartDashboard.putData("AutonomousOutside", new AutonomousOutside());
        SmartDashboard.putData("AutonomousCenter", new AutonomousCenter());
        SmartDashboard.putData("AcquisitionConveyerMotorOn", new AcquisitionConveyerMotorOn());
        SmartDashboard.putData("AcqisitionConveyerMotorOff", new AcqisitionConveyerMotorOff());
        SmartDashboard.putData("ClimbOpenLockCommand", new ClimbOpenLockCommand());
        SmartDashboard.putData("ClimbCloseLockCommand", new ClimbCloseLockCommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        acquisitionOnButton.whenReleased(new AcquisitionOffCommand());
        shooterOnButton.whenReleased(new ShooterOffCommand());
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getDriverController() {
        return driverController;
    }

public Joystick getOperatorController() {
        return operatorController;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}