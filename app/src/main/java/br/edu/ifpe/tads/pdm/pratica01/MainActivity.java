package br.edu.ifpe.tads.pdm.pratica01;

import static android.content.ClipData.newIntent;

import android.content.Intent;
import android.view.Display;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Pratica01.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {

        Intent intent =new Intent(this,DisplayMessageActivity.class);

        EditText editText =findViewById(R.id.edit_message);
        String message =editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}