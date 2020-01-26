package be.industriele_ict.coderen.oop.opdracht3;

import java.util.Random;

public class Weegbrug {
	private int gewichtLinks = 0;
	private int gewichtMidden = 0;
	private int gewichtRechts = 0;

	public Weegbrug(int gewichtLinks, int gewichtMidden, int gewichtRechts) 
	{
		this.gewichtLinks = gewichtLinks;
		this.gewichtMidden = gewichtMidden;
		this.gewichtRechts = gewichtRechts;
	}
	public int getGewicht()
	{
		int gewicht = 0; 
		Random generator = new Random(); 


		this.gewichtLinks = generator.nextInt(5000);
		this.gewichtMidden = generator.nextInt(5000);
		this.gewichtRechts = generator.nextInt(5000);

		gewicht = (int)(this.gewichtLinks + this.gewichtMidden + this.gewichtRechts);
		
		

		return (int) gewicht;

	}








}
