package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class a extends PathClassLoader {
    a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override
    protected final Class loadClass(String str, boolean z7) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z7);
    }
}
