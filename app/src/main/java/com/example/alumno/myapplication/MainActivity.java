package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("FBA", "La apk esta en onCreate");
        btnComprar = (Button)findViewById(R.id.btnComprar);
        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this, DetalleActivity.class);
                MainActivity.this.startActivity(x);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("FBA", "La apk esta en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Gracias por usar", Toast.LENGTH_SHORT).show();
        Log.v("FBA", "La apk esta en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("FBA", "La apk esta en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("FBA", "La apk esta en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("FBA", "La apk esta en onDestroy");
    }
}
