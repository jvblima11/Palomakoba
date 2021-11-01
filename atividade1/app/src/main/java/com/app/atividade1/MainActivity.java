package com.app.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edt_Jardas;
    TextView txt_CM,txt_Jardas;
    Button btn_Coverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_Jardas = findViewById(R.id.edtJardas);
        txt_Jardas = findViewById(R.id.txtJardas);
        txt_CM = findViewById(R.id.txtCM);
        btn_Coverter = findViewById(R.id.btnConverter);

        btn_Coverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numJardas = Double.parseDouble(edt_Jardas.getText().toString());
                DecimalFormat exibe = new DecimalFormat("#.##");
                String numCentimetros = exibe.format(numJardas*91.44);
//                double numCentimetros = numJardas * 91.44;
                txt_CM.setText(numCentimetros + " Centímetros");
            }
        });
    }
}