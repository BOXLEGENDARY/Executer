package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.C2372u;
import com.roblox.client.a0;
import com.roblox.client.game.b;
import com.roblox.client.q0;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import h7.h;
import h7.l;
import java.util.Locale;
import z6.C3086b;

public class d {

    private Context f20074a;

    public d(Context context) {
        this.f20074a = context;
    }

    public static b.d a(Context context) {
        return b(context, null);
    }

    public static b.d b(Context context, Activity activity) {
        d dVar = new d(context);
        com.roblox.engine.jni.model.a aVar = new com.roblox.engine.jni.model.a(dVar.e());
        aVar.isLuaHomePageEnabled = true;
        aVar.isLuaGamesPageEnabled = true;
        aVar.isLuaChatEnabled = true;
        aVar.isTablet = a0.m0();
        DeviceParams deviceParamsD = dVar.d();
        b.d dVar2 = new b.d();
        dVar2.f20056b = aVar;
        dVar2.f20057c = deviceParamsD;
        dVar2.f20058d = "rbxasset://places/Mobile.rbxl";
        dVar2.f20059e = "LuaAppStarterScript";
        dVar2.f20060f = g7.c.c().j();
        dVar2.f20061g = g7.c.c().m();
        dVar2.f20062h = g7.c.c().k();
        dVar2.f20063i = g7.c.c().d();
        dVar2.f20064j = g7.c.c().i();
        dVar2.f20055a = activity;
        return dVar2;
    }

    public static DeviceParams c(Context context) {
        return new d(context).d();
    }

    public DeviceParams d() {
        DeviceParams deviceParams = new DeviceParams();
        int i7 = Build.VERSION.SDK_INT;
        deviceParams.osVersion = Integer.toString(i7);
        deviceParams.deviceName = C2372u.b();
        deviceParams.appVersion = a0.X0();
        Locale localeE = C3086b.f().e();
        deviceParams.country = localeE != null ? localeE.getCountry() : BuildConfig.FLAVOR;
        deviceParams.manufacturer = Build.MANUFACTURER;
        deviceParams.deviceTotalMemoryMB = B7.a.b();
        Point pointI = q0.i(this.f20074a);
        deviceParams.displayResolution = pointI.x + "x" + pointI.y;
        Point pointF = B7.a.f(this.f20074a);
        deviceParams.displayPhysicalWidthPixels = pointF.x;
        deviceParams.displayPhysicalHeightPixels = pointF.y;
        deviceParams.networkType = q0.h(this.f20074a);
        q0.c(this.f20074a, deviceParams);
        if (j6.d.a().T1()) {
            q0.d(this.f20074a, deviceParams);
        }
        deviceParams.isChrome = a0.g0();
        deviceParams.appBuildVariant = h.a();
        deviceParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        if (i7 >= 31) {
            deviceParams.deviceSku = Build.SKU;
            deviceParams.socModel = Build.SOC_MODEL;
        }
        if (j6.d.a().D3()) {
            deviceParams.testDeviceName = C2372u.c(this.f20074a);
        }
        return deviceParams;
    }

    public PlatformParams e() {
        String strH = k7.h.h();
        if (TextUtils.isEmpty(strH)) {
            strH = k7.h.j().s(this.f20074a);
        }
        l.a("DataModelParamsCreator", "getPlatformParams: assetFolderPath = " + strH);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strH;
        platformParams.isTouchDevice = this.f20074a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = this.f20074a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = this.f20074a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = B7.a.c(this.f20074a);
        if (j6.d.a().X()) {
            Point pointG = B7.a.g(this.f20074a);
            platformParams.viewportWidthMm = pointG.x;
            platformParams.viewportHeightMm = pointG.y;
        }
        return platformParams;
    }
}
