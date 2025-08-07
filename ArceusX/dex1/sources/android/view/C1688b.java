package android.view;

import android.view.AbstractC1694h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
final class C1688b {

    static C1688b f11386c = new C1688b();

    private final Map<Class<?>, a> f11387a = new HashMap();

    private final Map<Class<?>, Boolean> f11388b = new HashMap();

    @Deprecated
    static class a {

        final Map<AbstractC1694h.a, List<C0104b>> f11389a = new HashMap();

        final Map<C0104b, AbstractC1694h.a> f11390b;

        a(Map<C0104b, AbstractC1694h.a> map) {
            this.f11390b = map;
            for (Map.Entry<C0104b, AbstractC1694h.a> entry : map.entrySet()) {
                AbstractC1694h.a value = entry.getValue();
                List<C0104b> arrayList = this.f11389a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f11389a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<C0104b> list, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(interfaceC1701o, aVar, obj);
                }
            }
        }

        void a(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b(this.f11389a.get(aVar), interfaceC1701o, aVar, obj);
            b(this.f11389a.get(AbstractC1694h.a.ON_ANY), interfaceC1701o, aVar, obj);
        }
    }

    @Deprecated
    static final class C0104b {

        final int f11391a;

        final Method f11392b;

        C0104b(int i7, Method method) throws SecurityException {
            this.f11391a = i7;
            this.f11392b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i7 = this.f11391a;
                if (i7 == 0) {
                    this.f11392b.invoke(obj, null);
                } else if (i7 == 1) {
                    this.f11392b.invoke(obj, interfaceC1701o);
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.f11392b.invoke(obj, interfaceC1701o, aVar);
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to call observer method", e8.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0104b)) {
                return false;
            }
            C0104b c0104b = (C0104b) obj;
            return this.f11391a == c0104b.f11391a && this.f11392b.getName().equals(c0104b.f11392b.getName());
        }

        public int hashCode() {
            return (this.f11391a * 31) + this.f11392b.getName().hashCode();
        }
    }

    C1688b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i7;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f11390b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0104b, AbstractC1694h.a> entry : c(cls2).f11390b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            InterfaceC1711y interfaceC1711y = (InterfaceC1711y) method.getAnnotation(InterfaceC1711y.class);
            if (interfaceC1711y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC1701o.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                AbstractC1694h.a aVarValue = interfaceC1711y.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1694h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1694h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0104b(i7, method), aVarValue, cls);
                z7 = true;
            }
        }
        a aVar = new a(map);
        this.f11387a.put(cls, aVar);
        this.f11388b.put(cls, Boolean.valueOf(z7));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e7) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
        }
    }

    private void e(Map<C0104b, AbstractC1694h.a> map, C0104b c0104b, AbstractC1694h.a aVar, Class<?> cls) {
        AbstractC1694h.a aVar2 = map.get(c0104b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0104b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0104b.f11392b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class<?> cls) {
        a aVar = this.f11387a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f11388b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((InterfaceC1711y) method.getAnnotation(InterfaceC1711y.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f11388b.put(cls, Boolean.FALSE);
        return false;
    }
}
