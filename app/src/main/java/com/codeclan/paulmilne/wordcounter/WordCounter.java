package com.codeclan.paulmilne.wordcounter;

//import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by user on 08/11/2016.
 */

public class WordCounter extends AppCompatActivity { //start WordCounter class statement

    EditText mSentenceEditText;
    Button mCountButton;
    CountWords mSentence;
    TextView mAnswerText;

    @Override
    protected void onCreate(Bundle savedInstanceState){ // start onCreate method
        Log.d("WordCounter", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSentenceEditText = (EditText) findViewById(R.id.sentence_text);

        mCountButton = (Button) findViewById(R.id.count_words);

        mCountButton.setOnClickListener(new View.OnClickListener() { //open brackets, open curley brackets
            @Override
            public void onClick(View view) { //open OnClick(View view)
                Log.d("WordCounter", "Count button clicked!");
                String sentence = mSentenceEditText.getText().toString();
                Log.d("EightBall", "The sentence entered was '" + mSentence + "'");
                mSentence = new CountWords(sentence);
                int wordCount = mSentence.countWords();

                mAnswerText = (TextView) findViewById(R.id.answer_text);

                int answer = wordCount;

                mAnswerText.setText(answer);
            } //close onclick(View view)

        }); //close curly brackets, close brackets

    } //end onCreate method

} //end WordCounter class statement
