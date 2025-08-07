package J8;

import P9.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.internal.InquiryField;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.p;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aM\u0010&\u001a\u00020%*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020!\u0018\u00010 2\b\b\u0002\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'\u001a-\u0010*\u001a\u00020%*\u00020(2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b*\u0010+\u001a#\u0010-\u001a\u00020%*\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0004\b-\u0010.\u001a#\u00100\u001a\u00020%*\u00020/2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0004\b0\u00101\u001aC\u00103\u001a\u00020%*\u0002022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0000¢\u0006\u0004\b3\u00104\u001a%\u00106\u001a\u00020%*\u0002052\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b6\u00107\u001a\u001b\u0010:\u001a\u000209*\n\u0012\u0004\u0012\u000208\u0018\u00010\u0001H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010=\u001a\u00020<*\u000208H\u0002¢\u0006\u0004\b=\u0010>\u001a\u0015\u0010@\u001a\u0004\u0018\u00010?*\u00020\u001cH\u0002¢\u0006\u0004\b@\u0010A\"0\u0010G\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001c0C\u0012\u0004\u0012\u00020\u001c0 *\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\"0\u0010I\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001c0C\u0012\u0004\u0012\u00020\u001c0 *\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F\"0\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001c0C\u0012\u0004\u0012\u00020\u001c0 *\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\"$\u0010G\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001c0 *\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\"$\u0010I\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001c0 *\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010P¨\u0006R"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "", "centerOnly", "Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Z)Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;)Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;)Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;)Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "", "sessionToken", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "s", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "selectedCountryCode", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "r", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "p", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "u", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "t", "(Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "v", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;)Ljava/util/Map;", "titleBySide", "a", "descriptionBySide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;)Ljava/util/Map;", "scanInstructionsBySide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;)Ljava/util/Map;", "b", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {
    private static final Map<Pair<IdConfig.b, String>, String> a(NextStep.GovernmentId.RequestPage requestPage) {
        return F.k(new Pair[]{t.a(new Pair(IdConfig.b.v, "descriptionFront"), requestPage.getDescriptionFront()), t.a(new Pair(IdConfig.b.w, "descriptionBack"), requestPage.getDescriptionBack()), t.a(new Pair(IdConfig.b.z, "descriptionPdf417"), requestPage.getDescriptionPdf417()), t.a(new Pair(IdConfig.b.A, "descriptionPassportSignature"), requestPage.getDescriptionPassportSignature())});
    }

    private static final Map<IdConfig.b, String> b(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return F.k(new Pair[]{t.a(IdConfig.b.v, reviewUploadPage.getDescriptionFront()), t.a(IdConfig.b.w, reviewUploadPage.getDescriptionBack()), t.a(IdConfig.b.z, reviewUploadPage.getDescriptionPdf417()), t.a(IdConfig.b.A, reviewUploadPage.getDescriptionPassportSignature())});
    }

    private static final Map<Pair<IdConfig.b, String>, String> c(NextStep.GovernmentId.CapturePage capturePage) {
        return F.k(new Pair[]{t.a(new Pair(IdConfig.b.v, "scanFront"), capturePage.getScanFront()), t.a(new Pair(IdConfig.b.w, "scanBack"), capturePage.getScanBack()), t.a(new Pair(IdConfig.b.z, "scanPdf417"), capturePage.getScanPdf417()), t.a(new Pair(IdConfig.b.A, "scanSignature"), capturePage.getScanSignature()), t.a(new Pair(IdConfig.b.y, "scanFrontOrBack"), capturePage.getScanFrontOrBack())});
    }

    private static final Map<Pair<IdConfig.b, String>, String> d(NextStep.GovernmentId.RequestPage requestPage) {
        return F.k(new Pair[]{t.a(new Pair(IdConfig.b.v, "titleFront"), requestPage.getTitleFront()), t.a(new Pair(IdConfig.b.w, "titleBack"), requestPage.getTitleBack()), t.a(new Pair(IdConfig.b.z, "titlePdf417"), requestPage.getTitlePdf417()), t.a(new Pair(IdConfig.b.A, "titlePassportSignature"), requestPage.getTitlePassportSignature())});
    }

    private static final Map<IdConfig.b, String> e(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return F.k(new Pair[]{t.a(IdConfig.b.v, reviewUploadPage.getTitleFront()), t.a(IdConfig.b.w, reviewUploadPage.getTitleBack()), t.a(IdConfig.b.z, reviewUploadPage.getTitlePdf417()), t.a(IdConfig.b.A, reviewUploadPage.getTitlePassportSignature())});
    }

    @NotNull
    public static final DocumentPages f(NextStep.Document.Pages pages, @NotNull NextStep.Document.Localizations localizations) {
        DocumentStartPage documentStartPageA;
        UploadOptionsDialog uploadOptionsDialogA;
        NextStep.Document.Pages.DocumentPages document;
        NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog;
        NextStep.Document.Pages.DocumentPages document2;
        NextStep.Document.Pages.DocumentStartPage prompt;
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        if (pages == null || (document2 = pages.getDocument()) == null || (prompt = document2.getPrompt()) == null || (documentStartPageA = g(prompt)) == null) {
            documentStartPageA = DocumentStartPage.INSTANCE.a(localizations.getPromptPage().getTitle(), localizations.getPromptPage().getPrompt(), localizations.getPromptPage().getBtnUpload(), localizations.getPromptPage().getBtnCapture());
        }
        if (pages == null || (document = pages.getDocument()) == null || (uploadOptionsDialog = document.getUploadOptionsDialog()) == null || (uploadOptionsDialogA = h(uploadOptionsDialog)) == null) {
            uploadOptionsDialogA = UploadOptionsDialog.INSTANCE.a(localizations.getPromptPage().getCaptureOptionsDialogTitle(), localizations.getPromptPage().getBtnCapture(), localizations.getPromptPage().getBtnUpload());
        }
        return new DocumentPages(documentStartPageA, uploadOptionsDialogA);
    }

    private static final DocumentStartPage g(NextStep.Document.Pages.DocumentStartPage documentStartPage) {
        List<UiComponentConfig> components = documentStartPage.getUiStep().getConfig().getComponents();
        List<UiComponent> listE = components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.b.e(components) : null;
        StepStyles.UiStepStyle styles = documentStartPage.getUiStep().getStyles();
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping = documentStartPage.getComponentNameMapping();
        String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping2 = documentStartPage.getComponentNameMapping();
        String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping3 = documentStartPage.getComponentNameMapping();
        String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping4 = documentStartPage.getComponentNameMapping();
        return new DocumentStartPage(listE, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonUploadOptions() : null);
    }

    private static final UploadOptionsDialog h(NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog) {
        List<UiComponentConfig> components = uploadOptionsDialog.getUiStep().getConfig().getComponents();
        List<UiComponent> listE = components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.b.e(components) : null;
        StepStyles.UiStepStyle styles = uploadOptionsDialog.getUiStep().getStyles();
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping = uploadOptionsDialog.getComponentNameMapping();
        String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping2 = uploadOptionsDialog.getComponentNameMapping();
        String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping3 = uploadOptionsDialog.getComponentNameMapping();
        String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping4 = uploadOptionsDialog.getComponentNameMapping();
        return new UploadOptionsDialog(listE, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonCancel() : null);
    }

    @NotNull
    public static final o.C0520a.C0112a i(@NotNull NextStep.GovernmentId.Localizations localizations, List<NextStep.GovernmentId.LocalizationOverride> list) {
        Intrinsics.checkNotNullParameter(localizations, "<this>");
        String title = localizations.getSelectPage().getTitle();
        String prompt = localizations.getSelectPage().getPrompt();
        String choose = localizations.getSelectPage().getChoose();
        String disclaimer = localizations.getSelectPage().getDisclaimer();
        if (disclaimer == null) {
            disclaimer = "";
        }
        Map<String, String> mapK = k(list, localizations.getCapturePage().getTitle(), Title.type, "capturePage");
        Map<String, String> mapM = m(list, "capturePage", c(localizations.getCapturePage()));
        String capturing = localizations.getCapturePage().getCapturing();
        Map<String, String> mapK2 = k(list, localizations.getCapturePage().getConfirmCapture(), "confirmCapture", "capturePage");
        String disclaimer2 = localizations.getCapturePage().getDisclaimer();
        if (disclaimer2 == null) {
            disclaimer2 = "";
        }
        String buttonSubmit = localizations.getCheckPage().getButtonSubmit();
        String buttonRetake = localizations.getCheckPage().getButtonRetake();
        Map<String, String> mapK3 = k(list, localizations.getCheckPage().getTitleConfirmCapture(), "titleConfirmCapture", "requestPage");
        String title2 = localizations.getPendingPage().getTitle();
        String description = localizations.getPendingPage().getDescription();
        Map<String, String> mapL = l(list, "selectPage", localizations.getSelectPage().getIdClassToName());
        Map<String, String> mapM2 = m(list, "requestPage", d(localizations.getRequestPage()));
        Map<String, String> mapM3 = m(list, "requestPage", a(localizations.getRequestPage()));
        String liveUploadButtonText = localizations.getRequestPage().getLiveUploadButtonText();
        String choosePhotoButtonText = localizations.getRequestPage().getChoosePhotoButtonText();
        Map<IdConfig.b, String> mapE = e(localizations.getReviewUploadPage());
        Map<IdConfig.b, String> mapB = b(localizations.getReviewUploadPage());
        String confirmButtonText = localizations.getReviewUploadPage().getConfirmButtonText();
        String chooseAnotherButtonText = localizations.getReviewUploadPage().getChooseAnotherButtonText();
        String cameraPermissionsTitle = localizations.getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = localizations.getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = localizations.getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = localizations.getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = localizations.getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = localizations.getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = localizations.getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = localizations.getPromptPage().getMicrophonePermissionsBtnCancel();
        String hintHoldStill = localizations.getCapturePage().getHintHoldStill();
        String hintLowLight = localizations.getCapturePage().getHintLowLight();
        String btnHelp = localizations.getCapturePage().getBtnHelp();
        String barcodeHelpModalTitle = localizations.getCapturePage().getBarcodeHelpModalTitle();
        String barcodeHelpModalPrompt = localizations.getCapturePage().getBarcodeHelpModalPrompt();
        String barcodeHelpModalHints = localizations.getCapturePage().getBarcodeHelpModalHints();
        String barcodeHelpModalContinueBtn = localizations.getCapturePage().getBarcodeHelpModalContinueBtn();
        String idFrontHelpModalTitle = localizations.getCapturePage().getIdFrontHelpModalTitle();
        String idFrontHelpModalPrompt = localizations.getCapturePage().getIdFrontHelpModalPrompt();
        String idFrontHelpModalHintsMobile = localizations.getCapturePage().getIdFrontHelpModalHintsMobile();
        String idFrontHelpModalContinueBtn = localizations.getCapturePage().getIdFrontHelpModalContinueBtn();
        String idBackHelpModalTitle = localizations.getCapturePage().getIdBackHelpModalTitle();
        String idBackHelpModalPrompt = localizations.getCapturePage().getIdBackHelpModalPrompt();
        String idBackHelpModalHintsMobile = localizations.getCapturePage().getIdBackHelpModalHintsMobile();
        String idBackHelpModalContinueBtn = localizations.getCapturePage().getIdBackHelpModalContinueBtn();
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = localizations.getAutoClassificationPage();
        String unableToClassifyDocumentTitle = autoClassificationPage != null ? autoClassificationPage.getUnableToClassifyDocumentTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage2 = localizations.getAutoClassificationPage();
        String unableToClassifyDocumentContinueButtonText = autoClassificationPage2 != null ? autoClassificationPage2.getUnableToClassifyDocumentContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage3 = localizations.getAutoClassificationPage();
        String idClassRejectedTitle = autoClassificationPage3 != null ? autoClassificationPage3.getIdClassRejectedTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage4 = localizations.getAutoClassificationPage();
        String idClassRejectedContinueButtonText = autoClassificationPage4 != null ? autoClassificationPage4.getIdClassRejectedContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage5 = localizations.getAutoClassificationPage();
        String countryInputTitle = autoClassificationPage5 != null ? autoClassificationPage5.getCountryInputTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage6 = localizations.getAutoClassificationPage();
        String idClassInputTitle = autoClassificationPage6 != null ? autoClassificationPage6.getIdClassInputTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage7 = localizations.getAutoClassificationPage();
        String manualClassificationTitle = autoClassificationPage7 != null ? autoClassificationPage7.getManualClassificationTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage8 = localizations.getAutoClassificationPage();
        String manualClassificationContinueButtonText = autoClassificationPage8 != null ? autoClassificationPage8.getManualClassificationContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage9 = localizations.getAutoClassificationPage();
        return new o.C0520a.C0112a(title, prompt, choose, disclaimer, mapK, mapM, capturing, mapK2, disclaimer2, buttonSubmit, buttonRetake, mapK3, title2, description, mapL, mapM2, mapM3, liveUploadButtonText, choosePhotoButtonText, mapE, mapB, confirmButtonText, chooseAnotherButtonText, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, hintHoldStill, hintLowLight, btnHelp, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueBtn, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHintsMobile, idFrontHelpModalContinueBtn, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHintsMobile, idBackHelpModalContinueBtn, unableToClassifyDocumentTitle, unableToClassifyDocumentContinueButtonText, idClassRejectedTitle, idClassRejectedContinueButtonText, countryInputTitle, idClassInputTitle, manualClassificationTitle, manualClassificationContinueButtonText, autoClassificationPage9 != null ? autoClassificationPage9.getAutoClassificationCaptureTipText() : null);
    }

    @NotNull
    public static final p.Input.Strings j(@NotNull NextStep.Selfie.Localizations localizations, boolean z) {
        Intrinsics.checkNotNullParameter(localizations, "<this>");
        String title = localizations.getPromptPage().getTitle();
        String promptCenter = z ? localizations.getPromptPage().getPromptCenter() : localizations.getPromptPage().getPrompt();
        String disclosure = localizations.getPromptPage().getDisclosure();
        String buttonSubmit = localizations.getPromptPage().getButtonSubmit();
        String title2 = localizations.getCapturePage().getTitle();
        if (title2 == null) {
            title2 = "";
        }
        String str = title2;
        String selfieHintTakePhoto = localizations.getCapturePage().getSelfieHintTakePhoto();
        String selfieHintCenterFace = localizations.getCapturePage().getSelfieHintCenterFace();
        String selfieHintFaceTooClose = localizations.getCapturePage().getSelfieHintFaceTooClose();
        String selfieHintFaceTooFar = localizations.getCapturePage().getSelfieHintFaceTooFar();
        String selfieHintFaceIncomplete = localizations.getCapturePage().getSelfieHintFaceIncomplete();
        String selfieHintMultipleFaces = localizations.getCapturePage().getSelfieHintMultipleFaces();
        String selfieHintPoseNotCenter = localizations.getCapturePage().getSelfieHintPoseNotCenter();
        String selfieHintLookLeft = localizations.getCapturePage().getSelfieHintLookLeft();
        String selfieHintLookRight = localizations.getCapturePage().getSelfieHintLookRight();
        String selfieHintHoldStill = localizations.getCapturePage().getSelfieHintHoldStill();
        String title3 = localizations.getPendingPage().getTitle();
        String description = localizations.getPendingPage().getDescription();
        NextStep.Selfie.CheckPage checkPage = localizations.getCheckPage();
        String title4 = checkPage != null ? checkPage.getTitle() : null;
        NextStep.Selfie.CheckPage checkPage2 = localizations.getCheckPage();
        String description2 = checkPage2 != null ? checkPage2.getDescription() : null;
        NextStep.Selfie.CheckPage checkPage3 = localizations.getCheckPage();
        String selfieLabelFront = checkPage3 != null ? checkPage3.getSelfieLabelFront() : null;
        NextStep.Selfie.CheckPage checkPage4 = localizations.getCheckPage();
        String selfieLabelLeft = checkPage4 != null ? checkPage4.getSelfieLabelLeft() : null;
        NextStep.Selfie.CheckPage checkPage5 = localizations.getCheckPage();
        String selfieLabelRight = checkPage5 != null ? checkPage5.getSelfieLabelRight() : null;
        NextStep.Selfie.CheckPage checkPage6 = localizations.getCheckPage();
        String btnSubmit = checkPage6 != null ? checkPage6.getBtnSubmit() : null;
        NextStep.Selfie.CheckPage checkPage7 = localizations.getCheckPage();
        return new p.Input.Strings(title, promptCenter, disclosure, buttonSubmit, str, selfieHintTakePhoto, selfieHintCenterFace, selfieHintFaceTooClose, selfieHintFaceTooFar, selfieHintMultipleFaces, selfieHintFaceIncomplete, selfieHintPoseNotCenter, selfieHintLookLeft, selfieHintLookRight, selfieHintHoldStill, title3, description, title4, description2, selfieLabelFront, selfieLabelLeft, selfieLabelRight, btnSubmit, checkPage7 != null ? checkPage7.getBtnRetake() : null);
    }

    private static final Map<String, String> k(List<NextStep.GovernmentId.LocalizationOverride> list, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        return m(list, str3, F.k(new Pair[]{t.a(new Pair(IdConfig.b.v, str2), str), t.a(new Pair(IdConfig.b.w, str2), str), t.a(new Pair(IdConfig.b.z, str2), str), t.a(new Pair(IdConfig.b.A, str2), str), t.a(new Pair(IdConfig.b.y, str2), str)}));
    }

    private static final Map<String, String> l(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<String, String> map) {
        ArrayList arrayList;
        Object next;
        String text;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.b(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) next;
                    if (Intrinsics.b(localizationOverride.getIdClass(), str2) || localizationOverride.getIdClass() == null) {
                        if (Intrinsics.b(localizationOverride.getKey(), str2)) {
                            break;
                        }
                    }
                }
                NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) next;
                if (localizationOverride2 != null && (text = localizationOverride2.getText()) != null) {
                    str3 = text;
                }
            }
            linkedHashMap.put(key, str3);
        }
        return linkedHashMap;
    }

    private static final Map<String, String> m(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<Pair<IdConfig.b, String>, String> map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object next;
        String text;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.b(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Pair<IdConfig.b, String>, String> entry : map.entrySet()) {
            Pair<IdConfig.b, String> key = entry.getKey();
            String value = entry.getValue();
            IdConfig.b bVar = (IdConfig.b) key.c();
            String str2 = (String) key.d();
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj2;
                    if (Intrinsics.b(localizationOverride.getSide(), bVar.getKey()) || localizationOverride.getSide() == null) {
                        if (Intrinsics.b(localizationOverride.getKey(), str2)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            } else {
                arrayList2 = null;
            }
            String strF = bVar.getKey();
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((NextStep.GovernmentId.LocalizationOverride) next).getIdClass() == null) {
                        break;
                    }
                }
                NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) next;
                if (localizationOverride2 != null && (text = localizationOverride2.getText()) != null) {
                    value = text;
                }
            }
            linkedHashMap.put(strF, value);
            if (arrayList2 != null) {
                ArrayList<NextStep.GovernmentId.LocalizationOverride> arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((NextStep.GovernmentId.LocalizationOverride) obj3).getIdClass() != null) {
                        arrayList3.add(obj3);
                    }
                }
                for (NextStep.GovernmentId.LocalizationOverride localizationOverride3 : arrayList3) {
                    String str3 = bVar.getKey() + "-" + localizationOverride3.getIdClass();
                    if (linkedHashMap.get(str3) == null) {
                        linkedHashMap.put(str3, localizationOverride3.getText());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final InquiryState n(@NotNull CheckInquiryResponse checkInquiryResponse, @NotNull String str, @NotNull InquirySessionConfig inquirySessionConfig) throws P9.m {
        Intrinsics.checkNotNullParameter(checkInquiryResponse, "<this>");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String id = checkInquiryResponse.getData().getId();
        NextStep nextStep = checkInquiryResponse.getData().getAttributes().getNextStep();
        if (nextStep instanceof NextStep.Ui) {
            return s((NextStep.Ui) nextStep, str, id, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields(), inquirySessionConfig);
        }
        if (nextStep instanceof NextStep.GovernmentId) {
            return q((NextStep.GovernmentId) nextStep, str, id, checkInquiryResponse.getData().getAttributes().getSelectedCountryCode());
        }
        if (nextStep instanceof NextStep.Selfie) {
            return r((NextStep.Selfie) nextStep, str, id);
        }
        if (nextStep instanceof NextStep.Document) {
            return p((NextStep.Document) nextStep, str, id);
        }
        if (nextStep instanceof NextStep.Complete) {
            return o((NextStep.Complete) nextStep, str, id, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields());
        }
        if (!Intrinsics.b(nextStep, NextStep.Unknown.INSTANCE)) {
            throw new P9.m();
        }
        throw new IllegalArgumentException("Unknown type for step " + nextStep.getName());
    }

    @NotNull
    public static final InquiryState o(@NotNull NextStep.Complete complete, @NotNull String str, @NotNull String str2, String str3, Map<String, ? extends InquiryField> map) {
        Intrinsics.checkNotNullParameter(complete, "<this>");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        if (map == null) {
            map = F.h();
        }
        return new InquiryState.Complete(str2, str, null, str4, map, 4, null);
    }

    @NotNull
    public static final InquiryState p(@NotNull NextStep.Document document, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(document, "<this>");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        return new InquiryState.DocumentStepRunning(str2, str, null, document.getStyles(), document.getConfig().getLocalizations().getCancelDialog(), document, document.getName(), f(document.getConfig().getPages(), document.getConfig().getLocalizations()), document.getConfig().getAssets(), document.getName(), 4, null);
    }

    @NotNull
    public static final InquiryState q(@NotNull NextStep.GovernmentId governmentId, @NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(governmentId, "<this>");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Long nativeMobileCameraManualCaptureDelayMs = governmentId.getConfig().getNativeMobileCameraManualCaptureDelayMs();
        long jLongValue = nativeMobileCameraManualCaptureDelayMs != null ? nativeMobileCameraManualCaptureDelayMs.longValue() : 8000L;
        List<Id> idclasses = governmentId.getConfig().getIdclasses();
        if (idclasses == null) {
            idclasses = CollectionsKt.j();
        }
        List<Id> list = idclasses;
        String str4 = str3 == null ? "US" : str3;
        String name = governmentId.getName();
        String name2 = governmentId.getName();
        Boolean backStepEnabled = governmentId.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = governmentId.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        NextStep.GovernmentId.Localizations localizations = governmentId.getConfig().getLocalizations();
        List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides = governmentId.getConfig().getLocalizationOverrides();
        List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile = governmentId.getConfig().getEnabledCaptureOptionsNativeMobile();
        if (enabledCaptureOptionsNativeMobile == null) {
            enabledCaptureOptionsNativeMobile = CollectionsKt.d(CaptureOptionNativeMobile.MOBILE_CAMERA);
        }
        List<CaptureOptionNativeMobile> list2 = enabledCaptureOptionsNativeMobile;
        StepStyles.GovernmentIdStepStyle styles = governmentId.getStyles();
        Integer imageCaptureCount = governmentId.getConfig().getImageCaptureCount();
        int iIntValue = imageCaptureCount != null ? imageCaptureCount.intValue() : 3;
        String fieldKeyDocument = governmentId.getConfig().getFieldKeyDocument();
        String fieldKeyIdclass = governmentId.getConfig().getFieldKeyIdclass();
        NextStep.CancelDialog cancelDialog = governmentId.getConfig().getLocalizations().getCancelDialog();
        Boolean shouldSkipReviewScreen = governmentId.getConfig().getShouldSkipReviewScreen();
        boolean zBooleanValue3 = shouldSkipReviewScreen != null ? shouldSkipReviewScreen.booleanValue() : false;
        List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes = governmentId.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = CollectionsKt.j();
        }
        List<NextStep.GovernmentId.CaptureFileType> list3 = enabledCaptureFileTypes;
        List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods = governmentId.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = CollectionsKt.j();
        }
        List<NextStep.GovernmentId.VideoCaptureMethod> list4 = videoCaptureMethods;
        String videoSessionJwt = governmentId.getConfig().getVideoSessionJwt();
        NextStep.GovernmentId.AssetConfig assets = governmentId.getConfig().getAssets();
        AutoClassificationConfig autoClassificationConfigK = com.withpersona.sdk2.inquiry.governmentid.d.k(governmentId.getConfig().getAutoClassificationConfig(), jLongValue);
        StyleElements.Axis reviewCaptureButtonsAxis = governmentId.getConfig().getReviewCaptureButtonsAxis();
        if (reviewCaptureButtonsAxis == null) {
            reviewCaptureButtonsAxis = StyleElements.Axis.HORIZONTAL;
        }
        StyleElements.Axis axis = reviewCaptureButtonsAxis;
        PendingPageTextPosition pendingPageTextVerticalPosition = governmentId.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = governmentId.getConfig().getAudioEnabled();
        return new InquiryState.GovernmentIdStepRunning(str2, str, null, styles, cancelDialog, str4, list, name, name2, zBooleanValue, zBooleanValue2, localizations, localizationOverrides, list2, iIntValue, jLongValue, fieldKeyDocument, fieldKeyIdclass, zBooleanValue3, list3, list4, videoSessionJwt, assets, autoClassificationConfigK, axis, pendingPageTextPosition, audioEnabled != null ? audioEnabled.booleanValue() : true, null, 4, null);
    }

    @NotNull
    public static final InquiryState r(@NotNull NextStep.Selfie selfie, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(selfie, "<this>");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        NextStep.Selfie.CaptureMethod selfieType = selfie.getConfig().getSelfieType();
        String name = selfie.getName();
        String name2 = selfie.getName();
        Boolean backStepEnabled = selfie.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = selfie.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String fieldKeySelfie = selfie.getConfig().getFieldKeySelfie();
        boolean requireStrictSelfieCapture = selfie.getConfig().getRequireStrictSelfieCapture();
        Boolean skipPromptPage = selfie.getConfig().getSkipPromptPage();
        boolean zBooleanValue3 = skipPromptPage != null ? skipPromptPage.booleanValue() : false;
        NextStep.Selfie.Localizations localizations = selfie.getConfig().getLocalizations();
        StepStyles.SelfieStepStyle styles = selfie.getStyles();
        NextStep.CancelDialog cancelDialog = selfie.getConfig().getLocalizations().getCancelDialog();
        List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes = selfie.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = CollectionsKt.j();
        }
        List<NextStep.Selfie.CaptureFileType> list = enabledCaptureFileTypes;
        List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods = selfie.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = CollectionsKt.j();
        }
        List<NextStep.Selfie.VideoCaptureMethod> list2 = videoCaptureMethods;
        NextStep.Selfie.AssetConfig assets = selfie.getConfig().getAssets();
        String videoSessionJwt = selfie.getConfig().getVideoSessionJwt();
        List<NextStep.Selfie.SelfiePose> orderedPoses = selfie.getConfig().getOrderedPoses();
        PendingPageTextPosition pendingPageTextVerticalPosition = selfie.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = selfie.getConfig().getAudioEnabled();
        return new InquiryState.SelfieStepRunning(str2, str, null, styles, cancelDialog, selfieType, name, name2, zBooleanValue, zBooleanValue2, fieldKeySelfie, requireStrictSelfieCapture, zBooleanValue3, localizations, list, list2, assets, videoSessionJwt, orderedPoses, pendingPageTextPosition, audioEnabled != null ? audioEnabled.booleanValue() : true, u(selfie.getConfig().getPoseConfigs()), 4, null);
    }

    @NotNull
    public static final InquiryState s(@NotNull NextStep.Ui ui, @NotNull String str, @NotNull String str2, String str3, Map<String, ? extends InquiryField> map, @NotNull InquirySessionConfig inquirySessionConfig) {
        Intrinsics.checkNotNullParameter(ui, "<this>");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String str4 = str3 == null ? "" : str3;
        String name = ui.getName();
        List<UiComponentConfig> components = ui.getConfig().getComponents();
        if (components == null) {
            components = CollectionsKt.j();
        }
        List<UiComponentConfig> list = components;
        Boolean backStepEnabled = ui.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = ui.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        Boolean terminal = ui.getConfig().getTerminal();
        boolean zBooleanValue3 = terminal != null ? terminal.booleanValue() : false;
        Map<String, ? extends InquiryField> mapH = map == null ? F.h() : map;
        StepStyles.UiStepStyle styles = ui.getStyles();
        String string = UUID.randomUUID().toString();
        NextStep.Ui.Localizations localizations = ui.getConfig().getLocalizations();
        NextStep.CancelDialog cancelDialog = localizations != null ? localizations.getCancelDialog() : null;
        NextStep.Ui.Localizations localizations2 = ui.getConfig().getLocalizations();
        List<UiComponentError> serverComponentErrors = ui.getConfig().getServerComponentErrors();
        Intrinsics.d(string);
        return new InquiryState.UiStepRunning(str2, str, null, styles, cancelDialog, localizations2, str4, name, list, zBooleanValue, zBooleanValue2, zBooleanValue3, mapH, string, serverComponentErrors, null, inquirySessionConfig, 32772, null);
    }

    private static final PoseConfig t(com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig poseConfig) {
        PoseConfig poseConfigA = PoseConfig.INSTANCE.a();
        Boolean allowReview = poseConfig.getAllowReview();
        boolean zBooleanValue = allowReview != null ? allowReview.booleanValue() : poseConfigA.getAllowReview();
        Boolean manualCaptureEnabled = poseConfig.getManualCaptureEnabled();
        boolean zBooleanValue2 = manualCaptureEnabled != null ? manualCaptureEnabled.booleanValue() : poseConfigA.getManualCaptureEnabled();
        Long manualCaptureDelayMs = poseConfig.getManualCaptureDelayMs();
        long jLongValue = manualCaptureDelayMs != null ? manualCaptureDelayMs.longValue() : poseConfigA.getManualCaptureDelayMs();
        Boolean autoCaptureEnabled = poseConfig.getAutoCaptureEnabled();
        return new PoseConfig(zBooleanValue, zBooleanValue2, jLongValue, autoCaptureEnabled != null ? autoCaptureEnabled.booleanValue() : poseConfigA.getAutoCaptureEnabled());
    }

    private static final PoseConfigs u(List<com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig> list) {
        Selfie.b bVarV;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list == null) {
            list = CollectionsKt.j();
        }
        for (com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig poseConfig : list) {
            String pose = poseConfig.getPose();
            if (pose != null && (bVarV = v(pose)) != null) {
                linkedHashMap.put(bVarV, t(poseConfig));
            }
        }
        return new PoseConfigs(linkedHashMap);
    }

    private static final Selfie.b v(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1364013995) {
            if (iHashCode != 3317767) {
                if (iHashCode == 108511772 && str.equals("right")) {
                    return Selfie.b.i;
                }
            } else if (str.equals("left")) {
                return Selfie.b.e;
            }
        } else if (str.equals("center")) {
            return Selfie.b.d;
        }
        return null;
    }
}
