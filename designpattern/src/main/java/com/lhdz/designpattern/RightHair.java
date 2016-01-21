package com.lhdz.designpattern;

import android.util.Log;

/**
 * Created by 李南 on 2016/1/21  17:07
 * Email:fengyunzhinan@163.com
 */
public class RightHair implements  HairInterface {
    @Override
    public void drawHair() {
        Log.i("drawHair", "drawHairRight");
    }

    @Override
    public void drawEyebrow() {
        Log.i("drawEyebrow", "drawEyebrow");
    }
}
