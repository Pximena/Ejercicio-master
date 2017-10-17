package com.jonmid.ejercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PruebaActivity extends AppCompatActivity {

    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        textView=(TextView) findViewById(R.id.tv_1);
        textView1=(TextView) findViewById(R.id.tv_2);

        textView.setText(""+getIntent().getExtras().getInt("albumId"));
        textView1.setText(getIntent().getExtras().getString("title"));

    }


}
