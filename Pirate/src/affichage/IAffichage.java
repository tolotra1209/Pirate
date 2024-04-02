package affichage;

import personnage.Pion;

public interface IAffichage {
	public abstract  void afficherPosition(Pion pion);
	public abstract void afficherResultatDes(int resultat);
	public abstract void afficherFinDeJeu(String gagnant);
}
