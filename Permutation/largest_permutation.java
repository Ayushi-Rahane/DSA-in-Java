import java.util.*;

public class largest_permutation {
     public static List<Integer> largestPermutation(int k, List<Integer> arr) {
       Collections.sort(arr);
       int i=0,temp;
       int j=arr.size()-1;
       while(i!=k){
          temp = arr.get(i);
          arr.set(i,arr.get(j));
          arr.set(j,temp);
          i++;
          j--;
       }
       return arr;

    }
    public static void main(String[] args){
       List<Integer> arr = new ArrayList<>(Arrays.asList(4, 2, 3, 5, 1));
       System.out.println(largestPermutation(1,arr));
    }
}
