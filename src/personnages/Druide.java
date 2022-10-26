package personnages;

import java.util.Random;
import java.lang.Math;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	private Random random=new Random();
    public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		forcePotion =(random.nextInt(effetPotionMax - effetPotionMin)) + effetPotionMin;
		String texte = "";
		if (forcePotion > 7) {
			texte += "J'ai préparé une super potion ";
		} else {
			texte += "Je n'ai pas trouvé tous les ingrédients ma potion est seulement de force ";
		}
		parler(texte +forcePotion + " .");
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obélix")) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}
	public static void main(String[] args){
		Druide d1=new Druide("Panoramix",5,10); // Declaration et initialisation d'un objet de class Druide
		//Test de method preparerPotion plusieur fois:
		d1.preparerPotion();
		d1.preparerPotion();
		d1.preparerPotion();
		d1.preparerPotion();
	}
}