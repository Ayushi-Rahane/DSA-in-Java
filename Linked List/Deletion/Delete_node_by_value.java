class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class Delete_node_by_value{
  Node head;
  public void delete_node_by_value(int value){
    //Check if List is empty or not.
    if(head==null){
      System.out.println("List is empty");
    }
    else if(value == head.data){ // if pos is 1 then we have to delete the head node.
        head= head.next;
      }
    else{
        Node ptr = head;
        Node prev = head;
      // Traverse to preveous node of the node to be deleted.
      while(ptr!=null){
     if(ptr.data == value){
         prev.next = ptr.next; // set the previous node next to the next of the node to be deleted.
       break;
     }
        prev = ptr;
        ptr=ptr.next; // move to the next node.
      }
    }
  }

  public static void main(String[] args){
    Node a = new Node(10); 
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(50);

    Delete_node_by_value list = new Delete_node_by_value();
   // linking the nodes
    list.head = a;
    list.head.next = b;
    b.next = c;
    c.next = d;

    list.delete_node_by_value(20);

    //Traversing the Node
    Node ptr = list.head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
  }
}