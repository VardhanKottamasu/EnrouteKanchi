package com.example.enroutekanchi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map_att3 extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_att3);
        Toast t = Toast.makeText(getApplicationContext(),"Click on the red marker for navigation and other options",Toast.LENGTH_LONG);
        t.show();
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
        GoogleMap mMap;
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng pondicherry = new LatLng(11.9362866,79.7434873);
        mMap.addMarker(new MarkerOptions().position(pondicherry).title("Pondicherry"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pondicherry));

        LatLng pondi1 = new LatLng(11.931063,79.835813);
        mMap.addMarker(new MarkerOptions().position(pondi1).title("Pondicherry Beach"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pondi1));

        LatLng pondi3 = new LatLng(11.930188,79.822437);
        mMap.addMarker(new MarkerOptions().position(pondi3).title("Botanical Garden"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pondi3));

        LatLng pondi4 = new LatLng(11.929938,79.829813);
        mMap.addMarker(new MarkerOptions().position(pondi4).title("Cycle Tourism"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pondi4));

        LatLng pondi5 = new LatLng(11.971812,79.846188);
        mMap.addMarker(new MarkerOptions().position(pondi5).title("Serenity Beach Sunrise Point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pondi5));

        mMap.setMinZoomPreference(10);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMyLocationEnabled(true);
    }
}
