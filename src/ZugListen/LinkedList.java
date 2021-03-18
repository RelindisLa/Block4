package ZugListen;

public class LinkedList {
    Node first;     //erster Waggon, Head, Start
    Node last;      //letzter Waggon, Tail, Ende


    //weitere 'Ware' am Zug ablegen
    public void add(int value) {
        Node neueWaggon = new Node();
        neueWaggon.value = value;

        if (first == null){
            first = neueWaggon;
            last = neueWaggon;
        }
        else {
            last.next = neueWaggon; //Waggon hinten anhängen
            last = neueWaggon;
        }
    }

    public void printAllNodes () {
        Node current = first;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

}
