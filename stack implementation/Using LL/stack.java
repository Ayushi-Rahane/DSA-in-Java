import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next  = null;
    }
}

class LL{
   node top=null;
   void push(int data){
   node temp = new node(data);
    if(top==null){
       top = temp;       
   }
   else{
    temp.next =top;
    top=temp;
    System.out.println(top.data+" is pushed into the stack");
   }
   }

   void pop(){
         if(top==null){
            System.out.println("Stack is empty");
         }
         else{
            System.out.println(top.data+" is poped");
            top=top.next;
         }
   }

   void display(){
    if(top==null){
        System.out.println("Stack is empty");
    }
    else{
        node ptr=top;
        System.out.println("Displaying");
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
   }

}
public class stack {
    public static void main(String[] args){
        LL st = new LL();
        Scanner sc = new Scanner(System.in);
        int c;
        do{
            System.out.println("Enter Choice: \n 1. To push \n 2. to pop \n 3. to display: ");
            c = sc.nextInt();
        switch(c){
            case 1:
              System.out.println("Enter number to push: ");
              st.push(sc.nextInt());
              break;
            
            case 2:
             st.pop();
              break;


            case 3:
              st.display();
              break;

        }
        System.out.println("Enter 0 to continue: ");
        c = sc.nextInt();
    }while(c==0);
    }
}
