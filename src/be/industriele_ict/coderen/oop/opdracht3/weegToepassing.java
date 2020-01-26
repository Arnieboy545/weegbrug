package be.industriele_ict.coderen.oop.opdracht3;

public class weegToepassing {

	public static void main(String[] args) {

		Weegbrug weegschaal = new Weegbrug(0,0,0); 
		Lichtkrant beeldscherm = new Lichtkrant("");
		Vrachtwagen truckJan = new Vrachtwagen("Jan");
		Vrachtwagen opleggerMieke = new Vrachtwagen("Mieke");
		Grondstof grondstofZand = new Grondstof(10.0f);
		Grondstof grondstofSteen = new Grondstof(15.0f);

		int gewicht = 0;
		int totaalGewicht = 0;
		float prijsGrondstof = 0.0f;
		float prijs = 0.0f; 
		String bestuurder = ""; 
		String boodschap = "";  

		gewicht = weegschaal.getGewicht();
		prijsGrondstof= grondstofZand.prijsPerKg;
		prijs = gewicht*prijsGrondstof;
		bestuurder = truckJan.bestuurder;
		boodschap = "persoon: "+bestuurder+" prijs: "+prijs+" euro";
		beeldscherm.setBoodschap(boodschap);
		
		gewicht = weegschaal.getGewicht();
		prijsGrondstof= grondstofSteen.prijsPerKg;
		prijs = gewicht*prijsGrondstof;
		bestuurder = opleggerMieke.bestuurder;
		boodschap = "persoon: "+bestuurder+" prijs: "+prijs+" euro";
		beeldscherm.setBoodschap(boodschap);
		
		

				

	}

}
