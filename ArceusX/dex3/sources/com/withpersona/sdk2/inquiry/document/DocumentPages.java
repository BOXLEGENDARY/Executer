package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "documentStartPage", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "uploadOptionsDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "a", "()Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "e", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "b", "()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DocumentPages implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentPages> CREATOR = new a();

    @NotNull
    private final DocumentStartPage documentStartPage;

    @NotNull
    private final UploadOptionsDialog uploadOptionsDialog;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentPages> {
        @Override
        @NotNull
        public final DocumentPages createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentPages(DocumentStartPage.CREATOR.createFromParcel(parcel), UploadOptionsDialog.CREATOR.createFromParcel(parcel));
        }

        @Override
        @NotNull
        public final DocumentPages[] newArray(int i) {
            return new DocumentPages[i];
        }
    }

    public DocumentPages(@NotNull DocumentStartPage documentStartPage, @NotNull UploadOptionsDialog uploadOptionsDialog) {
        Intrinsics.checkNotNullParameter(documentStartPage, "documentStartPage");
        Intrinsics.checkNotNullParameter(uploadOptionsDialog, "uploadOptionsDialog");
        this.documentStartPage = documentStartPage;
        this.uploadOptionsDialog = uploadOptionsDialog;
    }

    @NotNull
    public final DocumentStartPage getDocumentStartPage() {
        return this.documentStartPage;
    }

    @NotNull
    public final UploadOptionsDialog getUploadOptionsDialog() {
        return this.uploadOptionsDialog;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.documentStartPage.writeToParcel(parcel, flags);
        this.uploadOptionsDialog.writeToParcel(parcel, flags);
    }
}
