package com.codeclan.paulmilne.wordcounter;

import android.content.Intent;
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

public class WordCounter extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mShakeButton;
    CountWords mSentence;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("WordCounter", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
