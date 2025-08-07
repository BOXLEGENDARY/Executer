package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import J8.InquiryAttributes;
import P9.o;
import P9.p;
import X9.n;
import android.content.Context;
import android.content.res.Resources;
import bb.t;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.A;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "LI8/a;", "Lcom/squareup/moshi/w;", "moshi", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "", "staticTemplateResourceId", "<init>", "(Lcom/squareup/moshi/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)V", "LJ8/c;", "attributes", "LP9/o;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(LJ8/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Lbb/t;", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/squareup/moshi/w;", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f implements I8.a {

    @NotNull
    private final w moshi;

    @NotNull
    private final Context context;

    @NotNull
    private final i.a staticTemplateSessionFactory;

    private final int staticTemplateResourceId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;", "", "", "staticTemplateResourceId", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "a", "(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        f a(int staticTemplateResourceId);
    }

    public f(@NotNull w wVar, @NotNull Context context, @NotNull i.a aVar, int i) {
        Intrinsics.checkNotNullParameter(wVar, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "staticTemplateSessionFactory");
        this.moshi = wVar;
        this.context = context;
        this.staticTemplateSessionFactory = aVar;
        this.staticTemplateResourceId = i;
    }

    @Override
    public Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull Continuation<? super t<?>> continuation) {
        t tVarI = t.i((Object) null);
        Intrinsics.checkNotNullExpressionValue(tVarI, "success(...)");
        return tVarI;
    }

    @Override
    public Object b(@NotNull String str, @NotNull RequestBody requestBody, @NotNull Continuation<? super t<?>> continuation) {
        t tVarI = t.i((Object) null);
        Intrinsics.checkNotNullExpressionValue(tVarI, "success(...)");
        return tVarI;
    }

    @Override
    public Object c(@NotNull InquiryAttributes inquiryAttributes, @NotNull Continuation<? super o<i>> continuation) throws Resources.NotFoundException {
        String string;
        try {
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(this.staticTemplateResourceId);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strF = n.f(bufferedReader);
                ArrayList arrayList = null;
                X9.c.a(bufferedReader, (Throwable) null);
                JSONArray jSONArrayOptJSONArray = new JSONObject(strF).optJSONArray("steps");
                if (jSONArrayOptJSONArray == null || (string = jSONArrayOptJSONArray.toString()) == null) {
                    o.a aVar = o.e;
                    return o.b(p.a(new I8.b("Failed to open resource as static template")));
                }
                List list = (List) this.moshi.d(A.j(List.class, new Type[]{NextStep.class})).fromJson(string);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt.t(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    o.a aVar2 = o.e;
                    return o.b(p.a(new I8.b("Expected steps to contain at least one step")));
                }
                o.a aVar3 = o.e;
                i.a aVar4 = this.staticTemplateSessionFactory;
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return o.b(aVar4.a(arrayList, string2));
            } finally {
            }
        } catch (Exception unused) {
            o.a aVar5 = o.e;
            return o.b(p.a(new I8.b("Failed to open resource as static template. Resource not found.")));
        }
    }
}
