package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.squareup.workflow1.ui.r;
import com.squareup.workflow1.ui.u;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import java.util.ArrayList;
import java.util.List;
import ka.C0725b;
import ka.C0727d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.W;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BG\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010C\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b2\u0010@R(\u0010K\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bJ\u0010B\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010T\u001a\u00020L8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010B\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010Y\u001a\u00020L8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bU\u0010N\u0012\u0004\bX\u0010B\u001a\u0004\bV\u0010P\"\u0004\bW\u0010RR(\u0010b\u001a\u00020Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\ba\u0010B\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u0010g\u001a\u00020Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bc\u0010\\\u0012\u0004\bf\u0010B\u001a\u0004\bd\u0010^\"\u0004\be\u0010`R(\u0010p\u001a\u00020h8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u0010B\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010t\u001a\u0004\u0018\u00010q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0016\u0010v\u001a\u0004\u0018\u00010q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010s¨\u0006w"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/l;", "Ln9/q;", "Ln9/W;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "config", "", "documentNumber", "dateOfBirth", "expirationDate", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "governmentIdNfcData", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)V", "newValue", "l", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "o", "newDate", "n", "p", "q", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "e", "Ljava/lang/String;", "getDocumentNumber", "i", "getDateOfBirth", "v", "getExpirationDate", "w", "getCardAccessNumber", "y", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "getGovernmentIdNfcData", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "", "Lu9/a;", "z", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "A", "Z", "t0", "()Z", "m", "(Z)V", "getWasTapped$annotations", "wasTapped", "Lcom/squareup/workflow1/ui/r;", "B", "Lcom/squareup/workflow1/ui/r;", "c", "()Lcom/squareup/workflow1/ui/r;", "setCardAccessNumberController", "(Lcom/squareup/workflow1/ui/r;)V", "getCardAccessNumberController$annotations", "cardAccessNumberController", "C", "g", "setDocumentNumberController", "getDocumentNumberController$annotations", "documentNumberController", "Lo9/b;", "D", "Lo9/b;", "f", "()Lo9/b;", "setDateOfBirthController", "(Lo9/b;)V", "getDateOfBirthController$annotations", "dateOfBirthController", "E", "h", "setExpirationDateController", "getExpirationDateController$annotations", "expirationDateController", "Lo9/d;", "F", "Lo9/d;", "k", "()Lo9/d;", "setNfcDataController", "(Lo9/d;)V", "getNfcDataController$annotations", "nfcDataController", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GovernmentIdNfcScanComponent implements UiComponent, InterfaceC0684l, InterfaceC0689q, W {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdNfcScanComponent> CREATOR = new a();

    private boolean wasTapped;

    @NotNull
    private r cardAccessNumberController;

    @NotNull
    private r documentNumberController;

    @NotNull
    private C0725b dateOfBirthController;

    @NotNull
    private C0725b expirationDateController;

    @NotNull
    private C0727d nfcDataController;

    @NotNull
    private final GovernmentIdNfcScan config;

    @NotNull
    private final String documentNumber;

    private final String dateOfBirth;

    private final String expirationDate;

    @NotNull
    private final String cardAccessNumber;

    private final GovernmentIdNfcData governmentIdNfcData;

    @NotNull
    private final List<u9.a> associatedViews;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdNfcScanComponent> {
        @Override
        @NotNull
        public final GovernmentIdNfcScanComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdNfcScanComponent((GovernmentIdNfcScan) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdNfcData.CREATOR.createFromParcel(parcel));
        }

        @Override
        @NotNull
        public final GovernmentIdNfcScanComponent[] newArray(int i) {
            return new GovernmentIdNfcScanComponent[i];
        }
    }

    public GovernmentIdNfcScanComponent(@NotNull GovernmentIdNfcScan governmentIdNfcScan, @NotNull String str, String str2, String str3, @NotNull String str4, GovernmentIdNfcData governmentIdNfcData) {
        Intrinsics.checkNotNullParameter(governmentIdNfcScan, "config");
        Intrinsics.checkNotNullParameter(str, "documentNumber");
        Intrinsics.checkNotNullParameter(str4, "cardAccessNumber");
        this.config = governmentIdNfcScan;
        this.documentNumber = str;
        this.dateOfBirth = str2;
        this.expirationDate = str3;
        this.cardAccessNumber = str4;
        this.governmentIdNfcData = governmentIdNfcData;
        this.associatedViews = new ArrayList();
        this.cardAccessNumberController = u.a(str4);
        this.documentNumberController = u.a(str);
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.Companion;
        this.dateOfBirthController = new C0725b(str2, null, companion.generateTextMonths());
        this.expirationDateController = new C0725b(str3, null, companion.generateTextMonths());
        this.nfcDataController = new C0727d(governmentIdNfcData);
    }

    public static GovernmentIdNfcScanComponent b(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, GovernmentIdNfcScan governmentIdNfcScan, String str, String str2, String str3, String str4, GovernmentIdNfcData governmentIdNfcData, int i, Object obj) {
        if ((i & 1) != 0) {
            governmentIdNfcScan = governmentIdNfcScanComponent.config;
        }
        if ((i & 2) != 0) {
            str = governmentIdNfcScanComponent.documentNumber;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = governmentIdNfcScanComponent.dateOfBirth;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = governmentIdNfcScanComponent.expirationDate;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = governmentIdNfcScanComponent.cardAccessNumber;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            governmentIdNfcData = governmentIdNfcScanComponent.governmentIdNfcData;
        }
        return governmentIdNfcScanComponent.a(governmentIdNfcScan, str5, str6, str7, str8, governmentIdNfcData);
    }

    @g(ignore = true)
    public static void getCardAccessNumberController$annotations() {
    }

    @g(ignore = true)
    public static void getDateOfBirthController$annotations() {
    }

    @g(ignore = true)
    public static void getDocumentNumberController$annotations() {
    }

    @g(ignore = true)
    public static void getExpirationDateController$annotations() {
    }

    @g(ignore = true)
    public static void getNfcDataController$annotations() {
    }

    @NotNull
    public final GovernmentIdNfcScanComponent a(@NotNull GovernmentIdNfcScan config, @NotNull String documentNumber, String dateOfBirth, String expirationDate, @NotNull String cardAccessNumber, GovernmentIdNfcData governmentIdNfcData) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        return new GovernmentIdNfcScanComponent(config, documentNumber, dateOfBirth, expirationDate, cardAccessNumber, governmentIdNfcData);
    }

    @NotNull
    public final r getCardAccessNumberController() {
        return this.cardAccessNumberController;
    }

    @Override
    @NotNull
    public GovernmentIdNfcScan e() {
        return this.config;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcScanComponent)) {
            return false;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) other;
        return Intrinsics.b(this.config, governmentIdNfcScanComponent.config) && Intrinsics.b(this.documentNumber, governmentIdNfcScanComponent.documentNumber) && Intrinsics.b(this.dateOfBirth, governmentIdNfcScanComponent.dateOfBirth) && Intrinsics.b(this.expirationDate, governmentIdNfcScanComponent.expirationDate) && Intrinsics.b(this.cardAccessNumber, governmentIdNfcScanComponent.cardAccessNumber) && Intrinsics.b(this.governmentIdNfcData, governmentIdNfcScanComponent.governmentIdNfcData);
    }

    @NotNull
    public final C0725b getDateOfBirthController() {
        return this.dateOfBirthController;
    }

    @NotNull
    public final r getDocumentNumberController() {
        return this.documentNumberController;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        GovernmentIdNfcScan.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        GovernmentIdNfcScan.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override
    @NotNull
    public String getName() {
        return UiComponent.a.a(this);
    }

    @NotNull
    public final C0725b getExpirationDateController() {
        return this.expirationDateController;
    }

    public int hashCode() {
        int iHashCode = ((this.config.hashCode() * 31) + this.documentNumber.hashCode()) * 31;
        String str = this.dateOfBirth;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expirationDate;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.cardAccessNumber.hashCode()) * 31;
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        return iHashCode3 + (governmentIdNfcData != null ? governmentIdNfcData.hashCode() : 0);
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public final C0727d getNfcDataController() {
        return this.nfcDataController;
    }

    @NotNull
    public final GovernmentIdNfcScanComponent l(@NotNull String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, null, null, newValue, null, 47, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    @Override
    public void m(boolean z) {
        this.wasTapped = z;
    }

    @NotNull
    public final GovernmentIdNfcScanComponent n(String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, newDate, null, null, null, 59, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    @NotNull
    public final GovernmentIdNfcScanComponent o(@NotNull String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, newValue, null, null, null, null, 61, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    @NotNull
    public final GovernmentIdNfcScanComponent p(String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, null, newDate, null, null, 55, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    @NotNull
    public final GovernmentIdNfcScanComponent q(GovernmentIdNfcData newValue) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, null, null, null, newValue, 31, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @NotNull
    public String toString() {
        return "GovernmentIdNfcScanComponent(config=" + this.config + ", documentNumber=" + this.documentNumber + ", dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ", cardAccessNumber=" + this.cardAccessNumber + ", governmentIdNfcData=" + this.governmentIdNfcData + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeString(this.documentNumber);
        parcel.writeString(this.dateOfBirth);
        parcel.writeString(this.expirationDate);
        parcel.writeString(this.cardAccessNumber);
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        if (governmentIdNfcData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            governmentIdNfcData.writeToParcel(parcel, flags);
        }
    }

    public GovernmentIdNfcScanComponent(GovernmentIdNfcScan governmentIdNfcScan, String str, String str2, String str3, String str4, GovernmentIdNfcData governmentIdNfcData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String prefillDocumentNumber;
        String prefillDateOfBirth;
        String prefillExpirationDate;
        String prefillCardAccessNumber;
        String str5 = "";
        if ((i & 2) != 0) {
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScan.getAttributes();
            if (attributes == null || (prefillDocumentNumber = attributes.getPrefillDocumentNumber()) == null) {
                prefillDocumentNumber = "";
            }
        } else {
            prefillDocumentNumber = str;
        }
        if ((i & 4) != 0) {
            GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScan.getAttributes();
            prefillDateOfBirth = attributes2 != null ? attributes2.getPrefillDateOfBirth() : null;
        } else {
            prefillDateOfBirth = str2;
        }
        if ((i & 8) != 0) {
            GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan.getAttributes();
            prefillExpirationDate = attributes3 != null ? attributes3.getPrefillExpirationDate() : null;
        } else {
            prefillExpirationDate = str3;
        }
        if ((i & 16) != 0) {
            GovernmentIdNfcScan.Attributes attributes4 = governmentIdNfcScan.getAttributes();
            if (attributes4 != null && (prefillCardAccessNumber = attributes4.getPrefillCardAccessNumber()) != null) {
                str5 = prefillCardAccessNumber;
            }
        } else {
            str5 = str4;
        }
        this(governmentIdNfcScan, prefillDocumentNumber, prefillDateOfBirth, prefillExpirationDate, str5, (i & 32) == 0 ? governmentIdNfcData : null);
    }
}
