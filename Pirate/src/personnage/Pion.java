package personnage;

public class Pion extends Pirate{
	private Couleur couleur;
	private int position=1;
	
	public Pion(String nom,int vie, Couleur couleur) {
		super(nom,vie);
		this.couleur=couleur;
	}

	public Couleur getCouleur() {
		return couleur;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position=position;
	}
	
	public void avancerPion(int pos) {
		int newPos = position + pos ;
	    if (newPos <= 30) {
	        position = newPos;
	    } else {
	        position = 30 - (newPos - 30); 
	    }
	}
	
	public void reculerPion(int pos) {
		position -= pos;
	}
	
	public void afficherPosition(Pion pion) {
		System.out.println( "Le joueur "+ pion.getNom() +" avance jusqu'à la case "+pion.getPosition()+".");
	}
}
