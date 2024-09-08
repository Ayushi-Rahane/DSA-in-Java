public class binary_search {

    static int binary_search_func(int[] arr, int key){
         int start=0, end=arr.length-1;
         
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
         

    }
    public static void main(String[] args){
        int[] arr = {16,12,5,4,3};
        int key=3;
        int index =binary_search_func(arr,key);

        if(index==-1){
            System.out.println("MAtch not found");
        }
        else{
            System.out.println(key+" match found at index position: "+index);
        }
    }
}
