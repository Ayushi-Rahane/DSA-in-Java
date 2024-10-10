import java.util.*;
class Solution{
    ArrayList <Integer> result;
    void solve(int i, int[] arr, int[] temp){
        if(i>=arr.length){
            result.add(temp);
        }
        temp.add(arr[i]);
        solve(i+1,arr,temp);
        temp.remove(lastElement)
        solve(i+1,arr,temp);
    }
}
public class assignment4{
    public static void main(String[] args){

    }
}