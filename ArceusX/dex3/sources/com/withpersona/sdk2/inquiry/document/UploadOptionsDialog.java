package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001'BI\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u0017\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "selectDocumentButton", "selectPhotoButton", "takePhotoButton", "cancelButton", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "i", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "v", "c", "w", "y", "a", "z", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class UploadOptionsDialog implements NestedUiStep {

    private final List<UiComponent> components;

    private final StepStyles.UiStepStyle styles;

    private final String selectDocumentButton;

    private final String selectPhotoButton;

    private final String takePhotoButton;

    private final String cancelButton;

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<UploadOptionsDialog> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog$a;", "", "<init>", "()V", "", "titleText", "takePhotoButtonText", "selectDocumentButtonText", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UploadOptionsDialog a(String titleText, String takePhotoButtonText, String selectDocumentButtonText) {
            return new UploadOptionsDialog(com.withpersona.sdk2.inquiry.steps.ui.components.b.e(CollectionsKt.m(new UiComponentConfig[]{new Title(Title.type, new Title.Attributes(titleText == null ? "" : titleText, null, null, 6, null), null, 4, null), new CombinedStepButton("take_photo", new BasicButtonAttributes(takePhotoButtonText == null ? "" : takePhotoButtonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null), null, 4, null), new CombinedStepButton("select_file", new BasicButtonAttributes(selectDocumentButtonText == null ? "" : selectDocumentButtonText, Button.ButtonType.SECONDARY, null, null, null, null, 60, null), null, 4, null)})), null, "select_file", null, "take_photo", null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UploadOptionsDialog> {
        @Override
        @NotNull
        public final UploadOptionsDialog createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(UploadOptionsDialog.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new UploadOptionsDialog(arrayList, (StepStyles.UiStepStyle) parcel.readParcelable(UploadOptionsDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        @NotNull
        public final UploadOptionsDialog[] newArray(int i) {
            return new UploadOptionsDialog[i];
        }
    }

    public UploadOptionsDialog(List<? extends UiComponent> list, StepStyles.UiStepStyle uiStepStyle, String str, String str2, String str3, String str4) {
        this.components = list;
        this.styles = uiStepStyle;
        this.selectDocumentButton = str;
        this.selectPhotoButton = str2;
        this.takePhotoButton = str3;
        this.cancelButton = str4;
    }

    public final String getCancelButton() {
        return this.cancelButton;
    }

    public final String getSelectDocumentButton() {
        return this.selectDocumentButton;
    }

    public final String getSelectPhotoButton() {
        return this.selectPhotoButton;
    }

    public final String getTakePhotoButton() {
        return this.takePhotoButton;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public List<UiComponent> getComponents() {
        return this.components;
    }

    @Override
    public StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<UiComponent> list = this.components;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
        parcel.writeParcelable(this.styles, flags);
        parcel.writeString(this.selectDocumentButton);
        parcel.writeString(this.selectPhotoButton);
        parcel.writeString(this.takePhotoButton);
        parcel.writeString(this.cancelButton);
    }
}
