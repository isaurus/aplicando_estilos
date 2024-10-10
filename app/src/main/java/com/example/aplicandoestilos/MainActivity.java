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

        // Recoger el estilo predeterminado del TextView
        Typeface estiloPredeterminado = txtResultado.getTypeface();

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


        chbNegrita.setOnCheckedChangeListener((buttonView, isChecked) -> txtResultado.setTypeface(estiloPredeterminado, Typeface.BOLD));
        chbCursiva.setOnCheckedChangeListener((buttonView, isChecked) -> txtResultado.setTypeface(estiloPredeterminado, Typeface.ITALIC));


        /*
        // Listener para CheckBox de estilo negrita
        chbNegrita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chbNegrita.isChecked() && chbCursiva.isChecked()){
                    txtResultado.setTypeface(estiloPredeterminado, Typeface.BOLD_ITALIC);
                } else if(chbNegrita.isChecked()){
                    txtResultado.setTypeface(estiloPredeterminado, Typeface.BOLD);
                } else if(chbCursiva.isChecked()){
                    txtResultado.setTypeface(estiloPredeterminado, Typeface.ITALIC);
                } else {
                    txtResultado.setTypeface(estiloPredeterminado);
                }
            }
        });
         */

        /*
        // Listener para CheckBox chbNegrita
        chbNegrita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chbNegrita.isChecked()){
                    txtResultado.setTypeface(estiloPredeterminado, Typeface.BOLD);
                }else{
                    txtResultado.setTypeface(estiloPredeterminado);
                }
            }
        });*/

        /*
        // Listener para CheckBox chbCursiva
        chbCursiva.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chbCursiva.isChecked()){
                    txtResultado.setTypeface(estiloPredeterminado, Typeface.ITALIC);
                }else{
                    txtResultado.setTypeface(estiloPredeterminado);
                }
            }
        });*/
    }


    /*
    protected void cambiarEstilo(){
        if(chbNegrita.isChecked() && chbCursiva.isChecked()){
            txtResultado.setTypeface(estiloPredeterminado, Typeface.BOLD_ITALIC);
        } else if(chbNegrita.isChecked()){
            txtResultado.setTypeface(estiloPredeterminado, Typeface.BOLD);
        } else if(chbCursiva.isChecked()){
            txtResultado.setTypeface(estiloPredeterminado, Typeface.ITALIC);
        } else {
            txtResultado.setTypeface(estiloPredeterminado);
        }
    }

     */


}