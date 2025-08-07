package com.withpersona.sdk2.inquiry.selfie;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "Lcom/withpersona/sdk2/inquiry/selfie/n;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;)Lcom/withpersona/sdk2/inquiry/selfie/n;", "selfie_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final n a(@NotNull NextStep.Selfie.CaptureMethod captureMethod) throws P9.m {
        Intrinsics.checkNotNullParameter(captureMethod, "<this>");
        int i = a.a[captureMethod.ordinal()];
        if (i == 1) {
            return n.a.a;
        }
        if (i == 2) {
            return n.c.a;
        }
        if (i == 3) {
            return n.b.a;
        }
        throw new P9.m();
    }
}
