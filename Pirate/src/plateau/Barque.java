package plateau;

import jeu.De;
import personnage.Pion;

public class Barque extends Case {
	
	public Barque(int numero) {
        super(numero, Type.BARQUE);
    }

	@Override
	public void effet(Pion pion,Pion adversaire,Plateau plateau) {
		pion.avancerPion(5);
		
	}
}
