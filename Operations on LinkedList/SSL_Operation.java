import java.util.*;
class node{
	int data;
	node next;
	//1. Creating a Node
	node(int data){
		this.data = data;
		next=null;
	}
}

class ssl{
	node head;
	node ptr;
	
	ssl(){
		head=null;
	}
	//2. Creating a Linked List
	void create(int data) {
		node temp = new node(data);
		if(head==null) {
			head=temp;
		}
		else {
			ptr = head;
		while(ptr.next !=null) {
			ptr=ptr.next;
		}
		ptr.next=temp;
		}
	
	}
	//3. Insert element at start
	void insert_at_start(int data) {
		node temp = new node(data);
		if(head==null) {
			head=temp;
		}
		else {
			temp.next=head;
			head=temp;
		}
	}
	
	//4. Insert element in between
	void insert_in_between(int data, int pos) {
		node temp = new node(data);
		if(head==null) {
			head=temp;
		}
		else {
			ptr = head;
			int k =1;
			while(k<pos-1 && ptr.next !=null){
				k++;
				ptr = ptr.next;
			}
			ptr.next = ptr.next.next;

		}
	}
	
	//5. Insert element at end
	void insert_at_end(int data) {
		node temp = new node(data);
		if(head==null) {
			head=temp;
		}
		else {
			ptr = head;
			while(ptr.next==null) {
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
	}
	//6. delete_at_start()
	void delete_at_start() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
		head = head.next;
		}
	}
	//7. Delete in betweem
	void delete_in_between(int pos) {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			ptr = head;
			int k=1;
			while(k<pos-1 && ptr.next!=null) {
				k++;
				ptr = ptr.next;
			}
			ptr.next = ptr.next.next;		
									
		}
	}
	
	//8. Delete at last
	void delete_at_last() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			ptr = head;
			node prev = head;
			while(ptr.next!=null) {
				prev = ptr;
				ptr = ptr.next;
			}
			prev.next = null;
		}
	}
	
	
	// displaying linkedList
	void display() {
		node ptr = head;
		while(ptr!=null) {
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
}
public class SSL_Operation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int c;
	ssl l = new ssl();
	do {
		
		System.out.println("Enter 1. to create list\n 2. to insert \n 3. to delete\n 4. to display: ");
		c = sc.nextInt();
	switch(c) {
	case 1:
		System.out.println("Enter total number of elements you want to add: ");
		int n1 = sc.nextInt();
		for(int i=0;i<n1;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			int data = sc.nextInt();
			
			l.create(data);
		}
		break;
	case 2:
		System.out.println("Enter 1. to insert at start\n 2. to insert at in between\n 3. to insert at last: ");
		c = sc.nextInt();
		System.out.println("Enter total number of elements you want to add: ");
		int n2 = sc.nextInt();
		switch(c) {
		case 1:
			for(int i=0;i<n2;i++) {
				System.out.println("Enter element "+(i+1)+": ");
				int data = sc.nextInt();
				l.insert_at_start(data);
			}
			break;
		case 2:
			for(int i=0;i<n2;i++) {
				System.out.println("Enter element "+(i+1)+": ");
				int data = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the position: ");
				int pos = sc.nextInt();
				l.insert_in_between(data, pos);
			}
			break;
		case  3:
			for(int i=0;i<n2;i++) {
				System.out.println("Enter element "+(i+1)+": ");
				int data = sc.nextInt();
				l.insert_at_end(data);
			}
			break;			
		}
		break;
	case 3:
		System.out.println("Enter 1. to delete at start\n 2. to delete at in between\n 3. to delete at last: ");
		c = sc.nextInt();
		switch(c) {
		case 1:
			l.delete_at_start();
			break;
		case 2:
			System.out.println("Enter the position of element you want to delete: ");
			int pos = sc.nextInt();
			l.delete_in_between(pos);
			break;
		case 3:
		    l.delete_at_last();
			break;
		}
		break;
	case 4:
		l.display();
		break;
		
	}
	System.out.println("Enter 1 to continue: ");
	c = sc.nextInt();
	}while(c==1);
	
}
}
