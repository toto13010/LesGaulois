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
		System.out.println(prndreParole() + "'" + texte + "'");
	}

	private String prndreParole() {
		return "le romain" + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		force-=forceCoup;
		if (force>0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");

		}
	}

}
