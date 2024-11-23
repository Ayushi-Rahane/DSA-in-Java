import java.util.*;

class graph{
    Scanner sc = new Scanner(System.in);
    ArrayList <ArrayList<Integer>> adj = new ArrayList<>();
    int n;
    void create()    {
        System.out.println("Enter the number of vertex: ");
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        
        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Adjacent Pairs: ");
        for(int i=0;i<e;i++){
           System.out.println("Pair "+(i+1));
           int x = sc.nextInt();
           int y = sc.nextInt();
           adj.get(x).add(y);
           adj.get(y).add(x);
        }
    }

    void display(){
        for(int i=0;i<adj.size();i++){
            System.out.println("Vertex: "+i);
            for(int j : adj.get(i)){
                System.out.print("->"+j);
            }
            System.out.println();
        }
    }
    
}
public class Adj_List_representation {
   public static void main(String[] args) {
        graph g = new graph();
         g.create();
         g.display();
   }
}
