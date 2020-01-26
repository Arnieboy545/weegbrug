package be.industriele_ict.coderen.structured;

public class vatenVullen
{

	public static void main(String[] args)
	{
		int olieHoeveelheid = 0; 
		int olieToevoeging = 10; 
		int vatInhoud = 125; 

		while(olieHoeveelheid <= vatInhoud - olieToevoeging)
		{
			System.out.println("huidige hoeveelheid = "+olieHoeveelheid+" liter");

			System.out.println("voeg olie toe aan het vat");
			olieHoeveelheid = olieHoeveelheid + olieToevoeging; 
			System.out.println("nieuwe hoeveelheid = "+olieHoeveelheid+" liter\n");
		}
	}
}