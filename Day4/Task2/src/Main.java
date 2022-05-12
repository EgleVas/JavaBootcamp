import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = Text.TEXT.split("\\s+");

        HashMap<String, Integer> wordCount= new HashMap<String, Integer>();
        for (String word : words) {
            if (wordCount.containsKey(word.toLowerCase())) {
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
            } else {
                wordCount.put(word.toLowerCase(), 1);
            }
        }

        int unicWordCount = 0;
        for(int value : wordCount.values()){
            if (value == 1) {
                unicWordCount++;
            }
        }
        System.out.println("There are " + unicWordCount + " unique words in the text ");
    }
}