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

public class Map_att1 extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_att1);
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
//        LatLng mbp1 = new LatLng(12.616437,80.199313);
//        mMap.addMarker(new MarkerOptions().position(mbp1).title("Shore Temple"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp1));

        LatLng mbp2 = new LatLng(12.616437,80.199313);
        mMap.addMarker(new MarkerOptions().position(mbp2).title("Shore Temple"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp2));

        LatLng mbp3 = new LatLng(12.608937,80.189563);
        mMap.addMarker(new MarkerOptions().position(mbp3).title("Pancha Rathas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp3));

        LatLng mbp4 = new LatLng(12.616562,80.198813);
        mMap.addMarker(new MarkerOptions().position(mbp4).title("Group of monuments at Mahabalipuram"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp4));

        LatLng mbp5 = new LatLng(12.618062,80.192313);
        mMap.addMarker(new MarkerOptions().position(mbp5).title("Varaha Cave Temple"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp5));

        LatLng mbp6 = new LatLng(12.619062,80.192313);
        mMap.addMarker(new MarkerOptions().position(mbp6).title("Krishna's Butterball"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp6));

        LatLng mbp7 = new LatLng(12.617437,80.192938);
        mMap.addMarker(new MarkerOptions().position(mbp7).title("Thirukadalmallai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp7));

        LatLng mbp8 = new LatLng(12.615937,80.199437);
        mMap.addMarker(new MarkerOptions().position(mbp8).title("Mahabalipuram Beach"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp8));

        LatLng mbp9 = new LatLng(12.617562,80.192813);
        mMap.addMarker(new MarkerOptions().position(mbp9).title("Krishna Mandapam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mbp9));
        //Additional settings
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMyLocationEnabled(true);
    }
}
