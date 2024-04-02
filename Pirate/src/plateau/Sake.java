package plateau;

import personnage.Pion;

public class Sake extends Case{
	
	public Sake(int numero) {
        super(numero, Type.SAKE);
    }
	

	@Override
    public void effet(Pion pion,Pion adversaire) {
        pion.gagnerVie(1);
        pion.reculerPion(2);
        
    }
}
