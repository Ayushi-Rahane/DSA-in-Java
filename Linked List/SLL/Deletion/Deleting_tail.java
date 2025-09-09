class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class Deleting_tail{
  Node head;
  public void deletetail(){
    //Check if List is empty or not.
    if(head==null || head.next==null){
      System.out.println("No tail present in list");
    }
    else{
      Node ptr = head;
      //Traverse to second last node of list
      while(ptr.next.next!=null){
         ptr=ptr.next;
      }
      ptr.next = null; // set the seond last node next to null.
    }
  }

  public static void main(String[] args){
    Node a = new Node(10); 
    Node b = new Node(20);
    Node c = new Node(30);  //We are going to delete this node.

    Deleting_tail list = new Deleting_tail();
   // linking the nodes
    list.head = a;
    list.head.next = b;
    b.next = c;

    list.deletetail();

    //Traversing the Node
    Node ptr = list.head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
  }
}