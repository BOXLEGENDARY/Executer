package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;

public class FriendRequestAcceptedNotificationReceiver extends a {
    @Override
    protected Intent n(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", intent2.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }
}
