package edu.tecii.android.conv_grados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText GC;
private TextView GF,GK,GR,centi;
private Button bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GC=(EditText)findViewById(R.id.txtGC);
        GF=(TextView)findViewById(R.id.TvF);
        GK=(TextView)findViewById(R.id.TvK);
        GR=(TextView)findViewById(R.id.TvR);
        centi=(TextView)findViewById(R.id.TvGC);
        bu=(Button)findViewById(R.id.button);

        bu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               double F,K,R;
                int gra;
                String grados=GC.getText().toString();
                double res = Double.parseDouble(grados);
                gra=(int)(res);
                F=(1.8* gra)+ 32;  //  De grados centígrados a grados fahrenheit F = 1.80°C + 32
                K= gra + 273;//De grados centígrados a grados Kelvin: K = °C + 273
                R=K*1.8;// De grados centigrados a Rankine R = K*1,8

            String GC,RF,RK,RR="";
            RF="La conversion a grados Fahrenheit es: " + F+"°F";
                RK="La conversion a grados Kelvin es: " + K+"°K";
                RR="La conversion a grados Rankine es: " + R+"°R";
                GC="Los grados centigrados ingresados son: " + gra+"°C";

                GF.setText(RF);
                GK.setText(RK);
                GR.setText(RR);
                centi.setText(GC);

            }
        });

    }
}
