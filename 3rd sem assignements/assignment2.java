/*
 * 
 * Assignment no: 2
 * Submitted By:
 * NAME: Rahane Ayushi Madhukar
 * UCE: UCE2024014
 * DIV: B
 * Branch: B4
 * 
 * */

import java.util.*;
class member{
	int member_id;
	String Name, Address, Position;
	member next;
	member(int member_id, String Name, String Address, String Position){
		this.member_id=member_id;
		this.Name = Name;
		this.Address=Address;
		this.Position=Position;
		this.next = null;
		
	}
}

class Code_club{
	member head, ptr;
	Scanner sc = new Scanner(System.in);
	Code_club(){
		head = null;
	}
	
	//1. Creating linked List
    void create() { // insert at the end
    	System.out.println("Enter Member Id: ");
    	int member_id = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter Name: ");
    	String Name = sc.nextLine();
    	System.out.println("Enter Address: ");
    	String address = sc.nextLine();
    	System.out.println("Enter position: ");
    	String position = sc.nextLine();
    	member newMember = new member(member_id, Name, address, position);
    	if(head==null) {
    		head=newMember;
    	}
    	else {
    		ptr=head;
    		while(ptr.next!=null) {
    			ptr=ptr.next;
    		}
    		ptr.next = newMember;
    	}
    }
    
    // 2. Insertion Operation
    void insertNode(int c) {
    	int n2;
    	switch(c) {
		case 1:
			System.out.println("Enter number of Members you want to add: ");
			n2 = sc.nextInt();
			for(int i=0;i<n2;i++) {
				insert_At_Start();
					
			}
			break;
			
		case 2: 
			System.out.println("Enter the position to insert: ");
			int pos = sc.nextInt();
			sc.nextLine();
				insert_In_between(pos);
			
		    break;
		case 3:
			System.out.println("Enter number of Members you want to add: ");
			n2 = sc.nextInt();
			for(int i=0;i<n2;i++) {
				create();
			}
			break;
		}
    }
    
    // Insert At start
   void insert_At_Start() {
	System.out.println("Enter Member Id: ");
   	int member_id = sc.nextInt();
   	sc.nextLine();
   	System.out.println("Enter Name: ");
   	String Name = sc.nextLine();
   	System.out.println("Enter Address: ");
   	String address = sc.nextLine();
   	System.out.println("Enter position: ");
   	String position = sc.nextLine();
   	member newMember = new member(member_id, Name, address, position);
    if(head==null) {
    	head = newMember;
    }
    else {
    	newMember.next=head;
    	head = newMember;
    }
    }
 
    //Insert In between
    void insert_In_between(int pos) {
    	System.out.println("Enter Member Id: ");
       	int member_id = sc.nextInt();
       	sc.nextLine();
       	System.out.println("Enter Name: ");
       	String Name = sc.nextLine();
       	System.out.println("Enter Address: ");
       	String address = sc.nextLine();
       	System.out.println("Enter position: ");
       	String position = sc.nextLine();
       	member newMember = new member(member_id, Name, address, position);
        if(head==null) {
        	head = newMember;
        }
        else {
        	ptr = head;
			//pos=3
			//pos-1 = 2
        	int k=1;
        	while(k<pos-1 && ptr.next!=null) {
        		k++;
        		ptr=ptr.next;
        	}
        	newMember.next = ptr.next;
        	ptr.next = newMember;
        	
        }
    }
    
    
    //3. Deletion Operation
   void delete_node(int c) {
	   switch(c) {
		case 1:
			delete_at_start();
			break;
		case 2:
			System.out.println("Enter the position of element you want to delete: ");
			int pos = sc.nextInt();
		    delete_in_between(pos);
			break;
		case 3:
			delete_at_end();
			
		}
      }
   void delete_at_start() {
	   if(head==null) {
		   System.out.println("No data to delete");
	   }
	   else {
		   head = head.next;
		   System.out.println("Deleted Successfully..");;
	   }
   }
   
