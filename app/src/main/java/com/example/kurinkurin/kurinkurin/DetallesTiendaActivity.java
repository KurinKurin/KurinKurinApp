package com.example.kurinkurin.kurinkurin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DetallesTiendaActivity extends AppCompatActivity {

    TextView nombre,descripcion;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_tienda);

        nombre = (TextView) findViewById(R.id.tiendaTitulo);
        nombre.setText(MainActivity.getNombreTienda());

        descripcion = (TextView) findViewById(R.id.tiendaDescripcion);
        descripcion.setText("The em is simply the font size. In an element with a 2in font, 1em thus means 2in. Expressing sizes, such as margins and paddings, in em means they are related to the font size, and if the user has a big font (e.g., on a big screen) or a small font (e.g., on a handheld device), the sizes will be in proportion. Declarations such as 'text-indent: 1.5em' and 'margin: 1em' are extremely common in CSS.");


        lista = (ListView)findViewById(R.id.tiendaServicios);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MainActivity.getServicios());
        lista.setAdapter(adaptador);

    }
}
