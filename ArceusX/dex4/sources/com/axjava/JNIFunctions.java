package com.axjava;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.roblox.engine.jni.NativeInputInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JNIFunctions {
    private static ClipboardService clipboardService;
    private static boolean isClipboardServiceStarted = false;
    static List<String> clipboardHistory = new ArrayList();

    public static native boolean SendButton();

    public static native void SendParamsToArceus(boolean z, int i, int i2, boolean z2, int i3);

    public static native void SendParamsToArceusTouch(int i, float f, float f2, int i2);

    public static native void handleTextInput(String str);

    public static void JAVA_Test(boolean isGang, int getScanCode, int getKeyCode, boolean getRepeatCount, int event) {
        SendParamsToArceus(isGang, getScanCode, getKeyCode, getRepeatCount, event);
    }

    public static void JAVA_Test2(MotionEvent event) {
        SendParamsToArceusTouch(event.getActionMasked(), event.getX(), event.getY(), event.getPointerCount());
    }

    public static void vibratePhone(Context context, int durationMilliseconds, int type) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        Log.e("Arceus X", "Vibrating...");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            VibrationEffect vibrationEffect1 = null;
            if (type == -1) {
                vibrationEffect1 = VibrationEffect.createOneShot(durationMilliseconds, type);
            } else if (i >= 29) {
                vibrationEffect1 = VibrationEffect.createPredefined(type);
            }
            vibrator.cancel();
            vibrator.vibrate(vibrationEffect1);
            return;
        }
        vibrator.vibrate(durationMilliseconds);
    }

    public static float getDisplayDensity(Context context) {
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(dm);
        return dm.density;
    }

    class a implements Runnable {
        final Context a;
        final String b;
        final int c;

        a(Context context, String str, int i) {
            this.a = context;
            this.b = str;
            this.c = i;
        }

        @Override
        public void run() {
            Toast.makeText(this.a, Html.fromHtml(this.b), this.c).show();
        }
    }

    public static void displayKeyboard(Context context) {
        InputMethodManager keyboard = (InputMethodManager) context.getSystemService("input_method");
        keyboard.restartInput(null);
        keyboard.toggleSoftInput(2, 0);
    }

    public static void hideKeyboard(Context context) {
        InputMethodManager keyboard = (InputMethodManager) context.getSystemService("input_method");
        keyboard.toggleSoftInput(0, 0);
    }

    public static String getInternalStorageDirectoryPath(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            if (storageManager == null) {
                String storageDirectoryPath = Environment.getExternalStorageDirectory().getAbsolutePath();
                return storageDirectoryPath;
            }
            String storageDirectoryPath2 = storageManager.getPrimaryStorageVolume().getDirectory().getAbsolutePath();
            return storageDirectoryPath2;
        }
        String storageDirectoryPath3 = Environment.getExternalStorageDirectory().getAbsolutePath();
        return storageDirectoryPath3;
    }

    public static void openURL(Context context, String url) {
        new Handler(Looper.getMainLooper()).post(new b(url, context));
    }

    public static String getTextClipboard(Context context) {
        try {
            ClipboardManager clipboard = (ClipboardManager) context.getSystemService("clipboard");
            CharSequence text = clipboard.getPrimaryClip().getItemAt(0).getText();
            Log.e("Arceus X", "text is %s" + text.toString());
            return text.toString();
        } catch (Exception e) {
            return "Error: AX-1!";
        }
    }

    public static Map<String, String> getAllPreferences(Context context) {
        SharedPreferences settings = context.getSharedPreferences("keys", 0);
        Map<String, ?> allPrefs = settings.getAll();
        Map<String, String> stringPrefs = new HashMap<>();
        for (Map.Entry<String, ?> entry : allPrefs.entrySet()) {
            if (entry.getValue() instanceof String) {
                stringPrefs.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return stringPrefs;
    }

    public static String[] File_listFiles(Context context, String path) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        arceusXDirectory.mkdirs();
        File dir = new File(arceusXDirectory, path);
        return dir.list();
    }

    public static void savePreference(Context context, String key, String value) {
        SharedPreferences settings = context.getSharedPreferences("keys", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void requestPermission(Context context) {
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

    public static boolean isPermissionGood(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager();
    }

    public static void ReCallerMouseBtn(int id, float x, float y, int windowWidth, int windowHeight) {
        switch (id) {
            case 0:
                NativeInputInterface.nativePassInput(0, x, y, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x, y, true, 0);
                NativeInputInterface.nativePassMouseButton(x, y, false, 0);
                NativeInputInterface.nativePassInput(0, x, y, 2, windowWidth, windowHeight);
                break;
            case 1:
                NativeInputInterface.nativePassInput(0, x, y, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x, y, true, 0);
                NativeInputInterface.nativePassInput(0, x, y, 2, windowWidth, windowHeight);
                break;
            case 2:
                NativeInputInterface.nativePassInput(0, x, y, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x, y, false, 0);
                NativeInputInterface.nativePassInput(0, x, y, 2, windowWidth, windowHeight);
                break;
            case 3:
                NativeInputInterface.nativePassInput(0, x, y, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x, y, true, 1);
                NativeInputInterface.nativePassMouseButton(x, y, false, 1);
                NativeInputInterface.nativePassInput(0, x, y, 2, windowWidth, windowHeight);
                break;
            case 4:
                NativeInputInterface.nativePassInput(0, x, y, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x, y, true, 1);
                NativeInputInterface.nativePassInput(0, x, y, 2, windowWidth, windowHeight);
                break;
            case 5:
                NativeInputInterface.nativePassInput(0, x, y, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x, y, false, 1);
                NativeInputInterface.nativePassInput(0, x, y, 2, windowWidth, windowHeight);
                break;
        }
    }

    class b implements Runnable {
        final Context a;
        final String b;

        b(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override
        public void run() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
            builder.setMessage(this.b).setCancelable(true).setPositiveButton("OK", new DialogInterfaceOnClickListenerC0001b(this));
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        class DialogInterfaceOnClickListenerC0001b implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0001b(b this$0) {
            }

            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        }
    }

    public static void showAlert(Context context, String text, int length) {
        new Handler(Looper.getMainLooper()).post(new b(context, text));
    }

    public static void loseFocus(Context context) {
        EditText editText = new EditText(context);
        editText.setVisibility(4);
        editText.requestFocus();
    }

    class c implements Runnable {
        final Context a;
        final String b;

        c(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override
        public void run() {
            ClipboardManager clipboard = (ClipboardManager) this.a.getSystemService("clipboard");
            if (clipboard.hasPrimaryClip()) {
                ClipData clip = ClipData.newPlainText("label", this.b);
                clipboard.setPrimaryClip(clip);
            } else {
                clipboard.setText(this.b);
            }
        }
    }

    public static boolean copyText(Context context, String text) {
        try {
            Handler mHandler = new Handler(Looper.getMainLooper());
            mHandler.post(new c(context, text));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String generate(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static float getDisplaySize_x(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

    public static float getDisplaySize_y(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    public static boolean File_createFolder(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.mkdirs();
    }

    public static String[] File_listFiles2(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.list();
    }

    public static boolean File_doesFileOrFolderExist(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.exists();
    }

    public static Map<String, Object> Http_request(Context context, String Method, String url, HashMap<String, String> Headers) throws IOException {
        URL website = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) website.openConnection();
        connection.setRequestMethod(Method);
        for (int i = 0; i < Headers.keySet().size(); i++) {
            System.out.println(Headers.keySet().toArray()[i] + " " + Headers.values().toArray()[i]);
            connection.setRequestProperty(Headers.keySet().toArray()[i].toString(), Headers.values().toArray()[i].toString());
        }
        int responseCode = connection.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        while (true) {
            String inputLine = in.readLine();
            if (inputLine != null) {
                response.append(inputLine);
            } else {
                in.close();
                Object headerFields = connection.getHeaderFields();
                Map<String, Object> result = new HashMap<>();
                result.put("statusCode", Integer.valueOf(responseCode));
                result.put("body", response.toString());
                result.put("headers", headerFields);
                return result;
            }
        }
    }

    public static boolean File_isFile(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.isFile();
    }

    public static void File_WriteFile(Context context, String fileName, String text) throws IOException {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        try {
            File realFile = new File(dir, fileName);
            FileOutputStream writer = new FileOutputStream(realFile.getAbsolutePath());
            writer.write(text.getBytes());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteDirectory(File theFile) {
        if (theFile.isDirectory()) {
            File[] contents = theFile.listFiles();
            if (contents != null) {
                for (File file : contents) {
                    if (file.isDirectory()) {
                        deleteDirectory(file);
                    } else {
                        file.delete();
                    }
                }
            }
            theFile.delete();
        }
    }

    class d implements Runnable {
        final Context a;

        d(Context context) {
            this.a = context;
        }

        class a implements ClipboardManager.OnPrimaryClipChangedListener {
            final ClipboardManager a;

            a(d this$0, ClipboardManager clipboardManager) {
                this.a = clipboardManager;
            }

            @Override
            public void onPrimaryClipChanged() {
                ClipData clipData = this.a.getPrimaryClip();
                ClipData.Item item = clipData.getItemAt(0);
                String text = item.getText().toString();
                JNIFunctions.clipboardHistory.add(text);
            }
        }

        @Override
        public void run() {
            ClipboardManager clipBoard = (ClipboardManager) this.a.getSystemService("clipboard");
            clipBoard.addPrimaryClipChangedListener(new a(this, clipBoard));
        }
    }

    public static String[] File_readAutoExec(Context context) throws IOException {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "autoexec");
        if (!dir.exists() && !dir.mkdirs()) {
            Toast.makeText(context, "An error occured while reading autoExec", 1).show();
        }
        File[] files = dir.listFiles();
        List<String> scripts = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                StringBuilder text = new StringBuilder();
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        text.append(line);
                        text.append('\n');
                    }
                    scripts.add(text.toString());
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String[] heyBro = new String[scripts.size()];
        for (int i = 0; i < heyBro.length; i++) {
            heyBro[i] = (String) scripts.toArray()[i];
        }
        return heyBro;
    }

    public static String[] getFileClipboardHistory(Context context) {
        new Handler(Looper.getMainLooper()).post(new d(context));
        List<String> list = clipboardHistory;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static boolean File_delete(Context context, String fileName) {
        File[] contents;
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        if (theFile.isDirectory() && (contents = theFile.listFiles()) != null) {
            for (File file : contents) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        return theFile.delete();
    }

    public static String File_readFile(Context context, String fileName) throws IOException {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(theFile));
            boolean firstLine = true;
            while (true) {
                try {
                    String line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!firstLine) {
                        text.append('\n');
                    }
                    text.append(line);
                    firstLine = false;
                } finally {
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    public static void handlePasteEvent(Context context) {
        Log.e("PasteEvent", "Handling paste event");
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService("clipboard");
        try {
            CharSequence text = clipboard.getPrimaryClip().getItemAt(0).getText();
            handleTextInput(text.toString());
        } catch (Exception e) {
            Log.e("Arceus X", "Error while copying.");
            Toast.makeText(context, "Error while pasting...", 0).show();
        }
    }

    public static boolean ez(Context context, KeyEvent event) {
        if (event.getAction() == 0 && event.isCtrlPressed() && event.getKeyCode() == 50) {
            handlePasteEvent(context);
            return true;
        }
        if (event.getAction() == 0 && event.getKeyCode() == 279) {
            handlePasteEvent(context);
            return true;
        }
        if (event.getAction() == 2 && event.getKeyCode() == 0) {
            handlePasteEvent(context);
            return true;
        }
        return false;
    }

    public static String File_getArceusFolder(Context context, String folder_name) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), folder_name);
        arceusXDirectory.mkdirs();
        return arceusXDirectory.getAbsolutePath();
    }

    public static float getMaxRefreshRate(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display display = windowManager.getDefaultDisplay();
        Display.Mode mode = display.getMode();
        return mode.getRefreshRate();
    }

    public static int getWifiSignalStrength(Context context) {
        WifiManager wifi = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        WifiInfo wifiInfo = wifi.getConnectionInfo();
        int level = WifiManager.calculateSignalLevel(wifiInfo.getRssi(), 101);
        return level;
    }

    public static int getBatteryPercentage(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent batteryStatus = context.registerReceiver(null, intentFilter);
        if (batteryStatus == null) {
            throw new AssertionError();
        }
        int level = batteryStatus.getIntExtra("level", -1);
        int scale = batteryStatus.getIntExtra("scale", -1);
        float batteryPercentage = (level / scale) * 100.0f;
        return (int) batteryPercentage;
    }
}
