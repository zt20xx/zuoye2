package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RatingBar;
import android.os.Bundle;
import android.widget.TextView;

public class rating_bar_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        TextView textView = findViewById(R.id.textView);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText("您已给出"+rating + "星");
            }
        });
    }
}