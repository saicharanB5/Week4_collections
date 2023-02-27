package Collections;


public class LinkedListNode_Tester {
    public static void main(String[] args) {
        // Test case 1
        Linked_List listOne = new Linked_List();
        listOne.append(10);
        listOne.append(12);
        listOne.append(21);
        listOne.append(1);
        listOne.append(53);
        
        Linked_List listTwo = new Linked_List();
        listTwo.append(11);
        listTwo.append(21);
        listTwo.append(25);
        listTwo.append(53);
        listTwo.append(47);
        
        Linked_List result = Linked_List.findCommonElements(listOne, listTwo);
        LinkedListNode current = result.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
        
        // Test case 2
        listOne = new Linked_List();
        listOne.append(51);
        listOne.append(45);
        listOne.append(63);
        listOne.append(15);
        listOne.append(82);
        
        listTwo = new Linked_List();
        listTwo.append(19);
        listTwo.append(63);
        listTwo.append(51);
        listTwo.append(87);
        listTwo.append(82);
        
        result = Linked_List.findCommonElements(listOne, listTwo);
        current = result.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("");
    }
}