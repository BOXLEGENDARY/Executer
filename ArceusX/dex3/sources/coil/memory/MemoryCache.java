package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C0412j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u000f\u0005J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcoil/memory/MemoryCache;", "", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$b;", "value", "", "c", "(Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$b;)V", "clear", "()V", "", "level", "b", "(I)V", "Key", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MemoryCache {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcoil/memory/MemoryCache$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcoil/memory/MemoryCache;", "a", "()Lcoil/memory/MemoryCache;", "Landroid/content/Context;", "", "b", "D", "maxSizePercent", "", "c", "I", "maxSizeBytes", "", "d", "Z", "strongReferencesEnabled", "e", "weakReferencesEnabled", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final Context context;

        private double maxSizePercent;

        private int maxSizeBytes;

        private boolean strongReferencesEnabled = true;

        private boolean weakReferencesEnabled = true;

        public a(@NotNull Context context) {
            this.context = context;
            this.maxSizePercent = C0412j.e(context);
        }

        @NotNull
        public final MemoryCache a() {
            g aVar;
            h fVar = this.weakReferencesEnabled ? new f() : new b();
            if (this.strongReferencesEnabled) {
                double d = this.maxSizePercent;
                int iC = d > 0.0d ? C0412j.c(this.context, d) : this.maxSizeBytes;
                aVar = iC > 0 ? new e(iC, fVar) : new coil.memory.a(fVar);
            } else {
                aVar = new coil.memory.a(fVar);
            }
            return new d(aVar, fVar);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcoil/memory/MemoryCache$b;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Value {

        @NotNull
        private final Bitmap bitmap;

        @NotNull
        private final Map<String, Object> extras;

        public Value(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            this.bitmap = bitmap;
            this.extras = map;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.extras;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Value) {
                Value value = (Value) other;
                if (Intrinsics.b(this.bitmap, value.bitmap) && Intrinsics.b(this.extras, value.extras)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.bitmap.hashCode() * 31) + this.extras.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(bitmap=" + this.bitmap + ", extras=" + this.extras + ')';
        }
    }

    Value a(@NotNull Key key);

    void b(int level);

    void c(@NotNull Key key, @NotNull Value value);

    void clear();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/util/Map;)Lcoil/memory/MemoryCache$Key;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "getKey", "e", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "i", "b", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements Parcelable {

        @NotNull
        private final String key;

        @NotNull
        private final Map<String, String> extras;

        @NotNull
        private static final b i = new b(null);

        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new a();

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"coil/memory/MemoryCache$Key$a", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcoil/memory/MemoryCache$Key;", "", "size", "", "b", "(I)[Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Key> {
            a() {
            }

            @Override
            public Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Intrinsics.d(string);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    String string2 = parcel.readString();
                    Intrinsics.d(string2);
                    String string3 = parcel.readString();
                    Intrinsics.d(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override
            public Key[] newArray(int size) {
                return new Key[size];
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/memory/MemoryCache$Key$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "CREATOR", "Landroid/os/Parcelable$Creator;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class b {
            public b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public Key(@NotNull String str, @NotNull Map<String, String> map) {
            this.key = str;
            this.extras = map;
        }

        public static Key b(Key key, String str, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = key.key;
            }
            if ((i2 & 2) != 0) {
                map = key.extras;
            }
            return key.a(str, map);
        }

        @NotNull
        public final Key a(@NotNull String key, @NotNull Map<String, String> extras) {
            return new Key(key, extras);
        }

        @NotNull
        public final Map<String, String> c() {
            return this.extras;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Key) {
                Key key = (Key) other;
                if (Intrinsics.b(this.key, key.key) && Intrinsics.b(this.extras, key.extras)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        @NotNull
        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.writeString(this.key);
            parcel.writeInt(this.extras.size());
            for (Map.Entry<String, String> entry : this.extras.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public Key(String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? F.h() : map);
        }
    }
}
