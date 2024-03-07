package personnage;

public class Pirate {
	private String nom;
	private int pointDeVie=5;
	
	public Pirate(String nom) {
		this.nom=nom;
	}
	
	public String getNom() {
		return nom;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
	
	

}
