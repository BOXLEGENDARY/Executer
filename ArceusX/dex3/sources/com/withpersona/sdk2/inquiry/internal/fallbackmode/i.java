package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import P9.m;
import androidx.lifecycle.E;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB+\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0012\u0010\u0017R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "", "sessionToken", "Landroidx/lifecycle/E;", "savedStateHandle", "<init>", "(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/E;)V", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "g", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "a", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Ljava/util/List;", "b", "Landroidx/lifecycle/E;", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "inquiryId", "d", "authorization", "", "value", "()I", "h", "(I)V", "currentStepIndex", "currentStep", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i {

    @NotNull
    private final List<NextStep> steps;

    @NotNull
    private final E savedStateHandle;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final String authorization;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "a", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        i a(@NotNull List<? extends NextStep> steps, @NotNull String sessionToken);
    }

    public i(@NotNull List<? extends NextStep> list, @NotNull String str, @NotNull E e) {
        Intrinsics.checkNotNullParameter(list, "steps");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(e, "savedStateHandle");
        this.steps = list;
        this.savedStateHandle = e;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.inquiryId = string;
        this.authorization = "Bearer " + str;
    }

    @NotNull
    public final InquiryState a() throws m {
        NextStep nextStepC = c();
        if (nextStepC instanceof NextStep.Ui) {
            return J8.a.s((NextStep.Ui) nextStepC, this.authorization, this.inquiryId, "fake_status", null, InquirySessionConfig.INSTANCE.a());
        }
        if (nextStepC instanceof NextStep.GovernmentId) {
            return J8.a.q((NextStep.GovernmentId) nextStepC, this.authorization, this.inquiryId, null);
        }
        if (nextStepC instanceof NextStep.Selfie) {
            return J8.a.r((NextStep.Selfie) nextStepC, this.authorization, this.inquiryId);
        }
        if (nextStepC instanceof NextStep.Document) {
            return J8.a.p((NextStep.Document) nextStepC, this.authorization, this.inquiryId);
        }
        if (nextStepC instanceof NextStep.Complete) {
            return J8.a.o((NextStep.Complete) nextStepC, this.authorization, this.inquiryId, "fake_status", null);
        }
        if (!Intrinsics.b(nextStepC, NextStep.Unknown.INSTANCE)) {
            throw new m();
        }
        throw new IllegalArgumentException("Unknown type for step " + nextStepC.getName());
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    public final NextStep c() {
        return this.steps.get(d());
    }

    public final int d() {
        Integer num = (Integer) this.savedStateHandle.e("current_fallback_mode_step_index");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @NotNull
    public final String getInquiryId() {
        return this.inquiryId;
    }

    public final NextStep f() {
        if (d() == CollectionsKt.l(this.steps)) {
            return null;
        }
        h(d() + 1);
        return this.steps.get(d());
    }

    public final NextStep g() {
        if (d() == 0) {
            return null;
        }
        h(d() - 1);
        return this.steps.get(d());
    }

    public final void h(int i) {
        this.savedStateHandle.m("current_fallback_mode_step_index", Integer.valueOf(i));
    }
}
