import java.util.*;
class cheapestflight {
    static class Edge {int v,cost; Edge(int v,int c){this.v=v;this.cost=c;}}
    static int cheapestCost(int n,int[][] flights,int src,int dst){
        List<List<Edge>> graph=new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int[] f:flights) graph.get(f[0]).add(new Edge(f[1],f[2]));
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE); dist[src]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.add(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] cur=pq.poll(); int u=cur[0],d=cur[1];
            if(u==dst) return d;
            for(Edge e:graph.get(u)){
                if(d+e.cost<dist[e.v]){
                    dist[e.v]=d+e.cost;
                    pq.add(new int[]{e.v,dist[e.v]});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[][] flights={{0,1,100},{1,2,100},{0,2,500}};
        System.out.println(cheapestCost(3,flights,0,2)); // 200
    }
}