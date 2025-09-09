class node{
  int data;
  node next,prev;
  node(int d){
    data = d;
    next = prev = null;
  }
}

public class delete_tail{
   static node head;
   public static void deleteing_tail(int data){
     node temp = new node(data);
     if(head==null){
      System.out.println("List is empty");
     }
     else{
       node ptr = head;
       while(ptr.next!=null){
        ptr = ptr.next;
       }
       ptr.prev.next = null;
       ptr.prev = null;
       ptr = null;
       
       
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
    deleteing_tail(5);
    //Traversing the list
    node ptr = head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }

  }
}