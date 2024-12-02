/*
The Department of Computer Engineering has a 'Code Club'. Students of second, third and final
year can subscribe to membership. Design a system to maintain club membership information to
add, delete, and modify details of records with ease. Use appropriate data structure.
 */
import java.util.*;

class node {
    int member_id;
    String name,address, position;
    node next ;
    node(int mid, String n, String add, String pos){
        member_id = mid;
        name = n;
        address = add;
        position = pos;
        next = null;
        
    }

}
class code_club{
    node head;
    Scanner sc = new Scanner(System.in);
    code_club(){
        head = null;
    }
    void create(){
        System.out.println("Enter member id: ");
        int mid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter position: ");
        String pos = sc.nextLine();
        System.out.println("Enter address: ");
        String add = sc.nextLine();
        node temp = new node(mid,name,add,pos);
        if(head == null){
             head = temp;
        }
        else{
            node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp = ptr;
        }
    }
    void display(){
        if(head==null){
            System.out.println("No member found");
        }
        else{
            node ptr = head;
            System.out.println("Displaying..");
            while(ptr!=null){
                System.out.println(ptr.name+" "+ptr.address+" "+ptr.member_id+" "+ptr.position);
                ptr = ptr.next;
            }
        }
    }
    void insert(){
            System.out.println("Enter 1. to insert at start\n 2. to insert at in between\n 3. to insert at last: ");
			int c = sc.nextInt();
            int n2;
            switch(c) {
            case 1:
                System.out.println("Enter number of Members you want to add: ");
                n2 = sc.nextInt();
                for(int i=0;i<n2;i++) {
                    insert_At_Start();
                        
                }
                break;
                
            case 2: 
                System.out.println("Enter the position to insert: ");
                int pos = sc.nextInt();
                sc.nextLine();
                    insert_In_between(pos);
                
                break;
            case 3:
                System.out.println("Enter number of Members you want to add: ");
                n2 = sc.nextInt();
                for(int i=0;i<n2;i++) {
                    create();
                }
                break;
            }
        
    }

    void insert_At_Start(){
        System.out.println("Adding Member");
        System.out.println("Enter member id: ");
        int mid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter position: ");
        String pos = sc.nextLine();
        System.out.println("Enter address: ");
        String add = sc.nextLine();
        node temp = new node(mid,name,add,pos);
        if(head==null){
            head=temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    void insert_In_between(pos){
        
    }
}
public class assignment2 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int c;
         code_club cc = new code_club();
         do{
            System.out.println("Enter 1. to create \n 2. to display \n 3. to insert \n 4. to delete \n 5. to update ");
            c = sc.nextInt();
            switch(c){
                case 1:
                System.out.println("Enter total number of members: ");
                int n = sc.nextInt();
                sc.nextLine();
                for(int i=0;i<n;i++){
                    System.out.println("Member: "+(i+1));
                    cc.create();
                }
                break;
                case 2:
                cc.display();
                break;

                case 3:
                cc.insert();
                break;
            }
            System.out.println("Enter 0 to continue: ");
            c = sc.nextInt();
         }while(c==0);

    }
}
