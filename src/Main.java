
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for (int t = 0; t < testCase; t++) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            int arr[][] = new int[n][m];

            int startn = scan.nextInt() - 1;
            int startm = scan.nextInt() - 1;
            int endn = scan.nextInt() - 1;
            int endm = scan.nextInt() - 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int v = scan.nextInt();
                    arr[i][j] = v;
                }
            }
            System.out.println();
            CalculatedWeight result = new CalculatedWeight();
            result.calculate(n,m,arr);
        }
    }
}
