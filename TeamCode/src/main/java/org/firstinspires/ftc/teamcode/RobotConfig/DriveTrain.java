package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

public abstract class DriveTrain {
    private DcMotor frontRight, frontLeft, backRight, backLeft;
    private DcMotor[][] motorArray;

    public DriveTrain(HardwareMap hardwareMap){
        frontRight = hardwareMap.dcMotor.get("fR");
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        frontLeft = hardwareMap.dcMotor.get("fL");
        backRight = hardwareMap.dcMotor.get("bR");
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);

        backLeft = hardwareMap.dcMotor.get("bL");
    }


    public DcMotor getFrontRight() {
        return frontRight;
    }

    public DcMotor getFrontLeft() {
        return frontLeft;
    }

    public DcMotor getBackRight() {
        return backRight;
    }

    public DcMotor getBackLeft() {
        return backLeft;
    }

    public void setPower(double[][] powerTable){
        if (powerTable.length > 2 || powerTable[0].length > 2 || powerTable[1].length > 2){
            return;
        }
        frontLeft.setPower(powerTable[0][0]);
        frontRight.setPower(powerTable[0][1]);
        backLeft.setPower(powerTable[1][0]);
        backRight.setPower(powerTable[1][1]);

    }

}
