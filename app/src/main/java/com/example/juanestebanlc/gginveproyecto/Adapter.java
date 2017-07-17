package com.example.juanestebanlc.gginveproyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Juan Esteban LC on 17/07/2017.
 */

public class Adapter extends BaseAdapter {

    Context c;

    ArrayList<Empre> empres;

    LayoutInflater inflater;

    public Adapter(Context c, ArrayList<Empre> empres) {
        this.c = c;
        this.empres = empres;
    }

    @Override
    public int getCount() {
        return empres.size();
    }

    @Override
    public Object getItem(int position) {
        return empres.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item,parent,false);
        }
        Mypose poseer = new Mypose(convertView);
        poseer.nomTxt.setText(empres.get(position).getNombre());
        poseer.desTxt.setText(empres.get(position).getDescripcion());
        PicassoClient.descargarimagen(c,empres.get(position).getUrl(),poseer.img);
        return convertView;
    }
}
