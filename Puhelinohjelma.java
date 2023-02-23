
public class Puhelinohjelma {

	public static void main(String[] args) {
		
		Puhelin puhelin1 = new Puhelin();
		System.out.println("Default");
		puhelin1.tulostaTiedot();
				
		Puhelin puhelin2 = new Puhelin("Samsung", "A8", true);
		System.out.println("Puhelin 1");
		puhelin2.tulostaTiedot();
				
		Puhelin puhelin3 = new Puhelin("iPhone", "11", true);
		System.out.println("Puhelin 2");
		puhelin3.tulostaTiedot();
				
		System.out.println("Puhelimen 1 tiedot muutettiin.");
		puhelin2.muutaTiedot("Nokia", "880", false);
				
		puhelin2.kaynnistys();
		System.out.println("Puhelin 1");		
		puhelin2.tulostaTiedot();
				
		puhelin3.sammutus();
		System.out.println("Puhelin 2");
		puhelin3.tulostaTiedot();

	}

} // End of Puhelinohjelma

class Puhelin
{
	// Puhelin attribuutit
	public String merkki;
	public String malli;
	public boolean paalla;
	
	// Default constructor
	public Puhelin()
	{
		merkki = "";
		malli = "";
		paalla = false;
	}
	
	// Constructor with parameters
	public Puhelin(String merkkiNimi, String malliNimi, boolean onkoPaalla)
	{
		merkki = merkkiNimi;
		malli = malliNimi;
		paalla = onkoPaalla;
	}
	
	// Puhelin metodit
	public void kaynnistys()
	{
		paalla = true;
		System.out.println("Puhelin k‰ynnistettiin.");
	}
	
	public void sammutus()
	{
		paalla = false;
		System.out.println("Puhelin sammutettiin.");
	}
	
	public void tulostaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		if (paalla) {
			System.out.println("Puhelin on p‰‰ll‰." + "\n");
		}
		else {
			System.out.println("Puhelin on kiinni." + "\n");
		}
	}
	
	public void muutaTiedot(String merkki, String malli, boolean paalla)
	{
		this.merkki = merkki;
		this.malli = malli;
		this.paalla = paalla;
		
		System.out.println("Merkki: " + this.merkki);
		System.out.println("Malli: " + this.malli);
		if (this.paalla) {
			System.out.println("Puhelin on p‰‰ll‰." + "\n");
		}
		else {
			System.out.println("Puhelin on kiinni." + "\n");
		}
	}
	
}
