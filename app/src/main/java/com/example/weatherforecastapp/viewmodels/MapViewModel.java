package com.example.weatherforecastapp.viewmodels;

import androidx.lifecycle.ViewModel;
import android.content.SharedPreferences;

import com.example.weatherforecastapp.Constants;


public class MapViewModel extends ViewModel {
    public SharedPreferences sharedPreferences;
    public String apiKey;
    public double mapLat = Double.parseDouble(Constants.DEFAULT_LAT);
    public double mapLon = Double.parseDouble(Constants.DEFAULT_LON);
    public int mapZoom = Constants.DEFAULT_ZOOM_LEVEL;
    public int tabPosition = 0;
}
