package module4.lab1;

import java.util.Scanner;

public class ClumsyFactorial {

    //??
    public static int clumsy(int n) {

        if (n <= 2) {
            return n;
        }

        int[] stack = new int[]{n};
        n--;

        String[] operations = new String[]{"*", "//", "+", "-"};
        int opIndex = 0;

        while (n > 0) {
            if (operations[opIndex].equals("*")) {
                stack[stack.length - 1] *= n;
            } else if (operations[opIndex].equals("//")) {
                stack[stack.length - 1] /= n;
            } else if (operations[opIndex].equals("+")) {
                stack = append(stack, n);
            } else {
                stack = append(stack, -n);
            }

            n--;
            opIndex = (opIndex + 1) % 4;
        }

        return sum(stack);
    }


    public static int[] append(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = element;
        return newArr;
    }


    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = clumsy(n);
        System.out.println(result);
    }
}
