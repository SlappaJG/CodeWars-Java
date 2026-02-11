package org.example;

public class Problems {

    /***
     * Return input string repeated [repeat] number of times.
     * @param repeat
     * @param string
     * @return result
     */
    public static String repeatStr(final int repeat, final String string) {
        String result = string.repeat(repeat);
        return result;
    }

    /*** Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed
     *
     * @param sentence
     * @return result
     */
    public String spinWords(String sentence) {
        String result = "";
        String[] listOfWords = sentence.split(" ");
        System.out.println("List of words:");
        for(int wordNumber = 0; wordNumber <= listOfWords.length-1; wordNumber++){
            String word  = listOfWords[wordNumber];
            System.out.println(word);

            if(word.length() >= 5){
                String newWord = "";
                for(int i = word.length()-1; i >= 0; i--) {
                    newWord += String.valueOf(word.charAt(i));
                }
                if(wordNumber == listOfWords.length-1)
                    result = result.concat(newWord);
                else
                    result = result.concat(newWord + " ");
            }
            else {
                if(wordNumber == listOfWords.length-1)
                    result = result.concat(word);
                else
                    result = result.concat(word + " ");
            }
        }
        return result;
    }


}
