public class search_2D_array {
    
   static int[] linear_search(int[][] a,int key){
    for(int row=0;row<a.length;row++){
        for(int col=0;col<a[row].length;col++){
             if(a[row][col]==key){
                return new int[]{row,col};
             }
        }
    }
    return new int[]{-1,-1};
   }
    public static void main(String[] args){
        int[][] a = {{1,2,3,2},{4,6,7,8},{12,123,43}};
        int key = 123;
        int[] i = linear_search(a,key);
        if(i[0]==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println(key+ "found at row: "+i[0]+" and col: "+i[1]);
        }
    }
}
