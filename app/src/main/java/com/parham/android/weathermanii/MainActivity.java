package com.parham.android.weathermanii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private Weather mWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeatherFetcher fetcher = new WeatherFetcher(getApplicationContext());
        String latitude = "35.1";
        String longitude= "51.4";

        mWeather = new Weather();

        fetcher.getWeatherByLatLong(latitude, longitude, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                mWeather.setTempC(response.));

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

    }
}
