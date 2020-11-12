package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import java.text.BreakIterator;

public class MainActivity2 extends AppCompatActivity {

    public static final String KEY_RESPOSTA = "RESPOSTA";

    EditText editText;
    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.ed_mensagem2);
        textViewMessage = findViewById(R.id.tv_recebida2);
        Button button = findViewById(R.id.bt_enviar2);

        String mensagem = getIntent().getStringExtra(MainActivity.TAG_KEY_MESSAGE);
        textViewMessage.setText(mensagem);
        //não to entendendo pq que o setOnClickListener não ta passando, nem o intent. Nos imports o negosso nem funciona.
        Intent intent;
        button.setOnClickListener(
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                String value = editText.getText().toString();
                intent.putExtra(KEY_RESPOSTA, value);
                setResult(Activity.RESULT_OK, intent);
                finish();
        })
}
