class node{
  int data;
  node next,prev;
  node(int d){
    data = d;
    next = prev = null;
  }
}

public class delete_between{
   static node head;
   public static void deleteing_between(int pos){
     int k=1;
     
     if(head==null){
      System.out.println("List is empty");
     }
     else if(k>=pos){
        head =  head.next;
        head.prev = null;
       }
     else{
       node ptr = head;
       while(ptr.next!=null && k<pos-1){
         k++;
         ptr = ptr.next;
       }
       if(ptr.next==null || ptr.next.next==null){
           System.out.println("Position out of bound");
           return;
       }
       ptr.next = ptr.next.next;
       
       if(ptr.next!=null){
        
         ptr.next.prev = ptr;
       }
    
    
     
       
     }
   }
  public static void main(String[] args){
    head = new node(10);
    node temp1 = new node(20);
    node temp2 = new node(30);
    head.next = temp1;
    temp1.prev = head;
    temp1.next = temp2;
    temp2.prev = temp1;
    deleteing_between(3);
    //Traversing the list
    node ptr = head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }

  }
}