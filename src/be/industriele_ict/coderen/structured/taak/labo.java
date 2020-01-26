
package be.industriele_ict.coderen.structured.taak;
/**
 * A N A L Y S E
 * =============
 * PROBLEEMSTELLING Er moet afgeteld worden van 25 naar nul.bij nul wordt een startsignaal gegeven * 
 * GEGEVEN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * beginAftelling           |vormt getal 25                                     | 0..25 start=25    | integer
 * startSignaal             |geeft startsignaal bij getal 0                     | aan/uit (true)    | boolean
 * eindeAftelling            vormt getal 0                                        0..1                integer
 * GEVRAAGD
 * 01 Omschrijving functionaliteit
 * 02 telt af
 * 03 begint bij 25
 * 04 geeft startsignaal bij 0
 */
public class labo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beginAftelling = 25;
		int eindeAftelling = 0;
		boolean startSignaal = true;
		// Afdruk waarden van de parameters in de console view
		Object vormt;
		System.out.println("vormt getal 25 = " + beginAftelling);
		System.out.println("geeft startsignaal bij getal 0" +startSignaal);
		System.out.println("vormt getal 0" +eindeAftelling);
	}

}
