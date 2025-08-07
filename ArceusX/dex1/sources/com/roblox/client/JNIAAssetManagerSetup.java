package com.roblox.client;

import android.content.Context;
import android.content.res.AssetManager;

public class JNIAAssetManagerSetup {

    private static final String f19552a = "JNIAAssetManagerSetup";

    public static void a(Context context) {
        h7.l.a(f19552a, "Initialize Android AssetReader");
        initNative(context.getAssets());
    }

    private static native void initNative(AssetManager assetManager);
}
