package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.a0;

public class LoginCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<LoginCaptchaConfig> CREATOR = new a();

    private String f19906d;

    private String f19907e;

    class a implements Parcelable.Creator<LoginCaptchaConfig> {
        a() {
        }

        @Override
        public LoginCaptchaConfig createFromParcel(Parcel parcel) {
            return new LoginCaptchaConfig(parcel);
        }

        @Override
        public LoginCaptchaConfig[] newArray(int i7) {
            return new LoginCaptchaConfig[i7];
        }
    }

    static class b {

        static final int[] f19908a;

        static {
            int[] iArr = new int[c.values().length];
            f19908a = iArr;
            try {
                iArr[c.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19908a[c.PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19908a[c.USERNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        USERNAME,
        EMAIL,
        PHONE_NUMBER
    }

    public static String a(c cVar) {
        int i7 = b.f19908a[cVar.ordinal()];
        return i7 != 1 ? i7 != 2 ? "username" : "phonenumber" : "email";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String getUrl() {
        return a0.r(this.f19906d, this.f19907e);
    }

    public String toString() {
        return "CredentialType: " + this.f19906d + ". CredentialValue: " + this.f19907e;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19906d);
        parcel.writeString(this.f19907e);
    }

    public LoginCaptchaConfig(c cVar, String str) {
        this.f19906d = a(cVar);
        this.f19907e = str;
    }

    private LoginCaptchaConfig(Parcel parcel) {
        this.f19906d = parcel.readString();
        this.f19907e = parcel.readString();
    }
}
