package Übung12;

import Übung13.Rezept;

import javax.sound.midi.Soundbank;

public class RechteckApp {

    public static void main(String[] args) {

        Rechteck a = new Rechteck();
        a.breite = 3;
        a.laenge = 4;


        System.out.println("Rechteck A: " + a.laenge + " x " + a.breite + " hat eine Fläche von " + a.flaeche(a.laenge,a.breite));
        System.out.println("wenn mit Faktor 3 skaliert, ergeben sich folgende Werte:");
        System.out.println("Länge: " + a.skaliere(a.laenge) + " Breite: " + a.skaliere(a.breite) + " daraus die Fläche beträgt: " + a.flaeche(a.laenge,a.breite));
    }
}
