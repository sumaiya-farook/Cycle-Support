package com.example.periodpipeline

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(),  OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main )
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    //add markers of different places on campus near siebel?
    //potentially change marker size to be smaller
    //add location feature to access device location

    override fun onMapReady(googleMap: GoogleMap) {
        googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL

        val illiniUnion = LatLng(40.10990, -88.22699)
        val graingerEngineering = LatLng(40.11265, -88.22607)
        val siebelCS = LatLng(40.11398, -88.22495)

        val markerUnion = googleMap.addMarker(
            MarkerOptions()
                .position(illiniUnion)
                .title("Illini Union")
        )

        val markerGrainger = googleMap.addMarker(
            MarkerOptions()
                .position(graingerEngineering)
                .title("Grainger Engineering Library")
        )
        val markerSiebel = googleMap.addMarker(
            MarkerOptions()
                .position(siebelCS)
                .title("Siebel Center for CS")
        )
        googleMap.setOnMarkerClickListener { marker ->
            marker.showInfoWindow()
        true
        }

    }
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