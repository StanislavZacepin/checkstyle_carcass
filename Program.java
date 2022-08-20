public class Program {
    public static void main(String[] args) {
        String test = "()";
        String test2 = "()[]{}";
        String test3 = "(]";

        System.out.println(isValid(test));
        System.out.println(isValid(test2));
        System.out.println(isValid(test3));
    }
    public boolean isValid(String s) {

        return false;
    }
}
