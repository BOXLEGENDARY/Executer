package com.withpersona.sdk2.inquiry.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Landroid/os/Parcelable;", "()V", "Displaying", "PendingAction", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class UiState implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Landroid/os/Parcelable;", "CreateReusablePersona", "VerifyReusablePersona", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$VerifyReusablePersona;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface PendingAction extends Parcelable {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "createPersonaSheetComponent", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "a", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class CreateReusablePersona implements PendingAction {

            @NotNull
            public static final Parcelable.Creator<CreateReusablePersona> CREATOR = new a();

            @NotNull
            private final CreatePersonaSheetComponent createPersonaSheetComponent;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CreateReusablePersona> {
                @Override
                @NotNull
                public final CreateReusablePersona createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreateReusablePersona((CreatePersonaSheetComponent) parcel.readParcelable(CreateReusablePersona.class.getClassLoader()));
                }

                @Override
                @NotNull
                public final CreateReusablePersona[] newArray(int i) {
                    return new CreateReusablePersona[i];
                }
            }

            public CreateReusablePersona(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent) {
                Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "createPersonaSheetComponent");
                this.createPersonaSheetComponent = createPersonaSheetComponent;
            }

            @NotNull
            public final CreatePersonaSheetComponent getCreatePersonaSheetComponent() {
                return this.createPersonaSheetComponent;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreateReusablePersona) && Intrinsics.b(this.createPersonaSheetComponent, ((CreateReusablePersona) other).createPersonaSheetComponent);
            }

            public int hashCode() {
                return this.createPersonaSheetComponent.hashCode();
            }

            @NotNull
            public String toString() {
                return "CreateReusablePersona(createPersonaSheetComponent=" + this.createPersonaSheetComponent + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.createPersonaSheetComponent, flags);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$VerifyReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "verifyPersonaButtonComponent", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "a", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class VerifyReusablePersona implements PendingAction {

            @NotNull
            public static final Parcelable.Creator<VerifyReusablePersona> CREATOR = new a();

            @NotNull
            private final VerifyPersonaButtonComponent verifyPersonaButtonComponent;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerifyReusablePersona> {
                @Override
                @NotNull
                public final VerifyReusablePersona createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VerifyReusablePersona((VerifyPersonaButtonComponent) parcel.readParcelable(VerifyReusablePersona.class.getClassLoader()));
                }

                @Override
                @NotNull
                public final VerifyReusablePersona[] newArray(int i) {
                    return new VerifyReusablePersona[i];
                }
            }

            public VerifyReusablePersona(@NotNull VerifyPersonaButtonComponent verifyPersonaButtonComponent) {
                Intrinsics.checkNotNullParameter(verifyPersonaButtonComponent, "verifyPersonaButtonComponent");
                this.verifyPersonaButtonComponent = verifyPersonaButtonComponent;
            }

            @NotNull
            public final VerifyPersonaButtonComponent getVerifyPersonaButtonComponent() {
                return this.verifyPersonaButtonComponent;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VerifyReusablePersona) && Intrinsics.b(this.verifyPersonaButtonComponent, ((VerifyReusablePersona) other).verifyPersonaButtonComponent);
            }

            public int hashCode() {
                return this.verifyPersonaButtonComponent.hashCode();
            }

            @NotNull
            public String toString() {
                return "VerifyReusablePersona(verifyPersonaButtonComponent=" + this.verifyPersonaButtonComponent + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.verifyPersonaButtonComponent, flags);
            }
        }
    }

    public UiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiState() {
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001:\u0002WXB©\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ¸\u0001\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b.\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b5\u0010>R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bU\u00103\u001a\u0004\bV\u0010\u001f¨\u0006Y"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "", "stepName", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "autoSubmit", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "pendingAction", "", "hasRequestedGpsPermissions", "isRequestingGpsPermissions", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "triggeringComponent", "requestPermissionKey", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)V", "a", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "e", "Ljava/lang/String;", "n", "i", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "w", "g", "y", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "z", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "c", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "A", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "k", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "B", "Z", "h", "()Z", "C", "p", "D", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "E", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "o", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "F", "l", "AutoSubmit", "NfcScan", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Displaying extends UiState {

        @NotNull
        public static final Parcelable.Creator<Displaying> CREATOR = new a();

        private final PendingAction pendingAction;

        private final boolean hasRequestedGpsPermissions;

        private final boolean isRequestingGpsPermissions;

        private final Map<String, ComponentParam> componentParams;

        private final UiComponent triggeringComponent;

        @NotNull
        private final String requestPermissionKey;

        @NotNull
        private final List<UiComponent> components;

        @NotNull
        private final String stepName;

        @NotNull
        private final List<UiComponentError> componentErrors;

        private final StepStyles.UiStepStyle styles;

        private final String error;

        private final NfcScan nfcScan;

        private final AutoSubmit autoSubmit;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "component", "", "countdown", "", "countdownText", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "a", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "e", "I", "b", "i", "Ljava/lang/String;", "c", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class AutoSubmit implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AutoSubmit> CREATOR = new a();

            @NotNull
            private final ButtonComponent component;

            private final int countdown;

            private final String countdownText;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AutoSubmit> {
                @Override
                @NotNull
                public final AutoSubmit createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoSubmit((ButtonComponent) parcel.readParcelable(AutoSubmit.class.getClassLoader()), parcel.readInt(), parcel.readString());
                }

                @Override
                @NotNull
                public final AutoSubmit[] newArray(int i) {
                    return new AutoSubmit[i];
                }
            }

            public AutoSubmit(@NotNull ButtonComponent buttonComponent, int i, String str) {
                Intrinsics.checkNotNullParameter(buttonComponent, "component");
                this.component = buttonComponent;
                this.countdown = i;
                this.countdownText = str;
            }

            @NotNull
            public final ButtonComponent getComponent() {
                return this.component;
            }

            public final int getCountdown() {
                return this.countdown;
            }

            public final String getCountdownText() {
                return this.countdownText;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoSubmit)) {
                    return false;
                }
                AutoSubmit autoSubmit = (AutoSubmit) other;
                return Intrinsics.b(this.component, autoSubmit.component) && this.countdown == autoSubmit.countdown && Intrinsics.b(this.countdownText, autoSubmit.countdownText);
            }

            public int hashCode() {
                int iHashCode = ((this.component.hashCode() * 31) + Integer.hashCode(this.countdown)) * 31;
                String str = this.countdownText;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "AutoSubmit(component=" + this.component + ", countdown=" + this.countdown + ", countdownText=" + this.countdownText + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.component, flags);
                parcel.writeInt(this.countdown);
                parcel.writeString(this.countdownText);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "a", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class NfcScan implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<NfcScan> CREATOR = new a();

            @NotNull
            private final GovernmentIdNfcScanComponent component;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<NfcScan> {
                @Override
                @NotNull
                public final NfcScan createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NfcScan((GovernmentIdNfcScanComponent) parcel.readParcelable(NfcScan.class.getClassLoader()));
                }

                @Override
                @NotNull
                public final NfcScan[] newArray(int i) {
                    return new NfcScan[i];
                }
            }

            public NfcScan(@NotNull GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
                Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "component");
                this.component = governmentIdNfcScanComponent;
            }

            @NotNull
            public final GovernmentIdNfcScanComponent getComponent() {
                return this.component;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NfcScan) && Intrinsics.b(this.component, ((NfcScan) other).component);
            }

            public int hashCode() {
                return this.component.hashCode();
            }

            @NotNull
            public String toString() {
                return "NfcScan(component=" + this.component + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.component, flags);
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Displaying> {
            @Override
            @NotNull
            public final Displaying createFromParcel(@NotNull Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int i2 = 0;
                for (int i3 = 0; i3 != i; i3++) {
                    arrayList.add(parcel.readParcelable(Displaying.class.getClassLoader()));
                }
                String string = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(parcel.readParcelable(Displaying.class.getClassLoader()));
                }
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(Displaying.class.getClassLoader());
                String string2 = parcel.readString();
                NfcScan nfcScanCreateFromParcel = parcel.readInt() == 0 ? null : NfcScan.CREATOR.createFromParcel(parcel);
                AutoSubmit autoSubmitCreateFromParcel = parcel.readInt() == 0 ? null : AutoSubmit.CREATOR.createFromParcel(parcel);
                PendingAction pendingAction = (PendingAction) parcel.readParcelable(Displaying.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i6 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i6);
                    while (i2 != i6) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(Displaying.class.getClassLoader()));
                        i2++;
                        i6 = i6;
                    }
                }
                return new Displaying(arrayList, string, arrayList2, uiStepStyle, string2, nfcScanCreateFromParcel, autoSubmitCreateFromParcel, pendingAction, z, z2, linkedHashMap, (UiComponent) parcel.readParcelable(Displaying.class.getClassLoader()), parcel.readString());
            }

            @Override
            @NotNull
            public final Displaying[] newArray(int i) {
                return new Displaying[i];
            }
        }

        public Displaying(List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z, boolean z2, Map map, UiComponent uiComponent, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i & 4) != 0 ? CollectionsKt.j() : list2, uiStepStyle, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : nfcScan, (i & 64) != 0 ? null : autoSubmit, (i & 128) != 0 ? null : pendingAction, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : map, (i & 2048) != 0 ? null : uiComponent, (i & 4096) != 0 ? "0" : str3);
        }

        @NotNull
        public final Displaying a(@NotNull List<? extends UiComponent> components, @NotNull String stepName, @NotNull List<? extends UiComponentError> componentErrors, StepStyles.UiStepStyle styles, String error, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean hasRequestedGpsPermissions, boolean isRequestingGpsPermissions, Map<String, ? extends ComponentParam> componentParams, UiComponent triggeringComponent, @NotNull String requestPermissionKey) {
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
            Intrinsics.checkNotNullParameter(requestPermissionKey, "requestPermissionKey");
            return new Displaying(components, stepName, componentErrors, styles, error, nfcScan, autoSubmit, pendingAction, hasRequestedGpsPermissions, isRequestingGpsPermissions, componentParams, triggeringComponent, requestPermissionKey);
        }

        public final AutoSubmit getAutoSubmit() {
            return this.autoSubmit;
        }

        @NotNull
        public final List<UiComponentError> d() {
            return this.componentErrors;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return Intrinsics.b(this.components, displaying.components) && Intrinsics.b(this.stepName, displaying.stepName) && Intrinsics.b(this.componentErrors, displaying.componentErrors) && Intrinsics.b(this.styles, displaying.styles) && Intrinsics.b(this.error, displaying.error) && Intrinsics.b(this.nfcScan, displaying.nfcScan) && Intrinsics.b(this.autoSubmit, displaying.autoSubmit) && Intrinsics.b(this.pendingAction, displaying.pendingAction) && this.hasRequestedGpsPermissions == displaying.hasRequestedGpsPermissions && this.isRequestingGpsPermissions == displaying.isRequestingGpsPermissions && Intrinsics.b(this.componentParams, displaying.componentParams) && Intrinsics.b(this.triggeringComponent, displaying.triggeringComponent) && Intrinsics.b(this.requestPermissionKey, displaying.requestPermissionKey);
        }

        public final Map<String, ComponentParam> f() {
            return this.componentParams;
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public final List<UiComponent> getComponents() {
            return this.components;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public final boolean getHasRequestedGpsPermissions() {
            return this.hasRequestedGpsPermissions;
        }

        public int hashCode() {
            int iHashCode = ((((this.components.hashCode() * 31) + this.stepName.hashCode()) * 31) + this.componentErrors.hashCode()) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode2 = (iHashCode + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            String str = this.error;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            NfcScan nfcScan = this.nfcScan;
            int iHashCode4 = (iHashCode3 + (nfcScan == null ? 0 : nfcScan.hashCode())) * 31;
            AutoSubmit autoSubmit = this.autoSubmit;
            int iHashCode5 = (iHashCode4 + (autoSubmit == null ? 0 : autoSubmit.hashCode())) * 31;
            PendingAction pendingAction = this.pendingAction;
            int iHashCode6 = (((((iHashCode5 + (pendingAction == null ? 0 : pendingAction.hashCode())) * 31) + Boolean.hashCode(this.hasRequestedGpsPermissions)) * 31) + Boolean.hashCode(this.isRequestingGpsPermissions)) * 31;
            Map<String, ComponentParam> map = this.componentParams;
            int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            UiComponent uiComponent = this.triggeringComponent;
            return ((iHashCode7 + (uiComponent != null ? uiComponent.hashCode() : 0)) * 31) + this.requestPermissionKey.hashCode();
        }

        public final NfcScan getNfcScan() {
            return this.nfcScan;
        }

        public final PendingAction getPendingAction() {
            return this.pendingAction;
        }

        @NotNull
        public final String getRequestPermissionKey() {
            return this.requestPermissionKey;
        }

        @NotNull
        public final String getStepName() {
            return this.stepName;
        }

        public final UiComponent getTriggeringComponent() {
            return this.triggeringComponent;
        }

        public final boolean getIsRequestingGpsPermissions() {
            return this.isRequestingGpsPermissions;
        }

        @NotNull
        public String toString() {
            return "Displaying(components=" + this.components + ", stepName=" + this.stepName + ", componentErrors=" + this.componentErrors + ", styles=" + this.styles + ", error=" + this.error + ", nfcScan=" + this.nfcScan + ", autoSubmit=" + this.autoSubmit + ", pendingAction=" + this.pendingAction + ", hasRequestedGpsPermissions=" + this.hasRequestedGpsPermissions + ", isRequestingGpsPermissions=" + this.isRequestingGpsPermissions + ", componentParams=" + this.componentParams + ", triggeringComponent=" + this.triggeringComponent + ", requestPermissionKey=" + this.requestPermissionKey + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<UiComponent> list = this.components;
            parcel.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeString(this.stepName);
            List<UiComponentError> list2 = this.componentErrors;
            parcel.writeInt(list2.size());
            Iterator<UiComponentError> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeParcelable(this.styles, flags);
            parcel.writeString(this.error);
            NfcScan nfcScan = this.nfcScan;
            if (nfcScan == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                nfcScan.writeToParcel(parcel, flags);
            }
            AutoSubmit autoSubmit = this.autoSubmit;
            if (autoSubmit == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autoSubmit.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.pendingAction, flags);
            parcel.writeInt(this.hasRequestedGpsPermissions ? 1 : 0);
            parcel.writeInt(this.isRequestingGpsPermissions ? 1 : 0);
            Map<String, ComponentParam> map = this.componentParams;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeParcelable(entry.getValue(), flags);
                }
            }
            parcel.writeParcelable(this.triggeringComponent, flags);
            parcel.writeString(this.requestPermissionKey);
        }

        public Displaying(@NotNull List<? extends UiComponent> list, @NotNull String str, @NotNull List<? extends UiComponentError> list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z, boolean z2, Map<String, ? extends ComponentParam> map, UiComponent uiComponent, @NotNull String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "components");
            Intrinsics.checkNotNullParameter(str, "stepName");
            Intrinsics.checkNotNullParameter(list2, "componentErrors");
            Intrinsics.checkNotNullParameter(str3, "requestPermissionKey");
            this.components = list;
            this.stepName = str;
            this.componentErrors = list2;
            this.styles = uiStepStyle;
            this.error = str2;
            this.nfcScan = nfcScan;
            this.autoSubmit = autoSubmit;
            this.pendingAction = pendingAction;
            this.hasRequestedGpsPermissions = z;
            this.isRequestingGpsPermissions = z2;
            this.componentParams = map;
            this.triggeringComponent = uiComponent;
            this.requestPermissionKey = str3;
        }
    }
}
