package org.firstinspires.ftc.teamcode.Extensions;

import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class Extension {
    private String name;
    public HardwareMap hardwareMap;

    public Extension(String name, HardwareMap hwMap){
        this.name = name;
        this.hardwareMap = hwMap;
    }

    public String getName(){
        return name;
    }
}
