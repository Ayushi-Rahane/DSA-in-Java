import java.util.*;

class Stack{
    int top;
    int  binary[];
    Stack(int size){
       top=-1;
       binary = new int[size];
    }

    void push(int data){
        if(top>=binary.length-1){
            System.out.println("Stack is full");
        }
        else{
            binary[++top] = data;
        }
    }
     int pop(){
        if(top<=-1){
            System.out.println("Stack is empty");
        }
        else{
            return binary[top--];
        }
        return -1;
     }
}
public class decimal_to_binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(4);
        System.out.println("Enter the Decimal number: ");
        int num = sc.nextInt();
        sc.nextLine();
        while(num>0){
             st.push(num%2);
              num = num/2;
        }
        while(st.top!=-1){
            System.out.println(st.pop());
        }

    }
}
