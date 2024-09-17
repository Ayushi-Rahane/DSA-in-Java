import java.util.*;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}

class SLL{
    node head, ptr;
    void create_List(int data){
        node temp = new node(data);
        if(head ==null){
            head = temp;
        }
        else{
            ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.next = null;
        }
    }
    void search_node(int val){
        node ptr1 =head, ptr2=head;
        while(ptr1.next != null){
             
        }
    }
    void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            ptr = head;
            while(ptr !=null){
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
}
public class Linear_search_SLL {
    
    public static void main(String[] args){
       int val = 7;
       
    }
}
