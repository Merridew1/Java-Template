package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drivetrain;


public class Drive extends CommandBase {
    CommandXboxController joystick1;
    Drivetrain drive;

    public Drive(Drivetrain drive, CommandXboxController controller) {
        joystick1 = controller;
        this.drive = drive;
        addRequirements(drive);
    }

    @Override
    public void execute() {
        double laxis = -joystick1.getRawAxis(XboxController.Axis.kLeftY.value);
        double raxis = -joystick1.getRawAxis(XboxController.Axis.kRightY.value);
        laxis = (Math.abs(laxis) < 0.01) ? 0 : laxis;
        raxis = (Math.abs(raxis) < 0.01) ? 0 : raxis;
        this.drive.drive(laxis, raxis);
    }
}
