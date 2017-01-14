
package org.usfirst.frc.team687.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	Joystick joy;
	CANTalon testMotor;
	PowerDistributionPanel pdp;
	SmartDashboard smartDash;
    public void robotInit() {
    	joy = new Joystick(1);
        testMotor = new CANTalon(8);

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	//8 is the current port
        testMotor.set(joy.getY());
        SmartDashboard.putNumber("PDP Current (channel 1)", pdp.getCurrent(1));
        SmartDashboard.putNumber("PDP Current (channel 2)", pdp.getCurrent(2));
        SmartDashboard.putNumber("PDP Current (channel 3)", pdp.getCurrent(3));
        SmartDashboard.putNumber("PDP Current (channel 4)", pdp.getCurrent(4));
        SmartDashboard.putNumber("PDP Current (channel 5)", pdp.getCurrent(5));
        SmartDashboard.putNumber("PDP Current (channel 6)", pdp.getCurrent(6));
        SmartDashboard.putNumber("PDP Current (channel 7)", pdp.getCurrent(7));
        SmartDashboard.putNumber("PDP Current (channel 8)", pdp.getCurrent(8));
        SmartDashboard.putNumber("PDP Current (channel 9)", pdp.getCurrent(9));
        SmartDashboard.putNumber("PDP Current (channel 10)", pdp.getCurrent(10));
        SmartDashboard.putNumber("PDP Current (channel 11)", pdp.getCurrent(11));
        SmartDashboard.putNumber("PDP Current (channel 12)", pdp.getCurrent(12));
        SmartDashboard.putNumber("PDP Current (channel 13)", pdp.getCurrent(13));
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }

}
