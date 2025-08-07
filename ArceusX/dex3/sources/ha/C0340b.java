package ha;

import P9.m;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0340b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] iArr = new int[CreateInquirySessionResponse.GpsCollectionRequirement.values().length];
            try {
                iArr[CreateInquirySessionResponse.GpsCollectionRequirement.REQUIRE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateInquirySessionResponse.GpsCollectionRequirement.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateInquirySessionResponse.GpsCollectionRequirement.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[CreateInquirySessionResponse.GpsPrecisionRequirement.values().length];
            try {
                iArr2[CreateInquirySessionResponse.GpsPrecisionRequirement.PRECISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CreateInquirySessionResponse.GpsPrecisionRequirement.ROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final GpsCollectionRequirement a(@NotNull CreateInquirySessionResponse.GpsCollectionRequirement gpsCollectionRequirement) throws m {
        Intrinsics.checkNotNullParameter(gpsCollectionRequirement, "<this>");
        int i = a.a[gpsCollectionRequirement.ordinal()];
        if (i == 1) {
            return GpsCollectionRequirement.d;
        }
        if (i == 2) {
            return GpsCollectionRequirement.e;
        }
        if (i == 3) {
            return GpsCollectionRequirement.i;
        }
        throw new m();
    }

    @NotNull
    public static final GpsPrecisionRequirement b(@NotNull CreateInquirySessionResponse.GpsPrecisionRequirement gpsPrecisionRequirement) throws m {
        Intrinsics.checkNotNullParameter(gpsPrecisionRequirement, "<this>");
        int i = a.b[gpsPrecisionRequirement.ordinal()];
        if (i == 1) {
            return GpsPrecisionRequirement.e;
        }
        if (i == 2) {
            return GpsPrecisionRequirement.d;
        }
        throw new m();
    }
}
