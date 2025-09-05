package org.firstinspires.ftc.teamcode.robot.components;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;


public class Drive {
    private final DcMotor BackLeftMotorPower, BackRightMotorPower;
    public Drive(HardwareMap hardwareMap) {

        BackLeftMotorPower = hardwareMap.get(DcMotorEx.class, "Bottom-Left-Motor");
        BackRightMotorPower = hardwareMap.get(DcMotorEx.class, "Bottom-Right-Motor");

        BackLeftMotorPower.setDirection(DcMotor.Direction.REVERSE);
        BackRightMotorPower.setDirection(DcMotor.Direction.REVERSE);
        BackLeftMotorPower.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackRightMotorPower.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void drive(double leftY, double rightY) {
        BackLeftMotorPower.setPower(leftY);
        BackRightMotorPower.setPower(rightY);
    }

}