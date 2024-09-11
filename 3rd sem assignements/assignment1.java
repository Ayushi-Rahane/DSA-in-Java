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
    void Accept_Books_Details(){
     System.out.println("Enter the number of books: ");
     int n = sc.nextInt();
     
     for(int i=0;i<n;i++){
        System.out.println("Enter name of Book: ");
        String BookName = sc.nextLine();
        System.out.println("Enter the author name: ");
        String AuthorName = sc.nextLine();
        System.out.println("Enter the ISBN No.: ");
        int isbn = sc.nextInt();
        System.out.println("Enter Publication: ");
        String Publication = sc.nextLine();
        System.out.println("Enter Price: ");
        int price = sc.nextInt();
        b[i] = new Books(BookName, AuthorName, isbn, Publication, price);
     }
    }
}

public class assignment1 {
    public static void main(String[] args){
        Library l = new Library();
        int c;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter\n 1. to Add all books\n 2. to add new book\n 3. to Sort Books based on ISBN\n 4. Search Book\n 5. Search Author\n 6. Display all books");
		    c = sc.nextInt();
            switch(c){
                case 1:
                  l.Accept_Books_Details();
                  break;

            }
            System.out.println("Enter 1 to continue: ");
        }while(c==1);
    }
}
