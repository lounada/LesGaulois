package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		Gaulois g1=new Gaulois("Ast�rix",8);
		Romain r1=new Romain("Minus",6);
		g1.parler("Bonjour � tous");
		r1.parler("UN GAU... UN GAUGAU...");
		g1.frapper(r1);
		g1.frapper(r1);
		g1.frapper(r1);


	}

}
