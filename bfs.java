import java.util.*;

public class bfs {

    private int v;
    private ArrayList<ArrayList<Integer>> p;

    bfs(int v) {
        this.v = v;
        p = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            p.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        p.get(u).add(v);
        p.get(v).add(u);
    }

    public void display() {
        System.out.println(p);
    }

    public void bfs(int node) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        visited[node] = true;
        queue.offer(node);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int val = queue.poll(); // Correct method is poll()
            System.out.print(val + " ");

            for (int neighbor : p.get(val)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        bfs b = new bfs(6);
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 3);
        b.addEdge(2, 4);
        b.addEdge(3, 5);
        b.display();
        b.bfs(0); // Start BFS from node 0
    }
}
