package jeu;

import java.util.Random;
import java.util.Scanner;

import personnage.Couleur;
import personnage.Pion;
import plateau.Plateau;

public class Jeu {
	
	private int position;
	private Pion pionJack;
	private Pion pionBill;
	private Scanner scanner;
	
	public Jeu() {
		pionJack = new Pion("Jack",Couleur.ROUGE);
		pionBill = new Pion("Bill",Couleur.BLEU);
		scanner = new Scanner(System.in);
	}
	
	public int resultatDes() {
		return lancerDe()+lancerDe();
	}
	
	
	public String afficherPosition(Pion pion) {
		return "Le joueur "+ pion.getNom() +" avance jusqu'à la case "+pion.getPosition()+".";
	}
	
	public void tourPion(Pion pion) {
		System.out.println("Appuyez sur entrée pour lancée le dé....");
		scanner.nextLine();
		
		int res1 = resultatDes();
		System.out.println("Résultat dé: "+res1);
		pion.deplacerPion(res1);
		
		System.out.println(afficherPosition(pion));
		
	}
	
	public static int lancerDe() {
		Random random=new Random();
		return random.nextInt(6)+1;
	}
	
	
	public void jouerTour() {
		
		tourPion(pionJack);
		if (pionJack.getPosition()>=30) {
			return;
		}
			
		
		tourPion(pionBill);
		if(pionBill.getPosition()>=30) {
			return;
		}
			
		
	}
	
	public void commencerjeu() {
		//tourPion(pionJack);
		//tourPion(pionBill);
		
		do{
		jouerTour();
		}while(pionJack.getPosition()<=30 && pionBill.getPosition()<=30 );
	}
	
}
