package com.example.yan.sudoku;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by YAN on 2016/8/1.
 */
public class Music
{
    private static MediaPlayer mp=null;
    //Stop old song and start new one
    public static void play(Context context,int resource)
    {
        stop(context);
        if(Prefs.getMusic(context))
        {
            mp=MediaPlayer.create(context,resource);
            mp.setLooping(true);
            mp.start();
        }
    }
    //Stop the Music
    public static void stop(Context context)
    {
        if(mp!=null)
        {
            mp.stop();
            mp.release();
            mp=null;
        }
    }
}
