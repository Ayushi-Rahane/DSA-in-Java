import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
//1. creating a Node
    Node(int data){
        this.data=data;
        next = prev=null;
    }
}
class DLL{
    Node head,ptr;
//2. Creating a List
    void create_list(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
        }
        else{
            ptr = head;
            while(ptr.next !=null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.prev = ptr;
        }
    }

    //2. Insert At Start Operation
    void insert_at_start(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }
    void display_list(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            ptr = head;
            while(ptr!=null){
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
}
public class DLL_Operation {
    
    public static void main(String[] args){
   DLL l = new DLL();
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
                //    l.insert_at_end(data) ;
               }
              break;
            case 4:
            //    l.delete_at_start();
               break;
            
            case 5:
            //    l.delete_at_end();
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
