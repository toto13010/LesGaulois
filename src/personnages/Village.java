package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois=0;
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void  ajouterHabitant(Gaulois gaulois) {
		if	(nbVillageois<nbVillageoisMaximum) {
			villageois[nbVillageois] = gaulois;
			nbVillageois+=1;
		}
	}
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le villagedu chef " + chef.getNom() + " vivent les l�gendaires gaulois :");
		for (int i=0;i<nbVillageois;i++) {
			System.out.println("-" + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix",6,1,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Ob�lix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(abraracourcix);
	}
}