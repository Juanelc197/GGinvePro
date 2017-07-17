package com.example.juanestebanlc.gginveproyecto;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Juan Esteban LC on 17/07/2017.
 */

public class PicassoClient {

    public static void descargarimagen(Context c, String url, ImageView img) {

        if (url != null && url.length()>0) {
            Picasso.with(c)
                    .load(url)
                    .resize(350, 350)
                    .centerCrop()
                    .placeholder(R.drawable.gallery)
                    .error(R.drawable.error)
                    .into(img);
        }

    }

}
