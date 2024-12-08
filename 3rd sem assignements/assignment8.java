/*

 * 
 * Assignment no: 8
 * Submitted By:
 * NAME: Rahane Ayushi Madhukar
 * UCE: UCE2024014
 * DIV: B
 * Batch: B4
 * 

 */
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

    

    boolean isSafe(int node,ArrayList<ArrayList<Integer>> G, int[] color, int i ){
        for(int adjvertex : G.get(node)){
               if(color[adjvertex]==i){
                return false; // if same color is detected to adjacent vertex then return false
               }
        }
        return true;
    }
    boolean solve(int node, ArrayList<ArrayList<Integer>> G, int[] color, int m){
        if(node==G.size()){
            return true; // all nodes has been colored
        }

        for(int i=1;i<=m;i++){
            if(isSafe(node,G,color,i)){
                 
                color[node]=i; // colors the vextex

                //call next vertex(node)
                if(solve(node+1,G,color,m)){
                    return true;
                }

                color[node]=0; //backtracking. It will uncolor the vertex
            }
        }
        return false;
    }
    boolean graphColoring(ArrayList<ArrayList<Integer>> G, int m){

        int[] color = new int[G.size()];
        return solve(0,G,color,m);
    }
}
public class assignment8 {
   public static void main(String[] args) {
        graph g = new graph();
         g.create();
         g.display();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of colors: ");
         int m = sc.nextInt();
         sc.nextLine();
         boolean result = g.graphColoring(g.adj, m);
         if(result){
            System.out.println("It is possible to color all vertex of graph with "+m+"color");
         }
         else{
            System.out.println("It is not possible to color all vertex of graph with "+m+"color");
         }

   }
}

/*
Output:
PS G:\Java\DSA in Java\3rd sem assignements> java -cp . assignment8            
Enter the number of vertex: 
4
Enter the number of edges: 
5
Enter Adjacent Pairs: 
Pair 1

0
1
Pair 2
0
2
Pair 3
0
3
Pair 4
1
2
Pair 5
1
3
Vertex: 0
->1->2->3
Vertex: 1
->0->2->3
Vertex: 2
->0->1
->0->1
Vertex: 4

Enter the number of colors:
4
It is possible to color all vertex of graph with 4color
PS G:\Java\DSA in Java\3rd sem assignements> java -cp . assignment8
Enter the number of vertex: 
4
Enter the number of edges: 

5
Enter Adjacent Pairs: 
Pair 1

0
1
Pair 2
0
2
Pair 3
0
3
Pair 4
1
2
Pair 5
1
3
Vertex: 0
->1->2->3
Vertex: 1
->0->2->3
Vertex: 2
->0->1
Vertex: 3
->0->1
Vertex: 4

Enter the number of colors: 
2
It is not possible to color all vertex of graph with 2color
*/