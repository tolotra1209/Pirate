package plateau;

import java.util.Random;

import personnage.Pion;

public class Plateau {
    private Case[] cases;
    private int nbCases = 30;

    public Plateau() {
        cases = new Case[nbCases];
        initPlateau();
    }

    private void initPlateau() {
        Random random = new Random();
        
        // Tableau pour garder une trace du nombre de chaque type de case déjà attribué
        int[] typeCounts = new int[Type.values().length];

        // Attribuer le type de chaque case
        for (int i = 0; i < nbCases; i++) {
            Type randomType;
            if (i == 0 || i % 3 != 0 || typeCounts[Type.NORMAL.ordinal()] >= Type.NORMAL.getQuantite()) {
                do {
                    randomType = getRandomType();
                } while (typeCounts[randomType.ordinal()] >= randomType.getQuantite() || 
                         isCloseTypeExists(cases, i, randomType));
            } else {
                randomType = Type.NORMAL;
            }
            cases[i] = generateCase(i + 1, randomType);
            typeCounts[randomType.ordinal()]++;
        }
    }

    private Case generateCase(int numero, Type type) {
        switch (type) {
            case NORMAL:
                return new Normal(numero);
            case SAKE:
                return new Sake(numero);
            case REQUIN:
                return new Requin(numero);
            case DOUBLECANON:
                return new Doublecanon(numero);
            case SABRE:
                return new Sabre(numero);
            case REVOLVER:
                return new Revolver(numero);
            case BARQUE:
                return new Barque(numero);
            case POTION:
                return new Potion(numero);
            case STORM:
                return new Storm(numero);
            case PERROQUET:
                return new Perroquet(numero);
            case KRAKEN:
                return new Kraken(numero);
            default:
                // Si le type n'est pas reconnu, générer une case normale par défaut
                return new Normal(numero);
        }
    }

    private Type getRandomType() {
        // Obtenir un type aléatoire en fonction de son index dans l'énumération
        int randomIndex = new Random().nextInt(Type.values().length);
        Type[] types = Type.values();
        return types[randomIndex];
    }
    
    private boolean isCloseTypeExists(Case[] cases, int currentIndex, Type type) {
        // Vérifier si le type existe dans les 3 dernières cases attribuées
        for (int i = Math.max(0, currentIndex - 3); i < currentIndex; i++) {
            if (cases[i] != null && cases[i].getType() == type) {
                return true;
            }
        }
        return false;
    }

    public void afficherPlateau() {
        for (int i = 0; i < cases.length; i++) {
            Case currentCase = cases[i];
            System.out.println("Case " + currentCase.getNumero() + ": " + currentCase.getType());
        }
    }

    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        plateau.afficherPlateau();
    }
    
    public void appliquerEffet(int position, Pion pion, Pion adversaire) {
        // Vérifie si la position est valide
        if (position < 0 || position >= nbCases) {
            return;
        }

        // Récupère la case sur laquelle se trouve le pion
        Case currentCase = cases[position-1];

        // Affiche l'information sur la case
        System.out.println("Le pion " + pion.getNom() + " est sur la case " + currentCase.getNumero() + " : " + currentCase.getType());

        // Applique l'effet de la case sur le pion
        switch (currentCase.getType()) {
            case NORMAL:
                // Aucun effet spécial pour une case normale
                break;
            case SAKE:
                ((Sake)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : La vie de " + pion.getNom() + " a augmenté de 1 point.");
                break;
            case REQUIN:
            	((Requin)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : La vie de " + pion.getNom() + " a augmenté  de 2 points.");
                break;
            case STORM:
            	((Storm)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : Le pion " + pion.getNom() + " revient à la case départ.");
                break;
            case KRAKEN:
            	((Kraken)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : La santé de " + pion.getNom() + " a diminué de 3 points.");
                break;
            case BARQUE:
            	((Barque)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : Le pion de " + pion.getNom() + " avance de 5 cases.");
                break;
            case DOUBLECANON:
            	((Doublecanon)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : Le pion de " + pion.getNom() + " avance de 1 case"+"et le pion de "+adversaire.getNom()+"recule de 2 cases et perd 2 pv.");
                break;
            case POTION:
            	((Potion)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : La potion est mise dans l'inventaire.");
                break;
            case SABRE:
            	((Sabre)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : Le sabre est mise dans l'inventaire.");
                break;
            case REVOLVER:
            	((Revolver)currentCase).effet(pion,adversaire);
                System.out.println("Effet de la case : Le revolver est mise dans l'inventaire.");
                break;
            default:
                // Cas par défaut, aucune action nécessaire
                break;
        }
    }

}
