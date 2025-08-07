package com.axjava;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Main {
    public static void Start(Context context) {
        System.loadLibrary("pairipcore");
        CrashHandler.init(context, false);
        b(context);
    }

    public static void b(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 112);
        }
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
            try {
                Uri uri = Uri.parse("package:" + context.getPackageName());
                context.startActivity(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", uri));
            } catch (Exception e) {
                Intent intent = new Intent();
                intent.setAction("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                context.startActivity(intent);
            }
        }
    }
}
