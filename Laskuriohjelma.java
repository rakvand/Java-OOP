import java.util.Scanner;

public class Laskuriohjelma {

	public static void main(String[] args) {
		// Pinta-ala laskuri-ohjelma
		
		
		// System.out.println(Laskuri.laskePintaAla(2, 5));
		// System.out.println(Laskuri.laskePintaAla(4));
				
		Scanner in = new Scanner(System.in);
		String vastaus;
		
		// Kysyt��n k�ytt�j�lt� kumpi lasketaan
		System.out.println("Haluatko laskea suorakulmion vai ympyr�n pinta-alan (s/y)?");
		vastaus = in.nextLine();
		
		// Suorakulmion pinta-alan laskeminen
		if (vastaus.equalsIgnoreCase("s")) {
			double x;
			double y;
			
			// Kysyt��n k�ytt�j�lt� suorakulmion pituus
			System.out.println("Sy�t� suorakulmion pituus:");
			x = in.nextDouble();
			
			// Kysyt��n k�ytt�j�lt� suorakulmion leveys
			System.out.println("Sy�t� suorakulmion leveys:");
			y = in.nextDouble();
			
			// Tulostetaan tulos
			System.out.println("Suorakulmion pinta-ala on " + Laskuri.laskePintaAla(x, y));
		}
		
		// Ympyr�n pinta-alan laskeminen
		else if (vastaus.equalsIgnoreCase("y")) {
			double s;
			
			// Kysyt��n k�ytt�j�lt� ympyr�n s�de
			System.out.println("Sy�t� ympyr�n s�de:");
			s = in.nextDouble();
			
			// Tulostetaan tulos
			System.out.println("Ympyr�n pinta-ala on " + Laskuri.laskePintaAla(s));
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
		
		// Muotoillaan tulos n�ytt�m��n vain 2 desimaalia
		double pyoristys = Math.round(pintaAlaS*100.0)/100.0;
				
		return pyoristys;		
	}
	
	// Metodi joka laskee ympyr�n pinta-alan
	public static double laskePintaAla(double sade)
	{
		double pintaAlaY = Math.PI * sade * sade;
		
		// Muotoillaan tulos n�ytt�m��n vain 2 desimaalia
		double pyoristys = Math.round(pintaAlaY*100.0)/100.0;
		
		return pyoristys;
	}
}
