package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.a0;

public class SignUpCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<SignUpCaptchaConfig> CREATOR = new a();

    class a implements Parcelable.Creator<SignUpCaptchaConfig> {
        a() {
        }

        @Override
        public SignUpCaptchaConfig createFromParcel(Parcel parcel) {
            return new SignUpCaptchaConfig();
        }

        @Override
        public SignUpCaptchaConfig[] newArray(int i7) {
            return new SignUpCaptchaConfig[i7];
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String getUrl() {
        return a0.s();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
    }
}
