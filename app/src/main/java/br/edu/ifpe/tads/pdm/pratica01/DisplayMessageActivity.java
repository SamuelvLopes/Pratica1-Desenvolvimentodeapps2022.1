package br.edu.ifpe.tads.pdm.pratica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent =getIntent();
        String message =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }
}