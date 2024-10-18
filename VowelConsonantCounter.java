public class VowelConsonantCounter {
    public static int[] countVowelsAndConsonants(String s) {
        int vowels = 0, consonants = 0;
        String lowerCaseString = s.toLowerCase();
        for (char c : lowerCaseString.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[] {vowels, consonants};
    }

    public static void main(String[] args) {
        String[] testCases = {"hello", "world", "Java", "Programming"};
        for (String test : testCases) {
            int[] result = countVowelsAndConsonants(test);
            System.out.println("String: " + test + " | Vowels: " + result[0] + " | Consonants: " + result[1]);
        }
    }
}
