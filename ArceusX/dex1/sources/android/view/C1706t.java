package android.view;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/t;", BuildConfig.FLAVOR, "<init>", "()V", "object", "Landroidx/lifecycle/l;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/l;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/f;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/f;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", BuildConfig.FLAVOR, "d", "(Ljava/lang/Class;)I", "g", BuildConfig.FLAVOR, "e", "(Ljava/lang/Class;)Z", BuildConfig.FLAVOR, "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "Ljava/util/Map;", "callbackCache", BuildConfig.FLAVOR, "classToAdapters", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1706t {

    public static final C1706t f11417a = new C1706t();

    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    private static final Map<Class<?>, List<Constructor<? extends InterfaceC1692f>>> classToAdapters = new HashMap();

    private C1706t() {
    }

    private final InterfaceC1692f a(Constructor<? extends InterfaceC1692f> constructor, Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            InterfaceC1692f interfaceC1692fNewInstance = constructor.newInstance(object);
            Intrinsics.checkNotNullExpressionValue(interfaceC1692fNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return interfaceC1692fNewInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    private final Constructor<? extends InterfaceC1692f> b(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r02 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r02 != null ? r02.getName() : BuildConfig.FLAVOR;
            Intrinsics.checkNotNullExpressionValue(name, "fullPackage");
            if (name.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls = Class.forName(strC);
            Intrinsics.e(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static final String c(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.z(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(klass);
        map.put(klass, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> klass) {
        return klass != null && InterfaceC1700n.class.isAssignableFrom(klass);
    }

    public static final InterfaceC1698l f(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z7 = object instanceof InterfaceC1698l;
        boolean z8 = object instanceof InterfaceC1690d;
        if (z7 && z8) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1690d) object, (InterfaceC1698l) object);
        }
        if (z8) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1690d) object, null);
        }
        if (z7) {
            return (InterfaceC1698l) object;
        }
        Class<?> cls = object.getClass();
        C1706t c1706t = f11417a;
        if (c1706t.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends InterfaceC1692f>> list = classToAdapters.get(cls);
        Intrinsics.d(list);
        List<Constructor<? extends InterfaceC1692f>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(c1706t.a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC1692f[] interfaceC1692fArr = new InterfaceC1692f[size];
        for (int i7 = 0; i7 < size; i7++) {
            interfaceC1692fArr[i7] = f11417a.a(list2.get(i7), object);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC1692fArr);
    }

    private final int g(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC1692f> constructorB = b(klass);
        if (constructorB != null) {
            classToAdapters.put(klass, CollectionsKt.d(constructorB));
            return 2;
        }
        if (C1688b.f11386c.d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (e(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC1692f>> list = classToAdapters.get(superclass);
            Intrinsics.d(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> cls : interfaces) {
            if (e(cls)) {
                Intrinsics.checkNotNullExpressionValue(cls, "intrface");
                if (d(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC1692f>> list2 = classToAdapters.get(cls);
                Intrinsics.d(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
