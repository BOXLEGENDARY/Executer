package com.google.gson.internal;

import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public class ReflectionAccessFilterHelper {

    private static abstract class AccessChecker {
        public static final AccessChecker INSTANCE;

        static {
            AccessChecker accessChecker;
            if (JavaVersion.isJava9OrLater()) {
                try {
                    final Method declaredMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
                    accessChecker = new AccessChecker() {
                        {
                            super();
                        }

                        @Override
                        public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                            try {
                                return ((Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                            } catch (Exception e7) {
                                throw new RuntimeException("Failed invoking canAccess", e7);
                            }
                        }
                    };
                } catch (NoSuchMethodException unused) {
                }
            } else {
                accessChecker = null;
            }
            if (accessChecker == null) {
                accessChecker = new AccessChecker() {
                    @Override
                    public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                        return true;
                    }
                };
            }
            INSTANCE = accessChecker;
        }

        private AccessChecker() {
        }

        public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);
    }

    private ReflectionAccessFilterHelper() {
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return AccessChecker.INSTANCE.canAccess(accessibleObject, obj);
    }

    public static v.a getFilterResult(List<v> list, Class<?> cls) {
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            v.a aVarA = it.next().a(cls);
            if (aVarA != v.a.INDECISIVE) {
                return aVarA;
            }
        }
        return v.a.ALLOW;
    }

    public static boolean isAndroidType(Class<?> cls) {
        return isAndroidType(cls.getName());
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        return isAndroidType(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean isJavaType(Class<?> cls) {
        return isJavaType(cls.getName());
    }

    private static boolean isAndroidType(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || isJavaType(str);
    }

    private static boolean isJavaType(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }
}
