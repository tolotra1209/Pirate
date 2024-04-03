package plateau;

import personnage.Pion;

public class Storm extends Case{

	public Storm(int numero) {
        super(numero, Type.STORM);
    }

	@Override
	public void effet(Pion pion,Pion adversaire,Plateau plateau) {
		pion.setPosition(1);
		
	}
}
