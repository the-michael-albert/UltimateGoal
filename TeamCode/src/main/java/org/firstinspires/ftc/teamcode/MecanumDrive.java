package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotConfig.Robot;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad2;

@TeleOp(name = "Dpad Drive",group = "TeleOp")

public class MecanumDrive extends LinearOpMode {
    public Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        this.robot = new Robot(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.dpad_up) {
                robot.motion.driveForward(1);
            }
            if (gamepad1.dpad_down) {
                robot.motion.driveBackward(1);
            }
            if (gamepad1.dpad_right) {
                robot.motion.strafeRight(1);
            }
            if (gamepad1.dpad_left) {
                robot.motion.strafeLeft(1);
            }


            if(gamepad1.dpad_right&&gamepad1.dpad_up){
                robot.motion.setPower(new double[][]{
                        {1,0},
                        {0,1}
                });
            }

            robot.reach.setPosition((0.5 + gamepad2.right_stick_y));


            robot.motion.driveForward(0);
        }
    }
}
