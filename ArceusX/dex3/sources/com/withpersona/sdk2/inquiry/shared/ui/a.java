package com.withpersona.sdk2.inquiry.shared.ui;

import c2.c;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/a;", "Lc2/c;", "", "Lc2/b;", "frameInfo", "d", "(Lc2/b;)Ljava/lang/Integer;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a extends c<Integer> {
    final ThemeableLottieAnimationView d;

    a(ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.d = themeableLottieAnimationView;
    }

    @Override
    public Integer a(c2.b<Integer> frameInfo) {
        Integer num = (Integer) this.d.srcColorToDestColor.get(frameInfo != null ? frameInfo.b() : null);
        if (num != null) {
            return num;
        }
        if (frameInfo != null) {
            return frameInfo.a();
        }
        return null;
    }
}
