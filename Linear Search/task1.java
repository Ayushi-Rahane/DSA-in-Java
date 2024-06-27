import java.util.Scanner;

public class task1 { 
    public static void main(String[] args) {
        System.out.println(myfunction());

        
    }
    public static String myfunction(){
        Scanner sc = new Scanner(System.in);
        String[] str= new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter string:");
            str[i]= sc.nextLine();

        }
        String temp;
        for(int i=0;i<5-1;i++){
            for(int j=0;j<5-1-i;j++){
                if(Integer.parseInt(str[j]) > Integer.parseInt(str[j+1])){
                    temp = str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        return str[0]+" is smallest nd "+ str[5] + "is largest number";
    }
    
}
