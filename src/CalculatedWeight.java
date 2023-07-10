
import java.util.*;
public class CalculatedWeight {
    public void calculate(int n, int m, int arr [][]){
        EdgeWeightedGraph farms = new EdgeWeightedGraph(n* m);

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < m; j++) {
                int v = k * m + j;
                if (j < m - 1) {
                    int w = k * m + j + 1;
                    int weight = arr[k][j] ^ arr[k][j + 1];
                    farms.addEdge(new Edge(v, w, weight));
                }
                if (k < n - 1) {
                    int w = (k + 1) * m + j;
                    int weight = arr[k][j] ^ arr[k + 1][j];
                    farms.addEdge(new Edge(v, w, weight));
                }
            }
        }
        PrimMSTAlgorithm p = new PrimMSTAlgorithm(farms);
        double total = 0.0;

        for (Edge e : p.mst()) {
            total += e.getWeight();
        }
        System.out.println((int)total);


    }

}

