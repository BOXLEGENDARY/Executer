package com.roblox.client.flags;

public class FlagJniInterface {
    static native boolean nativeGetFFlag(String str, boolean z7);

    static native int nativeGetFInt(String str, int i7);

    static native String nativeGetFString(String str, String str2);

    static native void nativeRegisterFFlag(String str, int i7);

    static native void nativeRegisterFInt(String str, int i7);

    static native void nativeRegisterFString(String str, int i7);

    public static native int nativeRegisterJavaFlagProvider();
}
