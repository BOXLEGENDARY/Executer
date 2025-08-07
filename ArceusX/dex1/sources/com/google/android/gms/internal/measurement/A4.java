package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class A4 {
    static String a(InterfaceC2021y4 interfaceC2021y4, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(interfaceC2021y4, sb, 0);
        return sb.toString();
    }

    static final void b(StringBuilder sb, int i7, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(V4.a(AbstractC1980t3.r((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1980t3) {
            sb.append(": \"");
            sb.append(V4.a((AbstractC1980t3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof T3) {
            sb.append(" {");
            d((T3) obj, sb, i7 + 2);
            sb.append("\n");
            while (i8 < i7) {
                sb.append(' ');
                i8++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i10 = i7 + 2;
        b(sb, i10, "key", entry.getKey());
        b(sb, i10, "value", entry.getValue());
        sb.append("\n");
        while (i8 < i7) {
            sb.append(' ');
            i8++;
        }
        sb.append("}");
    }

    private static final String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    private static void d(InterfaceC2021y4 interfaceC2021y4, StringBuilder sb, int i7) throws SecurityException {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC2021y4.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i7, c(strConcat), T3.m(method2, interfaceC2021y4, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i7, c(strConcat2), T3.m(method3, interfaceC2021y4, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objM = T3.m(method4, interfaceC2021y4, new Object[0]);
                    if (method5 == null) {
                        if (objM instanceof Boolean) {
                            if (((Boolean) objM).booleanValue()) {
                                b(sb, i7, c(strConcat3), objM);
                            }
                        } else if (objM instanceof Integer) {
                            if (((Integer) objM).intValue() != 0) {
                                b(sb, i7, c(strConcat3), objM);
                            }
                        } else if (objM instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM).floatValue()) != 0) {
                                b(sb, i7, c(strConcat3), objM);
                            }
                        } else if (!(objM instanceof Double)) {
                            if (objM instanceof String) {
                                zEquals = objM.equals(BuildConfig.FLAVOR);
                            } else if (objM instanceof AbstractC1980t3) {
                                zEquals = objM.equals(AbstractC1980t3.f15325e);
                            } else if (objM instanceof InterfaceC2021y4) {
                                if (objM != ((InterfaceC2021y4) objM).e()) {
                                    b(sb, i7, c(strConcat3), objM);
                                }
                            } else if (!(objM instanceof Enum) || ((Enum) objM).ordinal() != 0) {
                                b(sb, i7, c(strConcat3), objM);
                            }
                            if (!zEquals) {
                                b(sb, i7, c(strConcat3), objM);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM).doubleValue()) != 0) {
                            b(sb, i7, c(strConcat3), objM);
                        }
                    } else if (((Boolean) T3.m(method5, interfaceC2021y4, new Object[0])).booleanValue()) {
                        b(sb, i7, c(strConcat3), objM);
                    }
                }
            }
        }
        if (interfaceC2021y4 instanceof R3) {
            throw null;
        }
        Z4 z42 = ((T3) interfaceC2021y4).zzc;
        if (z42 != null) {
            z42.g(sb, i7);
        }
    }
}
