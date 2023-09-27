class SinglyLinkedList<T> {

    public class Node<T> {

        T data;
        Node<T> next;
        public Node (T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node (T data) {
            this(data, null);
        }
    }

    private Node<T> head;
    private int size = 0;
    public SinglyLinkedList( T data) {
        head = new Node(data);
        size++;
    }

    public void add(T data) {

        Node newNode = new Node (data);
        if(head.next == null){
            head.next = newNode;
            size++;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }
}