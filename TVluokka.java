import java.util.Scanner;

public class TVluokka {

	public static void main(String[] args) {
		
		Tv tv = new Tv(); // Olio nimeltä tv
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Toiminnot:");
			System.out.println("Valitse kanava (1-9)");
			System.out.println("Sammuta (0)");
			tv.setKanava(in.nextInt());
			
			// Tieto kanavasta, mikäli TV:tä ei sammuteta
			if (tv.getKanava() != 0) {
				tv.vaihdaKanava(0);
			}
			// Jos käyttäjä valitsee 0, TV sammutetaan
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
		System.out.println("TV on pois päältä.");
		System.exit(0);
	}
	
	// Kanavanvaihto-metodi
	public void vaihdaKanava(int uusiKanava)
	{
		uusiKanava = kanava;
		
		// Jos kanava on virheellinen, tulostetaan virheilmoitus
		if (kanava > 9) {
			System.out.println("Virhe! Kanavaa ei löydy.");
		}
		// Muutoin tulostetaan kanavanumero
		else {
			System.out.println("Kanava on " + kanava);
		}
	}
}
