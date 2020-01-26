
package be.industriele_ict.coderen.structured.taak;

/**
 * A N A L Y S E
 * =============
 * PROBLEEMSTELLING
 * als de fles 92% gevuld is stopt de machine het vullen.
 * 
 * GEGEVEN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * flesVulling              | hoe vol de fles is in percent                     | 0..100 start = 0  | byte
 * eindsignaal              | het vullen stopt                                  | true/false start = true| boolean
 * 
 * GEVRAAGD
 * 01 De fles wordt gevuld tot 92 %
 * 02 geeft stopsignaal als de fles voor 92% is gevuld
 */

public class flessenVuller
{
	public static void main(String[] args)
	{
		byte flesVulling = 25;
		boolean eindsignaal = false;
		System.out.println("hoe vol de fles is in percent = " + flesVulling + " procent");
		System.out.println("het vullen stopt = " + eindsignaal);

	}
}