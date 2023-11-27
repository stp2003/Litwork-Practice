package contests.module1;

import java.util.Scanner;

public class RecursiveSuperDigitSum {

    //??
    public static int findSuperDigit(String number, int k) {

        String repeatedNumber = number.repeat(k);
        int sum = 0;

        for (char digit : repeatedNumber.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return calculateSuperDigit(sum);
    }


    public static int calculateSuperDigit(int number) {

        if (number < 10) {
            return number;
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return calculateSuperDigit(sum);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int k = scanner.nextInt();

        int superDigit = findSuperDigit(number, k);
        System.out.println(superDigit);
    }
}
