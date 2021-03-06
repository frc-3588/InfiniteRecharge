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
public JoystickButton climbWinch;
public JoystickButton liftUp;
public JoystickButton liftDown;
public JoystickButton climbingOpenLockButton;
public JoystickButton climbingCloseLockButton;
public Joystick driverController;
public JoystickButton acquisitionOnButton;
public JoystickButton acquisitionRButton;
public JoystickButton acquisitionConveyerButton;
public JoystickButton acquisitionConveyerRButton;
public JoystickButton cameraServoUpButton;
public JoystickButton cameraServoDownButton;
public JoystickButton shooterOnButton;
public JoystickButton shooterRButton;
public Joystick operatorController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public final int LEFT_THUMB = 1;
    public final int RIGHT_THUMB = 3;
    public final int FRONTPOWERPORTSHOOT = 5;
    public final int FRONTCONTROLPANELSHOOT = 6;
    public final int BACKCONTROLPANELSHOOT = 7;
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

operatorController = new Joystick(1);

shooterRButton = new JoystickButton(operatorController, 5);
shooterRButton.whileHeld(new ShooterReverseCommand());
shooterOnButton = new JoystickButton(operatorController, 6);
shooterOnButton.whileHeld(new ShooterOnCommand());
cameraServoDownButton = new JoystickButton(operatorController, 3);
cameraServoDownButton.whileHeld(new CameraServoDownCommand());
cameraServoUpButton = new JoystickButton(operatorController, 4);
cameraServoUpButton.whileHeld(new CameraServoUpCommand());
acquisitionConveyerRButton = new JoystickButton(operatorController, 7);
acquisitionConveyerRButton.whileHeld(new ConveyerReverseCommand());
acquisitionConveyerButton = new JoystickButton(operatorController, 8);
acquisitionConveyerButton.whileHeld(new AcquisitionConveyerMotorOn());
acquisitionRButton = new JoystickButton(operatorController, 3);
acquisitionRButton.whileHeld(new AcquisitionReverseCommand());
acquisitionOnButton = new JoystickButton(operatorController, 4);
acquisitionOnButton.whileHeld(new AcquisitionOnCommand());
driverController = new Joystick(0);

climbingCloseLockButton = new JoystickButton(driverController, 1);
climbingCloseLockButton.whenPressed(new ClimbCloseLockCommand());
climbingOpenLockButton = new JoystickButton(driverController, 2);
climbingOpenLockButton.whenPressed(new ClimbOpenLockCommand());
liftDown = new JoystickButton(driverController, 5);
liftDown.whileHeld(new ManualClimbDown());
liftUp = new JoystickButton(driverController, 6);
liftUp.whileHeld(new ManualClimbCommand());
climbWinch = new JoystickButton(driverController, 8);
climbWinch.whileHeld(new ManualWinchCommand());


        // SmartDashboard Buttons
        SmartDashboard.putData("CameraServoUpCommand", new CameraServoUpCommand());
        SmartDashboard.putData("CameraServoDownCommand", new CameraServoDownCommand());
        SmartDashboard.putData("ManualClimbCommand", new ManualClimbCommand());
        SmartDashboard.putData("AutonomousCommand", new AutonomousCommand());
        SmartDashboard.putData("DriveCommand", new DriveCommand());
        SmartDashboard.putData("AcquisitionOnCommand", new AcquisitionOnCommand());
        SmartDashboard.putData("AcquisitionOffCommand", new AcquisitionOffCommand());
        SmartDashboard.putData("ShooterOnCommand", new ShooterOnCommand());
        SmartDashboard.putData("ShooterOffCommand", new ShooterOffCommand());
        SmartDashboard.putData("AutonomousCenterGroup", new AutonomousCenterGroup());
        SmartDashboard.putData("AcquisitionConveyerMotorOn", new AcquisitionConveyerMotorOn());
        SmartDashboard.putData("AcquisitionConveyerMotorOff", new AcquisitionConveyerMotorOff());
        SmartDashboard.putData("ClimbOpenLockCommand", new ClimbOpenLockCommand());
        SmartDashboard.putData("ClimbCloseLockCommand", new ClimbCloseLockCommand());
        SmartDashboard.putData("ShooterReverseCommand", new ShooterReverseCommand());
        SmartDashboard.putData("AcquisitionReverseCommand", new AcquisitionReverseCommand());
        SmartDashboard.putData("ConveyerReverseCommand", new ConveyerReverseCommand());
        SmartDashboard.putData("ManualWinchCommand", new ManualWinchCommand());
        SmartDashboard.putData("AutonomousDriveCommand: stop", new AutonomousDriveCommand(0.0, 0.0, 0.0));
        SmartDashboard.putData("AutonomousDriveCommand: rightPivot", new AutonomousDriveCommand(5.1, 0.5, -0.5));
        SmartDashboard.putData("AutonomousDriveCommand: leftPivot", new AutonomousDriveCommand(5.1, -0.5, 0.5));
        SmartDashboard.putData("AutonomousGetOutOfTheWayCommand", new AutonomousGetOutOfTheWayCommand());
        SmartDashboard.putData("AutonomousRightShooting", new AutonomousRightShooting());
        SmartDashboard.putData("AutonomousLeftShooting", new AutonomousLeftShooting());
        SmartDashboard.putData("AutonomousShooter", new AutonomousShooter());
        SmartDashboard.putData("ManualClimbDown", new ManualClimbDown());
        SmartDashboard.putData("ClosedLoopShooting", new ClosedLoopShooting());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        acquisitionOnButton.whenReleased(new AcquisitionOffCommand());
        acquisitionRButton.whenReleased(new AcquisitionOffCommand());
        shooterOnButton.whenReleased(new ShooterOffCommand());
        shooterRButton.whenReleased(new ShooterOffCommand());
        acquisitionConveyerRButton.whenReleased(new AcquisitionConveyerMotorOff());
        acquisitionConveyerButton.whenReleased(new AcquisitionConveyerMotorOff());
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
