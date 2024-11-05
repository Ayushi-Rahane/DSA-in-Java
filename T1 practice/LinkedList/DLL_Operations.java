import java.util.*;

class node{
    int data;
    node next,prev;
    node(int d){
        data = d;
        next = prev = null;
    }
}

class DLL{
    node head;
    DLL(){
        head=null;
    }
    //insert at end
    void create(int data){
        node temp = new node(data);
        if(head==null){
            head=temp;
        }
        else{
            node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            temp.prev = ptr;
            ptr.next = temp;
        }
    }
   // insert at start
   void insert_At_start(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Element: ");
    int data = sc.nextInt();
    sc.nextLine();
    node temp = new node(data);
    if(head == null){
        head = temp;
    }
    else{
      temp.next = head;
      head.prev = temp;
      head = temp;
      
    }
   }
    
   //insert in between
   void insert_in_between(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Element: ");
    int data = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter position to insert: ");
    int pos = sc.nextInt();
    sc.nextLine();
    node temp = new node(data);
    if(head==null){
        head=temp;
    }
    else{
        node ptr = head;
        int k=1;
        while(k<pos-1 && ptr.next !=null){
            k++;
            ptr = ptr.next;
        }
        temp.prev = ptr;
        temp.next = ptr.next;
        ptr.next.prev = temp;
        ptr.next = temp;

    }

   }

   //insert at end 
   void insert_At_end(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Element: ");
    int data = sc.nextInt();
    sc.nextLine();
    node temp = new node(data);
    create(data);
   }
    void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            node ptr = head;
            while(ptr!=null){
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
}
public class DLL_Operations {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c;
    DLL l = new DLL();
    do{
        System.out.println("Enter 1. to create a list\n 2. to insert at start\n 3. to insert in between\n 4. insert at end\n 5. delete at start\n 6. delete in between\n 7. delete at end\n 8. to display: ");
        c = sc.nextInt();
        sc.nextLine();
        switch(c){
            case 1:
            System.out.println("Enter the size: ");
            int size = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<size;i++){
                System.out.println("Enter Element no: "+(i+1));
                int data = sc.nextInt();
                sc.nextLine();
                l.create(data);
            }
            break;
            case 2:
              l.insert_At_start();
            break;
            case 3:
              l.insert_in_between();
            break;
            case 4:
              l.insert_At_end();
            break;
            
            case 8:
            System.out.println("Displaying.....");
            l.display();
            break;

               
        }
        System.out.println("Enter 0 to continue: ");
        c = sc.nextInt();
        sc.nextLine();
    }while(c==0);
   }
}
