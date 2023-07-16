public class ReverseString {
    public static void main(String[] args) {
        String input = "pots&pans II";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }
    public static String reverseString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);

    }

}
