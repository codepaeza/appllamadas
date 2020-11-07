package com.paez.edwin.appllamadas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void llamada01(View v) {
        Intent intent1 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:123"));
        startActivity(intent1);
    }
    public void llamada02(View v) {
        Intent intent2 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3057100852"));
        startActivity(intent2);
    }
    public void llamada03(View v) {
        Intent intent3 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3014439450"));
        startActivity(intent3);
    }
    public void llamada04(View v) {
        Intent intent4 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3102674147"));
        startActivity(intent4);
    }
    public void llamada05(View v) {
        Intent intent5 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3213991187"));
        startActivity(intent5);
    }
    public void llamada06(View v) {
        Intent intent6 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3123052468"));
        startActivity(intent6);
    }
    public void llamada07(View v) {
        Intent intent7 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3103167015"));
        startActivity(intent7);
    }
    public void llamada08(View v) {
        Intent intent8 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:0313077011"));
        startActivity(intent8);
    }
}
