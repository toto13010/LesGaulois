package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	private int nb_trophees;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "� ");
	}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom +" : ";
//	}
	
//	public void frapper(Romain romain, int effetPotion) {
//		System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force/3) * effetPotion);
//		
//	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e.");
	}
	

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		
		System.out.println(asterix.prendreParole());
		
		asterix.parler("Bonjour");
		
		asterix.boirePotion(5);
	}
}
