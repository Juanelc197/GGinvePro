package com.example.juanestebanlc.gginveproyecto;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgb;

    Spinner Empresa;

    String[] datosempresas = {"Seleccione una Empresa...","Ternium","Villacero","Cerrey","Vitro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgb = (ImageButton) findViewById(R.id.img_btn);

        imgb.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent imgb = new Intent(MainActivity.this, MapsActivity.class);
                                        startActivity(imgb);
                                    }
                                });

        Empresa = (Spinner) findViewById(R.id.EmpreSpinner);

        ArrayAdapter<String> empresasadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosempresas);
        Empresa.setAdapter(empresasadaptador);

        Empresa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast to = Toast.makeText(getApplicationContext(), "Selecciona una Empresa", Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 1:
                        Intent teri = new Intent(MainActivity.this, TerniumActivity.class);
                        startActivity(teri);
                        break;

                    case 2:
                        Intent vill = new Intent(MainActivity.this, VillaceroActivity.class);
                        startActivity(vill);
                        break;

                    case 3:
                        Intent cerr = new Intent(MainActivity.this, CerreyActivity.class);
                        startActivity(cerr);
                        break;

                    case 4:
                        Intent vit = new Intent(MainActivity.this, VitroActivity.class);
                        startActivity(vit);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public  void starTernium(View view) { startActivity(new Intent(this, TerniumActivity.class)); }

    public void startCerrey(View view) { startActivity(new Intent(this, CerreyActivity.class)); }

    public void startVillacero(View view) { startActivity(new Intent(this, VillaceroActivity.class)); }

    public void startVitro(View view) { startActivity(new Intent(this, VitroActivity.class)); }
}
