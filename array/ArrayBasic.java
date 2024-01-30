import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        for (int x : number) {
            sum += x;
        }
        System.out.println("sum :" + sum);
        System.out.println("sum :" + sum / number.length);

        int max = number[0];
        for (int x : number) {
            if (max < x) {
                max = x;
            }

        }
        System.out.println(max);
        input.close();

    }

}