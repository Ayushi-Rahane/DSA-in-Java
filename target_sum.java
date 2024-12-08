import java.util.*;

class Result {
    public static int findTargetSumWays(List<Integer> arr, int tgt) {
        int n = arr.size();
        int count = 0;

        
        int totalCombinations = 1 << n;

        for (int mask = 0; mask < totalCombinations; mask++) {
            int sum = 0;

            
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr.get(i); 
                } else {
                    sum -= arr.get(i); 
                }
            }

          
            if (sum == tgt) {
                count++;
            }
        }

        return count;
    }
}

public class target_sum {
    public static void main(String[] args) {
        Result r = new Result();
        Scanner sc = new Scanner(System.in);

        // Input the array
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter array elements (end with -1):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break; // Sentinel value to end input
            arr.add(num);
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        // Call the method and print the result
        System.out.println(r.findTargetSumWays(arr, target));
    }
}
