package W3;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzat;
import com.google.android.gms.measurement.internal.zzkv;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

public interface d extends IInterface {
    void I1(zzp zzpVar) throws RemoteException;

    void I5(zzkv zzkvVar, zzp zzpVar) throws RemoteException;

    byte[] N2(zzat zzatVar, String str) throws RemoteException;

    void T5(zzat zzatVar, String str, String str2) throws RemoteException;

    String U1(zzp zzpVar) throws RemoteException;

    void U3(zzat zzatVar, zzp zzpVar) throws RemoteException;

    void a3(zzp zzpVar) throws RemoteException;

    List<zzab> c3(String str, String str2, zzp zzpVar) throws RemoteException;

    void f4(zzp zzpVar) throws RemoteException;

    void h1(Bundle bundle, zzp zzpVar) throws RemoteException;

    void j4(long j7, String str, String str2, String str3) throws RemoteException;

    void q1(zzab zzabVar, zzp zzpVar) throws RemoteException;

    void r3(zzp zzpVar) throws RemoteException;

    List<zzkv> r4(String str, String str2, boolean z7, zzp zzpVar) throws RemoteException;

    List<zzkv> u5(zzp zzpVar, boolean z7) throws RemoteException;

    void v2(zzab zzabVar) throws RemoteException;

    List<zzkv> y1(String str, String str2, String str3, boolean z7) throws RemoteException;

    List<zzab> z2(String str, String str2, String str3) throws RemoteException;
}
