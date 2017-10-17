package com.jonmid.ejercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PruebaActivity extends AppCompatActivity {

    TextView textView;
    TextView textView1;
    Button button;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        textView=(TextView) findViewById(R.id.tv_1);
        textView1=(TextView) findViewById(R.id.tv_2);
        button =(Button) findViewById(R.id.btn_1);
        textView.setText(""+getIntent().getExtras().getInt("albumId"));
        textView1.setText(getIntent().getExtras().getString("title"));
        toolbar= (Toolbar)  findViewById(R.id.id_toolbar);
        showToolBar("Pantalla 2", true);

        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityOne(view);
            }
        });*/

    }
    public void goActivityOne(){
        Intent intent = new Intent(this, WindowOneActivity.class);
        startActivity(intent);
    }

    public void showToolBar(String title, boolean upButtom){
        // mostrar el toolbar en pantalla y configurarlo
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButtom);

    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_uno, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        goActivityOne();
        return super.onOptionsItemSelected(item);


    }


}

