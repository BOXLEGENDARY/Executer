package Y;

import X.InterfaceC1540k;
import X.d0;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;

public final class a {

    private static final LruCache<String, MediaCodecInfo> f8001a = new LruCache<>(10);

    public static MediaCodec a(InterfaceC1540k interfaceC1540k) throws d0 {
        return b(interfaceC1540k.c());
    }

    private static MediaCodec b(String str) throws d0 {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e7) {
            throw new d0(e7);
        }
    }

    public static MediaCodecInfo c(InterfaceC1540k interfaceC1540k) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecB;
        String strC = interfaceC1540k.c();
        LruCache<String, MediaCodecInfo> lruCache = f8001a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(strC);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodecB = b(strC);
            try {
                MediaCodecInfo codecInfo = mediaCodecB.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(strC, codecInfo);
                }
                mediaCodecB.release();
                return codecInfo;
            } catch (Throwable th) {
                th = th;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodecB = null;
        }
    }
}
