package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "+ romain.getNom());
		romain.recevoirCoup((this.force / 3)*this.effetPotion);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcepotion) {
		this.effetPotion=forcepotion;
		if(forcepotion==3){
			this.parler("Merci Druide, je sens que ma force est 3 fois d�cupl�e");
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
