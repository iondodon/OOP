package com.ion.lab7;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter a text of at least three sentences:");
        Text text1 = new Text();
        System.out.print("Number of sentences: ");
        System.out.println(text1.getNumberSentences());
        System.out.print("Number of words: ");
        System.out.println(text1.getNumberWords());
        System.out.print("Number of consonants: ");
        System.out.println(text1.getNumberConsonants());
        System.out.print("Number of vowels: ");
        System.out.println(text1.getNumberVowels());
        System.out.print("Top 5 words: ");
        System.out.println(text1.getTop5Words());
    }

}
