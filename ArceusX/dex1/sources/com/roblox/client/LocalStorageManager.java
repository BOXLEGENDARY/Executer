package com.roblox.client;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.os.StatFs;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/roblox/client/LocalStorageManager;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)V", "Landroid/content/res/AssetManager;", "assetManager", BuildConfig.FLAVOR, "filesDirPath", "initStorageManagerNativeV2", "(Landroid/content/res/AssetManager;Ljava/lang/String;)V", BuildConfig.FLAVOR, "getAllocatableBytes", "()J", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalStorageManager {

    public static final LocalStorageManager f19580a = new LocalStorageManager();

    private LocalStorageManager() {
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LocalStorageManager localStorageManager = f19580a;
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        String absolutePath = context.getFilesDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        localStorageManager.initStorageManagerNativeV2(assets, absolutePath);
    }

    private final native void initStorageManagerNativeV2(AssetManager assetManager, String filesDirPath);

    public final long getAllocatableBytes() {
        return new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes();
    }
}
