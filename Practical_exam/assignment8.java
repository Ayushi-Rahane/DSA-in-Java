import java.util.*;
class graph{
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    void create(){
        System.out.println("Enter the number of vertex: ");
         int  n=sc.nextInt();
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
    boolean isSafe(int node, ArrayList<ArrayList<Integer>> G, int[] color, int i){
        for(int it:G.get(node)){
            if(color[it]==i){
                return false;
            }
        }
        return true;
    }
   boolean solve(int node, ArrayList<ArrayList<Integer>> G, int m, int[] color){
    if(node==G.size()){
    return true; // all colored.
     }

     for(int i=1;i<=m;i++){
        if(isSafe(node,G,color,i)){
                color[node]=i;
                if(solve(node+1,G,m,color))
                {
                    return true;
                }

                color[node]=0; //backtrack

        }
     }
     return false;
   }
   boolean graphColoring(int m, ArrayList<ArrayList<Integer>> G){
      int[] color = new int[G.size()]; 
      return solve(0,G,m,color);
   }
}
public class assignment8 {
    public static void main(String[] args){
         graph g = new graph();
         g.create();
         Scanner sc = new Scanner(System.in);
         g.display();
         System.out.println("Enter the number of colors: ");
         int m = sc.nextInt();
         sc.nextLine();
         boolean result = g.graphColoring(m,g.adj);
         if(result){
            System.out.println("Can color");
         }
         else{
            System.out.println("Not");
         }
    }
}
