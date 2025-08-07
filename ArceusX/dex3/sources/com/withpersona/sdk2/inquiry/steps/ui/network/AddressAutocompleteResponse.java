package com.withpersona.sdk2.inquiry.steps.ui.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AddressAutocompleteResponse {

    @NotNull
    private final Meta meta;

    public AddressAutocompleteResponse(@NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.meta = meta;
    }

    @NotNull
    public final Meta getMeta() {
        return this.meta;
    }
}
