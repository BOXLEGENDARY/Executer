package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class BarhopperV2 implements Closeable {

    private static final String f17190e = "BarhopperV2";

    private long f17191d;

    public BarhopperV2() {
        System.loadLibrary("barhopper_v2");
    }

    private native void closeNative(long j7);

    private native long createNative();

    private native Barcode[] recognizeBitmapNative(long j7, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native Barcode[] recognizeBufferNative(long j7, int i7, int i8, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native Barcode[] recognizeNative(long j7, int i7, int i8, byte[] bArr, RecognitionOptions recognitionOptions);

    public void b() {
        if (this.f17191d != 0) {
            Log.w(f17190e, "Native context already exists.");
            return;
        }
        long jCreateNative = createNative();
        this.f17191d = jCreateNative;
        if (jCreateNative == 0) {
            throw new RuntimeException("Failed to create native context.");
        }
    }

    @Override
    public void close() {
        long j7 = this.f17191d;
        if (j7 != 0) {
            closeNative(j7);
            this.f17191d = 0L;
        }
    }

    public Barcode[] e(int i7, int i8, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j7 = this.f17191d;
        if (j7 != 0) {
            return recognizeBufferNative(j7, i7, i8, byteBuffer, recognitionOptions);
        }
        throw new RuntimeException("Native context does not exist.");
    }

    public Barcode[] f(int i7, int i8, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j7 = this.f17191d;
        if (j7 != 0) {
            return recognizeNative(j7, i7, i8, bArr, recognitionOptions);
        }
        throw new RuntimeException("Native context does not exist.");
    }

    protected void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public Barcode[] j(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        long j7 = this.f17191d;
        if (j7 != 0) {
            return recognizeBitmapNative(j7, bitmap, recognitionOptions);
        }
        throw new RuntimeException("Native context does not exist.");
    }
}
