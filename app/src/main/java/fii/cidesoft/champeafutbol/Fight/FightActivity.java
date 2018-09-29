package fii.cidesoft.champeafutbol.Fight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import fii.cidesoft.champeafutbol.R;

public class FightActivity extends AppCompatActivity {

    private ArrayList<String>   ImagenesEquipos=new ArrayList<>();
    private ArrayList<String>   NombresEquipos= new ArrayList<>();
    private ImageView local;
    private ImageView visitante;
    private TextView TextLocal;
    private TextView TextVisit;
    private TextView Cambio;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fight_act);
        LlenarDatos();

        local=(ImageView) findViewById(R.id.img_local);
        visitante=(ImageView) findViewById(R.id.img_visit);
        TextLocal=(TextView) findViewById(R.id.txt_local);
        TextVisit=(TextView) findViewById(R.id.txt_visit);
        escogerteams();
        Cambio=(TextView) findViewById(R.id.txt_Cambiar);
        Cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escogerteams();
            }
        });

    }

    private void escogerteams() {
        ArrayList<String> Equipos=randomteam();
        int a= Integer.parseInt(Equipos.get(0));
        int b= Integer.parseInt(Equipos.get(1));
        local.setImageResource(Integer.parseInt(ImagenesEquipos.get(a)));
        TextLocal.setText(NombresEquipos.get(a));
        visitante.setImageResource(Integer.parseInt(ImagenesEquipos.get(b)));
        TextVisit.setText(NombresEquipos.get(b));

    }

    private ArrayList<String> randomteam(){
        int a = 0;
        int b = 0;
        while (a==b){
            a = new Random().nextInt(5);
            b = new Random().nextInt(5);
        }
        ArrayList<String> resultados = new ArrayList<>();
        resultados.add(a+"");
        resultados.add(b+"");
        return resultados;
    }

    private void LlenarDatos(){

        ImagenesEquipos.add(R.drawable.alianza+"");
        ImagenesEquipos.add(R.drawable.chelsea+"");
        ImagenesEquipos.add(R.drawable.lieis+"");
        ImagenesEquipos.add(R.drawable.rayito+"");
        ImagenesEquipos.add(R.drawable.roma+"");

        NombresEquipos.add("Alianza");
        NombresEquipos.add("Chelsea");NombresEquipos.add("Lieis");
        NombresEquipos.add("El Rayito Bayecano Pues");
        NombresEquipos.add("Roma");
    }
}


