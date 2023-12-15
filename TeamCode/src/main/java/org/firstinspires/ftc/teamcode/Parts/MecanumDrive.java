package org.firstinspires.ftc.teamcode.Parts;

import android.annotation.SuppressLint;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {
   private DcMotor TopLeftMotor;
   private DcMotor TopRightMotor;
   private DcMotor BottomLeftMotor;
   private DcMotor BottomRightMotor;


   @SuppressLint("NotConstructor")
   public void MecanumDrive(HardwareMap hm){  //void Start()
       TopLeftMotor = hm.get(DcMotor.class, "tlm");
       TopRightMotor = hm.get(DcMotor.class, "trm");
       BottomLeftMotor = hm.get(DcMotor.class, "blm");
       BottomRightMotor = hm.get(DcMotor.class, "brm");

       TopLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
       BottomLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

       TopLeftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
   }
}