   void delete_in_between(int pos) {
	   int k=1;
	   if(head==null) {
		   System.out.println("No data to delete");
	   }
	   else {
		   ptr=head;
		   while(k<pos-1 && ptr.next!=null) {
			   ptr=ptr.next;
			   k++;
		   }
		   ptr.next = ptr.next.next;
		   System.out.println("Deleted Successfully..");;
	   }
   }
   void delete_at_end() {
	   if(head==null) {
		   System.out.println("No data to delete");
	   }
	   else {
		   ptr = head;
		   member prev = head;
		   while(ptr.next!=null) {
			   prev = ptr;
			   ptr = ptr.next;
		  }
           prev.next = null;		   
           System.out.println("Deleted Successfully..");;
	   }
   }
   
   //4. Update operation using linear search
   void update() {
   	System.out.println("Enter the Member Id: ");
   	int key_id = sc.nextInt();
   	sc.nextLine();
   	ptr = head;
   	while(ptr!=null) {
   		if(ptr.member_id == key_id) {
   			System.out.println("Enter Member Id: ");
   	       	ptr.member_id = sc.nextInt();
   	       	sc.nextLine();
   	       	System.out.println("Enter Name: ");
   	       	ptr.Name = sc.nextLine();
   	       	System.out.println("Enter Address: ");
   	       	ptr.Address = sc.nextLine();
   	       	System.out.println("Enter position: ");
   	       	ptr.Position = sc.nextLine();
   	       	System.out.println("Updated Successfully...");
   	       	break;
      		}
   		ptr = ptr.next;
   	}
   }
   
   
    //5. Displaying linked list
    void display() {
    	if(head==null) {
    		System.out.println("No Data to display !");
    	}
    	else {
    		ptr = head;
    		int k=1;
    		while(ptr!=null) {
    			System.out.println("Data of Member: "+k);
    			k++;
    			System.out.println("Id:"+ptr.member_id+"\n Name : "+ptr.Name+"\n Position: "+ptr.Position+"\n Address: "+ptr.Address);
    			ptr=ptr.next;
    		}
    	}
    	
    }
   
    
}
public class assignment2 {
public static void main(String[] args) {
	Code_club cc = new Code_club();
	int c;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Enter 1. to Create \n 2. to Insert \n 3. to delete \n 4. to update: \n 5. to display: ");
		c = sc.nextInt();
		sc.nextLine();
		switch(c) {
		case 1:
			System.out.println("Enter number of Members: ");
			int n = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<n;i++) {
				System.out.println("Member: "+(i+1));
				cc.create();
			}
			break;
		case 2:
			System.out.println("Enter 1. to insert at start\n 2. to insert at in between\n 3. to insert at last: ");
			c = sc.nextInt();
			cc.insertNode(c);
			break;
		case 3:
			System.out.println("Enter 1. to delete at start\n 2. to delete at in between\n 3. to delete at last: ");
			c = sc.nextInt();
			cc.delete_node(c);
			break;
		case 4:
			cc.update();			
			break;
		case 5:
			cc.display();
			break;
		}
		System.out.println("Enter 1 to continue: ");
		c = sc.nextInt();
		sc.nextLine();
	}while(c==1);
}
}

