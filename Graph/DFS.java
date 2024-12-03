import java.util.*;
public class DFS {
    static void function_dfs(int node, ArrayList<Integer> dfs, boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        dfs.add(node);
        for(int it: adj.get(node)){
            if(vis[it]==false){
                function_dfs(it,dfs,vis,adj);
            }
        }

    }
    static ArrayList<Integer> dfsGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        ArrayList<Integer> dfs = new ArrayList<>();
        
        function_dfs(0,dfs,vis,adj);
         return dfs;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertex: ");
        int v = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<v;i++){
          adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges: ");
        int e = sc.nextInt();

        sc.nextLine();
        for(int i=0;i<e;i++){
            System.out.println("Pair: "+(i+1));
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        ArrayList<Integer> dfs = dfsGraph(v,adj);
        System.out.println("Traversal DFS: ");
        for(int it: dfs){
            System.out.println(it);
        }
    }
}
