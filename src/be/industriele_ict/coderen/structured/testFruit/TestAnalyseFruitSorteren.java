package be.industriele_ict.coderen.structured.testFruit;

/**
 * A N A L Y S E
 * =============
 * ABSTRACTE PROBLEEMSTELLING (= vraag van de klant)
 * Een sorteermachine moet het aantal stukken fruit tellen.
 * 
 * CONCRETE PROBLEEMSTELLING (= ondubbelzinnige omschrijving van de vraag van de klant ==> algoritme)
 * De sorteermachine moet enkel het aantal appels, peren en bananen tellen.
 * Alle andere soorten fruit worden samengeteld.
 * Telkens er 100 stuks zijn geteld wordt de doos gesloten en een nieuwe lege doos geplaatst, door een robotarm
 * Op een beeldscherm worden het aantal gevulde dozen appels, peren en bananen getoond.
 * Telkens er een ander stuk fruit, verschillend van appel peer en banaan, wordt geteld wordt een buzzer aangestuurd.
 * 
 *
 * CHECKLIST VOOR TEST-INGENIEUR
 * 01 de machine telt enkel de appels, peren en bananen
 * 02 andere soorten fruit worden samengeteld
 * 03 na 100 stuks sluit de doos en wordt de nieuwe doos door een robotarm geplaatst
 * 04 het aantal dozen bananen, appels en peren wordt op een scherm getoond
 * 05 als er een verschillend soort geteld wordt is er een buzzer
 *  
 * PARAMETERS SENSOREN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * aantalAppels             | Huidige aantal aan appels in doos                 |0..100             | byte>int
 * aantalPeren              | Huidige aantal aan peren in doos                  |0..100             | byte>int
 * aantalBananen            | Huidige aantal aan bananen in doos                |0..100             | byte>int
 * aantalAndereSoorten      | Huidige aantal andere soorten in doos             |0..100             | byte>int
 * PARAMETERS ACTUATOREN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * buzzerToestand           | als een ander soort fruit geteld wordt klinkt buzzer| true/false start = false| boolean
 * 
 * PARAMETERS VERWERKING
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * aantalDozenAppels        | aantal aan dozen appels op scherm                 | 0..65535 start = 0| int
 * aantalDozenPeren         | aantal aan dozen peren op scherm                  | 0..65535 start = 0| int
 * aantalDozenBananen       | aantal aan dozen bananen op scherm                | 0..65535 start = 0| int
 * aantalDozenAndereSoorten | aantal aan dozen andere soorten op scherm         | 0..65535 start = 0| int
 * drempelWaardeDoosInpakken| het grijpen van een nieuwe doos als 1 vol is      | 0..100            | byte>int
 * OPDRACHT TEST
 * 1) Vul de checklist aan.
 * 2) Vul de parameters aan.
 * 2) Schrijf de Java broncode voor het declareren en initialiseren van de parameters.
 */

public class TestAnalyseFruitSorteren
{
	public static void main(String[] args)
	{
		//SENSOREN
		int aantalAppels = 0;
		int aantalPeren = 0;
		int aantalBananen = 0;
		int aantalAndereSoorten = 0;
		//actuatoren
		boolean buzzerToestand = false;
		//VERWERKING
		int aantalDozenAppels = 0;
		int aantalDozenPeren = 0;
		int aantalDozenBananen = 0;
		int aantalDozenAndereSoorten = 0;
		int drempelWaardeDoosInpakken = 100;
		
		

	}
}
