package com.example.formulariocontacto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class DetalleContacto extends AppCompatActivity {
    String nombre;
    String telefono;
    String fecha;
    String email;
    String descripcionContacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle parametros = getIntent().getExtras();

        if (parametros != null) {
             nombre = parametros.getString(getString(R.string.p_nombre));
             telefono =parametros.getString( getString(R.string.p_telefono));
             fecha =  parametros.getString(getString(R.string.p_fecha));
             email = parametros.getString(getString(R.string.p_email));
             descripcionContacto = parametros.getString(getString(R.string.p_descripcion_contacto));

            TextView textView = findViewById(R.id.detalle_nombre);
            textView.setText(nombre);

            textView = findViewById(R.id.detalle_telefono);
            textView.setText(telefono);

            textView = findViewById(R.id.detalle_fecha);
            textView.setText(fecha);

            textView = findViewById(R.id.detalle_email);
            textView.setText(email);

            textView = findViewById(R.id.detalle_descripcion_contacto);
            textView.setText(descripcionContacto);


        }

        Button botonDetalle = findViewById(R.id.detalle_boton);
        botonDetalle.setOnClickListener(v -> {
            Intent intent = new Intent(DetalleContacto.this, MainActivity.class);
            intent.putExtra(getString(R.string.p2_nombre), nombre);
            intent.putExtra(getString(R.string.p2_telefono), telefono);
            intent.putExtra(getString(R.string.p2_fecha), fecha);
            intent.putExtra(getString(R.string.p2_email), email);
            intent.putExtra(getString(R.string.p2_descripcion_contacto), descripcionContacto);
            startActivity(intent);
            finish();
        });



    }
}
