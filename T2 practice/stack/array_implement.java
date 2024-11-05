import java.util.*;

class stack_array{
    int size,top;
    int stk[] ;
    stack_array(int size){
        this.size = size;
        top=-1;
        stk = new int[size];
    }

    void push(){
        Scanner sc = new Scanner(System.in);
        if(top<size-1){
            System.out.println("Enter element to push: ");
            stk[++top] = sc.nextInt();
            sc.nextLine();
        }
        else{
            
            System.out.println("Stack is full");
       }

    }

    void pop(){
        if(top<=-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Element is poped: "+stk[top--]);
        }
    }

    void display(){
        if(top<=-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.println(stk[i]);
            }
        }
    }
}
public class array_implement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Enter size of Stack: ");
        int size = sc.nextInt();
        sc.nextLine();
        stack_array sa = new stack_array(size);
        do{
            System.out.println("Enter 1. to add push\n 2. to pop\n 3. To display: ");
            c = sc.nextInt();
            sc.nextLine();
            switch(c){
                case 1:
                  sa.push();
                  break;
                case 2:
                  sa.pop();
                  break;
                case 3:
                  sa.display();
                  break;
                                
            }
            System.out.println("Enter 0 to continue");
            c = sc.nextInt();
            sc.nextLine();
        }while(c==0);
        


    }
}