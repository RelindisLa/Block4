package Rekursion;

public class ReduseBottlesOfRum {

    public static void main(String[] args) {

        reduce (9,-5);
        reduce2 (10, 4);



    }

    public static void reduce(int value, int stopValue){
        System.out.println(value);
        if (value == 0 || value == stopValue){
            return;
        }
        reduce(value-1, stopValue);
    }

    public static void reduce2(int value, int stopValue){
        System.out.println(value);
        value--;
        if (value != stopValue){
            value--;
        }
    }
}
