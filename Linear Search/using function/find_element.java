                                                         
public class find_element {

    static int Linear_search(int[] a, int target){
           if(a.length==0){
            return -1;
           }
           else{
            for(int i=0;i<a.length;i++){
                if(a[i]==target){
                    return i;
                }
            }
           }
           return -1;
    }
   public static void main(String[] args)    {
   int[] a = {1,2,12,21,34,54,54,6};
   int target = 2;
   int i = Linear_search(a, target);
   if(i==-1){
      System.out.println(target+ " not found");
   }
   else{
    System.out.println(target+" found at index: "+i);
   }

   }
}
