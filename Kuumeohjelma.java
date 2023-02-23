import java.util.Scanner;

public class Kuumeohjelma {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String kohde;
		int lampotila;
			
		tulostaKuumerajat();
		
		// Pyydetään käyttäjää syöttämään kohde
		System.out.println("Anna mitattava kohde (ihminen, koira, hevonen):");
		kohde = in.nextLine();
		
		// Tulostetaan virheilmoitus, jos kohde on väärä
		if (!kohde.equalsIgnoreCase("ihminen") && !kohde.equalsIgnoreCase("koira") && !kohde.equalsIgnoreCase("hevonen")) {
			System.out.println("Kohde on virheellinen!");
			System.exit(0);
		}
		
		// Pyydetään käyttäjää syöttämään lämpötila
		System.out.println("Anna lämpötila:");
		lampotila = in.nextInt();
		
		// True arvo tulostaa tekstin
		if (onkoKuumetta(kohde, lampotila) == true) {
			System.out.println("Kohteella on kuumetta.");
		}
		// False arvo tulostaa tekstin
		else {
			System.out.println("Kohteella ei ole kuumetta.");
		}
in.close();

	} // End of main

		
	// Metodi, joka tulostaa kuumerajat
	public static void tulostaKuumerajat()
	{
		System.out.println("Kuumerajat:");
		System.out.println("- ihminen 37");
		System.out.println("- koira 39");
		System.out.println("- hevonen 38" + "\n");
	}
	
	// Metodi, joka kertoo onko kohteella kuumetta
	public static boolean onkoKuumetta(String kohde, int lampotila)
	{
		boolean onKuumetta = false;
		
		if (kohde.equalsIgnoreCase("ihminen") && lampotila > 37) {
			onKuumetta = true;
		}
		
		if (kohde.equalsIgnoreCase("koira") && lampotila > 39) {
			onKuumetta = true;
		}
		
		if (kohde.equalsIgnoreCase("hevonen") && lampotila > 38) {
			onKuumetta = true;
		}
				
		return onKuumetta;
			
	}
}

