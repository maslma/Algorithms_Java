//P-2.35 Write a Java program that inputs a list of words, separated by whitespace, and
//        outputs how many times each word appears in the list. You need not worry about
//        efficiency at this point, however, as this topic is something that will be addressed
//        later in this book.
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of words separated by whitespace: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
            else {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}