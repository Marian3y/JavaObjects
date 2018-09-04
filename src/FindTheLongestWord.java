// Java program to demonstrate insertions in TreeSet
import java.util.*;

class FindTheLongestWord
{
    public static void main (String[] args)
    {
        String strB ="Arianne F Hernandez";

        String[] words = strB.split(" ");
        String maxWord=words[0];
        String minWord = words[0];
        for(String word: words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
                System.out.println("The Shortest word is: "+maxWord+" "+" = "+maxWord.length());
            }
            if (word.length() < minWord.length()) {
                minWord = word;
                System.out.println("The longest word is: "+minWord+" "+" = "+minWord.length());
            }
        }


    }
}