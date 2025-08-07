package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;

public interface AFi1sSDK {
    void getMediationNetwork(PluginInfo pluginInfo);

    Map<String, Object> getRevenue();
}
