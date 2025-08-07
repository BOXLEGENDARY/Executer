package C0;

import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LC0/d;", "LC0/e;", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "i", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends e {

    private final String type;

    public d(String str, CharSequence charSequence) {
        super(str, charSequence);
        Intrinsics.checkNotNullParameter(str, GObvYfBKohxpYX.xgUBNNPOHYG);
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    public String getType() {
        return this.type;
    }
}
