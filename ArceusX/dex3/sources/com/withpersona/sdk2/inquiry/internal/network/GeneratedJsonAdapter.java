package com.withpersona.sdk2.inquiry.internal.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import kotlin.Metadata;
import kotlin.collections.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest_DataJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "Lcom/squareup/moshi/w;", "moshi", "<init>", "(Lcom/squareup/moshi/w;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/m;", "reader", "a", "(Lcom/squareup/moshi/m;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "Lcom/squareup/moshi/t;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/t;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;)V", "Lcom/squareup/moshi/m$b;", "Lcom/squareup/moshi/m$b;", "options", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "Lcom/squareup/moshi/h;", "attributesAdapter", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<UpdateInquirySessionRequest.Data> {

    @NotNull
    private final m.b options;

    @NotNull
    private final h<UpdateInquirySessionRequest.Attributes> attributesAdapter;

    public GeneratedJsonAdapter(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "moshi");
        m.b bVarA = m.b.a(new String[]{"attributes"});
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<UpdateInquirySessionRequest.Attributes> hVarF = wVar.f(UpdateInquirySessionRequest.Attributes.class, L.d(), "attributes");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.attributesAdapter = hVarF;
    }

    @NotNull
    public UpdateInquirySessionRequest.Data fromJson(@NotNull m reader) throws j {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.e();
        UpdateInquirySessionRequest.Attributes attributes = null;
        while (reader.u()) {
            int iP0 = reader.P0(this.options);
            if (iP0 == -1) {
                reader.b1();
                reader.f1();
            } else if (iP0 == 0 && (attributes = (UpdateInquirySessionRequest.Attributes) this.attributesAdapter.fromJson(reader)) == null) {
                j jVarX = c8.c.x("attributes", "attributes", reader);
                Intrinsics.checkNotNullExpressionValue(jVarX, "unexpectedNull(...)");
                throw jVarX;
            }
        }
        reader.j();
        if (attributes != null) {
            return new UpdateInquirySessionRequest.Data(attributes);
        }
        j jVarO = c8.c.o("attributes", "attributes", reader);
        Intrinsics.checkNotNullExpressionValue(jVarO, "missingProperty(...)");
        throw jVarO;
    }

    public void toJson(@NotNull t writer, UpdateInquirySessionRequest.Data value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.Z("attributes");
        this.attributesAdapter.toJson(writer, value_.getAttributes());
        writer.y();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UpdateInquirySessionRequest.Data");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
