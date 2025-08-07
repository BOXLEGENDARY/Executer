package X;

import android.media.MediaCodecInfo;
import java.util.Objects;

public abstract class Z implements Y {

    private final MediaCodecInfo f7812a;

    protected final MediaCodecInfo.CodecCapabilities f7813b;

    Z(MediaCodecInfo mediaCodecInfo, String str) throws d0 {
        this.f7812a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f7813b = capabilitiesForType;
        } catch (RuntimeException e7) {
            throw new d0("Unable to get CodecCapabilities for mime: " + str, e7);
        }
    }
}
