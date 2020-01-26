package be.industriele_ict.coderen.oop.opdracht3;

public class Lichtkrant {
	private String boodschap = "";
	
	
	public Lichtkrant(String boodschap) 
	{
		this.boodschap = boodschap; 
	}
	public void setBoodschap(String boodschap)
	{
		this.boodschap = boodschap;
		System.out.println(this.boodschap);
	}
	
	
	

}
