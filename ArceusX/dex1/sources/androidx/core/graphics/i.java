package androidx.core.graphics;

import K0.wJ.BtcVLuo;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w7.Jld.EZYiRMRTxKdo;

public class i extends h {
    @Override
    protected Typeface i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f10587g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10593m.invoke(null, objNewInstance, BtcVLuo.MGZDXbSkOBKp, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    protected Method t(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(EZYiRMRTxKdo.jAzI, cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
