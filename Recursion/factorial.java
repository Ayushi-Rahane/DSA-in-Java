import java.util.*;
public class factorial {
     
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number: ");
           int num = sc.nextInt();
           System.out.println("Factorial: "+fact(num));
           
     }    
     static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
   
       }
}
