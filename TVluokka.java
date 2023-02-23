import java.util.Scanner;

public class TVluokka {

	public static void main(String[] args) {
		
		Tv tv = new Tv(); // Olio nimelt� tv
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Toiminnot:");
			System.out.println("Valitse kanava (1-9)");
			System.out.println("Sammuta (0)");
			tv.setKanava(in.nextInt());
			
			// Tieto kanavasta, mik�li TV:t� ei sammuteta
			if (tv.getKanava() != 0) {
				tv.vaihdaKanava(0);
			}
			// Jos k�ytt�j� valitsee 0, TV sammutetaan
			if(tv.getKanava() == 0) {
				tv.sammuta();
			}
			
			// Getterin testaus
			System.out.println("Getter testi: " + tv.getKanava());
						
		}
in.close();
		
	} // End of main

} // End of TVluokka

class Tv
{
	// Attribuutit
	private boolean paalla;
	private int kanava;
	
	public int getKanava() {
		return kanava;
	}

	public void setKanava(int kanava) {
		this.kanava = kanava;
	}

	// Oletusmuodostin, default constructor
	public Tv()
	{
		kanava = 1;
		paalla = true;
	}
	
	// Sammutus-metodi
	public void sammuta()
	{
		paalla = false;
		System.out.println("TV on pois p��lt�.");
		System.exit(0);
	}
	
	// Kanavanvaihto-metodi
	public void vaihdaKanava(int uusiKanava)
	{
		uusiKanava = kanava;
		
		// Jos kanava on virheellinen, tulostetaan virheilmoitus
		if (kanava > 9) {
			System.out.println("Virhe! Kanavaa ei l�ydy.");
		}
		// Muutoin tulostetaan kanavanumero
		else {
			System.out.println("Kanava on " + kanava);
		}
	}
}
