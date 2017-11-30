package com.poeta.mynetworking;

import android.content.Context;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.androidnetworking.error.ANError;

import java.io.File;

/**
 * Created by Binh Nguyen on 11/30/2017.
 */

public class Utils {
    public static String getRootDirPath(Context context) {
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            File file = ContextCompat.getExternalFilesDirs(context.getApplicationContext(), null)[0];
            return file.getAbsolutePath();
        } else {
            return context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
    }

    public static void logError(String TAG,ANError error) {
        if (error.getErrorCode() != 0) {
            // received ANError from server
            // error.getErrorCode() - the ANError code from server
            // error.getErrorBody() - the ANError body from server
            // error.getErrorDetail() - just a ANError detail
            Log.d(TAG, "onError errorCode : " + error.getErrorCode());
            Log.d(TAG, "onError errorBody : " + error.getErrorBody());
            Log.d(TAG, "onError errorDetail : " + error.getErrorDetail());
        } else {
            // error.getErrorDetail() : connectionError, parseError, requestCancelledError
            Log.d(TAG, "onError errorDetail : " + error.getErrorDetail());
        }
    }
}
