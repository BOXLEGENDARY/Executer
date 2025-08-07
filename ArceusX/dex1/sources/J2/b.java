package J2;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

final class b extends Thread {

    private final Map f1715d;

    b(a aVar, Map map) {
        this.f1715d = map;
    }

    @Override
    public final void run() {
        String message;
        StringBuilder sb;
        String str;
        new d();
        Map map = this.f1715d;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(string);
                    Log.w("HttpUrlPinger", sb2.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e7) {
            e = e7;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(message).length());
            str = "Error while parsing ping URL: ";
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (RuntimeException e9) {
            e = e9;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        }
    }
}
