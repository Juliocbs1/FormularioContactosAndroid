package com.example.formulariocontacto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.formulariocontacto.clase.Contacto;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    Contacto contacto   = new Contacto();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null){
            EditText editText = findViewById(R.id.main_campo_nombre);
            editText.setText(parametros.getString(getString(R.string.p2_nombre)));

            editText = findViewById(R.id.main_campo_telefono);
            editText.setText(parametros.getString(getString(R.string.p2_telefono)));

            editText = findViewById(R.id.main_campo_email);
            editText.setText(parametros.getString(getString(R.string.p2_email)));

            editText = findViewById(R.id.main_campo_descripcion);
            editText.setText(parametros.getString(getString(R.string.p2_descripcion_contacto)));


            try {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                java.util.Date fecha = formato.parse(parametros.getString(getString(R.string.p2_fecha)));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fecha);

                DatePicker datePicker = findViewById(R.id.main_fecha);
                datePicker.updateDate(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)
                );
            } catch (ParseException e) {
                e.printStackTrace();
                Toast.makeText(this, "Fecha inválida", Toast.LENGTH_SHORT).show();
            }




        }



        Button boton = findViewById(R.id.main_boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = findViewById(R.id.main_campo_nombre);
                contacto.setNombre(editText.getText().toString());

                editText = findViewById(R.id.main_campo_telefono);
                contacto.setTelefono(editText.getText().toString());

                editText = findViewById(R.id.main_campo_email);
                contacto.setEmail(editText.getText().toString());

                editText = findViewById(R.id.main_campo_descripcion);
                contacto.setDescripcionContacto(editText.getText().toString());

                DatePicker datePicker = findViewById(R.id.main_fecha);
                Calendar calendar = Calendar.getInstance();
                calendar.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());

                Date fechaNacimiento = new Date(calendar.getTimeInMillis());
                contacto.setFechaNacimiento(fechaNacimiento);
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getString(R.string.p_nombre), contacto.getNombre());
                intent.putExtra(getString(R.string.p_fecha), contacto.getFechaNacimiento().toString());
                intent.putExtra(getString(R.string.p_telefono), contacto.getTelefono());
                intent.putExtra(getString(R.string.p_email), contacto.getEmail());
                intent.putExtra(getString(R.string.p_descripcion_contacto), contacto.getDescripcionContacto());
                startActivity(intent);
                finish();
            }
        });


    }
}
