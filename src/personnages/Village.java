package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private villageois[] gaulois; 
	
	public Village(String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
    }
	
	
	}
	public String getNom() {
		return nom;
	}
	public Village(String nom, Chef chef, int nbVillageois, villageois[] gaulois, int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.nbVillageois = nbVillageois;
		this.gaulois = gaulois;
		this.nbVillageoisMaximum=
	}
	public void ajouterHabitant(String Gaulois) {
		
	}
	
}
