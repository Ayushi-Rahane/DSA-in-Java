/*
 * Assignment No. 1
 * Name: Rahane Ayushi Madhukar
 * UCE: UCE2024014
 * Div: B
 * Branch: B4
 * 
 */
import java.util.*;
class Books {
    String BookName, AuthorName, Publication;
    int ISBN, price;
    Books(String bname, String aname, int isbn, String publication, int price){
         this.BookName = bname;
         this.AuthorName = aname;
         this.ISBN = isbn;
         this.Publication = publication;
         this.price = price;
    }

}

class Library{
    Scanner sc = new Scanner(System.in);
    Books b[] = new Books[50];
    int n=0;
    // Adding all books at once
    void Accept_Books_Details(){
        System.out.println("Enter the number of books: ");
        n = sc.nextInt();
        sc.nextLine(); 
    
        for(int i = 0; i < n; i++){
            System.out.println("Enter Details for book "+(i+1));
            System.out.println("Enter name of Book: ");
            String BookName = sc.nextLine();
            System.out.println("Enter the author name: ");
            String AuthorName = sc.nextLine();
            System.out.println("Enter the ISBN No.: ");
            int isbn = sc.nextInt();
            sc.nextLine();           
            System.out.println("Enter Publication: ");
            String Publication = sc.nextLine();
            System.out.println("Enter Price: ");
            int price = sc.nextInt();
            sc.nextLine();           
            
            b[i] = new Books(BookName, AuthorName, isbn, Publication, price);
        }
    }
    
    // 1. Add a new Book
    void add_new_book(){
    
        if(n==0){
            Accept_Books_Details();
        }
        else if(n>=b.length){
            System.out.println("Library is Full.");
        }
        else{
            System.out.println("Enter name of Book: ");
            String BookName = sc.nextLine();
            System.out.println("Enter the author name: ");
            String AuthorName = sc.nextLine();
            System.out.println("Enter the ISBN No.: ");
            int isbn = sc.nextInt();
            sc.nextLine();           
            System.out.println("Enter Publication: ");
            String Publication = sc.nextLine();
            System.out.println("Enter Price: ");
            int price = sc.nextInt();
            sc.nextLine();           
            b[n] = new Books(BookName, AuthorName, isbn, Publication, price);
            n++;
        }
    }
    //2. Sorting Operation using Bubble sort
    void sort_books(){
        Books temp;
          for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(b[j].ISBN >= b[j+1].ISBN){
                    temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
          }
          System.out.println("Sorted ISBN Successfully.");
        }
    
    // 3. Searching operation using linear search
    void search_Author(){
         System.out.println("Enter Name of Author: ");
         String key = sc.nextLine();
         Boolean found = false;
         for(int i=0;i<n;i++){
            if(key.equals(b[i].AuthorName)){
                System.out.println("Name of Book: "+b[i].BookName+"\nName of Author: "+b[i].AuthorName+"\nISBN: "+b[i].ISBN+"\nPublication: "+b[i].Publication+"\nPrice: "+b[i].price);
                found = true;
            }
         }
         if(found==false){
            System.out.println("Author not found");
         }
    }
    // 4. Searching operation using Binary search 
    void search_ISBN(){
      int start =0, end=n-1, mid,key;
      boolean found=false;
      System.out.println("Enter the ISBN: ");
      key = sc.nextInt();
      sc.nextLine();
      while(start<=end){
        mid = (start+end)/2;
        if(b[mid].ISBN<key){
            start = mid+1;
        }
        else if(b[mid].ISBN > key){
            end = mid-1;
        }
        else{
            System.out.println("Name of Book: "+b[mid].BookName+"\nName of Author: "+b[mid].AuthorName+"\nISBN: "+b[mid].ISBN+"\nPublication: "+b[mid].Publication+"\nPrice: "+b[mid].price);
                found = true;
                break;
                
        }
      }
      if(found==false){
        System.out.println("Book not found.");
      }
    }
    //6. Dipslaying Books details
    void Display_Book_Details(){
        for(int i=0;i<n;i++){
            System.out.println("--------Book: "+(i+1)+"--------");
            System.out.println("Name of Book: "+b[i].BookName+"\nName of Author: "+b[i].AuthorName+"\nISBN: "+b[i].ISBN+"\nPublication: "+b[i].Publication+"\nPrice: "+b[i].price);
        }
    }

    }
   

