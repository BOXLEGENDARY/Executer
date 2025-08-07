package com.withpersona.sdk2.inquiry.document.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000f\b\u0010\u0011B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "data", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "b", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "c", "Attributes", "Data", "Meta", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CreateDocumentRequest {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Data data;

    @NotNull
    private final Meta meta;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "", "", "kind", "", "fileLimit", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "()I", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Attributes {

        @NotNull
        private final String kind;

        private final int fileLimit;

        public Attributes(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "kind");
            this.kind = str;
            this.fileLimit = i;
        }

        public final int getFileLimit() {
            return this.fileLimit;
        }

        @NotNull
        public final String getKind() {
            return this.kind;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "", "", "type", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Data {

        @NotNull
        private final String type;

        @NotNull
        private final Attributes attributes;

        public Data(@NotNull String str, @NotNull Attributes attributes) {
            Intrinsics.checkNotNullParameter(str, "type");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.type = str;
            this.attributes = attributes;
        }

        @NotNull
        public final Attributes getAttributes() {
            return this.attributes;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "", "", "fieldKeyDocument", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Meta {

        @NotNull
        private final String fieldKeyDocument;

        public Meta(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "fieldKeyDocument");
            this.fieldKeyDocument = str;
        }

        @NotNull
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$a;", "", "<init>", "()V", "", "type", "kind", "", "fileLimit", "fieldKeyDocument", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CreateDocumentRequest a(@NotNull String type, @NotNull String kind, int fileLimit, @NotNull String fieldKeyDocument) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            return new CreateDocumentRequest(new Data(type, new Attributes(kind, fileLimit)), new Meta(fieldKeyDocument));
        }

        private Companion() {
        }
    }

    public CreateDocumentRequest(@NotNull Data data, @NotNull Meta meta) {
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
}
