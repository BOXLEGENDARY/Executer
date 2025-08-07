package com.withpersona.sdk2.inquiry.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ha.C0460h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class GenericFileUploadErrorResponse {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final List<DocumentErrorResponse> errors;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h.e getAdapter() {
            return b8.b.b(DocumentErrorResponse.class, "code").e(DocumentErrorResponse.DisabledFileTypeError.class, "document-generic-disabled-file-type-error").e(DocumentErrorResponse.FileLimitExceededError.class, "document-generic-file-limit-exceeded-error").e(DocumentErrorResponse.PageLimitExceededError.class, "document-generic-page-limit-exceeded-error").e(DocumentErrorResponse.MalformedFileError.class, "document-generic-malformed-file-error").e(DocumentErrorResponse.MalformedImageError.class, "document-generic-malformed-image-error").e(DocumentErrorResponse.MalformedPdfError.class, "document-generic-malformed-pdf-error").e(DocumentErrorResponse.GovernmentIdDimensionSizeError.class, "document-government-id-dimension-size-error").d(UnknownErrorAdapter.INSTANCE);
        }

        private Companion() {
        }
    }

    public static abstract class DocumentErrorResponse implements Parcelable {

        @i(generateAdapter = true)
        public static final class DisabledFileTypeError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<DisabledFileTypeError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<DisabledFileTypeError> {
                @Override
                @NotNull
                public final DisabledFileTypeError createFromParcel(@NotNull Parcel parcel) {
                    return new DisabledFileTypeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final DisabledFileTypeError[] newArray(int i) {
                    return new DisabledFileTypeError[i];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                @NotNull
                private final List<String> enabledFileTypes;

                @NotNull
                private final String uploadedFileType;

                public static final class Creator implements Parcelable.Creator<Details> {
                    @Override
                    @NotNull
                    public final Details createFromParcel(@NotNull Parcel parcel) {
                        return new Details(parcel.readString(), parcel.createStringArrayList());
                    }

                    @Override
                    @NotNull
                    public final Details[] newArray(int i) {
                        return new Details[i];
                    }
                }

                public Details(@g(name = "uploaded_file_type") @NotNull String str, @g(name = "enabled_file_types") @NotNull List<String> list) {
                    this.uploadedFileType = str;
                    this.enabledFileTypes = list;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @NotNull
                public final List<String> getEnabledFileTypes() {
                    return this.enabledFileTypes;
                }

                @NotNull
                public final String getUploadedFileType() {
                    return this.uploadedFileType;
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    parcel.writeString(this.uploadedFileType);
                    parcel.writeStringList(this.enabledFileTypes);
                }
            }

            public DisabledFileTypeError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i);
            }

            @Override
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class FileLimitExceededError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<FileLimitExceededError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<FileLimitExceededError> {
                @Override
                @NotNull
                public final FileLimitExceededError createFromParcel(@NotNull Parcel parcel) {
                    return new FileLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final FileLimitExceededError[] newArray(int i) {
                    return new FileLimitExceededError[i];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    @Override
                    @NotNull
                    public final Details createFromParcel(@NotNull Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    @Override
                    @NotNull
                    public final Details[] newArray(int i) {
                        return new Details[i];
                    }
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            public FileLimitExceededError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i);
            }

            @Override
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class GovernmentIdDimensionSizeError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<GovernmentIdDimensionSizeError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<GovernmentIdDimensionSizeError> {
                @Override
                @NotNull
                public final GovernmentIdDimensionSizeError createFromParcel(@NotNull Parcel parcel) {
                    return new GovernmentIdDimensionSizeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final GovernmentIdDimensionSizeError[] newArray(int i) {
                    return new GovernmentIdDimensionSizeError[i];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int maxDimensionSize;
                private final int minDimensionSize;

                public static final class Creator implements Parcelable.Creator<Details> {
                    @Override
                    @NotNull
                    public final Details createFromParcel(@NotNull Parcel parcel) {
                        return new Details(parcel.readInt(), parcel.readInt());
                    }

                    @Override
                    @NotNull
                    public final Details[] newArray(int i) {
                        return new Details[i];
                    }
                }

                public Details(@g(name = "min_dimension_size") int i, @g(name = "max_dimension_size") int i2) {
                    this.minDimensionSize = i;
                    this.maxDimensionSize = i2;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public final int getMaxDimensionSize() {
                    return this.maxDimensionSize;
                }

                public final int getMinDimensionSize() {
                    return this.minDimensionSize;
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    parcel.writeInt(this.minDimensionSize);
                    parcel.writeInt(this.maxDimensionSize);
                }
            }

            public GovernmentIdDimensionSizeError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i);
            }

            @Override
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class MalformedFileError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<MalformedFileError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedFileError> {
                @Override
                @NotNull
                public final MalformedFileError createFromParcel(@NotNull Parcel parcel) {
                    return new MalformedFileError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final MalformedFileError[] newArray(int i) {
                    return new MalformedFileError[i];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    @Override
                    @NotNull
                    public final Details createFromParcel(@NotNull Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    @Override
                    @NotNull
                    public final Details[] newArray(int i) {
                        return new Details[i];
                    }
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            public MalformedFileError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i);
            }

            @Override
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class MalformedImageError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<MalformedImageError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedImageError> {
                @Override
                @NotNull
                public final MalformedImageError createFromParcel(@NotNull Parcel parcel) {
                    return new MalformedImageError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final MalformedImageError[] newArray(int i) {
                    return new MalformedImageError[i];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    @Override
                    @NotNull
                    public final Details createFromParcel(@NotNull Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    @Override
                    @NotNull
                    public final Details[] newArray(int i) {
                        return new Details[i];
                    }
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            public MalformedImageError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i);
            }

            @Override
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class MalformedPdfError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<MalformedPdfError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedPdfError> {
                @Override
                @NotNull
                public final MalformedPdfError createFromParcel(@NotNull Parcel parcel) {
                    return new MalformedPdfError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final MalformedPdfError[] newArray(int i) {
                    return new MalformedPdfError[i];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    @Override
                    @NotNull
                    public final Details createFromParcel(@NotNull Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    @Override
                    @NotNull
                    public final Details[] newArray(int i) {
                        return new Details[i];
                    }
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            public MalformedPdfError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i);
            }

            @Override
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class PageLimitExceededError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<PageLimitExceededError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<PageLimitExceededError> {
                @Override
                @NotNull
                public final PageLimitExceededError createFromParcel(@NotNull Parcel parcel) {
                    return new PageLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                @Override
                @NotNull
                public final PageLimitExceededError[] newArray(int i) {
                    return new PageLimitExceededError[i];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int pageLimit;

                public static final class Creator implements Parcelable.Creator<Details> {
                    @Override
                    @NotNull
                    public final Details createFromParcel(@NotNull Parcel parcel) {
                        return new Details(parcel.readInt());
                    }

                    @Override
                    @NotNull
                    public final Details[] newArray(int i) {
                        return new Details[i];
                    }
                }

                public Details(@g(name = "page_limit") int i) {
                    this.pageLimit = i;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                public final int getPageLimit() {
                    return this.pageLimit;
                }

                @Override
                public void writeToParcel(@NotNull Parcel parcel, int i) {
                    parcel.writeInt(this.pageLimit);
                }
            }

            public PageLimitExceededError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i);
            }

            @Override
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class UnknownError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();
            private final String code;
            private final ErrorDetails details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnknownError> {
                @Override
                @NotNull
                public final UnknownError createFromParcel(@NotNull Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString(), (ErrorDetails) parcel.readParcelable(UnknownError.class.getClassLoader()));
                }

                @Override
                @NotNull
                public final UnknownError[] newArray(int i) {
                    return new UnknownError[i];
                }
            }

            public UnknownError() {
                this(null, null, null, 7, null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public String getCode() {
                return this.code;
            }

            @Override
            public ErrorDetails getDetails() {
                return this.details;
            }

            @Override
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                parcel.writeParcelable(this.details, i);
            }

            public UnknownError(String str, String str2, ErrorDetails errorDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "Unknown Error" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : errorDetails);
            }

            public UnknownError(@NotNull String str, String str2, ErrorDetails errorDetails) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = errorDetails;
            }
        }

        public DocumentErrorResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getCode();

        public abstract ErrorDetails getDetails();

        @NotNull
        public abstract String getTitle();

        private DocumentErrorResponse() {
        }
    }

    public static final class UnknownErrorAdapter extends h<DocumentErrorResponse.UnknownError> {

        @NotNull
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        @NotNull
        public DocumentErrorResponse.UnknownError m101fromJson(@NotNull m mVar) {
            mVar.e();
            String strA = null;
            String strA2 = null;
            while (mVar.u()) {
                String strZ = mVar.Z();
                if (Intrinsics.b(strZ, Title.type)) {
                    strA = C0460h.a(mVar);
                } else if (Intrinsics.b(strZ, "code")) {
                    strA2 = C0460h.a(mVar);
                } else {
                    mVar.f1();
                }
            }
            mVar.j();
            if (strA == null) {
                strA = "Unknown Error";
            }
            return new DocumentErrorResponse.UnknownError(strA, strA2, null, 4, null);
        }

        public void toJson(@NotNull t tVar, DocumentErrorResponse.UnknownError unknownError) {
            tVar.f();
            tVar.Z(Title.type);
            tVar.b1(unknownError != null ? unknownError.getTitle() : null);
            tVar.Z("code");
            tVar.b1(unknownError != null ? unknownError.getCode() : null);
            tVar.y();
        }
    }

    public GenericFileUploadErrorResponse(@NotNull List<? extends DocumentErrorResponse> list) {
        this.errors = list;
    }

    public static GenericFileUploadErrorResponse copy$default(GenericFileUploadErrorResponse genericFileUploadErrorResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = genericFileUploadErrorResponse.errors;
        }
        return genericFileUploadErrorResponse.copy(list);
    }

    @NotNull
    public final List<DocumentErrorResponse> component1() {
        return this.errors;
    }

    @NotNull
    public final GenericFileUploadErrorResponse copy(@NotNull List<? extends DocumentErrorResponse> list) {
        return new GenericFileUploadErrorResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericFileUploadErrorResponse) && Intrinsics.b(this.errors, ((GenericFileUploadErrorResponse) obj).errors);
    }

    @NotNull
    public final List<DocumentErrorResponse> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "GenericFileUploadErrorResponse(errors=" + this.errors + ")";
    }
}
