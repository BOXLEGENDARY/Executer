package db;

import bb.f;
import com.squareup.moshi.h;
import com.squareup.moshi.t;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.e;

final class b<T> implements f<T, RequestBody> {
    private static final MediaType b = MediaType.get("application/json; charset=UTF-8");
    private final h<T> a;

    b(h<T> hVar) {
        this.a = hVar;
    }

    public RequestBody a(T t) throws IOException {
        e eVar = new e();
        this.a.toJson(t.k0(eVar), t);
        return RequestBody.create(b, eVar.C0());
    }
}
