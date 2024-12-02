/*
 Implement Stack as ADT using linked list or array. Use the same ADT to
evaluate a given postfix expression and reverse a given string.
 */

 //USING ARRAY

import java.util.*;

class Stack{
    int top,size;
    char[] stack;
    Scanner sc = new Scanner(System.in);
    Stack(int size){
        this.size=size;
        top=-1;
        stack = new char[size];
    }
    boolean isfull(){
        if(top>=size-1){
            return true;
        }
        return false;
    }
    boolean isempty(){
        if(top<=-1){
            return true;
        }
        return false;
    }
    
    void push(char c){
        if(isfull()){

            System.out.println("Stack is full");
        }
        else{
            stack[++top]=c;
        }
    }
    char  pop(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        else{
            return stack[top--];
        }
        return '\0';
    }
    void reverseString(){
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            push(str.charAt(i));
        }
        System.out.println("Reversing String: ");
        while(!isempty()){
            System.out.print(pop());
        }
        System.out.println();
    }

}
public class assignment3 {

  public static void main(String[] args)    {
    Stack st = new Stack(10);
    int c;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Enter 1. to Evaluate 2. to Reverse ");
        c = sc.nextInt();
        sc.nextLine();
        switch(c) {
        case 1:
         // st.evaluate();
            break;
        case 2:
            st.reverseString();
            break;
       default:
          System.out.println("Enter correct choice.");
        }
        System.out.println("Enter 1 to continue: ");
        c = sc.nextInt();
        
    }while(c==1);
  }
}
