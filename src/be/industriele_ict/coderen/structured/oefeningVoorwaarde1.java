package be.industriele_ict.coderen.structured;
public class oefeningVoorwaarde1
{
	public static void main(String[] args)
	{
		int ovenTemperatuur = 0; // huidige temperatuur van de oven, uitgedrukt in °C
		
		// start de oven
		System.out.println("Huidige temperatuur = "+ovenTemperatuur+" °C");
		System.out.println("start voorverwarmen\n");
		
		while(ovenTemperatuur < 270) // ZOLANG de temperatuur geen 270 °C is, wachten
		{
			// voorverwarmen
			ovenTemperatuur = ovenTemperatuur + 1; // simulatie voorverwarmen
			System.out.println("Oven is aan het voorverwarmen. Huidige temperatuur = "+ovenTemperatuur+" °C");
		}

		// oven is voorverwarmd op de gewenste temperatuur
		System.out.println("bakproces mag starten");
	}
}