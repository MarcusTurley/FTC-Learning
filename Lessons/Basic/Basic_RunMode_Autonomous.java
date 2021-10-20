//@Note It is recemmended that you read Basic_Hardware before viewing this class

package org.firstinspires.ftc.teamcode.Lessons.Basic.Basic_RunMode_Autonomous.java;

//This is the import for Basic_Hardware
import org.firstinspires.ftc.teamcode.Lessons.Basic.Basic_Hardware.java;

@Autonomous(name= "RunMode: Basic_RunMode_Autonomous", group = "Autonomous")
//We extend Basic_Hardware to be able to reference it's methods
public class Basic_RunMode_Autonomous extends Basic_Hardware {
	
	//This overrides the runOpMode method from the LinearOpMode class and when the program is exicuted
	@Override
	public void runOpMode() {
		//We call the initialize from the Basic_Hardware class
		Basic_Hardware.initialize();

		//This will wait for the run button to be pressed and continue compilation
		waitForStart();	//@Description This is called from LinearOpMode
    
		//Input the move code here. Note that the controllers will not be able to send inputs to the robot, however you may use sensors
    		MoveArms(1, 1, 0.5, 0, 1000);
   		MoveClamps(1, 1);
    		MoveClaws(1, 1);
	}
	
	
	//Moves the arms based on the given inputs
	private void MoveArms(double leftForward, double leftHoricontal,double rightForward,, double righHorizontal, double waitTime) {
		ArmLeft.setPower(leftForward + leftHoricontal);
		ArmLeft.setPower(rightForward + righHorizontal);
    		sleep(waitTime);
	}
	
	//Moves the clamps based on the given inputs
	private void MoveClamps(boolean rightPosition, boolean leftPosition) {
			ClampRight.setPosition(rightPosition);
			ClampLeft.setPosition(leftPosition);
	}
	
	//Moves the claws based on the given inputs
	private void MoveClaws(double leftPower, double rightPower) {
		ClawRight.setPower(leftPower);
		ClawLeft.setPower(rightPower);
    		sleep(500);
	}
}
