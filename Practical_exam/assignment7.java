import java.util.*;

class Contact{
    int c_no;
    
    String cname;
    Contact next;
    Contact(int cno, String name){
        c_no = cno;
        cname = name;
        next = null;

    }
}

class hashtable{
    int size;
    Contact[] c;
    Scanner sc = new Scanner(System.in);
    hashtable(int size){
        this.size=size;
        c = new Contact[size];

    }
    int hashaddress(int cno){
        return cno%size;
    }
    void insert()
    {
         System.out.println("C no:");
         int cno = sc.nextInt();
         sc.nextLine();
         System.out.println("Name: ");
         String name = sc.nextLine();
         Contact temp = new Contact(cno, name);
         int index = hashaddress(cno) ;
         if(c[index]==null){
            c[index]=temp;
         }
         else{
            temp.next = c[index];
            c[index]=temp;
         }
    }

    void search(){
        System.out.println("Enter cno");
        int cno=sc.nextInt();
        sc.nextLine();
        int found=1;
        int index = hashaddress(cno);
        Contact ptr = c[index];
        while(ptr!=null){
            if(ptr.c_no==cno){
                System.out.println("Found");
                found=0;
            }
            ptr=ptr.next;
        }
        if(found==1){
            System.out.println("Not found");
        }
    }
void delete(){
    System.out.println("Enter cno");

    int cno = sc.nextInt();
    sc.nextLine();
    int index = hashaddress(cno);
    Contact ptr = c[index];
    Contact prev = null;
    while(ptr!=null){
        if(ptr.c_no==cno){
            if(prev==null){
               c[index]=c[index].next;
            }
            
        }
    }
}
    void display(){
        for(int i=0;i<size;i++){
            Contact ptr = c[i];
            while(ptr!=null){
                System.out.println(ptr.c_no+" | "+ptr.cname);
                ptr=ptr.next;
            }

        }
    }
}
public class assignment7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Enter size of Contact size: ");
        int contact_list_size = sc.nextInt();
        sc.nextLine();
        hashtable ht = new hashtable(contact_list_size);
        do {
           System.out.println("Enter 1. to Insert \n 2. To Search \n 3. To Delete \n 4. To Display: ");
           c = sc.nextInt();
           sc.nextLine();
           switch(c) {
           case 1:
            ht.insert();
            break;
           case 2:
            ht.search();
               break;
           case 3:
          //  ht.delete();
            break;
           case 4:
            ht.display();
            break;
           }
       
       
        System.out.println("Enter 0 to continue");
        c = sc.nextInt();
        sc.nextLine();
        }while(c==0);
       
    }
}