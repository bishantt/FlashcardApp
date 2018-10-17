package com.example.bishantt.flashcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView questionView, answerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpLayouts();
        questionView.setOnClickListener(v -> effectForQView());
        answerView.setOnClickListener(v -> effectForAView());

    }

    private void setUpLayouts() {
        questionView = findViewById(R.id.Question_Text);
        answerView = findViewById(R.id.Answer_Text);
    }


    private void effectForQView() {
        questionView.setVisibility(View.GONE);
        answerView.setVisibility(View.VISIBLE);
    }

    private void effectForAView() {
        answerView.setVisibility(View.GONE);
        questionView.setVisibility(View.VISIBLE);
    }
}



