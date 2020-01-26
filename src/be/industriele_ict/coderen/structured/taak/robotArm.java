package be.industriele_ict.coderen.structured.taak;
/**
 * A N A L Y S E
 * =============
 * PROBLEEMSTELLING
 * Een robotarm kan 6 potjes tegelijk grijpen en verplaatsen naar een doos. In een doos kunnen 18 potjes
 * 
 * GEGEVEN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * grijpenPotjes            |grijpt 6 potjes tegelijk                           |0..6 start = 0     | byte
 * potjesLeggen             |legt 6 potjes in de doos                           |6..0 start = 6     | byte
 * overbrengTijd            |brengt potjes over naar doos in 3 seconden         |0..3 start = 0     | byte
 * terugbrengTijd           |brengt arm terug naar potjes in 3 seconden         |0..3 start = 0     | byte
 * 
 * 
 * GEVRAAGD
 * 01 robotarm kan 6 potjes opnemen
 * 02 robotarm brengt potjes in 3 seconden naar de doos over
 * 03 robotarm legt de potjes in de doos
 * 04 robotarm gaat terug naar de potjes
 */
public class robotArm {

	public static void main(String[] args) {
		byte grijpenPotjes = 6;
		byte overbrengTijd = 3;
		byte potjesLeggen = 6;
		byte terugbrengTijd = 3;
		System.out.println("grijpt 6 potjes tegelijk = " +grijpenPotjes);
		System.out.println("legt 6 potjes in de doos = " +potjesLeggen);
		System.out.println("brengt potjes over naar doos in 3 seconden = " + overbrengTijd + "seconden");
		System.out.println("brengt arm terug naar potjes in 3 seconden = " + terugbrengTijd + "seconden");
		// TODO Auto-generated method stub

	}

}
