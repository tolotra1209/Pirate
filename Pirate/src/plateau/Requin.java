package plateau;

import personnage.Pion;

public class Requin extends Case{
	
	public Requin(int numero) {
        super(numero, Type.REQUIN);
    }
	
	@Override
    public void effet(Pion pion,Pion adversaire) {
        pion.gagnerVie(2);
        
    }
}
