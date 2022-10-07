package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain (String nom, int force) {
		this.nom = nom;
		this.force = force;
		}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe !");
        } else {
        	parler("J'abandonne...");
        }
	}
}