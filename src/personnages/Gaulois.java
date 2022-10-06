package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prndreParole() + "' " + texte + " '");
	}

	private String prndreParole() {
		return "le gaulois " + nom + ":";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire de" + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix);
		System.out.println(asterix.prndreParole());
		asterix.parler("hola");
		Romain brutus = new Romain("Brutus",1);
		asterix.frapper(brutus);
	}

}
