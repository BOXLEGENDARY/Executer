package u5;

import android.media.AudioRecord;
import com.roblox.client.personasdk.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Ll8/c;", "a", "()Ll8/c;", "", "", "Ljava/util/List;", "SAMPLE_RATES", "camera_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0617d {

    @NotNull
    private static final List<Integer> a = CollectionsKt.m(new Integer[]{48000, 44100, 22050, 16000, 11025, 8000});

    public static final AudioConfiguration a() throws Throwable {
        Iterator<Integer> it = a.iterator();
        while (true) {
            AudioRecord audioRecord = null;
            if (!it.hasNext()) {
                return null;
            }
            int iIntValue = it.next().intValue();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(iIntValue, 16, 2);
                if (minBufferSize != -2) {
                    AudioRecord audioRecord2 = new AudioRecord(1, iIntValue, 16, 2, minBufferSize);
                    try {
                        if (audioRecord2.getState() == 1) {
                            audioRecord2.release();
                            AudioConfiguration audioConfiguration = new AudioConfiguration(iIntValue, 16, 2, minBufferSize);
                            audioRecord2.release();
                            return audioConfiguration;
                        }
                        audioRecord2.release();
                    } catch (IllegalArgumentException unused) {
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                    } catch (SecurityException unused2) {
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                    } catch (Throwable th) {
                        th = th;
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                        throw th;
                    }
                }
            } catch (IllegalArgumentException unused3) {
            } catch (SecurityException unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
