package linkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Linkedlist1 {
    Node head;

    void insertAtThebegining(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    void insertAtTheEnd(int value) {
        if (head == null) {
            insertAtThebegining(value);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(value);
        temp.next = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("linkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
            if (temp == null) {
                System.out.println("null");
            }
        }

    }

    void deleteFromTheBegining() {
        if (head == null) {
            System.out.println("ll is already empty");
            return;
        }

        head = head.next;
    }

    void deleteFromTheEnd() {
        if (head == null) {
            System.out.println("linkedList is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    boolean search(int value) {
        if (head == null) {
            System.out.println("linkedList is empty");
            return false;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void reverse() {
        int firstValue = head.value;
        deleteFromTheBegining();
        Node temp = head;
        while (temp.next != null) {
            insertAtThebegining(temp.value);
            temp = temp.next;
        }
        insertAtTheEnd(firstValue);
    }
}

public class reverseLinkedList {
    public static void main(String[] args) {
        Linkedlist1 ll = new Linkedlist1();
        ll.insertAtThebegining(12);
        ll.insertAtThebegining(13);
        ll.insertAtTheEnd(14);
        ll.insertAtThebegining(16);
        ll.insertAtTheEnd(94);
        ll.display();
        System.out.println("after reverse");
        ll.reverse();
        ll.display();
    }
}
