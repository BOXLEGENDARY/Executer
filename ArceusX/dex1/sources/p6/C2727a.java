package p6;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class C2727a implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String string = request.url().toString();
        if (!string.matches(".*/settings-compressed/application/[^/]+/(?:bucket/[^/]+/)?[^/]+\\.dcz")) {
            return chain.proceed(request);
        }
        return chain.proceed(request.newBuilder().header("X-Rbx-Zstd-Dict-SHA", string.split("/")[r1.length - 1].replace(".dcz", BuildConfig.FLAVOR)).build());
    }
}
