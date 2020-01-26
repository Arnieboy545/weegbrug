package be.industriele_ict.coderen.oop.opdracht1;

public class Robot {
	private String name = "";
	private String color = "";
	private int weight = 0;

	public Robot(String n , int w , String c) {
		this.name= n;
		this.weight= w;
		this.color = c;

	}

	public void introduceMyself(){
		System.out.println("Ik ben " + this.name + ", weeg " + this.weight + " kilogram en mijn kleur is " + this.color);


	}


}
