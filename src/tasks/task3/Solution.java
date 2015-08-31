package tasks.task3;


/*
    https://codility.com/c/feedback/B5JZQ8-MHF

*/
public class Solution {

    public String solution(String sentence) {

        StringBuilder sentenceBuilder = new StringBuilder();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            for (int j = word.length() - 1; j >= 0; j--)
                sentenceBuilder.append(word.charAt(j));

            if (i < words.length - 1)
                sentenceBuilder.append(" ");
        }

        return sentenceBuilder.toString();
    }
}
