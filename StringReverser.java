public class StringReverser {
    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String[] testCases = {"hello", "world", "Java", "Programming"};
        for (String test : testCases) {
            System.out.println("Original: " + test + " | Reversed: " + reverse(test));
        }
    }
}
