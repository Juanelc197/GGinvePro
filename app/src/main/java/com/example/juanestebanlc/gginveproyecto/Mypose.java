package com.example.juanestebanlc.gginveproyecto;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Juan Esteban LC on 17/07/2017.
 */

public class Mypose {

    TextView nomTxt;
    TextView desTxt;
    ImageView img;

    public Mypose(View v) {
        nomTxt = (TextView) v.findViewById(R.id.i_tv_nombre);

        desTxt = (TextView) v.findViewById(R.id.i_tv_descripcion);

        img = (ImageView) v.findViewById(R.id.movieImage);
    }

}
