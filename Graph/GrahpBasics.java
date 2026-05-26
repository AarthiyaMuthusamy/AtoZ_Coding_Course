package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GrahpBasics {

    static class Graph{
        int vertices;
        ArrayList<ArrayList<Integer>> adj;

        public Graph(int v){
           vertices = v;
           adj = new ArrayList<>();

            for (int i = 0; i < v; i++) {
                adj.add(new ArrayList<>());
            }
        }

        public void addEdge(int u, int v){
            adj.get(u).add(v);
            //for weighted graph
            adj.get(v).add(u);
        }

        public void print(){
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " -> ");
                for (int neighbour : adj.get(i)){
                    System.out.print(neighbour + " ");
                }
                System.out.println();
            }
        }


         void dfs(int start) {
             //mark first node as visited
             boolean[] Visited = new boolean[vertices];
             System.out.println("Dfs Traversal");
             getHelper(start, Visited);

         }

         void getHelper(int node, boolean[] visited) {
             visited[node] = true;
             System.out.print(node + " ");
             for (int neighbour : adj.get(node)) {
                 if (!visited[neighbour]) {
                     getHelper(neighbour, visited);
                 }
             }
         }

         void dfsStack(int start){
            boolean[] visited = new boolean[vertices];
             Stack<Integer> stack = new Stack<>();
             stack.push(start);

             while (!stack.isEmpty()){
                 int node = stack.pop();
                 if(!visited[node]) {
                     visited[node] = true;
                     System.out.println(node + " ");

                     for (int neighbour : adj.get(node)) {
                         if (!visited[neighbour]) {
                             stack.push(neighbour);
                         }
                     }
                 }
             }

         }


         void bfs(int start){
             boolean[] Visited = new boolean[vertices];
             Queue<Integer> q = new LinkedList<>();
             Visited[start] = true;
             q.add(start);
             System.out.println("bfs Traversal");

             while (!q.isEmpty()){
                int node =  q.poll();
                 System.out.println(node +" ");
                 for (int neighbour : adj.get(node)) {
                     if (!Visited[neighbour]) {
                         Visited[neighbour]= true;
                         q.add(neighbour);
                     }
                 }
             }



        }
    }

    public static void main(String[] args){
        Graph graph = new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);

        graph.print();
        graph.dfs(0);
        graph.bfs(0);
       // graph.dfsStack(0);

    }
}
