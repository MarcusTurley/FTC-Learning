package org.firstinspires.ftc.teamcode.Lessons.Basic.Basic_Runmode_TeleOp.java;

//This is the import for Basic_Hardware
import org.firstinspires.ftc.teamcode.Lessons.Basic.Basic_Hardware.java;

@TeleOp(name= "RunMode: Basic_TeleOpTeleOp", groupd = "TeleOp")
//We extend Basic_Hardware to be able to reference it's methods
public class Basic_TeleOp extends Basic_Hardware {
	
	//This overrides the runOpMode method located inside of LinearOpMode
	//This method exicutes when the program is intialized
  @Override
	public void runOpMode() {
		TeleOp();

		//This will wait for the run button to be pressed and continue compilation
		waitForStart();
    
    initialize(); //Refrences initialize from Basic_Hardware and calls it
    
		//This will keep looping for the entirety of runtime so that the inputs can be read constantly
		//This also checks to see if the program has been forced stop to stop the while loop to prevent an error
		while (opModeIsActive() && !isStopRequested()) {
			
		}
	}
