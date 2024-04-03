package plateau;

import personnage.Pion;

public class Revolver extends Case{

	public Revolver(int numero) {
        super(numero, Type.REVOLVER);
    }

	@Override
	public void effet(Pion pion,Pion adversaire,Plateau plateau) {
		pion.ajouterObjet(this);
		
        
		
	}
}
