// @Note This lesson will explain what a Hardware is, how it functions, and how to structure it.
// @Note @Description is not essential to understanding what is going on but is useful it you lose track

//This contains the folder the porogram is found in within in the Android Studio project and must be inside program; typically it is above all the other code.
package org.firstinspires.ftc.teamcode.Lessons.Basic.Basic_Runmode_TeleOp.java;

//We import LinearOpMode because it is essential for RunTime
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

//We can create a class called Hardware and extend LinearOpMode.
//LinearOpMode contains a number of methods and variables that help structure and define the program for runtime.
public class Hardware extends LinearOpMode {
	//A 'Hardware' is a structure that holds all of the .
	//You can imagine a hardware as a box of legos.
	//When you want to add something to your lego collection you must add something to your lego box.
	
	//Here is an example of how to define a motor.
	DCMotor ArmRight;
	
	//Here is another example.
	DCMotor ArmLeft;
	
	// We can do the same for Servos and CRServos
	Servo ClampRight;
	Servo ClampLeft;
	
	CRServo ClawRight;
	CRServo ClawLeft;
	
	//This will be called inside of Basic_RunMode_TeleOp inside the runOpMode method
	protected void initialize() {
		//This is where we refrence the names from the phone configuration so that the Control Hub can assign the objects to it.
		ArmRight = hardwareMap.get(DcMotor.class, "RightArm");	//@Description This assigns the ArmRight to RightArm
		ArmLeft = hardwareMap.get(DcMotor.class, "LeftArm");	//@Description This assigns the ArmLeft to LeftArm
		
		ClampRight = hardwareMap.get(Servo.class, "RightClamp");	//@Description This assigns the ClampRight to RightClamp
		ClampLeft = hardwareMap.get(Servo.class, "LeftClamp");	//@Description This assigns the ClampLeft to LeftClamp
		
		RightClaw = hardwareMap.get(CRServo.class, "RightClaw");	//@Description This assigns the LeftClaw to RightClaw
		LeftClaw = hardwareMap.get(CRServo.class, "LeftClaw");	//@Description This assigns the LeftClaw to LeftClaw
	}
	
	//Note we do not call runOpMode inside of this class, instead we call it inside of Basic_TeleOp and Basic_Autonomous. This was done si that 
}
