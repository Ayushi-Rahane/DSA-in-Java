import java.util.*;
public class stack1 {
    int a[];
    int top;
    int size;
    stack1(){
        top=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack");
        size=sc.nextInt();
        this.a[] = new int[size];
    }
    void push(int num){
        if(top>=size){
            System.out.println("Stack is Full");
        }
        else{
            top++;
            a[top]=num;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(a[top]+" is deleted");
            top--;
      }
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
        System.out.println("Displaying...");
        for(int i=0;i<=top;i++){
            System.out.println(a[i]);
        }
    }
    }
    public static void main(String[] args){
        stack1 st = new stack1();
        Scanner sc = new Scanner(System.in);
        int c;
        do{
            System.out.println("Enter Choice: \n 1. To push \n 2. to pop \n 3. to display: ");
            c = sc.nextInt();
        switch(c){
            case 1:
              System.out.println("Enter number to push: ");
              st.push(sc.nextInt());
              break;
            
            case 2:
              st.pop();
              break;


            case 3:
              st.display();
              break;

        }
        System.out.println("Enter 0 to continue: ");
        c = sc.nextInt();
    }while(c==0);

    }
}
