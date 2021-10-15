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
  
  //Becuase this in Java we can make an array of Motors
  DCMotor[] Motors;
  
  //We can create a method that we call at runtime called initialize that initializes all of the refrences and variables.
  //Notice how this void is protected. We use protected to obtain parent methods inside child classes without the need to import the methods
  //We do this because we are going to make out Runtime_Autonomous and out RunTime_TeleOp extend from this.
  protected static void init() {
    //We can obtain methods from other classes to organize and shorten code
    
    //However variables we must extends from LinearOpMode cannot be accessed inside of the static classes so we must do so in this class
    
  }
}
