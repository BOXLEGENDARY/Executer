package P8;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import ha.C0376H;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LL8/H;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "b", "()LL8/H;", "nfc_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f {
    @NotNull
    public static final C0376H<PassportNfcReaderConfig, PassportNfcReaderOutput> b() {
        return new C0376H<>(new com.withpersona.sdk2.inquiry.nfc.a(), new e.a() {
            public final void a(Object obj) {
                f.c((PassportNfcReaderOutput) obj);
            }
        });
    }

    public static final void c(PassportNfcReaderOutput passportNfcReaderOutput) {
        Intrinsics.checkNotNullParameter(passportNfcReaderOutput, "result");
        new h().b(passportNfcReaderOutput);
    }
}
