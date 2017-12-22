/*public class LinkedList {
    private Node start;
    private Node end;
    public int size;

    public LinkedList()
    {
        start=null;
        end = null;
        size= 0;
    }
    public boolean isEmpty()
    {
        return start == null;
    }

    public int getSize()
    {
        return size;
    }
    public void insertAtStart(int value)
    {
        Node node=new Node(value, null);

    }
}


*/

public class LinkedList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int data) {
        Node myNode = new Node(data);
        myNode.setNext(head);
        head = myNode;
    }

    public void insertLast(int data){
        Node myNode= new Node(data); // creating a new Node
        Node currentNode=head;    //Creating a new reference of type Node
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(myNode);
    }

    public void insertInBetween(int data, int position)
    {
        Node myNode=new Node(data);
        Node currentNode=head;
        int count=1;
        while(count == position-1) {
            currentNode = currentNode.getNext();
            count++;
        }
        //System.out.println(currentNode.getData());
        myNode.setNext(currentNode.getNext());
        currentNode.setNext(myNode);
    }

    public void deleteFirst()
    {
        Node currentNode = head;
        if(currentNode != null) {
            head = currentNode.getNext();
        }
    }


    public void deleteLast()
    {
        Node currentNode=head;
        if (head == null) {
            return;
        }

        if(currentNode.getNext() == null) {
            head=null;
        }
        else {
            currentNode=currentNode.getNext();
            currentNode.setNext(null);
        }
    }



    public void deleteInBetween(int position)
    {

        Node currentNode=head;
        int count=1;
        if (position == 1) {
            deleteFirst();
        } else {
            while(count < position-1) {
                currentNode = currentNode.getNext();
                count++;
            }
        }
        Node pointToNode = currentNode.getNext().getNext();
        currentNode.setNext(pointToNode);
    }

    public void displayLinkedList() {
        Node currentNode = head; // Assign head to currentNode
        while(currentNode != null) { // Traverse LL till currentNode becomes null.
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
        }
    }
}
