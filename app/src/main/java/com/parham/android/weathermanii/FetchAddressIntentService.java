package com.parham.android.weathermanii;

import android.app.IntentService;
import android.content.Intent;
import android.location.Geocoder;
import android.support.annotation.Nullable;

import java.util.Locale;

/**
 * Created by parham on 6/16/2017 AD.
 */

public class FetchAddressIntentService extends IntentService {

    public FetchAddressIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
    }
}
