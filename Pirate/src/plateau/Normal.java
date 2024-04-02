package plateau;

import personnage.Pion;

public class Normal extends Case{
	
	public Normal(int numero) {
        super(numero, Type.NORMAL);
    }
	
	@Override
    public void effet(Pion pion,Pion adversaire) {     
    }
}
