package linkedList;

public class LinkedList {
    Node head;
    
    public void insert(String data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void insertAt(int index, String data){
        Node node = new Node();
        node.data = data;
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;            
        }
        node.next = n.next;
        n.next = node;
    }
    
    public void show(){
        Node n = head;
        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
    
    public void insertAtStart(String data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    
    public void middleElement(){
        Node middle = head;
        Node fast = head;
        int length = 0;
        while(fast.next != null){
            fast = fast.next;
            if(length % 2 == 0){
                middle = middle.next;
            }
            length++;
        }
        System.out.println("Middle: " + middle.data);
        System.out.println("Fast: " + fast.data);
    }
    
    public void thirdToLast(){
        Node slow = head;
        Node fast = head;
        while(fast.next != null){
            fast = fast.next;
            if(slow.next.next.next != null){
                slow = slow.next;
            }
        }
        System.out.println("Slow: " + slow.data);
        System.out.println("Fast: " + fast.data);
    }
}
