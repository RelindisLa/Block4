package Übung13;

public class Rezept {

    int anzahlPersonen = 0;
    String [] zutatenName;
    int [] gewichtZutat = new int[0];
    double [] preis = new double[0];
    double [][] zutaten = new double [zutatenName.length][1];

    public boolean allergisch(String zutatAllergie){
        if (zutatAllergie.equals(zutatenName))
            return true;
        else return false;
    }

    public boolean laktoseFrei(){
        if (zutatenName.equals("Milch")){
            zutatenName = null;
            return true;
        }
        else if (zutatenName.equals("Käse")) {
            zutatenName = null;
            return true;
        }
        else return false;
    }

    public double kostet(){
        double kosten = 0;
        for (int i = 0; i < zutatenName.length ; i++) {
            kosten = kosten + zutaten[i][1];
        }
        return kosten;
    }

    public double kostetProPerson(){
        double kostetProPersion = kostet() / anzahlPersonen;
        return kostetProPersion;
    }

    public void aenderePersonenanzahl (int anzahl){
        //double gesamtKosten = 0;
        //gesamtKosten = kostetProPerson() * anzahl;
        //return gesamtKosten;
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
