
public class bubble_sort {
public static void main(String[] args)    {
    int[] arr = {2,3,5,6,42,4,2};
    int temp;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
               temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            }
        }
    }
    System.out.println("Displaying: ");
    for(int i:arr){
        System.out.println(i);
    }
}
}
