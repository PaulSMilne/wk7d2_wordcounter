package com.codeclan.paulmilne.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class CountWords {

    private String mSentence;

    public CountWords(String sentence) {
        this.mSentence = sentence;
    }

    public String getSentence() {
        return this.mSentence;
    }

    public int countWords(){
        String words = getSentence();
        String[] wordList = words.split(" ");
        int count = wordList.length;
        return count;
    }



}
