package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1845c3;
import com.google.android.gms.internal.measurement.AbstractC1853d3;

public abstract class AbstractC1845c3<MessageType extends AbstractC1853d3<MessageType, BuilderType>, BuilderType extends AbstractC1845c3<MessageType, BuilderType>> implements InterfaceC2013x4 {
    @Override
    public final InterfaceC2013x4 K(InterfaceC2021y4 interfaceC2021y4) {
        if (e().getClass().isInstance(interfaceC2021y4)) {
            return h((AbstractC1853d3) interfaceC2021y4);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override
    public final InterfaceC2013x4 N(byte[] bArr) throws C1854d4 {
        return i(bArr, 0, bArr.length);
    }

    @Override
    public final InterfaceC2013x4 U(byte[] bArr, G3 g32) throws C1854d4 {
        return j(bArr, 0, bArr.length, g32);
    }

    protected abstract BuilderType h(MessageType messagetype);

    public abstract BuilderType i(byte[] bArr, int i7, int i8) throws C1854d4;

    public abstract BuilderType j(byte[] bArr, int i7, int i8, G3 g32) throws C1854d4;
}
