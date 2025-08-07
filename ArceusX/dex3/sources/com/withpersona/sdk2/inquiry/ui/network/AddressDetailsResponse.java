package com.withpersona.sdk2.inquiry.ui.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "attributes", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AddressDetailsResponse {

    @NotNull
    private final LocationData attributes;

    public AddressDetailsResponse(@NotNull LocationData locationData) {
        Intrinsics.checkNotNullParameter(locationData, "attributes");
        this.attributes = locationData;
    }

    @NotNull
    public final LocationData getAttributes() {
        return this.attributes;
    }
}
