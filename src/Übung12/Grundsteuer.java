package Übung12;

public class Grundsteuer {

    // double [][] : [GrundstückNr][Typ, länge, breite]


    public double grundsteuerBerechnen (int [][] grund){
        double summe = 0;
        double [] steuerTyp = {3.2,2.1,0.9};

        for (int[] ints : grund) {
            //for (int i = 0; i < grund.length; i++) {
            summe += steuerTyp[ints[0] - 1] * ints[1] * ints[2];
            // summe += steuerTyp[grund[i][0] - 1] * grund[i][1] * grund[i][2];
        }
        return summe;
    }



    public double [] grundsteuerZuordnen(int [][]grund, int []besitzer){
        double []erg = new double[5];
        double [] prices = {3.2, 2.1, 0.9};

        for(int i = 0; i < grund.length; ++i){
            erg[besitzer[i]] += prices[grund[i][0] - 1] * grund[i][1] * grund[i][2];
        }

        return erg;
    }
}
