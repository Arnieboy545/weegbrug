package be.industriele_ict.coderen.structured.taak;
/**
 * A N A L Y S E
 * =============
 * PROBLEEMSTELLING:Een oven wordt voorverwarmd tot 350 °C. Vervolgens wordt het product ingebracht, waar het gedurende 30 minuten, tussen 350 °C en 370 °C moet blijven. Nadien wordt de oven uitgeschakeld en het product wordt eruit gehaald.
 * 
 * GEGEVEN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|------------- * ...                      | ...                                               | ...               | ...
 * voorVerwarmd              wordt tot 350 graden voorverwarmd                   0..350 start = 0    integer
 * warmTijd                  bakt 30 min                                         0..30 start = 0     integer                 
 * bakHitte                  bakt tussen 350 en370 graden                       350..370 start = 350 integer
 * naBakTijd                 na 30 min staat hij uit                             aan/uit = (false)   boolean
 * GEVRAAGD
 * 01 moet kunnen voorverwarmen
 * 02 moet 30 min tussen 350 en 370 graden opwarmen
 * 03 gaat na 30 min uit
 */
public class broodbakoven {

	public static void main(String[] args) {
		int voorVerwarmd = 350;
		int warmTijd = 30;
		int bakHitte = 350;
		boolean naBakTijd = false;
		System.out.println("wordt tot 350 graden voorverwarmd = "+voorVerwarmd);
		System.out.println("bakt tussen 350 en 370 graden = "+bakHitte);
		System.out.println("na 30 min staat hij uit = "+naBakTijd);
		System.out.println("tijd dat het brood bakt = " + warmTijd + "minuten" );
		// TODO Auto-generated method stub

	}

}
