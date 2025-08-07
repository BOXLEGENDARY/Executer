package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.squareup.workflow1.ui.r;
import com.squareup.workflow1.ui.u;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0731h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.C0692u;
import n9.InterfaceC0674b;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0083\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0019\u0010 \u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b \u0010\u001cJ\u0019\u0010!\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b!\u0010\u001cJ\u001f\u0010\"\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010\u001cJ\u0019\u0010&\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b&\u0010\u0019J\u008e\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+HÖ\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00109\u001a\u0004\b:\u0010;R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010*\"\u0004\b?\u0010@R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010=\u001a\u0004\bB\u0010*\"\u0004\bC\u0010@R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010=\u001a\u0004\bD\u0010*\"\u0004\bE\u0010@R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010=\u001a\u0004\bG\u0010*\"\u0004\bH\u0010@R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010=\u001a\u0004\bF\u0010*\"\u0004\bJ\u0010@R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010*\"\u0004\bM\u0010@R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bI\u0010P\"\u0004\bQ\u0010RR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010=\u001a\u0004\bK\u0010*\"\u0004\bS\u0010@R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR&\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010O\u0012\u0004\b]\u0010^\u001a\u0004\bA\u0010PR(\u0010g\u001a\u00020`8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bY\u0010a\u0012\u0004\bf\u0010^\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR(\u0010o\u001a\u00020h8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bZ\u0010i\u0012\u0004\bn\u0010^\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR(\u0010s\u001a\u00020h8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bd\u0010i\u0012\u0004\br\u0010^\u001a\u0004\bp\u0010k\"\u0004\bq\u0010mR(\u0010w\u001a\u00020h8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bt\u0010i\u0012\u0004\bv\u0010^\u001a\u0004\bu\u0010k\"\u0004\bt\u0010mR(\u0010|\u001a\u00020h8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bx\u0010i\u0012\u0004\b{\u0010^\u001a\u0004\by\u0010k\"\u0004\bz\u0010mR)\u0010\u0080\u0001\u001a\u00020h8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b}\u0010i\u0012\u0004\b\u007f\u0010^\u001a\u0004\b~\u0010k\"\u0004\bx\u0010mR\u001a\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/b;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "", "street1", "street2", "city", "subdivision", "postalCode", "searchQuery", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "searchResults", "selectedSearchResultId", "", "isAddressAutocompleteLoading", "isAddressComponentsCollapsed", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "newState", "a", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "newString", "f", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "k", "o", "n", "c", "Q", "d", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "resultId", "R", "P", "r", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "v", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "e", "Ljava/lang/String;", "B", "setStreet1", "(Ljava/lang/String;)V", "i", "C", "setStreet2", "t", "setCity", "w", "D", "setSubdivision", "y", "setPostalCode", "z", "x", "setSearchQuery", "A", "Ljava/util/List;", "()Ljava/util/List;", "setSearchResults", "(Ljava/util/List;)V", "setSelectedSearchResultId", "Ljava/lang/Boolean;", "E", "()Ljava/lang/Boolean;", "setAddressAutocompleteLoading", "(Ljava/lang/Boolean;)V", "F", "G", "", "Lu9/a;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lo9/h;", "Lo9/h;", "l", "()Lo9/h;", "H", "(Lo9/h;)V", "isAddressFieldCollapsed$annotations", "isAddressFieldCollapsed", "Lcom/squareup/workflow1/ui/r;", "Lcom/squareup/workflow1/ui/r;", "p", "()Lcom/squareup/workflow1/ui/r;", "L", "(Lcom/squareup/workflow1/ui/r;)V", "getTextControllerForAddressStreet1$annotations", "textControllerForAddressStreet1", "q", "M", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressStreet2", "I", "b", "getTextControllerForAddressCity$annotations", "textControllerForAddressCity", "J", "h", "O", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressSubdivision", "K", "g", "getTextControllerForAddressPostalCode$annotations", "textControllerForAddressPostalCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputAddressComponent implements UiComponent, InterfaceC0674b, InterfaceC0684l, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<InputAddressComponent> CREATOR = new a();

    private List<Suggestion> searchResults;

    private String selectedSearchResultId;

    private Boolean isAddressAutocompleteLoading;

    private Boolean isAddressComponentsCollapsed;

    @NotNull
    private final List<u9.a> associatedViews;

    @NotNull
    private C0731h isAddressFieldCollapsed;

    @NotNull
    private r textControllerForAddressStreet1;

    @NotNull
    private r textControllerForAddressStreet2;

    @NotNull
    private r textControllerForAddressCity;

    @NotNull
    private r textControllerForAddressSubdivision;

    @NotNull
    private r textControllerForAddressPostalCode;

    @NotNull
    private final InputAddress config;

    @NotNull
    private String street1;

    @NotNull
    private String street2;

    @NotNull
    private String city;

    @NotNull
    private String subdivision;

    @NotNull
    private String postalCode;

    private String searchQuery;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputAddressComponent> {
        @Override
        @NotNull
        public final InputAddressComponent createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            InputAddress inputAddress = (InputAddress) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Suggestion.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputAddressComponent(inputAddress, string, string2, string3, string4, string5, string6, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override
        @NotNull
        public final InputAddressComponent[] newArray(int i) {
            return new InputAddressComponent[i];
        }
    }

    public InputAddressComponent(@NotNull InputAddress inputAddress, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, List<Suggestion> list, String str7, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(inputAddress, "config");
        Intrinsics.checkNotNullParameter(str, "street1");
        Intrinsics.checkNotNullParameter(str2, "street2");
        Intrinsics.checkNotNullParameter(str3, "city");
        Intrinsics.checkNotNullParameter(str4, "subdivision");
        Intrinsics.checkNotNullParameter(str5, "postalCode");
        this.config = inputAddress;
        this.street1 = str;
        this.street2 = str2;
        this.city = str3;
        this.subdivision = str4;
        this.postalCode = str5;
        this.searchQuery = str6;
        this.searchResults = list;
        this.selectedSearchResultId = str7;
        this.isAddressAutocompleteLoading = bool;
        this.isAddressComponentsCollapsed = bool2;
        this.associatedViews = new ArrayList();
        this.isAddressFieldCollapsed = new C0731h(true);
        this.textControllerForAddressStreet1 = u.a(this.street1);
        this.textControllerForAddressStreet2 = u.a(this.street2);
        this.textControllerForAddressCity = u.a(this.city);
        this.textControllerForAddressSubdivision = u.a(this.subdivision);
        this.textControllerForAddressPostalCode = u.a(this.postalCode);
    }

    @g(ignore = true)
    public static void getTextControllerForAddressCity$annotations() {
    }

    @g(ignore = true)
    public static void getTextControllerForAddressPostalCode$annotations() {
    }

    @g(ignore = true)
    public static void getTextControllerForAddressStreet1$annotations() {
    }

    @g(ignore = true)
    public static void getTextControllerForAddressStreet2$annotations() {
    }

    @g(ignore = true)
    public static void getTextControllerForAddressSubdivision$annotations() {
    }

    public static InputAddressComponent s(InputAddressComponent inputAddressComponent, InputAddress inputAddress, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, Boolean bool, Boolean bool2, int i, Object obj) {
        return inputAddressComponent.r((i & 1) != 0 ? inputAddressComponent.config : inputAddress, (i & 2) != 0 ? inputAddressComponent.street1 : str, (i & 4) != 0 ? inputAddressComponent.street2 : str2, (i & 8) != 0 ? inputAddressComponent.city : str3, (i & 16) != 0 ? inputAddressComponent.subdivision : str4, (i & 32) != 0 ? inputAddressComponent.postalCode : str5, (i & 64) != 0 ? inputAddressComponent.searchQuery : str6, (i & 128) != 0 ? inputAddressComponent.searchResults : list, (i & 256) != 0 ? inputAddressComponent.selectedSearchResultId : str7, (i & 512) != 0 ? inputAddressComponent.isAddressAutocompleteLoading : bool, (i & 1024) != 0 ? inputAddressComponent.isAddressComponentsCollapsed : bool2);
    }

    @NotNull
    public final String getStreet1() {
        return this.street1;
    }

    @NotNull
    public final String getStreet2() {
        return this.street2;
    }

    @NotNull
    public final String getSubdivision() {
        return this.subdivision;
    }

    public final Boolean getIsAddressAutocompleteLoading() {
        return this.isAddressAutocompleteLoading;
    }

    public final Boolean getIsAddressComponentsCollapsed() {
        return this.isAddressComponentsCollapsed;
    }

    public final void G(Boolean bool) {
        this.isAddressComponentsCollapsed = bool;
    }

    public void H(@NotNull C0731h c0731h) {
        Intrinsics.checkNotNullParameter(c0731h, "<set-?>");
        this.isAddressFieldCollapsed = c0731h;
    }

    public void I(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressCity = rVar;
    }

    public void J(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressPostalCode = rVar;
    }

    public void L(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressStreet1 = rVar;
    }

    public void M(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressStreet2 = rVar;
    }

    public void O(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressSubdivision = rVar;
    }

    @NotNull
    public InputAddressComponent P(Boolean isAddressAutocompleteLoading) {
        return C0692u.c(s(this, null, null, null, null, null, null, null, null, null, isAddressAutocompleteLoading, null, 1535, null), this);
    }

    @NotNull
    public InputAddressComponent Q(String searchQuery) {
        return C0692u.c(s(this, null, null, null, null, null, null, searchQuery, null, null, null, null, 1983, null), this);
    }

    @NotNull
    public InputAddressComponent R(String resultId) {
        return C0692u.c(s(this, null, null, null, null, null, null, null, null, resultId, null, null, 1791, null), this);
    }

    @Override
    @NotNull
    public InputAddressComponent a(Boolean newState) {
        return C0692u.c(s(this, null, null, null, null, null, null, null, null, null, null, newState, 1023, null), this);
    }

    @Override
    @NotNull
    public r getTextControllerForAddressCity() {
        return this.textControllerForAddressCity;
    }

    @Override
    @NotNull
    public InputAddressComponent c(String newString) {
        if (newString == null) {
            newString = "";
        }
        return C0692u.c(s(this, null, null, null, null, null, newString, null, null, null, null, null, 2015, null), this);
    }

    @Override
    @NotNull
    public InputAddressComponent d(List<Suggestion> searchResults) {
        return C0692u.c(s(this, null, null, null, null, null, null, null, searchResults, null, null, null, 1919, null), this);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputAddressComponent)) {
            return false;
        }
        InputAddressComponent inputAddressComponent = (InputAddressComponent) other;
        return Intrinsics.b(this.config, inputAddressComponent.config) && Intrinsics.b(this.street1, inputAddressComponent.street1) && Intrinsics.b(this.street2, inputAddressComponent.street2) && Intrinsics.b(this.city, inputAddressComponent.city) && Intrinsics.b(this.subdivision, inputAddressComponent.subdivision) && Intrinsics.b(this.postalCode, inputAddressComponent.postalCode) && Intrinsics.b(this.searchQuery, inputAddressComponent.searchQuery) && Intrinsics.b(this.searchResults, inputAddressComponent.searchResults) && Intrinsics.b(this.selectedSearchResultId, inputAddressComponent.selectedSearchResultId) && Intrinsics.b(this.isAddressAutocompleteLoading, inputAddressComponent.isAddressAutocompleteLoading) && Intrinsics.b(this.isAddressComponentsCollapsed, inputAddressComponent.isAddressComponentsCollapsed);
    }

    @Override
    @NotNull
    public InputAddressComponent f(String newString) {
        if (newString == null) {
            newString = "";
        }
        return C0692u.c(s(this, null, newString, null, null, null, null, null, null, null, null, null, 2045, null), this);
    }

    @Override
    @NotNull
    public r getTextControllerForAddressPostalCode() {
        return this.textControllerForAddressPostalCode;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputAddress.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputAddress.Attributes attributes = e().getAttributes();
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

    @Override
    @NotNull
    public r getTextControllerForAddressSubdivision() {
        return this.textControllerForAddressSubdivision;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.config.hashCode() * 31) + this.street1.hashCode()) * 31) + this.street2.hashCode()) * 31) + this.city.hashCode()) * 31) + this.subdivision.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        String str = this.searchQuery;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Suggestion> list = this.searchResults;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.selectedSearchResultId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAddressAutocompleteLoading;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAddressComponentsCollapsed;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @Override
    @NotNull
    public InputAddressComponent k(String newString) {
        if (newString == null) {
            newString = "";
        }
        return C0692u.c(s(this, null, null, newString, null, null, null, null, null, null, null, null, 2043, null), this);
    }

    @Override
    @NotNull
    public C0731h getIsAddressFieldCollapsed() {
        return this.isAddressFieldCollapsed;
    }

    @Override
    @NotNull
    public InputAddressComponent n(String newString) {
        if (newString == null) {
            newString = "";
        }
        return C0692u.c(s(this, null, null, null, null, newString, null, null, null, null, null, null, 2031, null), this);
    }

    @Override
    @NotNull
    public InputAddressComponent o(String newString) {
        if (newString == null) {
            newString = "";
        }
        return C0692u.c(s(this, null, null, null, newString, null, null, null, null, null, null, null, 2039, null), this);
    }

    @Override
    @NotNull
    public r getTextControllerForAddressStreet1() {
        return this.textControllerForAddressStreet1;
    }

    @Override
    @NotNull
    public r getTextControllerForAddressStreet2() {
        return this.textControllerForAddressStreet2;
    }

    @NotNull
    public final InputAddressComponent r(@NotNull InputAddress config, @NotNull String street1, @NotNull String street2, @NotNull String city, @NotNull String subdivision, @NotNull String postalCode, String searchQuery, List<Suggestion> searchResults, String selectedSearchResultId, Boolean isAddressAutocompleteLoading, Boolean isAddressComponentsCollapsed) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(street1, "street1");
        Intrinsics.checkNotNullParameter(street2, "street2");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(subdivision, "subdivision");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        return new InputAddressComponent(config, street1, street2, city, subdivision, postalCode, searchQuery, searchResults, selectedSearchResultId, isAddressAutocompleteLoading, isAddressComponentsCollapsed);
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public String toString() {
        return "InputAddressComponent(config=" + this.config + ", street1=" + this.street1 + ", street2=" + this.street2 + ", city=" + this.city + ", subdivision=" + this.subdivision + ", postalCode=" + this.postalCode + ", searchQuery=" + this.searchQuery + ", searchResults=" + this.searchResults + ", selectedSearchResultId=" + this.selectedSearchResultId + ", isAddressAutocompleteLoading=" + this.isAddressAutocompleteLoading + ", isAddressComponentsCollapsed=" + this.isAddressComponentsCollapsed + ")";
    }

    @Override
    @NotNull
    public InputAddress e() {
        return this.config;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeString(this.street1);
        parcel.writeString(this.street2);
        parcel.writeString(this.city);
        parcel.writeString(this.subdivision);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.searchQuery);
        List<Suggestion> list = this.searchResults;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Suggestion> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.selectedSearchResultId);
        Boolean bool = this.isAddressAutocompleteLoading;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isAddressComponentsCollapsed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final List<Suggestion> y() {
        return this.searchResults;
    }

    public final String getSelectedSearchResultId() {
        return this.selectedSearchResultId;
    }

    public InputAddressComponent(InputAddress inputAddress, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String prefillAddressStreet1;
        String prefillAddressStreet2;
        String prefillAddressCity;
        String prefillAddressSubdivision;
        String prefillAddressPostalCode;
        String str8 = "";
        if ((i & 2) != 0) {
            InputAddress.Attributes attributes = inputAddress.getAttributes();
            if (attributes == null || (prefillAddressStreet1 = attributes.getPrefillAddressStreet1()) == null) {
                prefillAddressStreet1 = "";
            }
        } else {
            prefillAddressStreet1 = str;
        }
        if ((i & 4) != 0) {
            InputAddress.Attributes attributes2 = inputAddress.getAttributes();
            if (attributes2 == null || (prefillAddressStreet2 = attributes2.getPrefillAddressStreet2()) == null) {
                prefillAddressStreet2 = "";
            }
        } else {
            prefillAddressStreet2 = str2;
        }
        if ((i & 8) != 0) {
            InputAddress.Attributes attributes3 = inputAddress.getAttributes();
            if (attributes3 == null || (prefillAddressCity = attributes3.getPrefillAddressCity()) == null) {
                prefillAddressCity = "";
            }
        } else {
            prefillAddressCity = str3;
        }
        if ((i & 16) != 0) {
            InputAddress.Attributes attributes4 = inputAddress.getAttributes();
            if (attributes4 == null || (prefillAddressSubdivision = attributes4.getPrefillAddressSubdivision()) == null) {
                prefillAddressSubdivision = "";
            }
        } else {
            prefillAddressSubdivision = str4;
        }
        if ((i & 32) != 0) {
            InputAddress.Attributes attributes5 = inputAddress.getAttributes();
            if (attributes5 != null && (prefillAddressPostalCode = attributes5.getPrefillAddressPostalCode()) != null) {
                str8 = prefillAddressPostalCode;
            }
        } else {
            str8 = str5;
        }
        this(inputAddress, prefillAddressStreet1, prefillAddressStreet2, prefillAddressCity, prefillAddressSubdivision, str8, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : bool, (i & 1024) == 0 ? bool2 : null);
    }
}
