package com.lhdz.designpattern;

import android.util.Log;

/**
 * Created by 李南 on 2016/1/21  17:05
 * Email:fengyunzhinan@163.com
 */
public class LeftHair implements HairInterface {
    @Override
    public void drawHair() {
        Log.i("drawHair","drawHairLeft");
    }

    @Override
    public void drawEyebrow() {
        Log.i("drawEyebrow","drawEyebrowLeft");
    }
}
