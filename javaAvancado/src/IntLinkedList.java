public class IntLinkedList {

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // push – add at end – O(1)
    public void push(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // pop – remove from end – O(n) for singly linked list
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        if (head == tail) {
            int value = head.value;
            head = null;
            tail = null;
            size = 0;
            return value;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        int value = tail.value;
        tail = current;
        tail.next = null;
        size--;
        return value;
    }

    // insert at index – O(n)
    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            push(value);
            return;
        }
        Node node = new Node(value);
        if (index == 0) {
            node.next = head;
            head = node;
            if (tail == null) {
                tail = node;
            }
        } else {
            Node prev = getNode(index - 1);
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    // remove at index – O(n)
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            int value = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return value;
        }
        Node prev = getNode(index - 1);
        Node toRemove = prev.next;
        prev.next = toRemove.next;
        if (toRemove == tail) {
            tail = prev;
        }
        size--;
        return toRemove.value;
    }

    // elementAt – O(n)
    public int elementAt(int index) {
        return getNode(index).value;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // printList – O(n)
    public String printList() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
