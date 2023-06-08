package laba7;
import java.util.ArrayList;
import java.util.Collections;


public class zadanie2 {
    public static void main(String[] args) {
        String sentences = "Муж гад. Муж объелся груш муж"; // объелся груш.
        String[] sentences_split = sentences.split("\\. ");
        ArrayList<String> deleted_words = new ArrayList<>();
        ArrayList<String> first_sentence_words = to_ArrayList(sentences_split[0].toLowerCase());
        ArrayList<String> sec_sentence_words = to_ArrayList(sentences_split[1].toLowerCase());
        print_sentences(sentences_split);
        print_result(first_sentence_words, sec_sentence_words, deleted_words);
    }


    public static void print_sentences(String[] sentences) {
        for (String sentence: sentences) {
            System.out.printf("%s\n", sentence);
        }
    }


    public static ArrayList<String> to_ArrayList(String sentence){
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] words = sentence.split(" ");
        for (String word: words) {
            arrayList.add(word);
        }
        return arrayList;
    }


    public static void print_result(ArrayList<String> first_sentence, ArrayList<String> second_sentence, ArrayList<String> deleted_words) {
        for (int i = 0; i < first_sentence.size(); i++ ) {
            for (int j = 0; j < second_sentence.size(); j++) {
                if (first_sentence.get(i).equalsIgnoreCase(second_sentence.get(j))) {
                    deleted_words.add(first_sentence.get(i));
                    first_sentence.removeAll(Collections.singleton(first_sentence.get(i)));
                    second_sentence.removeAll(Collections.singleton(second_sentence.get(j)));
                }
            }
        }
        System.out.println("remaining words: " + String.join(" ", first_sentence) + "\n" + String.join(" ", second_sentence));
        System.out.println("deleted words: " + String.join(" ", deleted_words));
    }
}
