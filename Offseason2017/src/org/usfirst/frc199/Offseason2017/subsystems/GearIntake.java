// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc199.Offseason2017.subsystems;

import org.usfirst.frc199.Offseason2017.RobotMap;
import org.usfirst.frc199.Offseason2017.commands.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class GearIntake extends Subsystem implements GearIntakeInterface {

    private final SpeedController rollerBarMotor = RobotMap.gearIntakeRollerBarMotor;
    private final DoubleSolenoid gearIntakePivot = RobotMap.gearIntakeGearIntakePivot;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

