package Übung12;

import java.util.Arrays;

public class GrundsteuerApp {

    public static void main(String[] args) {

        Grundsteuer steuerMoni = new Grundsteuer();

        int [][]moni = {{1,5,5},{2,20,20},{3,30,30}};
        int [] besitzer = {2,4,0};

        System.out.println(steuerMoni.grundsteuerBerechnen(moni));
        System.out.println();
        System.out.println(Arrays.toString(steuerMoni.grundsteuerZuordnen(moni,besitzer)));
    }
}
