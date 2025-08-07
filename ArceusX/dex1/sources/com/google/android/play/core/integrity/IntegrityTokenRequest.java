package com.google.android.play.core.integrity;

public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j7);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new C2331n();
    }

    public abstract Long a();

    public abstract String b();
}
