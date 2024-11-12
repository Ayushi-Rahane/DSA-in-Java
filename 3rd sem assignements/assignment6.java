import java.util.*;

class node{
    node left ,right;
    String word,meaning;

        node(String w, String m){
           left =right=null;
           word = w;
           meaning = m;
        }
}

class binary{
    Scanner  sc =new Scanner(System.in);
    node root;
    binary(){
        root = null;
    }

    void create(){
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        System.out.println("Enter Meaning: ");
        String mean = sc.nextLine();
        node temp = new node(word, mean);
        if(root==null){
            root = temp;
        }
        else{
            node ptr = root;
            while(true){
                // temp word is lesser than ptr word so it will insert to left side of ptr node.
                if(ptr.word.compareTo(temp.word)>0){
                     if(ptr.left==null){
                        ptr.left = temp;
                        System.out.println("Node has been inserted.");
                        break;
                     }
                     else{
                        ptr = ptr.left;
                     }
                }
                //temp word is greater than ptr word so it will be inserted to right side of ptr node.
                else if(ptr.word.compareTo(temp.word)<0){
                    if(ptr.right==null){
                        ptr.right = temp;
                        System.out.println("Node has been inserted");
                        break;
                    }
                    else{
                        ptr= ptr.right;
                    }
                }
                else{
                    System.out.println("Word already exist in the dictionary");
                }
            }
        }
    }

    void search(){
        System.out.println("Enter Word: ");
        String word = sc.nextLine();
        node ptr = root;
        int flag=0;
        while(ptr!=null){
            if(ptr.word.equals(word)){
                System.out.println(ptr.word+": "+ptr.meaning);
                flag=1;
                break;
            }
            else if(ptr.word.compareTo(word)>0){
                ptr=ptr.left;
            }
            else{
                ptr = ptr.right;
            }
        }
        if(flag==0){
            System.out.println("Word doesn't exist");
        }
    }
     void update(){
        System.out.println("Enter word to update: ");
        String word = sc.nextLine();
        node ptr = root;
        int flag =0;
        while(true){
            if(ptr.word.equals(word)){
                System.out.println("Enter new meaning of "+ptr.word);
                String new_mean = sc.nextLine();
                ptr.meaning = new_mean;
                flag=1;
                System.out.println("Word has been updated");
                break;
            }
            else if(ptr.word.compareTo(word)>0){
                  ptr = ptr.left;
            }
            else{
                ptr = ptr.right;
            }
        }

        if(flag==0){
            System.out.println("no such a word exist");
        }
     }
    
     void delete(String key){
        node parent = null;
        node ptr = root;
        while(ptr!=null && !ptr.word.equals(key)){
            parent = ptr;
            if(ptr.word.compareTo(key)>0){
                ptr = ptr.left;
            }
            else{
                ptr = ptr.right;
            }
        }
        if(ptr==null){
            System.out.println("No word found");
        }
        else{
            //deleting leaf node
            if(ptr.left==null && ptr.right==null){
                if(ptr==root){
                    root=null;
                }
                else if(parent.left == ptr){
                     parent.left = null;
                }
                else{
                    parent.right = null;
                }
            }
            // left child is present and right child is absent of parent node
            else if(ptr.left!=null && ptr.right==null){
                if(parent.left==ptr){
                      parent.left=ptr.left;
                }
                else if(parent.right==ptr){
                    parent.right = ptr.left;
                }
            }
            //right child is present and left child is absent
            else if(ptr.right!=null && ptr.left==null){
                if(parent.left==ptr){
                      parent.left=ptr.right;
                }
                else if(parent.right==ptr){
                    parent.right = ptr.right;
                }
            }
            else {
                node successorParent = ptr;
                node successor = ptr.left;
    
                // Find the rightmost child in the left subtree of ptr
                while (successor.right != null) {
                    successorParent = successor;
                    successor = successor.right;
                }
    
                // Copy data from successor to the node to be deleted
                ptr.word = successor.word;
                ptr.meaning = successor.meaning;
    
                // Attach the left subtree of successor to its parent
                if (successorParent.left == successor) {
                    successorParent.left = successor.left;
                } else {
                    successorParent.right = successor.left;
                }
            }

        }
     }
    void display(node n){
        if(n!=null){
            display(n.left);
            System.out.println(n.word+": "+n.meaning);
            display(n.right);
        }
    }

    node firstNode(){
        return root;
    }
}
public class assignment6{
    public static void main(String[] args){
        binary b=new binary();
        Scanner s=new Scanner(System.in);
        int ch,ch1;
        do {

            System.out.print("\n\t**MENU**\n0)Quit\n1)Create\n2)Display\n3)Search\n4)Update\n5)Delete\nEnter choice : ");

            ch1=s.nextInt();
            switch(ch1){
                case 0 :
                  System.out.println("Terminated");
                  break;
                case 1 :
                  b.create();
                  break;
                case 2 :
                  System.out.println("Displaying...");
                  b.display(b.firstNode());
                  break;
                case 3 :
                  b.search();
                  break;
                case 4 :
                  b.update();
                  break;
                case 5 :
                  System.out.print("Enter word : ");
                  String key = s.next();
                  b.delete(key);
                  break;
                default :
                  System.out.println("Invalid");
                }
          } while(ch1!=0);

            s.close();
    }
}