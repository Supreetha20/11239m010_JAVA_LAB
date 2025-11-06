import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3], B = new int[2][3], sum = new int[2][3], prod = new int[2][3];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
                B[i][j] = sc.nextInt();
                sum[i][j] = A[i][j] + B[i][j];
                prod[i][j] = A[i][j] * B[i][j];
            }
        print("Sum", sum);
        print("Product", prod);
    }

    static void print(String label, int[][] m) {
        System.out.println(label + ":");
        for (int[] r : m) {
            for (int v : r) System.out.print(v + "\t");
            System.out.println();
        }
    }
}