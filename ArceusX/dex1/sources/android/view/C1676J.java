package android.view;

import Za.qhkq.dHkZSUxHu;
import android.app.Application;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/L;", "T", "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "params", "d", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/L;", BuildConfig.FLAVOR, "signature", "c", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "a", "Ljava/util/List;", "ANDROID_VIEWMODEL_SIGNATURE", "b", "VIEWMODEL_SIGNATURE", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C1676J {

    private static final List<Class<?>> f11284a = CollectionsKt.m(new Class[]{Application.class, C1671E.class});

    private static final List<Class<?>> f11285b = CollectionsKt.d(C1671E.class);

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) throws SecurityException {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(list, "signature");
        Object[] constructors = cls.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List listQ = i.Q(parameterTypes);
            if (Intrinsics.b(list, listQ)) {
                Intrinsics.e(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listQ.size() && listQ.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends AbstractC1678L> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + dHkZSUxHu.ZfpStOvem, e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
