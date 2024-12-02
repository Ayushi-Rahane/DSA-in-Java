public class insertion_sort {
public static void main(String[] args){
    int[] arr = {12, 11, 13, 5, 6};
    int j,key;
    for(int i=1;i<arr.length;i++){
        j = i-1;
        key = arr[i];
        while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                
                j--;
        }
        arr[j+1]=key;
    }
    System.out.println("Displaying: ");
    for(int i:arr){
        System.out.println(i);
    }
}    
}
