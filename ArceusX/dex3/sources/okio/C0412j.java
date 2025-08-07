package okio;

import K1.c;
import K1.h;
import P9.m;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.f;
import ha.C0334c;
import ha.InterfaceC0333b;
import ha.InterfaceC0878c;
import ha.Parameters;
import ha.Tags;
import ha.ViewOnAttachStateChangeListenerC0368t;
import ha.a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0001*\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u0012*\u00020\u0015H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020'*\u00020'2\u0006\u0010(\u001a\u00020\u0005H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010-\u001a\u00020,*\u00020+H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u00105\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u000201H\u0000¢\u0006\u0004\b5\u00106\" \u0010<\u001a\b\u0012\u0004\u0012\u000208078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b:\u0010;\"\u001a\u0010@\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\b>\u0010?\"\u001a\u0010D\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010A\u001a\u0004\bB\u0010C\"\u0018\u0010I\u001a\u00020F*\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0018\u0010M\u001a\u00020\u0015*\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0018\u0010O\u001a\u00020\u0015*\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010L\"\u0018\u0010R\u001a\u00020\u0012*\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\"\u0018\u0010 \u001a\u00020\u001f*\u00020S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u001a\u0010X\u001a\u0004\u0018\u00010\u0005*\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W\"\u0018\u0010\\\u001a\u00020\u0015*\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0018\u0010`\u001a\u00020]*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\"\u0018\u0010d\u001a\u00020\u0012*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\"\u0018\u0010h\u001a\u00020e*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006i"}, d2 = {"Ljava/io/Closeable;", "", "d", "(Ljava/io/Closeable;)V", "Landroid/webkit/MimeTypeMap;", "", "url", "j", "(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "x", "(Lokhttp3/Headers;)Lokhttp3/Headers;", "LJ1/r;", "w", "(LJ1/r;)LJ1/r;", "LJ1/m;", "v", "(LJ1/m;)LJ1/m;", "", "r", "()Z", "", "defaultValue", "z", "(Ljava/lang/String;I)I", "LC1/a$b;", "a", "(LC1/a$b;)V", "s", "(I)Z", "LK1/c;", "LK1/h;", "scale", "A", "(LK1/c;LK1/h;)I", "Landroid/net/Uri;", "uri", "q", "(Landroid/net/Uri;)Z", "Lokhttp3/Headers$Builder;", "line", "b", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "Lokhttp3/Response;", "Lokhttp3/ResponseBody;", "y", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)D", "percent", "c", "(Landroid/content/Context;D)I", "", "Landroid/graphics/Bitmap$Config;", "[Landroid/graphics/Bitmap$Config;", "o", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "EMPTY_HEADERS", "Landroid/view/View;", "LJ1/t;", "l", "(Landroid/view/View;)LJ1/t;", "requestManager", "Landroid/graphics/drawable/Drawable;", "p", "(Landroid/graphics/drawable/Drawable;)I", "width", "i", "height", "u", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "Landroid/widget/ImageView;", "n", "(Landroid/widget/ImageView;)LK1/h;", "h", "(Landroid/net/Uri;)Ljava/lang/String;", "firstPathSegment", "Landroid/content/res/Configuration;", "k", "(Landroid/content/res/Configuration;)I", "nightMode", "Ljava/io/File;", "m", "(Landroid/content/Context;)Ljava/io/File;", "safeCacheDir", "LF1/b$a;", "t", "(LF1/b$a;)Z", "isPlaceholderCached", "Lz1/c;", "g", "(LF1/b$a;)Lz1/c;", "eventListener", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0412j {

    @NotNull
    private static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    @NotNull
    private static final Bitmap.Config b = Bitmap.Config.HARDWARE;

    @NotNull
    private static final Headers c = new Headers.Builder().build();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public class a {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[h.values().length];
            try {
                iArr3[h.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[h.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            c = iArr3;
        }
    }

    public static final int A(@NotNull c cVar, @NotNull h hVar) throws m {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).px;
        }
        int i = a.c[hVar.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new m();
    }

    public static final void a(@NotNull a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final Headers.Builder b(@NotNull Headers.Builder builder, @NotNull String str) {
        int iV = StringsKt.V(str, ':', 0, false, 6, (Object) null);
        if (iV == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iV);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.Q0(strSubstring).toString();
        String strSubstring2 = str.substring(iV + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        builder.addUnsafeNonAscii(string, strSubstring2);
        return builder;
    }

    public static final int c(@NotNull Context context, double d) {
        int largeMemoryClass;
        try {
            Object objJ = androidx.core.content.a.j(context, ActivityManager.class);
            Intrinsics.d(objJ);
            ActivityManager activityManager = (ActivityManager) objJ;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d2 = 1024;
        return (int) (d * largeMemoryClass * d2 * d2);
    }

    public static final void d(@NotNull Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final double e(@NotNull Context context) {
        try {
            Object objJ = androidx.core.content.a.j(context, ActivityManager.class);
            Intrinsics.d(objJ);
            return ((ActivityManager) objJ).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @NotNull
    public static final Bitmap.Config f() {
        return b;
    }

    @NotNull
    public static final InterfaceC0878c g(@NotNull InterfaceC0333b.a aVar) {
        return aVar instanceof C0334c ? ((C0334c) aVar).getEventListener() : InterfaceC0878c.b;
    }

    public static final String h(@NotNull Uri uri) {
        return (String) CollectionsKt.firstOrNull(uri.getPathSegments());
    }

    public static final int i(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String j(@NotNull MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.Y(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.K0(StringsKt.L0(StringsKt.P0(StringsKt.P0(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final int k(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    public static final ViewOnAttachStateChangeListenerC0368t l(@NotNull View view) {
        int i = A1.a.a;
        Object tag = view.getTag(i);
        ViewOnAttachStateChangeListenerC0368t viewOnAttachStateChangeListenerC0368t = tag instanceof ViewOnAttachStateChangeListenerC0368t ? (ViewOnAttachStateChangeListenerC0368t) tag : null;
        if (viewOnAttachStateChangeListenerC0368t == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(i);
                    ViewOnAttachStateChangeListenerC0368t viewOnAttachStateChangeListenerC0368t2 = tag2 instanceof ViewOnAttachStateChangeListenerC0368t ? (ViewOnAttachStateChangeListenerC0368t) tag2 : null;
                    if (viewOnAttachStateChangeListenerC0368t2 != null) {
                        viewOnAttachStateChangeListenerC0368t = viewOnAttachStateChangeListenerC0368t2;
                    } else {
                        viewOnAttachStateChangeListenerC0368t = new ViewOnAttachStateChangeListenerC0368t(view);
                        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0368t);
                        view.setTag(i, viewOnAttachStateChangeListenerC0368t);
                    }
                } finally {
                }
            }
        }
        return viewOnAttachStateChangeListenerC0368t;
    }

    @NotNull
    public static final File m(@NotNull Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    @NotNull
    public static final h n(@NotNull ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : a.b[scaleType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4) ? h.e : h.d;
    }

    @NotNull
    public static final Bitmap.Config[] o() {
        return a;
    }

    public static final int p(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean q(@NotNull Uri uri) {
        return Intrinsics.b(uri.getScheme(), "file") && Intrinsics.b(h(uri), "android_asset");
    }

    public static final boolean r() {
        return Intrinsics.b(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean t(@NotNull InterfaceC0333b.a aVar) {
        return (aVar instanceof C0334c) && ((C0334c) aVar).getIsPlaceholderCached();
    }

    public static final boolean u(@NotNull Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof f);
    }

    @NotNull
    public static final Parameters v(Parameters parameters) {
        return parameters == null ? Parameters.i : parameters;
    }

    @NotNull
    public static final Tags w(Tags tags) {
        return tags == null ? Tags.c : tags;
    }

    @NotNull
    public static final Headers x(Headers headers) {
        return headers == null ? c : headers;
    }

    @NotNull
    public static final ResponseBody y(@NotNull Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            return responseBodyBody;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int z(@NotNull String str, int i) {
        Long l = StringsKt.l(str);
        if (l == null) {
            return i;
        }
        long jLongValue = l.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }
}
