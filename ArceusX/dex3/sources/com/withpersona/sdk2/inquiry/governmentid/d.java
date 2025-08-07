package com.withpersona.sdk2.inquiry.governmentid;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.AamvaExtraction;
import u5.AbstractC0618e;
import v8.EnumC0820A;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010,\u001a\u00020+*\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00101\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00108\u001a\u000204*\u000207¢\u0006\u0004\b8\u00109\u001a\u001b\u0010<\u001a\u00020;*\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "", "countryCode", "", "defaultManualCaptureDelayMs", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "LB8/b;", "type", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;LB8/b;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "defaultManualCaptureDelay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "b", "(J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;)Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "Lv8/A;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)Lv8/A;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "currentSide", "c", "(LB8/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "l", "(Lcom/withpersona/sdk2/camera/ExtractedTexts;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Ll8/e;", "m", "(Ll8/e;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;J)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;
        public static final int[] d;

        static {
            int[] iArr = new int[CapturePageConfig.RuleType.values().length];
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT_OR_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CapturePageConfig.RuleType.BARCODE_PDF417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CapturePageConfig.RuleType.PASSPORT_MRZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CapturePageConfig.RuleType.TEXT_EXTRACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
            int[] iArr2 = new int[CapturePageConfig.OverlayLocalIcon.values().length];
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.BARCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.CORNERS_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
            int[] iArr3 = new int[Id.IdLocalIcon.values().length];
            try {
                iArr3[Id.IdLocalIcon.WORLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Id.IdLocalIcon.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Id.IdLocalIcon.FLAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Id.IdLocalIcon.HOUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            c = iArr3;
            int[] iArr4 = new int[IdConfig.b.values().length];
            try {
                iArr4[IdConfig.b.v.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[IdConfig.b.w.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[IdConfig.b.z.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[IdConfig.b.y.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[IdConfig.b.A.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            d = iArr4;
        }
    }

    private static final IdConfig.AutoCaptureConfig a(IdConfig.b bVar) throws P9.m {
        int i = a.d[bVar.ordinal()];
        if (i == 1) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt.d(new AutoCaptureRule.FrontRule(false, 1, null))));
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt.d(new AutoCaptureRule.FrontOrBackRule(false, 1, null))));
            }
            if (i == 5) {
                return new IdConfig.AutoCaptureConfig(null, 1, null);
            }
            throw new P9.m();
        }
        return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt.d(new AutoCaptureRule.BarcodePdf417Rule(false, 1, null))));
    }

    private static final IdConfig.ManualCaptureConfig b(long j) {
        return new IdConfig.ManualCaptureConfig(true, j);
    }

    private static final Screen.Overlay c(bb.b bVar, IdConfig.b bVar2, String str) {
        if (bVar2 == IdConfig.b.z) {
            return Screen.Overlay.Barcode.d;
        }
        if (bVar2 == IdConfig.b.A) {
            return Screen.Overlay.Rectangle.d;
        }
        bb.b bVar3 = bb.b.i;
        if (bVar == bVar3 && bVar2 == IdConfig.b.w && Intrinsics.b(str, "US")) {
            return Screen.Overlay.Barcode.d;
        }
        if (bVar != bb.b.C && bVar != bb.b.L) {
            if (bVar != bVar3 && bVar != bb.b.v && bVar != bb.b.E) {
                return Screen.Overlay.Rectangle.d;
            }
            return Screen.Overlay.GenericFront.d;
        }
        return Screen.Overlay.Passport.d;
    }

    private static final boolean d(CapturePageConfig.RuleSet ruleSet) {
        boolean z;
        boolean z2;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            z = true;
            z2 = false;
            for (CapturePageConfig.Rule rule : rules) {
                if (Intrinsics.b(rule.isRequired(), Boolean.TRUE) && rule.getType() == null) {
                    z = false;
                } else if (rule.getType() != null) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
        }
        return z && z2;
    }

    private static final AutoCaptureRule e(CapturePageConfig.Rule rule) throws P9.m {
        CapturePageConfig.RuleType type = rule.getType();
        int i = type == null ? -1 : a.a[type.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return new AutoCaptureRule.FrontRule(Intrinsics.b(rule.isRequired(), Boolean.TRUE));
        }
        if (i == 2) {
            return new AutoCaptureRule.FrontOrBackRule(Intrinsics.b(rule.isRequired(), Boolean.TRUE));
        }
        if (i == 3) {
            return new AutoCaptureRule.BarcodePdf417Rule(Intrinsics.b(rule.isRequired(), Boolean.TRUE));
        }
        if (i == 4) {
            return new AutoCaptureRule.MrzRule(Intrinsics.b(rule.isRequired(), Boolean.TRUE));
        }
        if (i == 5) {
            return new AutoCaptureRule.TextExtractionRule(Intrinsics.b(rule.isRequired(), Boolean.TRUE));
        }
        throw new P9.m();
    }

    private static final AutoCaptureRuleSet f(CapturePageConfig.RuleSet ruleSet) throws P9.m {
        List listJ;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            listJ = new ArrayList();
            Iterator<T> it = rules.iterator();
            while (it.hasNext()) {
                AutoCaptureRule autoCaptureRuleE = e((CapturePageConfig.Rule) it.next());
                if (autoCaptureRuleE != null) {
                    listJ.add(autoCaptureRuleE);
                }
            }
        } else {
            listJ = CollectionsKt.j();
        }
        return new AutoCaptureRuleSet(listJ);
    }

    public static final IdConfig.AutoCaptureConfig g(@NotNull CapturePageConfig.AutoCaptureConfig autoCaptureConfig) {
        Object next;
        Intrinsics.checkNotNullParameter(autoCaptureConfig, "<this>");
        List<CapturePageConfig.RuleSet> ruleSets = autoCaptureConfig.getRuleSets();
        if (ruleSets == null) {
            return null;
        }
        if (ruleSets.isEmpty()) {
            return new IdConfig.AutoCaptureConfig(null, 1, null);
        }
        Iterator<T> it = ruleSets.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (d((CapturePageConfig.RuleSet) next)) {
                break;
            }
        }
        CapturePageConfig.RuleSet ruleSet = (CapturePageConfig.RuleSet) next;
        return ruleSet == null ? new IdConfig.AutoCaptureConfig(null, 1, null) : new IdConfig.AutoCaptureConfig(f(ruleSet));
    }

    public static final IdConfig.IdSideConfig h(CapturePageConfig capturePageConfig, @NotNull IdConfig.b bVar, @NotNull bb.b bVar2, @NotNull String str, long j) throws P9.m {
        IdConfig.AutoCaptureConfig autoCaptureConfigA;
        Screen.Overlay overlayC;
        CapturePageConfig.OverlayConfig overlay;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig;
        IdConfig.ManualCaptureConfig manualCaptureConfigI;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig;
        Intrinsics.checkNotNullParameter(bVar, "side");
        Intrinsics.checkNotNullParameter(bVar2, "type");
        Intrinsics.checkNotNullParameter(str, "countryCode");
        if (capturePageConfig == null || (autoCaptureConfig = capturePageConfig.getAutoCaptureConfig()) == null || (autoCaptureConfigA = g(autoCaptureConfig)) == null) {
            autoCaptureConfigA = a(bVar);
        }
        IdConfig.AutoCaptureConfig autoCaptureConfig2 = autoCaptureConfigA;
        IdConfig.ManualCaptureConfig manualCaptureConfigB = (capturePageConfig == null || (manualCaptureConfig = capturePageConfig.getManualCaptureConfig()) == null || (manualCaptureConfigI = i(manualCaptureConfig, j)) == null) ? b(j) : manualCaptureConfigI;
        if (autoCaptureConfig2.getRuleSet().a().isEmpty() && !manualCaptureConfigB.getIsEnabled()) {
            return null;
        }
        String key = bVar.getKey();
        if (capturePageConfig == null || (overlay = capturePageConfig.getOverlay()) == null || (overlayC = j(overlay)) == null) {
            overlayC = c(bVar2, bVar, str);
        }
        return new IdConfig.IdSideConfig(key, bVar, overlayC, autoCaptureConfig2, manualCaptureConfigB);
    }

    @NotNull
    public static final IdConfig.ManualCaptureConfig i(@NotNull CapturePageConfig.ManualCaptureConfig manualCaptureConfig, long j) {
        Intrinsics.checkNotNullParameter(manualCaptureConfig, "<this>");
        Boolean boolIsEnabled = manualCaptureConfig.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        Long delayMs = manualCaptureConfig.getDelayMs();
        if (delayMs != null) {
            j = delayMs.longValue();
        }
        return new IdConfig.ManualCaptureConfig(zBooleanValue, j);
    }

    private static final Screen.Overlay j(CapturePageConfig.OverlayConfig overlayConfig) throws P9.m {
        RemoteImage overlay = overlayConfig.getOverlay();
        if (overlay != null) {
            return new Screen.Overlay.Custom(new RemoteImageComponent(overlay));
        }
        CapturePageConfig.OverlayLocalIcon overlayFallback = overlayConfig.getOverlayFallback();
        switch (overlayFallback == null ? -1 : a.b[overlayFallback.ordinal()]) {
            case -1:
                return Screen.Overlay.Rectangle.d;
            case 0:
            default:
                throw new P9.m();
            case 1:
                return Screen.Overlay.Barcode.d;
            case 2:
                return Screen.Overlay.Passport.d;
            case 3:
                return Screen.Overlay.GenericFront.d;
            case 4:
                return Screen.Overlay.Barcode.d;
            case 5:
                return Screen.Overlay.CornersOnly.d;
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return Screen.Overlay.Rectangle.d;
        }
    }

    @NotNull
    public static final AutoClassificationConfig k(NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig, long j) {
        CapturePageConfig capturePageConfig;
        AutoClassificationConfig.Companion companion = AutoClassificationConfig.INSTANCE;
        IdConfig.IdSideConfig idSideConfigH = null;
        Boolean boolIsEnabled = autoClassificationConfig != null ? autoClassificationConfig.isEnabled() : null;
        Boolean extractTextFromImage = autoClassificationConfig != null ? autoClassificationConfig.getExtractTextFromImage() : null;
        if (autoClassificationConfig != null && (capturePageConfig = autoClassificationConfig.getCapturePageConfig()) != null) {
            idSideConfigH = h(capturePageConfig, IdConfig.b.v, bb.b.U, "", j);
        }
        return companion.b(boolIsEnabled, extractTextFromImage, idSideConfigH);
    }

    @NotNull
    public static final GovernmentIdDetails l(@NotNull ExtractedTexts extractedTexts) {
        Intrinsics.checkNotNullParameter(extractedTexts, "<this>");
        return new GovernmentIdDetails(extractedTexts.getDateOfBirth(), extractedTexts.getExpirationDate());
    }

    @NotNull
    public static final GovernmentIdDetails m(@NotNull AbstractC0618e abstractC0618e) throws P9.m {
        Intrinsics.checkNotNullParameter(abstractC0618e, "<this>");
        if (abstractC0618e instanceof AbstractC0618e.MrzBarcodeInfo) {
            AbstractC0618e.MrzBarcodeInfo mrzBarcodeInfo = (AbstractC0618e.MrzBarcodeInfo) abstractC0618e;
            return new GovernmentIdDetails(mrzBarcodeInfo.getBirthdate(), mrzBarcodeInfo.getExpirationDate());
        }
        if (!(abstractC0618e instanceof AbstractC0618e.Pdf417BarcodeInfo)) {
            throw new P9.m();
        }
        AbstractC0618e.Pdf417BarcodeInfo pdf417BarcodeInfo = (AbstractC0618e.Pdf417BarcodeInfo) abstractC0618e;
        AamvaExtraction aamvaExtractionB = pdf417BarcodeInfo.b();
        Date birthdate = aamvaExtractionB != null ? aamvaExtractionB.getBirthdate() : null;
        AamvaExtraction aamvaExtractionB2 = pdf417BarcodeInfo.b();
        return new GovernmentIdDetails(birthdate, aamvaExtractionB2 != null ? aamvaExtractionB2.getExpirationDate() : null);
    }

    private static final EnumC0820A n(Id.IdLocalIcon idLocalIcon) throws P9.m {
        int i = idLocalIcon == null ? -1 : a.c[idLocalIcon.ordinal()];
        if (i == -1) {
            return EnumC0820A.e;
        }
        if (i == 1) {
            return EnumC0820A.d;
        }
        if (i == 2) {
            return EnumC0820A.e;
        }
        if (i == 3) {
            return EnumC0820A.i;
        }
        if (i == 4) {
            return EnumC0820A.v;
        }
        throw new P9.m();
    }

    public static final IdConfig o(@NotNull Id id, @NotNull String str, long j) throws P9.m {
        EnumC0820A enumC0820AF;
        IdConfig.IdSideConfig idSideConfigH;
        Intrinsics.checkNotNullParameter(id, "<this>");
        Intrinsics.checkNotNullParameter(str, "countryCode");
        bb.b bVarA = bb.b.INSTANCE.a(id.getClass());
        if (bVarA == bb.b.U && !id.isDynamicGovId()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CapturePageConfig> capturePageConfigs = id.getCapturePageConfigs();
        if (capturePageConfigs != null) {
            for (CapturePageConfig capturePageConfig : capturePageConfigs) {
                String side = capturePageConfig.getSide();
                if (side != null) {
                    linkedHashMap.put(side, capturePageConfig);
                }
            }
        }
        List<String> requiresSides = id.getRequiresSides();
        ArrayList arrayList = new ArrayList(CollectionsKt.t(requiresSides, 10));
        for (String str2 : requiresSides) {
            IdConfig.b bVarA2 = IdConfig.b.INSTANCE.a(str2);
            if (bVarA2 == null || (idSideConfigH = h((CapturePageConfig) linkedHashMap.get(str2), bVarA2, bVarA, str, j)) == null) {
                return null;
            }
            arrayList.add(idSideConfigH);
        }
        String str3 = id.getClass();
        if (id.isDynamicGovId()) {
            Id.IdIcon icon = id.getIcon();
            enumC0820AF = n(icon != null ? icon.getIconFallback() : null);
        } else {
            enumC0820AF = bVarA.f();
        }
        EnumC0820A enumC0820A = enumC0820AF;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.t(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new IdPart.SideIdPart(((IdConfig.IdSideConfig) it.next()).getSide()));
        }
        return new IdConfig(str3, enumC0820A, arrayList, arrayList2, bVarA);
    }
}
