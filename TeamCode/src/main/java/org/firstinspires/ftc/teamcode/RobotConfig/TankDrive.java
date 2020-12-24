package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class TankDrive extends DriveTrain{

    public TankDrive(HardwareMap hardwareMap){
        super(hardwareMap);
    }

    public void driveForward(double power){
        double p = power;
        setPower(new double[][]{
                {p,p},
                {p,p}
        });
    }

    public void driveBackward(double power){
        double p = power;
        setPower(new double[][]{
                {-p,-p},
                {-p,-p}
        });
    }

    public void turnLeft(double power){
        double p = power;
        setPower(new double[][]{
                {-p, p},
                {-p, p}
        });
    }

    public void turnRight(double power){
        double p = power;
        setPower(new double[][]{
                { p, -p},
                { p, -p}
        });
    }
}
