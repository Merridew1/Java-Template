package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class arms extends SubsystemBase {

    private VictorSP rightMotor = new VictorSP(2);
    private VictorSP leftMotor = new VictorSP(1);
    private final MotorControllerGroup motors = new MotorControllerGroup(leftMotor, rightMotor);


    public arms() {
        rightMotor.setInverted(true);


    }

    public void intake() {

        motors.set(1);

    }

    public void dispense() {

        motors.set(-1);

    }

    public void stop() {
        motors.set(0);
    }

}
