package backtraceio.library.common;

import backtraceio.library.common.serialization.BacktraceGsonBuilder;
import com.google.gson.f;

public class BacktraceSerializeHelper {
    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) fromJson(new BacktraceGsonBuilder().buildGson(), str, cls);
    }

    public static String toJson(Object obj) {
        return toJson(new BacktraceGsonBuilder().buildGson(), obj);
    }

    public static <T> T fromJson(f fVar, String str, Class<T> cls) {
        return (T) fVar.l(str, cls);
    }

    public static String toJson(f fVar, Object obj) {
        return fVar.t(obj);
    }
}
