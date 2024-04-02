package jeu;

import java.util.Random;
import java.util.Scanner;

import affichage.IAffichage;
import personnage.Couleur;
import personnage.Pion;
import plateau.Plateau;


public class Jeu implements IAffichage {
	
	private int position;
	private Pion pionJack;
	private Pion pionBill;
	private Scanner scanner;
	private Plateau plateau;
	private int nbCases = 30;
	
	
	public Jeu() {
		pionJack = new Pion("Jack",5,Couleur.ROUGE);
		pionBill = new Pion("Bill",5,Couleur.BLEU);
		scanner = new Scanner(System.in);
		plateau = new Plateau();
	}
		
	public void tourPion(Pion pion, Pion adversaire) {
		System.out.println("Appuyez sur entrée pour lancée le dé....");
		scanner.nextLine();
		
		int res = De.resultatDes();
		afficherResultatDes(res);
		pion.avancerPion(res);
		
		afficherPosition(pion);
		
	}
	
	
	
	public void jouerTour() {
	    tourPion(pionJack, pionBill);
	    plateau.appliquerEffet(pionJack.getPosition(), pionJack,pionBill);
	    if (pionJack.getPosition() >= 30) {
	        return;
	    }

	    tourPion(pionBill, pionJack);
	    plateau.appliquerEffet(pionBill.getPosition(), pionBill,pionJack);
	    if (pionBill.getPosition() >= 30) {
	        return;
	    }
	}
	
	public void commencerjeu() {
		//tourPion(pionJack);
		//tourPion(pionBill);
		plateau.afficherPlateau();
		do{
		jouerTour();
		}while(pionJack.getPosition()<=30 && pionBill.getPosition()<=30 );
		
		if (pionJack.getPosition() >= nbCases-1 || pionBill.getVie()== 0 ) {
			afficherFinDeJeu(pionJack.getNom()); 
        } else if (pionBill.getPosition() >= nbCases-1 || pionJack.getVie()== 0) {
        	afficherFinDeJeu(pionBill.getNom());
        }
	}

	
	@Override
	public void afficherPosition(Pion pion) {
		System.out.println( "Le joueur "+ pion.getNom() +" avance jusqu'à la case "+pion.getPosition()+".");
	}

	@Override
	public void afficherResultatDes(int resultat) {
        System.out.println( "Résultat des dés : " + resultat);
    }

	@Override
	public void afficherFinDeJeu(String gagnant) {
		System.out.println("\nLe joueur " + gagnant + " a gagné!");
		
	}
}
