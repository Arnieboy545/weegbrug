package be.industriele_ict.coderen.structured;

public class bakstenenOpStapele
{

	public static void main(String[] args)
	{
		int stapelHoogte = 0; 
		int stapelMaxHoogte = 50; 
		int baksteenHoogte = 8; 

		while(stapelHoogte < stapelMaxHoogte)
		{
			System.out.println("leg baksteen op de stapel");
			stapelHoogte = stapelHoogte + baksteenHoogte; 
			System.out.println("nieuwe hoogte = "+stapelHoogte+" cm");
		}
	}
}

