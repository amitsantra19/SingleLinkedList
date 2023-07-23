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

    public void insertFirstInLinkedList(int data){
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
        System.out.println("END");
    }
    public void insertLastInLinkedList(int data){
        Node node = new Node(data);
        if(tail == null){
            insertFirstInLinkedList(data);
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertAtGivenPositionLinkedList(int data, int position){
        if (position == 0){
            insertFirstInLinkedList(data);
        }else if (position == size){
            insertLastInLinkedList(data);
        }else{
            Node temp = head;
            for(int i=0; i< position-1;i++){
                temp = temp.next;
            }
            Node node = new Node(data, temp.next);
            temp.next = node;
            size++;
        }
    }
    public int deleteFirstElementFromLinkedList(){
        int firstValue = head.data;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return firstValue;
    }
    public int deleteLastElementFromListList(){
        if(size<=1){
            return deleteFirstElementFromLinkedList();
        }
        int lastElement = tail.data;
        Node temp = head;
        for(int i= 0;i<size-2;i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return lastElement;
    }
    public int deleteElementAtGivenPositionFromLinkList(int position){
        if(position==0){
            return deleteFirstElementFromLinkedList();
        } else if (position==size-1) {
            return deleteLastElementFromListList();
        }
        Node temp = head;
        for(int i=0;i<position-1;i++){
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return  value;
    }

    public int searchElementFromLinkList(int value){
         Node node = head;
         while (node!=null){
             if(node.data == value){
                 return  node.data;
             }else {
                 node = node.next;
             }
         }
         return -1;
    }

    public void reverseLinkedList(){
        Node current = head;
        Node previous = null;
        while(current!=null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
       head = previous;
    }
}
