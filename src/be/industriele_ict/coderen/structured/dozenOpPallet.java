package be.industriele_ict.coderen.structured;
public class dozenOpPallet
{

	public static void main(String[] args)
	{
		int palletGewicht = 0;
		int palletMaxGewicht = 500; 
		int doosGewicht = 25; 

		do{
			System.out.println("zet doos op het pallet.");
			palletGewicht = palletGewicht + doosGewicht; 

			System.out.println("nieuw gewicht = "+palletGewicht+" kg");
		}while(palletGewicht <= palletMaxGewicht);
	}
}
