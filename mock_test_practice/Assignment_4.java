import java.util.*;

public class Assignment_4{
	static boolean subset(int[] set, int n, int sum){
        if(sum==0){
			return true;
		}
		else if(n==0){
			return false;
		}
		else if(set[n-1]>sum){
			return subset(set,n-1,sum);
		}
		return (subset(set,n-1,sum) || subset(set,n-1,sum-set[n-1]));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lemgth of array");
		int n = sc.nextInt();
		int[] set = new int[n];
		sc.nextLine();
		System.out.println("Enter elements in array: ");
		for(int i=0;i<n;i++){
             set[i]=sc.nextInt();
		}
        System.out.println("Enter sum");
		int sum = sc.nextInt();
		sc.nextLine();
	    System.out.println(subset(set,n,sum));
	}
}