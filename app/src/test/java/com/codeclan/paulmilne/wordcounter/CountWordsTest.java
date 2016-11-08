package com.codeclan.paulmilne.wordcounter;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 08/11/2016.
 */

public class CountWordsTest {
    CountWords mSentence;

    @Before
    public void before() {
        mSentence = new CountWords("Four score and seven years ago");
    }

    @Test
    public void canGetSentence(){
        assertEquals("Four score and seven years ago", mSentence.getSentence());
    }

    @Test
    public void canCountWords(){
        int newWordCount = mSentence.countWords();
        assertEquals(6, newWordCount);
    }

}
