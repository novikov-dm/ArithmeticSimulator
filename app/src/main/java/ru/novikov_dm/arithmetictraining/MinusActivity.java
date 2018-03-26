package ru.novikov_dm.arithmetictraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MinusActivity  extends AppCompatActivity  {
    private AdView mAdView;
    private TextView mTextViewAnswer;
    private TextView mTextViewQuestion;
    private TextView mTextViewLevel;
    String answer = "";
    int max = 10;
    int b = (int) (Math.random() * (max+1));
    int a = (int) (Math.random() * (max+1)) + b;
    int level = 0, score = 0;
    private static final String KEY_ANSWER = "ANSWER";
    private static final String KEY_MAX = "MAX";
    private static final String KEY_A = "A";
    private static final String KEY_B = "B";
    private static final String KEY_SCORE = "SCORE";
    private static final String KEY_LEVEL = "LEVEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulator);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mTextViewAnswer = findViewById(R.id.textViewAnswer);
        mTextViewQuestion = findViewById(R.id.textViewQuestion);
        mTextViewLevel = findViewById(R.id.textViewLevel);
        if (savedInstanceState != null) {
            answer = savedInstanceState.getString(KEY_ANSWER);
            max = savedInstanceState.getInt(KEY_MAX);
            a = savedInstanceState.getInt(KEY_A);
            b = savedInstanceState.getInt(KEY_B);
            score = savedInstanceState.getInt(KEY_SCORE);
            level = savedInstanceState.getInt(KEY_LEVEL);
            mTextViewLevel.setText("Level: " + level);
            mTextViewQuestion.setText(a + " - " + b + " = ");
        }else{
            mTextViewLevel.setText("Level: " + level);
            mTextViewQuestion.setText(a + " - " + b + " = ");
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_ANSWER, answer);
        outState.putInt(KEY_MAX, max);
        outState.putInt(KEY_A, a);
        outState.putInt(KEY_B, b);
        outState.putInt(KEY_SCORE, score);
        outState.putInt(KEY_LEVEL, level);
    }
    public void onClick01(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "1";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick02(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "2";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick03(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "3";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick04(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "4";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick05(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "5";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick06(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "6";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick07(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "7";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick08(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "8";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick09(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "9";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClick00(View view) {
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n < 5) {
            answer = answer + "0";
            mTextViewAnswer.setText(answer);
        }
    }

    public void onClickDelete(View view) {
        mTextViewAnswer.setHint("?");
        answer = mTextViewAnswer.getText().toString();
        int n = answer.length();
        if (n > 0) {
            answer = answer.substring(0, n - 1);
        }
        mTextViewAnswer.setText(answer);
    }

    public void onClickEnter(View view) {
        int task = a - b;
        int solution = -1;
        if (answer.length() > 0) {
            solution = Integer.parseInt(answer);
        }
        if (task == solution) {
            mTextViewAnswer.setText("");
            mTextViewAnswer.setHint("?");
            a = (int) (Math.random() * (max+1));
            b = (int) (Math.random() * (max+1));
            a = a + b;
            mTextViewQuestion.setText(a + " - " + b + " = ");
            score++;
            if (score == 5){
                level++;
                if (level > 10){
                    Intent intent = new Intent(MinusActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    score = 0;
                    mTextViewLevel.setText("Level: " + level);
                    max = max + 10;
                }
            }
        }
        else {
            mTextViewAnswer.setText("");
            mTextViewAnswer.setHint("?");
            score--;
        }
    }
}
