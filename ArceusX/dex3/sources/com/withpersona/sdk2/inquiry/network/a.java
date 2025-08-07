package com.withpersona.sdk2.inquiry.network;

import P9.t;
import android.util.Base64;
import ha.C0462j;
import ha.EnumC0461i;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.L;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.e;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    @NotNull
    public static final a a = new a();

    public static final class C0141a {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        @NotNull
        public final String c;

        @NotNull
        public final String d;

        public C0141a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @NotNull
        public final String a() {
            return this.c;
        }

        @NotNull
        public final String b() {
            return this.a;
        }

        @NotNull
        public final String c() {
            return this.d;
        }

        @NotNull
        public final String d() {
            return this.b;
        }
    }

    public static final class b<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            Pair pair = (Pair) t;
            Pair pair2 = (Pair) t2;
            return R9.a.a(CollectionsKt.U(CollectionsKt.m(new String[]{pair.c(), pair.d()}), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null), CollectionsKt.U(CollectionsKt.m(new String[]{pair2.c(), pair2.d()}), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
    }

    public static Request a(a aVar, Request request, C0462j c0462j, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return aVar.a(request, c0462j, j);
    }

    public final String b(RequestBody requestBody) {
        e eVar = new e();
        requestBody.writeTo(eVar);
        return StringsKt.Q0(eVar.W0()).toString();
    }

    @NotNull
    public final JSONArray c(@NotNull RequestBody requestBody) {
        List<Pair<String, Object>> listC = a.c(a(requestBody));
        ArrayList arrayList = new ArrayList(CollectionsKt.t(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            String string = pair.b().toString();
            arrayList.add(new Regex("^[+-]?\\d+(\\.\\d+)?$").d(string) ? t.a(str, StringsKt.b1(string, 10)) : t.a(str, new Regex("\\s").replace(string, "")));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) ((Pair) obj).b()).length() > 0) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(F.e(CollectionsKt.t(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put((String) ((Pair) obj2).c(), obj2);
        }
        List<Pair> listL0 = CollectionsKt.l0(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (Pair pair2 : listL0) {
            String str2 = (String) pair2.a();
            String str3 = (String) pair2.b();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    @NotNull
    public final Request a(@NotNull Request request, @NotNull C0462j c0462j, long j) {
        C0141a c0141aA = a(j, request, c0462j);
        return c0141aA != null ? request.newBuilder().addHeader("NHMJLNRS", c0141aA.d()).addHeader("STPBWSBB", c0141aA.b()).addHeader("DNLGNZLZ", c0141aA.a()).addHeader("TLJLGGDG", c0141aA.c()).build() : request;
    }

    public final boolean b(List<String> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.F((String) it.next(), "filename=", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final C0141a a(long j, Request request, C0462j c0462j) {
        String str = request.headers().get("Authorization");
        RequestBody requestBodyBody = request.body();
        if (str == null || requestBodyBody == null) {
            return null;
        }
        try {
            String str2 = request.headers().get("User-Agent");
            if (str2 != null && !StringsKt.Y(str2)) {
                Map mapL = F.l(new Pair[]{t.a("User-Agent", str2), t.a("VTDGJLGG", request.headers().get("VTDGJLGG")), t.a("Persona-Device-Vendor-Id", request.headers().get("Persona-Device-Vendor-Id"))});
                mapL.put("TLJLGGDG", CollectionsKt.U(L.i(mapL.keySet(), "TLJLGGDG"), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                Set setKeySet = mapL.keySet();
                Collection collectionValues = mapL.values();
                String str3 = (String) CollectionsKt.X(StringsKt.split$default(str, new String[]{" "}, false, 0, 6, (Object) null));
                if (str3 == null) {
                    c0462j.f(NetworkUtilsKt.SUBSYSTEM, EnumC0461i.i, "Auth token is null.");
                    return null;
                }
                String strOptString = new JSONObject(new String(Base64.decode((String) StringsKt.split$default(str3, new String[]{"."}, false, 0, 6, (Object) null).get(1), 0), Charsets.UTF_8)).optString("sub");
                if (strOptString != null && !StringsKt.Y(strOptString)) {
                    String strValueOf = String.valueOf(j / 1000);
                    return new C0141a(a(CollectionsKt.U(CollectionsKt.m(new String[]{strOptString, strValueOf, StringsKt.z(c(requestBodyBody).toString(), "\\/", "/", false, 4, (Object) null)}), ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)), strValueOf, a(CollectionsKt.U(CollectionsKt.m(new String[]{CollectionsKt.U(collectionValues, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), strValueOf, StringsKt.z(c(requestBodyBody).toString(), "\\/", "/", false, 4, (Object) null)}), ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)), CollectionsKt.U(setKeySet, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                }
                c0462j.f(NetworkUtilsKt.SUBSYSTEM, EnumC0461i.i, "Session token is null.");
                return null;
            }
            c0462j.f(NetworkUtilsKt.SUBSYSTEM, EnumC0461i.i, "User agent is null.");
            return null;
        } catch (Exception e) {
            c0462j.f(NetworkUtilsKt.SUBSYSTEM, EnumC0461i.i, "An unexpected error occurred: " + e.getMessage() + ".");
            return null;
        }
    }

    @NotNull
    public final List<Pair<String, Object>> c(@NotNull List<? extends Pair<String, ? extends Object>> list) {
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Pair<String, ? extends Object> pair : list) {
                String str = (String) pair.a();
                Object objB = pair.b();
                List listSplit$default = StringsKt.split$default(str, new String[]{"[]"}, false, 2, 2, (Object) null);
                if (listSplit$default.size() == 1) {
                    arrayList.add(t.a(str, objB));
                } else {
                    String str2 = (String) listSplit$default.get(0);
                    String str3 = (String) listSplit$default.get(1);
                    if (linkedHashMap.get(str2) == null) {
                        linkedHashMap.put(str2, 0);
                    }
                    if (!linkedHashSet.add(str) && !StringsKt.K(str3, "[]", false, 2, (Object) null)) {
                        Object obj = linkedHashMap.get(str2);
                        if (obj != null) {
                            linkedHashMap.put(str2, Integer.valueOf(((Number) obj).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(str);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList.add(t.a(str2 + "[" + linkedHashMap.get(str2) + "]" + str3, objB));
                    z = true;
                }
            }
            if (!z) {
                return arrayList;
            }
            list = arrayList;
        }
    }

    public final String a(String str) {
        return d.i(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)), (kotlin.text.e) null, 1, (Object) null);
    }

    public final List<Pair<String, Object>> a(RequestBody requestBody) {
        List<String> listJ;
        List listD;
        String str;
        List listSplit$default;
        String jSONArray;
        MediaType mediaTypeContentType = requestBody.contentType();
        if (mediaTypeContentType == null) {
            return CollectionsKt.d(t.a("", b(requestBody)));
        }
        if (Intrinsics.b(mediaTypeContentType.subtype(), "json")) {
            String strB = b(requestBody);
            if (!Intrinsics.b(strB, "{}") && !Intrinsics.b(strB, "[]")) {
                if (StringsKt.F(strB, "{", false, 2, (Object) null)) {
                    jSONArray = new JSONObject(strB);
                } else if (StringsKt.F(strB, "[", false, 2, (Object) null)) {
                    jSONArray = new JSONArray(strB);
                }
                strB = jSONArray;
            }
            if (strB instanceof String) {
                return CollectionsKt.d(t.a("", strB));
            }
            return a((Object) strB);
        }
        if (Intrinsics.b(mediaTypeContentType.type(), "multipart")) {
            List<MultipartBody.Part> listParts = ((MultipartBody) requestBody).parts();
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : listParts) {
                Headers headers = part.headers();
                if (headers != null && (str = headers.get("Content-Disposition")) != null && (listSplit$default = StringsKt.split$default(str, new String[]{";"}, false, 0, 6, (Object) null)) != null) {
                    listJ = new ArrayList<>(CollectionsKt.t(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        listJ.add(StringsKt.Q0((String) it.next()).toString());
                    }
                } else {
                    listJ = CollectionsKt.j();
                }
                a aVar = a;
                String strA = aVar.a(listJ);
                if (strA != null) {
                    if (aVar.b(listJ)) {
                        listD = CollectionsKt.d(t.a(strA, Long.valueOf(part.body().contentLength())));
                    } else {
                        List<Pair<String, Object>> listA = aVar.a(part.body());
                        if (listA.isEmpty()) {
                            listD = CollectionsKt.j();
                        } else if (listA.size() == 1) {
                            listD = CollectionsKt.d(t.a(strA, listA.get(0).d()));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + listA + ". Part name: " + strA);
                        }
                    }
                    CollectionsKt.y(arrayList, listD);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return CollectionsKt.r0(arrayList);
        }
        if (Intrinsics.b(mediaTypeContentType.type(), "image")) {
            return CollectionsKt.d(t.a("", Long.valueOf(requestBody.contentLength())));
        }
        throw new RuntimeException("Unsupported type: " + mediaTypeContentType);
    }

    public final List<Pair<String, Object>> a(Object obj) {
        ArrayList arrayList = new ArrayList();
        a(this, obj, (String) null, arrayList, 2, (Object) null);
        return arrayList;
    }

    public static void a(a aVar, Object obj, String str, List list, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        aVar.a(obj, str, (List<Pair<String, Object>>) list);
    }

    public final void a(Object obj, String str, List<Pair<String, Object>> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = a;
                Object objOpt = jSONObject.opt(next);
                if (str != null) {
                    next = str + "[" + next + "]";
                }
                aVar.a(objOpt, next, list);
            }
            return;
        }
        if (!(obj instanceof JSONArray)) {
            if (str == null) {
                str = "";
            }
            list.add(t.a(str, obj));
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            a(jSONArray.opt(i), str == null ? "[" + i + "]" : str + "[" + i + "]", list);
        }
    }

    public final String a(List<String> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.F((String) next, "name=", false, 2, (Object) null)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }
}
