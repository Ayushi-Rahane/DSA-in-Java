public class bubble_sort {
    static void bubbleSort(int[] a){
        int temp, len=a.length-1;
        for(int i=0;i<len;i++){
           for(int j=0;j<len-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
           }
        }
        System.out.println(a.length);
        for(int i=0;i<=len;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args)    {
        int[] a = {15,5,11,4};
        bubbleSort(a);
    }
}
