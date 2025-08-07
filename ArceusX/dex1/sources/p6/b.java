package p6;

import com.github.luben.zstd.ZstdInputStream;
import com.roblox.client.RobloxApplication;
import ha.C2696b;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.g;
import okio.w;

public class b implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        byte[] bArrA;
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.body() == null || (str = responseProceed.headers().get("Content-Encoding")) == null) {
            return responseProceed;
        }
        if (!str.equals("zstd") && !str.equals("dcz")) {
            return responseProceed;
        }
        if (str.equals("dcz")) {
            Response.Builder builderMessage = responseProceed.newBuilder().code(404).message("Dictionary not found");
            String strHeader = responseProceed.request().header("X-Rbx-Zstd-Dict-SHA");
            if (strHeader == null) {
                return builderMessage.build();
            }
            bArrA = C2696b.b().a(RobloxApplication.a(), strHeader);
            if (bArrA == null) {
                return builderMessage.build();
            }
        } else {
            bArrA = null;
        }
        ZstdInputStream zstdInputStream = new ZstdInputStream(responseProceed.body().byteStream());
        g gVarD = w.d(w.l(zstdInputStream));
        if (bArrA != null) {
            zstdInputStream.setDict(bArrA);
        }
        return responseProceed.newBuilder().body(ResponseBody.create(responseProceed.body().contentType(), -1L, gVarD)).build();
    }
}
