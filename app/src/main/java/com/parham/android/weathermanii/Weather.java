package com.parham.android.weathermanii;

import java.util.UUID;

/**
 * Created by parham on 5/11/2017 AD.
 */

public class Weather {

    private UUID mUUID;
    private String mCity;
    private String mLatitude;
    private String mLongtitute;
    private String mTempC;

    public Weather() {
        mUUID = UUID.randomUUID();
    }

    public String getTempC() {
        return mTempC;
    }

    public void setTempC(String tempC) {
        mTempC = tempC;
    }
}
