package com.tarikhakan.app.interfacebank.card_interface;

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

import com.tarikhakan.app.interfacebank.R;
import com.tarikhakan.app.interfacebank.card_interface.personel_card_interfaces.Personel_card_interfaces;

import java.io.IOException;
import java.io.InputStream;

public class Card_interface extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_interface);

        LinearLayout linearUst = (LinearLayout) findViewById(R.id.linearust);
        ImageView menuImage = (ImageView) findViewById(R.id.menuImage);
        ImageView logoImage = (ImageView) findViewById(R.id.logoImage);
        ImageView banneraltImage = (ImageView) findViewById(R.id.banneraltImage);
        ImageView personelcardImage = (ImageView) findViewById(R.id.personelcardImage);

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

            Bitmap bpersonelcardImage = getBitmapFromAssets("card_interface/personalcard.png");
            personelcardImage.setImageBitmap(bpersonelcardImage);

            personelcardImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Card_interface.this,Personel_card_interfaces.class);
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
