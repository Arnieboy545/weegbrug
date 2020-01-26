package be.industriele_ict.coderen.oop.opdracht3;

public class weegToepassing {

	public static void main(String[] args) {

		Weegbrug weegschaal = new Weegbrug(0,0,0); 
		Lichtkrant beeldscherm = new Lichtkrant("");
		Vrachtwagen truckJan = new Vrachtwagen("Jan");
		Vrachtwagen opleggerMieke = new Vrachtwagen("Mieke");
		Grondstof grondstofZand = new Grondstof(10.0f);
		Grondstof grondstofSteen = new Grondstof(15.0f);

		String boodschapJan = getBoodschap(weegschaal.getGewicht(), grondstofZand, truckJan);
		String boodschapMieke = getBoodschap(weegschaal.getGewicht(), grondstofSteen, opleggerMieke);
		
		beeldscherm.setBoodschap(boodschapJan);
		beeldscherm.setBoodschap(boodschapMieke);
		
	}

	public static String getBoodschap(int gewicht, Grondstof grondstof, Vrachtwagen vrachtwagen)
	{
		float prijsGrondstof= grondstof.prijsPerKg;
		float prijs = gewicht * prijsGrondstof;
		String bestuurder = vrachtwagen.klantNaam;
		return "persoon: " + bestuurder + " prijs: " + prijs + " euro";
	}

}
