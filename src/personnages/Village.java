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
	public void afficherVillageois(){
		System.out.println("Dans village du chef "+this.chef.getNom()+" vivent les légendaires gaulois: ");
		for(Gaulois g:villageois){
			if(g instanceof Gaulois) System.out.println("-"+g.getNom());//utilisation de instanceof pour eviter des erreur
		}
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
	public Gaulois trouverHabitant(int position){
		if(nbVillageois==0) {
			System.out.println("Il y a pas des habitants!!");
			return null;
		}	
		if(position>=villageois.length || position<0){
			System.out.println("Désolé, ce case n'existe pas dans le tableau!");
		}
		return  this.villageois[position];
	}
	public static void main(String[] args) {

		Village village=new Village("Village des Irréductibles",30);//  Declaration et initialisation d'un objet de class Village
		/*Gaulois gaulois = village.trouverHabitant(30);
		pour Ã©viter l'erreur : "Index 30 out of bounds for length 30 at personnages.Village.trouverHabitant(Village.java:37)"
		on a deux conditions dans la mÃ©thode "trouverHabitant", la premiÃ¨re vÃ©rifie si le tableau du villagois est vide,
		et la seconde vÃ©rifie si la position saisie est bien dans le tableau.
		*/
		village.setChef(new Chef("Abraracourcix",6,1,village));
		village.ajouterHabitant(new Gaulois("Astrix",8),0);
		village.ajouterHabitant(new Gaulois("Obélix",25),1);
		village.afficherVillageois();

		 /*Gaulois gaulois = village.trouverHabitant(1);
		 System.out.println(gaulois);
		 ces instructions afficheront "null" car la position 1 n'a pas encore d'Ã©lÃ©ment*/

	}
	
}

