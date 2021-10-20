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
		//We call the initialize from the Basic_Hardware class
		Basic_Hardware.initialize();

		//This will wait for the run button to be pressed and continue compilation
		waitForStart();	//@Description This is called from LinearOpMode
    
		//This will keep looping for the entirety of runtime so that the inputs can be read constantly
		//This also checks to see if the program has been forced stop to stop the while loop to prevent an error
		while (opModeIsActive() && !isStopRequested()) {
			//We input the gamepad that we are using along with the input we wish to output by using gamepad[#number].[input]
			MoveArms(gamepad1.left_stick_x, gamepad1.right_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_y);
			MoveClamps(gamepad1.a, gamepad1.b, gamepad1.x, gamepad1.y);
			MoveClaws(gamepad1.right_trigger, gamepad1.left_trigger);
		}
	}
	
	
	//Moves the motors based on the given inputs
	private void MoveArms(double leftForward, double leftHorizontal, double rightForward, double righHorizontal) {
		ArmLeft.setPower(leftForward + leftHorizontal);
		ArmLeft.setPower(rightForward + righHorizontal);
	}
	
	//Moves the clamps based on the given inputs
	private void MoveClamps(boolean leftPower, boolean rightPower) {
		
		if ((leftPower && rightPower)|| !(leftPower || rightPower)) { //Checks if both variables are the same
			ClampRight.setPosition(0);
			ClampLeft.setPosition(0);
		} else if(leftPower){ //Checks if the servos should move left
			ClampRight.setPosition(1);
			ClampLeft.setPosition(1);
		} else if(rightPower) { //Checks if servos should move right
			ClampRight.setPosition(-1);
			ClampLeft.setPosition(-1);
		}
	}
	
	//Moves the claws
	private void MoveClaws(double leftMove, double rightMove) {
		ClawRight.setPower(leftMove);
		ClawLeft.setPower(righMovet);
	}
}
