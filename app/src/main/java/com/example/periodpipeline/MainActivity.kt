package com.example.periodpipeline

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

class MainActivity : AppCompatActivity(),  OnMapReadyCallback {
//    private lateinit var map: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { R.layout.activity_main }
        val mapFragment = supportFragmentManager
            .findFragementById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
}



override fun onMapReady(googleMap: GoogleMap) {
    googleMap.addMarker(
        MarkerOptions()
            .position(LatLng(0.0, 0.0))
            .title("Marker")
    )
}
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    PeriodPipelineTheme {
//        Greeting("Android")
//    }
//}