class node{
  int data;
  node next;
  node(int d){
    data = d;
    next = null;
  }
}

public class delete_head{
  static node head;
  public static void deleteHead(){
    if(head==null){
      System.out.println("List is empty");
      return;
    }
    head = head.next;
  }
  public static void main(String[] args){
    node a = new node(200);
    node b = new node(300);
    node c = new node(400);
    head = a;
    head.next = b;
    b.next = c;
    System.out.println("Before deleting: ");
    node ptr = head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }

    deleteHead();
    System.out.println("After Deleting: ");
    ptr = head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
  }
}