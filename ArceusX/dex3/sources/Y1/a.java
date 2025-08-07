package Y1;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class a implements d {

    @NonNull
    private final HttpURLConnection d;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.d = httpURLConnection;
    }

    private String b(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override
    public void close() {
        this.d.disconnect();
    }

    @Override
    public boolean isSuccessful() {
        try {
            return this.d.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override
    public String l0() {
        return this.d.getContentType();
    }

    @Override
    public String p0() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.d.getURL() + ". Failed with " + this.d.getResponseCode() + "\n" + b(this.d);
        } catch (IOException e) {
            b2.d.d("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override
    @NonNull
    public InputStream w0() throws IOException {
        return this.d.getInputStream();
    }
}
