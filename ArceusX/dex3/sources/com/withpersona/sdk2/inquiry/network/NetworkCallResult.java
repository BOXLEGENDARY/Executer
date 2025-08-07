package com.withpersona.sdk2.inquiry.network;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public abstract class NetworkCallResult<T> {

    public static final class Failure<T> extends NetworkCallResult<T> {

        @NotNull
        private final InternalErrorInfo.NetworkErrorInfo networkErrorInfo;

        public Failure(@NotNull InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            super(null);
            this.networkErrorInfo = networkErrorInfo;
        }

        @NotNull
        public final InternalErrorInfo.NetworkErrorInfo getNetworkErrorInfo() {
            return this.networkErrorInfo;
        }
    }

    public static final class Success<T> extends NetworkCallResult<T> {
        private final T response;

        public Success(T t) {
            super(null);
            this.response = t;
        }

        public final T getResponse() {
            return this.response;
        }
    }

    public NetworkCallResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkCallResult() {
    }
}
