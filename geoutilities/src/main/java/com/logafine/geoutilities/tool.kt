package com.logafine.geoutilities

import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

/**
 * Calculate distance between two given locations
 * @param lat1 First location's latitude
 * @param lon1 First location's longitude
 * @param lat2 Second location's latitude
 * @param lon2 Second location's longitude
 * @return distance between two given locations in meter
 */
fun calculateDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double) : Double {
    val r = 6_371_000.0
    val d2r = Math.PI / 180.0
    val rLat1 = lat1 * d2r
    val rLat2 = lat2 * d2r
    val dLat = (lat2 - lat1) * d2r
    val dLon = (lon2 - lon1) * d2r
    val a = ( sin(dLat / 2) * sin(dLat / 2) ) +
            cos(rLat1) * cos (rLat2) * ( sin(dLon / 2) * sin(dLon / 2) )
    return 2 * r * atan2(sqrt(a), sqrt(1 - a))
}