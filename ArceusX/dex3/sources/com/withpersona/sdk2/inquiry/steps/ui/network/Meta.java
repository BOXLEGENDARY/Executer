package com.withpersona.sdk2.inquiry.steps.ui.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "predictions", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Meta {

    @NotNull
    private final List<Suggestion> predictions;

    public Meta(@NotNull List<Suggestion> list) {
        Intrinsics.checkNotNullParameter(list, "predictions");
        this.predictions = list;
    }

    @NotNull
    public final List<Suggestion> a() {
        return this.predictions;
    }
}
