package com.example.aplicandoestilos;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import org.intellij.lang.annotations.JdkConstants;

public class MainActivity extends AppCompatActivity {

    // Declaración de RadioGroup
    RadioGroup rbtgColores;

    // Declaración de CheckBox
    CheckBox chbNegrita;
    CheckBox chbCursiva;

    // Declaración de TextView para representar la cadena resultado
    TextView txtResultado;

    // Declaración de SwitchCompat
    SwitchCompat swModoOscuro;
    SwitchCompat swInformacionLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancia de RadioGroup
        rbtgColores = findViewById(R.id.rbtgColores);

        // Instancia de CheckBox
        chbNegrita = findViewById(R.id.chbNegrita);
        chbCursiva = findViewById(R.id.chbCursiva);

        // Instancia de TextView
        txtResultado = findViewById(R.id.txtResultado);

        // Instancia de SwitchCompat
        swModoOscuro = findViewById(R.id.swModoOscuro);
        swInformacionLog = findViewById(R.id.swInformacionLog);

        rbtgColores.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtRojo){
                    txtResultado.setTextColor(Color.RED);
                } else if(checkedId == R.id.rtbVerde){
                    txtResultado.setTextColor(Color.GREEN);
                } else{
                    txtResultado.setTextColor(Color.BLUE);
                }
            }
        });

        // ACTUALMENTE NO FUNCIONA EL CHECKBOX
        chbNegrita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chbNegrita.isChecked()){
                    txtResultado.setTypeface(txtResultado.getTypeface(), Typeface.BOLD);
                } else{
                    txtResultado.setTypeface(txtResultado.getTypeface(), Typeface.NORMAL);
                }
            }
        });
    }
}