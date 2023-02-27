package Collections;
import java.util.HashSet;

public class LinkedListNode {
    public int data;
    public LinkedListNode next;
    
    public LinkedListNode(int data) {
        this.data = data;
    }
}

 class Linked_List {
    public LinkedListNode head;
    
    public void append(int data) {
        if (head == null) {
            head = new LinkedListNode(data);
            return;
        }
        
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedListNode(data);
    }
    
    public static Linked_List findCommonElements(Linked_List listOne, Linked_List listTwo) {
        HashSet<Integer> set = new HashSet<Integer>();
        Linked_List result = new Linked_List();
        
        LinkedListNode current = listOne.head;
        while (current != null) {
            set.add(current.data);
            current = current.next;
        }
        
        current = listTwo.head;
        while (current != null) {
            if (set.contains(current.data)) {
                result.append(current.data);
            }
            current = current.next;
        }
        
        return result;
    }
}