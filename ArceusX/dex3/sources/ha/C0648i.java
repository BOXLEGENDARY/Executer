package ha;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/hardware/camera2/CameraCharacteristics;", "", "preferredFps", "Landroid/util/Range;", "b", "(Landroid/hardware/camera2/CameraCharacteristics;I)Landroid/util/Range;", "Landroid/content/Context;", "context", "Ln8/n;", "cameraDirection", "Ln8/m;", "a", "(Landroid/content/Context;Ln8/n;)Ln8/m;", "camera_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0648i {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[EnumC0653n.values().length];
            try {
                iArr[EnumC0653n.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0653n.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class b<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            CameraChoice cameraChoice = (CameraChoice) t2;
            CameraChoice cameraChoice2 = (CameraChoice) t;
            return R9.a.a(Integer.valueOf(cameraChoice.getSize().getWidth() * cameraChoice.getSize().getHeight()), Integer.valueOf(cameraChoice2.getSize().getWidth() * cameraChoice2.getSize().getHeight()));
        }
    }

    public static final CameraChoices a(@NotNull Context context, @NotNull EnumC0653n enumC0653n) throws CameraAccessException {
        String[] strArr;
        int i;
        Range<Integer> range;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(enumC0653n, "cameraDirection");
        Object systemService = context.getSystemService("camera");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        String[] cameraIdList = cameraManager.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            String str = cameraIdList[i3];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            Integer numValueOf = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(i2);
            }
            Intrinsics.d(numValueOf);
            int iIntValue = numValueOf.intValue();
            int i4 = a.a[enumC0653n.ordinal()];
            if (i4 == 1 ? num != null && num.intValue() == 0 : i4 != 2 || (num != null && num.intValue() == 1)) {
                int iIntValue2 = num.intValue();
                CameraProperties.b bVar = iIntValue2 != 0 ? iIntValue2 != 1 ? CameraProperties.b.i : CameraProperties.b.e : CameraProperties.b.d;
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null) {
                    Intrinsics.d(iArr);
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    if (streamConfigurationMap != null) {
                        Intrinsics.d(streamConfigurationMap);
                        if (i.v(iArr, i2)) {
                            Range<Integer> rangeB = b(cameraCharacteristics, 30);
                            Class<MediaRecorder> cls = MediaRecorder.class;
                            Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
                            Intrinsics.checkNotNullExpressionValue(outputSizes, "getOutputSizes(...)");
                            int length2 = outputSizes.length;
                            int i5 = i2;
                            while (i5 < length2) {
                                Size size = outputSizes[i5];
                                int i6 = i3;
                                double outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(cls, size) / 1.0E9d;
                                CameraManager cameraManager2 = cameraManager;
                                double d = outputMinFrameDuration > 0.0d ? 1.0d / outputMinFrameDuration : 0.0d;
                                Intrinsics.d(str);
                                Intrinsics.d(size);
                                if (rangeB == null) {
                                    strArr = cameraIdList;
                                    int i7 = (int) d;
                                    i = length;
                                    range = new Range<>(Integer.valueOf(i7), Integer.valueOf(i7));
                                } else {
                                    strArr = cameraIdList;
                                    i = length;
                                    range = rangeB;
                                }
                                arrayList.add(new CameraChoice(str, size, d, range, iIntValue, bVar, new ExtraCameraOptions(0L, false, 3, null)));
                                i5++;
                                str = str;
                                cls = cls;
                                streamConfigurationMap = streamConfigurationMap;
                                i3 = i6;
                                cameraManager = cameraManager2;
                                cameraIdList = strArr;
                                length = i;
                                length2 = length2;
                                outputSizes = outputSizes;
                            }
                        }
                    }
                }
            }
            i3++;
            cameraManager = cameraManager;
            cameraIdList = cameraIdList;
            length = length;
            i2 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            CameraChoice cameraChoice = (CameraChoice) obj;
            if (cameraChoice.getSize().getWidth() < 2000 && cameraChoice.getSize().getHeight() < 2000) {
                arrayList2.add(obj);
            }
        }
        List listL0 = CollectionsKt.l0(arrayList2, new b());
        if (listL0.isEmpty()) {
            return null;
        }
        return new CameraChoices((CameraChoice) CollectionsKt.M(listL0), CollectionsKt.n0(CollectionsKt.H(listL0, 1), 2));
    }

    private static final android.util.Range<java.lang.Integer> b(android.hardware.camera2.CameraCharacteristics r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0648i.b(android.hardware.camera2.CameraCharacteristics, int):android.util.Range");
    }
}