/*
 * Output:
 * Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
1
Enter number of Members: 
2
Member: 1
Enter Member Id: 
101
Enter Name: 
Reshma Kaporr
Enter Address: 
Pune
Enter position: 
President
Member: 2
Enter Member Id: 
102
Enter Name: 
Rushikesh Kulkarni
Enter Address: 
Nagpur
Enter position: 
Vice President
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
2
Enter 1. to insert at start
 2. to insert at in between
 3. to insert at last: 
1
Enter number of Members you want to add: 
1
Enter Member Id: 
100
Enter Name: 
Kajal Raut
Enter Address: 
Mumbai
Enter position: 
Head Of Department
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
5
Data of Member: 1
Id:100
 Name : Kajal Raut
 Position: Head Of Department
 Address: Mumbai
Data of Member: 2
Id:101
 Name : Reshma Kaporr
 Position: President
 Address: Pune
Data of Member: 3
Id:102
 Name : Rushikesh Kulkarni
 Position: Vice President
 Address: Nagpur
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
2
Enter 1. to insert at start
 2. to insert at in between
 3. to insert at last: 
3
Enter number of Members you want to add: 
2
Enter Member Id: 
104
Enter Name: 
Seema Rah
Enter Address: 
karvenagar
Enter position: 
Documentation Head
Enter Member Id: 
105
Enter Name: 
Deepak Kumar
Enter Address: 
Pune
Enter position: 
Design head
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
5
Data of Member: 1
Id:100
 Name : Kajal Raut
 Position: Head Of Department
 Address: Mumbai
Data of Member: 2
Id:101
 Name : Reshma Kaporr
 Position: President
 Address: Pune
Data of Member: 3
Id:102
 Name : Rushikesh Kulkarni
 Position: Vice President
 Address: Nagpur
Data of Member: 4
Id:104
 Name : Seema Rah
 Position: Documentation Head
 Address: karvenagar
Data of Member: 5
Id:105
 Name : Deepak Kumar
 Position: Design head
 Address: Pune
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
2
Enter 1. to insert at start
 2. to insert at in between
 3. to insert at last: 
2
Enter the position to insert: 
3
Enter Member Id: 
333
Enter Name: 
Sandip kale
Enter Address: 
Mumbai
Enter position: 
Manager
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
5
Data of Member: 1
Id:100
 Name : Kajal Raut
 Position: Head Of Department
 Address: Mumbai
Data of Member: 2
Id:101
 Name : Reshma Kaporr
 Position: President
 Address: Pune
Data of Member: 3
Id:333
 Name : Sandip kale
 Position: Manager
 Address: Mumbai
Data of Member: 4
Id:102
 Name : Rushikesh Kulkarni
 Position: Vice President
 Address: Nagpur
Data of Member: 5
Id:104
 Name : Seema Rah
 Position: Documentation Head
 Address: karvenagar
Data of Member: 6
Id:105
 Name : Deepak Kumar
 Position: Design head
 Address: Pune
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
3
Enter 1. to delete at start
 2. to delete at in between
 3. to delete at last: 
1
Deleted Successfully..
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
5
Data of Member: 1
Id:101
 Name : Reshma Kaporr
 Position: President
 Address: Pune
Data of Member: 2
Id:333
 Name : Sandip kale
 Position: Manager
 Address: Mumbai
Data of Member: 3
Id:102
 Name : Rushikesh Kulkarni
 Position: Vice President
 Address: Nagpur
Data of Member: 4
Id:104
 Name : Seema Rah
 Position: Documentation Head
 Address: karvenagar
Data of Member: 5
Id:105
 Name : Deepak Kumar
 Position: Design head
 Address: Pune
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
3
Enter 1. to delete at start
 2. to delete at in between
 3. to delete at last: 
2
Enter the position of element you want to delete: 
2
Deleted Successfully..
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
5
Data of Member: 1
Id:101
 Name : Reshma Kaporr
 Position: President
 Address: Pune
Data of Member: 2
Id:102
 Name : Rushikesh Kulkarni
 Position: Vice President
 Address: Nagpur
Data of Member: 3
Id:104
 Name : Seema Rah
 Position: Documentation Head
 Address: karvenagar
Data of Member: 4
Id:105
 Name : Deepak Kumar
 Position: Design head
 Address: Pune
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
3
Enter 1. to delete at start
 2. to delete at in between
 3. to delete at last: 
3
Deleted Successfully..
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
5
Data of Member: 1
Id:101
 Name : Reshma Kaporr
 Position: President
 Address: Pune
Data of Member: 2
Id:102
 Name : Rushikesh Kulkarni
 Position: Vice President
 Address: Nagpur
Data of Member: 3
Id:104
 Name : Seema Rah
 Position: Documentation Head
 Address: karvenagar
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
4
Enter the Member Id: 
104
Enter Member Id: 
103
Enter Name: 
Seema Rah
Enter Address: 
Documentation Head
Enter position: 
Pune
Updated Successfully...
Enter 1 to continue: 
1
Enter 1. to Create 
 2. to Insert 
 3. to delete 
 4. to update: 
 5. to display: 
5
Data of Member: 1
Id:101
 Name : Reshma Kaporr
 Position: President
 Address: Pune
Data of Member: 2
Id:102
 Name : Rushikesh Kulkarni
 Position: Vice President
 Address: Nagpur
Data of Member: 3
Id:103
 Name : Seema Rah
 Position: Pune
 Address: Documentation Head
Enter 1 to continue: 
0

 * */


