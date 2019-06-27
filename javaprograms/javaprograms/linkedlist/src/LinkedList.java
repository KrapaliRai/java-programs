class Node{
    Node next;
    Integer data;



    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
public class LinkedList {

Node head;
Node tail;

    public LinkedList(Node nd) {
        this.head = nd;
        this.tail= nd;

    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

public void append(Integer data){
//LinkedList ll= new LinkedList(head);
// head = head.next;
    // Append adds an element at the end of the list.
    // First create a new node with data = new data;
   Node obj = new Node(data);
    //put the old tail node in a temperory variable
    Node oldtail= tail;
    //oldtail ka next ko obj k equal set karna hai.
    oldtail.next = obj;
    //obj ka next ko null set karna hai
    obj.next= null;
    // Link the new node with the tail element.
    // make new node as new tail. tail ki value obj set karna hai.
    tail= obj;

    }
// List print karna hai
    public void printList() {
        // Nodes ke data ko print karna hai,
        //Head se tail tak jana hai ar saare elemnts ko print karana hai.
        //Ek temporary variable banate hai Node type ka. jisko head se start karte hai

        Node current = head;

        //while loop chalega jab tak current ki value null na ho jaye.
        while (current != null) {
            System.out.println(current.data);

            //Current value ko increment karne k liye current.next karege
            current = current.next;


        }
    }
        //Check if node
    public boolean ifNodeExists(Integer data){
                                         // koi node exist kar raha h check karne hai.
        Integer givenNum=data;
        Node current = head;
        while(current!=null){
            if(current.data == givenNum){
                                         //agar mactch hua to return true hona chahiye
                System.out.println("True");
                return true;
            }
                                        //Given node ki value ko existing linkedlist k saare elements se check karege.
            current=current.next;

        }
        System.out.println("False");
                                        //else return false
        return false;


    }


    public void insert2front(Integer givenNum){
    //apne pass ek data hai (givernNum) usko head node set karna hai ar previous head se usko link karna hai
        //abhi apna current head hai.
        Node current= head;
        //givenNum Integer type ka hai usko Node banana hai.

        Node newNode= new Node(givenNum);
        // head ki value ko change karke newNode ki value dena hai
        head= newNode;
        // head ki next value ko current ki value deni hai.
        head.next= current;
        // insert data as  a new node in front of head
    }
    public int lengthOfList(){
        int count=0;
        Node current = head;
        while(current!=null){
            count+=1;
            current = current.next;

        }
        System.out.println("Length of list: "+ count);
        // return length of list
        return count;
    }


    public void deleteElement(Integer givenData){
//   delete the node whose mv data==giveData
        //given node (jiska data hai givenData) ko delete karna hai.

        //delete operation ke liye do nodes important hai current node
        // and previous node.previous ka next current hoga.... ar current ka next third node hoga.

        //step 1: ek previous node banayege jo ki head se initialize hoga.

        Node previous;
        previous = null;

        // step 2: ek current node bayege jo ki humara givendata wala node hoga
        Node current= head;

        while(current!=null){

            //delete karne k liye previous ke next ko current k next se change karna hai
                if (current.data == givenData) {
                    if (current.data == head.data){
//                        checking if we are deleting head
                        head=head.next;
                        return;
                    }
                    else if (current.data == tail.data){
//                        checking if we deleting tail
                        previous.next=null;
                        tail=previous;
                        return;
                    }
                    else {
                        previous.next = current.next;
                        return;
                    }
                }
             previous=current;
            current=current.next;
        }
        System.out.println("Element Doesn't exist in linked list");

    }
    public void printListWithIndex(){
        // Index: Node.data
        // For rg for linkedlist 78->1->5->3
        // 0 : 78
        // 1: 1
        // 2: 5
        // 3: 3
    }
    public void getElementAtIndex(int index){

    }




}






