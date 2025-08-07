package y3;

import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import n3.C2651i;
import y3.InterfaceC3023a;

public final class BinderC3024b<T> extends InterfaceC3023a.AbstractBinderC0238a {

    private final Object f24446d;

    private BinderC3024b(Object obj) {
        this.f24446d = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T V0(InterfaceC3023a interfaceC3023a) throws SecurityException {
        if (interfaceC3023a instanceof BinderC3024b) {
            return (T) ((BinderC3024b) interfaceC3023a).f24446d;
        }
        IBinder iBinderAsBinder = interfaceC3023a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        C2651i.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }

    public static <T> InterfaceC3023a h3(T t7) {
        return new BinderC3024b(t7);
    }
}
