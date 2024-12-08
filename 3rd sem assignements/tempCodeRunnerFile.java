void display(){
        for(int i=0;i<adj.size();i++){
            System.out.println("Vertex: "+i);
            for(int j : adj.get(i)){
                System.out.print("->"+j);
            }
            System.out.println();
        }
    }