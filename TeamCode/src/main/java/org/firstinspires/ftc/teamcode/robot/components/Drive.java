package org.firstinspires.ftc.teamcode.robot.components;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;


public class Drivetrain {
    private final DcMotor FrontLeftMotorPower, FrontRightMotorPower, BackLeftMotorPower, BackRightMotorPower;
    public Drivetrain(HardwareMap hardwareMap) {

        BackLeftMotorPower = hardwareMap.get(DcMotorEx.class, "Bottom-Left-Motor");
        BackRightMotorPower = hardwareMap.get(DcMotorEx.class, "Bottom-Right-Motor");

        //FrontRightMotorPower.setDirection(DcMotor.Direction.REVERSE);
        //BackRightMotorPower.setDirection(DcMotor.Direction.REVERSE);
        BackLeftMotorPower.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackRightMotorPower.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void drive(double leftY) {
        BackLeftMotorPower.setPower(leftY);
        BackRightMotorPower.setPower(leftY);
    }

}