package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.r;
import com.squareup.workflow1.ui.u;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.C0729f;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.S;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002t)B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b2\u0010\u0019R&\u00109\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0011\u00105\u0012\u0004\b7\u00108\u001a\u0004\b0\u00106R(\u0010B\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u00108\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010G\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bC\u0010<\u0012\u0004\bF\u00108\u001a\u0004\bD\u0010>\"\u0004\bE\u0010@R:\u0010M\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u00105\u0012\u0004\bL\u00108\u001a\u0004\b)\u00106R0\u0010S\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0H\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bP\u0010Q\u0012\u0004\bR\u00108R\u001d\u0010X\u001a\u00020\u00138\u0006¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bW\u00108\u001a\u0004\bV\u0010\u0015R(\u0010a\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b`\u00108\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001d\u0010g\u001a\u00020\u001f8\u0006¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\bf\u00108\u001a\u0004\bd\u0010eR\u001d\u0010k\u001a\u00020\u001f8\u0006¢\u0006\u0012\n\u0004\bh\u0010c\u0012\u0004\bj\u00108\u001a\u0004\bi\u0010eR\u0016\u0010o\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010q\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010nR\u0019\u0010s\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\br\u00106¨\u0006u"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "config", "", "selectedCountry", "selectedIdType", "idValue", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "t", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "v", "value", "w", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Ln9/S;", "o", "()Ln9/S;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "c", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "e", "Ljava/lang/String;", "r", "i", "s", "p", "", "Lu9/a;", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lo9/f;", "y", "Lo9/f;", "f", "()Lo9/f;", "setCountryOptionsController", "(Lo9/f;)V", "getCountryOptionsController$annotations", "countryOptionsController", "z", "n", "setIdTypeOptionsController", "getIdTypeOptionsController$annotations", "idTypeOptionsController", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$b;", "<set-?>", "A", "getCountryOptions$annotations", "countryOptions", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$d;", "B", "Ljava/util/Map;", "getTypesByCountryCode$annotations", "typesByCountryCode", "C", "Ln9/S;", "g", "getCountrySelectComponent$annotations", "countrySelectComponent", "Lcom/squareup/workflow1/ui/r;", "D", "Lcom/squareup/workflow1/ui/r;", "q", "()Lcom/squareup/workflow1/ui/r;", "setIdValueController", "(Lcom/squareup/workflow1/ui/r;)V", "getIdValueController$annotations", "idValueController", "E", "Z", "h", "()Z", "getHideCountryField$annotations", "hideCountryField", "F", "k", "getHideIdTypeField$annotations", "hideIdTypeField", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "l", "idTypeOptions", "b", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputInternationalDbComponent implements UiComponent, InterfaceC0684l, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<InputInternationalDbComponent> CREATOR = new c();

    private List<CountryOption> countryOptions;

    private Map<String, ? extends List<IdOption>> typesByCountryCode;

    @NotNull
    private final S countrySelectComponent;

    @NotNull
    private r idValueController;

    private final boolean hideCountryField;

    private final boolean hideIdTypeField;

    @NotNull
    private final InputInternationalDb config;

    private final String selectedCountry;

    private final String selectedIdType;

    private final String idValue;

    @NotNull
    private final List<u9.a> associatedViews;

    @NotNull
    private C0729f countryOptionsController;

    @NotNull
    private C0729f idTypeOptionsController;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$a", "Ln9/S;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "f", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "d", "()Ljava/util/List;", "options", "", "c", "()Ljava/lang/String;", "label", "b", "selectedOptions", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements S {
        final Set<CountryOption> e;

        a(Set<CountryOption> set) {
            this.e = set;
        }

        @Override
        @NotNull
        public List<Option> b() {
            return CollectionsKt.j();
        }

        @Override
        public String getLabel() {
            return null;
        }

        @Override
        @NotNull
        public List<Option> d() {
            Set<CountryOption> set = this.e;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(com.withpersona.sdk2.inquiry.steps.ui.components.a.h((CountryOption) it.next()));
            }
            return arrayList;
        }

        @Override
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override
        public InputSelectBoxComponentStyle getStyles() {
            InputInternationalDb.InputInternationalDbComponentStyle styles = InputInternationalDbComponent.this.e().getStyles();
            if (styles != null) {
                return styles.getInputSelectStyle();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$b;", "", "", "countryName", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CountryOption {

        @NotNull
        private final String countryName;

        @NotNull
        private final String countryCode;

        public CountryOption(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "countryName");
            Intrinsics.checkNotNullParameter(str2, "countryCode");
            this.countryName = str;
            this.countryCode = str2;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final String getCountryName() {
            return this.countryName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryOption)) {
                return false;
            }
            CountryOption countryOption = (CountryOption) other;
            return Intrinsics.b(this.countryName, countryOption.countryName) && Intrinsics.b(this.countryCode, countryOption.countryCode);
        }

        public int hashCode() {
            return (this.countryName.hashCode() * 31) + this.countryCode.hashCode();
        }

        @NotNull
        public String toString() {
            return "CountryOption(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ")";
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<InputInternationalDbComponent> {
        @Override
        @NotNull
        public final InputInternationalDbComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputInternationalDbComponent((InputInternationalDb) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        @NotNull
        public final InputInternationalDbComponent[] newArray(int i) {
            return new InputInternationalDbComponent[i];
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$d;", "", "", "idType", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class IdOption {

        @NotNull
        private final String idType;

        @NotNull
        private final String name;

        public IdOption(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "idType");
            Intrinsics.checkNotNullParameter(str2, "name");
            this.idType = str;
            this.name = str2;
        }

        @NotNull
        public final String getIdType() {
            return this.idType;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdOption)) {
                return false;
            }
            IdOption idOption = (IdOption) other;
            return Intrinsics.b(this.idType, idOption.idType) && Intrinsics.b(this.name, idOption.name);
        }

        public int hashCode() {
            return (this.idType.hashCode() * 31) + this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdOption(idType=" + this.idType + ", name=" + this.name + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class e<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return R9.a.a(((IdOption) t).getName(), ((IdOption) t2).getName());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$f", "Ln9/S;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "f", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "d", "()Ljava/util/List;", "options", "", "c", "()Ljava/lang/String;", "label", "b", "selectedOptions", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class f implements S {
        final List<IdOption> e;

        f(List<IdOption> list) {
            this.e = list;
        }

        @Override
        @NotNull
        public List<Option> b() {
            return CollectionsKt.j();
        }

        @Override
        public String getLabel() {
            return null;
        }

        @Override
        @NotNull
        public List<Option> d() {
            List<IdOption> list = this.e;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.withpersona.sdk2.inquiry.steps.ui.components.a.i((IdOption) it.next()));
            }
            return arrayList;
        }

        @Override
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override
        public InputSelectBoxComponentStyle getStyles() {
            InputInternationalDb.InputInternationalDbComponentStyle styles = InputInternationalDbComponent.this.e().getStyles();
            if (styles != null) {
                return styles.getInputSelectStyle();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class g<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return R9.a.a(((CountryOption) t).getCountryName(), ((CountryOption) t2).getCountryName());
        }
    }

    public InputInternationalDbComponent(@NotNull InputInternationalDb inputInternationalDb, String str, String str2, String str3) {
        Option optionI;
        Object next;
        Object next2;
        List<InputInternationalDb.IdType> allowedIdTypes;
        String countryName;
        String name;
        Intrinsics.checkNotNullParameter(inputInternationalDb, "config");
        this.config = inputInternationalDb;
        this.selectedCountry = str;
        this.selectedIdType = str2;
        this.idValue = str3;
        this.associatedViews = new ArrayList();
        this.idValueController = u.a(str3 == null ? "" : str3);
        InputInternationalDb.Attributes attributes = e().getAttributes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InputInternationalDb.Attributes attributes2 = e().getAttributes();
        if (attributes2 != null && (allowedIdTypes = attributes2.getAllowedIdTypes()) != null) {
            for (InputInternationalDb.IdType idType : allowedIdTypes) {
                String countryCode = idType.getCountryCode();
                if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                    linkedHashSet.add(new CountryOption(countryName, countryCode));
                    Object arrayList = linkedHashMap.get(countryCode);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(countryCode, arrayList);
                    }
                    Collection collection = (Collection) arrayList;
                    String idType2 = idType.getIdType();
                    if (idType2 != null && (name = idType.getName()) != null) {
                        collection.add(new IdOption(idType2, name));
                    }
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list = (List) ((Map.Entry) it.next()).getValue();
            if (list.size() > 1) {
                CollectionsKt.x(list, new e());
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (true) {
            optionI = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.b(((CountryOption) next).getCountryCode(), this.selectedCountry)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        CountryOption countryOption = (CountryOption) next;
        Option optionH = countryOption != null ? com.withpersona.sdk2.inquiry.steps.ui.components.a.h(countryOption) : null;
        List list2 = (List) linkedHashMap.get(optionH != null ? optionH.getValue() : null);
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.b(((IdOption) next2).getIdType(), this.selectedIdType)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            IdOption idOption = (IdOption) next2;
            if (idOption != null) {
                optionI = com.withpersona.sdk2.inquiry.steps.ui.components.a.i(idOption);
            }
        }
        this.countryOptionsController = new C0729f(optionH);
        this.idTypeOptionsController = new C0729f(optionI);
        this.hideCountryField = (attributes != null ? Intrinsics.b(attributes.getHideCountryIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbCountry() != null;
        this.hideIdTypeField = (attributes != null ? Intrinsics.b(attributes.getHideTypeIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbType() != null;
        this.countryOptions = CollectionsKt.l0(CollectionsKt.r0(linkedHashSet), new g());
        this.typesByCountryCode = linkedHashMap;
        this.countrySelectComponent = new a(linkedHashSet);
    }

    public static InputInternationalDbComponent b(InputInternationalDbComponent inputInternationalDbComponent, InputInternationalDb inputInternationalDb, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            inputInternationalDb = inputInternationalDbComponent.config;
        }
        if ((i & 2) != 0) {
            str = inputInternationalDbComponent.selectedCountry;
        }
        if ((i & 4) != 0) {
            str2 = inputInternationalDbComponent.selectedIdType;
        }
        if ((i & 8) != 0) {
            str3 = inputInternationalDbComponent.idValue;
        }
        return inputInternationalDbComponent.a(inputInternationalDb, str, str2, str3);
    }

    @NotNull
    public final InputInternationalDbComponent a(@NotNull InputInternationalDb config, String selectedCountry, String selectedIdType, String idValue) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new InputInternationalDbComponent(config, selectedCountry, selectedIdType, idValue);
    }

    @Override
    @NotNull
    public InputInternationalDb e() {
        return this.config;
    }

    public final List<CountryOption> d() {
        return this.countryOptions;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputInternationalDbComponent)) {
            return false;
        }
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) other;
        return Intrinsics.b(this.config, inputInternationalDbComponent.config) && Intrinsics.b(this.selectedCountry, inputInternationalDbComponent.selectedCountry) && Intrinsics.b(this.selectedIdType, inputInternationalDbComponent.selectedIdType) && Intrinsics.b(this.idValue, inputInternationalDbComponent.idValue);
    }

    @NotNull
    public final C0729f getCountryOptionsController() {
        return this.countryOptionsController;
    }

    @NotNull
    public final S getCountrySelectComponent() {
        return this.countrySelectComponent;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputInternationalDb.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputInternationalDb.Attributes attributes = e().getAttributes();
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

    public final boolean getHideCountryField() {
        return this.hideCountryField;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        String str = this.selectedCountry;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedIdType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idValue;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    public final boolean getHideIdTypeField() {
        return this.hideIdTypeField;
    }

    public final List<IdOption> l() {
        Map<String, ? extends List<IdOption>> map = this.typesByCountryCode;
        if (map != null) {
            return map.get(this.selectedCountry);
        }
        return null;
    }

    @NotNull
    public final C0729f getIdTypeOptionsController() {
        return this.idTypeOptionsController;
    }

    public final S o() {
        List<IdOption> listL = l();
        if (listL == null) {
            return null;
        }
        return new f(listL);
    }

    public final String getIdValue() {
        return this.idValue;
    }

    @NotNull
    public final r getIdValueController() {
        return this.idValueController;
    }

    public final String getSelectedCountry() {
        return this.selectedCountry;
    }

    public final String getSelectedIdType() {
        return this.selectedIdType;
    }

    @NotNull
    public final InputInternationalDbComponent t(Option selectedCountry) {
        InputInternationalDbComponent inputInternationalDbComponentB = b(this, null, selectedCountry != null ? selectedCountry.getValue() : null, null, null, 13, null);
        inputInternationalDbComponentB.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentB.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentB.idValueController = this.idValueController;
        return inputInternationalDbComponentB;
    }

    @NotNull
    public String toString() {
        return "InputInternationalDbComponent(config=" + this.config + ", selectedCountry=" + this.selectedCountry + ", selectedIdType=" + this.selectedIdType + ", idValue=" + this.idValue + ")";
    }

    @NotNull
    public final InputInternationalDbComponent v(Option selectedIdType) {
        InputInternationalDbComponent inputInternationalDbComponentB = b(this, null, null, selectedIdType != null ? selectedIdType.getValue() : null, null, 11, null);
        inputInternationalDbComponentB.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentB.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentB.idValueController = this.idValueController;
        return inputInternationalDbComponentB;
    }

    @NotNull
    public final InputInternationalDbComponent w(String value) {
        InputInternationalDbComponent inputInternationalDbComponentB = b(this, null, null, null, value, 7, null);
        inputInternationalDbComponentB.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentB.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentB.idValueController = this.idValueController;
        return inputInternationalDbComponentB;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeString(this.selectedCountry);
        parcel.writeString(this.selectedIdType);
        parcel.writeString(this.idValue);
    }

    public InputInternationalDbComponent(InputInternationalDb inputInternationalDb, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            InputInternationalDb.Attributes attributes = inputInternationalDb.getAttributes();
            str = attributes != null ? attributes.getPrefillIdbCountry() : null;
        }
        if ((i & 4) != 0) {
            InputInternationalDb.Attributes attributes2 = inputInternationalDb.getAttributes();
            str2 = attributes2 != null ? attributes2.getPrefillIdbType() : null;
        }
        if ((i & 8) != 0) {
            InputInternationalDb.Attributes attributes3 = inputInternationalDb.getAttributes();
            str3 = attributes3 != null ? attributes3.getPrefillIdbValue() : null;
        }
        this(inputInternationalDb, str, str2, str3);
    }
}
