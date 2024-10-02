/*
 * 
 * Assignment no: 3
 * Submitted By:
 * NAME: Rahane Ayushi Madhukar
 * UCE: UCE2024014
 * DIV: B
 * Branch: B4
 * 
 * 
 * */


import java.util.*;
class Stack{
	int top,size;
	char stck[];
	//1. Stack Initialization
	Stack(int size){
		top = -1;
		this.size = size;
		stck =  new char[size];
		
	}
	//2. Checking whether Stack is full.
	int isfull() {
		if(top >= size-1) {
			return 1;
		}
		return 0;
	}
	
	//3. Checking whether Stack is empty.
	int isempty() {
		if(top<=-1) {
			return 1;
		}
		return 0;
	}

	//4. Push Operation for reverse function
	void push(char element) {
		if(isfull()==1) {
			System.out.println("stack is Full");
		}
		else {
			top++;
			stck[top] = element;
		}
	}
	
	//5. Pop Operation for reverse function
	char pop() {
		if(isempty()==1){
			System.out.println("Stack is Empty");
		}
		else {
			return stck[top--];
		}
		return '\0';
	}


	//6. Evaluation of Postfix Expression
	void evaluate(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression: ");
		String[] str = sc.nextLine().split(",");
		int[] stk = new int[str.length];
		int top=-1;
		for(int i=0;i<stk.length;i++){
			char c = str[i].charAt(0);
			if(Character.isDigit(c)){
				stk[++top]=c-'0';
			}
			else if(c=='+' || c=='-' || c=='/' || c=='*' || c=='^'){
				if(top<1){
					System.out.println("Insuffient Operands");
				}
				int op2 = stk[top--];
				int op1 = stk[top--];
				if(c=='+'){
					stk[++top]=op1+op2;
				}
				else if(c=='-'){
					stk[++top]=op1-op2;
				}
				else if(c=='*'){
					stk[++top]=op1*op2;
				}

				else if(c=='/'){
					if(op2==0){
						System.out.println("Error: Divide by Zero");
					}
					else{
						stk[++top]=op1/op2;
					}
				}
				else if(c=='^'){
					stk[++top]=(int)Math.pow(op1,op2);
				}

			}
			else{
				System.out.println("Unidentified Character: "+c);
			}

		}
		System.out.println("Output:");
		if(top==-1){
			System.out.println("Stack is empty");
		}
		else{

			for(int i=0;i<=top;i++){
				System.out.println(stk[i]);
			}
		}
	}
	
	//7. Reversing a String using Stack
	void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			push(str.charAt(i));
		}
		System.out.println("Reversed String: ");
		while(isempty()!=1){
              System.out.println(pop());
		}
		
	}
	
}
public class Assignment_3 {
public static void main(String[] args) {
	 Stack st = new Stack(10);
     int c;
     Scanner sc = new Scanner(System.in);
     do {
  	   System.out.println("Enter 1. to Evaluate 2. to Reverse ");
  	   c = sc.nextInt();
  	   sc.nextLine();
  	   switch(c) {
  	   case 1:
	       st.evaluate();
  		   break;
  	   case 2:
  		   st.reverse();
  		   break;
	    default:
		   System.out.println("Enter correct choice.");
  	   }
  	   System.out.println("Enter 1 to continue: ");
  	   c = sc.nextInt();
  	   
     }while(c==1);
	
}
}


/*
 OUTPUT:
Enter 1. to Evaluate 2. to Reverse 
1
Enter the Expression: 
1,2,+,4,^,4,/,2,*
Output:
40
Enter 1 to continue:
1
Enter 1. to Evaluate 2. to Reverse 
2
Enter the String: 
Ayuhsi
Reversed String: 
i
s
h
u
y
A
Enter 1 to continue:
0
 */