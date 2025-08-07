package com.withpersona.sdk2.inquiry.internal.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "debugDescription", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Ljava/lang/Object;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "b", "()Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ErrorRequest {

    @NotNull
    private final a errorType;

    private final Object debugDescription;

    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "", "<init>", "(Ljava/lang/String;I)V", "Camera", "Network", "Permissions", "Nfc", "Other", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        private static final T9.a $ENTRIES;
        private static final a[] $VALUES;

        @g(name = "camera")
        public static final a Camera = new a("Camera", 0);

        @g(name = "network")
        public static final a Network = new a("Network", 1);

        @g(name = "permissions")
        public static final a Permissions = new a("Permissions", 2);

        @g(name = "nfc")
        public static final a Nfc = new a("Nfc", 3);

        @g(name = "other")
        public static final a Other = new a("Other", 4);

        static {
            a[] aVarArrC = c();
            $VALUES = aVarArrC;
            $ENTRIES = T9.b.a(aVarArrC);
        }

        private a(String str, int i) {
        }

        private static final a[] c() {
            return new a[]{Camera, Network, Permissions, Nfc, Other};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public ErrorRequest(@NotNull a aVar, Object obj) {
        Intrinsics.checkNotNullParameter(aVar, "errorType");
        this.errorType = aVar;
        this.debugDescription = obj;
    }

    public final Object getDebugDescription() {
        return this.debugDescription;
    }

    @NotNull
    public final a getErrorType() {
        return this.errorType;
    }
}
