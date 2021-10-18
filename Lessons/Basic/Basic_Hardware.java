// @Note @Description is not essential to understanding what is going on but is useful it you lose track

//We can create a class called Hardware and extend LinearOpMode.
//LinearOpMode contains a number of methods and variables that help structure and define the program for runtime.
public class Hardware extends LinearOpMode {
  //This lesson will explain what a Hardware is, how it functions, and how to structure it.
  
  //A 'Hardware' is a structure that holds all of the .
  //You can imagine a hardware as a box of legos.
  //When you want to add something to your lego collection you must add something to your lego box.
  
  //Here is an example of how to define a motor.
  DCMotor legRight;	//@Description	This creates a new DCMotor object called legRight
	
  //Here is another example.
  DCMotor legLeft;	//@Description	This creates a new DCMotor object called legLeft
	
	// We can do the same for Servos (are small mechines that can rotate to setPositions however have a set amount of power
	Servos ankleRight;	//@Description	This creates a new Servo object called ankleRight
	Servos ankleLeft;	//@Description	This creates a new Servo object called ankleLeft
	
	//This will be called inside of Basic_TeleOp inside the runOpMode method
	protected void initialize() {
		
		//This is where we refrence the names from the phone configuration so that the Control Hub can assign the objects to it.
		legRight = hardwareMap.get(DcMotor.class, "RightLeg");	//@Description This assigns the ankleRight to rightAnkle
		legLeft = hardwareMap.get(DcMotor.class, "LeftLeg");	//@Description This assigns the ankleRight to leftAnkle
		
		ankleRight = hardwareMap.get(Servo.class, "RightAnkle");	//@Description This assigns the ankleRight to rightAnkle
		ankleLeft = hardwareMap.get(Servo.class, "LeftAnkle");		//@Description This assigns the ankleRight to rightAnkle
	}
	
	//Note we do not call runOpMode inside of this class, instead we call.
}
