package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1gSDK;
import java.io.IOException;

public class HttpException extends IOException {
    private final AFd1gSDK getMediationNetwork;

    public HttpException(Throwable th, AFd1gSDK aFd1gSDK) {
        super(th.getMessage(), th);
        this.getMediationNetwork = aFd1gSDK;
    }

    public AFd1gSDK getMetrics() {
        return this.getMediationNetwork;
    }
}
