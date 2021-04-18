package Übung12;

public class Rechteck {
    double laenge;
    double breite;

    public double flaeche (double laenge, double breite){
        return laenge * breite;
    }

    public double skaliere (double parameter){
        if (laenge >= 0){
            return laenge *= parameter;
        }
        else return breite *= parameter;

    }
}
