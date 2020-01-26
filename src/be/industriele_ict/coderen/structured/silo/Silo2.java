package be.industriele_ict.coderen.structured.silo;

import java.util.Random;


/**
 * A N A L Y S E
 * =============
 * ABSTRACTE PROBLEEMSTELLING (= vraag van de klant)
 * De hoeveelheid grondstof in een silo moet bewaakt worden.
 * 
 * CONCRETE PROBLEEMSTELLING (= ondubbelzinnige omschrijving van de vraag van de klant ==> algoritme)
 * De hoeveelheid grondstof in een silo wordt gemeten door een sensor.
 * De hoeveelheid grondstof in de silo wordt aangeduid door een toestand.
 * We onderscheiden 3 toestanden:
 * - ALARM: bij te veel en te weinig grondstof in de silo
 * - WAARSCHUWING: bij veel en weinig grondstof in de silo
 * - OKE: in alle andere gevallen
 * We hebben "te veel" grondstof als de hoeveelheid 90 % of meer is.
 * We hebben "te weinig" grondstof als de hoeveelheid 10 % of minder is.
 * We hebben "veel" grondstof als de hoeveelheid meer dan 75 % en minder dan 90 % is.
 * We hebben "weinig" grondstof als de hoeveelheid minder dan 25 % en meer dan 10 % is.
 * De hoeveelheid grondstof tussen 25 en 75 % is oké.
 * Bij de toestand ALARM brandt er een rode lamp en loeit een sirene.
 * Bij de toestand WAARSCHUWING brandt er een oranje lamp.
 * Bij de toestand OKE brandt er een groene lamp.
 *
 * CHECKLIST VOOR TEST-INGENIEUR
 * 01 Wanneer de hoeveelheid grondstof in de silo tussen 25 % en 75 % ligt, brandt de groene lamp en is de toestand "oké"
 * 02 Wanneer de hoeveelheid grondstof in de silo 10 % of minder is, brandt de rode lamp, loeit de sirene en is de toestand "te weinig"   
 * 03 Wanneer de hoeveelheid grondstof in de silo 90 % of meer is, brandt de rode lamp, loeit de sirene en is de toestand "te veel"   
 * 04 Wanneer de hoeveelheid grondstof in de silo meer dan 75 % en minder dan 90 % is, brandt de oranje lamp en is de toestand "veel"   
 * 05 Wanneer de hoeveelheid grondstof in de silo meer dan 10 % en minder dan 25 % is, brandt de oranje lamp en is de toestand "weinig"   
 *  
 * PARAMETERS SENSOREN
 * Naam                     | Omschrijving                                      | Bereik           			| Gegevenstype
 * -------------------------|---------------------------------------------------|---------------------------|-------------
 * parameterNaam            | Concrete omschrijving van de parameter            | 0..N      		        | gegevenstype
 * grondstofHoeveelheid     | Huidige hoeveelheid grondstof in de silo, in %    | 0..100					| byte > int
 * 
 * PARAMETERS ACTUATOREN
 * Naam                     | Omschrijving                                      | Bereik           			| Gegevenstype
 * -------------------------|---------------------------------------------------|---------------------------|-------------
 * parameterNaam            | Concrete omschrijving van de parameter            | 0..N      		        | gegevenstype
 * lampRoodToestand         | Huidige toestand van de rode lamp                 | true/false start = false	| boolean
 * lampOranjeToestand       | Huidige toestand van de oranje lamp               | true/false start = false	| boolean
 * lampGroenToestand        | Huidige toestand van de groene lamp               | true/false start = false	| boolean
 * sireneToestand           | Huidige toestand van de sirene                    | true/false start = false	| boolean
 * 
 * PARAMETERS VERWERKING
 * Naam                     | Omschrijving                                      | Bereik           			| Gegevenstype
 * -------------------------|---------------------------------------------------|---------------------------|-------------
 * parameterNaam            | Concrete omschrijving van de parameter            | 0..N      		        | gegevenstype
 * siloToestand             | Huidige toestand van de silo                      | OKE/ALARM/WAARSCHUWING	| byte > int
 * drempelWaardeTeVeel      | grenswaarde voor te veel grondstof, in %          | 0..100 start = 90    		| byte > int
 * drempelWaardeTeWeinig    | grenswaarde voor te weinig grondstof, in %        | 0..100 start = 10    		| byte > int
 * drempelWaardeVeel        | grenswaarde voor veel grondstof, in %             | 0..100 start = 75    		| byte > int
 * drempelWaardeWeinig      | grenswaarde voor weinig grondstof, in %           | 0..100 start = 25    		| byte > int
 * 
 * 
 * OPDRACHT TEST
 * 017.2B3T/2: ontwerp een algoritme (op toetsenblad inleveren)
 * 026.4B3T: Schrijf de Java broncode met de juiste controlestructuren (uploaden in Smartschool)
 */

public class Silo2
{
	/*
	 * Constanten voor parameter siloToestand
	 */
	final static int SILO_TOESTAND_ALARM = 0;
	final static int SILO_TOESTAND_WAARSCHUWING = 1;
	final static int SILO_TOESTAND_OKE = 2;

	public static void main(String[] args)
	{
		// SENSOREN
		int grondstofHoeveelheid =0;

		// ACTUATOREN
		boolean lampRoodToestand = false;
		boolean lampOranjeToestand = false;
		boolean lampGroenToestand = false;
		boolean sireneToestand = false;

		// VERWERKING
		int siloToestand = SILO_TOESTAND_ALARM;
		int drempelWaardeTeVeel = 90;
		int drempelWaardeTeWeinig = 10;
		int drempelWaardeVeel = 75;
		int drempelWaardeWeinig = 25;

		// ALGORITME
		while(true)
		{  
			grondstofHoeveelheid = leesAnalogeSensor(40,100);
			System.out.println("hoeveelheid = "+grondstofHoeveelheid);
		}
	}
	private static int leesAnalogeSensor(int valueMinimum, int valueMaximum){
		int hoeveelheid = 0;
		Random generator = new Random();
		
		hoeveelheid = valueMinimum+generator.nextInt((valueMaximum- valueMinimum)+1);
		
		
		
		return hoeveelheid;
	}
}
