package com.example.oscar_zhang.calculator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.media.MediaPlayer;

public class MusicPlay extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}
