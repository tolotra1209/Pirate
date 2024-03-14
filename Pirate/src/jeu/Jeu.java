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
		return "Le joueur "+ pion.getNom() +" est à la case "+pion.getPosition()+".";
	}
	
	public void tourPion(Pion pion) {
		System.out.println("Appuyez sur entrée pour lancée le dé....");
		scanner.nextLine();
		
		System.out.println(resultatDes());
		
		
		System.out.println(afficherPosition(pion));
	}
	
	public static int lancerDe() {
		Random random=new Random();
		return random.nextInt(6)+1;
	}
	
	
	public void jouerTour() {
		
	}
	
	public void commencerjeu() {
		tourPion(pionJack);
	}
	
	public int nouvellePosition=resultatDes()+position;
}
