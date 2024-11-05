//package stack;
import java.util.*;
class stack1{
    int top,size;
    char stk[];
    stack1(int size){
        this.size = size;
        stk = new char[size];
        top=-1;
    }

    void push(char c){
        if(top>size-1){
            System.out.println("Stack is full");
        }
        else{
            stk[++top]=c;
        }
    }

    char pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            return stk[top--];
        }
        return '\0';
    }

}
public class infix_to_postfix{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression: ");
         char exp[] =  sc.nextLine().toCharArray();
      //  char exp[] = "(a+b)".toCharArray();
        ArrayList<Character> op = new ArrayList<>();
        int size = exp.length;
        stack1 s = new stack1(size);


        for(int i=0;i<size;i++){
            if(exp[i]=='{' || exp[i]=='(' || exp[i]=='[')
            {
                s.push(exp[i]);
            }
            else if(exp[i]=='+' || exp[i]=='-' || exp[i]=='/' || exp[i]=='*' || exp[i]=='^' ){
                if(s.top == -1 || (s.stk[s.top] == '(' || s.stk[s.top] == '{' || s.stk[s.top] == '[')) {
                    s.push(exp[i]);
                }
                
                else{
                    if((s.stk[s.top]=='+' || s.stk[s.top]=='-') && (s.stk[s.top]=='+' || s.stk[s.top]=='-')){
                           op.add(s.pop());
                           s.push(exp[i]);
                    }
                    else if((s.stk[s.top]=='+' || s.stk[s.top]=='-') && (exp[i]=='/' || exp[i]=='*' || exp[i]=='^')){
                        s.push(exp[i]);
                    }
                    else if((s.stk[s.top]=='/' || s.stk[s.top]=='*') && (s.stk[s.top]=='/' || s.stk[s.top]=='*' || s.stk[s.top]=='^')){
                        op.add(s.pop());
                        s.push(exp[i]);
                    }
                    else if((s.stk[s.top]=='/' || s.stk[s.top]=='*') && (s.stk[s.top]=='^')){
                        s.push(exp[i]);
                    }
                    
                }
                
            }
            else if(exp[i]==')'){
                while(s.stk[s.top]!='('){
                    op.add(s.pop());
                }
            }
            else if(exp[i]=='}'){
                while(s.stk[s.top]!='{'){
                    op.add(s.pop());
                }
            }
            else if(exp[i]==']'){
                while(s.stk[s.top]!='['){
                    op.add(s.pop());
                }
            }
            else{
                op.add(exp[i]);
            }
        }
          System.out.println("Displaying postfix: ");
               for(char i:op){
                  System.out.println(i);
               }
      }
}