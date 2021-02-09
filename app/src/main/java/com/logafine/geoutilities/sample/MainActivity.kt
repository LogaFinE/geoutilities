package com.logafine.geoutilities.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.logafine.geoutilities.R
import com.logafine.geoutilities.calculateDistance
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txvDistance = findViewById<TextView>(R.id.txv_distance)

        val lat1 = 13.2355
        val lon1 = 100.3256
        val lat2 = 13.3567
        val lon2 = 100.5678
        val distance = calculateDistance(lat1, lon1, lat2, lon2)
        val distanceString = String.format("%,.2f meter", distance)
        txvDistance.text = StringBuilder("First location: $lat1, $lon1\n" +
                "Second location: $lat2, $lon2\n" +
                "Distance: $distanceString")
    }
}