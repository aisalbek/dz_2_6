package com.example.dz_2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView vxod;
    private TextView dobroPojalavat;
    private TextView vpolniteVxod;
    private TextView iliZaregistiruites;
    private EditText veditePochtu;
    private EditText vediteParol;
    private Button voyti;
    private TextView zabylParol;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vxod = findViewById(R.id.text1);
        dobroPojalavat =findViewById(R.id.text2);
        vpolniteVxod =findViewById(R.id.text3);
        iliZaregistiruites =findViewById(R.id.text4);
        veditePochtu =findViewById(R.id.text5);
        vediteParol =findViewById(R.id.text6);
        voyti =findViewById(R.id.text7);
        zabylParol =findViewById(R.id.text8);

        veditePochtu.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (veditePochtu.getText().toString().isEmpty()) {
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.seryi));
                }else {
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.oreng));

                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        vediteParol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (vediteParol.getText().toString().isEmpty()) {
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.seryi));
                }else {
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.oreng));

                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        voyti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (veditePochtu.getText().toString().equals("admin") && vediteParol.getText().toString().equals("admin")){
                    vxod.setVisibility(View.GONE);
                    vpolniteVxod.setVisibility(View.GONE);
                    iliZaregistiruites.setVisibility(View.GONE);
                    veditePochtu.setVisibility(View.GONE);
                    vediteParol.setVisibility(View.GONE);
                    voyti.setVisibility(View.GONE);
                    zabylParol.setVisibility(View.GONE);

                    Toast.makeText(MainActivity.this, "успешно ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "не верно логин или порол ! ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}