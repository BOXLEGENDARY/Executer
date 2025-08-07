package com.withpersona.sdk2.inquiry.document.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "", "stepName", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DocumentStepData implements StepData {

    @NotNull
    public static final Parcelable.Creator<DocumentStepData> CREATOR = new a();

    @NotNull
    private final String stepName;

    @NotNull
    private final List<DocumentFile> documents;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentStepData> {
        @Override
        @NotNull
        public final DocumentStepData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(DocumentStepData.class.getClassLoader()));
            }
            return new DocumentStepData(string, arrayList);
        }

        @Override
        @NotNull
        public final DocumentStepData[] newArray(int i) {
            return new DocumentStepData[i];
        }
    }

    public DocumentStepData(@NotNull String str, @NotNull List<? extends DocumentFile> list) {
        Intrinsics.checkNotNullParameter(str, "stepName");
        Intrinsics.checkNotNullParameter(list, "documents");
        this.stepName = str;
        this.documents = list;
    }

    @NotNull
    public final List<DocumentFile> a() {
        return this.documents;
    }

    @NotNull
    public String getStepName() {
        return this.stepName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentStepData)) {
            return false;
        }
        DocumentStepData documentStepData = (DocumentStepData) other;
        return Intrinsics.b(this.stepName, documentStepData.stepName) && Intrinsics.b(this.documents, documentStepData.documents);
    }

    public int hashCode() {
        return (this.stepName.hashCode() * 31) + this.documents.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentStepData(stepName=" + this.stepName + ", documents=" + this.documents + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.stepName);
        List<DocumentFile> list = this.documents;
        parcel.writeInt(list.size());
        Iterator<DocumentFile> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }
}
