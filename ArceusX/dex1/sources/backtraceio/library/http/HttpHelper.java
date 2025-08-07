package backtraceio.library.http;

import backtraceio.library.logger.BacktraceLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class HttpHelper {
    private static final String LOG_TAG = "HttpHelper";

    public static String getResponseMessage(HttpURLConnection httpURLConnection) throws IOException {
        BacktraceLogger.d(LOG_TAG, "Reading response from HTTP request");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
        }
    }
}
