package ha;

import P9.m;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "LF8/u;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)LF8/u;", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
            try {
                iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final u a(@NotNull CheckInquiryResponse.PollingMode pollingMode) throws m {
        Intrinsics.checkNotNullParameter(pollingMode, "<this>");
        int i = a.a[pollingMode.ordinal()];
        if (i == 1) {
            return u.e;
        }
        if (i == 2) {
            return u.d;
        }
        if (i == 3) {
            return u.e;
        }
        throw new m();
    }
}
