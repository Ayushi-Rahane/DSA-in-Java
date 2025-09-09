  class node{
    int data;
    node next;
    node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public class insert_between{
    static node head;
    public void insert_between(int data, int pos){
      if(head==null){
        head = new node(data);
        return;
      }
      node ptr = head;
      int k = 1;
      while(ptr.next!=null){
        if(k==pos-1){
          node temp = new node(data);
          temp.next = ptr.next;
          ptr.next = temp;
          break;
        }
        k++;
        ptr=ptr.next;
      }
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
      insert_between list = new insert_between();
      list.insert_between(700,3);
      //Traversing the Node
      node ptr = head;
      while(ptr!=null)
        {
          System.out.println(ptr.data);
          ptr = ptr.next;
        }
    }
  }