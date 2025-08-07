package F0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LF0/c;", BuildConfig.FLAVOR, "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LF0/c$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "jsonString", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)Z", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            if (jsonString.length() == 0) {
                return false;
            }
            try {
                new JSONObject(jsonString);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        private Companion() {
        }
    }
}
