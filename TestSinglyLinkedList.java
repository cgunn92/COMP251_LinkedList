class TestSinglyLinkedList {
    
    public static void main(String [] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>(4);
        System.out.println(list);
        list.add(45);
        list.add(25);
        list.add(54);
        System.out.println(list);
        list.add(54, -1);
        list.add(55, 4);
        System.out.println(list);
        list.add(44, 2);
        System.out.println(list);
        list.add(34, 2);
        System.out.println(list);

        System.out.println("..........................................");
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<Integer>(1004);
        System.out.println(dList);

        dList.add(25);
        dList.add(55);
        System.out.println(dList);
        dList.add(5);
        dList.add(75);
        System.out.println(dList);
        list.add(34, 2);
        list.add(574, 3);
        System.out.println(dList);
    }
}