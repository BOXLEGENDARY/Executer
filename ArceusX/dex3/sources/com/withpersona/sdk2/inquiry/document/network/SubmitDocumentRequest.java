package com.withpersona.sdk2.inquiry.document.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0003\b\u000f\u0010B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "data", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "b", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "c", "Data", "Meta", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class SubmitDocumentRequest {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Data data;

    @NotNull
    private final Meta meta;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "", "", "type", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Data {

        @NotNull
        private final String type;

        public Data() {
            String str = null;
            this(str, 1, str);
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public Data(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "type");
            this.type = str;
        }

        public Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "inquiry" : str);
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "", "", "fromStep", "fromComponent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Meta {

        @NotNull
        private final String fromStep;

        @NotNull
        private final String fromComponent;

        public Meta(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "fromStep");
            Intrinsics.checkNotNullParameter(str2, "fromComponent");
            this.fromStep = str;
            this.fromComponent = str2;
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        public final String getFromStep() {
            return this.fromStep;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$a;", "", "<init>", "()V", "", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SubmitDocumentRequest a(@NotNull String fromStep, @NotNull String fromComponent) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Data data = null;
            return new SubmitDocumentRequest(data, new Meta(fromStep, fromComponent), 1, data);
        }

        private Companion() {
        }
    }

    public SubmitDocumentRequest(@NotNull Data data, @NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final Meta getMeta() {
        return this.meta;
    }

    public SubmitDocumentRequest(Data data, Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            String str = null;
            data = new Data(str, i2, str);
        }
        this(data, meta);
    }
}
