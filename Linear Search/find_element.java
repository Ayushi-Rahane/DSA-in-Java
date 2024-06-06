/*Find element in array*/
import java.util.*;
public class find_element{

    public static void main(String[] args){
        int[] a = {3,4,2,5,1,7,4,87,34,23,787};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target item: ");
        int num = sc.nextInt();
        int pos=0,flag=0;

        for(int i=0;i<a.length;i++){
            if(num==a[i]){
               pos=i;
               flag=1;
            }
        }
        if(flag==1){
            System.out.println(num+" element found at position "+pos);
        }else{
            System.out.println(num+ " Not found");
        }

    }
}