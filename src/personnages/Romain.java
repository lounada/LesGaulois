package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement=0;
	private Equipement[]  equipements=new Equipement[2];
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
	private void addEquipement(Equipement equipement,int index){
		equipements[index]=equipement;
		nbEquipement++;
		System.out.println("Le soldat "+this.nom+" s'équipe avec un "+equipement+".");
	}
	public void sEquiper(Equipement equipement){
		switch(this.nbEquipement) {
			case 0:this.addEquipement(equipement,0);break; 
			case 1:
					if(equipements[0].toString().equals(equipement.toString())){
						System.out.println("Le soldat "+this.nom+" possède déjà un "+equipement+" !");
					}
					else{
						this.addEquipement(equipement,1);
					}
					break; 
			default:System.out.println("Le soldat "+this.nom+" est déjà bien protégé !");
		}
		
	}
	public static void main(String[] args) {
		Romain minus=new Romain("Minus",20); // Declaration et initialisation d'un objet de class Romain
		minus.parler("Bonjour tout le monde !!");// Test de la methode de prendreParole et parler 
		 //Test de methode recevoirCoup:
//			 minus.recevoirCoup(10);// force-10>0 ==> <<Aie>>
//			 minus.recevoirCoup(10);// force-10=0 ==> <<j'abondonne..>>
		//Test des Equipements:
			Equipement casque=Equipement.CASQUE;
			Equipement bouclier=Equipement.BOUCLIER;
			minus.sEquiper(casque);
			minus.sEquiper(casque);
			minus.sEquiper(bouclier);
			minus.sEquiper(bouclier);

	}
}