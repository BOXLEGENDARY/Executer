package android.view;

import R0.a;
import W0.JWp.kNUgEaOjcPdX;
import android.app.Application;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0011\u0015\u0019\u001bB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\fJ(\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0097\u0002¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0097\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/O;", BuildConfig.FLAVOR, "Landroidx/lifecycle/Q;", "store", "Landroidx/lifecycle/O$b;", "factory", "LR0/a;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/Q;Landroidx/lifecycle/O$b;LR0/a;)V", "Landroidx/lifecycle/S;", "owner", "(Landroidx/lifecycle/S;Landroidx/lifecycle/O$b;)V", "Landroidx/lifecycle/L;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/L;", BuildConfig.FLAVOR, "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/L;", "Landroidx/lifecycle/Q;", "Landroidx/lifecycle/O$b;", "c", "LR0/a;", "d", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class C1681O {

    private final C1683Q store;

    private final b factory;

    private final R0.a defaultCreationExtras;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/O$b;", BuildConfig.FLAVOR, "Landroidx/lifecycle/L;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/L;", "LR0/a;", "extras", "b", "(Ljava/lang/Class;LR0/a;)Landroidx/lifecycle/L;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {

        public static final Companion INSTANCE = Companion.f11336a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/O$b$a;", BuildConfig.FLAVOR, "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            static final Companion f11336a = new Companion();

            private Companion() {
            }
        }

        default <T extends AbstractC1678L> T a(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends AbstractC1678L> T b(Class<T> modelClass, R0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) a(modelClass);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/O$c;", "Landroidx/lifecycle/O$b;", "<init>", "()V", "Landroidx/lifecycle/L;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/L;", "b", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c implements b {

        private static c f11338c;

        public static final Companion INSTANCE = new Companion(null);

        public static final a.b<String> f11339d = Companion.C0100a.f11340a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/O$c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/O$c;", "a", "()Landroidx/lifecycle/O$c;", "getInstance$annotations", "instance", "LR0/a$b;", BuildConfig.FLAVOR, "VIEW_MODEL_KEY", "LR0/a$b;", "sInstance", "Landroidx/lifecycle/O$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/O$c$a$a;", "LR0/a$b;", BuildConfig.FLAVOR, "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class C0100a implements a.b<String> {

                public static final C0100a f11340a = new C0100a();

                private C0100a() {
                }
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                if (c.f11338c == null) {
                    c.f11338c = new c();
                }
                c cVar = c.f11338c;
                Intrinsics.d(cVar);
                return cVar;
            }

            private Companion() {
            }
        }

        @Override
        public <T extends AbstractC1678L> T a(Class<T> modelClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
                Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/O$d;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/L;", "viewModel", BuildConfig.FLAVOR, "c", "(Landroidx/lifecycle/L;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {
        public void c(AbstractC1678L viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    public C1681O(C1683Q c1683q, b bVar) {
        this(c1683q, bVar, null, 4, null);
        Intrinsics.checkNotNullParameter(c1683q, "store");
        Intrinsics.checkNotNullParameter(bVar, "factory");
    }

    public <T extends AbstractC1678L> T a(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public <T extends AbstractC1678L> T b(String key, Class<T> modelClass) {
        T t7;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T t8 = (T) this.store.b(key);
        if (!modelClass.isInstance(t8)) {
            R0.d dVar = new R0.d(this.defaultCreationExtras);
            dVar.c(c.f11339d, key);
            try {
                t7 = (T) this.factory.b(modelClass, dVar);
            } catch (AbstractMethodError unused) {
                t7 = (T) this.factory.a(modelClass);
            }
            this.store.d(key, t7);
            return t7;
        }
        Object obj = this.factory;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            Intrinsics.d(t8);
            dVar2.c(t8);
        }
        Intrinsics.e(t8, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t8;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/O$a;", "Landroidx/lifecycle/O$c;", "Landroid/app/Application;", "application", BuildConfig.FLAVOR, "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/L;", "T", "Ljava/lang/Class;", "modelClass", "app", "g", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/L;", "LR0/a;", "extras", "b", "(Ljava/lang/Class;LR0/a;)Landroidx/lifecycle/L;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/L;", "e", "Landroid/app/Application;", "f", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a extends c {

        private static a f11331g;

        private final Application application;

        public static final Companion INSTANCE = new Companion(null);

        public static final a.b<Application> f11332h = Companion.C0099a.f11334a;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/O$a$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/O$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/O$a;", "LR0/a$b;", "APPLICATION_KEY", "LR0/a$b;", BuildConfig.FLAVOR, "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/O$a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/O$a$a$a;", "LR0/a$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class C0099a implements a.b<Application> {

                public static final C0099a f11334a = new C0099a();

                private C0099a() {
                }
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f11331g == null) {
                    a.f11331g = new a(application);
                }
                a aVar = a.f11331g;
                Intrinsics.d(aVar);
                return aVar;
            }

            private Companion() {
            }
        }

        private a(Application application, int i7) {
            this.application = application;
        }

        private final <T extends AbstractC1678L> T g(Class<T> modelClass, Application app) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (!C1687a.class.isAssignableFrom(modelClass)) {
                return (T) super.a(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            }
        }

        @Override
        public <T extends AbstractC1678L> T a(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override
        public <T extends AbstractC1678L> T b(Class<T> modelClass, R0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.application != null) {
                return (T) a(modelClass);
            }
            Application application = (Application) extras.a(f11332h);
            if (application != null) {
                return (T) g(modelClass, application);
            }
            if (C1687a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    public C1681O(C1683Q c1683q, b bVar, R0.a aVar) {
        Intrinsics.checkNotNullParameter(c1683q, "store");
        Intrinsics.checkNotNullParameter(bVar, GObvYfBKohxpYX.DaIyNKsou);
        Intrinsics.checkNotNullParameter(aVar, "defaultCreationExtras");
        this.store = c1683q;
        this.factory = bVar;
        this.defaultCreationExtras = aVar;
    }

    public C1681O(C1683Q c1683q, b bVar, R0.a aVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1683q, bVar, (i7 & 4) != 0 ? a.C0046a.f4920b : aVar);
    }

    public C1681O(InterfaceC1684S interfaceC1684S, b bVar) {
        this(interfaceC1684S.getViewModelStore(), bVar, C1682P.a(interfaceC1684S));
        Intrinsics.checkNotNullParameter(interfaceC1684S, "owner");
        Intrinsics.checkNotNullParameter(bVar, kNUgEaOjcPdX.mdZeby);
    }
}
