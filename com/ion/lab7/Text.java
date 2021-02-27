package com.ion.lab7;

import java.util.*;

public class Text {
    private int numberSentences;
    private int numberWords;
    private int numberConsonants;
    private int numberVowel;
    private ArrayList mostFrequentWords = new ArrayList();
    private ArrayList consonants = new ArrayList();
    private ArrayList vowels = new ArrayList();

    private String[] words = new String[1000];
    private int[] wordsFrequency = new int[1000];

    private Set<Character> endPunctuationMarks = new HashSet<>();
    private Set<Character> allConsonants = new HashSet<>();
    private Set<Character> allVowels = new HashSet<>();

    private String text;

    private Scanner sc = new Scanner(System.in);

    Text(){
        this.allVowels.addAll(Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'));
        this.allConsonants.addAll(
                Arrays.asList(
                    'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z',
                        'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z'
                )
        );
        this.endPunctuationMarks.addAll(
                Arrays.asList('.', '?', '!')
        );

        this.readText();
    }

    private void readText(){
        this.text = sc.nextLine();
    }

    public int getNumberSentences(){
        int nbSentences = 0;
        for(int i = 0; i < text.length(); i++){
            if(this.endPunctuationMarks.contains(this.text.charAt(i))){
                nbSentences++;
            }
        }
        return nbSentences;
    }

    public int getNumberWords(){
        this.words = this.text.split(" ");
        return this.words.length;
    }

    public int getNumberConsonants(){
        int nbConsonants = 0;
        for(int i = 0; i < this.text.length(); i++){
            if(this.allConsonants.contains(this.text.charAt(i))) {
                nbConsonants++;
            }
        }
        return nbConsonants;
    }

    public int getNumberVowels(){
        int nbVowels = 0;
        for(int i = 0; i < this.text.length(); i++){
            if(this.allVowels.contains(this.text.charAt(i))){
                nbVowels++;
            }
        }
        return nbVowels;
    }

    public ArrayList<String> getTop5Words(){
        this.words = this.text.split(" ");

        for(int i = 0; i < this.words.length; i++){
            this.words[i] = this.words[i].toLowerCase();
            if( this.endPunctuationMarks.contains( this.words[i].charAt(this.words[i].length() - 1) ) ){
                this.words[i] = this.words[i].substring(0, this.words[i].length() - 1);
            }
        }

        for(int i = 0; i < this.words.length - 1; i++){
            if(this.words[i] != null) {
                this.wordsFrequency[i] = 1;
                for (int j = i + 1; j < this.words.length; j++) {
                    if(this.words[i].equals(this.words[j])) {
                        this.wordsFrequency[i]++;
                        this.words[j] = null;
                    }
                }
            }
        }

        for(int i = 0; i < this.words.length - 1; i++){
            for(int j = i + 1; j < this.words.length; j++){
                if(this.words[i] != null && this.words[j] != null && this.wordsFrequency[j] > this.wordsFrequency[i]){
                    String auxWord = this.words[i];
                    this.words[i] = this.words[j];
                    this.words[j] = auxWord;

                    int auxFreq = this.wordsFrequency[i];
                    this.wordsFrequency[i] = this.wordsFrequency[j];
                    this.wordsFrequency[j] = auxFreq;
                }
            }
        }

        ArrayList<String> mostFrequentWord = new ArrayList<>();

        for(int i = 0; i < this.words.length && i < 5 && this.words[i] != null; i++){
            mostFrequentWord.add(this.words[i]);
        }

        return mostFrequentWord;
    }
}
