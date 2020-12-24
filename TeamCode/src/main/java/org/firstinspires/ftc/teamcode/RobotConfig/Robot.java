package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {
    public MecanumDrive motion;


    public Robot(HardwareMap hardwareMap){
        this.motion = new MecanumDrive(hardwareMap);
    }


}
