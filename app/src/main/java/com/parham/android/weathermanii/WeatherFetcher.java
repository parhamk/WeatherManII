package com.parham.android.weathermanii;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

/**
 * Created by parham on 5/11/2017 AD.
 */

public class WeatherFetcher {
    private static final String TAG = "WeatherFetcher";

    private static final String API_BASE_ADDRESS = "api.darksky.net";
    private static final String API_KEY = "b9941f317f4862ae5870475eb827fb91";

    private Context context;

    public WeatherFetcher(Context context) {
        this.context = context;
    }

    // TODO: 5/11/2017 AD Update weather object by location
    public void getWeatherByLatLong(String latitude, String longtitude, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
        String url = buildUri(latitude, longtitude);
        RequestQueue queue = Volley.newRequestQueue(context);

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, responseListener, errorListener);

        queue.add(jsObjRequest);
    }

    private String buildUri(String latitude, String longitude) {
        //Uri format should match: https://api.darksky.net/forecast/[API_KEY]/[Latitude],[Longtitude]
        //e.g: https://api.darksky.net/forecast/b9941f317f4862af22ea5eb827fb91/35.72,52.44
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https")
                .authority(API_BASE_ADDRESS)
                .appendPath("forecast")
                .appendPath(API_KEY)
                .appendPath(latitude + "," + longitude);

        String uri = builder.build().toString();
        return uri;
    }


}
