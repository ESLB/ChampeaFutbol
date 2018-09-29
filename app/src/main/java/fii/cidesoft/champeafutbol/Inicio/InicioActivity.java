package fii.cidesoft.champeafutbol.Inicio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import fii.cidesoft.champeafutbol.Fight.FightActivity;
import fii.cidesoft.champeafutbol.R;

public class InicioActivity extends AppCompatActivity {

    private Button play;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity);

        play = (Button) findViewById(R.id.btn_play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(context,"Tu gfcita", Toast.LENGTH_SHORT,true).show();
                Intent i = new Intent(context, FightActivity.class);
                startActivity(i);
            }
        });
    }
}
