package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001\u0011BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J`\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u0010\n\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010.\u001a\u0004\b2\u00100\"\u0004\b3\u00104R\"\u0010\u000b\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010.\u001a\u0004\b6\u00100\"\u0004\b7\u00104R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u00100R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "ctaCard", "", "url", "", "autoCompleteOnDismiss", "shown", "showing", "hideWhenTappedOutside", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "screen", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;)V", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "i", "Ljava/lang/String;", "getUrl", "v", "Z", "c", "()Z", "w", "M0", "J0", "(Z)V", "y", "k1", "U", "z", "S0", "A", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "H0", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "B", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CreatePersonaSheetComponent implements SheetComponent {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CreatePersonaSheetComponent> CREATOR = new b();

    @NotNull
    private final UiComponentScreen screen;

    @NotNull
    private final CreatePersonaSheet config;

    @NotNull
    private final CreatePersonaSheet.CardCtaPage ctaCard;

    @NotNull
    private final String url;

    private final boolean autoCompleteOnDismiss;

    private boolean shown;

    private boolean showing;

    private final boolean hideWhenTappedOutside;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreatePersonaSheetComponent a(@NotNull CreatePersonaSheet config) {
            CreatePersonaSheet.Pages pages;
            CreatePersonaSheet.CardCtaPage ctaCard;
            CreatePersonaSheet.Attributes attributes;
            String url;
            Boolean autoCompleteOnDismiss;
            Intrinsics.checkNotNullParameter(config, "config");
            CreatePersonaSheet.Attributes attributes2 = config.getAttributes();
            if (attributes2 == null || (pages = attributes2.getPages()) == null || (ctaCard = pages.getCtaCard()) == null || (attributes = config.getAttributes()) == null || (url = attributes.getUrl()) == null) {
                return null;
            }
            CreatePersonaSheet.Attributes attributes3 = config.getAttributes();
            return new CreatePersonaSheetComponent(config, ctaCard, url, (attributes3 == null || (autoCompleteOnDismiss = attributes3.getAutoCompleteOnDismiss()) == null) ? false : autoCompleteOnDismiss.booleanValue(), false, false, false, null, 240, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CreatePersonaSheetComponent> {
        @Override
        @NotNull
        public final CreatePersonaSheetComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreatePersonaSheetComponent((CreatePersonaSheet) parcel.readParcelable(CreatePersonaSheetComponent.class.getClassLoader()), (CreatePersonaSheet.CardCtaPage) parcel.readParcelable(CreatePersonaSheetComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, UiComponentScreen.CREATOR.createFromParcel(parcel));
        }

        @Override
        @NotNull
        public final CreatePersonaSheetComponent[] newArray(int i) {
            return new CreatePersonaSheetComponent[i];
        }
    }

    public CreatePersonaSheetComponent(@NotNull CreatePersonaSheet createPersonaSheet, @NotNull CreatePersonaSheet.CardCtaPage cardCtaPage, @NotNull String str, boolean z, boolean z2, boolean z3, boolean z4, @NotNull UiComponentScreen uiComponentScreen) {
        Intrinsics.checkNotNullParameter(createPersonaSheet, "config");
        Intrinsics.checkNotNullParameter(cardCtaPage, "ctaCard");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(uiComponentScreen, "screen");
        this.config = createPersonaSheet;
        this.ctaCard = cardCtaPage;
        this.url = str;
        this.autoCompleteOnDismiss = z;
        this.shown = z2;
        this.showing = z3;
        this.hideWhenTappedOutside = z4;
        this.screen = uiComponentScreen;
    }

    @Override
    @NotNull
    public UiComponentScreen getScreen() {
        return this.screen;
    }

    @Override
    public void J0(boolean z) {
        this.shown = z;
    }

    @Override
    public boolean getShown() {
        return this.shown;
    }

    @Override
    public boolean getHideWhenTappedOutside() {
        return this.hideWhenTappedOutside;
    }

    @Override
    public void U(boolean z) {
        this.showing = z;
    }

    @NotNull
    public final CreatePersonaSheetComponent a(@NotNull CreatePersonaSheet config, @NotNull CreatePersonaSheet.CardCtaPage ctaCard, @NotNull String url, boolean autoCompleteOnDismiss, boolean shown, boolean showing, boolean hideWhenTappedOutside, @NotNull UiComponentScreen screen) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new CreatePersonaSheetComponent(config, ctaCard, url, autoCompleteOnDismiss, shown, showing, hideWhenTappedOutside, screen);
    }

    public final boolean getAutoCompleteOnDismiss() {
        return this.autoCompleteOnDismiss;
    }

    @Override
    @NotNull
    public CreatePersonaSheet e() {
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
        if (!(other instanceof CreatePersonaSheetComponent)) {
            return false;
        }
        CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) other;
        return Intrinsics.b(this.config, createPersonaSheetComponent.config) && Intrinsics.b(this.ctaCard, createPersonaSheetComponent.ctaCard) && Intrinsics.b(this.url, createPersonaSheetComponent.url) && this.autoCompleteOnDismiss == createPersonaSheetComponent.autoCompleteOnDismiss && this.shown == createPersonaSheetComponent.shown && this.showing == createPersonaSheetComponent.showing && this.hideWhenTappedOutside == createPersonaSheetComponent.hideWhenTappedOutside && Intrinsics.b(this.screen, createPersonaSheetComponent.screen);
    }

    @NotNull
    public final CreatePersonaSheet.CardCtaPage getCtaCard() {
        return this.ctaCard;
    }

    @Override
    @NotNull
    public String getName() {
        return SheetComponent.a.a(this);
    }

    public int hashCode() {
        return (((((((((((((this.config.hashCode() * 31) + this.ctaCard.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.autoCompleteOnDismiss)) * 31) + Boolean.hashCode(this.shown)) * 31) + Boolean.hashCode(this.showing)) * 31) + Boolean.hashCode(this.hideWhenTappedOutside)) * 31) + this.screen.hashCode();
    }

    @Override
    public boolean getShowing() {
        return this.showing;
    }

    @NotNull
    public String toString() {
        return "CreatePersonaSheetComponent(config=" + this.config + ", ctaCard=" + this.ctaCard + ", url=" + this.url + ", autoCompleteOnDismiss=" + this.autoCompleteOnDismiss + ", shown=" + this.shown + ", showing=" + this.showing + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ", screen=" + this.screen + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeParcelable(this.ctaCard, flags);
        parcel.writeString(this.url);
        parcel.writeInt(this.autoCompleteOnDismiss ? 1 : 0);
        parcel.writeInt(this.shown ? 1 : 0);
        parcel.writeInt(this.showing ? 1 : 0);
        parcel.writeInt(this.hideWhenTappedOutside ? 1 : 0);
        this.screen.writeToParcel(parcel, flags);
    }

    public CreatePersonaSheetComponent(CreatePersonaSheet createPersonaSheet, CreatePersonaSheet.CardCtaPage cardCtaPage, String str, boolean z, boolean z2, boolean z3, boolean z4, UiComponentScreen uiComponentScreen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        UiComponentScreen uiComponentScreenA;
        boolean z5 = (i & 16) != 0 ? false : z2;
        boolean z6 = (i & 32) != 0 ? false : z3;
        boolean z7 = (i & 64) != 0 ? false : z4;
        if ((i & 128) != 0) {
            List<UiComponentConfig> components = cardCtaPage.getUiStep().getConfig().getComponents();
            uiComponentScreenA = l9.b.a(new CtaCardPage(components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.b.e(components) : null, cardCtaPage.getUiStep().getStyles()));
        } else {
            uiComponentScreenA = uiComponentScreen;
        }
        this(createPersonaSheet, cardCtaPage, str, z, z5, z6, z7, uiComponentScreenA);
    }
}
