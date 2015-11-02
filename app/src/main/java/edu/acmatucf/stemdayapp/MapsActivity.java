package edu.acmatucf.stemdayapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        ScheduleItem mScheduleItem = (ScheduleItem) this.getIntent().getSerializableExtra("ScheduleItem");
        LatLng coords = new LatLng(28.6024274, -81.2000599);
        map.addMarker(new MarkerOptions().position(coords).title("Marker to Event"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(coords, 15.8f));
    }
}
