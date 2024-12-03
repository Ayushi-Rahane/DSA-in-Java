import java.util.*;

//USING ARRAY: linear queue
/*
class Queue{
   int rear,front,size;
   int[] queue;
   Scanner sc = new Scanner(System.in);
   Queue(int size){
    this.size = size;
    rear=front=-1;
    queue = new int[size];
   }
   boolean isempty(){
    if(rear==-1 || front>rear){
        return true;
    }
    return false;
   }
   boolean isfull(){
     if(rear==size-1){
        return true;
     }
     return false;
   }
   void enqueue(){
    System.out.println("Enter the data");
    int data = sc.nextInt();
    if(isfull()){
        System.out.println("Queue is full");
    }
    else{
        if(rear==-1){
            front=0;
        }
        queue[++rear]=data;
        System.out.println("Data added successfully..");
    }
   }

   void dequeue(){
    if(isempty()){
        System.out.println("Queue is Empty");
    }
    else{
        System.out.println(queue[front++]+"data deleted");
    }
   }

   void display(){
    if(isempty()){
        System.out.println("Queue is empty");
    }
    else{
        System.out.println("Displaying...");
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }
   }
}
public class dequeue_enqueue{
   public static void main(String[] args){
    Queue q = new Queue(10);

    Scanner sc = new Scanner(System.in);
    int c;
    do{
        System.out.println("Enter 1. to dequeue \n 2. to enqueue \n 3. to display: ");
        c = sc.nextInt();
        switch(c){
           case 1:
             q.dequeue();
             break;
            case 2:
              q.enqueue();
              break;
            case 3:
              q.display();
               break;
              
        }
        System.out.println("Enter 1 to continue: ");
        c = sc.nextInt();
    }while(c==1);
   }
}
   */



//Using LinkedList:Linear queue
/*
class node{
    node next;
    int data;
    node(int data){
        this.data = data;
        next=null;
    }
}
class Queue{
    node front, rear;
    Queue(){
        front=rear=null;
    }
    boolean isempty(){
        if(front==null){
            return true;
        }
        return false;
    }

    void enqueue()
    {
        Scanner sc = new Scanner(System.in)        ;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        node temp = new node(data);
        if(rear==null){
            rear=front=temp;
        }
        else{
            rear.next = temp;
            rear=temp;
            System.out.println("Element added successfully..");
        }

    }

    void dequeue(){
        if(isempty()){
            System.out.println("Queue is empty");
        }
        else{
            front=front.next;
            if(front==null){
                rear=null;
            }
            System.out.println("Data deleted successfully..");
        }
    }
    void display(){
        if(isempty()){
            System.out.println("Queue is empty");
        }
        else{
            node ptr = front;
            while(ptr!=null){
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
}
public class dequeue_enqueue{
    public static void main(String[] args){
     Queue q = new Queue();
 
     Scanner sc = new Scanner(System.in);
     int c;
     do{
         System.out.println("Enter 1. to dequeue \n 2. to enqueue \n 3. to display: ");
         c = sc.nextInt();
         switch(c){
            case 1:
              q.dequeue();
              break;
             case 2:
               q.enqueue();
               break;
             case 3:
               q.display();
                break;
               
         }
         System.out.println("Enter 1 to continue: ");
         c = sc.nextInt();
     }while(c==1);
    }
 }
 */

 