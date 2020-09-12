package com.example.enroutekanchi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Hotels_Map extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels__map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Toast t = Toast.makeText(getApplicationContext(),"Click on the red marker for navigation and other options",Toast.LENGTH_LONG);
        t.show();
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
        LatLng h1 = new LatLng(12.841688,79.704063);
        //mMap.addMarker(new MarkerOptions().position(h1).title("ICS Residency").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotelvec)));
        mMap.addMarker(new MarkerOptions().position(h1).title("ICS Residency"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h1));
        LatLng h2 = new LatLng(12.842313,79.701313);
        mMap.addMarker(new MarkerOptions().position(h2).title("Sri Hari Residency"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h2));
        LatLng h3 = new LatLng(12.841813,79.704063);
        mMap.addMarker(new MarkerOptions().position(h3).title("Hotel MBJ Inn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h3));
        LatLng h4 = new LatLng(12.839687,79.704937);
        mMap.addMarker(new MarkerOptions().position(h4).title("GSR Residency"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h4));
        LatLng h5 = new LatLng(12.837812,79.704813);
        mMap.addMarker(new MarkerOptions().position(h5).title("Aruna Residency"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h5));
        LatLng h6 = new LatLng(12.837312,79.704437);
        mMap.addMarker(new MarkerOptions().position(h6).title("Hotel SSK Grand"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h6));
        LatLng h7 = new LatLng(12.837312,79.704563);
        mMap.addMarker(new MarkerOptions().position(h7).title("Sree Sakthi Residency"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h7));
        LatLng h8 = new LatLng(12.837812,79.703688);
        mMap.addMarker(new MarkerOptions().position(h8).title("Sri Krishna Lodge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h8));
        LatLng h9 = new LatLng(12.835812,79.704187);
        mMap.addMarker(new MarkerOptions().position(h9).title("Rajam Lodge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h9));
        LatLng h10 = new LatLng(12.835562,79.704187);
        mMap.addMarker(new MarkerOptions().position(h10).title("Hotel Ramco Residency"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h10));
        LatLng h11 = new LatLng(12.833187,79.704687);
        mMap.addMarker(new MarkerOptions().position(h11).title("Heritage INN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h11));
        LatLng h12 = new LatLng(12.831063,79.704187);
        mMap.addMarker(new MarkerOptions().position(h12).title("Nitheesh Resideny"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h12));
        LatLng h13 = new LatLng(12.831063,79.707688);
        mMap.addMarker(new MarkerOptions().position(h13).title("SSK Inn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h13));
        LatLng h14 = new LatLng(12.830062,79.707187);
        mMap.addMarker(new MarkerOptions().position(h14).title("Nalan Hotels"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h14));
        LatLng h15 = new LatLng(12.828812,79.706687);
        mMap.addMarker(new MarkerOptions().position(h15).title("AKG Lodge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h15));
        LatLng h16 = new LatLng(12.828563,79.706813);
        mMap.addMarker(new MarkerOptions().position(h16).title("Regency Kanchipuram"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h16));
        LatLng h17 = new LatLng(12.826313,79.703937);
        mMap.addMarker(new MarkerOptions().position(h17).title("Pine Tree Hotel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(h17));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMyLocationEnabled(true);
    }
}
