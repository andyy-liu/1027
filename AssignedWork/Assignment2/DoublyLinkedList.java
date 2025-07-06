public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // adds a new node with the given value to the END of the doubly linked list
    // if list is empthy, new node becomes both the head and the tail
    // else, new node is linked as the next node of the current tail, and the tail
    // is updated to the new node
    public void add(int value) {
        Node newNode = new Node(value);

        // if list is empty, set head and tail to the new node
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node currentNode = head;
        // traverse to the end of the list
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        // link the new node to the end of the list
        currentNode.next = newNode;
        newNode.prev = currentNode;
        tail = newNode;
    }

    // removes the first node in the list that contains the specified value
    // searches for the node, updates the links of neighboring nodes, and adjusts
    // the head or tail if necessary
    // return true if node was found and removed, otherwise false
    public boolean remove(int value) {
        // if list is empty, return false
        if (head == null && tail == null) {
            return false;
        }

        Node currentNode = tail;

        // if node to be removed is the tail
        if (currentNode.value == value) {
            // special case: list with only one element
            if (head == tail) {
                head = null;
                tail = null;
                return true;
            }
            tail = currentNode.prev;
            tail.next = null;
            return true;
        }

        // traverse the list backwards to find the node with the specified value
        // start from the tail and move to the previous nodes
        while (currentNode != null && currentNode.value != value) {
            currentNode = currentNode.prev;
        }

        // if node with the specified value was not found, return false
        if (currentNode == null) {
            return false;
        }

        // if node to be removed is the head
        if (currentNode.prev == null) {
            head = currentNode.next;
            head.prev = null;
            return true;
        }

        // if node to be removed is in the middle of the list
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        return true;

    }

    // reverses order of the nodes in the list
    // iterates through the list, swapping next and previous pointers of each node
    // after reversal, updates head to the new first node
    public void reverse() {
        // empty list or single node
        if (head == null || head == tail) {
            return;
        }

        Node currentNode = head;
        Node temp = null;

        // swap next and prev pointers for all nodes
        while (currentNode != null) {
            // swap next and prev pointers
            temp = currentNode.prev;

            // swap the pointers
            currentNode.prev = currentNode.next;
            currentNode.next = temp;

            // move to the next node in the original order
            currentNode = currentNode.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    // prints all values from head to tail
    // prints value of each node followed by a space and ends with a new line
    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // deletes the entire list by setting both the head and tail pointers to null
    public void deleteList() {
        head = null;
        tail = null;

    }

    // appends value of all nodes to the sb object
    // iterates through the list, appending each value followed by a space
    public void printToString(StringBuilder sb) {
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
    }

}
