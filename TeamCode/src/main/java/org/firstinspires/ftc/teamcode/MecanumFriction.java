package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotConfig.Robot;

@TeleOp(name = "Friction Test: 1.0P",group = "TeleOp")

public class MecanumFriction extends LinearOpMode {
    public Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        this.robot = new Robot(hardwareMap);

        waitForStart();
        telemetry.addData("Power", "1");
        telemetry.addData("Time", ".5");
        telemetry.update();
        robot.motion.strafeRight(1);
        Thread.sleep(500);
        robot.motion.driveForward(0);
        Thread.sleep(2000);

        telemetry.addData("Power", "0.5");
        telemetry.addData("Time", ".5");
        telemetry.update();
        robot.motion.strafeRight(0.5);
        Thread.sleep(500);
        robot.motion.driveForward(0);
        Thread.sleep(2000);

        telemetry.addData("Power", "0.25");
        telemetry.addData("Time", ".5");
        telemetry.update();
        robot.motion.strafeRight(0.25);
        Thread.sleep(500);
        robot.motion.driveForward(0);
        Thread.sleep(2000);

        telemetry.addData("Power", "1");
        telemetry.addData("Time", ".25");
        telemetry.update();
        robot.motion.strafeRight(1);
        Thread.sleep(250);
        robot.motion.driveForward(0);
        Thread.sleep(2000);

        telemetry.addData("Power", "0.5");
        telemetry.addData("Time", ".25");
        telemetry.update();
        robot.motion.strafeRight(0.5);
        Thread.sleep(250);
        robot.motion.driveForward(0);
        Thread.sleep(2000);

        telemetry.addData("Power", "0.25");
        telemetry.addData("Time", ".25");
        telemetry.update();
        robot.motion.strafeRight(0.25);
        Thread.sleep(250);
        robot.motion.driveForward(0);
        Thread.sleep(2000);
    }
}
