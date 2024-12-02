/*
 Implement Stack as ADT using linked list or array. Use the same ADT to
evaluate a given postfix expression and reverse a given string.
 */

 //USING ARRAY

import java.util.*;

class Stack{
    int top,size;
    char[] stack;
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
    
}
public class assignment3 {

  public static void main(String[] args)    {
      
  }
}
