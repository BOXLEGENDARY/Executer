package D;

import C.InterfaceC0336k0;
import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;

class c {
    public static InterfaceC0336k0 a(EncoderProfiles encoderProfiles) {
        return InterfaceC0336k0.b.h(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), b(encoderProfiles.getAudioProfiles()), c(encoderProfiles.getVideoProfiles()));
    }

    private static List<InterfaceC0336k0.a> b(List<EncoderProfiles.AudioProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : list) {
            arrayList.add(InterfaceC0336k0.a.a(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    private static List<InterfaceC0336k0.c> c(List<EncoderProfiles.VideoProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : list) {
            arrayList.add(InterfaceC0336k0.c.a(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return arrayList;
    }
}
