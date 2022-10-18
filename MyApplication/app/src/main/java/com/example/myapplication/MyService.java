package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private MediaPlayer mediaPlayer;
    private Mybinder mybinder;
    public MyService() {
    }

    @Override
    public void onCreate() {
        Log.d("zt","oncreat");
        super.onCreate();
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music1);
        mediaPlayer.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("zt","onStartCommand");

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("zt","onDestory");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("zt","qwe");
        mybinder=new Mybinder();
        return mybinder;
    }
    class Mybinder extends Binder{
        public void method(){
            mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music1);
            mediaPlayer.start();
        }
        public Mybinder() {
            super();
        }
    }
}