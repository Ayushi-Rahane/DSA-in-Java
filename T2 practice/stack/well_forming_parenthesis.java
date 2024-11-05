import java.util.*;
class stack{
   int top, size;
   char stk[];
   stack(int size){
       this.size =size;
       top=-1;
       stk = new char[size];
   }

   void push(char c){
       if(top>size-1){
        System.out.println("Stack is fulll");
       }
       else{
        stk[++top]  = c;
       }
   }

   void  pop(){
    if(top<=-1){
        System.out.println("Stack is empty");
    }
    else{
          top--;
    }
  
   }


}
public class well_forming_parenthesis{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Expression");
         char exp[] = sc.nextLine().toCharArray();

         int size = exp.length;
         stack s = new stack(size);
         for(int i=0;i<size;i++){
            if(exp[i]=='{' || exp[i]=='[' || exp[i]=='('){
                s.push(exp[i]);
            }
            else if(exp[i]=='}' && s.stk[s.top]=='{'){
                s.pop();
            }
            else if(exp[i]==']' && s.stk[s.top]=='['){
                s.pop();
            }
            else if(exp[i]==')' && s.stk[s.top]=='('){
                s.pop();
            }
         }
         if(s.top==-1){
            System.out.println("It is balaned ex");
         }
         else{
            System.out.println("It is not");
         }
    }
}