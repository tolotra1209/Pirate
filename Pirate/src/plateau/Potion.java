package plateau;

import personnage.Pion;

public class Potion extends Case{
	
	public Potion(int numero) {
        super(numero, Type.POTION);
    }

	@Override
	public void effet(Pion pion,Pion adversaire,Plateau plateau) {
		pion.ajouterObjet(this);
		
	}
}
