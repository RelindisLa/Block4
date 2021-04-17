package Übung13;

public class RezeptMain {
    public static void main(String[] args) {
        Rezept glaswasser = new Rezept();
        glaswasser.anzahlPersonen = 1;
        glaswasser.zutatenName [] = {"Glas", "Wasser"};
        //glaswasser.zutatenName [1] = {"Wasser"};
        //glaswasser.zutaten [0][0] = [gewichtZutat][preis];
        glaswasser.zutaten [0][0] = 100;
        glaswasser.zutaten [0][1] = 0;
        glaswasser.zutaten [1][0] = 250;
        glaswasser.zutaten [1][1] = 1;

        System.out.println("GlasWasser Preis: " + glaswasser.preis);
        System.out.println("GlasWasser laktosefrei: " + glaswasser.laktoseFrei());
        System.out.println("GlasWasser für 2 Personen: " + glaswasser.aenderePersonenanzahl(2););


    }
}
