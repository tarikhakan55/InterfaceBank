package com.tarikhakan.app.interfacebank.main_interface;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.tarikhakan.app.interfacebank.MainActivity;
import com.tarikhakan.app.interfacebank.R;
import com.tarikhakan.app.interfacebank.main_interface.multimedia_interfaces.Multimedia_interfaces;
import com.tarikhakan.app.interfacebank.widget_interface.Widget_interface;

import java.io.IOException;
import java.io.InputStream;


public class Main_interface extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);

        LinearLayout linearUst = (LinearLayout) findViewById(R.id.linearust);
        ImageView menuImage = (ImageView) findViewById(R.id.menuImage);
        ImageView logoImage = (ImageView) findViewById(R.id.logoImage);
        ImageView banneraltImage = (ImageView) findViewById(R.id.banneraltImage);
        ImageView multimediaImage = (ImageView) findViewById(R.id.multimediaImage);

        //Get images from assets folder
        try
        {
            Bitmap bmenu = getBitmapFromAssets("main_activity/menu.png");
            menuImage.setImageBitmap(bmenu);

            Bitmap blogo = getBitmapFromAssets("main_activity/logo.png");
            logoImage.setImageBitmap(blogo);

            Bitmap blinear = getBitmapFromAssets("main_activity/ust.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), blinear);
            linearUst.setBackground(background);

            Bitmap bbanneralt = getBitmapFromAssets("main_activity/banneralt.png");
            banneraltImage.setImageBitmap(bbanneralt);

            Bitmap bmultimediaImage = getBitmapFromAssets("main_interface/multimedia.png");
            multimediaImage.setImageBitmap(bmultimediaImage);

            multimediaImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Main_interface.this,Multimedia_interfaces.class);
                    startActivity(intent);
                }
            });


        }

        catch(IOException ex)
        {
            return;
        }

    }

    public Bitmap getBitmapFromAssets(String fileName) throws IOException {
        AssetManager assetManager = getAssets();

        InputStream istr = assetManager.open(fileName);
        Bitmap bitmap = BitmapFactory.decodeStream(istr);

        return bitmap;
    }

    }

