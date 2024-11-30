import java.util.*;
/*
class Solution{
    
   int mergesort(ArrayList<Integer> arr, int low, int high){
    if(low>=high){
        return 0;
    }
    int mid = low + (high - low) / 2;
      int leftside = mergesort(arr,low,mid);
      int rightside=mergesort(arr,mid+1,high);
      int mergeside =   merge(arr,low,mid,high);
      return leftside+rightside+mergeside;
    
   }
  
   int merge(ArrayList<Integer> arr, int low, int mid, int high){
    int swapcount=0;
    ArrayList<Integer> temp = new ArrayList<>();
    int left=low, right=mid+1;
    while(left<=mid && right<=high){
        if(arr.get(left)<=arr.get(right)){
             temp.add(arr.get(left));
             left++;
             
        }
        else{
             temp.add(arr.get(right));
             right++;
             swapcount+= (mid - left + 1);
        }
        
    }
    while(left<=mid){
        temp.add(arr.get(left));
        left++;
        
    }
    while(right<=high){
        temp.add(arr.get(right));
        right++;
        
    }
   
    for (int i = low; i <= high; i++) {
        arr.set(i, temp.get(i - low));
    }
       return swapcount;
   }
}*/



class Result {

    /*
     * Complete the 'countInversions' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static long mergesort(List<Integer> arr, int low, int high){
    if(low>=high){
        return 0;
    }
    int mid = low + (high - low) / 2;
      long leftside = mergesort(arr,low,mid);
      long rightside=mergesort(arr,mid+1,high);
      long mergeside =   merge(arr,low,mid,high);
      return leftside+rightside+mergeside;
    
   }
   public static long merge(List<Integer> arr, int low, int mid, int high){
    long swapcount=0;
    List<Integer> temp = new ArrayList<>();
    int left=low, right=mid+1;
    while(left<=mid && right<=high){
        if(arr.get(left)<=arr.get(right)){
             temp.add(arr.get(left));
             left++;
             
        }
        else{
             temp.add(arr.get(right));
             right++;
             swapcount+= (mid - left + 1);
        }
        
    }
    while(left<=mid){
        temp.add(arr.get(left));
        left++;
        
    }
    while(right<=high){
        temp.add(arr.get(right));
        right++;
        
    }
   
    for (int i = low; i <= high; i++) {
        arr.set(i, temp.get(i - low));
    }
       return swapcount;
   }
    public static long countInversions(List<Integer> arr) {
    // Write your code here
    return mergesort(arr,0,arr.size()-1);


    }
}

public class main_merge_sort {
public static void main(String[] args)    {
   Result s = new Result();
   List<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 3, 1, 2));
    System.out.println(s.countInversions(arr));
}
}
