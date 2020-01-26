package be.industriele_ict.coderen.structured.taak;
/**
 * A N A L Y S E
 * =============
 * PROBLEEMSTELLING
 * Een verkeerslicht staat gedurende 5 s op rood, 1 s op oranje en 3 s op groen.
 * De cyclus start bij rood, gaat over naar oranje en eindigt met groen.
 * Deze cyclus herhaalt zich oneindig veel keren.
 * 
 * GEGEVEN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * lampRood                 | Huidige toestand rode lamp                        | aan/uit (false)   | boolean
 * lampOranje               | Huidige toestand oranje lamp                      | aan/uit (false)   | boolean
 * lampGroen                | Huidige toestand groen lamp                       | aan/uit (false)   | boolean
 * tijdRood                 | Tijd rode lamp brandt, uitgedrukt in seconden     | 0..30 start = 5   | integer
 * tijdOranje               | Tijd oranje lamp brandt, uitgedrukt in seconden   | 0..30 start = 1   | integer
 * tijdGroen                | Tijd groene lamp brandt, uitgedrukt in seconden   | 0..30 start = 3   | integer
 * 
 * GEVRAAGD
 * 01 Rode lamp aansturen (AAN/UIT)
 * 02 Oranje lamp aansturen (AAN/UIT)
 * 03 Groene lamp aansturen (AAN/UIT)
 * 04 Volgorde is rood (5 s), dan oranje (1 s) en tot slot groen (3 s)
 * 05 De cyclus (04) herhaald zich oneondig veel keren 
 * 
 * @author Gunter Schillebeeckx
 *
 */

public class verkeerslichtAnalyse
{
	final static boolean lampRood = false;
	final static boolean lampOranje = false;
	final static boolean lampGroen = false;
  public static void main(String[] args)
 {
  // declaratie en initialisatie van parameters
  boolean lampRood = false;
  boolean lampOranje = false;
  boolean lampGroen = false;
  int tijdRood = 5;
  int tijdOranje = 1;
  int tijdGroen = 3;
  
  // Afdruk waarden van de parameters in de console view
  System.out.println("toestand rode lamp = " + lampRood);
  System.out.println("toestand oranje lamp = " + lampOranje);
  System.out.println("toestand groene lamp = " + lampGroen);
  System.out.println("tijd dat de rode lamp brandt = " + tijdRood + " seconden");
  System.out.println("tijd dat de oranje lamp brandt = " + tijdOranje + " seconden");
  System.out.println("tijd dat de groene lamp brandt = " + tijdGroen + " seconden");
 }
}
