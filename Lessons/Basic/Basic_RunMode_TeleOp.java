//@Note It is recemmended that you read Basic_Hardware before viewing this class

package org.firstinspires.ftc.teamcode.Lessons.Basic.Basic_RunMode_TeleOp.java;

//This is the import for Basic_Hardware
import org.firstinspires.ftc.teamcode.Lessons.Basic.Basic_Hardware.java;

@TeleOp(name= "RunMode: Basic_RunMode_TeleOp", group = "TeleOp")
//We extend Basic_Hardware to be able to reference it's methods
public class Basic_RunMode_TeleOp extends Basic_Hardware {
	
	//This overrides the runOpMode method from the LinearOpMode class and when the program is exicuted
	@Override
	public void runOpMode() {
		TeleOp();	//@Description We call the initialize from the Basic_Hardware class

		//This will wait for the run button to be pressed and continue compilation
		waitForStart();	//@Description This is called from LinearOpMode
		
		initialize();	//Refrences initialize from Basic_Hardware and calls it
    
		//This will keep looping for the entirety of runtime so that the inputs can be read constantly
		//This also checks to see if the program has been forced stop to stop the while loop to prevent an error
		while (opModeIsActive() && !isStopRequested()) {
			Basic_Hardware.initialize();	//@Description We call the initialize from the Basic_Hardware class
			Move(gamepad1.LeftStr);
		}
	}
	
	private void move(double forward, double horizontal, double rotational) {
		
	}
}
