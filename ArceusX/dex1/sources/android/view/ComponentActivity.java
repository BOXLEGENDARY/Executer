package android.view;

import R0.a;
import S5.Cg.XjqcfAbdbc;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.AbstractC1694h;
import android.view.C1672F;
import android.view.C1675I;
import android.view.C1681O;
import android.view.C1683Q;
import android.view.C1685T;
import android.view.C1686U;
import android.view.C1703q;
import android.view.ComponentActivity;
import android.view.FragmentC1668B;
import android.view.InterfaceC1684S;
import android.view.InterfaceC1693g;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.result.IntentSenderRequest;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.q;
import androidx.core.app.r;
import androidx.core.app.t;
import androidx.core.view.B;
import androidx.core.view.C1654z;
import androidx.core.view.InterfaceC1648w;
import androidx.savedstate.a;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import d.C2378a;
import d.InterfaceC2379b;
import e.AbstractC2403c;
import e.AbstractC2405e;
import e.InterfaceC2401a;
import e.InterfaceC2402b;
import e.InterfaceC2406f;
import f.AbstractC2431a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k0.BAKp.xAQOwX;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import x0.InterfaceC2984a;

@Metadata(d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\u00022\u00020\f2\u00020\r2\u00020\u00022\u00020\u000e2\u00020\u000f:\nÞ\u0001ß\u0001à\u0001á\u0001â\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001eH\u0015¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b&\u0010%J\u0019\u0010(\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J\u0019\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b(\u0010+J#\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b(\u0010.J#\u0010/\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0015H\u0017¢\u0006\u0004\b0\u0010\u0011J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00107J)\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u0003H\u0016¢\u0006\u0004\bI\u0010LJ'\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bI\u0010OJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bP\u0010JJ\u000f\u0010Q\u001a\u00020\u0015H\u0016¢\u0006\u0004\bQ\u0010\u0011J\u000f\u0010R\u001a\u00020\u0015H\u0017¢\u0006\u0004\bR\u0010\u0011J\u001f\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0012H\u0017¢\u0006\u0004\bV\u0010WJ)\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bV\u0010YJA\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017¢\u0006\u0004\b_\u0010`JK\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b_\u0010aJ)\u0010d\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\u0006\u0010b\u001a\u00020\u00122\b\u0010c\u001a\u0004\u0018\u00010SH\u0015¢\u0006\u0004\bd\u0010eJ-\u0010k\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f2\u0006\u0010j\u001a\u00020iH\u0017¢\u0006\u0004\bk\u0010lJI\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\u0006\u0010r\u001a\u00020q2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010wJA\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010xJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0004\b{\u0010|J\u001b\u0010~\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0004\b~\u0010\u007fJ\u001d\u0010\u0080\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u001a\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0081\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0082\u0001\u0010\u0014J\u001d\u0010\u0083\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0083\u0001\u0010\u007fJ\u001d\u0010\u0084\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001a\u0010\u0085\u0001\u001a\u00020\u00152\u0006\u0010T\u001a\u00020SH\u0015¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001d\u0010\u0087\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0087\u0001\u0010\u007fJ\u001d\u0010\u0088\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0088\u0001\u0010\u007fJ\u001b\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J#\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001J\u001e\u0010\u008e\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008e\u0001\u0010\u007fJ\u001e\u0010\u008f\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008f\u0001\u0010\u007fJ\u001b\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008b\u0001J#\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008c\u0001J\u001e\u0010\u0093\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010}¢\u0006\u0005\b\u0093\u0001\u0010\u007fJ\u001e\u0010\u0094\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010}¢\u0006\u0005\b\u0094\u0001\u0010\u007fJ\u0011\u0010\u0095\u0001\u001a\u00020\u0015H\u0015¢\u0006\u0005\b\u0095\u0001\u0010\u0011J\u0019\u0010\u0097\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0019\u0010\u0099\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u0098\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u009a\u0001\u0010\u0011R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001f\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b¤\u0001\u0010\u0011R\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010¨\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R!\u0010¯\u0001\u001a\u00030ª\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010mR\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010³\u0001\u001a\u00020q8\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R$\u0010»\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008d\u00010}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u00010}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¹\u0001R\u001f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R\u0019\u0010¿\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010À\u0001R!\u0010Æ\u0001\u001a\u00030Â\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÃ\u0001\u0010¬\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R'\u0010Ë\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÇ\u0001\u0010¬\u0001\u0012\u0005\bÊ\u0001\u0010\u0011\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Í\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010%R\u0018\u0010Ñ\u0001\u001a\u00030Î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ô\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0015\u0010Ü\u0001\u001a\u00030Ù\u00018F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006ã\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/g;", BuildConfig.FLAVOR, "Landroidx/lifecycle/o;", "Landroidx/lifecycle/S;", "Landroidx/lifecycle/g;", "Lb1/d;", "Landroidx/activity/G;", "Le/f;", "Le/b;", "Landroidx/core/content/b;", "Landroidx/core/content/c;", "Landroidx/core/app/q;", "Landroidx/core/app/r;", "Landroidx/core/view/w;", "Landroidx/activity/D;", "<init>", "()V", BuildConfig.FLAVOR, "contentLayoutId", "(I)V", BuildConfig.FLAVOR, "ensureViewModelStore", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/OnBackPressedDispatcher;)V", "Landroidx/activity/ComponentActivity$d;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$d;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Ld/b;", "listener", "addOnContextAvailableListener", "(Ld/b;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", BuildConfig.FLAVOR, "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/B;", "provider", "addMenuProvider", "(Landroidx/core/view/B;)V", "owner", "(Landroidx/core/view/B;Landroidx/lifecycle/o;)V", "Landroidx/lifecycle/h$b;", "state", "(Landroidx/core/view/B;Landroidx/lifecycle/o;Landroidx/lifecycle/h$b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "permissions", BuildConfig.FLAVOR, "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lf/a;", "contract", "Le/e;", "registry", "Le/a;", "callback", "Le/c;", "registerForActivityResult", "(Lf/a;Le/e;Le/a;)Le/c;", "(Lf/a;Le/a;)Le/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lx0/a;", "addOnConfigurationChangedListener", "(Lx0/a;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/i;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/t;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Ld/a;", "contextAwareHelper", "Ld/a;", "Landroidx/core/view/z;", "menuHostHelper", "Landroidx/core/view/z;", "Lb1/c;", "savedStateRegistryController", "Lb1/c;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/Q;", "_viewModelStore", "Landroidx/lifecycle/Q;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$d;", "Landroidx/activity/C;", "fullyDrawnReporter$delegate", "LP9/h;", "getFullyDrawnReporter", "()Landroidx/activity/C;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Le/e;", "getActivityResultRegistry", "()Le/e;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/O$b;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/O$b;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/h;", "getLifecycle", "()Landroidx/lifecycle/h;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/Q;", "viewModelStore", "LR0/a;", "getDefaultViewModelCreationExtras", "()LR0/a;", "defaultViewModelCreationExtras", "Landroidx/savedstate/a;", "getSavedStateRegistry", "()Landroidx/savedstate/a;", "savedStateRegistry", "Companion", "a", "b", "c", "d", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.g implements InterfaceC1701o, InterfaceC1684S, InterfaceC1693g, b1.d, G, InterfaceC2406f, InterfaceC2402b, androidx.core.content.b, androidx.core.content.c, q, r, InterfaceC1648w, D {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private C1683Q _viewModelStore;
    private final AbstractC2405e activityResultRegistry;
    private int contentLayoutId;
    private final C2378a contextAwareHelper;

    private final P9.h defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    private final P9.h fullyDrawnReporter;
    private final C1654z menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    private final P9.h onBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC2984a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2984a<androidx.core.app.i>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2984a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC2984a<t>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2984a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final b1.c savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/ComponentActivity$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/window/OnBackInvokedDispatcher;", "a", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        public static final a f8392a = new a();

        private a() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/ComponentActivity$c;", BuildConfig.FLAVOR, "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/Q;", "b", "Landroidx/lifecycle/Q;", "()Landroidx/lifecycle/Q;", "d", "(Landroidx/lifecycle/Q;)V", "viewModelStore", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        private Object custom;

        private C1683Q viewModelStore;

        public final Object getCustom() {
            return this.custom;
        }

        public final C1683Q getViewModelStore() {
            return this.viewModelStore;
        }

        public final void c(Object obj) {
            this.custom = obj;
        }

        public final void d(C1683Q c1683q) {
            this.viewModelStore = c1683q;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$d;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "M0", "(Landroid/view/View;)V", "j", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface d extends Executor {
        void M0(View view);

        void j();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/activity/ComponentActivity$e;", "Landroidx/activity/ComponentActivity$d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "M0", "(Landroid/view/View;)V", "j", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", BuildConfig.FLAVOR, "d", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "e", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", BuildConfig.FLAVOR, "i", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;

        private Runnable currentRunnable;

        private boolean onDrawScheduled;

        public e() {
        }

        public static final void b(e eVar) {
            Runnable runnable = eVar.currentRunnable;
            if (runnable != null) {
                Intrinsics.d(runnable);
                runnable.run();
                eVar.currentRunnable = null;
            }
        }

        @Override
        public void M0(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() {
                    @Override
                    public final void run() {
                        ComponentActivity.e.b(this.f8462d);
                    }
                });
            } else if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override
        public void j() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().c()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$f", "Le/e;", "I", "O", BuildConfig.FLAVOR, "requestCode", "Lf/a;", "contract", "input", "Landroidx/core/app/c;", "options", BuildConfig.FLAVOR, "i", "(ILf/a;Ljava/lang/Object;Landroidx/core/app/c;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends AbstractC2405e {
        f() {
        }

        public static final void s(f fVar, int i7, AbstractC2431a.C0186a c0186a) {
            fVar.f(i7, c0186a.a());
        }

        public static final void t(f fVar, int i7, IntentSender.SendIntentException sendIntentException) {
            fVar.e(i7, 0, new Intent().setAction(XjqcfAbdbc.sKLZBTW).putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override
        public <I, O> void i(final int requestCode, AbstractC2431a<I, O> contract, I input, androidx.core.app.c options) {
            Bundle bundle;
            Intrinsics.checkNotNullParameter(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final AbstractC2431a.C0186a<O> synchronousResult = contract.getSynchronousResult(componentActivity, input);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public final void run() {
                        ComponentActivity.f.s(this.f8463d, requestCode, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(componentActivity, input);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                Intrinsics.d(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (Intrinsics.b("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.t(componentActivity, stringArrayExtra, requestCode);
                return;
            }
            if (!Intrinsics.b("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                androidx.core.app.b.x(componentActivity, intentCreateIntent, requestCode, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.d(intentSenderRequest);
                androidx.core.app.b.y(componentActivity, intentSenderRequest.getIntentSender(), requestCode, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e7) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public final void run() {
                        ComponentActivity.f.t(this.f8466d, requestCode, e7);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/I;", "a", "()Landroidx/lifecycle/I;"}, k = 3, mv = {1, 8, 0})
    static final class g extends l implements Function0<C1675I> {
        g() {
            super(0);
        }

        public final C1675I invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new C1675I(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/C;", "a", "()Landroidx/activity/C;"}, k = 3, mv = {1, 8, 0})
    static final class h extends l implements Function0<C> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends l implements Function0<Unit> {

            final ComponentActivity f8402d;

            a(ComponentActivity componentActivity) {
                super(0);
                this.f8402d = componentActivity;
            }

            public Object invoke() {
                m2invoke();
                return Unit.a;
            }

            public final void m2invoke() {
                this.f8402d.reportFullyDrawn();
            }
        }

        h() {
            super(0);
        }

        public final C invoke() {
            return new C(ComponentActivity.this.reportFullyDrawnExecutor, new a(ComponentActivity.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "c", "()Landroidx/activity/OnBackPressedDispatcher;"}, k = 3, mv = {1, 8, 0})
    static final class i extends l implements Function0<OnBackPressedDispatcher> {
        i() {
            super(0);
        }

        public static final void e(ComponentActivity componentActivity) {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e7) {
                if (!Intrinsics.b(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e7;
                }
            } catch (NullPointerException e8) {
                if (!Intrinsics.b(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e8;
                }
            }
        }

        public static final void f(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
            componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
        }

        public final OnBackPressedDispatcher invoke() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() {
                @Override
                public final void run() {
                    ComponentActivity.i.e(componentActivity);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
                    componentActivity2.addObserverForBackInvoker(onBackPressedDispatcher);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public final void run() {
                            ComponentActivity.i.f(componentActivity2, onBackPressedDispatcher);
                        }
                    });
                }
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C2378a();
        this.menuHostHelper = new C1654z(new Runnable() {
            @Override
            public final void run() {
                this.f8455d.invalidateMenu();
            }
        });
        b1.c cVarA = b1.c.INSTANCE.a(this);
        this.savedStateRegistryController = cVarA;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = P9.i.b(new h());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC1698l() {
            @Override
            public final void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
                ComponentActivity._init_$lambda$2(this.f8456d, interfaceC1701o, aVar);
            }
        });
        getLifecycle().a(new InterfaceC1698l() {
            @Override
            public final void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
                ComponentActivity._init_$lambda$3(this.f8457d, interfaceC1701o, aVar);
            }
        });
        getLifecycle().a(new InterfaceC1698l() {
            @Override
            public void j(InterfaceC1701o source, AbstractC1694h.a event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().d(this);
            }
        });
        cVarA.c();
        C1672F.c(this);
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new a.c() {
            @Override
            public final Bundle a() {
                return ComponentActivity._init_$lambda$4(this.f8458a);
            }
        });
        addOnContextAvailableListener(new InterfaceC2379b() {
            @Override
            public final void a(Context context) {
                ComponentActivity._init_$lambda$5(this.f8459a, context);
            }
        });
        this.defaultViewModelProviderFactory = P9.i.b(new g());
        this.onBackPressedDispatcher = P9.i.b(new i());
    }

    public static final void _init_$lambda$2(ComponentActivity componentActivity, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(interfaceC1701o, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(aVar, "event");
        if (aVar != AbstractC1694h.a.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void _init_$lambda$3(ComponentActivity componentActivity, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        Intrinsics.checkNotNullParameter(interfaceC1701o, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(aVar, "event");
        if (aVar == AbstractC1694h.a.ON_DESTROY) {
            componentActivity.contextAwareHelper.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.j();
        }
    }

    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.k(bundle);
        return bundle;
    }

    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        Intrinsics.checkNotNullParameter(context, "it");
        Bundle bundleB = componentActivity.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (bundleB != null) {
            componentActivity.activityResultRegistry.j(bundleB);
        }
    }

    public final void addObserverForBackInvoker(final OnBackPressedDispatcher dispatcher) {
        getLifecycle().a(new InterfaceC1698l() {
            @Override
            public final void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(dispatcher, this, interfaceC1701o, aVar);
            }
        });
    }

    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        Intrinsics.checkNotNullParameter(interfaceC1701o, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(aVar, "event");
        if (aVar == AbstractC1694h.a.ON_CREATE) {
            onBackPressedDispatcher.o(a.f8392a.a(componentActivity));
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C1683Q();
            }
        }
    }

    public static void getOnBackPressedDispatcher$annotations() {
    }

    private static void getSavedStateRegistryController$annotations() {
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.M0(decorView);
        super.addContentView(view, params);
    }

    @Override
    public void addMenuProvider(B provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override
    public final void addOnConfigurationChangedListener(InterfaceC2984a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC2379b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override
    public final void addOnMultiWindowModeChangedListener(InterfaceC2984a<androidx.core.app.i> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(InterfaceC2984a<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override
    public final void addOnPictureInPictureModeChangedListener(InterfaceC2984a<t> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override
    public final void addOnTrimMemoryListener(InterfaceC2984a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override
    public final AbstractC2405e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override
    public R0.a getDefaultViewModelCreationExtras() {
        R0.d dVar = new R0.d(null, 1, null);
        if (getApplication() != null) {
            a.b<Application> bVar = C1681O.a.f11332h;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            dVar.c(bVar, application);
        }
        dVar.c(C1672F.f11269a, this);
        dVar.c(C1672F.f11270b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.c(C1672F.f11271c, extras);
        }
        return dVar;
    }

    @Override
    public C1681O.b getDefaultViewModelProviderFactory() {
        return (C1681O.b) this.defaultViewModelProviderFactory.getValue();
    }

    public C getFullyDrawnReporter() {
        return (C) this.fullyDrawnReporter.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.getCustom();
        }
        return null;
    }

    @Override
    public AbstractC1694h getLifecycle() {
        return super.getLifecycle();
    }

    @Override
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher.getValue();
    }

    @Override
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override
    public C1683Q getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        C1683Q c1683q = this._viewModelStore;
        Intrinsics.d(c1683q);
        return c1683q;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        C1685T.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        C1686U.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        b1.e.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        C1586K.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        View.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.e(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC2984a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        FragmentC1668B.INSTANCE.c(this);
        int i7 = this.contentLayoutId;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.j(item);
        }
        return false;
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC2984a<androidx.core.app.i>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.i(isInMultiWindowMode));
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC2984a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.i(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC2984a<t>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new t(isInPictureInPictureMode));
        }
    }

    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.k(menu);
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.e(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra(GObvYfBKohxpYX.MVsgAfXqQw, grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1683Q viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = cVar.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.c(objOnRetainCustomNonConfigurationInstance);
        cVar2.d(viewModelStore);
        return cVar2;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof C1703q) {
            AbstractC1694h lifecycle = getLifecycle();
            Intrinsics.e(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1703q) lifecycle).o(AbstractC1694h.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC2984a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.getContext();
    }

    public final <I, O> AbstractC2403c<I> registerForActivityResult(AbstractC2431a<I, O> contract, AbstractC2405e registry, InterfaceC2401a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override
    public void removeMenuProvider(B provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.l(provider);
    }

    @Override
    public final void removeOnConfigurationChangedListener(InterfaceC2984a<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC2379b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override
    public final void removeOnMultiWindowModeChangedListener(InterfaceC2984a<androidx.core.app.i> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(InterfaceC2984a<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2984a<t> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override
    public final void removeOnTrimMemoryListener(InterfaceC2984a<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override
    public void reportFullyDrawn() {
        try {
            if (h1.a.d()) {
                h1.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            h1.a.b();
        } catch (Throwable th) {
            h1.a.b();
            throw th;
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, xAQOwX.LJRLIKblUycONTH);
        dVar.M0(decorView);
        super.setContentView(layoutResID);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void addMenuProvider(B provider, InterfaceC1701o owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void addMenuProvider(B provider, InterfaceC1701o owner, AbstractC1694h.b state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    @Override
    public final <I, O> AbstractC2403c<I> registerForActivityResult(AbstractC2431a<I, O> contract, InterfaceC2401a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC2984a<androidx.core.app.i>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.i(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC2984a<t>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new t(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.M0(decorView);
        super.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.M0(decorView);
        super.setContentView(view, params);
    }

    public ComponentActivity(int i7) {
        this();
        this.contentLayoutId = i7;
    }
}
