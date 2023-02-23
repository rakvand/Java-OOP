
public class Puhelinohjelma {

	public static void main(String[] args) {
		
		Puhelin puhelin1 = new Puhelin();
		System.out.println("Default");
		puhelin1.tulostaTiedot();
		System.out.println();
				
		Puhelin puhelin2 = new Puhelin("Samsung", "A8", true);
		System.out.println("Puhelin 1");
		puhelin2.tulostaTiedot();
		System.out.println();
				
		Puhelin puhelin3 = new Puhelin("iPhone", "11", true);
		System.out.println("Puhelin 2");
		puhelin3.tulostaTiedot();
		System.out.println();
				
		System.out.println("Puhelimen 1 tiedot muutettiin.");
		puhelin2.muutaTiedot("Nokia", "880", false);
				
		puhelin2.kaynnistys();
		System.out.println("Puhelin 1");		
		puhelin2.tulostaTiedot();
		System.out.println();
				
		puhelin3.sammutus();
		System.out.println("Puhelin 2");
		puhelin3.tulostaTiedot();
		System.out.println();
		
		PuhelinKuorilla puhelin4 = new PuhelinKuorilla();
		System.out.println("Puhelin 4");
		puhelin4.tulostaTiedot();
		System.out.println();
		puhelin4.lisaaKuoret();
		puhelin4.tulostaTiedot();
		System.out.println();
		
		// Getterin testaus
		System.out.println("Getter testi: " + puhelin2.getMalli());

	}

} // End of Puhelinohjelma

class Puhelin
{
	// Puhelin attribuutit
	protected boolean paalla;
	protected String merkki;
	protected String malli;
	
	// Getteri malli-attribuutille 
	public String getMalli() {
		return malli;
	}
	
	// Setteri malli-attribuutille
	public void setMalli(String malli) {
		this.malli = malli;
	}

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
	
	protected void tulostaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		if (paalla) {
			System.out.println("Puhelin on p‰‰ll‰.");
		}
		else {
			System.out.println("Puhelin on kiinni.");
		}
	}
	
	protected void muutaTiedot(String merkki, String malli, boolean paalla)
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
	
} // End of Puhelin class

class PuhelinKuorilla extends Puhelin
{
	// Paino-attribuutti
	private int paino;
	
	// Oletusmuodostin, default constructor
	public PuhelinKuorilla()
	{
		merkki = "iPhone";
		malli = "10";
		paalla = true;
		paino = 150;
	}
	
	// Parametrinen muodostin, parameterized constructor
	public PuhelinKuorilla(String merkki, String malli, boolean paalla, int paino)
	{
		this.merkki = merkki;
		this.malli = malli;
		this.paalla = paalla;
		this.paino = paino;
	}
	
	// Kuorien lis‰ys metodi
	public void lisaaKuoret()
	{
		System.out.println("Puhelimeen lis‰ttiin kuoret.");
		paino+=10;
	}
	
	// Tietojen tulostus metodi
	@Override
	protected void tulostaTiedot()
	{
		super.tulostaTiedot();
		System.out.println("Paino: " + paino + "g");
	}
}
