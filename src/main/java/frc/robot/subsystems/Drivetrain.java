package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    private final MotorControllerGroup left =
        new MotorControllerGroup(new VictorSP(4), new VictorSP(5));
    private final MotorControllerGroup right =
        new MotorControllerGroup(new VictorSP(6), new VictorSP(7));


    public Drivetrain() {
        right.setInverted(true);
    }

    public void drive(double axis1, double axis2) {
        right.set(axis1);
        left.set(axis2);
    }

}
