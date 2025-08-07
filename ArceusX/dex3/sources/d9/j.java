package d9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR#\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Ld9/j;", "Ld9/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "f", "()Ljava/lang/String;", "b", "", "a", "()V", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "LP9/h;", "g", "()Landroid/content/SharedPreferences;", "prefs", "c", "Ljava/lang/String;", "androidId", "d", "appSetId", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j implements d9.c {

    @NotNull
    private final Context context;

    @NotNull
    private final P9.h prefs;

    @NotNull
    private final String androidId;

    @NotNull
    private String appSetId;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<Byte, CharSequence> {
        public static final a d = new a();

        a() {
            super(1);
        }

        @NotNull
        public final CharSequence a(byte b) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        public Object invoke(Object obj) {
            return a(((Number) obj).byteValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "a", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function0<SharedPreferences> {
        b() {
            super(0);
        }

        public final SharedPreferences invoke() {
            return j.this.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld3/c;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ld3/c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function1<d3.c, Unit> {
        c() {
            super(1);
        }

        public final void a(d3.c cVar) {
            j jVar = j.this;
            String strA = cVar.a();
            Intrinsics.checkNotNullExpressionValue(strA, "getId(...)");
            jVar.appSetId = strA;
        }

        public Object invoke(Object obj) {
            a((d3.c) obj);
            return Unit.a;
        }
    }

    public j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = P9.i.b(new b());
        this.androidId = f();
        this.appSetId = "";
    }

    private final String f() throws NoSuchAlgorithmException {
        String string = g().getString("ANDROID_ID", null);
        if (string != null && !StringsKt.Y(string)) {
            return string;
        }
        String string2 = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string2 == null || StringsKt.Y(string2)) {
            return "";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "MODEL");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.d(bArrDigest);
        String str2 = string2 + kotlin.collections.i.K(bArrDigest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.d, 30, (Object) null);
        g().edit().putString("ANDROID_ID", str2).apply();
        return str2;
    }

    private final SharedPreferences g() {
        return (SharedPreferences) this.prefs.getValue();
    }

    public static final void h(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    @Override
    public void a() {
        if (StringsKt.Y(this.androidId)) {
            d3.b bVarA = d3.a.a(this.context);
            Intrinsics.checkNotNullExpressionValue(bVarA, "getClient(...)");
            Task taskB = bVarA.b();
            Intrinsics.checkNotNullExpressionValue(taskB, "getAppSetIdInfo(...)");
            final c cVar = new c();
            taskB.e(new a4.g() {
                public final void onSuccess(Object obj) {
                    j.h(cVar, obj);
                }
            });
        }
    }

    @Override
    @NotNull
    public String b() {
        if (!StringsKt.Y(this.androidId)) {
            return this.androidId;
        }
        if (this.appSetId.length() == 0) {
            a();
        }
        return this.appSetId;
    }
}
