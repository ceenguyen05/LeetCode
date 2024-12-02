class Node {
    int data ;
    Node next ;
    Node prev ;

    Node (int data) {
        this.data = data ;
        this.next = null ;
        this.prev = null ;
    }
}

class MyLinkedList {
    Node head ;
    Node tail ;
    int size ;

    public MyLinkedList() {
        this.head = null ;
        this.tail = null ;
        this.size = 0 ;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1 ;
        }

        Node current = head ;
        for (int count = 0 ; count < index ; count++) {
            current = current.next ;
        }
        return current.data ;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node (val) ;
        if (head == null) {
            head = tail = newNode ;
        } else {
            newNode.next = head ;
            head.prev = newNode ;
            head = newNode ;
        }
        size++ ;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node (val) ;
        if (head == null) {
            head = tail = newNode ;
        } else {
            tail.next = newNode ;
            newNode.prev = tail ;
            tail = newNode ;
        }
        size++ ;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return ;
        }
        if (index == 0) {
            addAtHead (val) ;
            return ;
        }
        if (index == size) {
            addAtTail (val) ;
            return ;
        }
        Node newNode = new Node (val) ;
        Node current = head ;
        for (int count = 0 ; count < index - 1 ; count++) {
            current = current.next ;
        }
        newNode.prev = current ;
        newNode.next = current.next ;
        if (current.next != null) {
            current.next.prev = newNode ;
        }
        current.next = newNode ;
        size++ ;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return ;
        }

        if (index == 0) {
            Node removed = head ;
            head = head.next ;
            if (head !=null) {
                head.prev = null ;
            }
            removed.next = null ;
            size-- ;
            return ;
        }

        if (index == size - 1) {
            Node removed = tail ;
            tail = tail.prev ;
            if (tail != null) {
                tail.next = null ;
            }
            removed.prev = null ;
            size-- ;
            return ;
        }

        Node current = head ;
        for (int count = 0 ; count < index ; count++) {
            current = current.next ;
        }
        Node removed = current;
        current.prev.next = current.next ;
        current.next.prev = current.prev ;
        removed.prev = null ;
        removed.next = null ;
        size-- ;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
