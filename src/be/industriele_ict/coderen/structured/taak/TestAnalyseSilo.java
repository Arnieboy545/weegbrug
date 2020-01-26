package be.industriele_ict.coderen.structured.taak;
/**
 * A N A L Y S E
 * =============
 * PROBLEEMSTELLING
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
 * 1) Vul het gegeven en gevraagde aan.
 * 2) Schrijf de Java broncode voor het declareren en initialiseren van de gegeven parameters.
 * 
 * GEGEVEN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * hoeveelheidTeVeel        | Te veel als de hoeveelheid 90% of meer is         | 0..100 start = 90  | float
 * hoeveelheidTeWeinig      | Te weinig als de hoeveelheid 10% of minder is     | 0..100 start = 10  | float
 * hoeveelheidVeel          | Veel als de hoeveelheid 75% tot 90% is            | 0..90 start = 75   | float
 * hoeveelheidWeinig        | Weinig als de hoveelheid minder dan 25% en meer dan 10% is| 0..25 start = 25| float
 * hoeveelheidOke           | Hoveelheid tussen 25% en 75% is oke               | 0..75 start = 26   | float
 * alarmToestand            | brand rode lamp                                   | true/false start = false | boolean
 * waarschuwingsToestand    | brand oranje lamp                                 | true/false start = false | boolean
 * okeToestand              | brand groene lamp                                 | true/false start = false | boolean
 * alarmGeluid              | alarm gaat af                                     | true/false start = false | boolean
 * GEVRAAGD
 * 01 De rode lamp brand bij te veel of te weinig en loeit een sirene
 * 02 De oranje lamp brand bij veel of weinig
 * 03 de groene lamp brand bij oke
 * 04 Te veel als de hoeveelheid 90% of meer is
 * 05 Te weinig als de hoeveelheid 10% of minder is
 * 06 Veel als de hoeveelheid 75% tot 90% is 
 * 07 Weinig als de hoveelheid minder dan 25% en meer dan 10% is
 * 08 Hoveelheid tussen 25% en 75% is oke
 */
public class TestAnalyseSilo {

	public static void main(String[] args) {
		float hoeveelheidTeVeel = 90f;
		float hoeveelheidTeWeinig = 10f;
		float hoeveelheidVeel = 75f;
		float hoeveelheidWeinig = 25f;
		float hoeveelheidOke = 26f;
		boolean alarmToestand = false;
		boolean waarschuwingsToestand = false;
		boolean okeToestand = false;
	    boolean alarmGeluid = false;
	    
	    System.out.println("de silo is veel te ver gevud in procent = " + hoeveelheidTeVeel + "procent");
	    System.out.println("de silo is bijna te ver gevuld in procent = " + hoeveelheidVeel + "procent");
	    System.out.println("de silo is veel te weinig gevuld in procent = " + hoeveelheidTeWeinig + "procent");
	    System.out.println("de silo is te weinig gevuld in procent = " + hoeveelheidWeinig + "procent" );
	    
				
		
				
		// TODO Auto-generated method stub

	}
}
