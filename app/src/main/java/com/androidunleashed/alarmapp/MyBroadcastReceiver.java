package com.androidunleashed.alarmapp;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
	MediaPlayer mp;
	@Override
	public void onReceive(Context context, Intent intent) {
		Uri alarmSound =
				RingtoneManager. getDefaultUri (RingtoneManager. TYPE_NOTIFICATION );
		MediaPlayer mp = MediaPlayer. create (context.getApplicationContext(), alarmSound);
		mp.start();
		Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
	}
}