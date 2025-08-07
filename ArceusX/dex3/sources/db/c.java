package db;

import bb.f;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import java.io.IOException;
import okhttp3.ResponseBody;
import okio.g;
import okio.h;

final class c<T> implements f<ResponseBody, T> {
    private static final h b = h.f("EFBBBF");
    private final com.squareup.moshi.h<T> a;

    c(com.squareup.moshi.h<T> hVar) {
        this.a = hVar;
    }

    public T a(ResponseBody responseBody) throws IOException {
        g gVarSource = responseBody.source();
        try {
            if (gVarSource.r0(0L, b)) {
                gVarSource.E0(r1.E());
            }
            m mVarT0 = m.t0(gVarSource);
            T t = (T) this.a.fromJson(mVarT0);
            if (mVarT0.H0() != m.c.C) {
                throw new j("JSON document was not fully consumed.");
            }
            responseBody.close();
            return t;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
