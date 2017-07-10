package com.visionstech.clickabletext;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String RS = getResources().getString(R.string.note);
        SpannableString ss = new SpannableString(RS);
        String one ="available starting";
        String two ="some basic idea";
        int firstIndex = RS.indexOf(one);
        int secondIndex = RS.indexOf(two);
        TextView textView = (TextView) findViewById(R.id.hello);
        ClickableText.setClickable(textView, ss, firstIndex, firstIndex+one.length(), this, NextActivity.class);
        ClickableText.setClickable(textView, ss, secondIndex, secondIndex+two.length(), this, NextActivity.class);

    }

}

