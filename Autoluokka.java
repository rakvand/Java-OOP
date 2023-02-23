
public class Autoluokka {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto(); // Oletus auto
		Auto auto2 = new Auto("Volvo", "V70", 10); // Uusi auto
		
		// Auto1 toiminnot
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		
		// Auto2 toiminnot
		auto2.naytaTiedot();
		auto2.kiihdyta();
		auto2.jarruta();
		auto2.tankkaa(10);
		auto2.naytaTiedot();

	}

} // End of Autoluokka

class Auto
{
	// Attribuutit
	public String merkki;
	public String malli;
	public int bensanMaara;
	public int tankkaus;
	
	// Oletusmuodostin, default constructor
	public Auto()
	{
		merkki = "Ford";
		malli = "Focus";
		bensanMaara = 5;
	}
	
	// Parametrinen muodostin, parameterized constructor
	public Auto(String merkki, String malli, int bensanMaara)
	{
		this.merkki = merkki;
		this.malli = malli;
		this.bensanMaara = bensanMaara;
	}
	
	// Metodit
	
	// Jarrutus-metodi
	public void jarruta()
	{
		System.out.println("Auto jarruttaa." + "\n");
	}
	
	// Kiihdytys-metodi, joka tarkistaa, että bensaa on tarpeeksi
	public void kiihdyta()
	{
		if (bensanMaara > 0) {
			System.out.println("Auto kiihdyttää." + "\n");
			bensanMaara--;
		}
		else {
			System.out.println("Bensa loppu!" + "\n");
		}
		
	}
	
	// Metodi joka tulostaa auton tiedot
	public void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara + "\n");
	}
	
	// Tankkaus-metodi
	public void tankkaa(int tankkaus)
	{
		System.out.println("Tankissa bensaa: " + bensanMaara);
		this.tankkaus = tankkaus;
		bensanMaara = tankkaus + bensanMaara;
		System.out.println("Tankkaus: " + tankkaus);
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara + "\n");
	}
}
