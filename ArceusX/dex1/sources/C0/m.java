package C0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\f\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LC0/m;", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "d", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "e", "Ljava/lang/CharSequence;", "getErrorMessage", "()Ljava/lang/CharSequence;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class m extends Exception {

    private final String type;

    private final CharSequence errorMessage;

    public m(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        Intrinsics.checkNotNullParameter(str, "type");
        this.type = str;
        this.errorMessage = charSequence;
    }
}
