package be.industriele_ict.coderen.oop.opdracht1;

public class RobotToepassing {

	public static void main(String[] args) {
		Robot robotNorth = new Robot("Tom" , 30 , "Red");
		Robot robotSouth = new Robot("Jerry" , 40 , "Blue");


		robotNorth.introduceMyself();
		robotSouth.introduceMyself();


	}

}
