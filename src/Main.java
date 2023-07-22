public class Main {
    public static void main(String[] args) {
       SingleLinkedList sl = new SingleLinkedList();
        System.out.println("Link List shown as below");
       sl.insertFirstInLinkedList(5);
       sl.insertFirstInLinkedList(10);
       sl.insertFirstInLinkedList(14);
       sl.insertLastInLinkedList(20);
       sl.insertLastInLinkedList(33);
       sl.insertLastInLinkedList(25);
       sl.insertAtGivenPositionLinkedList(50,3);
       sl.printLinkList();
       System.out.println("After Deleting First Element from List");
       int first = sl.deleteFirstElementFromLinkedList();
       sl.printLinkList();
       System.out.println("After Deleting Last Element from List");
       int last = sl.deleteLastElementFromListList();
       sl.printLinkList();
       System.out.println("After Deleting third Element from List");
       int any = sl.deleteElementAtGivenPositionFromLinkList(3);
       sl.printLinkList();
       System.out.println("Search Element In LinkedList");
       int search = sl.searchElementFromLinkList(33);
       System.out.println("Element Found :"+ search);
    }
}