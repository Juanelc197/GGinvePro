package com.example.juanestebanlc.gginveproyecto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


public class TerniumActivity extends AppCompatActivity {

    ListView lv;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ternium);

        lv = (ListView) findViewById(R.id.lv_cerr);
        adapter = new Adapter(this, EmpreCollection.getEmpre());

        lv.setAdapter(adapter);


    }
}