/*
Title: Library Book data maintenance
Problem Statement:
College Library maintains records of books. Write a program using
JAVA for following operations :
1. Add a new book details.
2. Search a book in library based on ISBN number (Binary search).
3. Sort books based on ISBN numbers. (Bubble or Insertion sort ,
Quick sort)
4. List all books of specific author (Linear search).
Use appropriate data structure.
Input:
1. Number of books
2. Book details
1. Name
2. ISBN number
3. Author Name
4. Publication
5.Price
 */

 import java.util.*;

 class book{
    int isbn;
    String bname, aname, pname;
    book(int isbn, String b, String a, String p ){
        this.isbn = isbn;
        bname = b;
        aname = a;
        pname = p;
    }
 }
 class Library{
    int n;
    book[] b = new book[100];
    Scanner sc = new Scanner(System.in);
       void accept(){
        System.out.println("Enter the total number of books: ");
        n =sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter Book name: ");
            String bname = sc.nextLine();
            System.out.println("Enter ISBN: ");
            int isbn = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Publication: ");
            String pname = sc.nextLine();
            System.out.println("Enter author name: ");
            String aname = sc.nextLine();
            b[i] = new book(isbn, bname, aname, pname);
           System.out.println("Book "+(i+1)+" added successfully..");
        }
       }
       
       void display(){
        System.out.println("Displaying..");
        if(n==0){
            System.out.println("Library is empty");
        }
        else{
            for(int i=0;i<n;i++){
                System.out.println(b[i].bname+" "+b[i].aname+" "+b[i].isbn+" "+b[i].pname);
            }
        }
       }

       void search_isbn(){
          System.out.println("Enter isbn: ");
          int isbn = sc.nextInt();
          int start = 0, end =n-1,mid;
          while(start<=end){
            mid = (start+end)/2;
            if(b[mid].isbn>isbn){
                end = mid+1;
            }
            else if(b[mid].isbn<isbn){
                start=mid-1;
            }
            else{
                System.out.println("Book found: ");
                System.out.println(b[mid].bname+" "+b[mid].aname+" "+b[mid].isbn+" "+b[mid].pname);
                return;
            }
          }
          System.out.println("No Book found");
       }
 }
public class assignment1 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c;
    Library l = new Library();
    do{
        System.out.println("Enter 1. to accept\n 2. to display\n 3. to search using binary search\n 4. to search using linear search \n 5. to sort");
        c = sc.nextInt();
        sc.nextLine();
        switch(c){
            case 1:
                l.accept();
                break;
            case 2:
                l.display();
                break;
            case 3:
                l.search_isbn();
        }
        System.out.println("Enter 0 to continue: ");
        c = sc.nextInt();
    }while(c==0);

 }   
}
