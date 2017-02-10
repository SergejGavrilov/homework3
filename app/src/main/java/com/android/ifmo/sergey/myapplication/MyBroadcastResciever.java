package com.android.ifmo.sergey.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by sergey on 10.02.17.
 */

public class MyBroadcastResciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, MyService.class).putExtra("url", MainActivity.url));
    }
}
