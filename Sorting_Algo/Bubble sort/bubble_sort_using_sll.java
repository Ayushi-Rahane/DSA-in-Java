class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class Solution{
    void sort(Node head){
        Node ptr = head;
        int temp;
        boolean swapped;

        do{
            swapped = false;
            ptr = head;
            while(ptr.next != null){
                if(ptr.data > ptr.next.data){
                      temp = ptr.data;
                      ptr.data = ptr.next.data;
                      ptr.next.data = temp;
                      swapped = true;
                }
                ptr = ptr.next;

            }
        }while(swapped);
        
       
       
    }
    void display(Node head){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }

    }
}
public class bubble_sort_using_sll {
     public static void main(String[] args)   {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(8);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);

        Solution s = new Solution();
        s.display(head);
        s.sort(head);
        System.out.println("Sorting::");
        s.display(head);
     }
}
