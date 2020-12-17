import java.util.ArrayList;
import java.util.List;

// Java program to implement
// a Singly Linked List

public class LinkedL {
    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedL insert(LinkedL list, int data)
    {
        List<Integer> l=new ArrayList<>();
        l.contains(2);

        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedL list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");
        //System.out.println(currNode.data);

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedL list = new LinkedL();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }

    static Node insertNodeAtHead(Node llist, int data) {
        Node h=new Node(data);
        if(llist==null)llist=h;
        else{
            Node temp=llist;
            llist=h;
            h.next=temp;
        }

        return llist;

    }

    static Node insertNodeAtPosition(Node head, int data, int position) {

        Node n=new Node(data);
        if(head==null)head=n;
        else{
            Node mover=head;
            int count=0;
            while(count!=position-1 && position!=0){
                mover=mover.next;
                count++;
            }
            Node temp=mover.next;
            mover.next=n;
            n.next=temp;

        }


        return head;

    }

    static Node deleteNode(Node head, int position) {
        Node mover=head;
        if(position==0){
            head=head.next;

        }
        else{
            int count=0;
            while(count!=position-1){
                mover=mover.next;
                count++;
            }
            Node temp=mover;
            temp=temp.next.next;
            mover.next=temp;


        }

        return head;

    }

    static void reversePrint(Node head) {

        //Using recursion
        if(head == null)
            ;
        else{
            reversePrint(head.next);
            System.out.println(head.data);
        }
        //Using List
//        List<Integer> l=new ArrayList<>();
//        if(head==null){}
//        else{
//            Node n=head;
//            while(n!=null){
//
//                l.add(n.data);
//                n=n.next;
//            }
//        }
//
//        for(int i=l.size()-1;i>=0;i--){
//
//            System.out.println(l.get(i));
//
//        }

    }


    static Node reverse(Node head) {

        //Using iteration
        Node prev=null;
        Node current=head;
        Node next;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;

        return head;

        //Using recursion
    }





    static boolean compareLists(Node head1, Node head2) {
        //checking if the list are empty
        if(head1==null){return (head2==null)? true:false;}
        else if (head2==null){return (head1==null)? true:false;}

        else{
            //Iterate the lists till next is null
            while(head1.next!=null && head2.next!=null){
                if(head1.data!=head2.data) return false;
                head1=head1.next;
                head2=head2.next;

            }
        }
        //if both list finished them same else not
        if(head1.next==null && head2.next==null)return true;
        else return false;


    }

    static int findMergeNode(Node head1, Node head2) {


        //Add address of each node of list1
        List<Node> l1=new ArrayList<>();

        while(head1!=null){
            l1.add(head1);
            head1=head1.next;
        }
        //Check which first common address is present in the list
        while(head2!=null){
            if(l1.contains(head2))break;
            head2=head2.next;
        }
        return(head2.data);

    }
//
//    static DoublyLinkedListNode reverse(DoublyLinkedListNode node) {
//        // If empty list, return
//        if (node==null) return node;
//
//        // Otherwise, swap the next and prev
//        DoublyLinkedListNode temp = node.next;
//        node.next = node.prev;
//        node.prev = temp;
//
//        // If the prev is now NULL, the list
//        // has been fully reversed
//        if (node.prev==null) return node;
//
//        // Otherwise, keep going
//        return reverse(node.prev);
//
//    }



}