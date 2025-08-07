package P8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LP8/c;", "", "<init>", "()V", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c {

    @NotNull
    public static final c a = new c();

    private c() {
    }

    public final Class<?> a() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.nfc.impl.NfcReaderActivity");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
