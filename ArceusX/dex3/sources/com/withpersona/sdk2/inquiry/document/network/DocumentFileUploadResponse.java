package com.withpersona.sdk2.inquiry.document.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DocumentFileUploadResponse {

    @NotNull
    private final DocumentFileData data;

    public DocumentFileUploadResponse(@NotNull DocumentFileData documentFileData) {
        Intrinsics.checkNotNullParameter(documentFileData, "data");
        this.data = documentFileData;
    }

    @NotNull
    public final DocumentFileData getData() {
        return this.data;
    }
}
