class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class Deleting_head{
  Node head;
  public void deletehead(){
    //Check if List is empty or not.
    if(head==null){
      System.out.println("List is empty");
    }
    else{
      head = head.next;  //Moving the head to the next node. and Gabage collector will delete the previous head node automatically.
    }
  }

  public static void main(String[] args){
    Node a = new Node(10); //We are going to delete this node.
    Node b = new Node(20);
    Node c = new Node(30);

    Deleting_head list = new Deleting_head();
   // linking the nodes
    list.head = a;
    list.head.next = b;
    b.next = c;

    list.deletehead();
    
    //Traversing the Node
    Node ptr = list.head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
  }
}