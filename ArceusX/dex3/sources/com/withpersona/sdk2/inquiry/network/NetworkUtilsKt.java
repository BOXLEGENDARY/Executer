package com.withpersona.sdk2.inquiry.network;

import bb.t;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

public final class NetworkUtilsKt {
    private static final int NUM_RETRIES = 3;

    @NotNull
    public static final String SUBSYSTEM = "com.withpersona.sdk2.inquiry.network";

    public static final class AnonymousClass2 extends l implements Function1<InternalErrorInfo.NetworkErrorInfo, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(@NotNull InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            return Boolean.valueOf(networkErrorInfo.isRecoverable());
        }
    }

    public static final class C05242 extends l implements Function1<InternalErrorInfo.NetworkErrorInfo, Boolean> {
        public static final C05242 INSTANCE = new C05242();

        public C05242() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(@NotNull InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            int code = networkErrorInfo.getCode();
            return Boolean.valueOf((code == 0 || code == 409 || code == 413 || code == 422) ? false : true);
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.network.NetworkUtilsKt", f = "NetworkUtils.kt", l = {179}, m = "enqueueWithRetryWhen")
    public static final class AnonymousClass1<T> extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkUtilsKt.enqueueWithRetryWhen(null, null, this);
        }
    }

    public static final <T> Object enqueueRetriableRequestWithRetry(@NotNull Function1<? super Continuation<? super t<T>>, ? extends Object> function1, @NotNull Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(function1, AnonymousClass2.INSTANCE, continuation);
    }

    public static final <T> Object enqueueVerificationRequestWithRetry(@NotNull Function1<? super Continuation<? super t<T>>, ? extends Object> function1, @NotNull Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(function1, C05242.INSTANCE, continuation);
    }

    public static final <T> java.lang.Object enqueueWithRetryWhen(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super bb.t<T>>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.network.InternalErrorInfo.NetworkErrorInfo, java.lang.Boolean> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.withpersona.sdk2.inquiry.network.NetworkCallResult<T>> r8) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.NetworkUtilsKt.enqueueWithRetryWhen(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <T> NetworkCallResult<T> onFailure(@NotNull NetworkCallResult<T> networkCallResult, @NotNull Function1<? super InternalErrorInfo.NetworkErrorInfo, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            function1.invoke(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
        }
        return networkCallResult;
    }

    @NotNull
    public static final <T> NetworkCallResult<T> onSuccess(@NotNull NetworkCallResult<T> networkCallResult, @NotNull Function1<? super T, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Success) {
            function1.invoke(((NetworkCallResult.Success) networkCallResult).getResponse());
        }
        return networkCallResult;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.withpersona.sdk2.inquiry.network.InternalErrorInfo.NetworkErrorInfo toErrorInfo(@org.jetbrains.annotations.NotNull bb.t<?> r8) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.NetworkUtilsKt.toErrorInfo(bb.t):com.withpersona.sdk2.inquiry.network.InternalErrorInfo$NetworkErrorInfo");
    }

    @NotNull
    public static final InternalErrorInfo.NetworkErrorInfo toSocketTimeoutErrorInfo(@NotNull SocketTimeoutException socketTimeoutException) {
        return new InternalErrorInfo.NetworkErrorInfo(0, socketTimeoutException.getLocalizedMessage(), true, null, 8, null);
    }
}
