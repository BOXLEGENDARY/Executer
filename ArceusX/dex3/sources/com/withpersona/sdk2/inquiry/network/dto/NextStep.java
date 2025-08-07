package com.withpersona.sdk2.inquiry.network.dto;

import T9.a;
import android.os.Parcel;
import android.os.Parcelable;
import b8.b;
import com.squareup.moshi.f;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ha.C0460h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class NextStep {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String name;

    @i(generateAdapter = true)
    public static final class CancelDialog implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CancelDialog> CREATOR = new Creator();
        private final String btnResume;
        private final String btnSubmit;
        private final String prompt;
        private final String title;

        public static final class Creator implements Parcelable.Creator<CancelDialog> {
            @Override
            @NotNull
            public final CancelDialog createFromParcel(@NotNull Parcel parcel) {
                return new CancelDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final CancelDialog[] newArray(int i) {
                return new CancelDialog[i];
            }
        }

        public CancelDialog(String str, String str2, String str3, String str4) {
            this.title = str;
            this.prompt = str2;
            this.btnSubmit = str3;
            this.btnResume = str4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getBtnResume() {
            return this.btnResume;
        }

        public final String getBtnSubmit() {
            return this.btnSubmit;
        }

        public final String getPrompt() {
            return this.prompt;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.prompt);
            parcel.writeString(this.btnSubmit);
            parcel.writeString(this.btnResume);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h.e createAdapter() {
            return b.b(NextStep.class, "type").c(Unknown.INSTANCE).e(Ui.class, "ui").e(GovernmentId.class, "government_id").e(Selfie.class, "selfie").e(Document.class, "document").e(Complete.class, "complete");
        }

        private Companion() {
        }
    }

    @i(generateAdapter = true)
    public static final class Complete extends NextStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Complete> CREATOR = new Creator();

        @NotNull
        private final String name;

        public static final class Creator implements Parcelable.Creator<Complete> {
            @Override
            @NotNull
            public final Complete createFromParcel(@NotNull Parcel parcel) {
                return new Complete(parcel.readString());
            }

            @Override
            @NotNull
            public final Complete[] newArray(int i) {
                return new Complete[i];
            }
        }

        public Complete(@NotNull String str) {
            super(str, null);
            this.name = str;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.name);
        }
    }

    @i(generateAdapter = true)
    public static final class Document extends NextStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new Creator();

        @NotNull
        private final Config config;

        @NotNull
        private final String name;
        private final StepStyles.DocumentStepStyle styles;

        @i(generateAdapter = true)
        public static final class AssetConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final PendingPage pendingPage;
            private final PromptPage promptPage;

            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                @Override
                @NotNull
                public final AssetConfig createFromParcel(@NotNull Parcel parcel) {
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                @Override
                @NotNull
                public final AssetConfig[] newArray(int i) {
                    return new AssetConfig[i];
                }
            }

            @i(generateAdapter = true)
            public static final class PendingPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage loadingPictograph;

                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    @Override
                    @NotNull
                    public final PendingPage createFromParcel(@NotNull Parcel parcel) {
                        return new PendingPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final PendingPage[] newArray(int i) {
                        return new PendingPage[i];
                    }
                }

                public PendingPage() {
                    RemoteImage remoteImage = null;
                    this(remoteImage, remoteImage, 3, remoteImage);
                }

                public static PendingPage copy$default(PendingPage pendingPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                public final RemoteImage component1() {
                    return this.headerPictograph;
                }

                public final RemoteImage component2() {
                    return this.loadingPictograph;
                }

                @NotNull
                public final PendingPage copy(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    return new PendingPage(remoteImage, remoteImage2);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) obj;
                    return Intrinsics.b(this.headerPictograph, pendingPage.headerPictograph) && Intrinsics.b(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                }

                public PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                public PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2);
                }
            }

            @i(generateAdapter = true)
            public static final class PromptPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final RemoteImage documentPictograph;
                private final RemoteImage headerPictograph;

                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    @Override
                    @NotNull
                    public final PromptPage createFromParcel(@NotNull Parcel parcel) {
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final PromptPage[] newArray(int i) {
                        return new PromptPage[i];
                    }
                }

                public PromptPage() {
                    RemoteImage remoteImage = null;
                    this(remoteImage, remoteImage, 3, remoteImage);
                }

                public static PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = promptPage.documentPictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage2);
                }

                public final RemoteImage component1() {
                    return this.headerPictograph;
                }

                public final RemoteImage component2() {
                    return this.documentPictograph;
                }

                @NotNull
                public final PromptPage copy(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    return new PromptPage(remoteImage, remoteImage2);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) obj;
                    return Intrinsics.b(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.b(this.documentPictograph, promptPage.documentPictograph);
                }

                public final RemoteImage getDocumentPictograph() {
                    return this.documentPictograph;
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.documentPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", documentPictograph=" + this.documentPictograph + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.documentPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.documentPictograph = remoteImage2;
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2);
                }
            }

            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, PendingPage pendingPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i & 2) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                return assetConfig.copy(promptPage, pendingPage);
            }

            public final PromptPage component1() {
                return this.promptPage;
            }

            public final PendingPage component2() {
                return this.pendingPage;
            }

            @NotNull
            public final AssetConfig copy(PromptPage promptPage, PendingPage pendingPage) {
                return new AssetConfig(promptPage, pendingPage);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) obj;
                return Intrinsics.b(this.promptPage, assetConfig.promptPage) && Intrinsics.b(this.pendingPage, assetConfig.pendingPage);
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int iHashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                PendingPage pendingPage = this.pendingPage;
                return iHashCode + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", pendingPage=" + this.pendingPage + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, i);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    pendingPage.writeToParcel(parcel, i);
                }
            }

            public AssetConfig(PromptPage promptPage, PendingPage pendingPage) {
                this.promptPage = promptPage;
                this.pendingPage = pendingPage;
            }

            public AssetConfig(PromptPage promptPage, PendingPage pendingPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : promptPage, (i & 2) != 0 ? null : pendingPage);
            }
        }

        @i(generateAdapter = true)
        public static final class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new Creator();
            private final AssetConfig assets;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final int documentFileLimit;
            private final String documentId;

            @NotNull
            private final String fieldKeyDocument;

            @NotNull
            private final String kind;

            @NotNull
            private final Localizations localizations;
            private final Pages pages;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            @NotNull
            private final StartPage startPage;

            public static final class Creator implements Parcelable.Creator<Config> {
                @Override
                @NotNull
                public final Config createFromParcel(@NotNull Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Config(boolValueOf, boolValueOf2, parcel.readInt(), parcel.readString(), StartPage.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Localizations.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Pages.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AssetConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PendingPageTextPosition.valueOf(parcel.readString()));
                }

                @Override
                @NotNull
                public final Config[] newArray(int i) {
                    return new Config[i];
                }
            }

            public Config(Boolean bool, Boolean bool2, int i, String str, @NotNull StartPage startPage, @NotNull String str2, @NotNull String str3, @NotNull Localizations localizations, Pages pages, AssetConfig assetConfig, PendingPageTextPosition pendingPageTextPosition) {
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.documentFileLimit = i;
                this.documentId = str;
                this.startPage = startPage;
                this.fieldKeyDocument = str2;
                this.kind = str3;
                this.localizations = localizations;
                this.pages = pages;
                this.assets = assetConfig;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final int getDocumentFileLimit() {
                return this.documentFileLimit;
            }

            public final String getDocumentId() {
                return this.documentId;
            }

            @NotNull
            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            @NotNull
            public final String getKind() {
                return this.kind;
            }

            @NotNull
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final Pages getPages() {
                return this.pages;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @NotNull
            public final StartPage getStartPage() {
                return this.startPage;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                parcel.writeInt(this.documentFileLimit);
                parcel.writeString(this.documentId);
                parcel.writeString(this.startPage.name());
                parcel.writeString(this.fieldKeyDocument);
                parcel.writeString(this.kind);
                this.localizations.writeToParcel(parcel, i);
                Pages pages = this.pages;
                if (pages == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    pages.writeToParcel(parcel, i);
                }
                AssetConfig assetConfig = this.assets;
                if (assetConfig == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    assetConfig.writeToParcel(parcel, i);
                }
                PendingPageTextPosition pendingPageTextPosition = this.pendingPageTextVerticalPosition;
                if (pendingPageTextPosition == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(pendingPageTextPosition.name());
                }
            }
        }

        public static final class Creator implements Parcelable.Creator<Document> {
            @Override
            @NotNull
            public final Document createFromParcel(@NotNull Parcel parcel) {
                return new Document(parcel.readString(), parcel.readInt() == 0 ? null : StepStyles.DocumentStepStyle.CREATOR.createFromParcel(parcel), Config.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final Document[] newArray(int i) {
                return new Document[i];
            }
        }

        @i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;

            @NotNull
            private final PendingPage pendingPage;

            @NotNull
            private final PromptPage promptPage;

            public static final class Creator implements Parcelable.Creator<Localizations> {
                @Override
                @NotNull
                public final Localizations createFromParcel(@NotNull Parcel parcel) {
                    return new Localizations(PendingPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }

            public Localizations(@NotNull PendingPage pendingPage, @NotNull PromptPage promptPage, CancelDialog cancelDialog) {
                this.pendingPage = pendingPage;
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @NotNull
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                this.pendingPage.writeToParcel(parcel, i);
                this.promptPage.writeToParcel(parcel, i);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, i);
                }
            }
        }

        @i(generateAdapter = true)
        public static final class Pages implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Pages> CREATOR = new Creator();
            private final DocumentPages document;

            public static final class Creator implements Parcelable.Creator<Pages> {
                @Override
                @NotNull
                public final Pages createFromParcel(@NotNull Parcel parcel) {
                    return new Pages(parcel.readInt() == 0 ? null : DocumentPages.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final Pages[] newArray(int i) {
                    return new Pages[i];
                }
            }

            @i(generateAdapter = true)
            public static final class DocumentPages implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<DocumentPages> CREATOR = new Creator();
                private final DocumentStartPage prompt;
                private final UploadOptionsDialog uploadOptionsDialog;

                public static final class Creator implements Parcelable.Creator<DocumentPages> {
                    @Override
                    @NotNull
                    public final DocumentPages createFromParcel(@NotNull Parcel parcel) {
                        return new DocumentPages(parcel.readInt() == 0 ? null : DocumentStartPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UploadOptionsDialog.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final DocumentPages[] newArray(int i) {
                        return new DocumentPages[i];
                    }
                }

                public DocumentPages(DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog) {
                    this.prompt = documentStartPage;
                    this.uploadOptionsDialog = uploadOptionsDialog;
                }

                public static DocumentPages copy$default(DocumentPages documentPages, DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog, int i, Object obj) {
                    if ((i & 1) != 0) {
                        documentStartPage = documentPages.prompt;
                    }
                    if ((i & 2) != 0) {
                        uploadOptionsDialog = documentPages.uploadOptionsDialog;
                    }
                    return documentPages.copy(documentStartPage, uploadOptionsDialog);
                }

                public final DocumentStartPage component1() {
                    return this.prompt;
                }

                public final UploadOptionsDialog component2() {
                    return this.uploadOptionsDialog;
                }

                @NotNull
                public final DocumentPages copy(DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog) {
                    return new DocumentPages(documentStartPage, uploadOptionsDialog);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DocumentPages)) {
                        return false;
                    }
                    DocumentPages documentPages = (DocumentPages) obj;
                    return Intrinsics.b(this.prompt, documentPages.prompt) && Intrinsics.b(this.uploadOptionsDialog, documentPages.uploadOptionsDialog);
                }

                public final DocumentStartPage getPrompt() {
                    return this.prompt;
                }

                public final UploadOptionsDialog getUploadOptionsDialog() {
                    return this.uploadOptionsDialog;
                }

                public int hashCode() {
                    DocumentStartPage documentStartPage = this.prompt;
                    int iHashCode = (documentStartPage == null ? 0 : documentStartPage.hashCode()) * 31;
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    return iHashCode + (uploadOptionsDialog != null ? uploadOptionsDialog.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "DocumentPages(prompt=" + this.prompt + ", uploadOptionsDialog=" + this.uploadOptionsDialog + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    DocumentStartPage documentStartPage = this.prompt;
                    if (documentStartPage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        documentStartPage.writeToParcel(parcel, i);
                    }
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    if (uploadOptionsDialog == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        uploadOptionsDialog.writeToParcel(parcel, i);
                    }
                }
            }

            @i(generateAdapter = true)
            public static final class DocumentStartPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<DocumentStartPage> CREATOR = new Creator();
                private final ComponentNameMapping componentNameMapping;

                @NotNull
                private final Ui uiStep;

                @i(generateAdapter = true)
                public static final class ComponentNameMapping implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
                    private final String buttonCamera;
                    private final String buttonFilePicker;
                    private final String buttonPhotoLibrary;
                    private final String buttonUploadOptions;

                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        @Override
                        @NotNull
                        public final ComponentNameMapping createFromParcel(@NotNull Parcel parcel) {
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        @Override
                        @NotNull
                        public final ComponentNameMapping[] newArray(int i) {
                            return new ComponentNameMapping[i];
                        }
                    }

                    public ComponentNameMapping(String str, String str2, String str3, String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonUploadOptions = str4;
                    }

                    public static ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i & 8) != 0) {
                            str4 = componentNameMapping.buttonUploadOptions;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    public final String component1() {
                        return this.buttonFilePicker;
                    }

                    public final String component2() {
                        return this.buttonPhotoLibrary;
                    }

                    public final String component3() {
                        return this.buttonCamera;
                    }

                    public final String component4() {
                        return this.buttonUploadOptions;
                    }

                    @NotNull
                    public final ComponentNameMapping copy(String str, String str2, String str3, String str4) {
                        return new ComponentNameMapping(str, str2, str3, str4);
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ComponentNameMapping)) {
                            return false;
                        }
                        ComponentNameMapping componentNameMapping = (ComponentNameMapping) obj;
                        return Intrinsics.b(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && Intrinsics.b(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && Intrinsics.b(this.buttonCamera, componentNameMapping.buttonCamera) && Intrinsics.b(this.buttonUploadOptions, componentNameMapping.buttonUploadOptions);
                    }

                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    public final String getButtonUploadOptions() {
                        return this.buttonUploadOptions;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonUploadOptions;
                        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "ComponentNameMapping(buttonFilePicker=" + this.buttonFilePicker + ", buttonPhotoLibrary=" + this.buttonPhotoLibrary + ", buttonCamera=" + this.buttonCamera + ", buttonUploadOptions=" + this.buttonUploadOptions + ")";
                    }

                    @Override
                    public void writeToParcel(@NotNull Parcel parcel, int i) {
                        parcel.writeString(this.buttonFilePicker);
                        parcel.writeString(this.buttonPhotoLibrary);
                        parcel.writeString(this.buttonCamera);
                        parcel.writeString(this.buttonUploadOptions);
                    }
                }

                public static final class Creator implements Parcelable.Creator<DocumentStartPage> {
                    @Override
                    @NotNull
                    public final DocumentStartPage createFromParcel(@NotNull Parcel parcel) {
                        return new DocumentStartPage(Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    @Override
                    @NotNull
                    public final DocumentStartPage[] newArray(int i) {
                        return new DocumentStartPage[i];
                    }
                }

                public DocumentStartPage(@NotNull Ui ui, ComponentNameMapping componentNameMapping) {
                    this.uiStep = ui;
                    this.componentNameMapping = componentNameMapping;
                }

                public static DocumentStartPage copy$default(DocumentStartPage documentStartPage, Ui ui, ComponentNameMapping componentNameMapping, int i, Object obj) {
                    if ((i & 1) != 0) {
                        ui = documentStartPage.uiStep;
                    }
                    if ((i & 2) != 0) {
                        componentNameMapping = documentStartPage.componentNameMapping;
                    }
                    return documentStartPage.copy(ui, componentNameMapping);
                }

                @NotNull
                public final Ui component1() {
                    return this.uiStep;
                }

                public final ComponentNameMapping component2() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final DocumentStartPage copy(@NotNull Ui ui, ComponentNameMapping componentNameMapping) {
                    return new DocumentStartPage(ui, componentNameMapping);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DocumentStartPage)) {
                        return false;
                    }
                    DocumentStartPage documentStartPage = (DocumentStartPage) obj;
                    return Intrinsics.b(this.uiStep, documentStartPage.uiStep) && Intrinsics.b(this.componentNameMapping, documentStartPage.componentNameMapping);
                }

                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int iHashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return iHashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                @NotNull
                public String toString() {
                    return "DocumentStartPage(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    this.uiStep.writeToParcel(parcel, i);
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    if (componentNameMapping == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        componentNameMapping.writeToParcel(parcel, i);
                    }
                }
            }

            @i(generateAdapter = true)
            public static final class UploadOptionsDialog implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<UploadOptionsDialog> CREATOR = new Creator();
                private final ComponentNameMapping componentNameMapping;

                @NotNull
                private final Ui uiStep;

                @i(generateAdapter = true)
                public static final class ComponentNameMapping implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
                    private final String buttonCamera;
                    private final String buttonCancel;
                    private final String buttonFilePicker;
                    private final String buttonPhotoLibrary;

                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        @Override
                        @NotNull
                        public final ComponentNameMapping createFromParcel(@NotNull Parcel parcel) {
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        @Override
                        @NotNull
                        public final ComponentNameMapping[] newArray(int i) {
                            return new ComponentNameMapping[i];
                        }
                    }

                    public ComponentNameMapping(String str, String str2, String str3, String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonCancel = str4;
                    }

                    public static ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i & 8) != 0) {
                            str4 = componentNameMapping.buttonCancel;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    public final String component1() {
                        return this.buttonFilePicker;
                    }

                    public final String component2() {
                        return this.buttonPhotoLibrary;
                    }

                    public final String component3() {
                        return this.buttonCamera;
                    }

                    public final String component4() {
                        return this.buttonCancel;
                    }

                    @NotNull
                    public final ComponentNameMapping copy(String str, String str2, String str3, String str4) {
                        return new ComponentNameMapping(str, str2, str3, str4);
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ComponentNameMapping)) {
                            return false;
                        }
                        ComponentNameMapping componentNameMapping = (ComponentNameMapping) obj;
                        return Intrinsics.b(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && Intrinsics.b(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && Intrinsics.b(this.buttonCamera, componentNameMapping.buttonCamera) && Intrinsics.b(this.buttonCancel, componentNameMapping.buttonCancel);
                    }

                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    public final String getButtonCancel() {
                        return this.buttonCancel;
                    }

                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonCancel;
                        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "ComponentNameMapping(buttonFilePicker=" + this.buttonFilePicker + ", buttonPhotoLibrary=" + this.buttonPhotoLibrary + ", buttonCamera=" + this.buttonCamera + ", buttonCancel=" + this.buttonCancel + ")";
                    }

                    @Override
                    public void writeToParcel(@NotNull Parcel parcel, int i) {
                        parcel.writeString(this.buttonFilePicker);
                        parcel.writeString(this.buttonPhotoLibrary);
                        parcel.writeString(this.buttonCamera);
                        parcel.writeString(this.buttonCancel);
                    }
                }

                public static final class Creator implements Parcelable.Creator<UploadOptionsDialog> {
                    @Override
                    @NotNull
                    public final UploadOptionsDialog createFromParcel(@NotNull Parcel parcel) {
                        return new UploadOptionsDialog(Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    @Override
                    @NotNull
                    public final UploadOptionsDialog[] newArray(int i) {
                        return new UploadOptionsDialog[i];
                    }
                }

                public UploadOptionsDialog(@NotNull Ui ui, ComponentNameMapping componentNameMapping) {
                    this.uiStep = ui;
                    this.componentNameMapping = componentNameMapping;
                }

                public static UploadOptionsDialog copy$default(UploadOptionsDialog uploadOptionsDialog, Ui ui, ComponentNameMapping componentNameMapping, int i, Object obj) {
                    if ((i & 1) != 0) {
                        ui = uploadOptionsDialog.uiStep;
                    }
                    if ((i & 2) != 0) {
                        componentNameMapping = uploadOptionsDialog.componentNameMapping;
                    }
                    return uploadOptionsDialog.copy(ui, componentNameMapping);
                }

                @NotNull
                public final Ui component1() {
                    return this.uiStep;
                }

                public final ComponentNameMapping component2() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final UploadOptionsDialog copy(@NotNull Ui ui, ComponentNameMapping componentNameMapping) {
                    return new UploadOptionsDialog(ui, componentNameMapping);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UploadOptionsDialog)) {
                        return false;
                    }
                    UploadOptionsDialog uploadOptionsDialog = (UploadOptionsDialog) obj;
                    return Intrinsics.b(this.uiStep, uploadOptionsDialog.uiStep) && Intrinsics.b(this.componentNameMapping, uploadOptionsDialog.componentNameMapping);
                }

                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                @NotNull
                public final Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int iHashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return iHashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                @NotNull
                public String toString() {
                    return "UploadOptionsDialog(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    this.uiStep.writeToParcel(parcel, i);
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    if (componentNameMapping == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        componentNameMapping.writeToParcel(parcel, i);
                    }
                }
            }

            public Pages(DocumentPages documentPages) {
                this.document = documentPages;
            }

            public static Pages copy$default(Pages pages, DocumentPages documentPages, int i, Object obj) {
                if ((i & 1) != 0) {
                    documentPages = pages.document;
                }
                return pages.copy(documentPages);
            }

            public final DocumentPages component1() {
                return this.document;
            }

            @NotNull
            public final Pages copy(DocumentPages documentPages) {
                return new Pages(documentPages);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Pages) && Intrinsics.b(this.document, ((Pages) obj).document);
            }

            public final DocumentPages getDocument() {
                return this.document;
            }

            public int hashCode() {
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    return 0;
                }
                return documentPages.hashCode();
            }

            @NotNull
            public String toString() {
                return "Pages(document=" + this.document + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    documentPages.writeToParcel(parcel, i);
                }
            }
        }

        @i(generateAdapter = true)
        public static final class PendingPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String description;
            private final String title;

            public static final class Creator implements Parcelable.Creator<PendingPage> {
                @Override
                @NotNull
                public final PendingPage createFromParcel(@NotNull Parcel parcel) {
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final PendingPage[] newArray(int i) {
                    return new PendingPage[i];
                }
            }

            public PendingPage(String str, String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        @i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String btnCapture;
            private final String btnSubmit;
            private final String btnUpload;
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String captureOptionsDialogTitle;
            private final String disclaimer;
            private final String prompt;
            private final String title;

            public static final class Creator implements Parcelable.Creator<PromptPage> {
                @Override
                @NotNull
                public final PromptPage createFromParcel(@NotNull Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }

            public PromptPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @g(name = "cameraPermissionsBtnContinueMobile") String str10, @g(name = "cameraPermissionsBtnCancel") String str11) {
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.captureOptionsDialogTitle = str4;
                this.btnCapture = str5;
                this.btnUpload = str6;
                this.btnSubmit = str7;
                this.cameraPermissionsTitle = str8;
                this.cameraPermissionsPrompt = str9;
                this.cameraPermissionsAllowButtonText = str10;
                this.cameraPermissionsCancelButtonText = str11;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getBtnCapture() {
                return this.btnCapture;
            }

            public final String getBtnSubmit() {
                return this.btnSubmit;
            }

            public final String getBtnUpload() {
                return this.btnUpload;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getCaptureOptionsDialogTitle() {
                return this.captureOptionsDialogTitle;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.disclaimer);
                parcel.writeString(this.captureOptionsDialogTitle);
                parcel.writeString(this.btnCapture);
                parcel.writeString(this.btnUpload);
                parcel.writeString(this.btnSubmit);
                parcel.writeString(this.cameraPermissionsTitle);
                parcel.writeString(this.cameraPermissionsPrompt);
                parcel.writeString(this.cameraPermissionsAllowButtonText);
                parcel.writeString(this.cameraPermissionsCancelButtonText);
            }
        }

        @i(generateAdapter = false)
        public static final class StartPage {
            private static final a $ENTRIES;
            private static final StartPage[] $VALUES;

            @g(name = "prompt")
            public static final StartPage PROMPT = new StartPage("PROMPT", 0);

            @g(name = "review")
            public static final StartPage REVIEW = new StartPage("REVIEW", 1);

            private static final StartPage[] $values() {
                return new StartPage[]{PROMPT, REVIEW};
            }

            static {
                StartPage[] startPageArr$values = $values();
                $VALUES = startPageArr$values;
                $ENTRIES = T9.b.a(startPageArr$values);
            }

            private StartPage(String str, int i) {
            }

            @NotNull
            public static a<StartPage> getEntries() {
                return $ENTRIES;
            }

            public static StartPage valueOf(String str) {
                return (StartPage) Enum.valueOf(StartPage.class, str);
            }

            public static StartPage[] values() {
                return (StartPage[]) $VALUES.clone();
            }
        }

        public Document(@NotNull String str, StepStyles.DocumentStepStyle documentStepStyle, @NotNull Config config) {
            super(str, null);
            this.name = str;
            this.styles = documentStepStyle;
            this.config = config;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.name);
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            if (documentStepStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepStyle.writeToParcel(parcel, i);
            }
            this.config.writeToParcel(parcel, i);
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentId extends NextStep {

        @NotNull
        private final Config config;

        @NotNull
        private final String name;
        private final StepStyles.GovernmentIdStepStyle styles;

        @i(generateAdapter = true)
        public static final class AssetConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final CapturePage capturePage;
            private final CheckPage checkPage;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;
            private final SelectPage selectPage;

            @i(generateAdapter = true)
            public static final class CapturePage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
                private final RemoteImage barcodeHelpModalPictograph;
                private final RemoteImage barcodePdf417Pictograph;
                private final RemoteImage idBackHelpModalPictograph;
                private final RemoteImage idBackPictograph;
                private final RemoteImage idFrontHelpModalPictograph;
                private final RemoteImage idFrontPictograph;
                private final RemoteImage passportFrontPictograph;
                private final RemoteImage passportSignaturePictograph;

                public static final class Creator implements Parcelable.Creator<CapturePage> {
                    @Override
                    @NotNull
                    public final CapturePage createFromParcel(@NotNull Parcel parcel) {
                        return new CapturePage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final CapturePage[] newArray(int i) {
                        return new CapturePage[i];
                    }
                }

                public CapturePage() {
                    this(null, null, null, null, null, null, null, null, 255, null);
                }

                public final RemoteImage component1() {
                    return this.idFrontPictograph;
                }

                public final RemoteImage component2() {
                    return this.idBackPictograph;
                }

                public final RemoteImage component3() {
                    return this.barcodePdf417Pictograph;
                }

                public final RemoteImage component4() {
                    return this.passportFrontPictograph;
                }

                public final RemoteImage component5() {
                    return this.passportSignaturePictograph;
                }

                public final RemoteImage component6() {
                    return this.idFrontHelpModalPictograph;
                }

                public final RemoteImage component7() {
                    return this.idBackHelpModalPictograph;
                }

                public final RemoteImage component8() {
                    return this.barcodeHelpModalPictograph;
                }

                @NotNull
                public final CapturePage copy(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8) {
                    return new CapturePage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6, remoteImage7, remoteImage8);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CapturePage)) {
                        return false;
                    }
                    CapturePage capturePage = (CapturePage) obj;
                    return Intrinsics.b(this.idFrontPictograph, capturePage.idFrontPictograph) && Intrinsics.b(this.idBackPictograph, capturePage.idBackPictograph) && Intrinsics.b(this.barcodePdf417Pictograph, capturePage.barcodePdf417Pictograph) && Intrinsics.b(this.passportFrontPictograph, capturePage.passportFrontPictograph) && Intrinsics.b(this.passportSignaturePictograph, capturePage.passportSignaturePictograph) && Intrinsics.b(this.idFrontHelpModalPictograph, capturePage.idFrontHelpModalPictograph) && Intrinsics.b(this.idBackHelpModalPictograph, capturePage.idBackHelpModalPictograph) && Intrinsics.b(this.barcodeHelpModalPictograph, capturePage.barcodeHelpModalPictograph);
                }

                public final RemoteImage getBarcodeHelpModalPictograph() {
                    return this.barcodeHelpModalPictograph;
                }

                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                public final RemoteImage getIdBackHelpModalPictograph() {
                    return this.idBackHelpModalPictograph;
                }

                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                public final RemoteImage getIdFrontHelpModalPictograph() {
                    return this.idFrontHelpModalPictograph;
                }

                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.idFrontPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.idBackPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.passportFrontPictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    int iHashCode5 = (iHashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    int iHashCode6 = (iHashCode5 + (remoteImage6 == null ? 0 : remoteImage6.hashCode())) * 31;
                    RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    int iHashCode7 = (iHashCode6 + (remoteImage7 == null ? 0 : remoteImage7.hashCode())) * 31;
                    RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    return iHashCode7 + (remoteImage8 != null ? remoteImage8.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "CapturePage(idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + ", idFrontHelpModalPictograph=" + this.idFrontHelpModalPictograph + ", idBackHelpModalPictograph=" + this.idBackHelpModalPictograph + ", barcodeHelpModalPictograph=" + this.barcodeHelpModalPictograph + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.idFrontPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.idBackPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage4 = this.passportFrontPictograph;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    if (remoteImage6 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage6.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    if (remoteImage7 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage7.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    if (remoteImage8 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage8.writeToParcel(parcel, i);
                    }
                }

                public CapturePage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8) {
                    this.idFrontPictograph = remoteImage;
                    this.idBackPictograph = remoteImage2;
                    this.barcodePdf417Pictograph = remoteImage3;
                    this.passportFrontPictograph = remoteImage4;
                    this.passportSignaturePictograph = remoteImage5;
                    this.idFrontHelpModalPictograph = remoteImage6;
                    this.idBackHelpModalPictograph = remoteImage7;
                    this.barcodeHelpModalPictograph = remoteImage8;
                }

                public CapturePage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, RemoteImage remoteImage7, RemoteImage remoteImage8, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5, (i & 32) != 0 ? null : remoteImage6, (i & 64) != 0 ? null : remoteImage7, (i & 128) == 0 ? remoteImage8 : null);
                }
            }

            @i(generateAdapter = true)
            public static final class CheckPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();
                private final RemoteImage iconFile;

                public static final class Creator implements Parcelable.Creator<CheckPage> {
                    @Override
                    @NotNull
                    public final CheckPage createFromParcel(@NotNull Parcel parcel) {
                        return new CheckPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel));
                    }

                    @Override
                    @NotNull
                    public final CheckPage[] newArray(int i) {
                        return new CheckPage[i];
                    }
                }

                public CheckPage() {
                    RemoteImage remoteImage = null;
                    this(remoteImage, 1, remoteImage);
                }

                public static CheckPage copy$default(CheckPage checkPage, RemoteImage remoteImage, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = checkPage.iconFile;
                    }
                    return checkPage.copy(remoteImage);
                }

                public final RemoteImage component1() {
                    return this.iconFile;
                }

                @NotNull
                public final CheckPage copy(RemoteImage remoteImage) {
                    return new CheckPage(remoteImage);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CheckPage) && Intrinsics.b(this.iconFile, ((CheckPage) obj).iconFile);
                }

                public final RemoteImage getIconFile() {
                    return this.iconFile;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        return 0;
                    }
                    return remoteImage.hashCode();
                }

                @NotNull
                public String toString() {
                    return "CheckPage(iconFile=" + this.iconFile + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                }

                public CheckPage(RemoteImage remoteImage) {
                    this.iconFile = remoteImage;
                }

                public CheckPage(RemoteImage remoteImage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage);
                }
            }

            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                @Override
                @NotNull
                public final AssetConfig createFromParcel(@NotNull Parcel parcel) {
                    return new AssetConfig(parcel.readInt() == 0 ? null : SelectPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CapturePage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CheckPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                @Override
                @NotNull
                public final AssetConfig[] newArray(int i) {
                    return new AssetConfig[i];
                }
            }

            @i(generateAdapter = true)
            public static final class PendingPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage loadingPictograph;

                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    @Override
                    @NotNull
                    public final PendingPage createFromParcel(@NotNull Parcel parcel) {
                        return new PendingPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final PendingPage[] newArray(int i) {
                        return new PendingPage[i];
                    }
                }

                public PendingPage() {
                    RemoteImage remoteImage = null;
                    this(remoteImage, remoteImage, 3, remoteImage);
                }

                public static PendingPage copy$default(PendingPage pendingPage, RemoteImage remoteImage, RemoteImage remoteImage2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                public final RemoteImage component1() {
                    return this.headerPictograph;
                }

                public final RemoteImage component2() {
                    return this.loadingPictograph;
                }

                @NotNull
                public final PendingPage copy(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    return new PendingPage(remoteImage, remoteImage2);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) obj;
                    return Intrinsics.b(this.headerPictograph, pendingPage.headerPictograph) && Intrinsics.b(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                }

                public PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                public PendingPage(RemoteImage remoteImage, RemoteImage remoteImage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2);
                }
            }

            @i(generateAdapter = true)
            public static final class PromptPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final RemoteImage barcodePdf417Pictograph;
                private final RemoteImage headerPictograph;
                private final RemoteImage idBackPictograph;
                private final RemoteImage idFrontPictograph;
                private final RemoteImage passportFrontPictograph;
                private final RemoteImage passportSignaturePictograph;

                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    @Override
                    @NotNull
                    public final PromptPage createFromParcel(@NotNull Parcel parcel) {
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final PromptPage[] newArray(int i) {
                        return new PromptPage[i];
                    }
                }

                public PromptPage() {
                    this(null, null, null, null, null, null, 63, null);
                }

                public static PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = promptPage.idFrontPictograph;
                    }
                    RemoteImage remoteImage7 = remoteImage2;
                    if ((i & 4) != 0) {
                        remoteImage3 = promptPage.idBackPictograph;
                    }
                    RemoteImage remoteImage8 = remoteImage3;
                    if ((i & 8) != 0) {
                        remoteImage4 = promptPage.barcodePdf417Pictograph;
                    }
                    RemoteImage remoteImage9 = remoteImage4;
                    if ((i & 16) != 0) {
                        remoteImage5 = promptPage.passportFrontPictograph;
                    }
                    RemoteImage remoteImage10 = remoteImage5;
                    if ((i & 32) != 0) {
                        remoteImage6 = promptPage.passportSignaturePictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage7, remoteImage8, remoteImage9, remoteImage10, remoteImage6);
                }

                public final RemoteImage component1() {
                    return this.headerPictograph;
                }

                public final RemoteImage component2() {
                    return this.idFrontPictograph;
                }

                public final RemoteImage component3() {
                    return this.idBackPictograph;
                }

                public final RemoteImage component4() {
                    return this.barcodePdf417Pictograph;
                }

                public final RemoteImage component5() {
                    return this.passportFrontPictograph;
                }

                public final RemoteImage component6() {
                    return this.passportSignaturePictograph;
                }

                @NotNull
                public final PromptPage copy(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6) {
                    return new PromptPage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) obj;
                    return Intrinsics.b(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.b(this.idFrontPictograph, promptPage.idFrontPictograph) && Intrinsics.b(this.idBackPictograph, promptPage.idBackPictograph) && Intrinsics.b(this.barcodePdf417Pictograph, promptPage.barcodePdf417Pictograph) && Intrinsics.b(this.passportFrontPictograph, promptPage.passportFrontPictograph) && Intrinsics.b(this.passportSignaturePictograph, promptPage.passportSignaturePictograph);
                }

                public final RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                public final RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                public final RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                public final RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.idFrontPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.idBackPictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.passportFrontPictograph;
                    int iHashCode5 = (iHashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    return iHashCode5 + (remoteImage6 != null ? remoteImage6.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.idFrontPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage3 = this.idBackPictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage5 = this.passportFrontPictograph;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    if (remoteImage6 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage6.writeToParcel(parcel, i);
                    }
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6) {
                    this.headerPictograph = remoteImage;
                    this.idFrontPictograph = remoteImage2;
                    this.idBackPictograph = remoteImage3;
                    this.barcodePdf417Pictograph = remoteImage4;
                    this.passportFrontPictograph = remoteImage5;
                    this.passportSignaturePictograph = remoteImage6;
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, RemoteImage remoteImage6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5, (i & 32) != 0 ? null : remoteImage6);
                }
            }

            @i(generateAdapter = true)
            public static final class SelectPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage iconDriversLicense;
                private final RemoteImage iconGovernmentId;
                private final RemoteImage iconNationalId;
                private final RemoteImage iconPassport;

                public static final class Creator implements Parcelable.Creator<SelectPage> {
                    @Override
                    @NotNull
                    public final SelectPage createFromParcel(@NotNull Parcel parcel) {
                        return new SelectPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final SelectPage[] newArray(int i) {
                        return new SelectPage[i];
                    }
                }

                public SelectPage() {
                    this(null, null, null, null, null, 31, null);
                }

                public static SelectPage copy$default(SelectPage selectPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = selectPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = selectPage.iconDriversLicense;
                    }
                    RemoteImage remoteImage6 = remoteImage2;
                    if ((i & 4) != 0) {
                        remoteImage3 = selectPage.iconPassport;
                    }
                    RemoteImage remoteImage7 = remoteImage3;
                    if ((i & 8) != 0) {
                        remoteImage4 = selectPage.iconNationalId;
                    }
                    RemoteImage remoteImage8 = remoteImage4;
                    if ((i & 16) != 0) {
                        remoteImage5 = selectPage.iconGovernmentId;
                    }
                    return selectPage.copy(remoteImage, remoteImage6, remoteImage7, remoteImage8, remoteImage5);
                }

                public final RemoteImage component1() {
                    return this.headerPictograph;
                }

                public final RemoteImage component2() {
                    return this.iconDriversLicense;
                }

                public final RemoteImage component3() {
                    return this.iconPassport;
                }

                public final RemoteImage component4() {
                    return this.iconNationalId;
                }

                public final RemoteImage component5() {
                    return this.iconGovernmentId;
                }

                @NotNull
                public final SelectPage copy(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5) {
                    return new SelectPage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SelectPage)) {
                        return false;
                    }
                    SelectPage selectPage = (SelectPage) obj;
                    return Intrinsics.b(this.headerPictograph, selectPage.headerPictograph) && Intrinsics.b(this.iconDriversLicense, selectPage.iconDriversLicense) && Intrinsics.b(this.iconPassport, selectPage.iconPassport) && Intrinsics.b(this.iconNationalId, selectPage.iconNationalId) && Intrinsics.b(this.iconGovernmentId, selectPage.iconGovernmentId);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getIconDriversLicense() {
                    return this.iconDriversLicense;
                }

                public final RemoteImage getIconGovernmentId() {
                    return this.iconGovernmentId;
                }

                public final RemoteImage getIconNationalId() {
                    return this.iconNationalId;
                }

                public final RemoteImage getIconPassport() {
                    return this.iconPassport;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.iconDriversLicense;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.iconPassport;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.iconNationalId;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.iconGovernmentId;
                    return iHashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "SelectPage(headerPictograph=" + this.headerPictograph + ", iconDriversLicense=" + this.iconDriversLicense + ", iconPassport=" + this.iconPassport + ", iconNationalId=" + this.iconNationalId + ", iconGovernmentId=" + this.iconGovernmentId + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.iconDriversLicense;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage3 = this.iconPassport;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage4 = this.iconNationalId;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage5 = this.iconGovernmentId;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, i);
                    }
                }

                public SelectPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.iconDriversLicense = remoteImage2;
                    this.iconPassport = remoteImage3;
                    this.iconNationalId = remoteImage4;
                    this.iconGovernmentId = remoteImage5;
                }

                public SelectPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5);
                }
            }

            public AssetConfig() {
                this(null, null, null, null, null, 31, null);
            }

            public static AssetConfig copy$default(AssetConfig assetConfig, SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    selectPage = assetConfig.selectPage;
                }
                if ((i & 2) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                PromptPage promptPage2 = promptPage;
                if ((i & 4) != 0) {
                    capturePage = assetConfig.capturePage;
                }
                CapturePage capturePage2 = capturePage;
                if ((i & 8) != 0) {
                    checkPage = assetConfig.checkPage;
                }
                CheckPage checkPage2 = checkPage;
                if ((i & 16) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                return assetConfig.copy(selectPage, promptPage2, capturePage2, checkPage2, pendingPage);
            }

            public final SelectPage component1() {
                return this.selectPage;
            }

            public final PromptPage component2() {
                return this.promptPage;
            }

            public final CapturePage component3() {
                return this.capturePage;
            }

            public final CheckPage component4() {
                return this.checkPage;
            }

            public final PendingPage component5() {
                return this.pendingPage;
            }

            @NotNull
            public final AssetConfig copy(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage) {
                return new AssetConfig(selectPage, promptPage, capturePage, checkPage, pendingPage);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) obj;
                return Intrinsics.b(this.selectPage, assetConfig.selectPage) && Intrinsics.b(this.promptPage, assetConfig.promptPage) && Intrinsics.b(this.capturePage, assetConfig.capturePage) && Intrinsics.b(this.checkPage, assetConfig.checkPage) && Intrinsics.b(this.pendingPage, assetConfig.pendingPage);
            }

            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            public int hashCode() {
                SelectPage selectPage = this.selectPage;
                int iHashCode = (selectPage == null ? 0 : selectPage.hashCode()) * 31;
                PromptPage promptPage = this.promptPage;
                int iHashCode2 = (iHashCode + (promptPage == null ? 0 : promptPage.hashCode())) * 31;
                CapturePage capturePage = this.capturePage;
                int iHashCode3 = (iHashCode2 + (capturePage == null ? 0 : capturePage.hashCode())) * 31;
                CheckPage checkPage = this.checkPage;
                int iHashCode4 = (iHashCode3 + (checkPage == null ? 0 : checkPage.hashCode())) * 31;
                PendingPage pendingPage = this.pendingPage;
                return iHashCode4 + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "AssetConfig(selectPage=" + this.selectPage + ", promptPage=" + this.promptPage + ", capturePage=" + this.capturePage + ", checkPage=" + this.checkPage + ", pendingPage=" + this.pendingPage + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                SelectPage selectPage = this.selectPage;
                if (selectPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    selectPage.writeToParcel(parcel, i);
                }
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, i);
                }
                CapturePage capturePage = this.capturePage;
                if (capturePage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    capturePage.writeToParcel(parcel, i);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    checkPage.writeToParcel(parcel, i);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    pendingPage.writeToParcel(parcel, i);
                }
            }

            public AssetConfig(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage) {
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
            }

            public AssetConfig(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : selectPage, (i & 2) != 0 ? null : promptPage, (i & 4) != 0 ? null : capturePage, (i & 8) != 0 ? null : checkPage, (i & 16) != 0 ? null : pendingPage);
            }
        }

        @i(generateAdapter = true)
        public static final class AutoClassificationConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new Creator();
            private final CapturePageConfig capturePageConfig;
            private final Boolean extractTextFromImage;
            private final Boolean isEnabled;

            public static final class Creator implements Parcelable.Creator<AutoClassificationConfig> {
                @Override
                @NotNull
                public final AutoClassificationConfig createFromParcel(@NotNull Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new AutoClassificationConfig(boolValueOf, boolValueOf2, parcel.readInt() != 0 ? CapturePageConfig.CREATOR.createFromParcel(parcel) : null);
                }

                @Override
                @NotNull
                public final AutoClassificationConfig[] newArray(int i) {
                    return new AutoClassificationConfig[i];
                }
            }

            public AutoClassificationConfig() {
                this(null, null, null, 7, null);
            }

            public static AutoClassificationConfig copy$default(AutoClassificationConfig autoClassificationConfig, Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = autoClassificationConfig.isEnabled;
                }
                if ((i & 2) != 0) {
                    bool2 = autoClassificationConfig.extractTextFromImage;
                }
                if ((i & 4) != 0) {
                    capturePageConfig = autoClassificationConfig.capturePageConfig;
                }
                return autoClassificationConfig.copy(bool, bool2, capturePageConfig);
            }

            public final Boolean component1() {
                return this.isEnabled;
            }

            public final Boolean component2() {
                return this.extractTextFromImage;
            }

            public final CapturePageConfig component3() {
                return this.capturePageConfig;
            }

            @NotNull
            public final AutoClassificationConfig copy(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig) {
                return new AutoClassificationConfig(bool, bool2, capturePageConfig);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AutoClassificationConfig)) {
                    return false;
                }
                AutoClassificationConfig autoClassificationConfig = (AutoClassificationConfig) obj;
                return Intrinsics.b(this.isEnabled, autoClassificationConfig.isEnabled) && Intrinsics.b(this.extractTextFromImage, autoClassificationConfig.extractTextFromImage) && Intrinsics.b(this.capturePageConfig, autoClassificationConfig.capturePageConfig);
            }

            public final CapturePageConfig getCapturePageConfig() {
                return this.capturePageConfig;
            }

            public final Boolean getExtractTextFromImage() {
                return this.extractTextFromImage;
            }

            public int hashCode() {
                Boolean bool = this.isEnabled;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.extractTextFromImage;
                int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                return iHashCode2 + (capturePageConfig != null ? capturePageConfig.hashCode() : 0);
            }

            public final Boolean isEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                return "AutoClassificationConfig(isEnabled=" + this.isEnabled + ", extractTextFromImage=" + this.extractTextFromImage + ", capturePageConfig=" + this.capturePageConfig + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                Boolean bool = this.isEnabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.extractTextFromImage;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                if (capturePageConfig == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    capturePageConfig.writeToParcel(parcel, i);
                }
            }

            public AutoClassificationConfig(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig) {
                this.isEnabled = bool;
                this.extractTextFromImage = bool2;
                this.capturePageConfig = capturePageConfig;
            }

            public AutoClassificationConfig(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : capturePageConfig);
            }
        }

        @i(generateAdapter = true)
        public static final class AutoClassificationPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AutoClassificationPage> CREATOR = new Creator();
            private final String autoClassificationCaptureTipText;
            private final String countryInputTitle;
            private final String idClassInputTitle;
            private final String idClassRejectedContinueButtonText;
            private final String idClassRejectedTitle;
            private final String manualClassificationContinueButtonText;
            private final String manualClassificationTitle;
            private final String unableToClassifyDocumentContinueButtonText;
            private final String unableToClassifyDocumentTitle;

            public static final class Creator implements Parcelable.Creator<AutoClassificationPage> {
                @Override
                @NotNull
                public final AutoClassificationPage createFromParcel(@NotNull Parcel parcel) {
                    return new AutoClassificationPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final AutoClassificationPage[] newArray(int i) {
                    return new AutoClassificationPage[i];
                }
            }

            public AutoClassificationPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
                this.unableToClassifyDocumentTitle = str;
                this.unableToClassifyDocumentContinueButtonText = str2;
                this.idClassRejectedTitle = str3;
                this.idClassRejectedContinueButtonText = str4;
                this.countryInputTitle = str5;
                this.idClassInputTitle = str6;
                this.manualClassificationTitle = str7;
                this.manualClassificationContinueButtonText = str8;
                this.autoClassificationCaptureTipText = str9;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.unableToClassifyDocumentTitle);
                parcel.writeString(this.unableToClassifyDocumentContinueButtonText);
                parcel.writeString(this.idClassRejectedTitle);
                parcel.writeString(this.idClassRejectedContinueButtonText);
                parcel.writeString(this.countryInputTitle);
                parcel.writeString(this.idClassInputTitle);
                parcel.writeString(this.manualClassificationTitle);
                parcel.writeString(this.manualClassificationContinueButtonText);
                parcel.writeString(this.autoClassificationCaptureTipText);
            }
        }

        @i(generateAdapter = false)
        public static final class CaptureFileType {
            private static final a $ENTRIES;
            private static final CaptureFileType[] $VALUES;

            @NotNull
            public static final Companion Companion;
            public static final CaptureFileType Image = new CaptureFileType("Image", 0);
            public static final CaptureFileType Video = new CaptureFileType("Video", 1);
            public static final CaptureFileType Unknown = new CaptureFileType("Unknown", 2);

            public static final class Companion extends h<CaptureFileType> {
                public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @z
                public void toJson(@NotNull t tVar, CaptureFileType captureFileType) {
                }

                private Companion() {
                }

                @f
                @NotNull
                public CaptureFileType m142fromJson(@NotNull m mVar) {
                    Object objM0 = mVar.M0();
                    return Intrinsics.b(objM0, "video") ? CaptureFileType.Video : Intrinsics.b(objM0, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }
            }

            private static final CaptureFileType[] $values() {
                return new CaptureFileType[]{Image, Video, Unknown};
            }

            static {
                CaptureFileType[] captureFileTypeArr$values = $values();
                $VALUES = captureFileTypeArr$values;
                $ENTRIES = T9.b.a(captureFileTypeArr$values);
                Companion = new Companion(null);
            }

            private CaptureFileType(String str, int i) {
            }

            @NotNull
            public static a<CaptureFileType> getEntries() {
                return $ENTRIES;
            }

            public static CaptureFileType valueOf(String str) {
                return (CaptureFileType) Enum.valueOf(CaptureFileType.class, str);
            }

            public static CaptureFileType[] values() {
                return (CaptureFileType[]) $VALUES.clone();
            }
        }

        @i(generateAdapter = true)
        public static final class CapturePage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
            private final String barcodeHelpModalContinueBtn;
            private final String barcodeHelpModalHints;
            private final String barcodeHelpModalPrompt;
            private final String barcodeHelpModalTitle;
            private final String btnHelp;

            @NotNull
            private final String capturing;

            @NotNull
            private final String confirmCapture;
            private final String disclaimer;
            private final String hintHoldStill;
            private final String hintLowLight;
            private final String idBackHelpModalContinueBtn;
            private final String idBackHelpModalHintsMobile;
            private final String idBackHelpModalPrompt;
            private final String idBackHelpModalTitle;
            private final String idFrontHelpModalContinueBtn;
            private final String idFrontHelpModalHintsMobile;
            private final String idFrontHelpModalPrompt;
            private final String idFrontHelpModalTitle;

            @NotNull
            private final String scanBack;

            @NotNull
            private final String scanFront;

            @NotNull
            private final String scanFrontOrBack;

            @NotNull
            private final String scanPdf417;

            @NotNull
            private final String scanSignature;
            private final String title;

            public static final class Creator implements Parcelable.Creator<CapturePage> {
                @Override
                @NotNull
                public final CapturePage createFromParcel(@NotNull Parcel parcel) {
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final CapturePage[] newArray(int i) {
                    return new CapturePage[i];
                }
            }

            public CapturePage(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
                this.title = str;
                this.scanFront = str2;
                this.scanBack = str3;
                this.scanPdf417 = str4;
                this.scanFrontOrBack = str5;
                this.scanSignature = str6;
                this.capturing = str7;
                this.confirmCapture = str8;
                this.disclaimer = str9;
                this.hintHoldStill = str10;
                this.hintLowLight = str11;
                this.btnHelp = str12;
                this.barcodeHelpModalTitle = str13;
                this.barcodeHelpModalPrompt = str14;
                this.barcodeHelpModalHints = str15;
                this.barcodeHelpModalContinueBtn = str16;
                this.idFrontHelpModalTitle = str17;
                this.idFrontHelpModalPrompt = str18;
                this.idFrontHelpModalHintsMobile = str19;
                this.idFrontHelpModalContinueBtn = str20;
                this.idBackHelpModalTitle = str21;
                this.idBackHelpModalPrompt = str22;
                this.idBackHelpModalHintsMobile = str23;
                this.idBackHelpModalContinueBtn = str24;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getBarcodeHelpModalContinueBtn() {
                return this.barcodeHelpModalContinueBtn;
            }

            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            public final String getBtnHelp() {
                return this.btnHelp;
            }

            @NotNull
            public final String getCapturing() {
                return this.capturing;
            }

            @NotNull
            public final String getConfirmCapture() {
                return this.confirmCapture;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            public final String getIdBackHelpModalContinueBtn() {
                return this.idBackHelpModalContinueBtn;
            }

            public final String getIdBackHelpModalHintsMobile() {
                return this.idBackHelpModalHintsMobile;
            }

            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            public final String getIdFrontHelpModalContinueBtn() {
                return this.idFrontHelpModalContinueBtn;
            }

            public final String getIdFrontHelpModalHintsMobile() {
                return this.idFrontHelpModalHintsMobile;
            }

            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            @NotNull
            public final String getScanBack() {
                return this.scanBack;
            }

            @NotNull
            public final String getScanFront() {
                return this.scanFront;
            }

            @NotNull
            public final String getScanFrontOrBack() {
                return this.scanFrontOrBack;
            }

            @NotNull
            public final String getScanPdf417() {
                return this.scanPdf417;
            }

            @NotNull
            public final String getScanSignature() {
                return this.scanSignature;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.scanFront);
                parcel.writeString(this.scanBack);
                parcel.writeString(this.scanPdf417);
                parcel.writeString(this.scanFrontOrBack);
                parcel.writeString(this.scanSignature);
                parcel.writeString(this.capturing);
                parcel.writeString(this.confirmCapture);
                parcel.writeString(this.disclaimer);
                parcel.writeString(this.hintHoldStill);
                parcel.writeString(this.hintLowLight);
                parcel.writeString(this.btnHelp);
                parcel.writeString(this.barcodeHelpModalTitle);
                parcel.writeString(this.barcodeHelpModalPrompt);
                parcel.writeString(this.barcodeHelpModalHints);
                parcel.writeString(this.barcodeHelpModalContinueBtn);
                parcel.writeString(this.idFrontHelpModalTitle);
                parcel.writeString(this.idFrontHelpModalPrompt);
                parcel.writeString(this.idFrontHelpModalHintsMobile);
                parcel.writeString(this.idFrontHelpModalContinueBtn);
                parcel.writeString(this.idBackHelpModalTitle);
                parcel.writeString(this.idBackHelpModalPrompt);
                parcel.writeString(this.idBackHelpModalHintsMobile);
                parcel.writeString(this.idBackHelpModalContinueBtn);
            }
        }

        @i(generateAdapter = true)
        public static final class CheckPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();

            @NotNull
            private final String buttonRetake;

            @NotNull
            private final String buttonSubmit;
            private final String titleConfirmCapture;

            public static final class Creator implements Parcelable.Creator<CheckPage> {
                @Override
                @NotNull
                public final CheckPage createFromParcel(@NotNull Parcel parcel) {
                    return new CheckPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final CheckPage[] newArray(int i) {
                    return new CheckPage[i];
                }
            }

            public CheckPage(@g(name = "btnSubmit") @NotNull String str, @g(name = "btnRetake") @NotNull String str2, String str3) {
                this.buttonSubmit = str;
                this.buttonRetake = str2;
                this.titleConfirmCapture = str3;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            @NotNull
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getTitleConfirmCapture() {
                return this.titleConfirmCapture;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.buttonSubmit);
                parcel.writeString(this.buttonRetake);
                parcel.writeString(this.titleConfirmCapture);
            }
        }

        @i(generateAdapter = true)
        public static final class Config {
            private final AssetConfig assets;
            private final Boolean audioEnabled;
            private final AutoClassificationConfig autoClassificationConfig;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<CaptureFileType> enabledCaptureFileTypes;
            private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

            @NotNull
            private final String fieldKeyDocument;

            @NotNull
            private final String fieldKeyIdclass;
            private final List<Id> idclasses;
            private final Integer imageCaptureCount;
            private final List<LocalizationOverride> localizationOverrides;

            @NotNull
            private final Localizations localizations;
            private final DigitalIdConfig mobileDriversLicense;
            private final Long nativeMobileCameraManualCaptureDelayMs;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final StyleElements.Axis reviewCaptureButtonsAxis;
            private final Boolean shouldSkipReviewScreen;
            private final List<VideoCaptureMethod> videoCaptureMethods;
            private final String videoSessionJwt;

            public Config(List<Id> list, Boolean bool, Boolean bool2, @NotNull Localizations localizations, List<? extends CaptureOptionNativeMobile> list2, Integer num, Long l, @NotNull String str, @NotNull String str2, List<LocalizationOverride> list3, Boolean bool3, List<? extends CaptureFileType> list4, List<? extends VideoCaptureMethod> list5, @g(name = "videoSessionJWT") String str3, AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, DigitalIdConfig digitalIdConfig) {
                this.idclasses = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.enabledCaptureOptionsNativeMobile = list2;
                this.imageCaptureCount = num;
                this.nativeMobileCameraManualCaptureDelayMs = l;
                this.fieldKeyDocument = str;
                this.fieldKeyIdclass = str2;
                this.localizationOverrides = list3;
                this.shouldSkipReviewScreen = bool3;
                this.enabledCaptureFileTypes = list4;
                this.videoCaptureMethods = list5;
                this.videoSessionJwt = str3;
                this.assets = assetConfig;
                this.autoClassificationConfig = autoClassificationConfig;
                this.reviewCaptureButtonsAxis = axis;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
                this.mobileDriversLicense = digitalIdConfig;
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            public final AutoClassificationConfig getAutoClassificationConfig() {
                return this.autoClassificationConfig;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            public final List<CaptureOptionNativeMobile> getEnabledCaptureOptionsNativeMobile() {
                return this.enabledCaptureOptionsNativeMobile;
            }

            @NotNull
            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            @NotNull
            public final String getFieldKeyIdclass() {
                return this.fieldKeyIdclass;
            }

            public final List<Id> getIdclasses() {
                return this.idclasses;
            }

            public final Integer getImageCaptureCount() {
                return this.imageCaptureCount;
            }

            public final List<LocalizationOverride> getLocalizationOverrides() {
                return this.localizationOverrides;
            }

            @NotNull
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final DigitalIdConfig getMobileDriversLicense() {
                return this.mobileDriversLicense;
            }

            public final Long getNativeMobileCameraManualCaptureDelayMs() {
                return this.nativeMobileCameraManualCaptureDelayMs;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final StyleElements.Axis getReviewCaptureButtonsAxis() {
                return this.reviewCaptureButtonsAxis;
            }

            public final Boolean getShouldSkipReviewScreen() {
                return this.shouldSkipReviewScreen;
            }

            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }
        }

        @i(generateAdapter = true)
        public static final class DigitalIdConfig {
            private final String fieldKeyMobileDriversLicense;
            private final String merchantId;
            private final List<DigitalIdRequest> mobileRequests;
            private final String nonce;

            public DigitalIdConfig(String str, String str2, String str3, List<DigitalIdRequest> list) {
                this.merchantId = str;
                this.nonce = str2;
                this.fieldKeyMobileDriversLicense = str3;
                this.mobileRequests = list;
            }

            public final String getFieldKeyMobileDriversLicense() {
                return this.fieldKeyMobileDriversLicense;
            }

            public final String getMerchantId() {
                return this.merchantId;
            }

            public final List<DigitalIdRequest> getMobileRequests() {
                return this.mobileRequests;
            }

            public final String getNonce() {
                return this.nonce;
            }
        }

        @i(generateAdapter = true)
        public static final class DigitalIdRequest {
            private final Map<String, Integer> elementToStoreLength;
            private final String idType;
            private final String minAge;

            public DigitalIdRequest(String str, String str2, Map<String, Integer> map) {
                this.idType = str;
                this.minAge = str2;
                this.elementToStoreLength = map;
            }

            public final Map<String, Integer> getElementToStoreLength() {
                return this.elementToStoreLength;
            }

            public final String getIdType() {
                return this.idType;
            }

            public final String getMinAge() {
                return this.minAge;
            }
        }

        @i(generateAdapter = true)
        public static final class LocalizationOverride implements Parcelable, Comparable<LocalizationOverride> {

            @NotNull
            public static final Parcelable.Creator<LocalizationOverride> CREATOR = new Creator();
            private final String countryCode;
            private final String idClass;

            @NotNull
            private final String key;

            @NotNull
            private final String page;

            @NotNull
            private final P9.h precedenceScore$delegate = P9.i.b(new NextStep$GovernmentId$LocalizationOverride$precedenceScore$2(this));
            private final String side;

            @NotNull
            private final String text;

            public static final class Creator implements Parcelable.Creator<LocalizationOverride> {
                @Override
                @NotNull
                public final LocalizationOverride createFromParcel(@NotNull Parcel parcel) {
                    return new LocalizationOverride(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final LocalizationOverride[] newArray(int i) {
                    return new LocalizationOverride[i];
                }
            }

            public LocalizationOverride(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
                this.countryCode = str;
                this.idClass = str2;
                this.side = str3;
                this.page = str4;
                this.key = str5;
                this.text = str6;
            }

            public static void getPrecedenceScore$annotations() {
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getCountryCode() {
                return this.countryCode;
            }

            public final String getIdClass() {
                return this.idClass;
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final String getPage() {
                return this.page;
            }

            public final int getPrecedenceScore() {
                return ((Number) this.precedenceScore$delegate.getValue()).intValue();
            }

            public final String getSide() {
                return this.side;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.countryCode);
                parcel.writeString(this.idClass);
                parcel.writeString(this.side);
                parcel.writeString(this.page);
                parcel.writeString(this.key);
                parcel.writeString(this.text);
            }

            @Override
            public int compareTo(@NotNull LocalizationOverride localizationOverride) {
                return Intrinsics.g(getPrecedenceScore(), localizationOverride.getPrecedenceScore());
            }
        }

        @i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final AutoClassificationPage autoClassificationPage;
            private final CancelDialog cancelDialog;

            @NotNull
            private final CapturePage capturePage;

            @NotNull
            private final CheckPage checkPage;

            @NotNull
            private final PendingPage pendingPage;

            @NotNull
            private final PromptPage promptPage;

            @NotNull
            private final RequestPage requestPage;

            @NotNull
            private final ReviewUploadPage reviewUploadPage;

            @NotNull
            private final SelectPage selectPage;

            public static final class Creator implements Parcelable.Creator<Localizations> {
                @Override
                @NotNull
                public final Localizations createFromParcel(@NotNull Parcel parcel) {
                    return new Localizations(SelectPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), CheckPage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), RequestPage.CREATOR.createFromParcel(parcel), ReviewUploadPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AutoClassificationPage.CREATOR.createFromParcel(parcel) : null);
                }

                @Override
                @NotNull
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }

            public Localizations(@NotNull SelectPage selectPage, @NotNull PromptPage promptPage, @NotNull CapturePage capturePage, @NotNull CheckPage checkPage, @NotNull PendingPage pendingPage, @NotNull RequestPage requestPage, @NotNull ReviewUploadPage reviewUploadPage, CancelDialog cancelDialog, AutoClassificationPage autoClassificationPage) {
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
                this.requestPage = requestPage;
                this.reviewUploadPage = reviewUploadPage;
                this.cancelDialog = cancelDialog;
                this.autoClassificationPage = autoClassificationPage;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final AutoClassificationPage getAutoClassificationPage() {
                return this.autoClassificationPage;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @NotNull
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            @NotNull
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            @NotNull
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @NotNull
            public final RequestPage getRequestPage() {
                return this.requestPage;
            }

            @NotNull
            public final ReviewUploadPage getReviewUploadPage() {
                return this.reviewUploadPage;
            }

            @NotNull
            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                this.selectPage.writeToParcel(parcel, i);
                this.promptPage.writeToParcel(parcel, i);
                this.capturePage.writeToParcel(parcel, i);
                this.checkPage.writeToParcel(parcel, i);
                this.pendingPage.writeToParcel(parcel, i);
                this.requestPage.writeToParcel(parcel, i);
                this.reviewUploadPage.writeToParcel(parcel, i);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, i);
                }
                AutoClassificationPage autoClassificationPage = this.autoClassificationPage;
                if (autoClassificationPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    autoClassificationPage.writeToParcel(parcel, i);
                }
            }
        }

        @i(generateAdapter = false)
        public static final class PassportNfcOption {
            private static final a $ENTRIES;
            private static final PassportNfcOption[] $VALUES;

            @NotNull
            public static final Companion Companion;
            public static final PassportNfcOption REQUIRED = new PassportNfcOption("REQUIRED", 0);
            public static final PassportNfcOption OPTIONAL = new PassportNfcOption("OPTIONAL", 1);
            public static final PassportNfcOption REQUIRED_IF_SUPPORTED = new PassportNfcOption("REQUIRED_IF_SUPPORTED", 2);

            public static final class Companion extends h<PassportNfcOption> {
                public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @z
                public void toJson(@NotNull t tVar, PassportNfcOption passportNfcOption) {
                }

                private Companion() {
                }

                @f
                @NotNull
                public PassportNfcOption m144fromJson(@NotNull m mVar) {
                    Object objM0 = mVar.M0();
                    return Intrinsics.b(objM0, "required") ? PassportNfcOption.REQUIRED : Intrinsics.b(objM0, "optional") ? PassportNfcOption.OPTIONAL : Intrinsics.b(objM0, "required_if_supported") ? PassportNfcOption.REQUIRED_IF_SUPPORTED : PassportNfcOption.OPTIONAL;
                }
            }

            private static final PassportNfcOption[] $values() {
                return new PassportNfcOption[]{REQUIRED, OPTIONAL, REQUIRED_IF_SUPPORTED};
            }

            static {
                PassportNfcOption[] passportNfcOptionArr$values = $values();
                $VALUES = passportNfcOptionArr$values;
                $ENTRIES = T9.b.a(passportNfcOptionArr$values);
                Companion = new Companion(null);
            }

            private PassportNfcOption(String str, int i) {
            }

            @NotNull
            public static a<PassportNfcOption> getEntries() {
                return $ENTRIES;
            }

            public static PassportNfcOption valueOf(String str) {
                return (PassportNfcOption) Enum.valueOf(PassportNfcOption.class, str);
            }

            public static PassportNfcOption[] values() {
                return (PassportNfcOption[]) $VALUES.clone();
            }
        }

        @i(generateAdapter = true)
        public static final class PendingPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

            @NotNull
            private final String description;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<PendingPage> {
                @Override
                @NotNull
                public final PendingPage createFromParcel(@NotNull Parcel parcel) {
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final PendingPage[] newArray(int i) {
                    return new PendingPage[i];
                }
            }

            public PendingPage(@NotNull String str, @NotNull String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        @i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String microphonePermissionsBtnCancel;
            private final String microphonePermissionsBtnContinueMobile;
            private final String microphonePermissionsPrompt;
            private final String microphonePermissionsTitle;

            public static final class Creator implements Parcelable.Creator<PromptPage> {
                @Override
                @NotNull
                public final PromptPage createFromParcel(@NotNull Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }

            public PromptPage(String str, String str2, @g(name = "cameraPermissionsBtnContinueMobile") String str3, @g(name = "cameraPermissionsBtnCancel") String str4, String str5, String str6, String str7, String str8) {
                this.cameraPermissionsTitle = str;
                this.cameraPermissionsPrompt = str2;
                this.cameraPermissionsAllowButtonText = str3;
                this.cameraPermissionsCancelButtonText = str4;
                this.microphonePermissionsBtnCancel = str5;
                this.microphonePermissionsBtnContinueMobile = str6;
                this.microphonePermissionsPrompt = str7;
                this.microphonePermissionsTitle = str8;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.cameraPermissionsTitle);
                parcel.writeString(this.cameraPermissionsPrompt);
                parcel.writeString(this.cameraPermissionsAllowButtonText);
                parcel.writeString(this.cameraPermissionsCancelButtonText);
                parcel.writeString(this.microphonePermissionsBtnCancel);
                parcel.writeString(this.microphonePermissionsBtnContinueMobile);
                parcel.writeString(this.microphonePermissionsPrompt);
                parcel.writeString(this.microphonePermissionsTitle);
            }
        }

        @i(generateAdapter = true)
        public static final class RequestPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<RequestPage> CREATOR = new Creator();

            @NotNull
            private final String choosePhotoButtonText;

            @NotNull
            private final String descriptionBack;

            @NotNull
            private final String descriptionFront;

            @NotNull
            private final String descriptionPassportSignature;

            @NotNull
            private final String descriptionPdf417;

            @NotNull
            private final String liveUploadButtonText;

            @NotNull
            private final String titleBack;

            @NotNull
            private final String titleFront;

            @NotNull
            private final String titlePassportSignature;

            @NotNull
            private final String titlePdf417;

            public static final class Creator implements Parcelable.Creator<RequestPage> {
                @Override
                @NotNull
                public final RequestPage createFromParcel(@NotNull Parcel parcel) {
                    return new RequestPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final RequestPage[] newArray(int i) {
                    return new RequestPage[i];
                }
            }

            public RequestPage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
                this.titleFront = str;
                this.titleBack = str2;
                this.titlePdf417 = str3;
                this.titlePassportSignature = str4;
                this.descriptionFront = str5;
                this.descriptionBack = str6;
                this.descriptionPdf417 = str7;
                this.descriptionPassportSignature = str8;
                this.choosePhotoButtonText = str9;
                this.liveUploadButtonText = str10;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getChoosePhotoButtonText() {
                return this.choosePhotoButtonText;
            }

            @NotNull
            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            @NotNull
            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            @NotNull
            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            @NotNull
            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            @NotNull
            public final String getLiveUploadButtonText() {
                return this.liveUploadButtonText;
            }

            @NotNull
            public final String getTitleBack() {
                return this.titleBack;
            }

            @NotNull
            public final String getTitleFront() {
                return this.titleFront;
            }

            @NotNull
            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            @NotNull
            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.titleFront);
                parcel.writeString(this.titleBack);
                parcel.writeString(this.titlePdf417);
                parcel.writeString(this.titlePassportSignature);
                parcel.writeString(this.descriptionFront);
                parcel.writeString(this.descriptionBack);
                parcel.writeString(this.descriptionPdf417);
                parcel.writeString(this.descriptionPassportSignature);
                parcel.writeString(this.choosePhotoButtonText);
                parcel.writeString(this.liveUploadButtonText);
            }
        }

        @i(generateAdapter = true)
        public static final class ReviewUploadPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ReviewUploadPage> CREATOR = new Creator();

            @NotNull
            private final String chooseAnotherButtonText;

            @NotNull
            private final String confirmButtonText;

            @NotNull
            private final String descriptionBack;

            @NotNull
            private final String descriptionFront;

            @NotNull
            private final String descriptionPassportSignature;

            @NotNull
            private final String descriptionPdf417;

            @NotNull
            private final String titleBack;

            @NotNull
            private final String titleFront;

            @NotNull
            private final String titlePassportSignature;

            @NotNull
            private final String titlePdf417;

            public static final class Creator implements Parcelable.Creator<ReviewUploadPage> {
                @Override
                @NotNull
                public final ReviewUploadPage createFromParcel(@NotNull Parcel parcel) {
                    return new ReviewUploadPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final ReviewUploadPage[] newArray(int i) {
                    return new ReviewUploadPage[i];
                }
            }

            public ReviewUploadPage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
                this.titleFront = str;
                this.titleBack = str2;
                this.titlePdf417 = str3;
                this.titlePassportSignature = str4;
                this.descriptionFront = str5;
                this.descriptionBack = str6;
                this.descriptionPdf417 = str7;
                this.descriptionPassportSignature = str8;
                this.confirmButtonText = str9;
                this.chooseAnotherButtonText = str10;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getChooseAnotherButtonText() {
                return this.chooseAnotherButtonText;
            }

            @NotNull
            public final String getConfirmButtonText() {
                return this.confirmButtonText;
            }

            @NotNull
            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            @NotNull
            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            @NotNull
            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            @NotNull
            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            @NotNull
            public final String getTitleBack() {
                return this.titleBack;
            }

            @NotNull
            public final String getTitleFront() {
                return this.titleFront;
            }

            @NotNull
            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            @NotNull
            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.titleFront);
                parcel.writeString(this.titleBack);
                parcel.writeString(this.titlePdf417);
                parcel.writeString(this.titlePassportSignature);
                parcel.writeString(this.descriptionFront);
                parcel.writeString(this.descriptionBack);
                parcel.writeString(this.descriptionPdf417);
                parcel.writeString(this.descriptionPassportSignature);
                parcel.writeString(this.confirmButtonText);
                parcel.writeString(this.chooseAnotherButtonText);
            }
        }

        @i(generateAdapter = false)
        public static final class SelectPage implements Parcelable {

            @NotNull
            private final String choose;
            private final String disclaimer;

            @NotNull
            private final Map<String, String> idClassToName;

            @NotNull
            private final String prompt;

            @NotNull
            private final String title;

            @NotNull
            public static final Companion Companion = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();

            public static final class Companion extends h<SelectPage> {
                public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @z
                public void toJson(@NotNull t tVar, SelectPage selectPage) {
                }

                private Companion() {
                }

                @f
                @NotNull
                public SelectPage m145fromJson(@NotNull m mVar) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    mVar.e();
                    String strN0 = "";
                    String strN02 = strN0;
                    String strA = null;
                    String strN03 = strN02;
                    while (mVar.u()) {
                        String strZ = mVar.Z();
                        if (strZ != null) {
                            int iHashCode = strZ.hashCode();
                            if (iHashCode != -979805852) {
                                if (iHashCode != 110371416) {
                                    if (iHashCode != 432371099) {
                                        if (iHashCode == 1282023341 && strZ.equals("optionNotice")) {
                                            strN02 = mVar.n0();
                                        }
                                    } else if (strZ.equals("disclaimer")) {
                                        strA = C0460h.a(mVar);
                                    }
                                } else if (strZ.equals(Title.type)) {
                                    strN03 = mVar.n0();
                                }
                            } else if (strZ.equals("prompt")) {
                                strN0 = mVar.n0();
                            }
                        }
                        if (mVar.u() && mVar.H0() == m.c.y) {
                            linkedHashMap.put(strZ, mVar.n0());
                        } else {
                            mVar.f1();
                        }
                    }
                    mVar.j();
                    return new SelectPage(strN03, strN0, strN02, strA, linkedHashMap);
                }
            }

            public static final class Creator implements Parcelable.Creator<SelectPage> {
                @Override
                @NotNull
                public final SelectPage createFromParcel(@NotNull Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new SelectPage(string, string2, string3, string4, linkedHashMap);
                }

                @Override
                @NotNull
                public final SelectPage[] newArray(int i) {
                    return new SelectPage[i];
                }
            }

            public SelectPage(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull Map<String, String> map) {
                this.title = str;
                this.prompt = str2;
                this.choose = str3;
                this.disclaimer = str4;
                this.idClassToName = map;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getChoose() {
                return this.choose;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            public final Map<String, String> getIdClassToName() {
                return this.idClassToName;
            }

            @NotNull
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.choose);
                parcel.writeString(this.disclaimer);
                Map<String, String> map = this.idClassToName;
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }
        }

        @i(generateAdapter = false)
        public static final class VideoCaptureMethod {
            private static final a $ENTRIES;
            private static final VideoCaptureMethod[] $VALUES;

            @NotNull
            public static final Companion Companion;
            public static final VideoCaptureMethod Stream = new VideoCaptureMethod("Stream", 0);
            public static final VideoCaptureMethod Upload = new VideoCaptureMethod("Upload", 1);
            public static final VideoCaptureMethod None = new VideoCaptureMethod("None", 2);

            public static final class Companion extends h<VideoCaptureMethod> {
                public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @z
                public void toJson(@NotNull t tVar, VideoCaptureMethod videoCaptureMethod) {
                }

                private Companion() {
                }

                @f
                @NotNull
                public VideoCaptureMethod m146fromJson(@NotNull m mVar) {
                    Object objM0 = mVar.M0();
                    return Intrinsics.b(objM0, "stream") ? VideoCaptureMethod.Stream : Intrinsics.b(objM0, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }
            }

            private static final VideoCaptureMethod[] $values() {
                return new VideoCaptureMethod[]{Stream, Upload, None};
            }

            static {
                VideoCaptureMethod[] videoCaptureMethodArr$values = $values();
                $VALUES = videoCaptureMethodArr$values;
                $ENTRIES = T9.b.a(videoCaptureMethodArr$values);
                Companion = new Companion(null);
            }

            private VideoCaptureMethod(String str, int i) {
            }

            @NotNull
            public static a<VideoCaptureMethod> getEntries() {
                return $ENTRIES;
            }

            public static VideoCaptureMethod valueOf(String str) {
                return (VideoCaptureMethod) Enum.valueOf(VideoCaptureMethod.class, str);
            }

            public static VideoCaptureMethod[] values() {
                return (VideoCaptureMethod[]) $VALUES.clone();
            }
        }

        public GovernmentId(@NotNull String str, @NotNull Config config, StepStyles.GovernmentIdStepStyle governmentIdStepStyle) {
            super(str, null);
            this.name = str;
            this.config = config;
            this.styles = governmentIdStepStyle;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }
    }

    @i(generateAdapter = true)
    public static final class Selfie extends NextStep {

        @NotNull
        private final Config config;

        @NotNull
        private final String name;
        private final StepStyles.SelfieStepStyle styles;

        @i(generateAdapter = true)
        public static final class AssetConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final PromptPage promptPage;
            private final RecordPage recordPage;

            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                @Override
                @NotNull
                public final AssetConfig createFromParcel(@NotNull Parcel parcel) {
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RecordPage.CREATOR.createFromParcel(parcel) : null);
                }

                @Override
                @NotNull
                public final AssetConfig[] newArray(int i) {
                    return new AssetConfig[i];
                }
            }

            @i(generateAdapter = true)
            public static final class PromptPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final RemoteImage headerPictograph;
                private final RemoteImage selfieCenterPictograph;
                private final RemoteImage selfieLeftPictograph;
                private final RemoteImage selfiePictograph;
                private final RemoteImage selfieRightPictograph;

                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    @Override
                    @NotNull
                    public final PromptPage createFromParcel(@NotNull Parcel parcel) {
                        return new PromptPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final PromptPage[] newArray(int i) {
                        return new PromptPage[i];
                    }
                }

                public PromptPage() {
                    this(null, null, null, null, null, 31, null);
                }

                public static PromptPage copy$default(PromptPage promptPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = promptPage.selfiePictograph;
                    }
                    RemoteImage remoteImage6 = remoteImage2;
                    if ((i & 4) != 0) {
                        remoteImage3 = promptPage.selfieCenterPictograph;
                    }
                    RemoteImage remoteImage7 = remoteImage3;
                    if ((i & 8) != 0) {
                        remoteImage4 = promptPage.selfieLeftPictograph;
                    }
                    RemoteImage remoteImage8 = remoteImage4;
                    if ((i & 16) != 0) {
                        remoteImage5 = promptPage.selfieRightPictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage6, remoteImage7, remoteImage8, remoteImage5);
                }

                public final RemoteImage component1() {
                    return this.headerPictograph;
                }

                public final RemoteImage component2() {
                    return this.selfiePictograph;
                }

                public final RemoteImage component3() {
                    return this.selfieCenterPictograph;
                }

                public final RemoteImage component4() {
                    return this.selfieLeftPictograph;
                }

                public final RemoteImage component5() {
                    return this.selfieRightPictograph;
                }

                @NotNull
                public final PromptPage copy(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5) {
                    return new PromptPage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) obj;
                    return Intrinsics.b(this.headerPictograph, promptPage.headerPictograph) && Intrinsics.b(this.selfiePictograph, promptPage.selfiePictograph) && Intrinsics.b(this.selfieCenterPictograph, promptPage.selfieCenterPictograph) && Intrinsics.b(this.selfieLeftPictograph, promptPage.selfieLeftPictograph) && Intrinsics.b(this.selfieRightPictograph, promptPage.selfieRightPictograph);
                }

                public final RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final RemoteImage getSelfieCenterPictograph() {
                    return this.selfieCenterPictograph;
                }

                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                public final RemoteImage getSelfiePictograph() {
                    return this.selfiePictograph;
                }

                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.selfiePictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    RemoteImage remoteImage5 = this.selfieRightPictograph;
                    return iHashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", selfiePictograph=" + this.selfiePictograph + ", selfieCenterPictograph=" + this.selfieCenterPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.selfiePictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage5 = this.selfieRightPictograph;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, i);
                    }
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.selfiePictograph = remoteImage2;
                    this.selfieCenterPictograph = remoteImage3;
                    this.selfieLeftPictograph = remoteImage4;
                    this.selfieRightPictograph = remoteImage5;
                }

                public PromptPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, RemoteImage remoteImage4, RemoteImage remoteImage5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3, (i & 8) != 0 ? null : remoteImage4, (i & 16) != 0 ? null : remoteImage5);
                }
            }

            @i(generateAdapter = true)
            public static final class RecordPage implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<RecordPage> CREATOR = new Creator();
                private final RemoteImage loadingPictograph;
                private final RemoteImage selfieLeftPictograph;
                private final RemoteImage selfieRightPictograph;

                public static final class Creator implements Parcelable.Creator<RecordPage> {
                    @Override
                    @NotNull
                    public final RecordPage createFromParcel(@NotNull Parcel parcel) {
                        return new RecordPage(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override
                    @NotNull
                    public final RecordPage[] newArray(int i) {
                        return new RecordPage[i];
                    }
                }

                public RecordPage() {
                    this(null, null, null, 7, null);
                }

                public static RecordPage copy$default(RecordPage recordPage, RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        remoteImage = recordPage.loadingPictograph;
                    }
                    if ((i & 2) != 0) {
                        remoteImage2 = recordPage.selfieLeftPictograph;
                    }
                    if ((i & 4) != 0) {
                        remoteImage3 = recordPage.selfieRightPictograph;
                    }
                    return recordPage.copy(remoteImage, remoteImage2, remoteImage3);
                }

                public final RemoteImage component1() {
                    return this.loadingPictograph;
                }

                public final RemoteImage component2() {
                    return this.selfieLeftPictograph;
                }

                public final RemoteImage component3() {
                    return this.selfieRightPictograph;
                }

                @NotNull
                public final RecordPage copy(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3) {
                    return new RecordPage(remoteImage, remoteImage2, remoteImage3);
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RecordPage)) {
                        return false;
                    }
                    RecordPage recordPage = (RecordPage) obj;
                    return Intrinsics.b(this.loadingPictograph, recordPage.loadingPictograph) && Intrinsics.b(this.selfieLeftPictograph, recordPage.selfieLeftPictograph) && Intrinsics.b(this.selfieRightPictograph, recordPage.selfieRightPictograph);
                }

                public final RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public final RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                public final RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.loadingPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    RemoteImage remoteImage3 = this.selfieRightPictograph;
                    return iHashCode2 + (remoteImage3 != null ? remoteImage3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "RecordPage(loadingPictograph=" + this.loadingPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + ")";
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    RemoteImage remoteImage = this.loadingPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, i);
                    }
                    RemoteImage remoteImage3 = this.selfieRightPictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, i);
                    }
                }

                public RecordPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3) {
                    this.loadingPictograph = remoteImage;
                    this.selfieLeftPictograph = remoteImage2;
                    this.selfieRightPictograph = remoteImage3;
                }

                public RecordPage(RemoteImage remoteImage, RemoteImage remoteImage2, RemoteImage remoteImage3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : remoteImage, (i & 2) != 0 ? null : remoteImage2, (i & 4) != 0 ? null : remoteImage3);
                }
            }

            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, RecordPage recordPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i & 2) != 0) {
                    recordPage = assetConfig.recordPage;
                }
                return assetConfig.copy(promptPage, recordPage);
            }

            public final PromptPage component1() {
                return this.promptPage;
            }

            public final RecordPage component2() {
                return this.recordPage;
            }

            @NotNull
            public final AssetConfig copy(PromptPage promptPage, RecordPage recordPage) {
                return new AssetConfig(promptPage, recordPage);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) obj;
                return Intrinsics.b(this.promptPage, assetConfig.promptPage) && Intrinsics.b(this.recordPage, assetConfig.recordPage);
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final RecordPage getRecordPage() {
                return this.recordPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int iHashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                RecordPage recordPage = this.recordPage;
                return iHashCode + (recordPage != null ? recordPage.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", recordPage=" + this.recordPage + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, i);
                }
                RecordPage recordPage = this.recordPage;
                if (recordPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    recordPage.writeToParcel(parcel, i);
                }
            }

            public AssetConfig(PromptPage promptPage, RecordPage recordPage) {
                this.promptPage = promptPage;
                this.recordPage = recordPage;
            }

            public AssetConfig(PromptPage promptPage, RecordPage recordPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : promptPage, (i & 2) != 0 ? null : recordPage);
            }
        }

        @i(generateAdapter = false)
        public static final class CaptureFileType {
            private static final a $ENTRIES;
            private static final CaptureFileType[] $VALUES;

            @NotNull
            public static final Companion Companion;
            public static final CaptureFileType Image = new CaptureFileType("Image", 0);
            public static final CaptureFileType Video = new CaptureFileType("Video", 1);
            public static final CaptureFileType Unknown = new CaptureFileType("Unknown", 2);

            public static final class Companion extends h<CaptureFileType> {
                public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @z
                public void toJson(@NotNull t tVar, CaptureFileType captureFileType) {
                }

                private Companion() {
                }

                @f
                @NotNull
                public CaptureFileType m147fromJson(@NotNull m mVar) {
                    Object objM0 = mVar.M0();
                    return Intrinsics.b(objM0, "video") ? CaptureFileType.Video : Intrinsics.b(objM0, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }
            }

            private static final CaptureFileType[] $values() {
                return new CaptureFileType[]{Image, Video, Unknown};
            }

            static {
                CaptureFileType[] captureFileTypeArr$values = $values();
                $VALUES = captureFileTypeArr$values;
                $ENTRIES = T9.b.a(captureFileTypeArr$values);
                Companion = new Companion(null);
            }

            private CaptureFileType(String str, int i) {
            }

            @NotNull
            public static a<CaptureFileType> getEntries() {
                return $ENTRIES;
            }

            public static CaptureFileType valueOf(String str) {
                return (CaptureFileType) Enum.valueOf(CaptureFileType.class, str);
            }

            public static CaptureFileType[] values() {
                return (CaptureFileType[]) $VALUES.clone();
            }
        }

        @i(generateAdapter = false)
        public static final class CaptureMethod {
            private static final a $ENTRIES;
            private static final CaptureMethod[] $VALUES;

            @g(name = "only_center")
            public static final CaptureMethod ONLY_CENTER = new CaptureMethod("ONLY_CENTER", 0);

            @g(name = "profile_and_center")
            public static final CaptureMethod PROFILE_AND_CENTER = new CaptureMethod("PROFILE_AND_CENTER", 1);

            @g(name = "configurable_poses")
            public static final CaptureMethod CONFIGURABLE_POSES = new CaptureMethod("CONFIGURABLE_POSES", 2);

            private static final CaptureMethod[] $values() {
                return new CaptureMethod[]{ONLY_CENTER, PROFILE_AND_CENTER, CONFIGURABLE_POSES};
            }

            static {
                CaptureMethod[] captureMethodArr$values = $values();
                $VALUES = captureMethodArr$values;
                $ENTRIES = T9.b.a(captureMethodArr$values);
            }

            private CaptureMethod(String str, int i) {
            }

            @NotNull
            public static a<CaptureMethod> getEntries() {
                return $ENTRIES;
            }

            public static CaptureMethod valueOf(String str) {
                return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
            }

            public static CaptureMethod[] values() {
                return (CaptureMethod[]) $VALUES.clone();
            }
        }

        @i(generateAdapter = true)
        public static final class CapturePage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();

            @NotNull
            private final String selfieHintCenterFace;

            @NotNull
            private final String selfieHintFaceIncomplete;

            @NotNull
            private final String selfieHintFaceTooClose;

            @NotNull
            private final String selfieHintFaceTooFar;

            @NotNull
            private final String selfieHintHoldStill;

            @NotNull
            private final String selfieHintLookLeft;

            @NotNull
            private final String selfieHintLookRight;

            @NotNull
            private final String selfieHintMultipleFaces;

            @NotNull
            private final String selfieHintPoseNotCenter;

            @NotNull
            private final String selfieHintTakePhoto;
            private final String title;

            public static final class Creator implements Parcelable.Creator<CapturePage> {
                @Override
                @NotNull
                public final CapturePage createFromParcel(@NotNull Parcel parcel) {
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final CapturePage[] newArray(int i) {
                    return new CapturePage[i];
                }
            }

            public CapturePage(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
                this.title = str;
                this.selfieHintTakePhoto = str2;
                this.selfieHintCenterFace = str3;
                this.selfieHintFaceTooClose = str4;
                this.selfieHintFaceTooFar = str5;
                this.selfieHintMultipleFaces = str6;
                this.selfieHintFaceIncomplete = str7;
                this.selfieHintPoseNotCenter = str8;
                this.selfieHintLookLeft = str9;
                this.selfieHintLookRight = str10;
                this.selfieHintHoldStill = str11;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            @NotNull
            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            @NotNull
            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            @NotNull
            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            @NotNull
            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            @NotNull
            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            @NotNull
            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            @NotNull
            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            @NotNull
            public final String getSelfieHintPoseNotCenter() {
                return this.selfieHintPoseNotCenter;
            }

            @NotNull
            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.selfieHintTakePhoto);
                parcel.writeString(this.selfieHintCenterFace);
                parcel.writeString(this.selfieHintFaceTooClose);
                parcel.writeString(this.selfieHintFaceTooFar);
                parcel.writeString(this.selfieHintMultipleFaces);
                parcel.writeString(this.selfieHintFaceIncomplete);
                parcel.writeString(this.selfieHintPoseNotCenter);
                parcel.writeString(this.selfieHintLookLeft);
                parcel.writeString(this.selfieHintLookRight);
                parcel.writeString(this.selfieHintHoldStill);
            }
        }

        @i(generateAdapter = true)
        public static final class CheckPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();
            private final String btnRetake;
            private final String btnSubmit;
            private final String description;
            private final String selfieLabelFront;
            private final String selfieLabelLeft;
            private final String selfieLabelRight;
            private final String title;

            public static final class Creator implements Parcelable.Creator<CheckPage> {
                @Override
                @NotNull
                public final CheckPage createFromParcel(@NotNull Parcel parcel) {
                    return new CheckPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final CheckPage[] newArray(int i) {
                    return new CheckPage[i];
                }
            }

            public CheckPage(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.title = str;
                this.description = str2;
                this.selfieLabelFront = str3;
                this.selfieLabelLeft = str4;
                this.selfieLabelRight = str5;
                this.btnSubmit = str6;
                this.btnRetake = str7;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getBtnRetake() {
                return this.btnRetake;
            }

            public final String getBtnSubmit() {
                return this.btnSubmit;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getSelfieLabelFront() {
                return this.selfieLabelFront;
            }

            public final String getSelfieLabelLeft() {
                return this.selfieLabelLeft;
            }

            public final String getSelfieLabelRight() {
                return this.selfieLabelRight;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeString(this.selfieLabelFront);
                parcel.writeString(this.selfieLabelLeft);
                parcel.writeString(this.selfieLabelRight);
                parcel.writeString(this.btnSubmit);
                parcel.writeString(this.btnRetake);
            }
        }

        @i(generateAdapter = true)
        public static final class Config {

            @NotNull
            private final AssetConfig assets;
            private final Boolean audioEnabled;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<CaptureFileType> enabledCaptureFileTypes;

            @NotNull
            private final String fieldKeySelfie;

            @NotNull
            private final Localizations localizations;
            private final List<SelfiePose> orderedPoses;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final List<PoseConfig> poseConfigs;
            private final boolean requireStrictSelfieCapture;

            @NotNull
            private final CaptureMethod selfieType;
            private final Boolean skipPromptPage;
            private final List<VideoCaptureMethod> videoCaptureMethods;
            private final String videoSessionJwt;

            public Config(@NotNull CaptureMethod captureMethod, Boolean bool, Boolean bool2, @NotNull Localizations localizations, @NotNull String str, boolean z, Boolean bool3, List<? extends CaptureFileType> list, List<? extends VideoCaptureMethod> list2, @NotNull AssetConfig assetConfig, @g(name = "videoSessionJWT") String str2, List<? extends SelfiePose> list3, PendingPageTextPosition pendingPageTextPosition, Boolean bool4, List<PoseConfig> list4) {
                this.selfieType = captureMethod;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.fieldKeySelfie = str;
                this.requireStrictSelfieCapture = z;
                this.skipPromptPage = bool3;
                this.enabledCaptureFileTypes = list;
                this.videoCaptureMethods = list2;
                this.assets = assetConfig;
                this.videoSessionJwt = str2;
                this.orderedPoses = list3;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
                this.poseConfigs = list4;
            }

            @NotNull
            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            @NotNull
            public final String getFieldKeySelfie() {
                return this.fieldKeySelfie;
            }

            @NotNull
            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final List<SelfiePose> getOrderedPoses() {
                return this.orderedPoses;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final List<PoseConfig> getPoseConfigs() {
                return this.poseConfigs;
            }

            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @NotNull
            public final CaptureMethod getSelfieType() {
                return this.selfieType;
            }

            public final Boolean getSkipPromptPage() {
                return this.skipPromptPage;
            }

            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }
        }

        @i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;

            @NotNull
            private final CapturePage capturePage;
            private final CheckPage checkPage;

            @NotNull
            private final PendingPage pendingPage;

            @NotNull
            private final PromptPage promptPage;

            public static final class Creator implements Parcelable.Creator<Localizations> {
                @Override
                @NotNull
                public final Localizations createFromParcel(@NotNull Parcel parcel) {
                    return new Localizations(PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CheckPage.CREATOR.createFromParcel(parcel) : null);
                }

                @Override
                @NotNull
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }

            public Localizations(@NotNull PromptPage promptPage, @NotNull CapturePage capturePage, @NotNull PendingPage pendingPage, CancelDialog cancelDialog, CheckPage checkPage) {
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.pendingPage = pendingPage;
                this.cancelDialog = cancelDialog;
                this.checkPage = checkPage;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            @NotNull
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            @NotNull
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            @NotNull
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                this.promptPage.writeToParcel(parcel, i);
                this.capturePage.writeToParcel(parcel, i);
                this.pendingPage.writeToParcel(parcel, i);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, i);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    checkPage.writeToParcel(parcel, i);
                }
            }
        }

        @i(generateAdapter = true)
        public static final class PendingPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();

            @NotNull
            private final String description;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<PendingPage> {
                @Override
                @NotNull
                public final PendingPage createFromParcel(@NotNull Parcel parcel) {
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final PendingPage[] newArray(int i) {
                    return new PendingPage[i];
                }
            }

            public PendingPage(@NotNull String str, @NotNull String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        @i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();

            @NotNull
            private final String buttonSubmit;
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;

            @NotNull
            private final String disclosure;
            private final String microphonePermissionsBtnCancel;
            private final String microphonePermissionsBtnContinueMobile;
            private final String microphonePermissionsPrompt;
            private final String microphonePermissionsTitle;

            @NotNull
            private final String prompt;

            @NotNull
            private final String promptCenter;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<PromptPage> {
                @Override
                @NotNull
                public final PromptPage createFromParcel(@NotNull Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }

            public PromptPage(@g(name = "selfieTitle") @NotNull String str, @g(name = "selfiePrompt") @NotNull String str2, @g(name = "selfiePromptCenter") @NotNull String str3, @g(name = "agreeToPolicy") @NotNull String str4, @g(name = "btnSubmit") @NotNull String str5, String str6, String str7, @g(name = "cameraPermissionsBtnContinueMobile") String str8, @g(name = "cameraPermissionsBtnCancel") String str9, String str10, String str11, String str12, String str13) {
                this.title = str;
                this.prompt = str2;
                this.promptCenter = str3;
                this.disclosure = str4;
                this.buttonSubmit = str5;
                this.cameraPermissionsTitle = str6;
                this.cameraPermissionsPrompt = str7;
                this.cameraPermissionsAllowButtonText = str8;
                this.cameraPermissionsCancelButtonText = str9;
                this.microphonePermissionsBtnCancel = str10;
                this.microphonePermissionsBtnContinueMobile = str11;
                this.microphonePermissionsPrompt = str12;
                this.microphonePermissionsTitle = str13;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            @NotNull
            public final String getDisclosure() {
                return this.disclosure;
            }

            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @NotNull
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            public final String getPromptCenter() {
                return this.promptCenter;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.promptCenter);
                parcel.writeString(this.disclosure);
                parcel.writeString(this.buttonSubmit);
                parcel.writeString(this.cameraPermissionsTitle);
                parcel.writeString(this.cameraPermissionsPrompt);
                parcel.writeString(this.cameraPermissionsAllowButtonText);
                parcel.writeString(this.cameraPermissionsCancelButtonText);
                parcel.writeString(this.microphonePermissionsBtnCancel);
                parcel.writeString(this.microphonePermissionsBtnContinueMobile);
                parcel.writeString(this.microphonePermissionsPrompt);
                parcel.writeString(this.microphonePermissionsTitle);
            }
        }

        @i(generateAdapter = false)
        public static final class SelfiePose {
            private static final a $ENTRIES;
            private static final SelfiePose[] $VALUES;

            @g(name = "center")
            public static final SelfiePose CENTER = new SelfiePose("CENTER", 0);

            @g(name = "left")
            public static final SelfiePose LEFT = new SelfiePose("LEFT", 1);

            @g(name = "right")
            public static final SelfiePose RIGHT = new SelfiePose("RIGHT", 2);

            private static final SelfiePose[] $values() {
                return new SelfiePose[]{CENTER, LEFT, RIGHT};
            }

            static {
                SelfiePose[] selfiePoseArr$values = $values();
                $VALUES = selfiePoseArr$values;
                $ENTRIES = T9.b.a(selfiePoseArr$values);
            }

            private SelfiePose(String str, int i) {
            }

            @NotNull
            public static a<SelfiePose> getEntries() {
                return $ENTRIES;
            }

            public static SelfiePose valueOf(String str) {
                return (SelfiePose) Enum.valueOf(SelfiePose.class, str);
            }

            public static SelfiePose[] values() {
                return (SelfiePose[]) $VALUES.clone();
            }
        }

        @i(generateAdapter = false)
        public static final class VideoCaptureMethod {
            private static final a $ENTRIES;
            private static final VideoCaptureMethod[] $VALUES;

            @NotNull
            public static final Companion Companion;
            public static final VideoCaptureMethod Stream = new VideoCaptureMethod("Stream", 0);
            public static final VideoCaptureMethod Upload = new VideoCaptureMethod("Upload", 1);
            public static final VideoCaptureMethod None = new VideoCaptureMethod("None", 2);

            public static final class Companion extends h<VideoCaptureMethod> {
                public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @z
                public void toJson(@NotNull t tVar, VideoCaptureMethod videoCaptureMethod) {
                }

                private Companion() {
                }

                @f
                @NotNull
                public VideoCaptureMethod m148fromJson(@NotNull m mVar) {
                    Object objM0 = mVar.M0();
                    return Intrinsics.b(objM0, "stream") ? VideoCaptureMethod.Stream : Intrinsics.b(objM0, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }
            }

            private static final VideoCaptureMethod[] $values() {
                return new VideoCaptureMethod[]{Stream, Upload, None};
            }

            static {
                VideoCaptureMethod[] videoCaptureMethodArr$values = $values();
                $VALUES = videoCaptureMethodArr$values;
                $ENTRIES = T9.b.a(videoCaptureMethodArr$values);
                Companion = new Companion(null);
            }

            private VideoCaptureMethod(String str, int i) {
            }

            @NotNull
            public static a<VideoCaptureMethod> getEntries() {
                return $ENTRIES;
            }

            public static VideoCaptureMethod valueOf(String str) {
                return (VideoCaptureMethod) Enum.valueOf(VideoCaptureMethod.class, str);
            }

            public static VideoCaptureMethod[] values() {
                return (VideoCaptureMethod[]) $VALUES.clone();
            }
        }

        public Selfie(@NotNull String str, @NotNull Config config, StepStyles.SelfieStepStyle selfieStepStyle) {
            super(str, null);
            this.name = str;
            this.config = config;
            this.styles = selfieStepStyle;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }
    }

    @i(generateAdapter = true)
    public static final class Ui extends NextStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Ui> CREATOR = new Creator();

        @NotNull
        private final Config config;

        @NotNull
        private final String name;
        private final StepStyles.UiStepStyle styles;

        public static final class Creator implements Parcelable.Creator<Ui> {
            @Override
            @NotNull
            public final Ui createFromParcel(@NotNull Parcel parcel) {
                return new Ui(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepStyles.UiStepStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final Ui[] newArray(int i) {
                return new Ui[i];
            }
        }

        @i(generateAdapter = true)
        public static final class Localizations implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final PromptPage promptPage;

            public static final class Creator implements Parcelable.Creator<Localizations> {
                @Override
                @NotNull
                public final Localizations createFromParcel(@NotNull Parcel parcel) {
                    return new Localizations(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CancelDialog.CREATOR.createFromParcel(parcel) : null);
                }

                @Override
                @NotNull
                public final Localizations[] newArray(int i) {
                    return new Localizations[i];
                }
            }

            public Localizations(PromptPage promptPage, CancelDialog cancelDialog) {
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, i);
                }
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, i);
                }
            }
        }

        @i(generateAdapter = true)
        public static final class PromptPage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String gpsFeaturePrompt;
            private final String gpsFeatureTitle;
            private final String gpsFeatureTurnOnText;
            private final String gpsPermissionsAllowButtonText;
            private final String gpsPermissionsBtnCancel;
            private final String gpsPermissionsPrompt;
            private final String gpsPermissionsTitle;

            public static final class Creator implements Parcelable.Creator<PromptPage> {
                @Override
                @NotNull
                public final PromptPage createFromParcel(@NotNull Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final PromptPage[] newArray(int i) {
                    return new PromptPage[i];
                }
            }

            public PromptPage(String str, @g(name = "gpsPermissionsBtnContinueMobile") String str2, @g(name = "gpsDeviceFeatureBtnContinueMobile") String str3, String str4, String str5, String str6, String str7) {
                this.gpsPermissionsBtnCancel = str;
                this.gpsPermissionsAllowButtonText = str2;
                this.gpsFeatureTurnOnText = str3;
                this.gpsPermissionsPrompt = str4;
                this.gpsPermissionsTitle = str5;
                this.gpsFeaturePrompt = str6;
                this.gpsFeatureTitle = str7;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final String getGpsFeaturePrompt() {
                return this.gpsFeaturePrompt;
            }

            public final String getGpsFeatureTitle() {
                return this.gpsFeatureTitle;
            }

            public final String getGpsFeatureTurnOnText() {
                return this.gpsFeatureTurnOnText;
            }

            public final String getGpsPermissionsAllowButtonText() {
                return this.gpsPermissionsAllowButtonText;
            }

            public final String getGpsPermissionsBtnCancel() {
                return this.gpsPermissionsBtnCancel;
            }

            public final String getGpsPermissionsPrompt() {
                return this.gpsPermissionsPrompt;
            }

            public final String getGpsPermissionsTitle() {
                return this.gpsPermissionsTitle;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.gpsPermissionsBtnCancel);
                parcel.writeString(this.gpsPermissionsAllowButtonText);
                parcel.writeString(this.gpsFeatureTurnOnText);
                parcel.writeString(this.gpsPermissionsPrompt);
                parcel.writeString(this.gpsPermissionsTitle);
                parcel.writeString(this.gpsFeaturePrompt);
                parcel.writeString(this.gpsFeatureTitle);
            }
        }

        public Ui(String str, Config config, StepStyles.UiStepStyle uiStepStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, (i & 4) != 0 ? null : uiStepStyle);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.name);
            this.config.writeToParcel(parcel, i);
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            if (uiStepStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepStyle.writeToParcel(parcel, i);
            }
        }

        public Ui(@NotNull String str, @NotNull Config config, StepStyles.UiStepStyle uiStepStyle) {
            super(str, null);
            this.name = str;
            this.config = config;
            this.styles = uiStepStyle;
        }

        @i(generateAdapter = true)
        public static final class Config implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new Creator();
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<UiComponentConfig> components;
            private final Localizations localizations;
            private final List<UiComponentError> serverComponentErrors;
            private final Boolean terminal;

            public static final class Creator implements Parcelable.Creator<Config> {
                @Override
                @NotNull
                public final Config createFromParcel(@NotNull Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2 = null;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            arrayList3.add(parcel.readParcelable(Config.class.getClassLoader()));
                        }
                        arrayList = arrayList3;
                    }
                    Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Localizations localizationsCreateFromParcel = parcel.readInt() == 0 ? null : Localizations.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int i3 = parcel.readInt();
                        arrayList2 = new ArrayList(i3);
                        for (int i4 = 0; i4 != i3; i4++) {
                            arrayList2.add(parcel.readParcelable(Config.class.getClassLoader()));
                        }
                    }
                    return new Config(arrayList, boolValueOf, boolValueOf2, boolValueOf3, localizationsCreateFromParcel, arrayList2);
                }

                @Override
                @NotNull
                public final Config[] newArray(int i) {
                    return new Config[i];
                }
            }

            public Config(List<? extends UiComponentConfig> list, Boolean bool, Boolean bool2, Boolean bool3, Localizations localizations, List<? extends UiComponentError> list2) {
                this.components = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.terminal = bool3;
                this.localizations = localizations;
                this.serverComponentErrors = list2;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<UiComponentConfig> getComponents() {
                return this.components;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final List<UiComponentError> getServerComponentErrors() {
                return this.serverComponentErrors;
            }

            public final Boolean getTerminal() {
                return this.terminal;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                List<UiComponentConfig> list = this.components;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(list.size());
                    Iterator<UiComponentConfig> it = list.iterator();
                    while (it.hasNext()) {
                        parcel.writeParcelable(it.next(), i);
                    }
                }
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                Boolean bool3 = this.terminal;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool3.booleanValue() ? 1 : 0);
                }
                Localizations localizations = this.localizations;
                if (localizations == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    localizations.writeToParcel(parcel, i);
                }
                List<UiComponentError> list2 = this.serverComponentErrors;
                if (list2 == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<UiComponentError> it2 = list2.iterator();
                while (it2.hasNext()) {
                    parcel.writeParcelable(it2.next(), i);
                }
            }

            public Config(List list, Boolean bool, Boolean bool2, Boolean bool3, Localizations localizations, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : localizations, (i & 32) == 0 ? list2 : null);
            }
        }
    }

    public static final class Unknown extends NextStep {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public int hashCode() {
            return -1141780238;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }

    public NextStep(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    private NextStep(String str) {
        this.name = str;
    }
}
