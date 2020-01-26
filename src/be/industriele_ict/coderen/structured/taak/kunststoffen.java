package be.industriele_ict.coderen.structured.taak;
/**
 * PARAMETERS SENSOREN
 * Naam                     | Omschrijving                                      | Bereik           			| Gegevenstype
 * -------------------------|---------------------------------------------------|---------------------------|-------------
 * stofSorteermachine       | kijkt welke stof dit is                           | 0..6                      | integer
 * 
 * PARAMETERS ACTUATOREN
 * Naam                     | Omschrijving                                      | Bereik           			| Gegevenstype
 * -------------------------|---------------------------------------------------|---------------------------|-------------
 * rodeZak                  | legt plastic in rode zak                          | true/false                | boolean
 * blauweZak                | legt plastic in blauwe zak                        | true/false                | boolean
 * geenLabel                | legt het in andere zak                            | true/false                | boolean
 * PARAMETERS VERWERKING
 * Naam                     | Omschrijving                                      | Bereik           			| Gegevenstype
 * -------------------------|---------------------------------------------------|---------------------------|-------------
 * stofPETE                 | polyethylene therephalate                         | 0..0                      | integer
 * stofHDPE                 | high-density polyethylene                         | 1                         | integer
 * stofPVC                  | polyvinyl chloride                                | 2                         | integer
 * stofLDPE                 | low density polyethylene                          | 3                         | integer
 * stofPP                   | polyproylene                                      | 4                         | integer
 * stofPS                   | polystyrene                                       | 5                         | integer
 * stofOTHER                | other                                             | 6                         | integer
 *
 * OPDRACHT TEST
 * 1) Vul de checklist aan.
 * 2) Vul de parameters aan.
 * 2) Schrijf de Java broncode voor het declareren en initialiseren van de parameters.
 */
public class kunststoffen {
	final static int stofPETE = 0;
	final static int stofHDPE = 1;
	final static int stofPVC = 2;
	final static int stofLDPE = 3;
	final static int stofPP = 4;
	final static int stofPS = 5;
	final static int stofOTHER = 6;

	public static void main(String[] args) {
		int stofSorteermachine = 0;
		boolean blauweZak = false;
		boolean rodeZak = false;
		boolean geenLabel = false; 

		switch(stofSorteermachine)
		{
		case stofPETE:
		case stofHDPE:
			blauweZak= true;
			System.out.println("Blauwe Zak");
			break;
		case stofPVC:
		case stofLDPE:
		case stofPP:
		case stofPS:
		case stofOTHER:
			rodeZak = true;
			System.out.println("Rode Zak");
			break;
		default:
			geenLabel = true;
			System.out.println("in andere zak");
			break;

		}
	}

}
