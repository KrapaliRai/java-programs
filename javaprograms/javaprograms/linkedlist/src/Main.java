

public class Main {

    public static void main(String[] args) {
       //Linkedlist class the object banyege.
        //5 nodes add kareyege and unko print karayege,

        Node x= new Node(1);
        LinkedList ll= new LinkedList(x);
        ll.append(5);
        ll.append(3);
        ll.append(8);
        ll.append(9);
        ll.append(7);
        ll.append(4);
        //ll.printList();
        ll.ifNodeExists(34);
        ll.insert2front(78);
        ll.printList();
        ll.lengthOfList();
        System.out.println("Delete something in middle");
        ll.deleteElement(3);
        ll.printList();
        System.out.println("Delete head");
        ll.deleteElement(78);
        ll.printList();
        System.out.println("Delete tail");
        ll.deleteElement(4);
        ll.printList();
        System.out.println("Delete element which doesn't exist");
        ll.deleteElement(34);
        ll.printList();
    }

}
