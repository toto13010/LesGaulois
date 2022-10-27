//package histoire;
//
//import personnages.Gaulois;
//import personnages.Romain;
//import personnages.Druide;
//
//public class Scenario {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Gaulois asterix = new Gaulois("Asterix",8);
//		
//		Gaulois obelix = new Gaulois("Obelix",10);
//		
//		Romain minus = new Romain ("Minus",6);
//		
//		Druide panoramix = new Druide("Panoramix",5,10);
//		
//		panoramix.parler("Je vais aller pr�parer une petite potion...");
//		
//		int forcePotion =panoramix.preparePotion();
//		
//		panoramix.booster(obelix);
//		
//		obelix.parler("Par B�l�nos, ce n'est pas juste !");
//		
//		asterix.parler("Merci Druide, je sens que ma force est " + forcePotion + " fois d�cupl�e.");
//	
//		asterix.parler("Bonjour � tous");
//		
//		
//		minus.parler("UN GAU... UN GAUGAU...");
//		
//		asterix.frapper(minus, forcePotion);
//
//		asterix.frapper(minus,forcePotion);
//
//		asterix.frapper(minus, forcePotion);		
//	}
//
//}

package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;
import villagegaulois.Musee;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller pr�parer une petite potion...");
		druide.preparePotion();
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		druide.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0);
		
//		Partie a decommenter
		
//		Musee musee = new Musee();
//		asterix.faireUneDonnation(musee);

	}

}
