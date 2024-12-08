import java.util.Scanner;

class node{
    node right, left;
    String word, meaning;
    node(String m, String w){
        word=w;
        meaning=m;
        left=right=null;
    }
}

class binary{
    Scanner sc = new Scanner(System.in);
    node root;
    binary(){
        root=null;
}

void create(){
    System.out.println("Enter word: ");
    String word = sc.nextLine();
    System.out.println("Enter Meaning: ");
    String mean = sc.nextLine();
    node temp = new node(mean, word);
    if(root==null){
        root=temp;
    }
    else{
        node ptr = root;

        while(true){
            if(ptr.word.compareTo(temp.word)>0){
                if(ptr.left==null){
                    ptr.left=temp;
                    System.out.println("Inserted successfully..");
                    break;
                }
                else{
                    ptr=ptr.left;
                }
            }
            else if(ptr.word.compareTo(temp.word)<0){
                if(ptr.right==null){
                    ptr.right=temp;
                    System.out.println("Inserted to right");
                    break;
                
                }
                else{
                    ptr = ptr.right;
                }
            }
            else{

            }
        }
    }
}

void delete(){
    System.out.println("Enter wpord to delete: ");
    String key = sc.nextLine();
    node parent=null;
    node ptr = root;
    while(ptr!=null && ptr.word.equals(key)){
        parent = ptr;
        if(ptr.word.compareTo(key)>0){
            ptr = ptr.left;
        }
        else{
            ptr=ptr.right;
        }
    }

    if(ptr ==null){
        System.out.println("No word found");
    }

    // leaf noder
    if(ptr.left==null && ptr.right==null){
        if(ptr==root){
            root =null;
        }
        else if(parent.right==ptr){
            parent.right=null;
        }
        else{
            parent.left=null;
        }
    }
    else {
       node sp = ptr;
       node s = ptr.right;
       while(s.left!=null){
        sp=s;
        s=s.left;
       }
       ptr.word=s.word;
       ptr.meaning=s.meaning;

       if(sp.left==s){
        sp.left=s.right
       }

    }
}
void display(node n){
    if(n!=null){
        display(n.left);
        System.out.println(n.);
    }
}
}
public class assignment6 {
    public static void main(String[] args)
    {
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
