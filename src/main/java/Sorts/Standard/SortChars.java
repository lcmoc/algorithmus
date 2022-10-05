package Sorts.Standard;

public class SortChars {
    String word = "abendessen";
    char[] chars = word.toCharArray();

    public SortChars() {
        System.out.println(chars);
        int last = chars.length - 1;

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];

            chars[i] = chars[last - i];
            chars[last - i] = temp;
        }
    }
}