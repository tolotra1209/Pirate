package personnage;

import java.util.ArrayList;
import java.util.List;

public class Pirate {
	private String nom;
	private int vie;
	private List<Object> inventaire = new ArrayList<>();
	
	public Pirate(String nom, int vie) {
		this.nom=nom;
		this.vie=vie;
	}
	
	

	public String getNom() {
		return nom;
	}

	public int getVie() {
		return vie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.vie = vie;
	}
	
	public void perdreVie(int pv) {
		vie = vie - pv;
		System.out.println(nom + " perd " + pv + " pv");
	}
	
	public void gagnerVie(int pv) {
		vie = vie + pv;
		if (vie > 5) {
	        vie = 5;
	    }
	}
	
	public void ajouterObjet(Object objet) {
        inventaire.add(objet);
    }
	
	
}
