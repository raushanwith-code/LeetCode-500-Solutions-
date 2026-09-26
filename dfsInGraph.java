import java.util.*;
public class dfsInGraph {


    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    // DFS Function
    static void dfs(int node) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour);
            }
        }
    }

    public static void main(String[] args) {

        int n = 5; // Number of nodes (0 to 4)

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected Graph
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        System.out.print("DFS Traversal: ");
        dfs(0);
    }
}
    

