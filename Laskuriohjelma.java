import java.util.Scanner;

public class Laskuriohjelma {

	public static void main(String[] args) {
		// Pinta-ala laskuri-ohjelma
		
		
		// System.out.println(Laskuri.laskePintaAla(2, 5));
		// System.out.println(Laskuri.laskePintaAla(4));
				
		Scanner in = new Scanner(System.in);
		String vastaus;
		
		// Kysytään käyttäjältä kumpi lasketaan
		System.out.println("Haluatko laskea suorakulmion vai ympyrän pinta-alan (s/y)?");
		vastaus = in.nextLine();
		
		// Suorakulmion pinta-alan laskeminen
		if (vastaus.equalsIgnoreCase("s")) {
			double x;
			double y;
			
			// Kysytään käyttäjältä suorakulmion pituus
			System.out.println("Syötä suorakulmion pituus:");
			x = in.nextDouble();
			
			// Kysytään käyttäjältä suorakulmion leveys
			System.out.println("Syötä suorakulmion leveys:");
			y = in.nextDouble();
			
			// Tulostetaan tulos
			System.out.println("Suorakulmion pinta-ala on " + Laskuri.laskePintaAla(x, y));
		}
		
		// Ympyrän pinta-alan laskeminen
		else if (vastaus.equalsIgnoreCase("y")) {
			double s;
			
			// Kysytään käyttäjältä ympyrän säde
			System.out.println("Syötä ympyrän säde:");
			s = in.nextDouble();
			
			// Tulostetaan tulos
			System.out.println("Ympyrän pinta-ala on " + Laskuri.laskePintaAla(s));
		}
in.close();

	} // End of main

} // End of Laskuriohjelma

class Laskuri
{
	// Metodi joka laskee suorakulmion pinta-alan
	public static double laskePintaAla(double pituus, double leveys)
	{
		double pintaAlaS = pituus * leveys;
		
		// Muotoillaan tulos näyttämään vain 2 desimaalia
		double pyoristys = Math.round(pintaAlaS*100.0)/100.0;
				
		return pyoristys;		
	}
	
	// Metodi joka laskee ympyrän pinta-alan
	public static double laskePintaAla(double sade)
	{
		double pintaAlaY = Math.PI * sade * sade;
		
		// Muotoillaan tulos näyttämään vain 2 desimaalia
		double pyoristys = Math.round(pintaAlaY*100.0)/100.0;
		
		return pyoristys;
	}
}
