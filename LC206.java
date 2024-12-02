// given the head of a linked list, reverse it and return that reversed list 

public class LC206 {
	public static void main(String[] args) {
		Linked linkedClass = new Linked () ;
		linkedClass.add (5) ;
		linkedClass.add (4) ;
		linkedClass.add (3) ;
		linkedClass.add (2) ;
		linkedClass.add (1) ;
		linkedClass.display () ;
		linkedClass.reverse () ;
	}
}

class Node {
    int data ;
    Node next ;
    
    Node (int data) {
        this.data = data ;
        this.next = null ;
    }
}

class Linked {
    private Node head ;
    
    public Linked () {
        this.head = null ;
    }
    
    public void add (int data) {
        Node newNode = new Node (data) ;
        if (head == null) {
            head = newNode ;
        } else {
            newNode.next = head ;
            head = newNode ;
        }
    }
    
    public void reverse () {
        Node prev = null ;
        Node current = head ;
        
        while (current != null) {
            Node next = current.next ;
            current.next = prev ;
            prev = current ;
            current = next ;
        }
        
        System.out.println("Reversed Linked: ") ;
        while (prev != null) {
            System.out.print(prev.data + " -> ") ;
            prev = prev.next ;
        }
        System.out.println("null") ;
    }
    
    public void display () {
        Node current = head ;
        System.out.println("Original Linked: ") ;
        while (current != null) {
            System.out.print(current.data + " -> ") ;
            current = current.next ;
        }
        System.out.println("null") ;
    }
}
