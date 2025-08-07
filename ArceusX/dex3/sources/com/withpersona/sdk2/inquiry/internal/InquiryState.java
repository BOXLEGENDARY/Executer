package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import ha.InterfaceC0336B;
import ha.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\t3456789:;B[\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u00102\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u0082\u0001\t<=>?@ABCD¨\u0006E"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "fromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "g", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "l", "i", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "w", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "y", "c", "z", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "", "A", "Z", "b", "()Z", "f", "(Z)V", "getDidGoBack$annotations", "()V", "didGoBack", "Complete", "CreateInquiryFromTemplate", "CreateInquirySession", "DocumentStepRunning", "GovernmentIdStepRunning", "ResumeFallbackInquiry", "SelfieStepRunning", "ShowLoadingSpinner", "UiStepRunning", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class InquiryState implements Parcelable {

    private boolean didGoBack;

    private final String sessionToken;

    private final String inquiryId;

    private final TransitionStatus transitionStatus;

    private final StepStyle styles;

    private final NextStep.CancelDialog cancelDialog;

    private final String fromStep;

    @NotNull
    private final InquirySessionConfig inquirySessionConfig;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0010R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;)V", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "l", "C", "j", "D", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "d", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "E", "o", "F", "Ljava/util/Map;", "n", "()Ljava/util/Map;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Complete extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<Complete> CREATOR = new a();

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String sessionToken;

        private final TransitionStatus transitionStatus;

        @NotNull
        private final String inquiryStatus;

        @NotNull
        private final Map<String, InquiryField> fields;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Complete> {
            @Override
            @NotNull
            public final Complete createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(Complete.class.getClassLoader());
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                }
                return new Complete(string, string2, transitionStatus, string3, linkedHashMap);
            }

            @Override
            @NotNull
            public final Complete[] newArray(int i) {
                return new Complete[i];
            }
        }

        public Complete(String str, String str2, TransitionStatus transitionStatus, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : transitionStatus, str3, map);
        }

        public static Complete i(Complete complete, String str, String str2, TransitionStatus transitionStatus, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = complete.inquiryId;
            }
            if ((i & 2) != 0) {
                str2 = complete.sessionToken;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                transitionStatus = complete.transitionStatus;
            }
            TransitionStatus transitionStatus2 = transitionStatus;
            if ((i & 8) != 0) {
                str3 = complete.inquiryStatus;
            }
            String str5 = str3;
            if ((i & 16) != 0) {
                map = complete.fields;
            }
            return complete.h(str, str4, transitionStatus2, str5, map);
        }

        @Override
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.b(this.inquiryId, complete.inquiryId) && Intrinsics.b(this.sessionToken, complete.sessionToken) && Intrinsics.b(this.transitionStatus, complete.transitionStatus) && Intrinsics.b(this.inquiryStatus, complete.inquiryStatus) && Intrinsics.b(this.fields, complete.fields);
        }

        @NotNull
        public final Complete h(@NotNull String inquiryId, @NotNull String sessionToken, TransitionStatus transitionStatus, @NotNull String inquiryStatus, @NotNull Map<String, ? extends InquiryField> fields) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            return new Complete(inquiryId, sessionToken, transitionStatus, inquiryStatus, fields);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            return ((((iHashCode + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode();
        }

        @Override
        @NotNull
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override
        @NotNull
        public String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        public final Map<String, InquiryField> n() {
            return this.fields;
        }

        @NotNull
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        @NotNull
        public String toString() {
            return "Complete(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, flags);
            parcel.writeString(this.inquiryStatus);
            Map<String, InquiryField> map = this.fields;
            parcel.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        public Complete(@NotNull String str, @NotNull String str2, TransitionStatus transitionStatus, @NotNull String str3, @NotNull Map<String, ? extends InquiryField> map) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "inquiryId");
            Intrinsics.checkNotNullParameter(str2, "sessionToken");
            Intrinsics.checkNotNullParameter(str3, "inquiryStatus");
            Intrinsics.checkNotNullParameter(map, "fields");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.inquiryStatus = str3;
            this.fields = map;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0011R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "templateId", "templateVersion", "accountId", "environmentId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "p", "C", "q", "D", "h", "E", "i", "F", "o", "G", "Ljava/util/Map;", "n", "()Ljava/util/Map;", "H", "r", "I", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CreateInquiryFromTemplate extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<CreateInquiryFromTemplate> CREATOR = new a();

        private final String templateId;

        private final String templateVersion;

        private final String accountId;

        private final String environmentId;

        private final String referenceId;

        private final Map<String, InquiryField> fields;

        private final String themeSetId;

        private final StaticInquiryTemplate staticInquiryTemplate;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CreateInquiryFromTemplate> {
            @Override
            @NotNull
            public final CreateInquiryFromTemplate createFromParcel(@NotNull Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
                    }
                }
                return new CreateInquiryFromTemplate(string, string2, string3, string4, string5, linkedHashMap, parcel.readString(), parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final CreateInquiryFromTemplate[] newArray(int i) {
                return new CreateInquiryFromTemplate[i];
            }
        }

        public CreateInquiryFromTemplate(String str, String str2, String str3, String str4, String str5, Map<String, ? extends InquiryField> map, String str6, StaticInquiryTemplate staticInquiryTemplate) {
            super(null, null, null, null, null, null, null, 127, null);
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.environmentId = str4;
            this.referenceId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateInquiryFromTemplate)) {
                return false;
            }
            CreateInquiryFromTemplate createInquiryFromTemplate = (CreateInquiryFromTemplate) other;
            return Intrinsics.b(this.templateId, createInquiryFromTemplate.templateId) && Intrinsics.b(this.templateVersion, createInquiryFromTemplate.templateVersion) && Intrinsics.b(this.accountId, createInquiryFromTemplate.accountId) && Intrinsics.b(this.environmentId, createInquiryFromTemplate.environmentId) && Intrinsics.b(this.referenceId, createInquiryFromTemplate.referenceId) && Intrinsics.b(this.fields, createInquiryFromTemplate.fields) && Intrinsics.b(this.themeSetId, createInquiryFromTemplate.themeSetId) && Intrinsics.b(this.staticInquiryTemplate, createInquiryFromTemplate.staticInquiryTemplate);
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public int hashCode() {
            String str = this.templateId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.environmentId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.referenceId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, InquiryField> map = this.fields;
            int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            return iHashCode7 + (staticInquiryTemplate != null ? staticInquiryTemplate.hashCode() : 0);
        }

        public final String getEnvironmentId() {
            return this.environmentId;
        }

        public final Map<String, InquiryField> n() {
            return this.fields;
        }

        public final String getReferenceId() {
            return this.referenceId;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        public final String getThemeSetId() {
            return this.themeSetId;
        }

        @NotNull
        public String toString() {
            return "CreateInquiryFromTemplate(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", environmentId=" + this.environmentId + ", referenceId=" + this.referenceId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.templateId);
            parcel.writeString(this.templateVersion);
            parcel.writeString(this.accountId);
            parcel.writeString(this.environmentId);
            parcel.writeString(this.referenceId);
            Map<String, InquiryField> map = this.fields;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }
            parcel.writeString(this.themeSetId);
            parcel.writeParcelable(this.staticInquiryTemplate, flags);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "l", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CreateInquirySession extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<CreateInquirySession> CREATOR = new a();

        @NotNull
        private final String inquiryId;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CreateInquirySession> {
            @Override
            @NotNull
            public final CreateInquirySession createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateInquirySession(parcel.readString());
            }

            @Override
            @NotNull
            public final CreateInquirySession[] newArray(int i) {
                return new CreateInquirySession[i];
            }
        }

        public CreateInquirySession(@NotNull String str) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "inquiryId");
            this.inquiryId = str;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateInquirySession) && Intrinsics.b(this.inquiryId, ((CreateInquirySession) other).inquiryId);
        }

        public int hashCode() {
            return this.inquiryId.hashCode();
        }

        @Override
        @NotNull
        public String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        public String toString() {
            return "CreateInquirySession(inquiryId=" + this.inquiryId + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.inquiryId);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J|\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010*\u001a\u0004\bI\u0010\u0019¨\u0006J"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "LF8/B;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "documentStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "fromStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;)V", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "l", "C", "j", "D", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "d", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "r", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "F", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "G", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "o", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "H", "p", "I", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "q", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "J", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "K", "c", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class DocumentStepRunning extends InquiryState implements InterfaceC0336B {

        @NotNull
        public static final Parcelable.Creator<DocumentStepRunning> CREATOR = new a();

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String sessionToken;

        private final TransitionStatus transitionStatus;

        private final StepStyles.DocumentStepStyle styles;

        private final NextStep.CancelDialog cancelDialog;

        @NotNull
        private final NextStep.Document documentStep;

        @NotNull
        private final String fromComponent;

        @NotNull
        private final DocumentPages pages;

        private final NextStep.Document.AssetConfig assetConfig;

        @NotNull
        private final String fromStep;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DocumentStepRunning> {
            @Override
            @NotNull
            public final DocumentStepRunning createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepRunning(parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (StepStyles.DocumentStepStyle) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (DocumentPages) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString());
            }

            @Override
            @NotNull
            public final DocumentStepRunning[] newArray(int i) {
                return new DocumentStepRunning[i];
            }
        }

        public DocumentStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str3, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : transitionStatus, documentStepStyle, cancelDialog, document, str3, documentPages, assetConfig, str4);
        }

        public static DocumentStepRunning i(DocumentStepRunning documentStepRunning, String str, String str2, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str3, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str4, int i, Object obj) {
            return documentStepRunning.h((i & 1) != 0 ? documentStepRunning.inquiryId : str, (i & 2) != 0 ? documentStepRunning.sessionToken : str2, (i & 4) != 0 ? documentStepRunning.transitionStatus : transitionStatus, (i & 8) != 0 ? documentStepRunning.styles : documentStepStyle, (i & 16) != 0 ? documentStepRunning.cancelDialog : cancelDialog, (i & 32) != 0 ? documentStepRunning.documentStep : document, (i & 64) != 0 ? documentStepRunning.fromComponent : str3, (i & 128) != 0 ? documentStepRunning.pages : documentPages, (i & 256) != 0 ? documentStepRunning.assetConfig : assetConfig, (i & 512) != 0 ? documentStepRunning.fromStep : str4);
        }

        @Override
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override
        @NotNull
        public String getFromStep() {
            return this.fromStep;
        }

        @Override
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentStepRunning)) {
                return false;
            }
            DocumentStepRunning documentStepRunning = (DocumentStepRunning) other;
            return Intrinsics.b(this.inquiryId, documentStepRunning.inquiryId) && Intrinsics.b(this.sessionToken, documentStepRunning.sessionToken) && Intrinsics.b(this.transitionStatus, documentStepRunning.transitionStatus) && Intrinsics.b(this.styles, documentStepRunning.styles) && Intrinsics.b(this.cancelDialog, documentStepRunning.cancelDialog) && Intrinsics.b(this.documentStep, documentStepRunning.documentStep) && Intrinsics.b(this.fromComponent, documentStepRunning.fromComponent) && Intrinsics.b(this.pages, documentStepRunning.pages) && Intrinsics.b(this.assetConfig, documentStepRunning.assetConfig) && Intrinsics.b(this.fromStep, documentStepRunning.fromStep);
        }

        @NotNull
        public final DocumentStepRunning h(@NotNull String inquiryId, @NotNull String sessionToken, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle styles, NextStep.CancelDialog cancelDialog, @NotNull NextStep.Document documentStep, @NotNull String fromComponent, @NotNull DocumentPages pages, NextStep.Document.AssetConfig assetConfig, @NotNull String fromStep) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentStep, "documentStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            return new DocumentStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, documentStep, fromComponent, pages, assetConfig, fromStep);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode2 = (iHashCode + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.documentStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.pages.hashCode()) * 31;
            NextStep.Document.AssetConfig assetConfig = this.assetConfig;
            return ((iHashCode4 + (assetConfig != null ? assetConfig.hashCode() : 0)) * 31) + this.fromStep.hashCode();
        }

        @Override
        @NotNull
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override
        @NotNull
        public String getInquiryId() {
            return this.inquiryId;
        }

        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final NextStep.Document getDocumentStep() {
            return this.documentStep;
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        public final DocumentPages getPages() {
            return this.pages;
        }

        @Override
        public StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public String toString() {
            return "DocumentStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", documentStep=" + this.documentStep + ", fromComponent=" + this.fromComponent + ", pages=" + this.pages + ", assetConfig=" + this.assetConfig + ", fromStep=" + this.fromStep + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, flags);
            parcel.writeParcelable(this.styles, flags);
            parcel.writeParcelable(this.cancelDialog, flags);
            parcel.writeParcelable(this.documentStep, flags);
            parcel.writeString(this.fromComponent);
            parcel.writeParcelable(this.pages, flags);
            parcel.writeParcelable(this.assetConfig, flags);
            parcel.writeString(this.fromStep);
        }

        public DocumentStepRunning(@NotNull String str, @NotNull String str2, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, @NotNull NextStep.Document document, @NotNull String str3, @NotNull DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, @NotNull String str4) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "inquiryId");
            Intrinsics.checkNotNullParameter(str2, "sessionToken");
            Intrinsics.checkNotNullParameter(document, "documentStep");
            Intrinsics.checkNotNullParameter(str3, "fromComponent");
            Intrinsics.checkNotNullParameter(documentPages, "pages");
            Intrinsics.checkNotNullParameter(str4, "fromStep");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = documentStepStyle;
            this.cancelDialog = cancelDialog;
            this.documentStep = document;
            this.fromComponent = str3;
            this.pages = documentPages;
            this.assetConfig = assetConfig;
            this.fromStep = str4;
        }
    }

    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0012\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103JÔ\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00122\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00122\n\b\u0002\u00101\u001a\u0004\u0018\u000100HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b>\u00109J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u00107R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\bI\u00107R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bV\u0010F\u001a\u0004\bW\u00107R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\\\u0010F\u001a\u0004\bE\u00107R\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\b]\u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bb\u0010_\u001a\u0004\bc\u0010aR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bN\u0010fR\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bg\u0010Y\u001a\u0004\bJ\u0010[R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0006¢\u0006\f\n\u0004\bh\u0010Y\u001a\u0004\bi\u0010[R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bj\u0010\\\u001a\u0004\bH\u00109R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bk\u0010P\u001a\u0004\bR\u0010lR\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bm\u0010F\u001a\u0004\bn\u00107R\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bo\u0010F\u001a\u0004\bp\u00107R\u0017\u0010!\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bq\u0010_\u001a\u0004\b\\\u0010aR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r8\u0006¢\u0006\f\n\u0004\br\u0010Y\u001a\u0004\bs\u0010[R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r8\u0006¢\u0006\f\n\u0004\bt\u0010Y\u001a\u0004\bb\u0010[R\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bu\u0010F\u001a\u0004\bd\u00107R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b_\u0010~\u001a\u0004\bX\u0010\u007fR\u001a\u0010.\u001a\u00020-8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bV\u0010\u0082\u0001R\u0019\u0010/\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010_\u001a\u0005\b\u0084\u0001\u0010aR\u001d\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "LF8/B;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "enabledIdClasses", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "", "imageCaptureCount", "", "manualCaptureButtonDelayMs", "fieldKeyDocument", "fieldKeyIdClass", "shouldSkipReviewScreen", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoCaptureMethods", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;)V", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "l", "C", "j", "D", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "d", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "J", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "F", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "G", "s", "H", "Ljava/util/List;", "x", "()Ljava/util/List;", "I", "c", "K", "Z", "q", "()Z", "L", "r", "M", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "N", "O", "w", "P", "Q", "()J", "R", "y", "S", "z", "T", "U", "v", "V", "W", "X", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Y", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "p", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "a0", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "b0", "o", "c0", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "t", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class GovernmentIdStepRunning extends InquiryState implements InterfaceC0336B {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepRunning> CREATOR = new a();

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String sessionToken;

        private final TransitionStatus transitionStatus;

        private final StepStyles.GovernmentIdStepStyle styles;

        private final NextStep.CancelDialog cancelDialog;

        @NotNull
        private final String countryCode;

        @NotNull
        private final List<Id> enabledIdClasses;

        @NotNull
        private final String fromComponent;

        @NotNull
        private final String fromStep;

        private final boolean backStepEnabled;

        private final boolean cancelButtonEnabled;

        @NotNull
        private final NextStep.GovernmentId.Localizations localizations;

        private final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

        @NotNull
        private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        private final int imageCaptureCount;

        private final long manualCaptureButtonDelayMs;

        @NotNull
        private final String fieldKeyDocument;

        @NotNull
        private final String fieldKeyIdClass;

        private final boolean shouldSkipReviewScreen;

        @NotNull
        private final List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes;

        @NotNull
        private final List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods;

        private final String webRtcJwt;

        private final NextStep.GovernmentId.AssetConfig assetConfig;

        @NotNull
        private final AutoClassificationConfig autoClassificationConfig;

        @NotNull
        private final StyleElements.Axis reviewCaptureButtonsAxis;

        @NotNull
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        private final boolean audioEnabled;

        private final DigitalIdConfig digitalIdConfig;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdStepRunning> {
            @Override
            @NotNull
            public final GovernmentIdStepRunning createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                String string;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()));
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                NextStep.GovernmentId.Localizations localizations = (NextStep.GovernmentId.Localizations) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i3);
                    int i4 = 0;
                    while (i4 != i3) {
                        arrayList3.add(parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()));
                        i4++;
                        i3 = i3;
                    }
                    arrayList = arrayList3;
                }
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    arrayList4.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                    i6++;
                    i5 = i5;
                }
                int i7 = parcel.readInt();
                long j = parcel.readLong();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                int i10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i10);
                int i11 = 0;
                while (i11 != i10) {
                    arrayList5.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
                    i11++;
                    i10 = i10;
                }
                int i12 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i12);
                int i13 = 0;
                while (true) {
                    string = parcel.readString();
                    if (i13 == i12) {
                        break;
                    }
                    arrayList6.add(NextStep.GovernmentId.VideoCaptureMethod.valueOf(string));
                    i13++;
                    i12 = i12;
                }
                return new GovernmentIdStepRunning(string2, string3, transitionStatus, governmentIdStepStyle, cancelDialog, string4, arrayList2, string5, string6, z, z2, localizations, arrayList, arrayList4, i7, j, string7, string8, z3, arrayList5, arrayList6, string, (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()), (AutoClassificationConfig) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()), StyleElements.Axis.valueOf(parcel.readString()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0, (DigitalIdConfig) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final GovernmentIdStepRunning[] newArray(int i) {
                return new GovernmentIdStepRunning[i];
            }
        }

        public GovernmentIdStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str3, List list, String str4, String str5, boolean z, boolean z2, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i, long j, String str6, String str7, boolean z3, List list4, List list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z4, DigitalIdConfig digitalIdConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : transitionStatus, governmentIdStepStyle, cancelDialog, str3, list, str4, str5, z, z2, localizations, list2, list3, i, j, str6, str7, z3, list4, list5, str8, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, z4, digitalIdConfig);
        }

        public static GovernmentIdStepRunning i(GovernmentIdStepRunning governmentIdStepRunning, String str, String str2, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str3, List list, String str4, String str5, boolean z, boolean z2, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i, long j, String str6, String str7, boolean z3, List list4, List list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z4, DigitalIdConfig digitalIdConfig, int i2, Object obj) {
            return governmentIdStepRunning.h((i2 & 1) != 0 ? governmentIdStepRunning.inquiryId : str, (i2 & 2) != 0 ? governmentIdStepRunning.sessionToken : str2, (i2 & 4) != 0 ? governmentIdStepRunning.transitionStatus : transitionStatus, (i2 & 8) != 0 ? governmentIdStepRunning.styles : governmentIdStepStyle, (i2 & 16) != 0 ? governmentIdStepRunning.cancelDialog : cancelDialog, (i2 & 32) != 0 ? governmentIdStepRunning.countryCode : str3, (i2 & 64) != 0 ? governmentIdStepRunning.enabledIdClasses : list, (i2 & 128) != 0 ? governmentIdStepRunning.fromComponent : str4, (i2 & 256) != 0 ? governmentIdStepRunning.fromStep : str5, (i2 & 512) != 0 ? governmentIdStepRunning.backStepEnabled : z, (i2 & 1024) != 0 ? governmentIdStepRunning.cancelButtonEnabled : z2, (i2 & 2048) != 0 ? governmentIdStepRunning.localizations : localizations, (i2 & 4096) != 0 ? governmentIdStepRunning.localizationOverrides : list2, (i2 & 8192) != 0 ? governmentIdStepRunning.enabledCaptureOptionsNativeMobile : list3, (i2 & 16384) != 0 ? governmentIdStepRunning.imageCaptureCount : i, (i2 & 32768) != 0 ? governmentIdStepRunning.manualCaptureButtonDelayMs : j, (i2 & 65536) != 0 ? governmentIdStepRunning.fieldKeyDocument : str6, (131072 & i2) != 0 ? governmentIdStepRunning.fieldKeyIdClass : str7, (i2 & 262144) != 0 ? governmentIdStepRunning.shouldSkipReviewScreen : z3, (i2 & 524288) != 0 ? governmentIdStepRunning.enabledCaptureFileTypes : list4, (i2 & 1048576) != 0 ? governmentIdStepRunning.videoCaptureMethods : list5, (i2 & 2097152) != 0 ? governmentIdStepRunning.webRtcJwt : str8, (i2 & 4194304) != 0 ? governmentIdStepRunning.assetConfig : assetConfig, (i2 & 8388608) != 0 ? governmentIdStepRunning.autoClassificationConfig : autoClassificationConfig, (i2 & 16777216) != 0 ? governmentIdStepRunning.reviewCaptureButtonsAxis : axis, (i2 & 33554432) != 0 ? governmentIdStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition, (i2 & 67108864) != 0 ? governmentIdStepRunning.audioEnabled : z4, (i2 & 134217728) != 0 ? governmentIdStepRunning.digitalIdConfig : digitalIdConfig);
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        public final List<NextStep.GovernmentId.LocalizationOverride> D() {
            return this.localizationOverrides;
        }

        @NotNull
        public final NextStep.GovernmentId.Localizations getLocalizations() {
            return this.localizations;
        }

        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        @NotNull
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        @Override
        public StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final List<NextStep.GovernmentId.VideoCaptureMethod> L() {
            return this.videoCaptureMethods;
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override
        @NotNull
        public String getFromStep() {
            return this.fromStep;
        }

        @Override
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdStepRunning)) {
                return false;
            }
            GovernmentIdStepRunning governmentIdStepRunning = (GovernmentIdStepRunning) other;
            return Intrinsics.b(this.inquiryId, governmentIdStepRunning.inquiryId) && Intrinsics.b(this.sessionToken, governmentIdStepRunning.sessionToken) && Intrinsics.b(this.transitionStatus, governmentIdStepRunning.transitionStatus) && Intrinsics.b(this.styles, governmentIdStepRunning.styles) && Intrinsics.b(this.cancelDialog, governmentIdStepRunning.cancelDialog) && Intrinsics.b(this.countryCode, governmentIdStepRunning.countryCode) && Intrinsics.b(this.enabledIdClasses, governmentIdStepRunning.enabledIdClasses) && Intrinsics.b(this.fromComponent, governmentIdStepRunning.fromComponent) && Intrinsics.b(this.fromStep, governmentIdStepRunning.fromStep) && this.backStepEnabled == governmentIdStepRunning.backStepEnabled && this.cancelButtonEnabled == governmentIdStepRunning.cancelButtonEnabled && Intrinsics.b(this.localizations, governmentIdStepRunning.localizations) && Intrinsics.b(this.localizationOverrides, governmentIdStepRunning.localizationOverrides) && Intrinsics.b(this.enabledCaptureOptionsNativeMobile, governmentIdStepRunning.enabledCaptureOptionsNativeMobile) && this.imageCaptureCount == governmentIdStepRunning.imageCaptureCount && this.manualCaptureButtonDelayMs == governmentIdStepRunning.manualCaptureButtonDelayMs && Intrinsics.b(this.fieldKeyDocument, governmentIdStepRunning.fieldKeyDocument) && Intrinsics.b(this.fieldKeyIdClass, governmentIdStepRunning.fieldKeyIdClass) && this.shouldSkipReviewScreen == governmentIdStepRunning.shouldSkipReviewScreen && Intrinsics.b(this.enabledCaptureFileTypes, governmentIdStepRunning.enabledCaptureFileTypes) && Intrinsics.b(this.videoCaptureMethods, governmentIdStepRunning.videoCaptureMethods) && Intrinsics.b(this.webRtcJwt, governmentIdStepRunning.webRtcJwt) && Intrinsics.b(this.assetConfig, governmentIdStepRunning.assetConfig) && Intrinsics.b(this.autoClassificationConfig, governmentIdStepRunning.autoClassificationConfig) && this.reviewCaptureButtonsAxis == governmentIdStepRunning.reviewCaptureButtonsAxis && this.pendingPageTextVerticalPosition == governmentIdStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == governmentIdStepRunning.audioEnabled && Intrinsics.b(this.digitalIdConfig, governmentIdStepRunning.digitalIdConfig);
        }

        @NotNull
        public final GovernmentIdStepRunning h(@NotNull String inquiryId, @NotNull String sessionToken, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle styles, NextStep.CancelDialog cancelDialog, @NotNull String countryCode, @NotNull List<Id> enabledIdClasses, @NotNull String fromComponent, @NotNull String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull NextStep.GovernmentId.Localizations localizations, List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int imageCaptureCount, long manualCaptureButtonDelayMs, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, boolean shouldSkipReviewScreen, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, String webRtcJwt, NextStep.GovernmentId.AssetConfig assetConfig, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, DigitalIdConfig digitalIdConfig) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            return new GovernmentIdStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, countryCode, enabledIdClasses, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, localizations, localizationOverrides, enabledCaptureOptionsNativeMobile, imageCaptureCount, manualCaptureButtonDelayMs, fieldKeyDocument, fieldKeyIdClass, shouldSkipReviewScreen, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, assetConfig, autoClassificationConfig, reviewCaptureButtonsAxis, pendingPageTextVerticalPosition, audioEnabled, digitalIdConfig);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode2 = (iHashCode + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((((((((((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.countryCode.hashCode()) * 31) + this.enabledIdClasses.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.localizations.hashCode()) * 31;
            List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
            int iHashCode5 = (((((((((((((((((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + this.enabledCaptureOptionsNativeMobile.hashCode()) * 31) + Integer.hashCode(this.imageCaptureCount)) * 31) + Long.hashCode(this.manualCaptureButtonDelayMs)) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode()) * 31) + Boolean.hashCode(this.shouldSkipReviewScreen)) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            String str = this.webRtcJwt;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            NextStep.GovernmentId.AssetConfig assetConfig = this.assetConfig;
            int iHashCode7 = (((((((((iHashCode6 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31) + this.autoClassificationConfig.hashCode()) * 31) + this.reviewCaptureButtonsAxis.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31;
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            return iHashCode7 + (digitalIdConfig != null ? digitalIdConfig.hashCode() : 0);
        }

        @Override
        @NotNull
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override
        @NotNull
        public String getInquiryId() {
            return this.inquiryId;
        }

        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        @NotNull
        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final DigitalIdConfig getDigitalIdConfig() {
            return this.digitalIdConfig;
        }

        @NotNull
        public String toString() {
            return "GovernmentIdStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", countryCode=" + this.countryCode + ", enabledIdClasses=" + this.enabledIdClasses + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", localizations=" + this.localizations + ", localizationOverrides=" + this.localizationOverrides + ", enabledCaptureOptionsNativeMobile=" + this.enabledCaptureOptionsNativeMobile + ", imageCaptureCount=" + this.imageCaptureCount + ", manualCaptureButtonDelayMs=" + this.manualCaptureButtonDelayMs + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ", shouldSkipReviewScreen=" + this.shouldSkipReviewScreen + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", assetConfig=" + this.assetConfig + ", autoClassificationConfig=" + this.autoClassificationConfig + ", reviewCaptureButtonsAxis=" + this.reviewCaptureButtonsAxis + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", digitalIdConfig=" + this.digitalIdConfig + ")";
        }

        @NotNull
        public final List<NextStep.GovernmentId.CaptureFileType> v() {
            return this.enabledCaptureFileTypes;
        }

        @NotNull
        public final List<CaptureOptionNativeMobile> w() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, flags);
            parcel.writeParcelable(this.styles, flags);
            parcel.writeParcelable(this.cancelDialog, flags);
            parcel.writeString(this.countryCode);
            List<Id> list = this.enabledIdClasses;
            parcel.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeString(this.fromComponent);
            parcel.writeString(this.fromStep);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeParcelable(this.localizations, flags);
            List<NextStep.GovernmentId.LocalizationOverride> list2 = this.localizationOverrides;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<NextStep.GovernmentId.LocalizationOverride> it2 = list2.iterator();
                while (it2.hasNext()) {
                    parcel.writeParcelable(it2.next(), flags);
                }
            }
            List<CaptureOptionNativeMobile> list3 = this.enabledCaptureOptionsNativeMobile;
            parcel.writeInt(list3.size());
            Iterator<CaptureOptionNativeMobile> it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeString(it3.next().name());
            }
            parcel.writeInt(this.imageCaptureCount);
            parcel.writeLong(this.manualCaptureButtonDelayMs);
            parcel.writeString(this.fieldKeyDocument);
            parcel.writeString(this.fieldKeyIdClass);
            parcel.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            List<NextStep.GovernmentId.CaptureFileType> list4 = this.enabledCaptureFileTypes;
            parcel.writeInt(list4.size());
            Iterator<NextStep.GovernmentId.CaptureFileType> it4 = list4.iterator();
            while (it4.hasNext()) {
                parcel.writeString(it4.next().name());
            }
            List<NextStep.GovernmentId.VideoCaptureMethod> list5 = this.videoCaptureMethods;
            parcel.writeInt(list5.size());
            Iterator<NextStep.GovernmentId.VideoCaptureMethod> it5 = list5.iterator();
            while (it5.hasNext()) {
                parcel.writeString(it5.next().name());
            }
            parcel.writeString(this.webRtcJwt);
            parcel.writeParcelable(this.assetConfig, flags);
            parcel.writeParcelable(this.autoClassificationConfig, flags);
            parcel.writeString(this.reviewCaptureButtonsAxis.name());
            parcel.writeString(this.pendingPageTextVerticalPosition.name());
            parcel.writeInt(this.audioEnabled ? 1 : 0);
            parcel.writeParcelable(this.digitalIdConfig, flags);
        }

        @NotNull
        public final List<Id> x() {
            return this.enabledIdClasses;
        }

        @NotNull
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        public GovernmentIdStepRunning(@NotNull String str, @NotNull String str2, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, @NotNull String str3, @NotNull List<Id> list, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, @NotNull NextStep.GovernmentId.Localizations localizations, List<NextStep.GovernmentId.LocalizationOverride> list2, @NotNull List<? extends CaptureOptionNativeMobile> list3, int i, long j, @NotNull String str6, @NotNull String str7, boolean z3, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> list4, @NotNull List<? extends NextStep.GovernmentId.VideoCaptureMethod> list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis axis, @NotNull PendingPageTextPosition pendingPageTextPosition, boolean z4, DigitalIdConfig digitalIdConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "inquiryId");
            Intrinsics.checkNotNullParameter(str2, "sessionToken");
            Intrinsics.checkNotNullParameter(str3, "countryCode");
            Intrinsics.checkNotNullParameter(list, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(str4, "fromComponent");
            Intrinsics.checkNotNullParameter(str5, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(list3, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(str6, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(str7, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(list4, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(list5, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(axis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = governmentIdStepStyle;
            this.cancelDialog = cancelDialog;
            this.countryCode = str3;
            this.enabledIdClasses = list;
            this.fromComponent = str4;
            this.fromStep = str5;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.localizations = localizations;
            this.localizationOverrides = list2;
            this.enabledCaptureOptionsNativeMobile = list3;
            this.imageCaptureCount = i;
            this.manualCaptureButtonDelayMs = j;
            this.fieldKeyDocument = str6;
            this.fieldKeyIdClass = str7;
            this.shouldSkipReviewScreen = z3;
            this.enabledCaptureFileTypes = list4;
            this.videoCaptureMethods = list5;
            this.webRtcJwt = str8;
            this.assetConfig = assetConfig;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = axis;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.audioEnabled = z4;
            this.digitalIdConfig = digitalIdConfig;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "fallbackInquiryId", "fallbackSessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "h", "C", "i", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ResumeFallbackInquiry extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ResumeFallbackInquiry> CREATOR = new a();

        @NotNull
        private final String fallbackInquiryId;

        @NotNull
        private final String fallbackSessionToken;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ResumeFallbackInquiry> {
            @Override
            @NotNull
            public final ResumeFallbackInquiry createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResumeFallbackInquiry(parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final ResumeFallbackInquiry[] newArray(int i) {
                return new ResumeFallbackInquiry[i];
            }
        }

        public ResumeFallbackInquiry(@NotNull String str, @NotNull String str2) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "fallbackInquiryId");
            Intrinsics.checkNotNullParameter(str2, "fallbackSessionToken");
            this.fallbackInquiryId = str;
            this.fallbackSessionToken = str2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResumeFallbackInquiry)) {
                return false;
            }
            ResumeFallbackInquiry resumeFallbackInquiry = (ResumeFallbackInquiry) other;
            return Intrinsics.b(this.fallbackInquiryId, resumeFallbackInquiry.fallbackInquiryId) && Intrinsics.b(this.fallbackSessionToken, resumeFallbackInquiry.fallbackSessionToken);
        }

        @NotNull
        public final String getFallbackInquiryId() {
            return this.fallbackInquiryId;
        }

        public int hashCode() {
            return (this.fallbackInquiryId.hashCode() * 31) + this.fallbackSessionToken.hashCode();
        }

        @NotNull
        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        @NotNull
        public String toString() {
            return "ResumeFallbackInquiry(fallbackInquiryId=" + this.fallbackInquiryId + ", fallbackSessionToken=" + this.fallbackSessionToken + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.fallbackInquiryId);
            parcel.writeString(this.fallbackSessionToken);
        }
    }

    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0018\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u008a\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00182\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020%HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020-HÖ\u0001¢\u0006\u0004\b4\u0010/J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020-HÖ\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010,R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b@\u0010FR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b;\u0010MR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bN\u0010<\u001a\u0004\bO\u0010,R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010,R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bX\u0010<\u001a\u0004\bY\u0010,R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\\\u0010S\u001a\u0004\b>\u0010UR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0006¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bD\u0010dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bj\u0010<\u001a\u0004\bG\u0010,R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bk\u0010b\u001a\u0004\bl\u0010dR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bq\u0010S\u001a\u0004\br\u0010UR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006w"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "LF8/B;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "selfieType", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "localizations", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "l", "C", "j", "D", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "d", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "F", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "G", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "H", "t", "I", "c", "J", "Z", "p", "()Z", "K", "q", "L", "s", "M", "z", "N", "O", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "v", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "P", "Ljava/util/List;", "r", "()Ljava/util/List;", "Q", "R", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "S", "T", "w", "U", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "V", "o", "W", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "y", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SelfieStepRunning extends InquiryState implements InterfaceC0336B {

        @NotNull
        public static final Parcelable.Creator<SelfieStepRunning> CREATOR = new a();

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String sessionToken;

        private final TransitionStatus transitionStatus;

        private final StepStyles.SelfieStepStyle styles;

        private final NextStep.CancelDialog cancelDialog;

        @NotNull
        private final NextStep.Selfie.CaptureMethod selfieType;

        @NotNull
        private final String fromComponent;

        @NotNull
        private final String fromStep;

        private final boolean backStepEnabled;

        private final boolean cancelButtonEnabled;

        @NotNull
        private final String fieldKeySelfie;

        private final boolean requireStrictSelfieCapture;

        private final boolean skipPromptPage;

        @NotNull
        private final NextStep.Selfie.Localizations localizations;

        @NotNull
        private final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;

        @NotNull
        private final List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods;

        private final NextStep.Selfie.AssetConfig assetConfig;

        private final String webRtcJwt;

        private final List<NextStep.Selfie.SelfiePose> orderedPoses;

        @NotNull
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        private final boolean audioEnabled;

        @NotNull
        private final PoseConfigs poseConfigs;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieStepRunning> {
            @Override
            @NotNull
            public final SelfieStepRunning createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                StepStyles.SelfieStepStyle selfieStepStyle = (StepStyles.SelfieStepStyle) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.Selfie.CaptureMethod captureMethodValueOf = NextStep.Selfie.CaptureMethod.valueOf(parcel.readString());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                NextStep.Selfie.Localizations localizations = (NextStep.Selfie.Localizations) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                int i4 = 0;
                while (i4 != i3) {
                    arrayList4.add(NextStep.Selfie.VideoCaptureMethod.valueOf(parcel.readString()));
                    i4++;
                    i3 = i3;
                }
                NextStep.Selfie.AssetConfig assetConfig = (NextStep.Selfie.AssetConfig) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                    arrayList = arrayList4;
                } else {
                    int i5 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(i5);
                    arrayList = arrayList4;
                    int i6 = 0;
                    while (i6 != i5) {
                        arrayList5.add(NextStep.Selfie.SelfiePose.valueOf(parcel.readString()));
                        i6++;
                        i5 = i5;
                    }
                    arrayList2 = arrayList5;
                }
                return new SelfieStepRunning(string, string2, transitionStatus, selfieStepStyle, cancelDialog, captureMethodValueOf, string3, string4, z, z2, string5, z3, z4, localizations, arrayList3, arrayList, assetConfig, string6, arrayList2, PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0, (PoseConfigs) parcel.readParcelable(SelfieStepRunning.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final SelfieStepRunning[] newArray(int i) {
                return new SelfieStepRunning[i];
            }
        }

        public SelfieStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List list3, PendingPageTextPosition pendingPageTextPosition, boolean z5, PoseConfigs poseConfigs, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : transitionStatus, selfieStepStyle, cancelDialog, captureMethod, str3, str4, z, z2, str5, z3, z4, localizations, list, list2, assetConfig, str6, list3, pendingPageTextPosition, z5, poseConfigs);
        }

        public static SelfieStepRunning i(SelfieStepRunning selfieStepRunning, String str, String str2, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List list3, PendingPageTextPosition pendingPageTextPosition, boolean z5, PoseConfigs poseConfigs, int i, Object obj) {
            return selfieStepRunning.h((i & 1) != 0 ? selfieStepRunning.inquiryId : str, (i & 2) != 0 ? selfieStepRunning.sessionToken : str2, (i & 4) != 0 ? selfieStepRunning.transitionStatus : transitionStatus, (i & 8) != 0 ? selfieStepRunning.styles : selfieStepStyle, (i & 16) != 0 ? selfieStepRunning.cancelDialog : cancelDialog, (i & 32) != 0 ? selfieStepRunning.selfieType : captureMethod, (i & 64) != 0 ? selfieStepRunning.fromComponent : str3, (i & 128) != 0 ? selfieStepRunning.fromStep : str4, (i & 256) != 0 ? selfieStepRunning.backStepEnabled : z, (i & 512) != 0 ? selfieStepRunning.cancelButtonEnabled : z2, (i & 1024) != 0 ? selfieStepRunning.fieldKeySelfie : str5, (i & 2048) != 0 ? selfieStepRunning.requireStrictSelfieCapture : z3, (i & 4096) != 0 ? selfieStepRunning.skipPromptPage : z4, (i & 8192) != 0 ? selfieStepRunning.localizations : localizations, (i & 16384) != 0 ? selfieStepRunning.enabledCaptureFileTypes : list, (i & 32768) != 0 ? selfieStepRunning.videoCaptureMethods : list2, (i & 65536) != 0 ? selfieStepRunning.assetConfig : assetConfig, (i & 131072) != 0 ? selfieStepRunning.webRtcJwt : str6, (i & 262144) != 0 ? selfieStepRunning.orderedPoses : list3, (i & 524288) != 0 ? selfieStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition, (i & 1048576) != 0 ? selfieStepRunning.audioEnabled : z5, (i & 2097152) != 0 ? selfieStepRunning.poseConfigs : poseConfigs);
        }

        @NotNull
        public final NextStep.Selfie.CaptureMethod getSelfieType() {
            return this.selfieType;
        }

        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        @Override
        public StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final List<NextStep.Selfie.VideoCaptureMethod> E() {
            return this.videoCaptureMethods;
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override
        @NotNull
        public String getFromStep() {
            return this.fromStep;
        }

        @Override
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieStepRunning)) {
                return false;
            }
            SelfieStepRunning selfieStepRunning = (SelfieStepRunning) other;
            return Intrinsics.b(this.inquiryId, selfieStepRunning.inquiryId) && Intrinsics.b(this.sessionToken, selfieStepRunning.sessionToken) && Intrinsics.b(this.transitionStatus, selfieStepRunning.transitionStatus) && Intrinsics.b(this.styles, selfieStepRunning.styles) && Intrinsics.b(this.cancelDialog, selfieStepRunning.cancelDialog) && this.selfieType == selfieStepRunning.selfieType && Intrinsics.b(this.fromComponent, selfieStepRunning.fromComponent) && Intrinsics.b(this.fromStep, selfieStepRunning.fromStep) && this.backStepEnabled == selfieStepRunning.backStepEnabled && this.cancelButtonEnabled == selfieStepRunning.cancelButtonEnabled && Intrinsics.b(this.fieldKeySelfie, selfieStepRunning.fieldKeySelfie) && this.requireStrictSelfieCapture == selfieStepRunning.requireStrictSelfieCapture && this.skipPromptPage == selfieStepRunning.skipPromptPage && Intrinsics.b(this.localizations, selfieStepRunning.localizations) && Intrinsics.b(this.enabledCaptureFileTypes, selfieStepRunning.enabledCaptureFileTypes) && Intrinsics.b(this.videoCaptureMethods, selfieStepRunning.videoCaptureMethods) && Intrinsics.b(this.assetConfig, selfieStepRunning.assetConfig) && Intrinsics.b(this.webRtcJwt, selfieStepRunning.webRtcJwt) && Intrinsics.b(this.orderedPoses, selfieStepRunning.orderedPoses) && this.pendingPageTextVerticalPosition == selfieStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == selfieStepRunning.audioEnabled && Intrinsics.b(this.poseConfigs, selfieStepRunning.poseConfigs);
        }

        @NotNull
        public final SelfieStepRunning h(@NotNull String inquiryId, @NotNull String sessionToken, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle styles, NextStep.CancelDialog cancelDialog, @NotNull NextStep.Selfie.CaptureMethod selfieType, @NotNull String fromComponent, @NotNull String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull String fieldKeySelfie, boolean requireStrictSelfieCapture, boolean skipPromptPage, @NotNull NextStep.Selfie.Localizations localizations, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, NextStep.Selfie.AssetConfig assetConfig, String webRtcJwt, List<? extends NextStep.Selfie.SelfiePose> orderedPoses, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, @NotNull PoseConfigs poseConfigs) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new SelfieStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, selfieType, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, localizations, enabledCaptureFileTypes, videoCaptureMethods, assetConfig, webRtcJwt, orderedPoses, pendingPageTextVerticalPosition, audioEnabled, poseConfigs);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode2 = (iHashCode + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((((((((((((((((((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.selfieType.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.localizations.hashCode()) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            NextStep.Selfie.AssetConfig assetConfig = this.assetConfig;
            int iHashCode5 = (iHashCode4 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            List<NextStep.Selfie.SelfiePose> list = this.orderedPoses;
            return ((((((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        @NotNull
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override
        @NotNull
        public String getInquiryId() {
            return this.inquiryId;
        }

        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public final List<NextStep.Selfie.CaptureFileType> r() {
            return this.enabledCaptureFileTypes;
        }

        @NotNull
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        public String toString() {
            return "SelfieStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", selfieType=" + this.selfieType + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", localizations=" + this.localizations + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", assetConfig=" + this.assetConfig + ", webRtcJwt=" + this.webRtcJwt + ", orderedPoses=" + this.orderedPoses + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @NotNull
        public final NextStep.Selfie.Localizations getLocalizations() {
            return this.localizations;
        }

        public final List<NextStep.Selfie.SelfiePose> w() {
            return this.orderedPoses;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, flags);
            parcel.writeParcelable(this.styles, flags);
            parcel.writeParcelable(this.cancelDialog, flags);
            parcel.writeString(this.selfieType.name());
            parcel.writeString(this.fromComponent);
            parcel.writeString(this.fromStep);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeString(this.fieldKeySelfie);
            parcel.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            parcel.writeInt(this.skipPromptPage ? 1 : 0);
            parcel.writeParcelable(this.localizations, flags);
            List<NextStep.Selfie.CaptureFileType> list = this.enabledCaptureFileTypes;
            parcel.writeInt(list.size());
            Iterator<NextStep.Selfie.CaptureFileType> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            List<NextStep.Selfie.VideoCaptureMethod> list2 = this.videoCaptureMethods;
            parcel.writeInt(list2.size());
            Iterator<NextStep.Selfie.VideoCaptureMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().name());
            }
            parcel.writeParcelable(this.assetConfig, flags);
            parcel.writeString(this.webRtcJwt);
            List<NextStep.Selfie.SelfiePose> list3 = this.orderedPoses;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list3.size());
                Iterator<NextStep.Selfie.SelfiePose> it3 = list3.iterator();
                while (it3.hasNext()) {
                    parcel.writeString(it3.next().name());
                }
            }
            parcel.writeString(this.pendingPageTextVerticalPosition.name());
            parcel.writeInt(this.audioEnabled ? 1 : 0);
            parcel.writeParcelable(this.poseConfigs, flags);
        }

        @NotNull
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        public SelfieStepRunning(@NotNull String str, @NotNull String str2, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, @NotNull NextStep.Selfie.CaptureMethod captureMethod, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, boolean z3, boolean z4, @NotNull NextStep.Selfie.Localizations localizations, @NotNull List<? extends NextStep.Selfie.CaptureFileType> list, @NotNull List<? extends NextStep.Selfie.VideoCaptureMethod> list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List<? extends NextStep.Selfie.SelfiePose> list3, @NotNull PendingPageTextPosition pendingPageTextPosition, boolean z5, @NotNull PoseConfigs poseConfigs) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "inquiryId");
            Intrinsics.checkNotNullParameter(str2, "sessionToken");
            Intrinsics.checkNotNullParameter(captureMethod, "selfieType");
            Intrinsics.checkNotNullParameter(str3, "fromComponent");
            Intrinsics.checkNotNullParameter(str4, "fromStep");
            Intrinsics.checkNotNullParameter(str5, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(list, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(list2, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = selfieStepStyle;
            this.cancelDialog = cancelDialog;
            this.selfieType = captureMethod;
            this.fromComponent = str3;
            this.fromStep = str4;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.fieldKeySelfie = str5;
            this.requireStrictSelfieCapture = z3;
            this.skipPromptPage = z4;
            this.localizations = localizations;
            this.enabledCaptureFileTypes = list;
            this.videoCaptureMethods = list2;
            this.assetConfig = assetConfig;
            this.webRtcJwt = str6;
            this.orderedPoses = list3;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.audioEnabled = z5;
            this.poseConfigs = poseConfigs;
        }
    }

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¹\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"JÞ\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00032\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010&R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u0010&R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bM\u0010&R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bY\u0010UR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b^\u00106\u001a\u0004\b_\u0010&R\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b`\u0010O\u001a\u0004\ba\u0010QR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010&¨\u0006l"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "LF8/B;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "localizations", "inquiryStatus", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "clientSideKey", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "serverComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "l", "C", "j", "D", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "d", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "F", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "G", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "t", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "H", "s", "I", "w", "J", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "K", "Z", "n", "()Z", "L", "o", "M", "r", "N", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "O", "p", "P", "v", "Q", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "x", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "R", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "c", "fromStep", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class UiStepRunning extends InquiryState implements InterfaceC0336B {

        @NotNull
        public static final Parcelable.Creator<UiStepRunning> CREATOR = new a();

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String sessionToken;

        private final TransitionStatus transitionStatus;

        private final StepStyles.UiStepStyle styles;

        private final NextStep.CancelDialog cancelDialog;

        private final NextStep.Ui.Localizations localizations;

        @NotNull
        private final String inquiryStatus;

        @NotNull
        private final String stepName;

        @NotNull
        private final List<UiComponentConfig> components;

        private final boolean backStepEnabled;

        private final boolean cancelButtonEnabled;

        private final boolean finalStep;

        @NotNull
        private final Map<String, InquiryField> fields;

        @NotNull
        private final String clientSideKey;

        private final List<UiComponentError> serverComponentErrors;

        private final InternalErrorInfo transitionError;

        @NotNull
        private final InquirySessionConfig inquirySessionConfig;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UiStepRunning> {
            @Override
            @NotNull
            public final UiStepRunning createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.Ui.Localizations localizations = (NextStep.Ui.Localizations) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                }
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                int i4 = 0;
                while (i4 != i3) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    i4++;
                    i3 = i3;
                    z2 = z2;
                }
                boolean z4 = z2;
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i5 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i5);
                    int i6 = 0;
                    while (i6 != i5) {
                        arrayList3.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                        i6++;
                        i5 = i5;
                    }
                    arrayList = arrayList3;
                }
                return new UiStepRunning(string, string2, transitionStatus, uiStepStyle, cancelDialog, localizations, string3, string4, arrayList2, z, z4, z3, linkedHashMap, string5, arrayList, (InternalErrorInfo) parcel.readParcelable(UiStepRunning.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(UiStepRunning.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final UiStepRunning[] newArray(int i) {
                return new UiStepRunning[i];
            }
        }

        public UiStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String str3, String str4, List list, boolean z, boolean z2, boolean z3, Map map, String str5, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : transitionStatus, uiStepStyle, cancelDialog, localizations, str3, str4, list, z, z2, z3, map, str5, list2, (i & 32768) != 0 ? null : internalErrorInfo, (i & 65536) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        public static UiStepRunning i(UiStepRunning uiStepRunning, String str, String str2, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String str3, String str4, List list, boolean z, boolean z2, boolean z3, Map map, String str5, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, int i, Object obj) {
            return uiStepRunning.h((i & 1) != 0 ? uiStepRunning.inquiryId : str, (i & 2) != 0 ? uiStepRunning.sessionToken : str2, (i & 4) != 0 ? uiStepRunning.transitionStatus : transitionStatus, (i & 8) != 0 ? uiStepRunning.styles : uiStepStyle, (i & 16) != 0 ? uiStepRunning.cancelDialog : cancelDialog, (i & 32) != 0 ? uiStepRunning.localizations : localizations, (i & 64) != 0 ? uiStepRunning.inquiryStatus : str3, (i & 128) != 0 ? uiStepRunning.stepName : str4, (i & 256) != 0 ? uiStepRunning.components : list, (i & 512) != 0 ? uiStepRunning.backStepEnabled : z, (i & 1024) != 0 ? uiStepRunning.cancelButtonEnabled : z2, (i & 2048) != 0 ? uiStepRunning.finalStep : z3, (i & 4096) != 0 ? uiStepRunning.fields : map, (i & 8192) != 0 ? uiStepRunning.clientSideKey : str5, (i & 16384) != 0 ? uiStepRunning.serverComponentErrors : list2, (i & 32768) != 0 ? uiStepRunning.transitionError : internalErrorInfo, (i & 65536) != 0 ? uiStepRunning.inquirySessionConfig : inquirySessionConfig);
        }

        @Override
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override
        @NotNull
        public String getFromStep() {
            return this.stepName;
        }

        @Override
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepRunning)) {
                return false;
            }
            UiStepRunning uiStepRunning = (UiStepRunning) other;
            return Intrinsics.b(this.inquiryId, uiStepRunning.inquiryId) && Intrinsics.b(this.sessionToken, uiStepRunning.sessionToken) && Intrinsics.b(this.transitionStatus, uiStepRunning.transitionStatus) && Intrinsics.b(this.styles, uiStepRunning.styles) && Intrinsics.b(this.cancelDialog, uiStepRunning.cancelDialog) && Intrinsics.b(this.localizations, uiStepRunning.localizations) && Intrinsics.b(this.inquiryStatus, uiStepRunning.inquiryStatus) && Intrinsics.b(this.stepName, uiStepRunning.stepName) && Intrinsics.b(this.components, uiStepRunning.components) && this.backStepEnabled == uiStepRunning.backStepEnabled && this.cancelButtonEnabled == uiStepRunning.cancelButtonEnabled && this.finalStep == uiStepRunning.finalStep && Intrinsics.b(this.fields, uiStepRunning.fields) && Intrinsics.b(this.clientSideKey, uiStepRunning.clientSideKey) && Intrinsics.b(this.serverComponentErrors, uiStepRunning.serverComponentErrors) && Intrinsics.b(this.transitionError, uiStepRunning.transitionError) && Intrinsics.b(this.inquirySessionConfig, uiStepRunning.inquirySessionConfig);
        }

        @NotNull
        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        @NotNull
        public final UiStepRunning h(@NotNull String inquiryId, @NotNull String sessionToken, TransitionStatus transitionStatus, StepStyles.UiStepStyle styles, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, @NotNull List<? extends UiComponentConfig> components, boolean backStepEnabled, boolean cancelButtonEnabled, boolean finalStep, @NotNull Map<String, ? extends InquiryField> fields, @NotNull String clientSideKey, List<? extends UiComponentError> serverComponentErrors, InternalErrorInfo transitionError, @NotNull InquirySessionConfig inquirySessionConfig) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new UiStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, localizations, inquiryStatus, stepName, components, backStepEnabled, cancelButtonEnabled, finalStep, fields, clientSideKey, serverComponentErrors, transitionError, inquirySessionConfig);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode2 = (iHashCode + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            NextStep.Ui.Localizations localizations = this.localizations;
            int iHashCode5 = (((((((((((((((((iHashCode4 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31) + this.components.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31) + this.fields.hashCode()) * 31) + this.clientSideKey.hashCode()) * 31;
            List<UiComponentError> list = this.serverComponentErrors;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return ((iHashCode6 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0)) * 31) + this.inquirySessionConfig.hashCode();
        }

        @Override
        @NotNull
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override
        @NotNull
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override
        @NotNull
        public String getInquiryId() {
            return this.inquiryId;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public final String getClientSideKey() {
            return this.clientSideKey;
        }

        @NotNull
        public final Map<String, InquiryField> q() {
            return this.fields;
        }

        public final boolean getFinalStep() {
            return this.finalStep;
        }

        @NotNull
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        public final NextStep.Ui.Localizations getLocalizations() {
            return this.localizations;
        }

        @NotNull
        public String toString() {
            return "UiStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", components=" + this.components + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", fields=" + this.fields + ", clientSideKey=" + this.clientSideKey + ", serverComponentErrors=" + this.serverComponentErrors + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        public final List<UiComponentError> v() {
            return this.serverComponentErrors;
        }

        @NotNull
        public final String w() {
            return this.stepName;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, flags);
            parcel.writeParcelable(this.styles, flags);
            parcel.writeParcelable(this.cancelDialog, flags);
            parcel.writeParcelable(this.localizations, flags);
            parcel.writeString(this.inquiryStatus);
            parcel.writeString(this.stepName);
            List<UiComponentConfig> list = this.components;
            parcel.writeInt(list.size());
            Iterator<UiComponentConfig> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeInt(this.finalStep ? 1 : 0);
            Map<String, InquiryField> map = this.fields;
            parcel.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), flags);
            }
            parcel.writeString(this.clientSideKey);
            List<UiComponentError> list2 = this.serverComponentErrors;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<UiComponentError> it2 = list2.iterator();
                while (it2.hasNext()) {
                    parcel.writeParcelable(it2.next(), flags);
                }
            }
            parcel.writeParcelable(this.transitionError, flags);
            parcel.writeParcelable(this.inquirySessionConfig, flags);
        }

        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        @Override
        public StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public UiStepRunning(@NotNull String str, @NotNull String str2, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, @NotNull String str3, @NotNull String str4, @NotNull List<? extends UiComponentConfig> list, boolean z, boolean z2, boolean z3, @NotNull Map<String, ? extends InquiryField> map, @NotNull String str5, List<? extends UiComponentError> list2, InternalErrorInfo internalErrorInfo, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "inquiryId");
            Intrinsics.checkNotNullParameter(str2, "sessionToken");
            Intrinsics.checkNotNullParameter(str3, "inquiryStatus");
            Intrinsics.checkNotNullParameter(str4, "stepName");
            Intrinsics.checkNotNullParameter(list, "components");
            Intrinsics.checkNotNullParameter(map, "fields");
            Intrinsics.checkNotNullParameter(str5, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = uiStepStyle;
            this.cancelDialog = cancelDialog;
            this.localizations = localizations;
            this.inquiryStatus = str3;
            this.stepName = str4;
            this.components = list;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.finalStep = z3;
            this.fields = map;
            this.clientSideKey = str5;
            this.serverComponentErrors = list2;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    public InquiryState(String str, String str2, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, transitionStatus, stepStyle, cancelDialog, str3, inquirySessionConfig);
    }

    public NextStep.CancelDialog getCancelDialog() {
        return this.cancelDialog;
    }

    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    public String getFromStep() {
        return this.fromStep;
    }

    public TransitionStatus getTransitionStatus() {
        return this.transitionStatus;
    }

    public final void f(boolean z) {
        this.didGoBack = z;
    }

    @NotNull
    public final InquiryState g(TransitionStatus transitionStatus) throws P9.m {
        if (this instanceof Complete) {
            return Complete.i((Complete) this, null, null, transitionStatus, null, null, 27, null);
        }
        if ((this instanceof CreateInquiryFromTemplate) || (this instanceof ResumeFallbackInquiry) || (this instanceof CreateInquirySession)) {
            return this;
        }
        if (this instanceof DocumentStepRunning) {
            return DocumentStepRunning.i((DocumentStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, null, 1019, null);
        }
        if (this instanceof GovernmentIdStepRunning) {
            return GovernmentIdStepRunning.i((GovernmentIdStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null);
        }
        if (this instanceof SelfieStepRunning) {
            return SelfieStepRunning.i((SelfieStepRunning) this, null, null, transitionStatus, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, 4194299, null);
        }
        if (this instanceof ShowLoadingSpinner) {
            return ShowLoadingSpinner.i((ShowLoadingSpinner) this, null, transitionStatus, null, null, false, null, 61, null);
        }
        if (this instanceof UiStepRunning) {
            return UiStepRunning.i((UiStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 131067, null);
        }
        throw new P9.m();
    }

    public StepStyle getStyles() {
        return this.styles;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

    @NotNull
    public InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    public String getInquiryId() {
        return this.inquiryId;
    }

    private InquiryState(String str, String str2, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig) {
        this.sessionToken = str;
        this.inquiryId = str2;
        this.transitionStatus = transitionStatus;
        this.styles = stepStyle;
        this.cancelDialog = cancelDialog;
        this.fromStep = str3;
        this.inquirySessionConfig = inquirySessionConfig;
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "h", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Ljava/lang/String;", "j", "C", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "d", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "D", "l", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "F", "Z", "n", "()Z", "G", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ShowLoadingSpinner extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ShowLoadingSpinner> CREATOR = new a();

        @NotNull
        private final String sessionToken;

        private final TransitionStatus transitionStatus;

        @NotNull
        private final String inquiryId;

        private final StepStyle styles;

        private final boolean useBasicSpinner;

        @NotNull
        private final InquirySessionConfig inquirySessionConfig;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowLoadingSpinner> {
            @Override
            @NotNull
            public final ShowLoadingSpinner createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowLoadingSpinner(parcel.readString(), (TransitionStatus) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readString(), (StepStyle) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readInt() != 0, (InquirySessionConfig) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final ShowLoadingSpinner[] newArray(int i) {
                return new ShowLoadingSpinner[i];
            }
        }

        public ShowLoadingSpinner(String str, TransitionStatus transitionStatus, String str2, StepStyle stepStyle, boolean z, InquirySessionConfig inquirySessionConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            TransitionStatus checkingForNextState;
            if ((i & 2) != 0) {
                u uVar = null;
                checkingForNextState = new TransitionStatus.CheckingForNextState(uVar, 1, uVar);
            } else {
                checkingForNextState = transitionStatus;
            }
            this(str, checkingForNextState, str2, stepStyle, z, (i & 32) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        public static ShowLoadingSpinner i(ShowLoadingSpinner showLoadingSpinner, String str, TransitionStatus transitionStatus, String str2, StepStyle stepStyle, boolean z, InquirySessionConfig inquirySessionConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showLoadingSpinner.sessionToken;
            }
            if ((i & 2) != 0) {
                transitionStatus = showLoadingSpinner.transitionStatus;
            }
            TransitionStatus transitionStatus2 = transitionStatus;
            if ((i & 4) != 0) {
                str2 = showLoadingSpinner.inquiryId;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                stepStyle = showLoadingSpinner.styles;
            }
            StepStyle stepStyle2 = stepStyle;
            if ((i & 16) != 0) {
                z = showLoadingSpinner.useBasicSpinner;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                inquirySessionConfig = showLoadingSpinner.inquirySessionConfig;
            }
            return showLoadingSpinner.h(str, transitionStatus2, str3, stepStyle2, z2, inquirySessionConfig);
        }

        @Override
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowLoadingSpinner)) {
                return false;
            }
            ShowLoadingSpinner showLoadingSpinner = (ShowLoadingSpinner) other;
            return Intrinsics.b(this.sessionToken, showLoadingSpinner.sessionToken) && Intrinsics.b(this.transitionStatus, showLoadingSpinner.transitionStatus) && Intrinsics.b(this.inquiryId, showLoadingSpinner.inquiryId) && Intrinsics.b(this.styles, showLoadingSpinner.styles) && this.useBasicSpinner == showLoadingSpinner.useBasicSpinner && Intrinsics.b(this.inquirySessionConfig, showLoadingSpinner.inquirySessionConfig);
        }

        @Override
        public StepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final ShowLoadingSpinner h(@NotNull String sessionToken, TransitionStatus transitionStatus, @NotNull String inquiryId, StepStyle styles, boolean useBasicSpinner, @NotNull InquirySessionConfig inquirySessionConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new ShowLoadingSpinner(sessionToken, transitionStatus, inquiryId, styles, useBasicSpinner, inquirySessionConfig);
        }

        public int hashCode() {
            int iHashCode = this.sessionToken.hashCode() * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode2 = (((iHashCode + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31) + this.inquiryId.hashCode()) * 31;
            StepStyle stepStyle = this.styles;
            return ((((iHashCode2 + (stepStyle != null ? stepStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.useBasicSpinner)) * 31) + this.inquirySessionConfig.hashCode();
        }

        @Override
        @NotNull
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override
        @NotNull
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override
        @NotNull
        public String getInquiryId() {
            return this.inquiryId;
        }

        public final boolean getUseBasicSpinner() {
            return this.useBasicSpinner;
        }

        @NotNull
        public String toString() {
            return "ShowLoadingSpinner(sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", inquiryId=" + this.inquiryId + ", styles=" + this.styles + ", useBasicSpinner=" + this.useBasicSpinner + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, flags);
            parcel.writeString(this.inquiryId);
            parcel.writeParcelable(this.styles, flags);
            parcel.writeInt(this.useBasicSpinner ? 1 : 0);
            parcel.writeParcelable(this.inquirySessionConfig, flags);
        }

        public ShowLoadingSpinner(@NotNull String str, TransitionStatus transitionStatus, @NotNull String str2, StepStyle stepStyle, boolean z, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(str, "sessionToken");
            Intrinsics.checkNotNullParameter(str2, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = str;
            this.transitionStatus = transitionStatus;
            this.inquiryId = str2;
            this.styles = stepStyle;
            this.useBasicSpinner = z;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    public InquiryState(String str, String str2, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : transitionStatus, (i & 8) != 0 ? null : stepStyle, (i & 16) != 0 ? null : cancelDialog, (i & 32) == 0 ? str3 : null, (i & 64) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig, null);
    }
}
