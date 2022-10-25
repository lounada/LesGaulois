package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force+ "]";
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0 ) {
			parler("Aie");
		} else {
			force=0;
			parler("j'abondonne..");
		}
	}

	public static void main(String[] args) {
		Romain minus=new Romain("Minus",20); // Declaration et initialisation d'un objet de class Romain
		minus.parler("Bonjour tout le monde !!");// Test de la methode de prendreParole et parler 
		 //Test de methode recevoirCoup:
			 minus.recevoirCoup(10);// force-10>0 ==> <<Aie>>
			 minus.recevoirCoup(10);// force-10=0 ==> <<j'abondonne..>>

	}
}