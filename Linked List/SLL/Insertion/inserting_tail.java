class node{
  int data;
  node next;
  node(int data){
    this.data = data;
    this.next = null;
  }
}
public class inserting_tail{
  static node head;
  public void insert_tail(int data){
    if(head==null){
      head = new node(data);
      return;
    }
    node ptr = head;
    while(ptr.next!=null){
      ptr=ptr.next;
    }
    node temp = new node(data);
    temp.next = null;
    ptr.next = temp;
  }
  public static void main(String[] args){
    node a = new node(10);
    node b = new node(20);
    node c = new node(30);
    node d = new node(50);
    // linking the nodes
    head = a;
    a.next = b;
    b.next = c;
    c.next = d;
    inserting_tail list = new inserting_tail();
    list.insert_tail(5);
    //Traversing the Node
    node ptr = head;
    while(ptr!=null)
      {
        System.out.println(ptr.data);
        ptr = ptr.next;
      }
  }
}