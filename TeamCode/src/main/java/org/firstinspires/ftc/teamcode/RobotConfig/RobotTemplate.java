package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Extensions.Extension;

import java.util.HashMap;

public abstract class RobotTemplate {
    public DriveTrain motion;
    public HashMap<String, Extension> extensions = new HashMap<>();

    public RobotTemplate(HardwareMap hardwareMap){
        initRobot(hardwareMap);
    }

    public abstract void initRobot(HardwareMap hardwareMap);

    public Extension getExtension(String extName){
        return extensions.get(extName);
    }
    public void addExtension(Extension extension){
        extensions.put(extension.getName(), extension);
    }

}
