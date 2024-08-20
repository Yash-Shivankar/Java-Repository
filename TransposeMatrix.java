import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int m, n, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix:");
        m = sc.nextInt();
        n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the elements of matrix:");
        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                matrix[c][d] = sc.nextInt();
            }
        }
        int transpose[][] = new int[n][m];
        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                transpose[d][c] = matrix[c][d];
            }
        }
        System.out.println("Transpose of entered matrix:");
        for(c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                System.out.print(transpose[c][d]+"\t");
            }
            System.out.println();
        }
    }
}
