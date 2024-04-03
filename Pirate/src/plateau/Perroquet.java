package plateau;

import personnage.Pion;

public class Perroquet extends Case {
    public Perroquet(int numero) {
        super(numero, Type.PERROQUET);
    }

    @Override
    public void effet(Pion pion, Pion adversaire, Plateau plateau) {
        Case[] cases = plateau.getCases();

        for (int i = pion.getPosition() + 1; i < cases.length; i++) {
            if (cases[i] != null && cases[i].getType() == Type.NORMAL) {
                cases[i] = new Potion(i);
                System.out.println( "La case " + (i + 1) + " a été transformée en Potion par le Perroquet.");
                return;
            }
        }

        System.out.println("Aucune case normale disponible pour être transformée en Potion par le Perroquet.");
        return;
    }
}
