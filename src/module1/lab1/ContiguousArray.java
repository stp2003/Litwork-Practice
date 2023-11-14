package module1.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class ContiguousArray {


    //??
    public static int findMaxLength(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int zeros = 0, ones = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                if (zeros == ones) {
                    count = Math.max(count, j - i + 1);
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numsList = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numsList.add(num);
        }

        int[] nums = new int[numsList.size()];
        for (int i = 0; i < numsList.size(); i++) {
            nums[i] = numsList.get(i);
        }

        int maxLength = findMaxLength(nums);

        System.out.println(maxLength);

    }
}
