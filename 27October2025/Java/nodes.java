public class Node {
    public String data; //payload stored in the node
    public Node next;  //Reference to the next node
    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public class LinkedList {
        public Node head;
        public LinkedList() {
            this.head = null;
        }

        public addElement(String data) {
            Node new_node = new Node(data);
            new_node.next = this.head;
            this.head = new_node;
        }
    }

    public int listlength; {
        //μετρητής
        int counter = 0;
        Node current = this.head;

        while (current !=null) {
            counter++;
            current = current.next;
        }
        return counter;
    }
}