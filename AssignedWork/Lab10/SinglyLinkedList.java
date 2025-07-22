public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void shiftRight() {
        if (head == null || head.next == null) {
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        Node lastNode = secondLast.next;
        secondLast.next = null;

        lastNode.next = head;
        head = lastNode;
    }

    public void shiftLeft() {
        if (head == null || head.next == null) {
            return;
        }
        Node oldHead = head;
        head = head.next;
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        oldHead.next = null;
        lastNode.next = oldHead;
    }
}
