package com.withpersona.sdk2.inquiry.internal.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0002\u0006\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "b", "Meta", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class TransitionBackRequest {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Meta meta;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "", "", "fromStep", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Meta {

        @NotNull
        private final String fromStep;

        public Meta(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "fromStep");
            this.fromStep = str;
        }

        @NotNull
        public final String getFromStep() {
            return this.fromStep;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;", "", "<init>", "()V", "", "fromStep", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "a", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransitionBackRequest a(@NotNull String fromStep) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            return new TransitionBackRequest(new Meta(fromStep));
        }

        private Companion() {
        }
    }

    public TransitionBackRequest(@NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.meta = meta;
    }

    @NotNull
    public final Meta getMeta() {
        return this.meta;
    }
}
