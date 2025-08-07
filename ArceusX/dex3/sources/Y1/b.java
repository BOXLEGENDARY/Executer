package Y1;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class b implements f {
    @Override
    @NonNull
    public d a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
