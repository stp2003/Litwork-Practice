package module3.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMax {

    //??
    public static long[] calculateMinMaxSum(int[] numbers) {
        long[] result = new long[2];
        Arrays.sort(numbers);

        //** for minimum ->
        for (int i = 0; i < 4; i++) {
            result[0] += numbers[i];
        }

        //*** for maximum ->
        for (int i = 2; i < 6; i++) {
            result[1] += numbers[i];
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        long[] result = calculateMinMaxSum(numbers);
        System.out.println(result[0] + " " + result[1]);
    }
}
