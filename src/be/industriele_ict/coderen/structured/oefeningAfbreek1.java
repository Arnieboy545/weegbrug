package be.industriele_ict.coderen.structured;
public class oefeningAfbreek1
{
	public static void main(String[] args)
	{
		long siloInhoud = 0L; // inhoud van een silo, uitgedrukt in liter
		long siloMaxInhoud = 10000L; // maximale inhoud van de silo, uitgedrukt in liter
		float siloVulPercentage = 0.8f; // voor hoeveel % de silo gevuld moet worden

		System.out.println("De huidige inhoud van de silo bedraagt: "+siloInhoud+" liter");
		System.out.println("Start het vullen van de silo");
		
		do
		{
			siloInhoud = siloInhoud + 10; // doe er nog eens 10 liter bij
			System.out.println("De huidige inhoud bedraagt: "+siloInhoud+" liter");
			
		}while(siloInhoud < siloVulPercentage * siloMaxInhoud);
		
		System.out.println("De silo is gevuld voor "+(siloVulPercentage * 100)+" %");
	}
}
