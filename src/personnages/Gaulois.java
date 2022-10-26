package personnages;
import histoire.Musee;
public class Gaulois {
	private String nom;
	private int force; 
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public Equipement[] getTrophees(){
		return trophees;
	}
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public int getnbTrophees() {
		return nbTrophees;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
	    System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
	    Equipement[] tropheesBataille = romain.recevoirCoup((force / 3) * effetPotion);
	    for (int i = 0; tropheesBataille != null && i < tropheesBataille.length; i++, nbTrophees++) {
	        this.trophees[nbTrophees] = tropheesBataille[i];
	    }
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcepotion) {
		this.effetPotion=forcepotion;
		this.parler("Merci Druide, je sens que ma force est "+forcepotion+" fois décuplée");
	}
	public void faireUneDonnation(Musee museeDestinataire){
		if(nbTrophees!=0){
			museeDestinataire.donnerTrophees(this);
		}
	}
	public static void main(String[] args) {
		Gaulois gaul1=new Gaulois("Gaul1",10); // 
		Romain rom1=new Romain("rom1",20);
		gaul1.parler("Bonjour !!!!");
		System.out.println("C'est Gaul : "+gaul1.getNom());
		System.out.println(rom1);
		gaul1.frapper(rom1);
		System.out.println(gaul1);
		System.out.println(rom1);
		gaul1.boirePotion(30);
		System.out.println(gaul1);
	}
}
