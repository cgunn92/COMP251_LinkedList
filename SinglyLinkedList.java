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

    private Node<T> head, tail;
    private int size = 0;
    public SinglyLinkedList(T data) {
        head = new Node(data);
        tail = head;
        size++;
    }

    public void add(T data) {

        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            tail = head;
            size++;
            return;
        }

        /*Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }*/

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(T data, int index) {

        if(index < 0 || index > size - 1){
            System.out.println("ERROR: INDEX OUT OF RANGE");
            return;
        }

        Node newNode = new Node(data);
        if(index == 0) {
            newNode.next = head;
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

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public String toString() {

        String result = "[";
        Node temp = head;
        while(temp.next != null) {
            result += temp.data + ", ";
            temp = temp.next;
        }

        result += temp.data + "]" + " Size: " + size;
        return result;
    }

    public void removeFirst() {
        if(head != null) {
            head = head.next;
            size--;
        }

        return;
    }
}