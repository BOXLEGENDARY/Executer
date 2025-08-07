package com.withpersona.sdk2.inquiry.document.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "data", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "included", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;Ljava/util/List;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Data", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CreateDocumentResponse {

    @NotNull
    private final Data data;

    private final List<DocumentFileData> included;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Data {

        @NotNull
        private final String id;

        public Data(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "id");
            this.id = str;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    public CreateDocumentResponse(@NotNull Data data, List<DocumentFileData> list) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.included = list;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    public final List<DocumentFileData> b() {
        return this.included;
    }
}
