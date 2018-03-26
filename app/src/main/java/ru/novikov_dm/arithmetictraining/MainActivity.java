package ru.novikov_dm.arithmetictraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void onClickPlus(View view) {
        Intent intent = new Intent(MainActivity.this, PlusActivity.class);
        startActivity(intent);
    }

    public void onClickMinus(View view) {
        Intent intent = new Intent(MainActivity.this, MinusActivity.class);
        startActivity(intent);
    }

    public void onClickMultiply(View view) {
        Intent intent = new Intent(MainActivity.this, MultiplyActivity.class);
        startActivity(intent);
    }

    public void onClickDivide(View view) {
        Intent intent = new Intent(MainActivity.this, DivideActivity.class);
        startActivity(intent);
    }

    public void onClickPlusAndMinus(View view) {
        Intent intent = new Intent(MainActivity.this, PlusAndMinusActivity.class);
        startActivity(intent);
    }

    public void onClickMultiplyAndDivide(View view) {
        Intent intent = new Intent(MainActivity.this, MultiplyAndDivideActivity.class);
        startActivity(intent);
    }

    public void onClickAllOperation(View view) {
        Intent intent = new Intent(MainActivity.this, AllOperationActivity.class);
        startActivity(intent);
    }

}
