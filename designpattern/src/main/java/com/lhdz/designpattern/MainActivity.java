package com.lhdz.designpattern;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Properties;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HairFactory factory=new HairFactory();
        //根据需求得到工场中特定的对象
        HairInterface hair=factory.getHairByClassKey("com.lhdz.designpattern.LeftHair");
        //拿到对象后。使用对象的功能（开闭原则，可扩展 ，不可修改）
        hair.drawEyebrow();
        hair.drawHair();

    }
}
