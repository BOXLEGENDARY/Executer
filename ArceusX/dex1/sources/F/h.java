package f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.github.luben.zstd.BuildConfig;
import e.C2407g;
import f.AbstractC2431a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u0000 \n2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0007\n\r\u0014\u0012\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lf/h;", "Lf/a;", "Le/g;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Le/g;)Landroid/content/Intent;", "Lf/a$a;", "b", "(Landroid/content/Context;Le/g;)Lf/a$a;", BuildConfig.FLAVOR, "resultCode", "intent", "d", "(ILandroid/content/Intent;)Landroid/net/Uri;", "c", "e", "f", "g", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class h extends AbstractC2431a<C2407g, Uri> {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lf/h$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "c", "()Z", "e", "Landroid/content/Context;", "context", "d", "(Landroid/content/Context;)Z", "Landroid/content/pm/ResolveInfo;", "a", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", "Lf/h$g;", "input", BuildConfig.FLAVOR, "b", "(Lf/h$g;)Ljava/lang/String;", "GMS_ACTION_PICK_IMAGES", "Ljava/lang/String;", "GMS_EXTRA_PICK_IMAGES_MAX", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResolveInfo a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String b(g input) throws P9.m {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof d) {
                return "image/*";
            }
            if (input instanceof f) {
                return "video/*";
            }
            if (input instanceof e) {
                return ((e) input).getMimeType();
            }
            if (input instanceof c) {
                return null;
            }
            throw new P9.m();
        }

        public final boolean c() {
            return e();
        }

        public final boolean d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return a(context) != null;
        }

        public final boolean e() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                return true;
            }
            return i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lf/h$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "()I", "value", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lf/h$b$a;", "Lf/h$b;", "<init>", "()V", BuildConfig.FLAVOR, "b", "I", "a", "()I", "value", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends b {

            public static final a f20434a = new a();

            private static final int value = 1;

            private a() {
                super(null);
            }

            @Override
            public int a() {
                return value;
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf/h$c;", "Lf/h$g;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements g {

        public static final c f20436a = new c();

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf/h$d;", "Lf/h$g;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements g {

        public static final d f20437a = new d();

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lf/h$e;", "Lf/h$g;", BuildConfig.FLAVOR, "a", "Ljava/lang/String;", "()Ljava/lang/String;", "mimeType", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements g {

        private final String mimeType;

        public final String getMimeType() {
            return this.mimeType;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf/h$f;", "Lf/h$g;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements g {

        public static final f f20439a = new f();

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lf/h$g;", BuildConfig.FLAVOR, "Lf/h$c;", "Lf/h$d;", "Lf/h$e;", "Lf/h$f;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface g {
    }

    public static final boolean c() {
        return INSTANCE.c();
    }

    @Override
    public Intent createIntent(Context context, C2407g input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Companion companion = INSTANCE;
        if (companion.e()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(companion.b(input.getMediaType()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
            if (!input.getIsCustomAccentColorApplied()) {
                return intent;
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
            return intent;
        }
        if (!companion.d(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(companion.b(input.getMediaType()));
            if (intent2.getType() != null) {
                return intent2;
            }
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent2;
        }
        ResolveInfo resolveInfoA = companion.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(companion.b(input.getMediaType()));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
        if (input.getIsCustomAccentColorApplied()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
        }
        return intent3;
    }

    @Override
    public final AbstractC2431a.C0186a<Uri> getSynchronousResult(Context context, C2407g input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override
    public final Uri parseResult(int resultCode, Intent intent) {
        if (resultCode != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) CollectionsKt.firstOrNull(C2432b.INSTANCE.a(intent));
        }
        return data;
    }
}
