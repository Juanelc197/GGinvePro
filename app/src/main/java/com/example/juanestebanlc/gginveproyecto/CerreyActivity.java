package com.example.juanestebanlc.gginveproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class CerreyActivity extends AppCompatActivity {

    ListView lv;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerrey);

        lv = (ListView) findViewById(R.id.lv_cerr);
        adapter = new Adapter(this, EmpreCollection.getEmpre());

        lv.setAdapter(adapter);


    }
}