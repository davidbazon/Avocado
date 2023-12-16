package org.firstinspires.ftc.teamcode.Parts;

import android.annotation.SuppressLint;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {
   private DcMotor topLeftMotor;
   private DcMotor topRightMotor;
   private DcMotor bottomLeftMotor;
   private DcMotor bottomRightMotor;


   @SuppressLint("NotConstructor")
   public void MecanumDrive(HardwareMap hm){  //void Start()
       topLeftMotor = hm.get(DcMotor.class, "tlm");
       topRightMotor = hm.get(DcMotor.class, "trm");
       bottomLeftMotor = hm.get(DcMotor.class, "blm");
       bottomRightMotor = hm.get(DcMotor.class, "brm");

       topLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
       bottomLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

       topLeftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
   }
}
