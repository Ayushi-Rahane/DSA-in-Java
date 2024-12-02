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

    void insert_In_between(int pos){
        System.out.println("Adding Member");
        System.out.println("Enter member id: ");
        int mid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter position: ");
        String position = sc.nextLine();
        System.out.println("Enter address: ");
        String add = sc.nextLine();
        node temp = new node(mid,name,add,position);
        if(head==null){
            head = temp;
        }
        else{
            node ptr = head;
            int k=1;
            while(k<pos-1 && ptr.next!=null){
                k++;
                ptr = ptr.next;
            }
            temp.next = ptr.next;
            ptr.next = temp;
        }
    }

    void delete(){
        System.out.println("Enter 1. to delete at start\n 2. to delete at in between\n 3. to delete at last: ");
			int c = sc.nextInt();
        switch(c) {
            case 1:
                delete_at_start();
                break;
            case 2:
                System.out.println("Enter the position of element you want to delete: ");
                int pos = sc.nextInt();
                delete_in_between(pos);
                break;
            case 3:
                delete_at_end();
                break;
                
            }
    }

    void delete_at_start(){
        if(head==null){
            System.out.println("Deleted Successfully");
        }
        else if(head.next==null){
            head=null;
            System.out.println("Deleted successfully...");
        }
        else{
            head=head.next;
            System.out.println("Deleted successfully...");
        }
    }
    void delete_in_between(int pos){
        if(head==null){
            System.out.println("Deleted Successfully");
        }
        else if(head.next==null){
            head=null;
            System.out.println("Deleted Successfully");
        }
        else{
            node ptr=head;
            int k=1;
            while(k<pos-1 && ptr.next!=null){
                ptr = ptr.next;
                k++;
            }
            if(ptr.next==null || ptr.next.next==null){
                System.out.println("Position out of bound..");
                return ;
            }
            ptr.next = ptr.next.next;
            System.out.println("Deleted successfully..");
        }
    }

    void delete_at_end(){
        if(head==null){
            System.out.println("Deleted successfully.");
        }
        else if(head.next==null){
            head=null;
            System.out.println("Deleted successfully.");
        }

        else{
            node ptr = head;
            node prev=head;
            while(ptr.next!=null){
                prev=ptr;
                ptr = ptr.next;
                
            }
            prev.next=null;
            System.out.println("Deleted successfully...");
        }
    }

    void update(){
        System.out.println("Enter member id: ");
        int mid = sc.nextInt();
        sc.nextLine();
        int flag=1;
        node ptr = head;
        while(ptr!=null){
            if(ptr.member_id==mid){
                System.out.println("Enter new positiion");
                ptr.position = sc.nextLine();
                System.out.println("Updated successfully.");
                flag=0;
                break;
            }
            ptr=ptr.next;
        }
        if(flag==1){
            System.out.println("Memeber not found");
        }
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

                case 4:
                cc.delete();
                break;

                case 5:
                cc.update();
                break;
            }
            System.out.println("Enter 0 to continue: ");
            c = sc.nextInt();
         }while(c==0);

    }
}
