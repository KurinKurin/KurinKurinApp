package com.example.kurinkurin.kurinkurin;


import android.app.Activity;
<<<<<<< HEAD
import android.content.Intent;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> c3c270e2cef166bbebeee0d34a6dab6dae492340
>>>>>>> d8f0cc9e76f31b55575b03143c3d2ed450534b22
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity{

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d8f0cc9e76f31b55575b03143c3d2ed450534b22
    private static String TiendaSeleccionada;

    private String[] lenguajeProgramacion=new String[]{"Java","PHP","Python","JavaScript","Ruby","C",
            "Go","Perl","Pascal","Otro"};

    private static String[] servicios = new String[]{"Corte","Baño","Servicio3","Servicio3","Servicio3","Servicio3","Servicio3","Servicio3","Servicio3","Servicio3","Servicio3"};

<<<<<<< HEAD
=======
=======
    private String lenguajeProgramacion[]=new String[]{"Java","PHP","Python","JavaScript","Ruby","C",
            "Go","Perl","Pascal","Otro"};

>>>>>>> c3c270e2cef166bbebeee0d34a6dab6dae492340
>>>>>>> d8f0cc9e76f31b55575b03143c3d2ed450534b22
    private Integer[] imgid={
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher
    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,lenguajeProgramacion,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d8f0cc9e76f31b55575b03143c3d2ed450534b22
                //String Slecteditem= lenguajeProgramacion[+position];
                //Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                TiendaSeleccionada = lenguajeProgramacion[+position];
                Intent tienda = new Intent(MainActivity.this,DetallesTiendaActivity.class);
                startActivity(tienda);



            }
        });
    }

    public static String getNombreTienda(){
        return TiendaSeleccionada;
    }

    public static String[] getServicios(){
        return servicios;
    }
<<<<<<< HEAD
=======
=======
                String Slecteditem= lenguajeProgramacion[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
>>>>>>> c3c270e2cef166bbebeee0d34a6dab6dae492340
>>>>>>> d8f0cc9e76f31b55575b03143c3d2ed450534b22
}
