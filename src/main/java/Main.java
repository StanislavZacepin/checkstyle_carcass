import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        boolean isFormatted = false;
        String request = "пожалуйста форматируйте код";
        // исправили теперь build succcessful
        if (isFormatted) {
        }
        String test = "(])";
        String test2 = "()[]{}";
        String test3 = "(]";


        System.out.println(isValid(test));
        System.out.println(isValid(test2));
        System.out.println(isValid(test3));
    }

    public static boolean isValid(String s) {


        Set<Character> leftSymbol = Set.of('(', '[', '{');
        Set<Character> rightSymbol = Set.of(')', ']', '}');

        if (s.length() < 1 || rightSymbol.contains(s.charAt(0))) {

            return false;

        }

        Deque<Character> leftStack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            if (leftSymbol.contains(c)) {
                leftStack.addFirst(c);
            } else if (c == ')' && !leftStack.isEmpty() && leftStack.peek() == '(') {
                leftStack.poll();
            } else if (c == ']' && !leftStack.isEmpty() && leftStack.peek() == '[') {
                leftStack.poll();
            } else if (c == '}' && !leftStack.isEmpty() && leftStack.peek() == '{') {
                leftStack.poll();
            } else {
                return false;
            }
        }
        return leftStack.size() == 0;
    }
}
