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
		this.gewichtLinks = weegGewicht();
		this.gewichtMidden = weegGewicht();
		this.gewichtRechts = weegGewicht();

		return this.gewichtLinks + this.gewichtMidden + this.gewichtRechts;
	}

	private static int weegGewicht()
	{
		Random generator = new Random(); 
		return generator.nextInt(5000);
	}








}
