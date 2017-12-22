public class SinglyLinkedList {
    public static void main(String [] args)
    {
        LinkedList ll=new LinkedList();
        System.out.println("===============Inserting at the first position===================");
        ll.insertFirst(10);
        ll.insertFirst(90);
        ll.insertFirst(80);
        ll.displayLinkedList();
        /*
        System.out.println("===============Inserting at the last position===================");
        ll.insertLast(5);
        ll.displayLinkedList();
        System.out.println("===============Inserting in between =============================");
        ll.insertInBetween(7, 3);
        ll.displayLinkedList();
        System.out.println("===============Deleting element at first position =============================");
        ll.deleteFirst();
        ll.displayLinkedList();


        System.out.println("===============Deleting element at last position =============================");
        ll.deleteLast();
        ll.displayLinkedList();*/

        System.out.println("===============Deleting element in between=============================");
        ll.deleteInBetween(1);
        ll.displayLinkedList();
        }
}
