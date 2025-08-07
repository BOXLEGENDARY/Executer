package Z6;

import Q6.QtA.QXojhh;
import V5.h;
import android.content.Context;
import android.text.TextUtils;
import h7.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    private Context f8234a;

    public a(Context context) {
        this(context, null);
    }

    private File c() {
        return new File("/data/local/tmp/ClientAppSettings.json");
    }

    private File d() {
        return this.f8234a.getApplicationContext().getFilesDir();
    }

    private File e() {
        return new File(d(), "exe/ClientSettings/ClientAppSettings.json");
    }

    private String g(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e7) {
            l.d("rbx.settings.local", "Exception caught when readLocalSettings: file: " + file.getName() + ": " + e7);
            j("Exception caught when readLocalSettings.");
        }
        return sb.toString();
    }

    private void j(String str) {
    }

    public void a() {
        File fileE = e();
        if (fileE.exists()) {
            l.a("rbx.settings.local", "saveLocalSettings: file: " + fileE.getName() + ", DeletedOK = " + fileE.delete());
        }
    }

    public String b() {
        try {
            String strF = f();
            if (strF == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strF);
            if (jSONObject.has("FStringAuthCookie")) {
                return jSONObject.getString("FStringAuthCookie");
            }
            l.k("rbx.settings.local", "getAuthCookieFromSettings: 'FStringAuthCookie' key not found in settings");
            return null;
        } catch (JSONException e7) {
            l.e("rbx.settings.local", "getAuthCookieFromSettings: Failed to parse JSON", e7);
            return null;
        }
    }

    public String f() {
        try {
            return new JSONObject(g(c())).toString();
        } catch (JSONException unused) {
            l.d("rbx.settings.local", QXojhh.ooslO);
            return null;
        }
    }

    public String h() {
        File fileE = e();
        if (fileE.exists()) {
            return g(fileE);
        }
        return null;
    }

    public void i(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            a();
            j("Clear the existing settings.");
            return;
        }
        try {
            String string = new JSONObject(str).toString();
            File file = new File(d(), "exe/ClientSettings/");
            if (!file.exists() && !file.mkdirs()) {
                j("Failed to create the directory to hold Local settings.");
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(e());
                fileOutputStream.write(string.getBytes());
                fileOutputStream.close();
                j("Finished saving to the device.");
            } catch (IOException e7) {
                l.d("rbx.settings.local", "File writing failed: " + e7.toString());
                j("Failed to write file to the device.");
            }
        } catch (JSONException unused) {
            j("The input is not a valid JSON string");
        }
    }

    public a(Context context, h hVar) {
        this.f8234a = context;
    }
}
