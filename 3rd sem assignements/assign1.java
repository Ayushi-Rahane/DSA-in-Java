import java.util.*;
class Books{
	String bname,aname;
	int isbn;
	Books(String bname, String aname, int isbn){
		this.bname=bname;
		this.aname=aname;
		this.isbn=isbn;
	}
}

class library{
	Books b[] = new Books[50];
	int n;
	Scanner sc = new Scanner(System.in);
	// Add all books
	void addBook() {
		System.out.println("Enter the number of Books: ");
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Details for book "+(i+1));
			System.out.println("Enter the name of book: ");
			String bname = sc.nextLine();

			System.out.println("Enter the name of author: ");
			String aname = sc.nextLine();

			System.out.println("Enter the ISBN of book: ");
			int isbn = sc.nextInt();
			sc.nextLine();
			
		    b[i] = new Books(bname,aname,isbn);
			
		}
		
	}
	
	// 1. Adding new book in a library having existing books
	void AddNewBook() {
		if(n>=b.length) {
			System.out.println("Library is full! can't add more");
		}
		else {
			System.out.println("Adding new Book..");
			System.out.println("Enter the name of book: ");
			String bname = sc.nextLine();

			System.out.println("Enter the name of author: ");
			String aname = sc.nextLine();

			System.out.println("Enter the ISBN of book: ");
			int isbn = sc.nextInt();
			sc.nextLine();
			
			b[n] = new Books(bname,aname,isbn);
			n++;
			System.out.println("New book added successfully...");
		}
	}
	
	
	// 2. Search a book in library based on ISBN number - binary search
	void searchBook() {
		System.out.println("Enter the ISBN of Book: ");
		int isbn = sc.nextInt();
		int start = 0;
		int end = n-1;
		int mid;
		boolean found=false;
		while(start<=end) {
			mid = (start+end)/2;
			if(isbn > b[mid].isbn) {
				start = mid+1;
			}
			else if(isbn < b[mid].isbn) {
				end = mid-1;
			}
			else {
				System.out.println("Name of Book: "+b[mid].bname+"\nName of Author: "+b[mid].aname+"\nISBN: "+b[mid].isbn);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Book not found.");
		}
	}
	
	
	//3. Sort books based on ISBN using bubble sort
	
	void Sort_ISBN_BubbleSort() {
		Books temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(b[j].isbn >= b[j+1].isbn) {
				   /*temp = b[j].isbn;
				   b[j].isbn = b[j+1].isbn;
				   b[j+1].isbn = temp;*/
                   temp = b[j];
				   b[j] = b[j+1];
				   b[j+1] = temp;
				}
			}
		}
		System.out.println("Books are sorted using bubble sort.");
	}
	
	
	// 4. List of all books of specific author (Linear search)
	void searchAuthor_LinearSearch() {
		System.out.println("Enter the name of author: ");
		String aname = sc.nextLine();
		int flag=0;
		for(int i=0;i<n;i++) {
			if(b[i].aname.equals(aname)) {
				System.out.println("Displaying all books of: "+b[i].aname);
			 System.out.println("Name of Book: "+b[i].bname+"\nName of Author: "+b[i].aname+"\nISBN: "+b[i].isbn);		
			 flag=1;
			}
		}
		if(flag!=1) {
			System.out.println("No author found");
		}
		
	}
	
	// Displaying all books present in the library
	void DisplayBook() {
		for(int i=0;i<n;i++) {
		System.out.println("Name of Book: "+b[i].bname+"\nName of Author: "+b[i].aname+"\nISBN: "+b[i].isbn);
		}
	}
}
public class assign1 {
	public static void main(String[] args) {
		library l = new library();
		Scanner sc = new Scanner(System.in);
        int c;
		do {			
		System.out.println("Enter\n 1. to Add all books\n 2. to add new book\n 3. to Sort Books based on ISBN\n 4. Search Book\n 5. Search Author\n 6. Display all books");
		c = sc.nextInt();	
	    switch(c) {
		case 1:
			l.addBook();
			break;
		case 2:
			l.AddNewBook();
			break;
		case 3:
			l.Sort_ISBN_BubbleSort();
			break;
		case 4:
			l.searchBook();
			break;
		case 5:
			l.searchAuthor_LinearSearch();
			break;
		case 6:
			l.DisplayBook();
			break;
		default:
			System.out.println("Kindly enter option..");
		}
		System.out.println("Enter 1 to continue: ");
		c= sc.nextInt();

		}while(c==1);
	}
}