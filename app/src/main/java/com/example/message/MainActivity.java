package com.example.message;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_KEY_MESSAGE = "MESSAGE_KEY";
    private EditText edEntradaTexto;
    View mensagem;
    TextView tvMensagem2;
    EditText ed_mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.bt_enviar);
        mensagem = findViewById(R.id.tv_recebida);
        tvMensagem2 = findViewById(R.id.ed_mensagem2);
        edEntradaTexto =findViewById(R.id.ed_mensagem);

        botao.setOnClickListener(
            String mensagem = edEntradaTexto.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("KEY_MESSAGE", (Parcelable) mensagem);

            startActivityForResult(intent, 1000);
        })
}
