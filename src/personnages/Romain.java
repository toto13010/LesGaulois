package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement=0;
	private Equipement[] equipements;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}
	
	private String prendreParole() {
		return "Le romain " + nom +" : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int t=force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		}else {
			parler("J'abandonne...");
		}
		assert force<t;
	}
	
	public void sEquiper(Equipement equipement){
		switch (nbEquipement) {
			case 2:
				System.out.println("Le soldat " + getNom() + " est d�j� bien prot�g� !");
				break;
			case 1:
				if (equipements[0]==equipement) {
					System.out.println("Le soldat " + getNom() + " poss�de d�j� un " + equipement + " !");
					break;
				}
				else {
					equipements[1] = equipement;
					nbEquipement+=1;
					System.out.println("Le soldat " + getNom() + " s'�quipe d'un " + equipement + ".");
					break;
				}
			case 0:
				equipements[0]=equipement;
				nbEquipement+=1;
				System.out.println("Le soldat " + getNom() + " s'�quipe d'un " + equipement + ".");
				break;
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain ("Minus",6);
		System.out.println(minus.prendreParole());
		minus.parler("Bonjour");
		
		minus.recevoirCoup(5);
		
		//System.out.println(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
