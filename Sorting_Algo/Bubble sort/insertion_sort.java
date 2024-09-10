public class insertion_sort {
    static void insertionSort(int[] a){
        int len = a.length;
        int key,j;
        for(int i=1;i<len;i++){
            key = a[i];
            j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("Displaying sorted array: ");
        for(int i=0;i<len;i++){
            System.out.println(a[i]);
        }

    }
    public static void main(String[] args){
        int a[] = {1,2,34,5,11,6};
        insertionSort(a);
    }
}
