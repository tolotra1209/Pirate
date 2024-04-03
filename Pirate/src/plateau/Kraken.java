package plateau;

import personnage.Pion;

public class Kraken extends Case{

	public Kraken(int numero) {
        super(numero, Type.KRAKEN);
    }
	

	@Override
    public void effet(Pion pion,Pion adversaire,Plateau plateau) {
        pion.perdreVie(4);
        
    }
}
