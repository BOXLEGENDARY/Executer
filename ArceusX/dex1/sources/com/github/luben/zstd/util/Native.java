package com.github.luben.zstd.util;

import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;

public enum Native {
    ;

    private static final String nativePathOverride = "ZstdNativePath";
    private static final String tempFolderOverride = "ZstdTempFolder";
    private static final String libnameShort = "zstd-jni-1.5.6-4";
    private static final String libname = "libzstd-jni-1.5.6-4";
    private static final String errorMsg = "Unsupported OS/arch, cannot find " + resourceName() + " or load " + libnameShort + " from system libraries. Please try building from source the jar or providing " + libname + " in your system.";
    private static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        loaded.set(true);
    }

    public static synchronized boolean isLoaded() {
        return loaded.get();
    }

    private static String libExtension() {
        return (osName().contains("os_x") || osName().contains("darwin")) ? "dylib" : osName().contains("win") ? "dll" : "so";
    }

    public static synchronized void load() {
        try {
            String property = System.getProperty(tempFolderOverride);
            if (property == null) {
                load(null);
            } else {
                load(new File(property));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() {
            @Override
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    private static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() {
            @Override
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    private static String osArch() {
        return System.getProperty("os.arch");
    }

    private static String osName() {
        String strReplace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        return strReplace.startsWith("win") ? "win" : strReplace.startsWith("mac") ? "darwin" : strReplace;
    }

    private static String resourceName() {
        return "/" + osName() + "/" + osArch() + "/" + libname + "." + libExtension();
    }

    public static synchronized void load(java.io.File r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.github.luben.zstd.util.Native.load(java.io.File):void");
    }
}
