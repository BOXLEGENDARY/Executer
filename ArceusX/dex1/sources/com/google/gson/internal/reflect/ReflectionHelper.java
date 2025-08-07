package com.google.gson.internal.reflect;

import com.github.luben.zstd.BuildConfig;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionHelper {
    private static final RecordHelper RECORD_HELPER;

    private static abstract class RecordHelper {
        private RecordHelper() {
        }

        public abstract Method getAccessor(Class<?> cls, Field field);

        abstract <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls);

        abstract String[] getRecordComponentNames(Class<?> cls);

        abstract boolean isRecord(Class<?> cls);
    }

    private static class RecordNotSupportedHelper extends RecordHelper {
        private RecordNotSupportedHelper() {
            super();
        }

        @Override
        public Method getAccessor(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override
        <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override
        String[] getRecordComponentNames(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override
        boolean isRecord(Class<?> cls) {
            return false;
        }
    }

    private static class RecordSupportedHelper extends RecordHelper {
        private final Method getName;
        private final Method getRecordComponents;
        private final Method getType;
        private final Method isRecord;

        @Override
        public Method getAccessor(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e7) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e7);
            }
        }

        @Override
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i7 = 0; i7 < objArr.length; i7++) {
                    clsArr[i7] = (Class) this.getType.invoke(objArr[i7], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e7) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e7);
            }
        }

        @Override
        String[] getRecordComponentNames(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i7 = 0; i7 < objArr.length; i7++) {
                    strArr[i7] = (String) this.getName.invoke(objArr[i7], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e7) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e7);
            }
        }

        @Override
        boolean isRecord(Class<?> cls) {
            try {
                return ((Boolean) this.isRecord.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e7) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e7);
            }
        }

        private RecordSupportedHelper() throws NoSuchMethodException, ClassNotFoundException {
            super();
            this.isRecord = Class.class.getMethod("isRecord", null);
            this.getRecordComponents = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.getName = cls.getMethod("getName", null);
            this.getType = cls.getMethod("getType", null);
        }
    }

    static {
        RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (ReflectiveOperationException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        RECORD_HELPER = recordNotSupportedHelper;
    }

    private ReflectionHelper() {
    }

    private static void appendExecutableParameters(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i7 = 0; i7 < parameterTypes.length; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i7].getSimpleName());
        }
        sb.append(')');
    }

    public static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        appendExecutableParameters(constructor, sb);
        return sb.toString();
    }

    public static RuntimeException createExceptionForRecordReflectionException(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String fieldToString(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z7) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + fieldToString((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            appendExecutableParameters(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + constructorToString((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z7 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method getAccessor(Class<?> cls, Field field) {
        return RECORD_HELPER.getAccessor(cls, field);
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
        return RECORD_HELPER.getCanonicalRecordConstructor(cls);
    }

    private static String getInaccessibleTroubleshootingSuffix(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return BuildConfig.FLAVOR;
        }
        String message = exc.getMessage();
        return "\nSee " + TroubleshootingGuide.createUrl((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static String[] getRecordComponentNames(Class<?> cls) {
        return RECORD_HELPER.getRecordComponentNames(cls);
    }

    public static boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        return !isStatic(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public static boolean isRecord(Class<?> cls) {
        return RECORD_HELPER.isRecord(cls);
    }

    public static boolean isStatic(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void makeAccessible(AccessibleObject accessibleObject) throws m, SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e7) {
            throw new m("Failed making " + getAccessibleObjectDescription(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + getInaccessibleTroubleshootingSuffix(e7), e7);
        }
    }

    public static String tryMakeAccessible(Constructor<?> constructor) throws SecurityException {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e7) {
            return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e7.getMessage() + getInaccessibleTroubleshootingSuffix(e7);
        }
    }
}
