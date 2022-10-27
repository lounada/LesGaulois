package histoire;
import personnages.Equipement;
import personnages.Gaulois;
public class Musee {
	private Trophee[] trophees=new Trophee[200];
	private int nbTrophees=0;
	public Musee() {

	}
	public void donnerTrophees(Gaulois gauloisDonneur){
		Equipement[] tropheesDonneur=gauloisDonneur.getTrophees();
		if(tropheesDonneur.length>0){
			String texte=" Je donne au musee tous mes trophees : ";
			for(int i=0;i<tropheesDonneur.length;i++){
				if( tropheesDonneur[i]!=null ){
					trophees[nbTrophees]=new Trophee(gauloisDonneur,tropheesDonneur[i]);
					nbTrophees++;
					texte+="\n- "+tropheesDonneur[i].toString();
				}
			}
			gauloisDonneur.parler(texte);
		}
		else{
			gauloisDonneur.parler("Désolé je ne peux pas faire de don ! je n'ai pas de trophées");
		}
	}
	public void afficherTrophees() {
		if(nbTrophees!=0) {
			System.out.println("Dans ce musée il y a Les trophées suivantes: ");
		}
		for(int i=0;i<nbTrophees;i++) {
			System.out.println(trophees[i].getGaulois().getNom() +" : "+trophees[i].getEquipement().toString());
		}
	}
	public String extraireInstructionsCaml() {
		String texte="let musee=[";
		for(int i=0;i<nbTrophees;i++) {
			texte+='"'+trophees[i].getGaulois().getNom()+'"'+','+' '+'"'+trophees[i].getEquipement().toString()+'"';
			if(i!=nbTrophees-1) texte+=';';
		}
		texte+=']';
		return texte;
	}

}
