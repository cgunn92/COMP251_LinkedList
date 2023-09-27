class DounlyLinkedList<T> {

    public class Node<T> {

        T data;
        Node<T> next;
        Node<T> previous;

        public Node(T data, Node next, Node previous){
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public Node(T data) {
            this(data, null, null);
        }
    }

    private Node<T> head, tail;
    private int size = 0;

    public DoublyLinkedList(T data) {
        head = tail = newNode(data, null, null);
        size++;
    }

    public void add(T data) {
        
        Node newNode = new Node(data, null, null);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        size++;
    }

    public void add(T data, int index) {

        if(index < 0 || index > size - 1){
            System.out.println("ERROR: INDEX OUT OF RANGE");
            return;
        }

        Node newNode = new Node(data, null, null);
        if(index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            size++;
            return;
        }

        Node temp = head;
        int counter = 0;
        while(counter < index - 1){
            temp = temp.next;
            counter++;
        }

        newNode.previous = temp.previous;
        temp.previous.next = newNode;
        newNode.next = temp;
        temp.previous = newNode;
        size++;
    }

    public String toString() {

        String result = "[";
        Node temp = head;
        while(temp.next != null) {
            result += temp.data + ", ";
            temp = temp.next;
        }

        result += temp.data + "]";
        return result;
    }
}