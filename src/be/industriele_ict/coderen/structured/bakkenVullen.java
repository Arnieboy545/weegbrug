package be.industriele_ict.coderen.structured;

public class bakkenVullen
{

	public static void main(String[] args)
	{
		int flesTeller = 0; 
		int bakAantalFlessen = 12; 

		for(flesTeller = 0; flesTeller < bakAantalFlessen; flesTeller = flesTeller + 1)
		{
			System.out.println("zet fles "+ (flesTeller+1) +" in de bak.");
		}
	}
}