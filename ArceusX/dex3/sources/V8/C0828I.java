package v8;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.AbstractC0618e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll8/e;", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "a", "(Ll8/e;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0828I {
    @NotNull
    public static final RawExtraction a(@NotNull AbstractC0618e abstractC0618e) throws P9.m {
        Intrinsics.checkNotNullParameter(abstractC0618e, "<this>");
        if (abstractC0618e instanceof AbstractC0618e.MrzBarcodeInfo) {
            return new RawExtraction("mrz", abstractC0618e.getExtractionRawPayload());
        }
        if (abstractC0618e instanceof AbstractC0618e.Pdf417BarcodeInfo) {
            return new RawExtraction("pdf417", abstractC0618e.getExtractionRawPayload());
        }
        throw new P9.m();
    }
}
