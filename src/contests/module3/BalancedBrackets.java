package contests.module3;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    //??
    public static boolean isClosingBracket(char c) {

        return (c == ')' || c == '}' || c == ']');
    }

    public static boolean areBracketsBalanced(String expression) {

        Stack<Character> stack = new Stack<>();

        for (char bracket : expression.toCharArray()) {

            if (!isClosingBracket(bracket)) {
                stack.push(bracket);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((top == '(' && bracket != ')') ||
                        (top == '{' && bracket != '}') ||
                        (top == '[' && bracket != ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] inputs = inputLine.split(",");


        for (String input : inputs) {

            if (areBracketsBalanced(input.trim())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
