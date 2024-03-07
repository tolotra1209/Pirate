package jeu;

import java.util.Random;

public class Jeu {
	private int resultatDes=lancerDe1()+lancerDe2();
	
	public static int lancerDe1() {
		Random random=new Random();
		return random.nextInt(6)+1;
	}
	
	public static int lancerDe2() {
		Random random=new Random();
		return random.nextInt(6)+1;
	}
	
	public int getResultatDes() {
		return resultatDes;
	}
}
