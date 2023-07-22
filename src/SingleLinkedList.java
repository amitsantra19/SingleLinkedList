public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
        this.size = 0;
    }
    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirstInList(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void printLinkList(){
        Node node = head;
        while (node!=null){
            System.out.print(node.data+ " -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public void insertLastInList(int data){
        Node node = new Node(data);
        if(tail == null){
            insertFirstInList(data);
        }
        tail.next = node;
        tail = node;
        size++;
    }

}
