package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class scenario {

	public static void main(String[] args) {
		//senario 1:
			// Gaulois g1=new Gaulois("Ast�rix",8);
			// Romain r1=new Romain("Minus",6);
			// g1.parler("Bonjour � tous");
			// r1.parler("UN GAU... UN GAUGAU...");
			// g1.frapper(r1);
			// g1.frapper(r1);
			// g1.frapper(r1);
		//senario 2:
			Druide pnoramix=new Druide("Panoramix",5,10);
			Gaulois obelix=new Gaulois("Ob�lix",5);
			Gaulois asterix=new Gaulois("Ast�rix",8);
			Romain minus=new Romain("Minus",15);
			pnoramix.parler("Je vais aller pr�parer une petite potion...");
			pnoramix.preparerPotion();
			pnoramix.booster(obelix);
			obelix.parler("Par B�l�nos, ce n'est pas juste !");
			asterix.boirePotion(3);
			asterix.parler("Bonjour");
			minus.parler("UN GAU... UN GAUGAU...");
			asterix.frapper(minus);
			asterix.frapper(minus);
			asterix.frapper(minus);
	}

}
