package ZugListen;

public class LinkedList {
    Node first;     //erster Waggon, Head, Start
    Node last;      //letzter Waggon, Tail, Ende


    //weitere 'Ware' am Zug ablegen
    public void add(int value) {
        Node neueWaggon = new Node();
        neueWaggon.value = value;

        if (first == null) {
            first = neueWaggon;
            last = neueWaggon;
        } else {
            last.next = neueWaggon; //Waggon hinten anhängen
            last = neueWaggon;
        }
    }

    //Zeigen was im Zug ist
    public void printAllNodes() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    //suche -> return index if on Train
    //if NOT on Train returns -1
    public int containsValue(int value) {
        Node current = first;
        int index = 1;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    //zeigen was an welcher Stelle ist
    public Node getAt(int position) {
        Node current = first;
        int index = 1;
        while (current != null) {
            if (position == index) {
                return current;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    //delete an Position zB. 3
    public void deleteAt(int position) {
        //zuerst den Waggon davor mit dem übernächsten Waggon verknüpfen,
        Node current = first;
        int index = 1;
        position = position - 1;
        if (position == 0) {
            first = first.next;
            current.next = null;
        }
        else{
            while (current != null) {
                if (position == index) {
                    //current.next = current.next.next;
                    Node deleteNode = current.next;
                    current.next = deleteNode.next;

                    deleteNode.next = null;
                    if (deleteNode == last) {
                        last = current;
                    }
                    break;
                }
                current = current.next;
                index++;
            }
        }

    }

    //einfügen an bestimmter Stelle
    //changeValue

}
