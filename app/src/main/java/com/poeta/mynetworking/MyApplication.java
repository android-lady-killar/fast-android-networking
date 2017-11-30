package com.poeta.mynetworking;

import android.app.Application;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ConnectionQuality;
import com.androidnetworking.interfaces.ConnectionQualityChangeListener;

/**
 * Created by Binh Nguyen on 11/30/2017.
 */

public class MyApplication extends Application {

    private static final String TAG = MyApplication.class.getSimpleName();
    private static MyApplication appInstance = null;

    public static MyApplication getInstance() {
        return appInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appInstance = this;
        AndroidNetworking.initialize(getApplicationContext());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        AndroidNetworking.setBitmapDecodeOptions(options);
        AndroidNetworking.enableLogging();
        AndroidNetworking.setConnectionQualityChangeListener(new ConnectionQualityChangeListener() {
            @Override
            public void onChange(ConnectionQuality currentConnectionQuality, int currentBandwidth) {
                Log.d(TAG, "onChange: currentConnectionQuality : " + currentConnectionQuality + " currentBandwidth : " + currentBandwidth);
            }
        });

    }
}
