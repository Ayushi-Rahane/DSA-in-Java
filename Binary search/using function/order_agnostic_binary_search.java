public class order_agnostic_binary_search {

    static int order_agnostic(int[] arr,int data){
        int start=0,end=arr.length-1;
        int mid;

        while(start<=end){
            mid= (start+end)/2;
            if(arr[mid]==data){
                return mid;
            }
            else if(arr[0]<arr[arr.length-1]){ //for ascending
                if(arr[mid]<data){
                    start=mid+1; // search in right sublist
                }
                else{
                    end=mid-1;  // search in left sublist
                }
            }
            else{ //for descending
                if(arr[mid]<data){
                    end=mid-1; // search in left sublist
                }
                else{
                    start = mid+1;  // search in right sublist
                }
            }
        }
        return -1;

    }
   public static void main(String[] args)    {
    int[] arr1 = {1,2,3,45,47};
    int[] arr2 = {47,45,3,2,1};
    int data = 47;
    int index = order_agnostic(arr1,data);
    if(index==-1){
        System.out.println("Match not found");
    }
    else{
        System.out.println(data+" found at index position: "+index);
    }
   }
}
