package com.example.message;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_KEY_MESSAGE = "MESSAGE_KEY";
    private EditText edEntradaTexto;
    View tvMensagem;
    TextView tvResposta;
    EditText ed_mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.bt_enviar);
        tvMensagem = findViewById(R.id.tv_recebida);
        tvResposta = findViewById(R.id.ed_mensagem2);
        edEntradaTexto =findViewById(R.id.ed_mensagem);

        botao.setOnClickListener(
            String tv_recebida = edEntradaTexto.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("KEY_MESSAGE", (Parcelable) tv_recebida);

            startActivityForResult(intent, 1000);
        })
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000) {
            if (resultCode == Activity.RESULT_OK){
                String resposta = data.getStringExtra(MainActivity2.KEY_RESPOSTA);
                tvMensagem2.setText(resposta);
            }
        }
    }
















