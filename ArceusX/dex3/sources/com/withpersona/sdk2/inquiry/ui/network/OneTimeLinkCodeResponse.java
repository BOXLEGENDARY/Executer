package com.withpersona.sdk2.inquiry.ui.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", "()Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class OneTimeLinkCodeResponse {

    private final Metadata meta;

    public OneTimeLinkCodeResponse(Metadata metadata) {
        this.meta = metadata;
    }

    public final Metadata getMeta() {
        return this.meta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OneTimeLinkCodeResponse) && Intrinsics.b(this.meta, ((OneTimeLinkCodeResponse) other).meta);
    }

    public int hashCode() {
        Metadata metadata = this.meta;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "OneTimeLinkCodeResponse(meta=" + this.meta + ")";
    }
}
