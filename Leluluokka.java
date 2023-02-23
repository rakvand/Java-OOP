
public class Leluluokka {

	public static void main(String[] args) {
		
		// Oliot
		Lelu lelu = new Lelu();
		Vieteriauto auto = new Vieteriauto();
		
		// Toiminnot
		lelu.tulostaTiedot();
		System.out.println(); // Tyhj‰ rivi, ett‰ tulostus n‰ytt‰‰ paremmalta
		
		auto.tulostaTiedot();
		auto.kiihdyta();
		auto.tulostaTiedot();

	} // End of main

} // End of Leluluokka

class Lelu
{
	// Attribuutit
	protected String nimi;
	protected int paino;
	
	// Oletusmuodostin, default constructor
	public Lelu()
	{
		nimi = "Koira";
		paino = 150;
	}
	
	// Parametrinen muodostin, parameterized constructor
	public Lelu(String nimi, int paino)
	{
		this.nimi = nimi;
		this.paino = paino;
	}
	
	// Metodi joka tulostaa tiedot
	protected void tulostaTiedot()
	{
		System.out.println("Lelun nimi: " + nimi);
		System.out.println("Lelun paino: " + paino + "g");
	}
} // End of Lelu class

class Vieteriauto extends Lelu
{
	// Nopeus-attribuutti
	private int nopeus;
	
	// Oletusmuodostin, default constructor
	public Vieteriauto()
	{
		nimi = "Vieteriauto";
		paino = 100;
		nopeus = 0;
	}
	
	// Parametrinen muodostin, parameterized constructor
	public Vieteriauto(String nimi, int paino, int nopeus)
	{
		this.nimi = nimi;
		this.paino = paino;
		this.nopeus = nopeus;
	}
	
	// Kiihdyt‰-metodi
	protected void kiihdyta()
	{
		System.out.println("Vieteriauto kiihdytt‰‰." + "\n");
		nopeus++;
	}
	
	// Tietojen tulostus metodi
	@Override
	protected void tulostaTiedot()
	{
		super.tulostaTiedot();
		System.out.println("Nopeus: " + nopeus + " km/h" + "\n");
	}
}
