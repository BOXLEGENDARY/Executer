package com.appsflyer.internal.platform_extension;

import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/platform_extension/PluginInfo;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/platform_extension/Plugin;", "plugin", BuildConfig.FLAVOR, "version", BuildConfig.FLAVOR, "additionalParams", "<init>", "(Lcom/appsflyer/internal/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/appsflyer/internal/platform_extension/Plugin;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/appsflyer/internal/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;)Lcom/appsflyer/internal/platform_extension/PluginInfo;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "Ljava/util/Map;", "getAdditionalParams", "Lcom/appsflyer/internal/platform_extension/Plugin;", "getPlugin", "Ljava/lang/String;", "getVersion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PluginInfo {
    private final Map<String, String> additionalParams;
    private final Plugin plugin;
    private final String version;

    public PluginInfo(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        this.plugin = plugin;
        this.version = str;
        this.additionalParams = map;
    }

    public static PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            plugin = pluginInfo.plugin;
        }
        if ((i7 & 2) != 0) {
            str = pluginInfo.version;
        }
        if ((i7 & 4) != 0) {
            map = pluginInfo.additionalParams;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    public final Plugin getPlugin() {
        return this.plugin;
    }

    public final String getVersion() {
        return this.version;
    }

    public final Map<String, String> component3() {
        return this.additionalParams;
    }

    public final PluginInfo copy(Plugin plugin, String version, Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(plugin, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(version, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(additionalParams, BuildConfig.FLAVOR);
        return new PluginInfo(plugin, version, additionalParams);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) other;
        return this.plugin == pluginInfo.plugin && Intrinsics.b(this.version, pluginInfo.version) && Intrinsics.b(this.additionalParams, pluginInfo.additionalParams);
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final Plugin getPlugin() {
        return this.plugin;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return (((this.plugin.hashCode() * 31) + this.version.hashCode()) * 31) + this.additionalParams.hashCode();
    }

    public final String toString() {
        return "PluginInfo(plugin=" + this.plugin + ", version=" + this.version + ", additionalParams=" + this.additionalParams + ")";
    }

    public PluginInfo(Plugin plugin, String str, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i7 & 4) != 0 ? F.h() : map);
    }

    public PluginInfo(Plugin plugin, String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
    }
}
