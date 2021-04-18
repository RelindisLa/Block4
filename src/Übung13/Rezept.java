package Übung13;

public class Rezept {

    public int anzahlPersonen;
    public String [] zutatenName;
    public double [][] zutaten;

    public boolean allergisch(String zutatAllergie){
        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatAllergie.equals(zutatenName))
                return true;
        }
        return false;
    }

    public boolean laktoseFrei() {
        boolean hatLaktose = false;

        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].equals("Milch") || zutatenName[i].equals("käse")) {
                hatLaktose = true;
                zutaten[i][0] = 0;
                zutaten[i][1] = 0.0;
            }
        }
        return hatLaktose;
    }

    public double kostet(){
        double kosten = 0;
        for (int i = 0; i < zutaten.length ; i++) {
            kosten = kosten + zutaten[i][1];
        }
        return kosten;
    }

    public double kostetProPerson() {
            return kostet() / anzahlPersonen;
        }

    public void aenderePersonenanzahl (int anzahl){
        for (int i = 0; i < zutatenName.length; i++) {
            int menge = 0;
            zutaten[i][0] = menge;
            menge = menge / anzahlPersonen * anzahl;
            int preis = 0;
            zutaten[i][1] = preis;
            preis = preis / anzahlPersonen * anzahl;
        }
    }

}
