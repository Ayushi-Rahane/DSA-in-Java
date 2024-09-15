import java.util.*;

public class quick_sort {
    static void quickSort(int[] a,int low, int high){
         
         if(low<high){
            int pivotIndex = partition(a, low, high);
            
            quickSort(a, low, pivotIndex-1);
            quickSort(a, pivotIndex+1,high);
         }

    }
    static int partition(int[] a, int low, int high){
        int i=low+1,j=high,pivot=a[low],temp;
        while(i<=j) {
            while(i<=high && a[i]<=pivot){
                i++;
            }
            while( j>= low && a[j]>pivot){
                j--;
            }
            if(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[low] = a[j];
        a[j] = pivot;
        return j;
    }
    public static void main(String[] args){
        quick_sort q = new quick_sort();
        int a[] = {3,4,21,2,12,415,13,45};
        
        q.quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
