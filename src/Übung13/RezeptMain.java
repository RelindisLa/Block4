package Übung13;

import java.util.Arrays;

public class RezeptMain {
    public static void main(String[] args) {
        Rezept glaswasser = new Rezept();

        String [] glasw = {"Glas","Wasser"};
        double [][] glaswa = {{100,0},{250,1.20}};

       glaswasser.anzahlPersonen = 1;
       glaswasser.zutatenName = glasw;
       glaswasser.zutaten = glaswa;

        System.out.println("Allergisch: " + glaswasser.allergisch("Milch"));
        System.out.println(glaswasser.anzahlPersonen);
        System.out.println(glaswasser.kostet());
        glaswasser.aenderePersonenanzahl(6);
        System.out.println(Arrays.toString(glaswasser.zutaten[0]));
        System.out.println(Arrays.toString(glaswasser.zutaten[1]));
        glaswasser.laktoseFrei();
        System.out.println(Arrays.toString(glaswasser.zutaten[0]));
        System.out.println(Arrays.toString(glaswasser.zutaten[1]));


        Rezept glasSchokomilch = new Rezept();

        String [] glm = {"Glas","Milch","Kakau"};
        double [][] glmi = {{100,0},{250,4.20},{8,1.20}};

        glasSchokomilch.anzahlPersonen = 2;
        glasSchokomilch.zutatenName = glm;
        glasSchokomilch.zutaten = glmi;

        System.out.println("Allergisch: " + glasSchokomilch.allergisch("Milch"));
        System.out.println(glasSchokomilch.anzahlPersonen);
        System.out.println(glasSchokomilch.kostet());
        System.out.println("Rezept für 6 Personen");
        glaswasser.aenderePersonenanzahl(6);
        System.out.println(Arrays.toString(glasSchokomilch.zutaten[0]));
        System.out.println(Arrays.toString(glasSchokomilch.zutaten[1]));
        System.out.println(Arrays.toString(glasSchokomilch.zutaten[2]));
        System.out.println("Laktosefrei:");
        glaswasser.laktoseFrei();
        System.out.println(Arrays.toString(glasSchokomilch.zutaten[0]));
        System.out.println(Arrays.toString(glasSchokomilch.zutaten[1]));
        System.out.println(Arrays.toString(glasSchokomilch.zutaten[2]));
    }
}
