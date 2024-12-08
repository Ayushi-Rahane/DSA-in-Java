import java.util.*;
public class BFS {

static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj){
    ArrayList<Integer> bfs = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    boolean[] vis = new boolean[v];
    q.add(0);
    vis[0]=true;
    while(!q.isEmpty()){
        int node = q.poll();
        bfs.add(node);
        for(int it: adj.get(node)){
            if(!vis[it]){
               vis[it]=true;
               q.add(it);
            }
        }
    }
    return bfs;
}
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex: ");
        int v = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the number edges: ");
        int e = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Adjacent pairs: ");
        for(int i=0;i<e;i++){
            System.out.println("Pair:"+(i+1));
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        ArrayList<Integer> bfs = bfsGraph(v,adj);
        System.out.println("BFD Traversal: ");
        for(int i: bfs){
            sysout
        }


    }
}
