package ha;

import P9.m;
import android.os.Parcel;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentStepData;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedGovernmentIdDetails;
import com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.StepData;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.UiStepData;
import com.withpersona.sdk2.inquiry.ui.network.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "d", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "h", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;", "e", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "a", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;)Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiStepData;", "i", "(Lcom/withpersona/sdk2/inquiry/ui/network/UiStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0339a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0021a {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;

        static {
            int[] iArr = new int[GovernmentId.b.values().length];
            try {
                iArr[GovernmentId.b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentId.b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentId.b.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[GovernmentId.a.values().length];
            try {
                iArr2[GovernmentId.a.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentId.a.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentId.a.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[Selfie.a.values().length];
            try {
                iArr3[Selfie.a.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Selfie.a.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            c = iArr3;
        }
    }

    private static final CollectedGovernmentIdDetails a(List<GovernmentIdDetails> list) {
        Iterator<GovernmentIdDetails> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new CollectedGovernmentIdDetails((Date) null, (Date) null);
            }
            GovernmentIdDetails next = it.next();
            if ((next != null ? next.getDateOfBirth() : null) != null && next.getExpirationDate() != null) {
                return new CollectedGovernmentIdDetails(next.getDateOfBirth(), next.getExpirationDate());
            }
        }
    }

    private static final GovernmentIdCapture b(GovernmentId governmentId) throws m {
        GovernmentIdCapture.c cVar;
        GovernmentIdCapture.a aVar;
        String idClassKey = governmentId.getIdClassKey();
        int i = C0021a.a[governmentId.getSide().ordinal()];
        if (i == 1) {
            cVar = GovernmentIdCapture.c.d;
        } else if (i == 2) {
            cVar = GovernmentIdCapture.c.e;
        } else {
            if (i != 3) {
                throw new m();
            }
            cVar = GovernmentIdCapture.c.i;
        }
        int i2 = C0021a.b[governmentId.getCaptureMethod().ordinal()];
        if (i2 == 1) {
            aVar = GovernmentIdCapture.a.e;
        } else if (i2 == 2) {
            aVar = GovernmentIdCapture.a.d;
        } else {
            if (i2 != 3) {
                throw new m();
            }
            aVar = GovernmentIdCapture.a.i;
        }
        List<Frame> listB1 = governmentId.b1();
        ArrayList arrayList = new ArrayList();
        for (Frame frame : listB1) {
            File file = new File(frame.getAbsoluteFilePath());
            GovernmentIdCapture.Frame frame2 = file.exists() ? new GovernmentIdCapture.Frame(file, frame.getMimeType()) : null;
            if (frame2 != null) {
                arrayList.add(frame2);
            }
        }
        return new GovernmentIdCapture(idClassKey, cVar, aVar, arrayList);
    }

    private static final SelfieCapture c(Selfie selfie) throws m {
        SelfieCapture.a aVar;
        if (!new File(selfie.getAbsoluteFilePath()).exists()) {
            return null;
        }
        int i = C0021a.c[selfie.getCaptureMethod().ordinal()];
        if (i == 1) {
            aVar = SelfieCapture.a.e;
        } else {
            if (i != 2) {
                throw new m();
            }
            aVar = SelfieCapture.a.d;
        }
        return new SelfieCapture(aVar, new File(selfie.getAbsoluteFilePath()));
    }

    public static final CollectedData d(@NotNull List<? extends StepData> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.withpersona.sdk2.inquiry.types.collected_data.StepData stepDataH = h((StepData) it.next());
            if (stepDataH != null) {
                arrayList.add(stepDataH);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CollectedData(arrayList);
    }

    private static final com.withpersona.sdk2.inquiry.types.collected_data.StepData e(DocumentStepData documentStepData) throws m {
        DocumentFile documentFile;
        String stepName = documentStepData.getStepName();
        List<com.withpersona.sdk2.inquiry.document.DocumentFile> listA = documentStepData.a();
        ArrayList arrayList = new ArrayList();
        for (com.withpersona.sdk2.inquiry.document.DocumentFile documentFile2 : listA) {
            if (documentFile2 instanceof DocumentFile.Local) {
                documentFile = new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(((DocumentFile.Local) documentFile2).getAbsoluteFilePath()));
            } else {
                if (!(documentFile2 instanceof DocumentFile.Remote)) {
                    throw new m();
                }
                String absoluteFilePath = ((DocumentFile.Remote) documentFile2).getAbsoluteFilePath();
                documentFile = absoluteFilePath != null ? new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(absoluteFilePath)) : null;
            }
            if (documentFile != null) {
                arrayList.add(documentFile);
            }
        }
        return new StepData.DocumentStepData(stepName, arrayList);
    }

    private static final com.withpersona.sdk2.inquiry.types.collected_data.StepData f(GovernmentIdStepData governmentIdStepData) {
        String stepName = governmentIdStepData.getStepName();
        List<GovernmentId> listA = governmentIdStepData.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.t(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((GovernmentId) it.next()));
        }
        List<GovernmentId> listA2 = governmentIdStepData.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA2) {
            if (obj instanceof GovernmentId.GovernmentIdImage) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.t(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((GovernmentId.GovernmentIdImage) it2.next()).getIdDetails());
        }
        return new StepData.GovernmentIdStepData(stepName, arrayList, a(arrayList3));
    }

    private static final com.withpersona.sdk2.inquiry.types.collected_data.StepData g(SelfieStepData selfieStepData) {
        String stepName = selfieStepData.getStepName();
        Selfie centerCapture = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureC = centerCapture != null ? c(centerCapture) : null;
        Selfie centerCapture2 = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureC2 = centerCapture2 != null ? c(centerCapture2) : null;
        Selfie centerCapture3 = selfieStepData.getCenterCapture();
        return new StepData.SelfieStepData(stepName, selfieCaptureC, selfieCaptureC2, centerCapture3 != null ? c(centerCapture3) : null);
    }

    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData h(@NotNull com.withpersona.sdk2.inquiry.shared.data_collection.StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "<this>");
        if (stepData instanceof UiStepData) {
            return i((UiStepData) stepData);
        }
        if (stepData instanceof SelfieStepData) {
            return g((SelfieStepData) stepData);
        }
        if (stepData instanceof GovernmentIdStepData) {
            return f((GovernmentIdStepData) stepData);
        }
        if (stepData instanceof DocumentStepData) {
            return e((DocumentStepData) stepData);
        }
        return null;
    }

    @NotNull
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData i(@NotNull UiStepData uiStepData) throws m {
        Intrinsics.checkNotNullParameter(uiStepData, "<this>");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = uiStepData.a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            try {
                Object objA = a.a((ComponentParam) entry.getValue());
                parcelObtain.writeValue(objA);
                linkedHashMap.put(str, objA);
            } catch (RuntimeException unused) {
            }
        }
        parcelObtain.recycle();
        return new StepData.UiStepData(uiStepData.getStepName(), linkedHashMap);
    }
}
