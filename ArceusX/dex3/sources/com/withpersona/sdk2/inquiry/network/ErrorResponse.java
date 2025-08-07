package com.withpersona.sdk2.inquiry.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ha.C0460h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class ErrorResponse {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final List<Error> errors;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ErrorResponse create(String str) {
            return new ErrorResponse(CollectionsKt.d(new Error.UnknownError(str, null)));
        }

        @NotNull
        public final h.e getAdapter() {
            return ErrorJsonAdapterFactory.INSTANCE;
        }

        private Companion() {
        }
    }

    public static abstract class Error implements Parcelable {

        @i(generateAdapter = true)
        public static final class FieldNotFoundError extends Error {

            @NotNull
            public static final Parcelable.Creator<FieldNotFoundError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<FieldNotFoundError> {
                @Override
                @NotNull
                public final FieldNotFoundError createFromParcel(@NotNull Parcel parcel) {
                    return new FieldNotFoundError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final FieldNotFoundError[] newArray(int i) {
                    return new FieldNotFoundError[i];
                }
            }

            public FieldNotFoundError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static FieldNotFoundError copy$default(FieldNotFoundError fieldNotFoundError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fieldNotFoundError.title;
                }
                if ((i & 2) != 0) {
                    str2 = fieldNotFoundError.details;
                }
                return fieldNotFoundError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            @NotNull
            public final FieldNotFoundError copy(String str, String str2) {
                return new FieldNotFoundError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FieldNotFoundError)) {
                    return false;
                }
                FieldNotFoundError fieldNotFoundError = (FieldNotFoundError) obj;
                return Intrinsics.b(this.title, fieldNotFoundError.title) && Intrinsics.b(this.details, fieldNotFoundError.details);
            }

            @Override
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "FieldNotFoundError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InactiveTemplateError extends Error {

            @NotNull
            public static final Parcelable.Creator<InactiveTemplateError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InactiveTemplateError> {
                @Override
                @NotNull
                public final InactiveTemplateError createFromParcel(@NotNull Parcel parcel) {
                    return new InactiveTemplateError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final InactiveTemplateError[] newArray(int i) {
                    return new InactiveTemplateError[i];
                }
            }

            public InactiveTemplateError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static InactiveTemplateError copy$default(InactiveTemplateError inactiveTemplateError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inactiveTemplateError.title;
                }
                if ((i & 2) != 0) {
                    str2 = inactiveTemplateError.details;
                }
                return inactiveTemplateError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            @NotNull
            public final InactiveTemplateError copy(String str, String str2) {
                return new InactiveTemplateError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InactiveTemplateError)) {
                    return false;
                }
                InactiveTemplateError inactiveTemplateError = (InactiveTemplateError) obj;
                return Intrinsics.b(this.title, inactiveTemplateError.title) && Intrinsics.b(this.details, inactiveTemplateError.details);
            }

            @Override
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "InactiveTemplateError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InconsistentTransitionError extends Error {

            @NotNull
            public static final Parcelable.Creator<InconsistentTransitionError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InconsistentTransitionError> {
                @Override
                @NotNull
                public final InconsistentTransitionError createFromParcel(@NotNull Parcel parcel) {
                    return new InconsistentTransitionError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final InconsistentTransitionError[] newArray(int i) {
                    return new InconsistentTransitionError[i];
                }
            }

            public InconsistentTransitionError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static InconsistentTransitionError copy$default(InconsistentTransitionError inconsistentTransitionError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inconsistentTransitionError.title;
                }
                if ((i & 2) != 0) {
                    str2 = inconsistentTransitionError.details;
                }
                return inconsistentTransitionError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            @NotNull
            public final InconsistentTransitionError copy(String str, String str2) {
                return new InconsistentTransitionError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InconsistentTransitionError)) {
                    return false;
                }
                InconsistentTransitionError inconsistentTransitionError = (InconsistentTransitionError) obj;
                return Intrinsics.b(this.title, inconsistentTransitionError.title) && Intrinsics.b(this.details, inconsistentTransitionError.details);
            }

            @Override
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "InconsistentTransitionError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InvalidConfigError extends Error {

            @NotNull
            public static final Parcelable.Creator<InvalidConfigError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InvalidConfigError> {
                @Override
                @NotNull
                public final InvalidConfigError createFromParcel(@NotNull Parcel parcel) {
                    return new InvalidConfigError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final InvalidConfigError[] newArray(int i) {
                    return new InvalidConfigError[i];
                }
            }

            public InvalidConfigError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static InvalidConfigError copy$default(InvalidConfigError invalidConfigError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = invalidConfigError.title;
                }
                if ((i & 2) != 0) {
                    str2 = invalidConfigError.details;
                }
                return invalidConfigError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            @NotNull
            public final InvalidConfigError copy(String str, String str2) {
                return new InvalidConfigError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidConfigError)) {
                    return false;
                }
                InvalidConfigError invalidConfigError = (InvalidConfigError) obj;
                return Intrinsics.b(this.title, invalidConfigError.title) && Intrinsics.b(this.details, invalidConfigError.details);
            }

            @Override
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "InvalidConfigError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InvalidFieldValueError extends Error {

            @NotNull
            public static final Parcelable.Creator<InvalidFieldValueError> CREATOR = new Creator();
            private final Map<String, UiComponentError> details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InvalidFieldValueError> {
                @Override
                @NotNull
                public final InvalidFieldValueError createFromParcel(@NotNull Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            linkedHashMap2.put(parcel.readString(), parcel.readParcelable(InvalidFieldValueError.class.getClassLoader()));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new InvalidFieldValueError(string, linkedHashMap);
                }

                @Override
                @NotNull
                public final InvalidFieldValueError[] newArray(int i) {
                    return new InvalidFieldValueError[i];
                }
            }

            public InvalidFieldValueError(String str, Map<String, ? extends UiComponentError> map) {
                super(null);
                this.title = str;
                this.details = map;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            @NotNull
            public String getDescription() {
                Set<String> setKeySet;
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value(s) on field(s) ");
                Map<String, UiComponentError> map = this.details;
                sb.append((map == null || (setKeySet = map.keySet()) == null) ? null : CollectionsKt.U(setKeySet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
                sb.append(".");
                return sb.toString();
            }

            public final Map<String, UiComponentError> getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                Map<String, UiComponentError> map = this.details;
                if (map == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, UiComponentError> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeParcelable(entry.getValue(), i);
                }
            }
        }

        @i(generateAdapter = true)
        public static final class RateLimitExceededError extends Error {

            @NotNull
            public static final Parcelable.Creator<RateLimitExceededError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<RateLimitExceededError> {
                @Override
                @NotNull
                public final RateLimitExceededError createFromParcel(@NotNull Parcel parcel) {
                    return new RateLimitExceededError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final RateLimitExceededError[] newArray(int i) {
                    return new RateLimitExceededError[i];
                }
            }

            public RateLimitExceededError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static RateLimitExceededError copy$default(RateLimitExceededError rateLimitExceededError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rateLimitExceededError.title;
                }
                if ((i & 2) != 0) {
                    str2 = rateLimitExceededError.details;
                }
                return rateLimitExceededError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            @NotNull
            public final RateLimitExceededError copy(String str, String str2) {
                return new RateLimitExceededError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RateLimitExceededError)) {
                    return false;
                }
                RateLimitExceededError rateLimitExceededError = (RateLimitExceededError) obj;
                return Intrinsics.b(this.title, rateLimitExceededError.title) && Intrinsics.b(this.details, rateLimitExceededError.details);
            }

            @Override
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "RateLimitExceededError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class TransitionFromTerminalStateError extends Error {

            @NotNull
            public static final Parcelable.Creator<TransitionFromTerminalStateError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<TransitionFromTerminalStateError> {
                @Override
                @NotNull
                public final TransitionFromTerminalStateError createFromParcel(@NotNull Parcel parcel) {
                    return new TransitionFromTerminalStateError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final TransitionFromTerminalStateError[] newArray(int i) {
                    return new TransitionFromTerminalStateError[i];
                }
            }

            public TransitionFromTerminalStateError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static TransitionFromTerminalStateError copy$default(TransitionFromTerminalStateError transitionFromTerminalStateError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = transitionFromTerminalStateError.title;
                }
                if ((i & 2) != 0) {
                    str2 = transitionFromTerminalStateError.details;
                }
                return transitionFromTerminalStateError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            @NotNull
            public final TransitionFromTerminalStateError copy(String str, String str2) {
                return new TransitionFromTerminalStateError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransitionFromTerminalStateError)) {
                    return false;
                }
                TransitionFromTerminalStateError transitionFromTerminalStateError = (TransitionFromTerminalStateError) obj;
                return Intrinsics.b(this.title, transitionFromTerminalStateError.title) && Intrinsics.b(this.details, transitionFromTerminalStateError.details);
            }

            @Override
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TransitionFromTerminalStateError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class UnauthenticatedError extends Error {

            @NotNull
            public static final Parcelable.Creator<UnauthenticatedError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnauthenticatedError> {
                @Override
                @NotNull
                public final UnauthenticatedError createFromParcel(@NotNull Parcel parcel) {
                    return new UnauthenticatedError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final UnauthenticatedError[] newArray(int i) {
                    return new UnauthenticatedError[i];
                }
            }

            public UnauthenticatedError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static UnauthenticatedError copy$default(UnauthenticatedError unauthenticatedError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unauthenticatedError.title;
                }
                if ((i & 2) != 0) {
                    str2 = unauthenticatedError.details;
                }
                return unauthenticatedError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            @NotNull
            public final UnauthenticatedError copy(String str, String str2) {
                return new UnauthenticatedError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnauthenticatedError)) {
                    return false;
                }
                UnauthenticatedError unauthenticatedError = (UnauthenticatedError) obj;
                return Intrinsics.b(this.title, unauthenticatedError.title) && Intrinsics.b(this.details, unauthenticatedError.details);
            }

            @Override
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "UnauthenticatedError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class UnknownError extends Error {

            @NotNull
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();
            private transient ResponseBody errorBody;
            private final String originalCode;
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnknownError> {
                @Override
                @NotNull
                public final UnknownError createFromParcel(@NotNull Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final UnknownError[] newArray(int i) {
                    return new UnknownError[i];
                }
            }

            public UnknownError(String str, String str2) {
                super(null);
                this.title = str;
                this.originalCode = str2;
            }

            public static UnknownError copy$default(UnknownError unknownError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unknownError.title;
                }
                if ((i & 2) != 0) {
                    str2 = unknownError.originalCode;
                }
                return unknownError.copy(str, str2);
            }

            public static void getErrorBody$annotations() {
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.originalCode;
            }

            @NotNull
            public final UnknownError copy(String str, String str2) {
                return new UnknownError(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnknownError)) {
                    return false;
                }
                UnknownError unknownError = (UnknownError) obj;
                return Intrinsics.b(this.title, unknownError.title) && Intrinsics.b(this.originalCode, unknownError.originalCode);
            }

            @Override
            public String getDescription() {
                return getTitle();
            }

            public final ResponseBody getErrorBody() {
                return this.errorBody;
            }

            public final String getOriginalCode() {
                return this.originalCode;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.originalCode;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setErrorBody(ResponseBody responseBody) {
                this.errorBody = responseBody;
            }

            @NotNull
            public String toString() {
                return "UnknownError(title=" + this.title + ", originalCode=" + this.originalCode + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.originalCode);
            }
        }

        public Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getDescription();

        public abstract String getTitle();

        private Error() {
        }
    }

    public static final class ErrorJsonAdapterFactory implements h.e {

        @NotNull
        public static final ErrorJsonAdapterFactory INSTANCE = new ErrorJsonAdapterFactory();

        @NotNull
        private static final String LABEL_KEY = "code";
        private static final b8.b<Error> adapterFactory = b8.b.b(Error.class, LABEL_KEY).e(Error.InactiveTemplateError.class, "inactive_template_error").e(Error.InvalidConfigError.class, "invalid_config").e(Error.UnauthenticatedError.class, "unauthenticated").e(Error.InconsistentTransitionError.class, "inconsistent_transition_error").e(Error.TransitionFromTerminalStateError.class, "transition_from_terminal_state_error").e(Error.FieldNotFoundError.class, "field_not_found_error").e(Error.RateLimitExceededError.class, "rate_limit_exceeded").e(Error.InvalidFieldValueError.class, "invalid_field_value_error").e(Error.UnknownError.class, "unknown_error").d(UnknownErrorAdapter.INSTANCE);

        private ErrorJsonAdapterFactory() {
        }

        public h<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull w wVar) {
            final h hVarCreate = adapterFactory.create(type, set, wVar);
            if (hVarCreate == null) {
                return null;
            }
            return new h<Error>(hVarCreate) {

                @NotNull
                private final h<ErrorResponse.Error> errorAdapter;

                {
                    this.errorAdapter = hVarCreate;
                }

                public static void getErrorAdapter$annotations() {
                }

                @NotNull
                public final h<ErrorResponse.Error> getErrorAdapter() {
                    return this.errorAdapter;
                }

                public ErrorResponse.Error m89fromJson(@NotNull m mVar) {
                    return ErrorResponse.ErrorJsonAdapterFactory.INSTANCE.hasLabel(mVar.I0()) ? (ErrorResponse.Error) this.errorAdapter.fromJson(mVar) : ErrorResponse.UnknownErrorAdapter.INSTANCE.m90fromJson(mVar);
                }

                public void toJson(@NotNull t tVar, ErrorResponse.Error error) {
                    this.errorAdapter.toJson(tVar, error);
                }
            }.nullSafe();
        }

        public final boolean hasLabel(@NotNull m mVar) {
            mVar.e();
            while (mVar.u()) {
                if (Intrinsics.b(mVar.Z(), LABEL_KEY)) {
                    return true;
                }
                mVar.f1();
            }
            return false;
        }
    }

    public static final class UnknownErrorAdapter extends h<Error.UnknownError> {

        @NotNull
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        @NotNull
        public Error.UnknownError m90fromJson(@NotNull m mVar) {
            mVar.e();
            String strA = null;
            String strA2 = null;
            while (mVar.u()) {
                String strZ = mVar.Z();
                if (Intrinsics.b(strZ, "code")) {
                    strA2 = C0460h.a(mVar);
                } else if (Intrinsics.b(strZ, Title.type)) {
                    strA = C0460h.a(mVar);
                } else {
                    mVar.f1();
                }
            }
            mVar.j();
            return new Error.UnknownError(strA, strA2);
        }

        public void toJson(@NotNull t tVar, Error.UnknownError unknownError) {
            tVar.f();
            tVar.Z("originalCode");
            tVar.b1(unknownError != null ? unknownError.getOriginalCode() : null);
            tVar.Z(Title.type);
            tVar.b1(unknownError != null ? unknownError.getTitle() : null);
            tVar.y();
        }
    }

    public ErrorResponse(List<? extends Error> list) {
        this.errors = list;
    }

    public static ErrorResponse copy$default(ErrorResponse errorResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = errorResponse.errors;
        }
        return errorResponse.copy(list);
    }

    public final List<Error> component1() {
        return this.errors;
    }

    @NotNull
    public final ErrorResponse copy(List<? extends Error> list) {
        return new ErrorResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponse) && Intrinsics.b(this.errors, ((ErrorResponse) obj).errors);
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        List<Error> list = this.errors;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final <T extends Error> boolean isAnyError() {
        List<Error> errors = getErrors();
        if (errors != null && !errors.isEmpty()) {
            for (Error error : errors) {
                Intrinsics.j(3, "T");
                if (error != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "ErrorResponse(errors=" + this.errors + ")";
    }
}
