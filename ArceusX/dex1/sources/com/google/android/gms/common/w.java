package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import n3.AbstractBinderC2642S;
import n3.C2651i;
import n3.InterfaceC2628D;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

abstract class w extends AbstractBinderC2642S {

    private final int f14400d;

    protected w(byte[] bArr) {
        C2651i.a(bArr.length == 25);
        this.f14400d = Arrays.hashCode(bArr);
    }

    protected static byte[] V0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override
    public final int a() {
        return this.f14400d;
    }

    @Override
    public final InterfaceC3023a d() {
        return BinderC3024b.h3(h3());
    }

    public final boolean equals(Object obj) {
        InterfaceC3023a interfaceC3023aD;
        if (obj != null && (obj instanceof InterfaceC2628D)) {
            try {
                InterfaceC2628D interfaceC2628D = (InterfaceC2628D) obj;
                if (interfaceC2628D.a() == this.f14400d && (interfaceC3023aD = interfaceC2628D.d()) != null) {
                    return Arrays.equals(h3(), (byte[]) BinderC3024b.V0(interfaceC3023aD));
                }
                return false;
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    abstract byte[] h3();

    public final int hashCode() {
        return this.f14400d;
    }
}
