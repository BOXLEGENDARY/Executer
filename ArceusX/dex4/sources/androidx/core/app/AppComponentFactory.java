package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.MotionEventCompat;
import java.lang.reflect.InvocationTargetException;

@RequiresApi(MotionEventCompat.AXIS_RELATIVE_Y)
public class AppComponentFactory extends android.app.AppComponentFactory {
    @Override
    public final Activity instantiateActivity(ClassLoader cl, String className, Intent intent) {
        return (Activity) CoreComponentFactory.checkCompatWrapper(instantiateActivityCompat(cl, className, intent));
    }

    @Override
    public final Application instantiateApplication(ClassLoader cl, String className) {
        return (Application) CoreComponentFactory.checkCompatWrapper(instantiateApplicationCompat(cl, className));
    }

    @Override
    public final BroadcastReceiver instantiateReceiver(ClassLoader cl, String className, Intent intent) {
        return (BroadcastReceiver) CoreComponentFactory.checkCompatWrapper(instantiateReceiverCompat(cl, className, intent));
    }

    @Override
    public final ContentProvider instantiateProvider(ClassLoader cl, String className) {
        return (ContentProvider) CoreComponentFactory.checkCompatWrapper(instantiateProviderCompat(cl, className));
    }

    @Override
    public final Service instantiateService(ClassLoader cl, String className, Intent intent) {
        return (Service) CoreComponentFactory.checkCompatWrapper(instantiateServiceCompat(cl, className, intent));
    }

    @NonNull
    public Application instantiateApplicationCompat(@NonNull ClassLoader cl, @NonNull String className) {
        try {
            return (Application) cl.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @NonNull
    public Activity instantiateActivityCompat(@NonNull ClassLoader cl, @NonNull String className, @Nullable Intent intent) {
        try {
            return (Activity) cl.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @NonNull
    public BroadcastReceiver instantiateReceiverCompat(@NonNull ClassLoader cl, @NonNull String className, @Nullable Intent intent) {
        try {
            return (BroadcastReceiver) cl.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @NonNull
    public Service instantiateServiceCompat(@NonNull ClassLoader cl, @NonNull String className, @Nullable Intent intent) {
        try {
            return (Service) cl.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @NonNull
    public ContentProvider instantiateProviderCompat(@NonNull ClassLoader cl, @NonNull String className) {
        try {
            return (ContentProvider) cl.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }
}
