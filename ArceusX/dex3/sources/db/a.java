package db;

import bb.f;
import bb.u;
import com.squareup.moshi.h;
import com.squareup.moshi.l;
import com.squareup.moshi.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class a extends f.a {
    private final w a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    private a(w wVar, boolean z, boolean z2, boolean z3) {
        this.a = wVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static a f(w wVar) {
        if (wVar != null) {
            return new a(wVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    private static Set<? extends Annotation> g(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public f<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
        h hVarE = this.a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.d) {
            hVarE = hVarE.serializeNulls();
        }
        return new b(hVarE);
    }

    public f<ResponseBody, ?> d(Type type, Annotation[] annotationArr, u uVar) {
        h hVarE = this.a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.d) {
            hVarE = hVarE.serializeNulls();
        }
        return new c(hVarE);
    }
}
