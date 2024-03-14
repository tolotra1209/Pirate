package personnage;

public class Pion extends Pirate{
	private Couleur couleur;
	private int position=1;
	
	public Pion(String nom, Couleur couleur) {
		super(nom);
		this.couleur=couleur;
	}

	public Couleur getCouleur() {
		return couleur;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void deplacerPion(int newPos) {
		position += newPos;
	}
}
