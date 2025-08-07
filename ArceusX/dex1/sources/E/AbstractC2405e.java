package e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.result.ActivityResult;
import com.github.luben.zstd.BuildConfig;
import f.AbstractC2431a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b&\u0018\u0000 \u00122\u00020\u0001:\u00037:=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00104\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00108R\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u0014\u0010E\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010D¨\u0006F"}, d2 = {"Le/e;", BuildConfig.FLAVOR, "<init>", "()V", "O", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "resultCode", "Landroid/content/Intent;", "data", "Le/e$a;", "callbackAndContract", BuildConfig.FLAVOR, "g", "(Ljava/lang/String;ILandroid/content/Intent;Le/e$a;)V", "o", "(Ljava/lang/String;)V", "h", "()I", "rc", "d", "(ILjava/lang/String;)V", "I", "requestCode", "Lf/a;", "contract", "input", "Landroidx/core/app/c;", "options", "i", "(ILf/a;Ljava/lang/Object;Landroidx/core/app/c;)V", "Landroidx/lifecycle/o;", "lifecycleOwner", "Le/a;", "callback", "Le/c;", "l", "(Ljava/lang/String;Landroidx/lifecycle/o;Lf/a;Le/a;)Le/c;", "m", "(Ljava/lang/String;Lf/a;Le/a;)Le/c;", "p", "Landroid/os/Bundle;", "outState", "k", "(Landroid/os/Bundle;)V", "savedInstanceState", "j", BuildConfig.FLAVOR, "e", "(IILandroid/content/Intent;)Z", "result", "f", "(ILjava/lang/Object;)Z", BuildConfig.FLAVOR, "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "Le/e$c;", "c", "keyToLifecycleContainers", BuildConfig.FLAVOR, "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractC2405e {

    private static final b f20349h = new b(null);

    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    private final Map<String, c> keyToLifecycleContainers = new LinkedHashMap();

    private final List<String> launchedKeys = new ArrayList();

    private final transient Map<String, a<?>> keyToCallback = new LinkedHashMap();

    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    private final Bundle pendingResults = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Le/e$a;", "O", BuildConfig.FLAVOR, "Le/a;", "callback", "Lf/a;", "contract", "<init>", "(Le/a;Lf/a;)V", "a", "Le/a;", "()Le/a;", "b", "Lf/a;", "()Lf/a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<O> {

        private final InterfaceC2401a<O> callback;

        private final AbstractC2431a<?, O> contract;

        public a(InterfaceC2401a<O> interfaceC2401a, AbstractC2431a<?, O> abstractC2431a) {
            Intrinsics.checkNotNullParameter(interfaceC2401a, "callback");
            Intrinsics.checkNotNullParameter(abstractC2431a, "contract");
            this.callback = interfaceC2401a;
            this.contract = abstractC2431a;
        }

        public final InterfaceC2401a<O> a() {
            return this.callback;
        }

        public final AbstractC2431a<?, O> b() {
            return this.contract;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Le/e$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "INITIAL_REQUEST_CODE_VALUE", "I", BuildConfig.FLAVOR, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Le/e$c;", BuildConfig.FLAVOR, "Landroidx/lifecycle/h;", "lifecycle", "<init>", "(Landroidx/lifecycle/h;)V", "Landroidx/lifecycle/l;", "observer", BuildConfig.FLAVOR, "a", "(Landroidx/lifecycle/l;)V", "b", "()V", "Landroidx/lifecycle/h;", "getLifecycle", "()Landroidx/lifecycle/h;", BuildConfig.FLAVOR, "Ljava/util/List;", "observers", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        private final AbstractC1694h lifecycle;

        private final List<InterfaceC1698l> observers;

        public c(AbstractC1694h abstractC1694h) {
            Intrinsics.checkNotNullParameter(abstractC1694h, "lifecycle");
            this.lifecycle = abstractC1694h;
            this.observers = new ArrayList();
        }

        public final void a(InterfaceC1698l observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.lifecycle.a(observer);
            this.observers.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.d((InterfaceC1698l) it.next());
            }
            this.observers.clear();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends l implements Function0<Integer> {

        public static final d f20361d = new d();

        d() {
            super(0);
        }

        public final Integer m47invoke() {
            return Integer.valueOf(kotlin.random.c.d.d(2147418112) + 65536);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"e/e$e", "Le/c;", "input", "Landroidx/core/app/c;", "options", BuildConfig.FLAVOR, "c", "(Ljava/lang/Object;Landroidx/core/app/c;)V", "d", "()V", "Lf/a;", "a", "()Lf/a;", "contract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0182e<I> extends AbstractC2403c<I> {

        final String f20363b;

        final AbstractC2431a<I, O> f20364c;

        C0182e(String str, AbstractC2431a<I, O> abstractC2431a) {
            this.f20363b = str;
            this.f20364c = abstractC2431a;
        }

        @Override
        public AbstractC2431a<I, ?> a() {
            return (AbstractC2431a<I, ?>) this.f20364c;
        }

        @Override
        public void c(I input, androidx.core.app.c options) throws Exception {
            Object obj = AbstractC2405e.this.keyToRc.get(this.f20363b);
            Object obj2 = this.f20364c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                AbstractC2405e.this.launchedKeys.add(this.f20363b);
                try {
                    AbstractC2405e.this.i(iIntValue, this.f20364c, input, options);
                    return;
                } catch (Exception e7) {
                    AbstractC2405e.this.launchedKeys.remove(this.f20363b);
                    throw e7;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override
        public void d() {
            AbstractC2405e.this.p(this.f20363b);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"e/e$f", "Le/c;", "input", "Landroidx/core/app/c;", "options", BuildConfig.FLAVOR, "c", "(Ljava/lang/Object;Landroidx/core/app/c;)V", "d", "()V", "Lf/a;", "a", "()Lf/a;", "contract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f<I> extends AbstractC2403c<I> {

        final String f20366b;

        final AbstractC2431a<I, O> f20367c;

        f(String str, AbstractC2431a<I, O> abstractC2431a) {
            this.f20366b = str;
            this.f20367c = abstractC2431a;
        }

        @Override
        public AbstractC2431a<I, ?> a() {
            return (AbstractC2431a<I, ?>) this.f20367c;
        }

        @Override
        public void c(I input, androidx.core.app.c options) throws Exception {
            Object obj = AbstractC2405e.this.keyToRc.get(this.f20366b);
            Object obj2 = this.f20367c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                AbstractC2405e.this.launchedKeys.add(this.f20366b);
                try {
                    AbstractC2405e.this.i(iIntValue, this.f20367c, input, options);
                    return;
                } catch (Exception e7) {
                    AbstractC2405e.this.launchedKeys.remove(this.f20366b);
                    throw e7;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override
        public void d() {
            AbstractC2405e.this.p(this.f20366b);
        }
    }

    private final void d(int rc, String key) {
        this.rcToKey.put(Integer.valueOf(rc), key);
        this.keyToRc.put(key, Integer.valueOf(rc));
    }

    private final <O> void g(String key, int resultCode, Intent data, a<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new ActivityResult(resultCode, data));
        } else {
            callbackAndContract.a().a(callbackAndContract.b().parseResult(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    private final int h() {
        for (Number number : kotlin.sequences.g.e(d.f20361d)) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final void n(AbstractC2405e abstractC2405e, String str, InterfaceC2401a interfaceC2401a, AbstractC2431a abstractC2431a, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        Intrinsics.checkNotNullParameter(interfaceC1701o, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(aVar, "event");
        if (AbstractC1694h.a.ON_START != aVar) {
            if (AbstractC1694h.a.ON_STOP == aVar) {
                abstractC2405e.keyToCallback.remove(str);
                return;
            } else {
                if (AbstractC1694h.a.ON_DESTROY == aVar) {
                    abstractC2405e.p(str);
                    return;
                }
                return;
            }
        }
        abstractC2405e.keyToCallback.put(str, new a<>(interfaceC2401a, abstractC2431a));
        if (abstractC2405e.parsedPendingResults.containsKey(str)) {
            Object obj = abstractC2405e.parsedPendingResults.get(str);
            abstractC2405e.parsedPendingResults.remove(str);
            interfaceC2401a.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) u0.c.a(abstractC2405e.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            abstractC2405e.pendingResults.remove(str);
            interfaceC2401a.a(abstractC2431a.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    private final void o(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        d(h(), key);
    }

    public final boolean e(int requestCode, int resultCode, Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        g(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean f(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.keyToCallback.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        InterfaceC2401a<?> interfaceC2401aA = aVar.a();
        Intrinsics.e(interfaceC2401aA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        interfaceC2401aA.a(result);
        return true;
    }

    public abstract <I, O> void i(int requestCode, AbstractC2431a<I, O> contract, I input, androidx.core.app.c options);

    public final void j(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str = stringArrayList.get(i7);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    D.b(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i7);
            Intrinsics.checkNotNullExpressionValue(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i7);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    public final <I, O> AbstractC2403c<I> l(final String key, InterfaceC1701o lifecycleOwner, final AbstractC2431a<I, O> contract, final InterfaceC2401a<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1694h lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState().e(AbstractC1694h.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC1698l() {
            @Override
            public final void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
                AbstractC2405e.n(this.f20345d, key, callback, contract, interfaceC1701o, aVar);
            }
        });
        this.keyToLifecycleContainers.put(key, cVar);
        return new C0182e(key, contract);
    }

    public final <I, O> AbstractC2403c<I> m(String key, AbstractC2431a<I, O> contract, InterfaceC2401a<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o(key);
        this.keyToCallback.put(key, new a<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) u0.c.a(this.pendingResults, key, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(key);
            callback.a(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new f(key, contract);
    }

    public final void p(String key) {
        Integer numRemove;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) u0.c.a(this.pendingResults, key, ActivityResult.class)));
            this.pendingResults.remove(key);
        }
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar != null) {
            cVar.b();
            this.keyToLifecycleContainers.remove(key);
        }
    }
}
