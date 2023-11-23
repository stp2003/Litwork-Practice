package module3.lab1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Cookies {

    //??
    public static int minStepsToTargetSweetness(int[] candies, int targetSweetness) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int candy : candies) {
            minHeap.offer(candy);
        }

        int steps = 0;

        while (minHeap.peek() < targetSweetness) {

            int leastSweet = minHeap.poll();
            int secondLeastSweet = minHeap.poll();

            int combinedSweetness = leastSweet + 2 * secondLeastSweet;

            minHeap.offer(combinedSweetness);

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSweetness = scanner.nextInt();

        int n = scanner.nextInt();
        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        int result = minStepsToTargetSweetness(candies, targetSweetness);
        System.out.println(result);
    }
}
