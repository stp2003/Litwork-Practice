package contests.module2;

import java.util.Scanner;

public class TransformAndCompare {

    //??
    public static boolean canTransform(String start, String end) {
        StringBuilder s = new StringBuilder();
        StringBuilder e = new StringBuilder();
        for (char c : start.toCharArray()) {
            if (c != 'X') {
                s.append(c);
            }
        }
        for (char c : end.toCharArray()) {
            if (c != 'X') {
                e.append(c);
            }
        }
        if (!s.toString().contentEquals(e))
            return false;
        int count = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'R') {
                count++;
            } else if (end.charAt(i) == 'R') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        count = 0;
        for (int i = 0; i < start.length(); i++) {
            if (end.charAt(i) == 'L') {
                count++;
            } else if (start.charAt(i) == 'L') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String e = scanner.nextLine();

        System.out.println(canTransform(s, e));
    }
}
