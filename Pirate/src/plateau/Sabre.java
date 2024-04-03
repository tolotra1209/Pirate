package plateau;

import personnage.Pion;

public class Sabre extends Case{
	
	public Sabre(int numero) {
        super(numero, Type.SABRE);
    }

	@Override
	public void effet(Pion pion,Pion adversaire,Plateau plateau) {
		pion.ajouterObjet(this);
		
	}
}
