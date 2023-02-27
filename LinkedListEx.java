package Collections;

public class LinkedListEx {
    public int data;
    public LinkedListEx next;

    public LinkedListEx(int data) {
        this.data = data;
        this.next = null;
    }
}

 class LinkedList {
    private LinkedListEx head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedListEx getHead() {
        return head;
    }

    public void setHead(LinkedListEx head) {
        this.head = head;
    }

    public void insert(int data) {
        LinkedListEx newNode = new LinkedListEx(data);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListEx currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        LinkedListEx currentNode = head;
        while (currentNode != null) {
            LinkedListEx runnerNode = currentNode;
            while (runnerNode.next != null) {
                if (runnerNode.next.data == currentNode.data) {
                    runnerNode.next = runnerNode.next.next;
                } else {
                    runnerNode = runnerNode.next;
                }
            }
            currentNode = currentNode.next;
        }
    }

    public void printList() {
        LinkedListEx currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("");
    }
}