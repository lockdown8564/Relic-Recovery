package ftc8564lib;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by margaretli on 11/10/17.
 */

public class Clamps {
    Servo clampleft;
    Servo clampright;
    LinearOpMode opMode;
    private double openL = 1;
    private double openR = 0;
    private double closeL = .5;
    private double closeR = .4;

    public Clamps (LinearOpMode opMode) {
        this.opMode = opMode;
        clampleft = opMode.hardwareMap.servo.get("clampleft");
        clampright = opMode.hardwareMap.servo.get("clampright");
    }

    public void open(){
        clampleft.setPosition(openL);
        clampright.setPosition(openR);
    }

    public void close(){
        clampleft.setPosition(closeL);
        clampright.setPosition(closeR);
    }

}
