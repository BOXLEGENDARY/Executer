package E4;

import java.lang.reflect.Field;

public class F {

    private final Object f1097a;

    private final Field f1098b;

    private final Class f1099c;

    F(Object obj, Field field, Class cls) {
        this.f1097a = obj;
        this.f1098b = field;
        this.f1099c = cls;
    }

    public final Object a() {
        try {
            return this.f1099c.cast(this.f1098b.get(this.f1097a));
        } catch (Exception e7) {
            throw new H(String.format("Failed to get value of field %s of type %s on object of type %s", this.f1098b.getName(), this.f1097a.getClass().getName(), this.f1099c.getName()), e7);
        }
    }

    protected final Field b() {
        return this.f1098b;
    }

    public final void c(Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f1098b.set(this.f1097a, obj);
        } catch (Exception e7) {
            throw new H(String.format("Failed to set value of field %s of type %s on object of type %s", this.f1098b.getName(), this.f1097a.getClass().getName(), this.f1099c.getName()), e7);
        }
    }
}
