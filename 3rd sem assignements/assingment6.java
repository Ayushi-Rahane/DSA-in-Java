/*
 * Assignment no: 6
 * Submitted By:
 * NAME: Rahane Ayushi Madhukar
 * UCE: UCE2024014
 * DIV: B
 * Batch: B4
 */
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
   
     void delete(String key) {
    node parent = null;
    node ptr = root;
   
   
    while (ptr != null && !ptr.word.equals(key)) {
        parent = ptr;
        if (ptr.word.compareTo(key) > 0) {
            ptr = ptr.left;
        } else {
            ptr = ptr.right;
        }
    }
   
   
    if (ptr == null) {
        System.out.println("No word found");
        return;
    }
   
   
    if (ptr.left == null && ptr.right == null) {
        if (ptr == root) {  
            root = null;
        } else if (parent.left == ptr) {
            parent.left = null;
        } else {
            parent.right = null;
        }
    }
   
    else if (ptr.left != null && ptr.right == null) {
        if (ptr == root) {  
            root = ptr.left;
        } else if (parent.left == ptr) {
            parent.left = ptr.left;
        } else {
            parent.right = ptr.left;
        }
    }
   
    else if (ptr.right != null && ptr.left == null) {
        if (ptr == root) {  
            root = ptr.right;
        } else if (parent.left == ptr) {
            parent.left = ptr.right;
        } else {
            parent.right = ptr.right;
        }
    }
   
    else {
        node successorParent = ptr;
        node successor = ptr.right;  
       

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
       
     
        ptr.word = successor.word;
        ptr.meaning = successor.meaning;
       
   
        if (successorParent.left == successor) {
            successorParent.left = successor.right;
        } else {
            successorParent.right = successor.right;  
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
public class assingment6{
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

/*

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 1
Enter word: 
ant
Enter Meaning: 
insect

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 1
Enter word: 
water
Enter Meaning: 
liquid
Node has been inserted

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 1
Enter word: 
animal
Enter Meaning: 
living thing
Node has been inserted.

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 2
Displaying...
animal: living thing
ant: insect
water: liquid

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 3
Enter Word: 
water
water: liquid

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 4
Enter word to update: 
animal
Enter new meaning of animal
human
Word has been updated

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 5
Enter word : animal

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 5
Enter word : ant

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 2
Displaying...
animal: human
ant: insect
water: liquid

        **MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 0
Terminated
 */