package com.example.juanestebanlc.gginveproyecto;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marcador;
    private CameraUpdate camara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);

        //Adicionamos los botones de zoom
        mMap.getUiSettings().setZoomControlsEnabled(true);

        // Add a marker in Ternium and move the camera
        LatLng ter = new LatLng(25.72503, -100.30532529999999);
        mMap.addMarker(new MarkerOptions().position(ter).title("Ternium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ter));

        // Add a marker in Cerrey and move the camera
        LatLng cerr = new LatLng(25.7266619, -100.28957780000002);
        mMap.addMarker(new MarkerOptions().position(cerr).title("Cerrey"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cerr));

        // Add a marker in Vitro and move the camera
        LatLng vit = new LatLng(25.8044064, -100.61277970000003);
        mMap.addMarker(new MarkerOptions().position(vit).title("Vitro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vit));

        // Add a marker in VillaAcero and move the camera
        LatLng villa = new LatLng(25.6663234, -100.31890350000003);
        mMap.addMarker(new MarkerOptions().position(villa).title("VillaAcero"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(villa));

    }
}
