import java.util.Scanner;

public class AdvanceArray {
    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.err.printf("A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.err.printf("B[%d][%d] = ", row, col);
                B[row][col] = input.nextInt();
            }

        }
        System.out.println("\n");
        System.err.printf("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.err.printf("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + B[row][col]);
            }
            System.out.println();
        }
        System.err.printf("A+B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + (A[row][col] + B[row][col]));
            }
            System.out.println();
        }

    }

}
