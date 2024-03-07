package plateau;

public class Plateau {
	private Case[] cases;
	private int nbCases = 30;
	
	public Plateau() {
		cases = new Case[nbCases];
		initPlateau();
	}

	private void initPlateau() {
		// Case normal;
		for (int i=1;i<nbCases+1;i++) {
			cases[i] = new Case(i, Type.NORMAL);
		}
		
	}
}
