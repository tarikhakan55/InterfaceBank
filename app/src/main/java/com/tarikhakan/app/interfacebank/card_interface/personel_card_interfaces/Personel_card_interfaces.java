package com.tarikhakan.app.interfacebank.card_interface.personel_card_interfaces;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tarikhakan.app.interfacebank.R;
import com.tarikhakan.app.interfacebank.card_interface.personel_card_interfaces.interfaces.interface_1.Interface_1;
import com.tarikhakan.app.interfacebank.card_interface.personel_card_interfaces.interfaces.interface_2.Interface_2;


import java.io.IOException;
import java.io.InputStream;

public class Personel_card_interfaces extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personel_card_interfaces);

        LinearLayout linearUst = (LinearLayout) findViewById(R.id.linearback);
        ImageView menuImage = (ImageView) findViewById(R.id.menuImage);
        ImageView logoImage = (ImageView) findViewById(R.id.logoImage);
        ImageView banneraltImage = (ImageView) findViewById(R.id.banneraltImage);
        ImageView IntarfaceLogo = (ImageView) findViewById(R.id.IntarfaceLogo);
        ImageView IntarfaceLogo2 = (ImageView) findViewById(R.id.IntarfaceLogo2);
        TextView goGithub = (TextView) findViewById(R.id.goGithub);
        TextView goPage = (TextView) findViewById(R.id.goPage);
        TextView goGithub2 = (TextView) findViewById(R.id.goGithub2);
        TextView goPage2 = (TextView) findViewById(R.id.goPage2);

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

            Bitmap BIntarfaceLogo = getBitmapFromAssets("card_interface/personel_card_interfaces/cardtheme1.png");
            IntarfaceLogo.setImageBitmap(BIntarfaceLogo);

            goGithub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/tarikhakan55/InterfaceBank/blob/master/app/src/main/assets/card_interface/personel_card_interfaces/interfaces/interface_1/card%20interface%201%20source"));
                    startActivity(browserIntent);
                }
            });

            goPage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Personel_card_interfaces.this,Interface_1.class);
                    startActivity(intent);
                }
            });

            Bitmap BIntarfaceLogo2 = getBitmapFromAssets("card_interface/personel_card_interfaces/cardtheme2.png");
            IntarfaceLogo2.setImageBitmap(BIntarfaceLogo2);

            goGithub2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/tarikhakan55/InterfaceBank/blob/master/app/src/main/assets/card_interface/personel_card_interfaces/interfaces/interface_2/Card%20Interface%202%20Source"));
                    startActivity(browserIntent);
                }
            });

            goPage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Personel_card_interfaces.this,Interface_2.class);
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
