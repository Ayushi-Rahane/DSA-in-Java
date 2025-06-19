class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class Deleting_Kth_node{
  Node head;
  public void delete_kth_node(int pos){
    //Check if List is empty or not.
    if(head==null){
      System.out.println("List is empty");
    }
    else if(pos==1){ // if pos is 1 then we have to delete the head node.
        head= head.next;
      }
    else{
        Node ptr = head;
         int k =1;
      // Traverse to preveous node of the node to be deleted.
      while(ptr!=null){
        if(k==pos-1){  // if k is equal to pos-1 then we have reached the previous node of the node to be deleted.
          ptr.next = ptr.next.next; // set the previous node next to the next of the node to be deleted.
          break;
        }
        ptr=ptr.next; // move to the next node.
        k++; // increment the counter.
      }
    }
  }

  public static void main(String[] args){
    Node a = new Node(10); 
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(50);

    Deleting_Kth_node list = new Deleting_Kth_node();
   // linking the nodes
    list.head = a;
    list.head.next = b;
    b.next = c;
    c.next = d;

    list.delete_kth_node(8);

    //Traversing the Node
    Node ptr = list.head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
  }
}