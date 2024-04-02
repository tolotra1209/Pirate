package plateau;

import personnage.Pion;

public class Doublecanon extends Case{

	public Doublecanon(int numero) {
        super(numero, Type.DOUBLECANON);
    }

	@Override
	public void effet(Pion pion,Pion adversaire) {
		pion.avancerPion(1);
		adversaire.reculerPion(2);
		adversaire.perdreVie(2);
	}
}
