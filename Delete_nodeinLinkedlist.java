import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

class Main {
    Node head;
    
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public void deleteNode(Node nodeToDelete) {
           if(head ==nodeToDelete){
               head=head.next;
               return;
           }
           Node t=head;
           Node p=null;
           while(t!=nodeToDelete){
               p=t;
               t=t.next;
           }
           if(t.next==null){
               p.next=null;
           }
           else{
               p.next=p.next.next;
           }
        
        
        
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main llist = new Main();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
        int x = sc.nextInt();
        Node node = llist.head;
        while (node != null) {
            if (node.data == x)
                break;
            node = node.next;
        }
        llist.deleteNode(node);
        llist.printList(llist.head);
    }
}
