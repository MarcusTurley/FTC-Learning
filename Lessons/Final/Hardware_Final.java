package org.firstinspires.ftc.teamcode.Hardware;

//LinearOpMode Imports
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; //Imports the class for LinearOpMode
//IMU Imports
import com.qualcomm.hardware.bosch.BNO055IMU; //Imports the class for IMU
//Motor Imports
import com.qualcomm.robotcore.hardware.DcMotor; //Imports the class for DCMoor
//Servo Imports
import com.qualcomm.robotcore.hardware.Servo; //Imports the class for Servo
//CRServo Imports
import com.qualcomm.robotcore.hardware.CRServo; //Imports the class for CRServo

public class Hardware_Final extends LinearOpMode {
  //Becuase this in Java we can make an array of Motors, Servos, and CRServos
	//We do this because it allows for greater effenciency when refrencing out motors
  public static DCMOtor[] Motors;
  public static Servo[] Servos;
  public static CRServo[] CRServos;
	//These are set to null and are initialized inside of thier respective hardwares.
  
  //We can create a method that we call at runtime called initialize that initializes all of the refrences and variables.
  //Notice how this void is protected. We use protected to obtain parent methods inside child classes without the need to import the methods
  //We do this because we are going to make out Runtime_Autonomous and out RunTime_TeleOp extend from this.
  protected static void init() {
    
  }
	
	//Method that will compile inside Runmode_Autonomous
	public void Autonomous(){
		/*  Motors  */
		Motor_Hardware.runEncoder();	//References from Motor_Hardware
		Motor_Hardware.InitMotors();	//References from Motor_Hardware
		/*  Servos  */
		Servo_Hardware.InitServosAutonomous();	//References from Servo_Hardware
		/*  Sensors  */
		IMU_Hardware.InitIMU();	//References from IMU_Hardware
	}
//Note: We could static refernce the Hardware for the Motors, Servos, etc. through imports however, this would lead to confusion on where the imports are coming from so we refence them directly in the code. This is purely for

	//Method that will compile inside Runmode_TeleOp
	public void TeleOp(){
		/*  Motors  */
		Motor_Hardware.runWithoutEncoder();
		Motor_Hardware.InitMotors();
		/*  Servos  */
		Servo_Hardware.InitServosTeleOp();
		/*  Sensors  */
		IMU_Hardware.InitIMU();
	}
//Note: We could static refernce the Hardware for the Motors, Servos, etc. through imports however, this would lead to confusion on where the imports are coming from so we refence them directly in the code. This is purely for

	//Compile inside of any of the RunOpMode
	public void InitializeRunMode(){
    //We can obtain methods from other classes to organize and shorten code
    
    //However variables we must extends from LinearOpMode cannot be accessed inside of the static classes so we must do so in this class
		/*  Motors  */
		Motors[0] = hardwareMap.get(DcMotor.class, "RightFront");
		Motors[1] = hardwareMap.get(DcMotor.class, "RightRear");
		Motors[2] = hardwareMap.get(DcMotor.class, "LeftFront");
		Motors[3] = hardwareMap.get(DcMotor.class, "LeftRear");
		/*  Servos  */
		Servos[0] = hardwareMap.get(Servo.class, "LeftArm");
		Servos[1] = hardwareMap.get(Servo.class, "RightArm");

		Servos[0].setDirection(Servo.Direction.FORWARD);
		Servos[1].setDirection(Servo.Direction.FORWARD);
		/*  CRServos  */
		CRServos[0] = hardwareMap.get(CRServo.class, "LeftShooter");
		CRServos[1] = hardwareMap.get(CRServo.class, "RightShooter");

		CRServos[0].setDirection(CRServo.Direction.FORWARD);
		CRServos[1].setDirection(CRServo.Direction.FORWARD);
		/*  Sensors */
		IMU = hardwareMap.get(BNO055IMU.class, "IMU");
	}

	@Override
	public void runOpMode() throws InterruptedException { }
}
}
