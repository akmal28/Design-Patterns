package com.akmal.androidbasic;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonOne, buttonTwo;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonOne:
                textView.setText("Button One Clicked!");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"));
                startActivity(intent);
                break;
            case R.id.buttonTwo:
                Intent intent2 = new Intent(this, SecondActivity.class);
                startActivityForResult(intent2, 123);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getExtras();
                String name = bundle.getString("name");
                int age = bundle.getInt("age",0);
                String text = String.format(Locale.ENGLISH,"Hello %s! You're %d years old!", name, age);
                textView.setText(text);
            }
        }
    }
}