package be.industriele_ict.coderen.oop.opdracht2;

public class Leerling {
	private String voornaam;
	private String klasgroep;
	private int percentSoftware;
	


	public Leerling(String v, String k, int p) {
		this.voornaam = v;
		this.klasgroep = k;
		this.percentSoftware = p;
	}
	
	
	public void voorstellen() {
		System.out.println("Ik ben " + this.voornaam + ", ik zit in de klas " + this.klasgroep + " en behaalde " + this.percentSoftware +"voor het vak SoftwareEngineering");		
	}
}