public class assignment1 {
    public static void main(String[] args){
        Library l = new Library();
        int c;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter\n 1. to Add all books\n 2. to add new book\n 3. to Sort ISBN\n 4. Search Book\n 5. Search Author\n 6. Display all books");
		    c = sc.nextInt();
            switch(c){
                case 1:
                  l.Accept_Books_Details();
                  break;
                case 2:
                  l.add_new_book();
                  break;
                case 3:
                  l.sort_books();
                  break;
                case 4:
                  l.search_ISBN();
                  break;
                case 5:
                  l.search_Author();
                  break;
                case 6:
                  l.Display_Book_Details();
                  break;
            }
            System.out.println("Enter 1 to continue: ");
            c = sc.nextInt();
            sc.nextLine();
        }while(c==1);
    }
}

/*  OUTPUT
Enter
 1. to Add all books 
 2. to add new book  
 3. to Sort ISBN     
 4. Search Book      
 5. Search Author    
 6. Display all books
1
Enter the number of books: 
2
Enter Details for book 1
Enter name of Book:     
JAVA
Enter the author name: 
Raghav Kumar
Enter the ISBN No.: 
23
Enter Publication: 
Vikas
Enter Price: 
230
Enter Details for book 2
Enter name of Book:
DSA
Enter the author name: 
Rahi raut
Enter the ISBN No.: 
12
Enter Publication: 
Navneet
Enter Price: 
300
Enter 1 to continue: 
1
Enter
 1. to Add all books
 2. to add new book
 3. to Sort ISBN
 4. Search Book
 5. Search Author
 6. Display all books
6
--------Book: 1--------
Name of Book: JAVA
Name of Author: Raghav Kumar
ISBN: 23
Publication: Vikas
Price: 230
--------Book: 2--------
Name of Book: DSA
Name of Author: Rahi raut
ISBN: 12
Publication: Navneet
Price: 300
Enter 1 to continue:
1
Enter
 1. to Add all books
 2. to add new book
 3. to Sort ISBN
 4. Search Book
 5. Search Author
 6. Display all books

2
Enter name of Book: 
C++
Enter the author name: 
Om Kapoor
Enter the ISBN No.: 
3
Enter Publication: 
youvn
Enter Price: 
400
Enter 1 to continue: 
1
Enter
 1. to Add all books
 2. to add new book
 3. to Sort ISBN
 4. Search Book
 5. Search Author
 6. Display all books
6
--------Book: 1--------
Name of Book: JAVA
Name of Author: Raghav Kumar
ISBN: 23
Publication: Vikas
Price: 230
--------Book: 2--------
Name of Book: DSA
Name of Author: Rahi raut
ISBN: 12
Publication: Navneet
Price: 300
--------Book: 3--------
Name of Book: C++
Name of Author: Om Kapoor
ISBN: 3
Publication: youvn
Price: 400
Enter 1 to continue:
1
Enter
 1. to Add all books
 2. to add new book
 3. to Sort ISBN
 4. Search Book
 5. Search Author
 6. Display all books
3
Sorted ISBN Successfully.
Enter 1 to continue:
1
Enter
 1. to Add all books
 2. to add new book
 3. to Sort ISBN
 4. Search Book
 5. Search Author
 6. Display all books
6
--------Book: 1--------
Name of Book: C++
Name of Author: Om Kapoor
ISBN: 3
Publication: youvn
Price: 400
--------Book: 2--------
Name of Book: DSA
Name of Author: Rahi raut
ISBN: 12
Publication: Navneet
Price: 300
--------Book: 3--------
Name of Book: JAVA
Name of Author: Raghav Kumar
ISBN: 23
Publication: Vikas
Price: 230
Enter 1 to continue:
1
Enter
 1. to Add all books
 2. to add new book
 3. to Sort ISBN
 4. Search Book
 5. Search Author
 6. Display all books
4
Enter the ISBN: 
23
Name of Book: JAVA
Name of Author: Raghav Kumar
ISBN: 23
Publication: Vikas
Price: 230
Enter 1 to continue:
1
Enter
 1. to Add all books
 2. to add new book
 3. to Sort ISBN
 4. Search Book
 5. Search Author
 6. Display all books
5
Enter Name of Author: 
Rahi raut
Name of Book: DSA
Name of Author: Rahi raut
ISBN: 12
Publication: Navneet
Price: 300
Enter 1 to continue:
0
 */