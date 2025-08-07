package com.withpersona.sdk2.inquiry.document;

import P9.m;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "c", "(Ljava/util/List;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "Landroid/content/Context;", "context", "d", "(Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;Landroid/content/Context;)Ljava/lang/String;", "document_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f {
    public static final List<DocumentFile> c(List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new DocumentFile.Local((String) it.next(), CaptureMethod.e, 0, 4, null));
        }
        return arrayList;
    }

    public static final String d(GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse, Context context) throws m {
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) {
            GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError disabledFileTypeError = (GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) documentErrorResponse;
            String string = context.getString(S8.e.d, disabledFileTypeError.getDetails().getUploadedFileType(), CollectionsKt.U(disabledFileTypeError.getDetails().getEnabledFileTypes(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError) {
            String string2 = context.getString(S8.e.e);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) {
            String string3 = context.getString(S8.e.i, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) documentErrorResponse).getDetails().getPageLimit()));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError) {
            String string4 = context.getString(S8.e.g);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError) {
            String string5 = context.getString(S8.e.g);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError) {
            String string6 = context.getString(S8.e.h);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            String string7 = context.getString(S8.e.f, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) documentErrorResponse).getDetails().getMinDimensionSize()));
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return string7;
        }
        if (!(documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)) {
            throw new m();
        }
        String string8 = context.getString(S8.e.j);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        return string8;
    }
}
