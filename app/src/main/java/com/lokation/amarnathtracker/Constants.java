package com.lokation.amarnathtracker;

/**
 * Created by bhiwalakhil on 7/22/15.
 */
import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public final class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Contains details for Camera Position
     */
    public static final int ZOOM_LEVEL = 16;

    public static final int BEARING_LEVEL = 0;

    public static final int TILT_LEVEL = 0;


    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    //public static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km
    public static final float GEOFENCE_RADIUS_IN_METERS = 100; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> AMARNATH_LANDMARKS = new HashMap<String, LatLng>();
    static {
        // Jaipur Airport
        AMARNATH_LANDMARKS.put("Jaipur Airport", new LatLng(37.621313, -122.378955));

        // SBBJ Tilak Marg
        AMARNATH_LANDMARKS.put("SBBJ Tilak Marg", new LatLng(26.904451, 75.799991));

        // Srinagar Airport
        AMARNATH_LANDMARKS.put("Srinagar Airport", new LatLng(37.422611, -122.0840577));

        // Amarnath Shrine
        AMARNATH_LANDMARKS.put("Amarnath Shrine", new LatLng(37.3999497, -122.1084776));

        // SWIL
        AMARNATH_LANDMARKS.put("SWIL", new LatLng(26.904059, 75.814839));

        // Central Park
        AMARNATH_LANDMARKS.put("Central Park", new LatLng(26.904914, 75.811193));

        // Home
        AMARNATH_LANDMARKS.put("Home", new LatLng(26.918926, 75.744035));

        // Gym
        AMARNATH_LANDMARKS.put("Gym", new LatLng(26.913268, 75.749778));

        // Coffee Shop @ Statue Circle
        AMARNATH_LANDMARKS.put("Coffee @ Statue Circle", new LatLng(26.907736, 75.804950));

    }

}