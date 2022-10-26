package personnages;


public class Romain {
	public static final String SOLDAT="Le soldat ";
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
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
	

	public Equipement[] recevoirCoup(int forceCoup) {
	    Equipement[] equipementEjecte = null;
	    // Precondition
	    assert force > 0;
	    int oldForce = force;
	    forceCoup = calculResistanceEquipement(forceCoup);
	    force -= forceCoup;
	    if(force==0) {
	        equipementEjecte = ejecterEquipement();
	        parler("J'abandonne...");
	    }else {
	    	parler("Aïe");
	    }
	    // post condition la force a diminuée
	    assert force < oldForce;
	    return equipementEjecte;
	}
	private int calculResistanceEquipement(int forceCoup) {
	   String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
	    int resistanceEquipement = 0;
	    if (nbEquipement!=0) {
	        texte+="\nMais heureusement, grace à mon équipement sa force est diminué de " ;
	        for (int i = 0; i < nbEquipement;i++) {
	            if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
	                resistanceEquipement += 8;
	            } else {
	                System.out.println("Equipement casque");
	                resistanceEquipement += 5;
	            }
	            
	        }
	        texte += resistanceEquipement + "!";
	    }
	    parler(texte);
	    forceCoup -= resistanceEquipement;
	    if(forceCoup<0) {
	    	forceCoup=0;
	    }
	    return forceCoup;
	}
	private Equipement[] ejecterEquipement() {
	    Equipement[] equipementEjecte = new Equipement[nbEquipement];
	    System.out.println("L'équipement de" + nom + "s'envole sous la force du coup.");
	    int nbEquipementEjecte = 0;
	    for (int i = 0; i < nbEquipement; i++) {
	        if (equipements[i] != null) {
	            equipementEjecte[nbEquipementEjecte] = equipements[i];
	            nbEquipementEjecte++;
	            equipements[i] = null;
	        }
	    }
	    return equipementEjecte;
	}
	private void addEquipement(Equipement equipement,int index){
		equipements[index]=equipement;
		nbEquipement++;
		System.out.println(Romain.SOLDAT+this.nom+" s'équipe avec un "+equipement+".");
	}
	public void sEquiper(Equipement equipement){
		switch(this.nbEquipement) {
			case 0:this.addEquipement(equipement,0);break; 
			case 1:
					if(equipements[0].toString().equals(equipement.toString())){
						System.out.println(Romain.SOLDAT+this.nom+" possède déjà un "+equipement+" !");
					}
					else{
						this.addEquipement(equipement,1);
					}
					break; 
			default:System.out.println(Romain.SOLDAT+this.nom+" est déjà bien protégé !");
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

