package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private final Bundle mExtras = new Bundle();

    NotificationCompatBuilder(NotificationCompat.Builder b) {
        ArrayList<String> arrayList;
        this.mBuilderCompat = b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.mBuilder = new Notification.Builder(b.mContext, b.mChannelId);
        } else {
            this.mBuilder = new Notification.Builder(b.mContext);
        }
        Notification n = b.mNotification;
        this.mBuilder.setWhen(n.when).setSmallIcon(n.icon, n.iconLevel).setContent(n.contentView).setTicker(n.tickerText, b.mTickerView).setVibrate(n.vibrate).setLights(n.ledARGB, n.ledOnMS, n.ledOffMS).setOngoing((n.flags & 2) != 0).setOnlyAlertOnce((n.flags & 8) != 0).setAutoCancel((n.flags & 16) != 0).setDefaults(n.defaults).setContentTitle(b.mContentTitle).setContentText(b.mContentText).setContentInfo(b.mContentInfo).setContentIntent(b.mContentIntent).setDeleteIntent(n.deleteIntent).setFullScreenIntent(b.mFullScreenIntent, (n.flags & 128) != 0).setLargeIcon(b.mLargeIcon).setNumber(b.mNumber).setProgress(b.mProgressMax, b.mProgress, b.mProgressIndeterminate);
        if (i < 21) {
            this.mBuilder.setSound(n.sound, n.audioStreamType);
        }
        if (i >= 16) {
            this.mBuilder.setSubText(b.mSubText).setUsesChronometer(b.mUseChronometer).setPriority(b.mPriority);
            Iterator<NotificationCompat.Action> it = b.mActions.iterator();
            while (it.hasNext()) {
                NotificationCompat.Action action = it.next();
                addAction(action);
            }
            Bundle bundle = b.mExtras;
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (b.mLocalOnly) {
                    this.mExtras.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                String str = b.mGroupKey;
                if (str != null) {
                    this.mExtras.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, str);
                    if (b.mGroupSummary) {
                        this.mExtras.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.mExtras.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                String str2 = b.mSortKey;
                if (str2 != null) {
                    this.mExtras.putString(NotificationCompatExtras.EXTRA_SORT_KEY, str2);
                }
            }
            this.mContentView = b.mContentView;
            this.mBigContentView = b.mBigContentView;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            this.mBuilder.setShowWhen(b.mShowWhen);
            if (i2 < 21 && (arrayList = b.mPeople) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.mExtras;
                ArrayList<String> arrayList2 = b.mPeople;
                bundle2.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i2 >= 20) {
            this.mBuilder.setLocalOnly(b.mLocalOnly).setGroup(b.mGroupKey).setGroupSummary(b.mGroupSummary).setSortKey(b.mSortKey);
            this.mGroupAlertBehavior = b.mGroupAlertBehavior;
        }
        if (i2 >= 21) {
            this.mBuilder.setCategory(b.mCategory).setColor(b.mColor).setVisibility(b.mVisibility).setPublicVersion(b.mPublicVersion).setSound(n.sound, n.audioAttributes);
            Iterator<String> it2 = b.mPeople.iterator();
            while (it2.hasNext()) {
                String person = it2.next();
                this.mBuilder.addPerson(person);
            }
            this.mHeadsUpContentView = b.mHeadsUpContentView;
            if (b.mInvisibleActions.size() > 0) {
                Bundle carExtenderBundle = b.getExtras().getBundle("android.car.EXTENSIONS");
                carExtenderBundle = carExtenderBundle == null ? new Bundle() : carExtenderBundle;
                Bundle listBundle = new Bundle();
                for (int i3 = 0; i3 < b.mInvisibleActions.size(); i3++) {
                    listBundle.putBundle(Integer.toString(i3), NotificationCompatJellybean.getBundleForAction(b.mInvisibleActions.get(i3)));
                }
                carExtenderBundle.putBundle("invisible_actions", listBundle);
                b.getExtras().putBundle("android.car.EXTENSIONS", carExtenderBundle);
                this.mExtras.putBundle("android.car.EXTENSIONS", carExtenderBundle);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            this.mBuilder.setExtras(b.mExtras).setRemoteInputHistory(b.mRemoteInputHistory);
            RemoteViews remoteViews = b.mContentView;
            if (remoteViews != null) {
                this.mBuilder.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = b.mBigContentView;
            if (remoteViews2 != null) {
                this.mBuilder.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = b.mHeadsUpContentView;
            if (remoteViews3 != null) {
                this.mBuilder.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.mBuilder.setBadgeIconType(b.mBadgeIcon).setShortcutId(b.mShortcutId).setTimeoutAfter(b.mTimeout).setGroupAlertBehavior(b.mGroupAlertBehavior);
            if (b.mColorizedSet) {
                this.mBuilder.setColorized(b.mColorized);
            }
            if (!TextUtils.isEmpty(b.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    @Override
    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    public Notification build() {
        Bundle extras;
        RemoteViews styleHeadsUpContentView;
        RemoteViews styleBigContentView;
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews styleContentView = style != null ? style.makeContentView(this) : null;
        Notification n = buildInternal();
        if (styleContentView != null) {
            n.contentView = styleContentView;
        } else {
            RemoteViews remoteViews = this.mBuilderCompat.mContentView;
            if (remoteViews != null) {
                n.contentView = remoteViews;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && style != null && (styleBigContentView = style.makeBigContentView(this)) != null) {
            n.bigContentView = styleBigContentView;
        }
        if (i >= 21 && style != null && (styleHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            n.headsUpContentView = styleHeadsUpContentView;
        }
        if (i >= 16 && style != null && (extras = NotificationCompat.getExtras(n)) != null) {
            style.addCompatExtras(extras);
        }
        return n;
    }

    private void addAction(NotificationCompat.Action action) {
        Bundle actionExtras;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder actionBuilder = new Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
            if (action.getRemoteInputs() != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                    actionBuilder.addRemoteInput(remoteInput);
                }
            }
            if (action.getExtras() != null) {
                actionExtras = new Bundle(action.getExtras());
            } else {
                actionExtras = new Bundle();
            }
            actionExtras.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                actionBuilder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
            }
            actionExtras.putInt("android.support.action.semanticAction", action.getSemanticAction());
            if (i2 >= 28) {
                actionBuilder.setSemanticAction(action.getSemanticAction());
            }
            actionExtras.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
            actionBuilder.addExtras(actionExtras);
            this.mBuilder.addAction(actionBuilder.build());
            return;
        }
        if (i >= 16) {
            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.mBuilder, action));
        }
    }

    protected Notification buildInternal() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.mBuilder.build();
        }
        if (i >= 24) {
            Notification notification = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (notification.getGroup() != null && (notification.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notification);
                }
            }
            return notification;
        }
        if (i >= 21) {
            this.mBuilder.setExtras(this.mExtras);
            Notification notification2 = this.mBuilder.build();
            RemoteViews remoteViews = this.mContentView;
            if (remoteViews != null) {
                notification2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.mBigContentView;
            if (remoteViews2 != null) {
                notification2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.mHeadsUpContentView;
            if (remoteViews3 != null) {
                notification2.headsUpContentView = remoteViews3;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (notification2.getGroup() != null && (notification2.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notification2);
                }
                if (notification2.getGroup() != null && (notification2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notification2);
                }
            }
            return notification2;
        }
        if (i >= 20) {
            this.mBuilder.setExtras(this.mExtras);
            Notification notification3 = this.mBuilder.build();
            RemoteViews remoteViews4 = this.mContentView;
            if (remoteViews4 != null) {
                notification3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.mBigContentView;
            if (remoteViews5 != null) {
                notification3.bigContentView = remoteViews5;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (notification3.getGroup() != null && (notification3.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notification3);
                }
                if (notification3.getGroup() != null && (notification3.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notification3);
                }
            }
            return notification3;
        }
        if (i >= 19) {
            SparseArray<Bundle> actionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (actionExtrasMap != null) {
                this.mExtras.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, actionExtrasMap);
            }
            this.mBuilder.setExtras(this.mExtras);
            Notification notification4 = this.mBuilder.build();
            RemoteViews remoteViews6 = this.mContentView;
            if (remoteViews6 != null) {
                notification4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.mBigContentView;
            if (remoteViews7 != null) {
                notification4.bigContentView = remoteViews7;
            }
            return notification4;
        }
        if (i >= 16) {
            Notification notification5 = this.mBuilder.build();
            Bundle extras = NotificationCompat.getExtras(notification5);
            Bundle mergeBundle = new Bundle(this.mExtras);
            for (String key : this.mExtras.keySet()) {
                if (extras.containsKey(key)) {
                    mergeBundle.remove(key);
                }
            }
            extras.putAll(mergeBundle);
            SparseArray<Bundle> actionExtrasMap2 = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (actionExtrasMap2 != null) {
                NotificationCompat.getExtras(notification5).putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, actionExtrasMap2);
            }
            RemoteViews remoteViews8 = this.mContentView;
            if (remoteViews8 != null) {
                notification5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.mBigContentView;
            if (remoteViews9 != null) {
                notification5.bigContentView = remoteViews9;
            }
            return notification5;
        }
        return this.mBuilder.getNotification();
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }
}
