package laba7;

public class zadanie1 {
    public static void main(String[] args) {
        StringBuffer word = new StringBuffer("aaaabaaaabaaabbbba"); //abababa
        int chr_index = 0;
        while (chr_index < word.length() - 1) {
            if (word.charAt(chr_index) == word.charAt((chr_index + 1))) {
                word = word.delete(chr_index, chr_index + 1);
                //chr_index -= 1;
            }
            chr_index += 1;
        }
        System.out.println(word);
    }
}
