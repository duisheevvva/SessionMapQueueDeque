import java.util.HashMap;
import java.util.Map;

public class Task3Main {
    public static void main(String[] args) {
        String[] languages = new String[]{"Java", "Go","Java", "JS", "PHP", "Python", "C++", "JS"};

        Map<String, Integer> countedWord = getCountWord(languages);
        for (Map.Entry<String, Integer> entry: countedWord.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static Map<String, Integer> getCountWord(String[] words) {
        Map<String, Integer> countWord = new HashMap<>();

        for (String word : words) {
            countWord.put(word, countWord.getOrDefault(word, 0) + 1);
        }
        return countWord;
    }
}
