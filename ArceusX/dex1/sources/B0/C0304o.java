package B0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010#R.\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b%\u0010\b\"\u0004\b&\u0010#¨\u0006("}, d2 = {"LB0/o;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LB0/n;", "f", "()LB0/n;", "e", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "classNames", "d", "(Ljava/util/List;Landroid/content/Context;)LB0/n;", "a", "(Landroid/content/Context;)Ljava/util/List;", BuildConfig.FLAVOR, "shouldFallbackToPreU", "b", "(Z)LB0/n;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testMode", "c", "LB0/n;", "getTestPostUProvider", "setTestPostUProvider", "(LB0/n;)V", "testPostUProvider", "getTestPreUProvider", "setTestPreUProvider", "testPreUProvider", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0304o {

    private final Context context;

    private boolean testMode;

    private InterfaceC0303n testPostUProvider;

    private InterfaceC0303n testPreUProvider;

    public C0304o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<String> a(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNullExpressionValue(serviceInfoArr, "packageInfo.services");
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return CollectionsKt.r0(arrayList);
    }

    public static InterfaceC0303n c(C0304o c0304o, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        return c0304o.b(z7);
    }

    private final InterfaceC0303n d(List<String> classNames, Context context) {
        Iterator<String> it = classNames.iterator();
        InterfaceC0303n interfaceC0303n = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.e(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC0303n interfaceC0303n2 = (InterfaceC0303n) objNewInstance;
                if (!interfaceC0303n2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC0303n != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    interfaceC0303n = interfaceC0303n2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC0303n;
    }

    private final InterfaceC0303n e() {
        if (!this.testMode) {
            Q q7 = new Q(this.context);
            if (q7.isAvailableOnDevice()) {
                return q7;
            }
            return null;
        }
        InterfaceC0303n interfaceC0303n = this.testPostUProvider;
        if (interfaceC0303n == null) {
            return null;
        }
        Intrinsics.d(interfaceC0303n);
        if (interfaceC0303n.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    private final InterfaceC0303n f() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> listA = a(this.context);
            if (listA.isEmpty()) {
                return null;
            }
            return d(listA, this.context);
        }
        InterfaceC0303n interfaceC0303n = this.testPreUProvider;
        if (interfaceC0303n == null) {
            return null;
        }
        Intrinsics.d(interfaceC0303n);
        if (interfaceC0303n.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    public final InterfaceC0303n b(boolean shouldFallbackToPreU) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            InterfaceC0303n interfaceC0303nE = e();
            return (interfaceC0303nE == null && shouldFallbackToPreU) ? f() : interfaceC0303nE;
        }
        if (i7 <= 33) {
            return f();
        }
        return null;
    }
}
