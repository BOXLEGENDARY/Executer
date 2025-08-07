package com.withpersona.sdk2.inquiry.document.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "", "", "id", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "Attributes", "RemoteDocumentFile", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DocumentFileData {

    @NotNull
    private final String id;

    private final Attributes attributes;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "originals", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Attributes {

        private final List<RemoteDocumentFile> originals;

        public Attributes(List<RemoteDocumentFile> list) {
            this.originals = list;
        }

        public final List<RemoteDocumentFile> a() {
            return this.originals;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "", "", "url", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class RemoteDocumentFile {

        @NotNull
        private final String url;

        @NotNull
        private final String filename;

        public RemoteDocumentFile(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "url");
            Intrinsics.checkNotNullParameter(str2, "filename");
            this.url = str;
            this.filename = str2;
        }

        @NotNull
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    public DocumentFileData(@NotNull String str, Attributes attributes) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.id = str;
        this.attributes = attributes;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
