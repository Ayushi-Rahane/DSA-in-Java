//1. Defining the Node
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

//2. Creating the Node
public class defining_and_creating_node{
  public static void main(String[] args){
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node head = a;
    head.next = b;
    b.next = c;
 // 3. Traversing the Node
    Node ptr = head;
    while(ptr!=null){
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
  }
}