package org.example;

import java.lang.reflect.Type;
import java.util.*;

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

    /*** Write a function that takes in a string of one or more words,
     * and returns the same string, but with all words that have five
     * or more letters reversed.
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

    /***
     *  takes a list of non-negative integers and strings and returns
     *  a new list with the strings filtered out.
     * @param list
     * @return resultList
     */
    public static List<Object> filterList(final List<Object> list) {
        List<Object> resultList = new ArrayList<>();
        for(Object item : list){
            if(item.getClass().equals(Integer.class)){
                resultList.add(item);
            }
        }
        return resultList;
    }

    /***
     * Check to see if a string has the same amount of 'x's and 'o's.
     * The method must return a boolean and be case insensitive.
     * @param str
     * @return resultBool
     */
    public static boolean getXO (String str) {
        boolean resultBool = false;
        int countX = 0;
        int countO = 0;
        String lowerStr = str.toLowerCase();
        for(int i = 0; i < lowerStr.length(); i++){
            if(lowerStr.charAt(i) == 'x')
                countX++;
            else if(lowerStr.charAt(i) == 'o')
                countO++;
        }
        resultBool = countO == countX;
        return resultBool;
    }

    /***
     * Make a program that filters a list of strings and returns a list with only your friends name in it.
     * If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours!
     * Otherwise, you can be sure he's not...
     * @param x
     * @return resultList
     */
    public static List<String> friend(List<String> x){
        List<String> resultList = new ArrayList<>();
        for(String name : x){
            if(name.length() == 4)
                resultList.add(name);
        }
        return resultList;
    }

    /***
     * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
     * Leave punctuation marks untouched.
     * @param str
     * @return resultSentence
     */
    public static String pigIt(String str) {
        String resultSentence = "";
        String[] words = str.split(" ");
        int wordCount = words.length;
        int currentWord = 0;
        for(String word: words){
            if(word.matches("^[a-zA-Z]+$")){

                char startingLetter = word.charAt(0);
                char[] wordLetters = word.toCharArray();
                for(int i = 0; i < wordLetters.length-1; i++){
                    wordLetters[i] = wordLetters[i+1];
                }
                wordLetters[wordLetters.length-1] = startingLetter;
                String finalWord = String.valueOf(wordLetters);
                finalWord += "ay";
                if(wordCount-1 > currentWord){
                    currentWord++;
                    resultSentence += finalWord + " ";
                }
                else{
                    resultSentence += finalWord;
                }
            }
            else{
                resultSentence += word;
            }
        }
        return resultSentence;
    }

}
