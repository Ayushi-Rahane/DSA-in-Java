import java.util.*;
class node{
    int data;
    node left, right;
    node(int data){
        this.data = data;
        left=right=null;
    }
}
class binaryTree{
    node root;
    binaryTree(){
        root=null;
    }
    void create(int data){
        Scanner sc = new Scanner(System.in);
        node temp = new node(data);
        if(root==null){
            root=temp;
        }
        else{
            node ptr = root;
            while(true){
                System.out.println("Current node: "+ptr.data);
                System.out.println("Enter direct to insert (left/right): ");
                String dir = sc.nextLine();
                if(dir.equalsIgnoreCase("left")){
                    if(ptr.left!=null){
                        ptr = ptr.left;
                    }
                    else{
                        ptr.left = temp;
                        System.out.println("Node is inserted to the left of: "+ptr.data);
                        break;
                    }
                }
                else if(dir.equalsIgnoreCase("right")){
                    if(ptr.right!=null){
                        ptr = ptr.right;
                    }
                    else{
                        ptr.right=temp;
                        System.out.println("node is inserted to the right of: "+ptr.data);
                        break;
                    }
                }
                else{
                    System.out.println("Enter correct direction..");
                }

            }
        }
    }

    void inorderTraversal(node ptr){
       if(ptr!=null){
        inorderTraversal(ptr.left);
        System.out.println(ptr.data+" ");
        inorderTraversal(ptr.right);
       }

    }
}
public class binaryTree_creation_inorder_traversal{
    public static void main(String[] args){
      binaryTree bt = new binaryTree();
      int c;
      Scanner sc = new Scanner(System.in);
      do{
        System.out.println("Enter 1. to create\n 2. to display: ");
        c = sc.nextInt();
        switch(c){
            case 1:
              System.out.println("Enter Root node: ");
              int data = sc.nextInt();
              sc.nextLine();
              bt.create(data);
              break;
            case 2:
              System.out.println("Displaying...");
              bt.inorderTraversal(bt.root);
        }
        System.out.println("Enter 0 to continue: ");
        c =  sc.nextInt();
      }while(c==0);
    }
}