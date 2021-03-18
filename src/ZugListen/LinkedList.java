package ZugListen;

public class LinkedList {
    Node first;     //erster Waggon, Head, Start
    Node last;      //letzter Waggon, Tail, Ende


    //weitere 'Ware' am Zug ablegen
    public void add(int value) {
        Node neueWaggon = new Node();
        neueWaggon.value = value;

        last.next = neueWaggon; //Waggon hinten anhängen
        last = neueWaggon;
    }


}
