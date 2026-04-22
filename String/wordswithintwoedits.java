package String;

import java.util.ArrayList;
import java.util.List;

public class wordswithintwoedits {
    public static void main(String[] args) {
        // queries = ["word","note","ants","wood"]
        // dictionary = ["wood","joke","moat"]

        String[] queries = { "word", "note", "ants", "wood" };
        String[] dictionary = { "wood", "joke", "moat" };

        twoEditWords(queries, dictionary);
    }

    static void twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if (countDistinct(dictionary[j], queries[i]) <= 2) {
                    list.add(queries[i]);
                    break;
                }
            }
        }
        System.out.println(list);
    }

    static int countDistinct(String word1, String word2) {
        int countNumberofDistinct = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                countNumberofDistinct += 1;
            }
        }

        return countNumberofDistinct;
    }
}
