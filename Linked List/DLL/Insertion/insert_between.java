class node{
  int data;
  node next,prev;
  node(int d){
    data = d;
    next = prev = null;
  }
}

public class insert_between{
   static node head;
   public static void inserting_between(int data, int pos){
     node temp = new node(data);
      int k=1;
     if(head==null){
      head = temp;
     }
    else if(pos<=k){
      temp.next = head;
      head.prev = temp;
      head = temp;
    }
     else{
       node ptr = head;
      
       while(ptr.next!=null && k<pos-1){
        ptr = ptr.next;
       }
       temp.next = ptr.next;
       temp.prev = ptr;
       if(ptr.next!=null){
         ptr.next.prev = temp;
       }
       ptr.next = temp;
       
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
    inserting_between(544,2);
    //Traversing the list
    node ptr = head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }

  }
}