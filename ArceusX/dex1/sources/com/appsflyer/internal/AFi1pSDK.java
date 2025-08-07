package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1pSDK implements AFi1sSDK {
    private PluginInfo getRevenue = new PluginInfo(Plugin.NATIVE, "6.16.2", null, 4, null);

    @Override
    public final void getMediationNetwork(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, BuildConfig.FLAVOR);
        this.getRevenue = pluginInfo;
    }

    @Override
    public final Map<String, Object> getRevenue() {
        Map<String, Object> mapL = kotlin.collections.F.l(new Pair[]{P9.t.a("platform", this.getRevenue.getPlugin().getPluginName()), P9.t.a("version", this.getRevenue.getVersion())});
        if (!this.getRevenue.getAdditionalParams().isEmpty()) {
            mapL.put("extras", this.getRevenue.getAdditionalParams());
        }
        return mapL;
    }
}
