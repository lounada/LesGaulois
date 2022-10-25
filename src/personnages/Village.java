package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois villageois[]; 
	
	public Village(String nom ,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois=new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
    }
	
	
	
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois g,int place) {
		if(place<villageois.length && place>=0){
			this.villageois[place]=g;
			this.nbVillageois++;
		}
		else{
			System.out.println("Désolé, ce case n'existe pas dans le tableau!");
		}
	}
	
}

