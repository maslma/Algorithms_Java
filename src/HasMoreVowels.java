public class HasMoreVowels {
    public static void main(String[] args) {
        String input = "Hello World";
        boolean hasMoreVowels = hasMoreVowels(input);
        System.out.println("Has more vowels: " + hasMoreVowels);
    }
    public static boolean hasMoreVowels(String s) {
        if (s.isEmpty()) {
            return false;
        }
        char firstChar = Character.toLowerCase(s.charAt(0));
        boolean isVowel = firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
        int vowels = hasMoreVowels(s.substring(1)) ? 1 : 0;
        int consonants = 1 - vowels;
        return vowels > consonants;
    }
}
