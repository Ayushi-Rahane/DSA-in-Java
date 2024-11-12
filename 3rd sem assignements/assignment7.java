import java.util.*;

class Contact_details{
long c_no;
String c_name;
Contact_details next;
Contact_details(long no, String name){
c_no = no;
c_name = name;
next = null;
}
}
class hashTable{
Contact_details[] contact_list;
int size;

hashTable(int contact_list_size){
size = contact_list_size;
contact_list = new Contact_details[size];
}
int hash_address(long c_no) {
return (int) c_no%size;
}

void insert() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Person's Name:");
String c_name = sc.nextLine();
System.out.println("Enter Contact Number: ");
long c_no = sc.nextLong();
sc.nextLine();
Contact_details temp = new Contact_details(c_no,c_name);
int index = hash_address(c_no);
if(contact_list[index]==null) {
    contact_list[index] = temp;
}
else {
temp.next = contact_list[index];
contact_list[index] = temp;
}
}

void search() {
Scanner sc = new Scanner(System.in);;
System.out.println("Enter the Contact no: ");
long cno = sc.nextLong();
sc.nextLine();
int index = hash_address(cno);
   Contact_details ptr = contact_list[index];
   while(ptr!= null ) {
    if(ptr.c_no == cno) {
    System.out.println("Contact Name: "+ptr.c_name+"\n Ph. no. "+ptr.c_no);
    break;
    }
    ptr = ptr.next;
   }

}

void delete() {
Scanner sc = new Scanner(System.in);;
System.out.println("Enter the Contact no: ");
long cno = sc.nextLong();
sc.nextLine();
int index = hash_address(cno);
int found=0;
   Contact_details ptr = contact_list[index];
   Contact_details prev = contact_list[index];
   while(ptr != null ) {
    if(ptr.c_no == cno) {
    if(prev==null){
        contact_list[index] = contact_list[index].next;
    }
    else if(ptr.next==null && prev.next!=null){
        prev.next=null;
    }
    else{
        prev.next = ptr.next;
    }
    found=1;
    System.out.println("Deleted successfully..");
    break;
    }
    prev = ptr;
    ptr = ptr.next;
   }
   if(found==0){
System.out.println("Person not found");
   }
   
}

void display() {
for(int i=0;i<size;i++){
Contact_details ptr = contact_list[i];
System.out.println("Index:"+i+"\n");
while(ptr!=null) {
System.out.println("Contact Name: "+ptr.c_name+"\n Ph. no. "+ptr.c_no);
ptr = ptr.next;
}

}
}

}
public class assignment7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c;
    System.out.println("Enter size of Contact size: ");
    int contact_list_size = sc.nextInt();
    sc.nextLine();
    hashTable ht = new hashTable(contact_list_size);
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
        ht.delete();
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
