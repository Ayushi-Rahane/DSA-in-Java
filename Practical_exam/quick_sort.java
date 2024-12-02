import java.util.*;
public class quick_sort {
    static void quicksort(int[] a, int low, int high){
        if(low<high){
            int pivotindex = partition(a,low,high);
            quicksort(a,low,pivotindex-1);
            quicksort(a,pivotindex+1,high);
        }
    }
    static int partition(int[] a, int low, int high){
        int i = low+1, j=high, pivot=a[low], temp;
        while(i<j){
            while(i<=high && a[i]<=pivot){
                i++;
            }
            while(j>=low && a[j]>pivot){
                j--;
            }
            if(i<j){
                temp = a[i];
                a[i]=a[j];
                a[j] = temp;
            }
        }
        a[low]=a[j];
        a[j]=pivot;
        return j;

        
    }
public static void main(String[] args){
    int[] a = {2,4,13,1,5};
    quicksort(a,0,a.length-1);
    System.out.println(Arrays.toString(a));
}    
}
