public class SinglyLinkedList {
    Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.addFront(10);
        s1.addFront(20);
        s1.addFront(30);
        s1.printList();
    }
}