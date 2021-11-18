package com.example.lt2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.TooManyListenersException;

public class MyBroadCast   extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"HEY HEY HEY", Toast.LENGTH_SHORT).show();
    }
}
