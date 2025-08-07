package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import ha.EnumC0329d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v8.EnumC0834b;
import v8.InterfaceC0833a;
import v8.InterfaceC0835c;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f#$%&'()*+,-.B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0010\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158 X \u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158 X \u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001c8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\n/012345678¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Landroid/os/Parcelable;", "<init>", "()V", "", "error", "c", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "", "d", "", "Z", "h", "()Z", "n", "(Z)V", "didGoBack", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "g", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "l", "()Ljava/util/List;", "uploadingIds", "k", "parts", "", "i", "()I", "partIndex", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "AutoClassificationError", "AutoClassificationManualSelect", "ChooseCaptureMethod", "CountdownToCapture", "FinalizeLocalVideoCapture", "FinalizeWebRtc", "ReviewCapturedImage", "ReviewImageState", "ReviewSelectedImage", "ShowInstructions", "Submit", "WaitForAutocapture", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class GovernmentIdState implements Parcelable {

    private boolean didGoBack;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0092\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b-\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\b1\u0010\u001a¨\u0006E"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "", "selectedCountryCode", "selectedIdClass", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "r", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "k", "w", "I", "y", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "z", "getCaptureFrames", "A", "Lcom/withpersona/sdk2/camera/CameraProperties;", "q", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "B", "s", "C", "Ljava/lang/String;", "t", "D", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class AutoClassificationManualSelect extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<AutoClassificationManualSelect> CREATOR = new a();

        @NotNull
        private final CameraProperties cameraProperties;

        @NotNull
        private final List<IdConfigForCountry> idConfigsForCountry;

        private final String selectedCountryCode;

        private final String selectedIdClass;

        @NotNull
        private final IdPart.SideIdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        private final GovernmentIdState backState;

        @NotNull
        private final List<Frame> captureFrames;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClassificationManualSelect> {
            @Override
            @NotNull
            public final AutoClassificationManualSelect createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i5 = parcel.readInt();
                GovernmentIdState governmentIdState = (GovernmentIdState) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationManualSelect(sideIdPartCreateFromParcel, arrayList, arrayList2, i5, governmentIdState, arrayList3, cameraProperties, arrayList4, parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final AutoClassificationManualSelect[] newArray(int i) {
                return new AutoClassificationManualSelect[i];
            }
        }

        public AutoClassificationManualSelect(@NotNull IdPart.SideIdPart sideIdPart, @NotNull List<? extends GovernmentId> list, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, @NotNull List<Frame> list3, @NotNull CameraProperties cameraProperties, @NotNull List<IdConfigForCountry> list4, String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(sideIdPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(list3, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(list4, "idConfigsForCountry");
            this.currentPart = sideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.captureFrames = list3;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = list4;
            this.selectedCountryCode = str;
            this.selectedIdClass = str2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClassificationManualSelect)) {
                return false;
            }
            AutoClassificationManualSelect autoClassificationManualSelect = (AutoClassificationManualSelect) other;
            return Intrinsics.b(this.currentPart, autoClassificationManualSelect.currentPart) && Intrinsics.b(this.uploadingIds, autoClassificationManualSelect.uploadingIds) && Intrinsics.b(this.parts, autoClassificationManualSelect.parts) && this.partIndex == autoClassificationManualSelect.partIndex && Intrinsics.b(this.backState, autoClassificationManualSelect.backState) && Intrinsics.b(this.captureFrames, autoClassificationManualSelect.captureFrames) && Intrinsics.b(this.cameraProperties, autoClassificationManualSelect.cameraProperties) && Intrinsics.b(this.idConfigsForCountry, autoClassificationManualSelect.idConfigsForCountry) && Intrinsics.b(this.selectedCountryCode, autoClassificationManualSelect.selectedCountryCode) && Intrinsics.b(this.selectedIdClass, autoClassificationManualSelect.selectedIdClass);
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((((((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str = this.selectedCountryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.selectedIdClass;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final AutoClassificationManualSelect o(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int partIndex, GovernmentIdState backState, @NotNull List<Frame> captureFrames, @NotNull CameraProperties cameraProperties, @NotNull List<IdConfigForCountry> idConfigsForCountry, String selectedCountryCode, String selectedIdClass) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            return new AutoClassificationManualSelect(currentPart, uploadingIds, parts, partIndex, backState, captureFrames, cameraProperties, idConfigsForCountry, selectedCountryCode, selectedIdClass);
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        @NotNull
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @NotNull
        public final List<IdConfigForCountry> s() {
            return this.idConfigsForCountry;
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        @NotNull
        public String toString() {
            return "AutoClassificationManualSelect(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ")";
        }

        public final String getSelectedIdClass() {
            return this.selectedIdClass;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.currentPart.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            List<Frame> list3 = this.captureFrames;
            parcel.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            parcel.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, flags);
            }
            parcel.writeString(this.selectedCountryCode);
            parcel.writeString(this.selectedIdClass);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jp\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b-\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "idForReview", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)V", "", "d", "()V", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "r", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "q", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "t", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "y", "k", "z", "I", "A", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "B", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "s", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CountdownToCapture extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        private final GovernmentIdState backState;

        private final Hint hint;

        @NotNull
        private final IdPart.SideIdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final CaptureConfig captureConfig;

        @NotNull
        private final GovernmentId.GovernmentIdImage idForReview;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override
            @NotNull
            public final CountdownToCapture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                GovernmentId.GovernmentIdImage governmentIdImageCreateFromParcel = GovernmentId.GovernmentIdImage.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                return new CountdownToCapture(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentIdImageCreateFromParcel, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), (Hint) parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final CountdownToCapture[] newArray(int i) {
                return new CountdownToCapture[i];
            }
        }

        public CountdownToCapture(@NotNull IdPart.SideIdPart sideIdPart, @NotNull List<? extends GovernmentId> list, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId.GovernmentIdImage governmentIdImage, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, Hint hint) {
            super(null);
            Intrinsics.checkNotNullParameter(sideIdPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(governmentIdImage, "idForReview");
            Intrinsics.checkNotNullParameter(list2, "parts");
            this.currentPart = sideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.idForReview = governmentIdImage;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.hint = hint;
        }

        @Override
        public void d() {
            super.d();
            Iterator<T> it = this.idForReview.b1().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return Intrinsics.b(this.currentPart, countdownToCapture.currentPart) && Intrinsics.b(this.uploadingIds, countdownToCapture.uploadingIds) && Intrinsics.b(this.captureConfig, countdownToCapture.captureConfig) && Intrinsics.b(this.idForReview, countdownToCapture.idForReview) && Intrinsics.b(this.parts, countdownToCapture.parts) && this.partIndex == countdownToCapture.partIndex && Intrinsics.b(this.backState, countdownToCapture.backState) && Intrinsics.b(this.hint, countdownToCapture.hint);
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            Hint hint = this.hint;
            return iHashCode2 + (hint != null ? hint.hashCode() : 0);
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final CountdownToCapture o(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId.GovernmentIdImage idForReview, @NotNull List<? extends IdPart> parts, int partIndex, GovernmentIdState backState, Hint hint) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new CountdownToCapture(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, hint);
        }

        @NotNull
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override
        @NotNull
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        public final Hint getHint() {
            return this.hint;
        }

        @NotNull
        public final GovernmentId.GovernmentIdImage getIdForReview() {
            return this.idForReview;
        }

        @NotNull
        public String toString() {
            return "CountdownToCapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", hint=" + this.hint + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.currentPart.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeParcelable(this.captureConfig, flags);
            this.idForReview.writeToParcel(parcel, flags);
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            parcel.writeParcelable(this.hint, flags);
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jz\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "parts", "", "partIndex", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "", "minDurationMs", "", "isDelayComplete", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;JZ)V", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "q", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "g", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "w", "k", "y", "I", "z", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "A", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "getGovernmentIdRequestArguments", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "B", "J", "r", "()J", "C", "Z", "s", "()Z", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class FinalizeLocalVideoCapture extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        private final GovernmentIdRequestArguments governmentIdRequestArguments;

        private final long minDurationMs;

        private final boolean isDelayComplete;

        @NotNull
        private final IdConfig id;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final IdPart currentPart;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        private final GovernmentIdState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            @Override
            @NotNull
            public final FinalizeLocalVideoCapture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                IdPart idPart = (IdPart) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                return new FinalizeLocalVideoCapture(idConfigCreateFromParcel, arrayList, idPart, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final FinalizeLocalVideoCapture[] newArray(int i) {
                return new FinalizeLocalVideoCapture[i];
            }
        }

        public FinalizeLocalVideoCapture(IdConfig idConfig, List list, IdPart idPart, List list2, int i, GovernmentIdState governmentIdState, GovernmentIdRequestArguments governmentIdRequestArguments, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, idPart, list2, i, (i2 & 32) != 0 ? null : governmentIdState, (i2 & 64) != 0 ? null : governmentIdRequestArguments, (i2 & 128) != 0 ? 3000L : j, (i2 & 256) != 0 ? false : z);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return Intrinsics.b(this.id, finalizeLocalVideoCapture.id) && Intrinsics.b(this.uploadingIds, finalizeLocalVideoCapture.uploadingIds) && Intrinsics.b(this.currentPart, finalizeLocalVideoCapture.currentPart) && Intrinsics.b(this.parts, finalizeLocalVideoCapture.parts) && this.partIndex == finalizeLocalVideoCapture.partIndex && Intrinsics.b(this.backState, finalizeLocalVideoCapture.backState) && Intrinsics.b(this.governmentIdRequestArguments, finalizeLocalVideoCapture.governmentIdRequestArguments) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete;
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            return ((((iHashCode2 + (governmentIdRequestArguments != null ? governmentIdRequestArguments.hashCode() : 0)) * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete);
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final FinalizeLocalVideoCapture o(@NotNull IdConfig id, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull IdPart currentPart, @NotNull List<? extends IdPart> parts, int partIndex, GovernmentIdState backState, GovernmentIdRequestArguments governmentIdRequestArguments, long minDurationMs, boolean isDelayComplete) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new FinalizeLocalVideoCapture(id, uploadingIds, currentPart, parts, partIndex, backState, governmentIdRequestArguments, minDurationMs, isDelayComplete);
        }

        @NotNull
        public final IdConfig getId() {
            return this.id;
        }

        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        @NotNull
        public String toString() {
            return "FinalizeLocalVideoCapture(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.id.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeParcelable(this.currentPart, flags);
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdRequestArguments.writeToParcel(parcel, flags);
            }
            parcel.writeLong(this.minDurationMs);
            parcel.writeInt(this.isDelayComplete ? 1 : 0);
        }

        public FinalizeLocalVideoCapture(@NotNull IdConfig idConfig, @NotNull List<? extends GovernmentId> list, @NotNull IdPart idPart, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, GovernmentIdRequestArguments governmentIdRequestArguments, long j, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(idConfig, "id");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(idPart, "currentPart");
            Intrinsics.checkNotNullParameter(list2, "parts");
            this.id = idConfig;
            this.uploadingIds = list;
            this.currentPart = idPart;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.minDurationMs = j;
            this.isDelayComplete = z;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "parts", "", "partIndex", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "g", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "k", "w", "I", "y", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "p", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "A", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class FinalizeWebRtc extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new a();

        @NotNull
        private final CameraProperties cameraProperties;

        @NotNull
        private final IdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        private final GovernmentIdState backState;

        @NotNull
        private final IdConfig id;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeWebRtc> {
            @Override
            @NotNull
            public final FinalizeWebRtc createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart idPart = (IdPart) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                return new FinalizeWebRtc(idPart, arrayList, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), IdConfig.CREATOR.createFromParcel(parcel), (CameraProperties) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final FinalizeWebRtc[] newArray(int i) {
                return new FinalizeWebRtc[i];
            }
        }

        public FinalizeWebRtc(@NotNull IdPart idPart, @NotNull List<? extends GovernmentId> list, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, @NotNull IdConfig idConfig, @NotNull CameraProperties cameraProperties) {
            super(null);
            Intrinsics.checkNotNullParameter(idPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(idConfig, "id");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = idPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.id = idConfig;
            this.cameraProperties = cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @NotNull
        public final IdConfig getId() {
            return this.id;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.currentPart, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            this.id.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.cameraProperties, flags);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0084\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010,\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00105R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b2\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b:\u0010!R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "idForReview", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "error", "", "submittingForAutoClassification", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;Z)V", "newValue", "s", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "", "d", "()V", "t", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "q", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "p", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "r", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "y", "k", "z", "I", "A", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "B", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "C", "Ljava/lang/String;", "D", "Z", "x", "()Z", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ReviewCapturedImage extends ReviewImageState {

        @NotNull
        public static final Parcelable.Creator<ReviewCapturedImage> CREATOR = new a();

        private final GovernmentIdState backState;

        @NotNull
        private final CameraProperties cameraProperties;

        private final String error;

        private final boolean submittingForAutoClassification;

        @NotNull
        private final IdPart.SideIdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final CaptureConfig captureConfig;

        @NotNull
        private final GovernmentId idForReview;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewCapturedImage> {
            @Override
            @NotNull
            public final ReviewCapturedImage createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                GovernmentId governmentId = (GovernmentId) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                return new ReviewCapturedImage(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentId, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final ReviewCapturedImage[] newArray(int i) {
                return new ReviewCapturedImage[i];
            }
        }

        public ReviewCapturedImage(IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, governmentId, list2, i, governmentIdState, cameraProperties, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? false : z);
        }

        public static ReviewCapturedImage v(ReviewCapturedImage reviewCapturedImage, IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z, int i2, Object obj) {
            return reviewCapturedImage.t((i2 & 1) != 0 ? reviewCapturedImage.currentPart : sideIdPart, (i2 & 2) != 0 ? reviewCapturedImage.uploadingIds : list, (i2 & 4) != 0 ? reviewCapturedImage.captureConfig : captureConfig, (i2 & 8) != 0 ? reviewCapturedImage.idForReview : governmentId, (i2 & 16) != 0 ? reviewCapturedImage.parts : list2, (i2 & 32) != 0 ? reviewCapturedImage.partIndex : i, (i2 & 64) != 0 ? reviewCapturedImage.backState : governmentIdState, (i2 & 128) != 0 ? reviewCapturedImage.cameraProperties : cameraProperties, (i2 & 256) != 0 ? reviewCapturedImage.error : str, (i2 & 512) != 0 ? reviewCapturedImage.submittingForAutoClassification : z);
        }

        @Override
        public void d() {
            super.d();
            Iterator<T> it = getIdForReview().b1().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewCapturedImage)) {
                return false;
            }
            ReviewCapturedImage reviewCapturedImage = (ReviewCapturedImage) other;
            return Intrinsics.b(this.currentPart, reviewCapturedImage.currentPart) && Intrinsics.b(this.uploadingIds, reviewCapturedImage.uploadingIds) && Intrinsics.b(this.captureConfig, reviewCapturedImage.captureConfig) && Intrinsics.b(this.idForReview, reviewCapturedImage.idForReview) && Intrinsics.b(this.parts, reviewCapturedImage.parts) && this.partIndex == reviewCapturedImage.partIndex && Intrinsics.b(this.backState, reviewCapturedImage.backState) && Intrinsics.b(this.cameraProperties, reviewCapturedImage.cameraProperties) && Intrinsics.b(this.error, reviewCapturedImage.error) && this.submittingForAutoClassification == reviewCapturedImage.submittingForAutoClassification;
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str = this.error;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.submittingForAutoClassification);
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @Override
        @NotNull
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        @NotNull
        public CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override
        @NotNull
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override
        @NotNull
        public GovernmentId getIdForReview() {
            return this.idForReview;
        }

        @Override
        @NotNull
        public ReviewImageState s(boolean newValue) {
            return v(this, null, null, null, null, null, 0, null, null, null, newValue, 511, null);
        }

        @NotNull
        public final ReviewCapturedImage t(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId idForReview, @NotNull List<? extends IdPart> parts, int partIndex, GovernmentIdState backState, @NotNull CameraProperties cameraProperties, String error, boolean submittingForAutoClassification) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewCapturedImage(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification);
        }

        @NotNull
        public String toString() {
            return "ReviewCapturedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ")";
        }

        public final String getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.currentPart.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeParcelable(this.captureConfig, flags);
            parcel.writeParcelable(this.idForReview, flags);
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeString(this.error);
            parcel.writeInt(this.submittingForAutoClassification ? 1 : 0);
        }

        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        public ReviewCapturedImage(@NotNull IdPart.SideIdPart sideIdPart, @NotNull List<? extends GovernmentId> list, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId governmentId, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, @NotNull CameraProperties cameraProperties, String str, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(sideIdPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(governmentId, "idForReview");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = sideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.idForReview = governmentId;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str;
            this.submittingForAutoClassification = z;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8 X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "<init>", "()V", "", "newValue", "s", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "q", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "p", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "r", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "idForReview", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class ReviewImageState extends GovernmentIdState {
        public ReviewImageState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract CameraProperties getCameraProperties();

        @NotNull
        public abstract CaptureConfig getCaptureConfig();

        @NotNull
        public abstract IdPart.SideIdPart getCurrentPart();

        @NotNull
        public abstract GovernmentId getIdForReview();

        @NotNull
        public abstract ReviewImageState s(boolean newValue);

        private ReviewImageState() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Jh\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b'\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0014¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "parts", "backState", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "selectedId", "", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)V", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "g", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "k", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "y", "I", "z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getSelectedId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "A", "Ljava/lang/String;", "q", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ShowInstructions extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new a();

        private final String error;

        @NotNull
        private final IdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final List<IdPart> parts;

        private final GovernmentIdState backState;

        private final int partIndex;

        private final IdConfig selectedId;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructions> {
            @Override
            @NotNull
            public final ShowInstructions createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart idPart = (IdPart) parcel.readParcelable(ShowInstructions.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                return new ShowInstructions(idPart, arrayList, arrayList2, (GovernmentIdState) parcel.readParcelable(ShowInstructions.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override
            @NotNull
            public final ShowInstructions[] newArray(int i) {
                return new ShowInstructions[i];
            }
        }

        public ShowInstructions() {
            this(null, null, null, null, 0, null, null, 127, null);
        }

        public static ShowInstructions p(ShowInstructions showInstructions, IdPart idPart, List list, List list2, GovernmentIdState governmentIdState, int i, IdConfig idConfig, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                idPart = showInstructions.currentPart;
            }
            if ((i2 & 2) != 0) {
                list = showInstructions.uploadingIds;
            }
            List list3 = list;
            if ((i2 & 4) != 0) {
                list2 = showInstructions.parts;
            }
            List list4 = list2;
            if ((i2 & 8) != 0) {
                governmentIdState = showInstructions.backState;
            }
            GovernmentIdState governmentIdState2 = governmentIdState;
            if ((i2 & 16) != 0) {
                i = showInstructions.partIndex;
            }
            int i3 = i;
            if ((i2 & 32) != 0) {
                idConfig = showInstructions.selectedId;
            }
            IdConfig idConfig2 = idConfig;
            if ((i2 & 64) != 0) {
                str = showInstructions.error;
            }
            return showInstructions.o(idPart, list3, list4, governmentIdState2, i3, idConfig2, str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowInstructions)) {
                return false;
            }
            ShowInstructions showInstructions = (ShowInstructions) other;
            return Intrinsics.b(this.currentPart, showInstructions.currentPart) && Intrinsics.b(this.uploadingIds, showInstructions.uploadingIds) && Intrinsics.b(this.parts, showInstructions.parts) && Intrinsics.b(this.backState, showInstructions.backState) && this.partIndex == showInstructions.partIndex && Intrinsics.b(this.selectedId, showInstructions.selectedId) && Intrinsics.b(this.error, showInstructions.error);
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        public int hashCode() {
            int iHashCode = ((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + Integer.hashCode(this.partIndex)) * 31;
            IdConfig idConfig = this.selectedId;
            int iHashCode3 = (iHashCode2 + (idConfig == null ? 0 : idConfig.hashCode())) * 31;
            String str = this.error;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final ShowInstructions o(@NotNull IdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, GovernmentIdState backState, int partIndex, IdConfig selectedId, String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new ShowInstructions(currentPart, uploadingIds, parts, backState, partIndex, selectedId, error);
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public String toString() {
            return "ShowInstructions(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", backState=" + this.backState + ", partIndex=" + this.partIndex + ", selectedId=" + this.selectedId + ", error=" + this.error + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.currentPart, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeParcelable(this.backState, flags);
            parcel.writeInt(this.partIndex);
            IdConfig idConfig = this.selectedId;
            if (idConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                idConfig.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.error);
        }

        public ShowInstructions(IdPart idPart, List list, List list2, GovernmentIdState governmentIdState, int i, IdConfig idConfig, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new IdPart.SideIdPart(IdConfig.b.v) : idPart, (i2 & 2) != 0 ? CollectionsKt.j() : list, (i2 & 4) != 0 ? CollectionsKt.j() : list2, (i2 & 8) != 0 ? null : governmentIdState, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? null : idConfig, (i2 & 64) == 0 ? str : null);
        }

        public ShowInstructions(@NotNull IdPart idPart, @NotNull List<? extends GovernmentId> list, @NotNull List<? extends IdPart> list2, GovernmentIdState governmentIdState, int i, IdConfig idConfig, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(idPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(list2, "parts");
            this.currentPart = idPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.backState = governmentIdState;
            this.partIndex = i;
            this.selectedId = idConfig;
            this.error = str;
        }
    }

    public GovernmentIdState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final GovernmentIdState c(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this instanceof ReviewCapturedImage ? ReviewCapturedImage.v((ReviewCapturedImage) this, null, null, null, null, null, 0, null, null, error, false, 767, null) : this instanceof ReviewSelectedImage ? ReviewSelectedImage.v((ReviewSelectedImage) this, null, null, null, null, null, null, 0, null, null, error, false, 1535, null) : this instanceof ChooseCaptureMethod ? ChooseCaptureMethod.p((ChooseCaptureMethod) this, null, null, null, 0, null, false, null, error, 127, null) : this instanceof ShowInstructions ? ShowInstructions.p((ShowInstructions) this, null, null, null, null, 0, null, error, 63, null) : this;
    }

    public void d() {
        Iterator<T> it = l().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((GovernmentId) it.next()).b1().iterator();
            while (it2.hasNext()) {
                new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
            }
        }
    }

    public abstract GovernmentIdState getBackState();

    @NotNull
    public abstract IdPart getCurrentPart();

    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    public abstract int getPartIndex();

    @NotNull
    public abstract List<IdPart> k();

    @NotNull
    public abstract List<GovernmentId> l();

    public final void n(boolean z) {
        this.didGoBack = z;
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0090\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010-\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\"R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u00106R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b3\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\b;\u0010\"R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b?\u0010Q¨\u0006R"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "idForReview", "", "fileName", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "error", "", "submittingForAutoClassification", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;Z)V", "newValue", "s", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "", "d", "()V", "t", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "q", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "p", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "r", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "y", "Ljava/lang/String;", "x", "z", "k", "A", "I", "B", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "C", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "D", "E", "Z", "()Z", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ReviewSelectedImage extends ReviewImageState {

        @NotNull
        public static final Parcelable.Creator<ReviewSelectedImage> CREATOR = new a();

        private final int partIndex;

        private final GovernmentIdState backState;

        @NotNull
        private final CameraProperties cameraProperties;

        private final String error;

        private final boolean submittingForAutoClassification;

        @NotNull
        private final IdPart.SideIdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final CaptureConfig captureConfig;

        @NotNull
        private final GovernmentId idForReview;

        private final String fileName;

        @NotNull
        private final List<IdPart> parts;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewSelectedImage> {
            @Override
            @NotNull
            public final ReviewSelectedImage createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                GovernmentId governmentId = (GovernmentId) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                String string = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                return new ReviewSelectedImage(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentId, string, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final ReviewSelectedImage[] newArray(int i) {
                return new ReviewSelectedImage[i];
            }
        }

        public ReviewSelectedImage(IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, governmentId, str, list2, i, governmentIdState, (i2 & 256) != 0 ? new CameraProperties(null, null, null, 0, 15, null) : cameraProperties, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? false : z);
        }

        public static ReviewSelectedImage v(ReviewSelectedImage reviewSelectedImage, IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z, int i2, Object obj) {
            return reviewSelectedImage.t((i2 & 1) != 0 ? reviewSelectedImage.currentPart : sideIdPart, (i2 & 2) != 0 ? reviewSelectedImage.uploadingIds : list, (i2 & 4) != 0 ? reviewSelectedImage.captureConfig : captureConfig, (i2 & 8) != 0 ? reviewSelectedImage.idForReview : governmentId, (i2 & 16) != 0 ? reviewSelectedImage.fileName : str, (i2 & 32) != 0 ? reviewSelectedImage.parts : list2, (i2 & 64) != 0 ? reviewSelectedImage.partIndex : i, (i2 & 128) != 0 ? reviewSelectedImage.backState : governmentIdState, (i2 & 256) != 0 ? reviewSelectedImage.cameraProperties : cameraProperties, (i2 & 512) != 0 ? reviewSelectedImage.error : str2, (i2 & 1024) != 0 ? reviewSelectedImage.submittingForAutoClassification : z);
        }

        @Override
        public void d() {
            super.d();
            Iterator<T> it = getIdForReview().b1().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewSelectedImage)) {
                return false;
            }
            ReviewSelectedImage reviewSelectedImage = (ReviewSelectedImage) other;
            return Intrinsics.b(this.currentPart, reviewSelectedImage.currentPart) && Intrinsics.b(this.uploadingIds, reviewSelectedImage.uploadingIds) && Intrinsics.b(this.captureConfig, reviewSelectedImage.captureConfig) && Intrinsics.b(this.idForReview, reviewSelectedImage.idForReview) && Intrinsics.b(this.fileName, reviewSelectedImage.fileName) && Intrinsics.b(this.parts, reviewSelectedImage.parts) && this.partIndex == reviewSelectedImage.partIndex && Intrinsics.b(this.backState, reviewSelectedImage.backState) && Intrinsics.b(this.cameraProperties, reviewSelectedImage.cameraProperties) && Intrinsics.b(this.error, reviewSelectedImage.error) && this.submittingForAutoClassification == reviewSelectedImage.submittingForAutoClassification;
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31;
            String str = this.fileName;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode3 = (((iHashCode2 + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str2 = this.error;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.submittingForAutoClassification);
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @Override
        @NotNull
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        @NotNull
        public CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override
        @NotNull
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override
        @NotNull
        public GovernmentId getIdForReview() {
            return this.idForReview;
        }

        @Override
        @NotNull
        public ReviewImageState s(boolean newValue) {
            return v(this, null, null, null, null, null, null, 0, null, null, null, newValue, 1023, null);
        }

        @NotNull
        public final ReviewSelectedImage t(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId idForReview, String fileName, @NotNull List<? extends IdPart> parts, int partIndex, GovernmentIdState backState, @NotNull CameraProperties cameraProperties, String error, boolean submittingForAutoClassification) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewSelectedImage(currentPart, uploadingIds, captureConfig, idForReview, fileName, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification);
        }

        @NotNull
        public String toString() {
            return "ReviewSelectedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", fileName=" + this.fileName + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ")";
        }

        public final String getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.currentPart.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeParcelable(this.captureConfig, flags);
            parcel.writeParcelable(this.idForReview, flags);
            parcel.writeString(this.fileName);
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeString(this.error);
            parcel.writeInt(this.submittingForAutoClassification ? 1 : 0);
        }

        public final String getFileName() {
            return this.fileName;
        }

        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        public ReviewSelectedImage(@NotNull IdPart.SideIdPart sideIdPart, @NotNull List<? extends GovernmentId> list, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId governmentId, String str, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, @NotNull CameraProperties cameraProperties, String str2, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(sideIdPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(governmentId, "idForReview");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = sideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.idForReview = governmentId;
            this.fileName = str;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str2;
            this.submittingForAutoClassification = z;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b)\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u0016R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "parts", "", "partIndex", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "g", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "w", "k", "y", "I", "z", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "A", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "p", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "B", "Ljava/lang/String;", "q", "C", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Submit extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        private final GovernmentIdRequestArguments governmentIdRequestArguments;

        private final String webRtcObjectId;

        @NotNull
        private final CameraProperties cameraProperties;

        @NotNull
        private final IdConfig id;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final IdPart currentPart;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        private final GovernmentIdState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Submit> {
            @Override
            @NotNull
            public final Submit createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                IdPart idPart = (IdPart) parcel.readParcelable(Submit.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(idConfigCreateFromParcel, arrayList, idPart, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readString(), (CameraProperties) parcel.readParcelable(Submit.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final Submit[] newArray(int i) {
                return new Submit[i];
            }
        }

        public Submit(IdConfig idConfig, List list, IdPart idPart, List list2, int i, GovernmentIdState governmentIdState, GovernmentIdRequestArguments governmentIdRequestArguments, String str, CameraProperties cameraProperties, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, (i2 & 4) != 0 ? new IdPart.SideIdPart(IdConfig.b.v) : idPart, list2, i, (i2 & 32) != 0 ? null : governmentIdState, (i2 & 64) != 0 ? null : governmentIdRequestArguments, str, cameraProperties);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            return Intrinsics.b(this.id, submit.id) && Intrinsics.b(this.uploadingIds, submit.uploadingIds) && Intrinsics.b(this.currentPart, submit.currentPart) && Intrinsics.b(this.parts, submit.parts) && this.partIndex == submit.partIndex && Intrinsics.b(this.backState, submit.backState) && Intrinsics.b(this.governmentIdRequestArguments, submit.governmentIdRequestArguments) && Intrinsics.b(this.webRtcObjectId, submit.webRtcObjectId) && Intrinsics.b(this.cameraProperties, submit.cameraProperties);
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            int iHashCode3 = (iHashCode2 + (governmentIdRequestArguments == null ? 0 : governmentIdRequestArguments.hashCode())) * 31;
            String str = this.webRtcObjectId;
            return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.cameraProperties.hashCode();
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final GovernmentIdRequestArguments getGovernmentIdRequestArguments() {
            return this.governmentIdRequestArguments;
        }

        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @NotNull
        public String toString() {
            return "Submit(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", webRtcObjectId=" + this.webRtcObjectId + ", cameraProperties=" + this.cameraProperties + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.id.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeParcelable(this.currentPart, flags);
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdRequestArguments.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, flags);
        }

        public Submit(@NotNull IdConfig idConfig, @NotNull List<? extends GovernmentId> list, @NotNull IdPart idPart, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, GovernmentIdRequestArguments governmentIdRequestArguments, String str, @NotNull CameraProperties cameraProperties) {
            super(null);
            Intrinsics.checkNotNullParameter(idConfig, "id");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(idPart, "currentPart");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.id = idConfig;
            this.uploadingIds = list;
            this.currentPart = idPart;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u009d\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010$J¸\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b0\u0010+J \u00104\u001a\u00020\u001e2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u001a\u0010\u0010\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b:\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bN\u0010PR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bH\u0010)R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b>\u0010UR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010\u001a\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bB\u0010^R#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bb\u0010c\u001a\u0004\bF\u0010a¨\u0006d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lv8/c;", "Lv8/a;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "manualCapture", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "LC8/d;", "webRtcState", "", "webRtcJwt", "", "error", "", "checkCameraPermissions", "checkAudioPermissions", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "Lkotlin/Function0;", "", "webRtcConnectionEstablished", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;LC8/d;Ljava/lang/String;Ljava/lang/Throwable;ZZLcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;)V", "newValue", "b", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "a", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;LC8/d;Ljava/lang/String;Ljava/lang/Throwable;ZZLcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "t", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "q", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "x", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "y", "k", "z", "I", "A", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "B", "LC8/d;", "()LC8/d;", "C", "Ljava/lang/String;", "D", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "E", "Z", "s", "()Z", "F", "r", "G", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "H", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "getWebRtcConnectionEstablished$annotations", "()V", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class WaitForAutocapture extends GovernmentIdState implements InterfaceC0835c, InterfaceC0833a {

        @NotNull
        public static final Parcelable.Creator<WaitForAutocapture> CREATOR = new b();

        private final GovernmentIdState backState;

        private final EnumC0329d webRtcState;

        private final String webRtcJwt;

        private final Throwable error;

        private final boolean checkCameraPermissions;

        private final boolean checkAudioPermissions;

        private final Hint hint;

        @NotNull
        private final Function0<Unit> webRtcConnectionEstablished;

        @NotNull
        private final IdPart.SideIdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final CaptureConfig captureConfig;

        @NotNull
        private final Screen.b.a manualCapture;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
            public static final a d = new a();

            a() {
                super(0);
            }

            public final void m48invoke() {
            }

            public Object invoke() {
                m48invoke();
                return Unit.a;
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<WaitForAutocapture> {
            @Override
            @NotNull
            public final WaitForAutocapture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(WaitForAutocapture.class.getClassLoader());
                Screen.b.a aVarValueOf = Screen.b.a.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                return new WaitForAutocapture(sideIdPartCreateFromParcel, arrayList, captureConfig, aVarValueOf, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), parcel.readInt() == 0 ? null : EnumC0329d.valueOf(parcel.readString()), parcel.readString(), (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, (Hint) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), null, 8192, null);
            }

            @Override
            @NotNull
            public final WaitForAutocapture[] newArray(int i) {
                return new WaitForAutocapture[i];
            }
        }

        public WaitForAutocapture(IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, Screen.b.a aVar, List list2, int i, GovernmentIdState governmentIdState, EnumC0329d enumC0329d, String str, Throwable th, boolean z, boolean z2, Hint hint, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, aVar, list2, i, governmentIdState, enumC0329d, str, (i2 & 512) != 0 ? null : th, (i2 & 1024) != 0 ? true : z, (i2 & 2048) != 0 ? true : z2, (i2 & 4096) != 0 ? null : hint, (i2 & 8192) != 0 ? a.d : function0);
        }

        public static WaitForAutocapture p(WaitForAutocapture waitForAutocapture, IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, Screen.b.a aVar, List list2, int i, GovernmentIdState governmentIdState, EnumC0329d enumC0329d, String str, Throwable th, boolean z, boolean z2, Hint hint, Function0 function0, int i2, Object obj) {
            return waitForAutocapture.o((i2 & 1) != 0 ? waitForAutocapture.currentPart : sideIdPart, (i2 & 2) != 0 ? waitForAutocapture.uploadingIds : list, (i2 & 4) != 0 ? waitForAutocapture.captureConfig : captureConfig, (i2 & 8) != 0 ? waitForAutocapture.manualCapture : aVar, (i2 & 16) != 0 ? waitForAutocapture.parts : list2, (i2 & 32) != 0 ? waitForAutocapture.partIndex : i, (i2 & 64) != 0 ? waitForAutocapture.backState : governmentIdState, (i2 & 128) != 0 ? waitForAutocapture.webRtcState : enumC0329d, (i2 & 256) != 0 ? waitForAutocapture.webRtcJwt : str, (i2 & 512) != 0 ? waitForAutocapture.error : th, (i2 & 1024) != 0 ? waitForAutocapture.checkCameraPermissions : z, (i2 & 2048) != 0 ? waitForAutocapture.checkAudioPermissions : z2, (i2 & 4096) != 0 ? waitForAutocapture.hint : hint, (i2 & 8192) != 0 ? waitForAutocapture.webRtcConnectionEstablished : function0);
        }

        public final EnumC0329d getWebRtcState() {
            return this.webRtcState;
        }

        @Override
        @NotNull
        public GovernmentIdState a(boolean newValue) {
            return p(this, null, null, null, null, null, 0, null, null, null, null, false, newValue, null, null, 14335, null);
        }

        @Override
        @NotNull
        public GovernmentIdState b(boolean newValue) {
            return p(this, null, null, null, null, null, 0, null, null, null, null, newValue, false, null, null, 15359, null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForAutocapture)) {
                return false;
            }
            WaitForAutocapture waitForAutocapture = (WaitForAutocapture) other;
            return Intrinsics.b(this.currentPart, waitForAutocapture.currentPart) && Intrinsics.b(this.uploadingIds, waitForAutocapture.uploadingIds) && Intrinsics.b(this.captureConfig, waitForAutocapture.captureConfig) && this.manualCapture == waitForAutocapture.manualCapture && Intrinsics.b(this.parts, waitForAutocapture.parts) && this.partIndex == waitForAutocapture.partIndex && Intrinsics.b(this.backState, waitForAutocapture.backState) && this.webRtcState == waitForAutocapture.webRtcState && Intrinsics.b(this.webRtcJwt, waitForAutocapture.webRtcJwt) && Intrinsics.b(this.error, waitForAutocapture.error) && this.checkCameraPermissions == waitForAutocapture.checkCameraPermissions && this.checkAudioPermissions == waitForAutocapture.checkAudioPermissions && Intrinsics.b(this.hint, waitForAutocapture.hint) && Intrinsics.b(this.webRtcConnectionEstablished, waitForAutocapture.webRtcConnectionEstablished);
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.manualCapture.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            EnumC0329d enumC0329d = this.webRtcState;
            int iHashCode3 = (iHashCode2 + (enumC0329d == null ? 0 : enumC0329d.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.error;
            int iHashCode5 = (((((iHashCode4 + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.checkCameraPermissions)) * 31) + Boolean.hashCode(this.checkAudioPermissions)) * 31;
            Hint hint = this.hint;
            return ((iHashCode5 + (hint != null ? hint.hashCode() : 0)) * 31) + this.webRtcConnectionEstablished.hashCode();
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final WaitForAutocapture o(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull Screen.b.a manualCapture, @NotNull List<? extends IdPart> parts, int partIndex, GovernmentIdState backState, EnumC0329d webRtcState, String webRtcJwt, Throwable error, boolean checkCameraPermissions, boolean checkAudioPermissions, Hint hint, @NotNull Function0<Unit> webRtcConnectionEstablished) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(manualCapture, "manualCapture");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            return new WaitForAutocapture(currentPart, uploadingIds, captureConfig, manualCapture, parts, partIndex, backState, webRtcState, webRtcJwt, error, checkCameraPermissions, checkAudioPermissions, hint, webRtcConnectionEstablished);
        }

        @NotNull
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        public boolean getCheckAudioPermissions() {
            return this.checkAudioPermissions;
        }

        public boolean getCheckCameraPermissions() {
            return this.checkCameraPermissions;
        }

        @Override
        @NotNull
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @NotNull
        public String toString() {
            return "WaitForAutocapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", manualCapture=" + this.manualCapture + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", webRtcState=" + this.webRtcState + ", webRtcJwt=" + this.webRtcJwt + ", error=" + this.error + ", checkCameraPermissions=" + this.checkCameraPermissions + ", checkAudioPermissions=" + this.checkAudioPermissions + ", hint=" + this.hint + ", webRtcConnectionEstablished=" + this.webRtcConnectionEstablished + ")";
        }

        public final Throwable getError() {
            return this.error;
        }

        public final Hint getHint() {
            return this.hint;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.currentPart.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeParcelable(this.captureConfig, flags);
            parcel.writeString(this.manualCapture.name());
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            EnumC0329d enumC0329d = this.webRtcState;
            if (enumC0329d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(enumC0329d.name());
            }
            parcel.writeString(this.webRtcJwt);
            parcel.writeSerializable(this.error);
            parcel.writeInt(this.checkCameraPermissions ? 1 : 0);
            parcel.writeInt(this.checkAudioPermissions ? 1 : 0);
            parcel.writeParcelable(this.hint, flags);
        }

        @NotNull
        public final Screen.b.a getManualCapture() {
            return this.manualCapture;
        }

        @NotNull
        public final Function0<Unit> y() {
            return this.webRtcConnectionEstablished;
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        public WaitForAutocapture(@NotNull IdPart.SideIdPart sideIdPart, @NotNull List<? extends GovernmentId> list, @NotNull CaptureConfig captureConfig, @NotNull Screen.b.a aVar, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, EnumC0329d enumC0329d, String str, Throwable th, boolean z, boolean z2, Hint hint, @NotNull Function0<Unit> function0) {
            super(null);
            Intrinsics.checkNotNullParameter(sideIdPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(aVar, "manualCapture");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(function0, "webRtcConnectionEstablished");
            this.currentPart = sideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.manualCapture = aVar;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.webRtcState = enumC0329d;
            this.webRtcJwt = str;
            this.error = th;
            this.checkCameraPermissions = z;
            this.checkAudioPermissions = z2;
            this.hint = hint;
            this.webRtcConnectionEstablished = function0;
        }
    }

    private GovernmentIdState() {
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b-\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010\u001aR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "", "selectedCountryCode", "selectedIdClass", "Lv8/b;", "errorType", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lv8/b;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "p", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "k", "w", "I", "y", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "z", "o", "A", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "B", "r", "C", "Ljava/lang/String;", "getSelectedCountryCode", "D", "getSelectedIdClass", "E", "Lv8/b;", "q", "()Lv8/b;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class AutoClassificationError extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<AutoClassificationError> CREATOR = new a();

        @NotNull
        private final CameraProperties cameraProperties;

        @NotNull
        private final List<IdConfigForCountry> idConfigsForCountry;

        private final String selectedCountryCode;

        private final String selectedIdClass;

        @NotNull
        private final EnumC0834b errorType;

        @NotNull
        private final IdPart.SideIdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        private final GovernmentIdState backState;

        @NotNull
        private final List<Frame> captureFrames;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClassificationError> {
            @Override
            @NotNull
            public final AutoClassificationError createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i5 = parcel.readInt();
                GovernmentIdState governmentIdState = (GovernmentIdState) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationError(sideIdPartCreateFromParcel, arrayList, arrayList2, i5, governmentIdState, arrayList3, cameraProperties, arrayList4, parcel.readString(), parcel.readString(), EnumC0834b.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final AutoClassificationError[] newArray(int i) {
                return new AutoClassificationError[i];
            }
        }

        public AutoClassificationError(IdPart.SideIdPart sideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, List list3, CameraProperties cameraProperties, List list4, String str, String str2, EnumC0834b enumC0834b, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new IdPart.SideIdPart(IdConfig.b.v) : sideIdPart, (i2 & 2) != 0 ? CollectionsKt.j() : list, list2, i, governmentIdState, list3, cameraProperties, list4, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : str2, enumC0834b);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClassificationError)) {
                return false;
            }
            AutoClassificationError autoClassificationError = (AutoClassificationError) other;
            return Intrinsics.b(this.currentPart, autoClassificationError.currentPart) && Intrinsics.b(this.uploadingIds, autoClassificationError.uploadingIds) && Intrinsics.b(this.parts, autoClassificationError.parts) && this.partIndex == autoClassificationError.partIndex && Intrinsics.b(this.backState, autoClassificationError.backState) && Intrinsics.b(this.captureFrames, autoClassificationError.captureFrames) && Intrinsics.b(this.cameraProperties, autoClassificationError.cameraProperties) && Intrinsics.b(this.idConfigsForCountry, autoClassificationError.idConfigsForCountry) && Intrinsics.b(this.selectedCountryCode, autoClassificationError.selectedCountryCode) && Intrinsics.b(this.selectedIdClass, autoClassificationError.selectedIdClass) && this.errorType == autoClassificationError.errorType;
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((((((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str = this.selectedCountryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.selectedIdClass;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.errorType.hashCode();
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final List<Frame> o() {
            return this.captureFrames;
        }

        @Override
        @NotNull
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @NotNull
        public final EnumC0834b getErrorType() {
            return this.errorType;
        }

        @NotNull
        public final List<IdConfigForCountry> r() {
            return this.idConfigsForCountry;
        }

        @NotNull
        public String toString() {
            return "AutoClassificationError(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ", errorType=" + this.errorType + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.currentPart.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, flags);
            List<Frame> list3 = this.captureFrames;
            parcel.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            parcel.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, flags);
            }
            parcel.writeString(this.selectedCountryCode);
            parcel.writeString(this.selectedIdClass);
            parcel.writeString(this.errorType.name());
        }

        public AutoClassificationError(@NotNull IdPart.SideIdPart sideIdPart, @NotNull List<? extends GovernmentId> list, @NotNull List<? extends IdPart> list2, int i, GovernmentIdState governmentIdState, @NotNull List<Frame> list3, @NotNull CameraProperties cameraProperties, @NotNull List<IdConfigForCountry> list4, String str, String str2, @NotNull EnumC0834b enumC0834b) {
            super(null);
            Intrinsics.checkNotNullParameter(sideIdPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(list3, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(list4, "idConfigsForCountry");
            Intrinsics.checkNotNullParameter(enumC0834b, "errorType");
            this.currentPart = sideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.captureFrames = list3;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = list4;
            this.selectedCountryCode = str;
            this.selectedIdClass = str2;
            this.errorType = enumC0834b;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jp\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b)\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u0017¨\u0006@"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "", "choosingDocumentToUpload", "backState", "", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;)V", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "s", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "k", "w", "I", "y", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "q", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "z", "Z", "r", "()Z", "A", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "B", "Ljava/lang/String;", "t", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ChooseCaptureMethod extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<ChooseCaptureMethod> CREATOR = new a();

        private final GovernmentIdState backState;

        private final String error;

        @NotNull
        private final IdPart.SideIdPart currentPart;

        @NotNull
        private final List<GovernmentId> uploadingIds;

        @NotNull
        private final List<IdPart> parts;

        private final int partIndex;

        @NotNull
        private final CaptureConfig captureConfig;

        private final boolean choosingDocumentToUpload;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChooseCaptureMethod> {
            @Override
            @NotNull
            public final ChooseCaptureMethod createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                return new ChooseCaptureMethod(sideIdPartCreateFromParcel, arrayList, arrayList2, parcel.readInt(), (CaptureConfig) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readInt() != 0, (GovernmentIdState) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readString());
            }

            @Override
            @NotNull
            public final ChooseCaptureMethod[] newArray(int i) {
                return new ChooseCaptureMethod[i];
            }
        }

        public ChooseCaptureMethod(IdPart.SideIdPart sideIdPart, List list, List list2, int i, CaptureConfig captureConfig, boolean z, GovernmentIdState governmentIdState, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new IdPart.SideIdPart(IdConfig.b.v) : sideIdPart, (i2 & 2) != 0 ? CollectionsKt.j() : list, list2, i, captureConfig, (i2 & 32) != 0 ? false : z, governmentIdState, (i2 & 128) != 0 ? null : str);
        }

        public static ChooseCaptureMethod p(ChooseCaptureMethod chooseCaptureMethod, IdPart.SideIdPart sideIdPart, List list, List list2, int i, CaptureConfig captureConfig, boolean z, GovernmentIdState governmentIdState, String str, int i2, Object obj) {
            return chooseCaptureMethod.o((i2 & 1) != 0 ? chooseCaptureMethod.currentPart : sideIdPart, (i2 & 2) != 0 ? chooseCaptureMethod.uploadingIds : list, (i2 & 4) != 0 ? chooseCaptureMethod.parts : list2, (i2 & 8) != 0 ? chooseCaptureMethod.partIndex : i, (i2 & 16) != 0 ? chooseCaptureMethod.captureConfig : captureConfig, (i2 & 32) != 0 ? chooseCaptureMethod.choosingDocumentToUpload : z, (i2 & 64) != 0 ? chooseCaptureMethod.backState : governmentIdState, (i2 & 128) != 0 ? chooseCaptureMethod.error : str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChooseCaptureMethod)) {
                return false;
            }
            ChooseCaptureMethod chooseCaptureMethod = (ChooseCaptureMethod) other;
            return Intrinsics.b(this.currentPart, chooseCaptureMethod.currentPart) && Intrinsics.b(this.uploadingIds, chooseCaptureMethod.uploadingIds) && Intrinsics.b(this.parts, chooseCaptureMethod.parts) && this.partIndex == chooseCaptureMethod.partIndex && Intrinsics.b(this.captureConfig, chooseCaptureMethod.captureConfig) && this.choosingDocumentToUpload == chooseCaptureMethod.choosingDocumentToUpload && Intrinsics.b(this.backState, chooseCaptureMethod.backState) && Intrinsics.b(this.error, chooseCaptureMethod.error);
        }

        @Override
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31) + this.captureConfig.hashCode()) * 31) + Boolean.hashCode(this.choosingDocumentToUpload)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.error;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override
        @NotNull
        public List<IdPart> k() {
            return this.parts;
        }

        @Override
        @NotNull
        public List<GovernmentId> l() {
            return this.uploadingIds;
        }

        @NotNull
        public final ChooseCaptureMethod o(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int partIndex, @NotNull CaptureConfig captureConfig, boolean choosingDocumentToUpload, GovernmentIdState backState, String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            return new ChooseCaptureMethod(currentPart, uploadingIds, parts, partIndex, captureConfig, choosingDocumentToUpload, backState, error);
        }

        @NotNull
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        public final boolean getChoosingDocumentToUpload() {
            return this.choosingDocumentToUpload;
        }

        @Override
        @NotNull
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public String toString() {
            return "ChooseCaptureMethod(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", captureConfig=" + this.captureConfig + ", choosingDocumentToUpload=" + this.choosingDocumentToUpload + ", backState=" + this.backState + ", error=" + this.error + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.currentPart.writeToParcel(parcel, flags);
            List<GovernmentId> list = this.uploadingIds;
            parcel.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            parcel.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.captureConfig, flags);
            parcel.writeInt(this.choosingDocumentToUpload ? 1 : 0);
            parcel.writeParcelable(this.backState, flags);
            parcel.writeString(this.error);
        }

        public ChooseCaptureMethod(@NotNull IdPart.SideIdPart sideIdPart, @NotNull List<? extends GovernmentId> list, @NotNull List<? extends IdPart> list2, int i, @NotNull CaptureConfig captureConfig, boolean z, GovernmentIdState governmentIdState, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(sideIdPart, "currentPart");
            Intrinsics.checkNotNullParameter(list, "uploadingIds");
            Intrinsics.checkNotNullParameter(list2, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            this.currentPart = sideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.captureConfig = captureConfig;
            this.choosingDocumentToUpload = z;
            this.backState = governmentIdState;
            this.error = str;
        }
    }
}
