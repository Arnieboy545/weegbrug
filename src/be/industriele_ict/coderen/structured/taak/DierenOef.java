package be.industriele_ict.coderen.structured.taak;


/**
 * A N A L Y S E
 * =============
 * ABSTRACTE PROBLEEMSTELLING (= vraag van de klant)
 * Maak een determinatie programma voor diersoorten.
 * 
 * CONCRETE PROBLEEMSTELLING (= ondubbelzinnige omschrijving van de vraag van de klant ==> algoritme)
 * De toepassing vertelt over welke soort dieren het gaat op basis van kenmerken/eigenschappen (bv. constante lichaamstemperatuur).
 * Als broninformatie heb je 3 afbeeldingen:
 * - Dieren.JPG
 * - Gewervelde dieren.JPG
 * - Ongewervelde dieren.JPG
 * dit zijn GEEN stroomdiagrammen, maar geven wel gelijkaardige informatie.
 * De toepassing toont in het console view de gevonden diersoort (bv. REPTIELEN)
 * 
 *
 * CHECKLIST VOOR TEST-INGENIEUR
 * 01 De juiste diersoort wordt aangegeven aan de hand van de kenmerken en eigenschappen. 					
 * 
 * PARAMETERS VERWERKING
 * Naam                     	| Omschrijving                                      | Bereik            | Gegevenstype
 * -----------------------------|---------------------------------------------------|-------------------|-------------
 * dierMetWerfsel				| of het dier een weefsel heeft						| ja/nee			| boolean
 * dierMetDeBilateraleSymmetrie	| of het dier bilaterale symmetrie heeft			| ja/nee			| boolean
 * dierMetChorda				| of het dier een chorda heeft						| ja/nee			| boolean
 * dierMetWervelkom			    | of het dier een wervelkom heeft					| ja/nee			| boolean
 * dierMetDubbeleBloedsomloop	| of het dier een dubbele bloedsomploop heeft		| ja/nee			| boolean
 * dierMetInwendigeBevruchting  | of het dier inwendige bevruchting heeft			| ja/nee			| boolean
 * dierMetConstanteTemperatuur  | " een constante lichaamstemperatuur heeft			| ja/nee			| boolean
 * dierMetInterneOntwikkeling	| " interne ontwikkeling v/d bevruchte eicel heeft	| ja/nee			| boolean
 * dierMetDoorlopendeDarm		| " een doorlopende darm heeft						| ja/nee			| boolean
 * dierMetSegmentatie			| " gesegmenteerd is								| ja/nee			| boolean
 * dierMetGeledePoten			| " gelede poten heeft								| ja/nee			| boolean
 * 
 * 
 * OPDRACHT TAAK
 * 017.1B3: Vul de checklist aan.
 * 026.2B3: Vul de parameters aan.
 * 026.4B3: Schrijf de Java broncode met de juiste controlestructuren. 
 */

public class DierenOef
{

	public static void main(String[] args)
	{
		boolean dierMetWerfsel = false;
		boolean dierMetDeBilateraleSymmetrie = false;
		boolean dierMetChorda = false;
		boolean dierMetWervelkom = false;
		boolean dierMetDubbeleBloedsomloop = false;
		boolean dierMetInwendigeBevruchting = false;
		boolean dierMetConstanteTemperatuur = false;
		boolean dierMetInterneOntwikkeling = false;
		boolean dierMetDoorlopendeDarm = false;
		boolean dierMetSegmentatie = false;
		boolean dierMetGeledePoten = false;

		if(dierMetWerfsel == true)
		{
			if(dierMetDeBilateraleSymmetrie == true)
			{
				if(dierMetChorda == true)
				{
					if(dierMetWervelkom == true)
					{
						if(dierMetDubbeleBloedsomloop == true)
						{
							if(dierMetInwendigeBevruchting == true)
							{
								if(dierMetConstanteTemperatuur == true)
								{
									if(dierMetInterneOntwikkeling == true)
									{
										System.out.println("KlasseVanDeZoogdieren");
									}
									else
									{
										System.out.println("KlasseVanDeVogels");
									}
								}
								else
								{
									System.out.println("KlasseVanDeReptielen");
								}
							}
							else
							{
								System.out.println("KlasseVanDeAmfibieën");
							}
						}
						else
						{
							System.out.println("KlasseVanDeVissen");
						}
					}
					else
					{
						System.out.println("KlasseVanDeSchedellozenOfManteldierenOfSlijmprikken");
					}
				}
				else
				{
					if(dierMetDoorlopendeDarm == true)
					{
						if(dierMetSegmentatie == true)
						{
							if(dierMetGeledePoten == true)
							{
								System.out.println("StamVanDeGeleedpotigen");
							}
							else
							{
								System.out.println("StamVanDeRingwormen");
							}
						}
						else
						{
							System.out.println("StamVanDeRondeWormenOfWeekdieren");
						}
					}
					else
					{
						System.out.println("StamVanDePlatwormen");
					}
				}
			}
			else
			{
				System.out.println("StamVanDeNeteldieren");
			}
		}
		else
		{
			System.out.println("StamVanDeSponzen");
		}
	}

}
