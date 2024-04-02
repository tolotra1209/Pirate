package jeu;

import java.util.Random;

public class De {
	public static int resultatDes() {
		return lancerDe();
	}
	
	public static int lancerDe() {
		Random random=new Random();
		return random.nextInt(6)+1;
	}
	
	public int modifierResulat(int modif) {
		return resultatDes()- modif;
	}
	
	public String afficherResultatDes(int resultat) {
        return "Résultat des dés : " + resultat;
    }
}
