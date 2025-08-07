package T8;

import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LT8/f;", "", "<init>", "()V", "LT8/c;", "flags", "Lokhttp3/Interceptor;", "b", "(LT8/c;)Lokhttp3/Interceptor;", "a", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LT8/f$a;", "", "<init>", "()V", "", "Lcom/squareup/workflow1/ui/A;", "a", "()Ljava/util/Set;", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<A<?>> a() {
            return L.c(o.INSTANCE);
        }

        private Companion() {
        }
    }

    public static final Response c(c cVar, Interceptor.Chain chain) throws JSONException, P9.m {
        Intrinsics.checkNotNullParameter(cVar, "$flags");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        MultipartBody multipartBodyBody = request.body();
        if (!Intrinsics.b(CollectionsKt.W(request.url().pathSegments()), "transition") || multipartBodyBody == null || !cVar.getIsSandboxModeEnabled()) {
            return chain.proceed(request);
        }
        String strA = c.INSTANCE.a(cVar.getDebugForcedStatus());
        MediaType mediaTypeContentType = multipartBodyBody.contentType();
        String strSubtype = mediaTypeContentType != null ? mediaTypeContentType.subtype() : null;
        if (Intrinsics.b(strSubtype, "form-data")) {
            MultipartBody multipartBody = multipartBodyBody;
            MultipartBody.Builder type = new MultipartBody.Builder((String) null, 1, (DefaultConstructorMarker) null).setType(multipartBody.contentType());
            Iterator it = multipartBody.parts().iterator();
            while (it.hasNext()) {
                type.addPart((MultipartBody.Part) it.next());
            }
            return chain.proceed(request.newBuilder().method(request.method(), type.addFormDataPart("meta[workflowInitialVariables][debugForcedStatus]", strA).build()).build());
        }
        if (!Intrinsics.b(strSubtype, "json")) {
            return chain.proceed(request);
        }
        okio.e eVar = new okio.e();
        multipartBodyBody.writeTo(eVar);
        JSONObject jSONObject = new JSONObject(eVar.W0());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", strA));
        jSONObject.put("meta", jSONObjectOptJSONObject);
        RequestBody.Companion companion = RequestBody.Companion;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return chain.proceed(request.newBuilder().method(request.method(), companion.create(string, multipartBodyBody.contentType())).build());
    }

    @NotNull
    public static final Set<A<?>> d() {
        return INSTANCE.a();
    }

    @NotNull
    public final Interceptor b(@NotNull final c flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new Interceptor() {
            public final Response intercept(Interceptor.Chain chain) {
                return f.c(flags, chain);
            }
        };
    }
}
