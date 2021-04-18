package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.RobotConfig.MecanumDrive;
import org.firstinspires.ftc.teamcode.RobotConfig.RobotTemplate;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad2;

public class Robot extends RobotTemplate {
    public org.firstinspires.ftc.teamcode.RobotConfig.MecanumDrive motion;

    public Servo tilt;
    public Servo reach;

    public Robot(HardwareMap hardwareMap) {
        super(hardwareMap);
    }


    @Override
    public void initRobot(HardwareMap hardwareMap) {
        this.motion = new MecanumDrive(hardwareMap);
        this.reach = hardwareMap.servo.get("reach");
        this.tilt = hardwareMap.servo.get("tilt");

    }





}
