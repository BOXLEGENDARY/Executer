package X;

import android.media.MediaCodecInfo;
import java.util.Objects;

public class C1531b extends Z implements Y {

    private final MediaCodecInfo.AudioCapabilities f7814c;

    C1531b(MediaCodecInfo mediaCodecInfo, String str) throws d0 {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f7813b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f7814c = audioCapabilities;
    }
}
