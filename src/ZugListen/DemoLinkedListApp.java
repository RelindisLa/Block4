package ZugListen;

public class DemoLinkedListApp {

    public static void main(String[] args) {

        Node wagon1 = new Node();
        wagon1.value = 3;
        Node wagon2 = new Node();
        wagon2.value = 7;

        wagon1.next = wagon2;

        System.out.println("wagon1.value = " + wagon1.value);
        System.out.println("wagon2.value = " + wagon2.value);
        System.out.println("wagon1.next = " + wagon1.next);
        System.out.println("wagon1.next.value = " + wagon1.next.value);
        System.out.println("wagon2.next = " + wagon2.next);
        System.out.println("wagon1 = " + wagon1);
        System.out.println("wagon2 = " + wagon2);

        //System.out.println("wagon2.next.value = " + wagon2.next.value);

        LinkedList linkedList = new LinkedList();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        linkedList.add(25);
        linkedList.add(30);

        linkedList.printAllNodes();
        System.out.println();
        System.out.println("Yes, is on Waggon Nr: " + linkedList.containsValue(2));
        System.out.println(linkedList.containsValue(287));

        //Node an Position ausgeben
        System.out.println(linkedList.getAt(3).value);
        System.out.println(linkedList.getAt(5).value);
        System.out.println(linkedList.getAt(3));

        System.out.println();
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(3);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(1);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(4);
        linkedList.printAllNodes();
        System.out.println();
        System.out.println(linkedList.getAt(3).value);
        linkedList.add(5);
        linkedList.printAllNodes();

    }
}
