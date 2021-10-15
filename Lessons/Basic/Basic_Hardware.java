//We can create a class called Hardware and extend LinearOpMode.
//LinearOpMode contains a number of methods and variables that help structure and define the program for runtime.
public class Hardware extends LinearOpMode {
  //This lesson will explain what a Hardware is, how it functions, and how to structure it.
  
  //A 'Hardware' is a structure that holds all of the .
  //You can imagine a hardware as a box of legos.
  //When you want to add something to your lego collection you must add something to your lego box.
  
  //Here is an example of how to define a motor.
  DCMotor legoArm;
  
  //As you can see we extend from the audience class and reference it with the signature legoArm.
  //Here is another example.
  DCMotor humanAnkle;
	
	// We can do the same for Servos (are small mechines that can rotate to setPositions however have a set amount of power
  Servos humanAnkle;
}
