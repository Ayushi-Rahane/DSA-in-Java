import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
         this.data=data;
         next = null;
    }
}

class CSLL{
Node head,ptr;

//1. Creating a List: 
void create_list(int data){
    Node temp = new Node(data);
    if(head == null){
        head = temp;
        head.next = head;
    }
    else{
        ptr = head;
        while(ptr.next !=head){
            ptr = ptr.next;
        }
        ptr.next=temp;
        temp.next=head;
        
        
    }
}

//2. Insert at start
void insert_at_start(int data){
Node temp = new Node(data);
if(head==null){
    head = temp;
    head.next=head;
}
else{
    ptr = head;
    while(ptr.next !=head){
        ptr = ptr.next;
    }
    ptr.next = temp;
    temp.next = head;
    head=temp;
}
}

// 3. Insert at End
void insert_at_end(int data){
    Node temp = new Node(data);
    if(head==null){
        head = temp;
        head.next=head;
    }
    else{
        ptr = head;
        while(ptr.next!=head){
            ptr = ptr.next;
        }
        ptr.next = temp;
        temp.next = head;
    }
}
// 4. Delete at start
void delete_at_start(){
    if(head==null){
        System.out.println("List is empty");
    }
    else if(head.next == head){
        head = null;
        System.out.println("Element deleted successfully.");
    }
    else{
        ptr = head;
        while(ptr.next !=head){
            ptr = ptr.next;
        }
        ptr.next = head.next;
        head = head.next;
        System.out.println("Element deleted successfully.");
    }
}

//5. Delete at End
void delete_at_end(){
    if(head==null){
        System.out.println("list is empty.");
    }
    else if(head.next == head){
        head = null;
        System.out.println("Element  deleted successfully..");
    }
    else{
        ptr = head;
        Node prev = head;
        while(ptr.next != head){
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = head;
        ptr.next=null;
        System.out.println("Element  deleted successfully..");
    }
}
//6. Display the list
void display_list(){
    
    if(head==null){
        System.out.println("List is empty");
    }
    else{
        System.out.println("Displaying list: ");
        ptr = head;
        do{
            System.out.println(ptr.data);
            ptr = ptr.next;
        }while(ptr!=head);
    }
}
}
public class CSLL_Operation {
    public static void main(String[] args){
         CSLL l = new CSLL();
         Scanner sc = new Scanner(System.in);
         int c,n;
         do{
         System.out.println("Enter 1. to create linked list\n 2. to insert at first\n 3. to insert at end\n 4. to delete at start\n 5. to delete at end:\n 6. to display list: ");
         c = sc.nextInt();
         switch(c){
            case 1:
               System.out.println("Enter number of elements: ");
               n = sc.nextInt();
               for(int i=0;i<n;i++){
                     System.out.println("Enter Element: ");
                     int data = sc.nextInt();
                     l.create_list(data);
               }
               break;
            case 2:
                System.out.println("Enter number of elements: ");
                n = sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("Enter element: ");
                    int data = sc.nextInt();
                    l.insert_at_start(data) ;
                }
               break;
            case 3:
               System.out.println("Enter number of elements: ");
               n = sc.nextInt();
               for(int i=0;i<n;i++){
                   System.out.println("Enter element: ");
                   int data = sc.nextInt();
                   l.insert_at_end(data) ;
               }
              break;
            case 4:
               l.delete_at_start();
               break;
            
            case 5:
               l.delete_at_end();
               break;
            case 6:
               l.display_list();
               break;
         }
         System.out.println("Enter 1 to continue: ");
         c = sc.nextInt();
         }while(c==1);
    }
}
