package ha;

import E1.i;
import K1.Size;
import K1.d;
import K1.e;
import K1.j;
import K1.k;
import K1.l;
import K1.m;
import N1.a;
import N1.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.h;
import coil.memory.MemoryCache;
import coil.target.ImageViewTarget;
import ha.H;
import ha.Parameters;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.C0406d;
import okio.C0410h;
import okio.C0412j;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bh\u0018\u00002\u00020\u0001:\u0002SOB÷\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u001c\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\b\u0010>\u001a\u0004\u0018\u00010;\u0012\b\u0010?\u001a\u0004\u0018\u000109\u0012\b\u0010@\u001a\u0004\u0018\u00010;\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020G2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u000209H\u0016¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR-\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bi\u0010s\u001a\u0004\bt\u0010uR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bm\u0010v\u001a\u0004\bw\u0010xR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bU\u0010|\u001a\u0004\b}\u0010~R\u001a\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010!\u001a\u00020 8\u0006¢\u0006\u000f\n\u0005\bw\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010#\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\bg\u0010\u0088\u0001R\u001a\u0010$\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0087\u0001\u001a\u0005\bk\u0010\u0088\u0001R\u0019\u0010%\u001a\u00020\"8\u0006¢\u0006\u000e\n\u0005\be\u0010\u0087\u0001\u001a\u0005\bo\u0010\u0088\u0001R\u001b\u0010&\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0006\b\u008b\u0001\u0010\u0088\u0001R\u001b\u0010(\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010)\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008d\u0001\u001a\u0006\b\u008a\u0001\u0010\u008f\u0001R\u001b\u0010*\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008d\u0001\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001R\u001a\u0010,\u001a\u00020+8\u0006¢\u0006\u000f\n\u0005\bt\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010-\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0093\u0001\u001a\u0006\b\u0091\u0001\u0010\u0095\u0001R\u001a\u0010.\u001a\u00020+8\u0006¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0093\u0001\u001a\u0005\b\u007f\u0010\u0095\u0001R\u001b\u0010/\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0093\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001a\u00101\u001a\u0002008\u0006¢\u0006\u000f\n\u0005\b]\u0010\u0098\u0001\u001a\u0006\b\u0096\u0001\u0010\u0099\u0001R\u001a\u00103\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\ba\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u00105\u001a\u0002048\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u00107\u001a\u0002068\u0006¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001b\u00108\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010`\u001a\u0005\b£\u0001\u0010bR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¦\u0001R\u0017\u0010=\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bq\u0010¥\u0001R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010¦\u0001R\u0018\u0010?\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010¥\u0001R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010¦\u0001R\u001b\u0010B\u001a\u00020A8\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010§\u0001\u001a\u0006\b\u0089\u0001\u0010¨\u0001R\u001a\u0010D\u001a\u00020C8\u0006¢\u0006\u000f\n\u0005\bY\u0010©\u0001\u001a\u0006\b\u0086\u0001\u0010ª\u0001R\u0016\u0010¬\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010«\u0001R\u0016\u0010\u00ad\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010«\u0001R\u0016\u0010®\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"LJ1/g;", "", "Landroid/content/Context;", "context", "data", "LL1/a;", "target", "LJ1/g$b;", "listener", "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "colorSpace", "LK1/e;", "precision", "Lkotlin/Pair;", "LE1/i$a;", "Ljava/lang/Class;", "fetcherFactory", "LB1/h$a;", "decoderFactory", "", "LM1/a;", "transformations", "LN1/c$a;", "transitionFactory", "Lokhttp3/Headers;", "headers", "LJ1/r;", "tags", "", "allowConversionToBitmap", "allowHardware", "allowRgb565", "premultipliedAlpha", "LJ1/a;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lha/H;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Landroidx/lifecycle/h;", "lifecycle", "LK1/j;", "sizeResolver", "LK1/h;", "scale", "LJ1/m;", "parameters", "placeholderMemoryCacheKey", "", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "LJ1/c;", "defined", "LJ1/b;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;LL1/a;LJ1/g$b;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;LK1/e;Lkotlin/Pair;LB1/h$a;Ljava/util/List;LN1/c$a;Lokhttp3/Headers;LJ1/r;ZZZZLJ1/a;LJ1/a;LJ1/a;Lha/H;Lha/H;Lha/H;Lha/H;Landroidx/lifecycle/h;LK1/j;LK1/h;LJ1/m;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;LJ1/c;LJ1/b;)V", "LJ1/g$a;", "Q", "(Landroid/content/Context;)LJ1/g$a;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "b", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "c", "LL1/a;", "M", "()LL1/a;", "d", "LJ1/g$b;", "A", "()LJ1/g$b;", "e", "Lcoil/memory/MemoryCache$Key;", "B", "()Lcoil/memory/MemoryCache$Key;", "f", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "g", "Landroid/graphics/Bitmap$Config;", "j", "()Landroid/graphics/Bitmap$Config;", "h", "Landroid/graphics/ColorSpace;", "k", "()Landroid/graphics/ColorSpace;", "i", "LK1/e;", "H", "()LK1/e;", "Lkotlin/Pair;", "w", "()Lkotlin/Pair;", "LB1/h$a;", "o", "()LB1/h$a;", "Ljava/util/List;", "O", "()Ljava/util/List;", "LN1/c$a;", "P", "()LN1/c$a;", "n", "Lokhttp3/Headers;", "x", "()Lokhttp3/Headers;", "LJ1/r;", "L", "()LJ1/r;", "p", "Z", "()Z", "q", "s", "I", "t", "LJ1/a;", "C", "()LJ1/a;", "u", "v", "D", "Lha/H;", "y", "()Lha/H;", "z", "N", "Landroidx/lifecycle/h;", "()Landroidx/lifecycle/h;", "LK1/j;", "K", "()LK1/j;", "LK1/h;", "J", "()LK1/h;", "LJ1/m;", "E", "()LJ1/m;", "G", "F", "Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "LJ1/c;", "()LJ1/c;", "LJ1/b;", "()LJ1/b;", "()Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0356g {

    @NotNull
    private final h lifecycle;

    @NotNull
    private final j sizeResolver;

    @NotNull
    private final K1.h scale;

    @NotNull
    private final Parameters parameters;

    private final MemoryCache.Key placeholderMemoryCacheKey;

    private final Integer placeholderResId;

    private final Drawable placeholderDrawable;

    private final Integer errorResId;

    private final Drawable errorDrawable;

    private final Integer fallbackResId;

    private final Drawable fallbackDrawable;

    @NotNull
    private final C0352c defined;

    @NotNull
    private final C0351b defaults;

    @NotNull
    private final Context context;

    @NotNull
    private final Object data;

    private final L1.a target;

    private final b listener;

    private final MemoryCache.Key memoryCacheKey;

    private final String diskCacheKey;

    @NotNull
    private final Bitmap.Config bitmapConfig;

    private final ColorSpace colorSpace;

    @NotNull
    private final e precision;

    private final Pair<i.a<?>, Class<?>> fetcherFactory;

    private final h.a decoderFactory;

    @NotNull
    private final List<M1.a> transformations;

    @NotNull
    private final c.a transitionFactory;

    @NotNull
    private final Headers headers;

    @NotNull
    private final Tags tags;

    private final boolean allowConversionToBitmap;

    private final boolean allowHardware;

    private final boolean allowRgb565;

    private final boolean premultipliedAlpha;

    @NotNull
    private final EnumC0350a memoryCachePolicy;

    @NotNull
    private final EnumC0350a diskCachePolicy;

    @NotNull
    private final EnumC0350a networkCachePolicy;

    @NotNull
    private final H interceptorDispatcher;

    @NotNull
    private final H fetcherDispatcher;

    @NotNull
    private final H decoderDispatcher;

    @NotNull
    private final H transformationDispatcher;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"LJ1/g$b;", "", "LJ1/g;", "request", "", "a", "(LJ1/g;)V", "c", "LJ1/e;", "result", "b", "(LJ1/g;LJ1/e;)V", "LJ1/p;", "d", "(LJ1/g;LJ1/p;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        default void a(@NotNull C0356g request) {
        }

        default void b(@NotNull C0356g request, @NotNull C0354e result) {
        }

        default void c(@NotNull C0356g request) {
        }

        default void d(@NotNull C0356g request, @NotNull C0365p result) {
        }
    }

    public C0356g(Context context, Object obj, L1.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, e eVar, Pair pair, h.a aVar2, List list, c.a aVar3, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, EnumC0350a enumC0350a, EnumC0350a enumC0350a2, EnumC0350a enumC0350a3, H h, H h2, H h3, H h4, androidx.lifecycle.h hVar, j jVar, K1.h hVar2, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C0352c c0352c, C0351b c0351b, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, aVar, bVar, key, str, config, colorSpace, eVar, pair, aVar2, list, aVar3, headers, tags, z, z2, z3, z4, enumC0350a, enumC0350a2, enumC0350a3, h, h2, h3, h4, hVar, jVar, hVar2, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, c0352c, c0351b);
    }

    public static a R(C0356g c0356g, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c0356g.context;
        }
        return c0356g.Q(context);
    }

    public final b getListener() {
        return this.listener;
    }

    public final MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    @NotNull
    public final EnumC0350a getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    public final EnumC0350a getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.parameters;
    }

    public final Drawable F() {
        return C0410h.c(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    public final MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    @NotNull
    public final e getPrecision() {
        return this.precision;
    }

    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    @NotNull
    public final K1.h getScale() {
        return this.scale;
    }

    @NotNull
    public final j getSizeResolver() {
        return this.sizeResolver;
    }

    @NotNull
    public final Tags getTags() {
        return this.tags;
    }

    public final L1.a getTarget() {
        return this.target;
    }

    @NotNull
    public final H getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @NotNull
    public final List<M1.a> O() {
        return this.transformations;
    }

    @NotNull
    public final c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    @NotNull
    public final a Q(@NotNull Context context) {
        return new a(this, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C0356g) {
            C0356g c0356g = (C0356g) other;
            if (Intrinsics.b(this.context, c0356g.context) && Intrinsics.b(this.data, c0356g.data) && Intrinsics.b(this.target, c0356g.target) && Intrinsics.b(this.listener, c0356g.listener) && Intrinsics.b(this.memoryCacheKey, c0356g.memoryCacheKey) && Intrinsics.b(this.diskCacheKey, c0356g.diskCacheKey) && this.bitmapConfig == c0356g.bitmapConfig && Intrinsics.b(this.colorSpace, c0356g.colorSpace) && this.precision == c0356g.precision && Intrinsics.b(this.fetcherFactory, c0356g.fetcherFactory) && Intrinsics.b(this.decoderFactory, c0356g.decoderFactory) && Intrinsics.b(this.transformations, c0356g.transformations) && Intrinsics.b(this.transitionFactory, c0356g.transitionFactory) && Intrinsics.b(this.headers, c0356g.headers) && Intrinsics.b(this.tags, c0356g.tags) && this.allowConversionToBitmap == c0356g.allowConversionToBitmap && this.allowHardware == c0356g.allowHardware && this.allowRgb565 == c0356g.allowRgb565 && this.premultipliedAlpha == c0356g.premultipliedAlpha && this.memoryCachePolicy == c0356g.memoryCachePolicy && this.diskCachePolicy == c0356g.diskCachePolicy && this.networkCachePolicy == c0356g.networkCachePolicy && Intrinsics.b(this.interceptorDispatcher, c0356g.interceptorDispatcher) && Intrinsics.b(this.fetcherDispatcher, c0356g.fetcherDispatcher) && Intrinsics.b(this.decoderDispatcher, c0356g.decoderDispatcher) && Intrinsics.b(this.transformationDispatcher, c0356g.transformationDispatcher) && Intrinsics.b(this.placeholderMemoryCacheKey, c0356g.placeholderMemoryCacheKey) && Intrinsics.b(this.placeholderResId, c0356g.placeholderResId) && Intrinsics.b(this.placeholderDrawable, c0356g.placeholderDrawable) && Intrinsics.b(this.errorResId, c0356g.errorResId) && Intrinsics.b(this.errorDrawable, c0356g.errorDrawable) && Intrinsics.b(this.fallbackResId, c0356g.fallbackResId) && Intrinsics.b(this.fallbackDrawable, c0356g.fallbackDrawable) && Intrinsics.b(this.lifecycle, c0356g.lifecycle) && Intrinsics.b(this.sizeResolver, c0356g.sizeResolver) && this.scale == c0356g.scale && Intrinsics.b(this.parameters, c0356g.parameters) && Intrinsics.b(this.defined, c0356g.defined) && Intrinsics.b(this.defaults, c0356g.defaults)) {
                return true;
            }
        }
        return false;
    }

    public final boolean getAllowConversionToBitmap() {
        return this.allowConversionToBitmap;
    }

    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        L1.a aVar = this.target;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.listener;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.memoryCacheKey;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        Pair<i.a<?>, Class<?>> pair = this.fetcherFactory;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        h.a aVar2 = this.decoderFactory;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + Boolean.hashCode(this.allowConversionToBitmap)) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        MemoryCache.Key key2 = this.placeholderMemoryCacheKey;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.placeholderResId;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.placeholderDrawable;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.errorResId;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.errorDrawable;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.fallbackResId;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallbackDrawable;
        return ((((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final H getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    public final h.a getDecoderFactory() {
        return this.decoderFactory;
    }

    @NotNull
    public final C0351b getDefaults() {
        return this.defaults;
    }

    @NotNull
    public final C0352c getDefined() {
        return this.defined;
    }

    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    public final EnumC0350a getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final Drawable t() {
        return C0410h.c(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    public final Drawable u() {
        return C0410h.c(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    @NotNull
    public final H getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    public final Pair<i.a<?>, Class<?>> w() {
        return this.fetcherFactory;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final H getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @NotNull
    public final androidx.lifecycle.h getLifecycle() {
        return this.lifecycle;
    }

    private C0356g(Context context, Object obj, L1.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, e eVar, Pair<? extends i.a<?>, ? extends Class<?>> pair, h.a aVar2, List<? extends M1.a> list, c.a aVar3, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, EnumC0350a enumC0350a, EnumC0350a enumC0350a2, EnumC0350a enumC0350a3, H h, H h2, H h3, H h4, androidx.lifecycle.h hVar, j jVar, K1.h hVar2, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C0352c c0352c, C0351b c0351b) {
        this.context = context;
        this.data = obj;
        this.target = aVar;
        this.listener = bVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = eVar;
        this.fetcherFactory = pair;
        this.decoderFactory = aVar2;
        this.transformations = list;
        this.transitionFactory = aVar3;
        this.headers = headers;
        this.tags = tags;
        this.allowConversionToBitmap = z;
        this.allowHardware = z2;
        this.allowRgb565 = z3;
        this.premultipliedAlpha = z4;
        this.memoryCachePolicy = enumC0350a;
        this.diskCachePolicy = enumC0350a2;
        this.networkCachePolicy = enumC0350a3;
        this.interceptorDispatcher = h;
        this.fetcherDispatcher = h2;
        this.decoderDispatcher = h3;
        this.transformationDispatcher = h4;
        this.lifecycle = hVar;
        this.sizeResolver = jVar;
        this.scale = hVar2;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = c0352c;
        this.defaults = c0351b;
    }

    @Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010@\u001a\u00020 ¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0015\u0010I\u001a\u00020\u00002\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u0006¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010MR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010NR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010OR\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010_R,\u0010e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030b\u0012\b\u0012\u0006\u0012\u0002\b\u00030c\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010fR\u001c\u0010k\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010lR\u0018\u0010p\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010oR(\u0010s\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030c\u0012\u0004\u0012\u00020\u0001\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010rR\u0016\u0010u\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010vR\u0016\u0010y\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010tR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u007f\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010|R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010|R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0084\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0084\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010TR\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0093\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0096\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0093\u0001R\u001b\u0010\u009f\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0096\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001b\u0010ª\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¡\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¤\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010§\u0001¨\u0006¯\u0001"}, d2 = {"LJ1/g$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LJ1/g;", "request", "(LJ1/g;Landroid/content/Context;)V", "", "k", "()V", "j", "Landroidx/lifecycle/h;", "l", "()Landroidx/lifecycle/h;", "LK1/j;", "n", "()LK1/j;", "LK1/h;", "m", "()LK1/h;", "data", "d", "(Ljava/lang/Object;)LJ1/g$a;", "", "key", "h", "(Ljava/lang/String;)LJ1/g$a;", "Lcoil/memory/MemoryCache$Key;", "g", "(Lcoil/memory/MemoryCache$Key;)LJ1/g$a;", "", "width", "height", "o", "(II)LJ1/g$a;", "LK1/i;", "size", "p", "(LK1/i;)LJ1/g$a;", "resolver", "q", "(LK1/j;)LJ1/g$a;", "LB1/h$a;", "factory", "e", "(LB1/h$a;)LJ1/g$a;", "Landroid/graphics/drawable/Drawable;", "drawable", "i", "(Landroid/graphics/drawable/Drawable;)LJ1/g$a;", "Landroid/widget/ImageView;", "imageView", "s", "(Landroid/widget/ImageView;)LJ1/g$a;", "LL1/a;", "target", "r", "(LL1/a;)LJ1/g$a;", "", "enable", "c", "(Z)LJ1/g$a;", "durationMillis", "b", "(I)LJ1/g$a;", "LN1/c$a;", "transition", "t", "(LN1/c$a;)LJ1/g$a;", "LJ1/b;", "defaults", "f", "(LJ1/b;)LJ1/g$a;", "a", "()LJ1/g;", "Landroid/content/Context;", "LJ1/b;", "Ljava/lang/Object;", "LL1/a;", "LJ1/g$b;", "LJ1/g$b;", "listener", "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "colorSpace", "LK1/e;", "LK1/e;", "precision", "Lkotlin/Pair;", "LE1/i$a;", "Ljava/lang/Class;", "Lkotlin/Pair;", "fetcherFactory", "LB1/h$a;", "decoderFactory", "", "LM1/a;", "Ljava/util/List;", "transformations", "LN1/c$a;", "transitionFactory", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "headers", "", "Ljava/util/Map;", "tags", "Z", "allowConversionToBitmap", "Ljava/lang/Boolean;", "allowHardware", "allowRgb565", "premultipliedAlpha", "LJ1/a;", "u", "LJ1/a;", "memoryCachePolicy", "v", "diskCachePolicy", "w", "networkCachePolicy", "Lha/H;", "x", "Lha/H;", "interceptorDispatcher", "y", "fetcherDispatcher", "z", "decoderDispatcher", "A", "transformationDispatcher", "LJ1/m$a;", "B", "LJ1/m$a;", "parameters", "C", "placeholderMemoryCacheKey", "D", "Ljava/lang/Integer;", "placeholderResId", "E", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "F", "errorResId", "G", "errorDrawable", "H", "fallbackResId", "I", "fallbackDrawable", "J", "Landroidx/lifecycle/h;", "lifecycle", "K", "LK1/j;", "sizeResolver", "L", "LK1/h;", "scale", "M", "resolvedLifecycle", "N", "resolvedSizeResolver", "O", "resolvedScale", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        private H transformationDispatcher;

        private Parameters.a parameters;

        private MemoryCache.Key placeholderMemoryCacheKey;

        private Integer placeholderResId;

        private Drawable placeholderDrawable;

        private Integer errorResId;

        private Drawable errorDrawable;

        private Integer fallbackResId;

        private Drawable fallbackDrawable;

        private androidx.lifecycle.h lifecycle;

        private j sizeResolver;

        private K1.h scale;

        private androidx.lifecycle.h resolvedLifecycle;

        private j resolvedSizeResolver;

        private K1.h resolvedScale;

        @NotNull
        private final Context context;

        @NotNull
        private C0351b defaults;

        private Object data;

        private L1.a target;

        private b listener;

        private MemoryCache.Key memoryCacheKey;

        private String diskCacheKey;

        private Bitmap.Config bitmapConfig;

        private ColorSpace colorSpace;

        private e precision;

        private Pair<? extends i.a<?>, ? extends Class<?>> fetcherFactory;

        private h.a decoderFactory;

        @NotNull
        private List<? extends M1.a> transformations;

        private c.a transitionFactory;

        private Headers.Builder headers;

        private Map<Class<?>, Object> tags;

        private boolean allowConversionToBitmap;

        private Boolean allowHardware;

        private Boolean allowRgb565;

        private boolean premultipliedAlpha;

        private EnumC0350a memoryCachePolicy;

        private EnumC0350a diskCachePolicy;

        private EnumC0350a networkCachePolicy;

        private H interceptorDispatcher;

        private H fetcherDispatcher;

        private H decoderDispatcher;

        public a(@NotNull Context context) {
            this.context = context;
            this.defaults = C0410h.b();
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.diskCacheKey = null;
            this.bitmapConfig = null;
            this.colorSpace = null;
            this.precision = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.transformations = CollectionsKt.j();
            this.transitionFactory = null;
            this.headers = null;
            this.tags = null;
            this.allowConversionToBitmap = true;
            this.allowHardware = null;
            this.allowRgb565 = null;
            this.premultipliedAlpha = true;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.interceptorDispatcher = null;
            this.fetcherDispatcher = null;
            this.decoderDispatcher = null;
            this.transformationDispatcher = null;
            this.parameters = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderResId = null;
            this.placeholderDrawable = null;
            this.errorResId = null;
            this.errorDrawable = null;
            this.fallbackResId = null;
            this.fallbackDrawable = null;
            this.lifecycle = null;
            this.sizeResolver = null;
            this.scale = null;
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        private final void j() {
            this.resolvedScale = null;
        }

        private final void k() {
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        private final androidx.lifecycle.h l() {
            L1.a aVar = this.target;
            androidx.lifecycle.h hVarC = C0406d.c(aVar instanceof L1.b ? ((L1.b) aVar).getView().getContext() : this.context);
            return hVarC == null ? C0355f.b : hVarC;
        }

        private final K1.h m() {
            View viewA;
            j jVar = this.sizeResolver;
            View viewA2 = null;
            l lVar = jVar instanceof l ? (l) jVar : null;
            if (lVar == null || (viewA = lVar.a()) == null) {
                L1.a aVar = this.target;
                L1.b bVar = aVar instanceof L1.b ? (L1.b) aVar : null;
                if (bVar != null) {
                    viewA2 = bVar.getView();
                }
            } else {
                viewA2 = viewA;
            }
            return viewA2 instanceof ImageView ? C0412j.n((ImageView) viewA2) : K1.h.e;
        }

        private final j n() {
            ImageView.ScaleType scaleType;
            L1.a aVar = this.target;
            if (!(aVar instanceof L1.b)) {
                return new d(this.context);
            }
            View viewA = ((L1.b) aVar).getView();
            return ((viewA instanceof ImageView) && ((scaleType = ((ImageView) viewA).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? k.a(Size.d) : m.b(viewA, false, 2, null);
        }

        @NotNull
        public final C0356g a() {
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = C0358i.a;
            }
            Object obj2 = obj;
            L1.a aVar = this.target;
            b bVar = this.listener;
            MemoryCache.Key key = this.memoryCacheKey;
            String str = this.diskCacheKey;
            Bitmap.Config configE = this.bitmapConfig;
            if (configE == null) {
                configE = this.defaults.getBitmapConfig();
            }
            Bitmap.Config config = configE;
            ColorSpace colorSpace = this.colorSpace;
            e eVarO = this.precision;
            if (eVarO == null) {
                eVarO = this.defaults.getPrecision();
            }
            e eVar = eVarO;
            Pair<? extends i.a<?>, ? extends Class<?>> pair = this.fetcherFactory;
            h.a aVar2 = this.decoderFactory;
            List<? extends M1.a> list = this.transformations;
            c.a aVarQ = this.transitionFactory;
            if (aVarQ == null) {
                aVarQ = this.defaults.getTransitionFactory();
            }
            c.a aVar3 = aVarQ;
            Headers.Builder builder = this.headers;
            Headers headersX = C0412j.x(builder != null ? builder.build() : null);
            Map<Class<?>, ? extends Object> map = this.tags;
            Tags tagsW = C0412j.w(map != null ? Tags.INSTANCE.a(map) : null);
            boolean z = this.allowConversionToBitmap;
            Boolean bool = this.allowHardware;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            Boolean bool2 = this.allowRgb565;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z2 = this.premultipliedAlpha;
            EnumC0350a enumC0350aL = this.memoryCachePolicy;
            if (enumC0350aL == null) {
                enumC0350aL = this.defaults.getMemoryCachePolicy();
            }
            EnumC0350a enumC0350a = enumC0350aL;
            EnumC0350a enumC0350aG = this.diskCachePolicy;
            if (enumC0350aG == null) {
                enumC0350aG = this.defaults.getDiskCachePolicy();
            }
            EnumC0350a enumC0350a2 = enumC0350aG;
            EnumC0350a enumC0350aM = this.networkCachePolicy;
            if (enumC0350aM == null) {
                enumC0350aM = this.defaults.getNetworkCachePolicy();
            }
            EnumC0350a enumC0350a3 = enumC0350aM;
            H hK = this.interceptorDispatcher;
            if (hK == null) {
                hK = this.defaults.getInterceptorDispatcher();
            }
            H h = hK;
            H hJ = this.fetcherDispatcher;
            if (hJ == null) {
                hJ = this.defaults.getFetcherDispatcher();
            }
            H h2 = hJ;
            H hF = this.decoderDispatcher;
            if (hF == null) {
                hF = this.defaults.getDecoderDispatcher();
            }
            H h3 = hF;
            H hP = this.transformationDispatcher;
            if (hP == null) {
                hP = this.defaults.getTransformationDispatcher();
            }
            H h4 = hP;
            androidx.lifecycle.h hVarL = this.lifecycle;
            if (hVarL == null && (hVarL = this.resolvedLifecycle) == null) {
                hVarL = l();
            }
            androidx.lifecycle.h hVar = hVarL;
            j jVarN = this.sizeResolver;
            if (jVarN == null && (jVarN = this.resolvedSizeResolver) == null) {
                jVarN = n();
            }
            j jVar = jVarN;
            K1.h hVarM = this.scale;
            if (hVarM == null && (hVarM = this.resolvedScale) == null) {
                hVarM = m();
            }
            K1.h hVar2 = hVarM;
            Parameters.a aVar4 = this.parameters;
            return new C0356g(context, obj2, aVar, bVar, key, str, config, colorSpace, eVar, pair, aVar2, list, aVar3, headersX, tagsW, z, zBooleanValue, zBooleanValue2, z2, enumC0350a, enumC0350a2, enumC0350a3, h, h2, h3, h4, hVar, jVar, hVar2, C0412j.v(aVar4 != null ? aVar4.a() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new C0352c(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        @NotNull
        public final a b(int durationMillis) {
            c.a c0040a;
            if (durationMillis > 0) {
                c0040a = new a.C0040a(durationMillis, false, 2, null);
            } else {
                c0040a = c.a.b;
            }
            t(c0040a);
            return this;
        }

        @NotNull
        public final a c(boolean enable) {
            return b(enable ? 100 : 0);
        }

        @NotNull
        public final a d(Object data) {
            this.data = data;
            return this;
        }

        @NotNull
        public final a e(@NotNull h.a factory) {
            this.decoderFactory = factory;
            return this;
        }

        @NotNull
        public final a f(@NotNull C0351b defaults) {
            this.defaults = defaults;
            j();
            return this;
        }

        @NotNull
        public final a g(MemoryCache.Key key) {
            this.memoryCacheKey = key;
            return this;
        }

        @NotNull
        public final a h(String key) {
            MemoryCache.Key key2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (key != null) {
                key2 = new MemoryCache.Key(key, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            }
            return g(key2);
        }

        @NotNull
        public final a i(Drawable drawable) {
            this.placeholderDrawable = drawable;
            this.placeholderResId = 0;
            return this;
        }

        @NotNull
        public final a o(int width, int height) {
            return p(K1.b.a(width, height));
        }

        @NotNull
        public final a p(@NotNull Size size) {
            return q(k.a(size));
        }

        @NotNull
        public final a q(@NotNull j resolver) {
            this.sizeResolver = resolver;
            k();
            return this;
        }

        @NotNull
        public final a r(L1.a target) {
            this.target = target;
            k();
            return this;
        }

        @NotNull
        public final a s(@NotNull ImageView imageView) {
            return r(new ImageViewTarget(imageView));
        }

        @NotNull
        public final a t(@NotNull c.a transition) {
            this.transitionFactory = transition;
            return this;
        }

        public a(@NotNull C0356g c0356g, @NotNull Context context) {
            this.context = context;
            this.defaults = c0356g.getDefaults();
            this.data = c0356g.getData();
            this.target = c0356g.getTarget();
            this.listener = c0356g.getListener();
            this.memoryCacheKey = c0356g.getMemoryCacheKey();
            this.diskCacheKey = c0356g.getDiskCacheKey();
            this.bitmapConfig = c0356g.getDefined().getBitmapConfig();
            this.colorSpace = c0356g.getColorSpace();
            this.precision = c0356g.getDefined().getPrecision();
            this.fetcherFactory = c0356g.w();
            this.decoderFactory = c0356g.getDecoderFactory();
            this.transformations = c0356g.O();
            this.transitionFactory = c0356g.getDefined().getTransitionFactory();
            this.headers = c0356g.getHeaders().newBuilder();
            this.tags = F.u(c0356g.getTags().a());
            this.allowConversionToBitmap = c0356g.getAllowConversionToBitmap();
            this.allowHardware = c0356g.getDefined().getAllowHardware();
            this.allowRgb565 = c0356g.getDefined().getAllowRgb565();
            this.premultipliedAlpha = c0356g.getPremultipliedAlpha();
            this.memoryCachePolicy = c0356g.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = c0356g.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = c0356g.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = c0356g.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = c0356g.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = c0356g.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = c0356g.getDefined().getTransformationDispatcher();
            this.parameters = c0356g.getParameters().j();
            this.placeholderMemoryCacheKey = c0356g.getPlaceholderMemoryCacheKey();
            this.placeholderResId = c0356g.placeholderResId;
            this.placeholderDrawable = c0356g.placeholderDrawable;
            this.errorResId = c0356g.errorResId;
            this.errorDrawable = c0356g.errorDrawable;
            this.fallbackResId = c0356g.fallbackResId;
            this.fallbackDrawable = c0356g.fallbackDrawable;
            this.lifecycle = c0356g.getDefined().getLifecycle();
            this.sizeResolver = c0356g.getDefined().getSizeResolver();
            this.scale = c0356g.getDefined().getScale();
            if (c0356g.getContext() == context) {
                this.resolvedLifecycle = c0356g.getLifecycle();
                this.resolvedSizeResolver = c0356g.getSizeResolver();
                this.resolvedScale = c0356g.getScale();
            } else {
                this.resolvedLifecycle = null;
                this.resolvedSizeResolver = null;
                this.resolvedScale = null;
            }
        }
    }
}
