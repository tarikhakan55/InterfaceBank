package com.tarikhakan.app.interfacebank;

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

import com.tarikhakan.app.interfacebank.main_interface.Main_interface;
import com.tarikhakan.app.interfacebank.user_interface.User_interface;
import com.tarikhakan.app.interfacebank.card_interface.Card_interface;
import com.tarikhakan.app.interfacebank.widget_interface.Widget_interface;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearUst = (LinearLayout) findViewById(R.id.linearUst);
        ImageView menuImage = (ImageView) findViewById(R.id.menuImage);
        ImageView logoImage = (ImageView) findViewById(R.id.logoImage);
        ImageView banneraltImage = (ImageView) findViewById(R.id.banneraltImage);
        ImageView mainIntarfaceImage = (ImageView) findViewById(R.id.mainIntarfaceImage);
        ImageView userInterfaceImage = (ImageView) findViewById(R.id.userInterfaceImage);
        ImageView cardInterfaceImage = (ImageView) findViewById(R.id.cardInterfaceImage);
        ImageView widgetInterfaceImage = (ImageView) findViewById(R.id.widgetInterfaceImage);

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

            Bitmap bmaininterface = getBitmapFromAssets("main_activity/maininterface.png");
            mainIntarfaceImage.setImageBitmap(bmaininterface);

            Bitmap buserinterface = getBitmapFromAssets("main_activity/userinterface.png");
            userInterfaceImage.setImageBitmap(buserinterface);

            Bitmap bcardInterface = getBitmapFromAssets("main_activity/cardinterface.png");
            cardInterfaceImage.setImageBitmap(bcardInterface);

            Bitmap bwidgetInterface = getBitmapFromAssets("main_activity/widgetinterface.png");
            widgetInterfaceImage.setImageBitmap(bwidgetInterface);
        }
        catch(IOException ex)
        {
            return;
        }


        mainIntarfaceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main_interface.class);
                startActivity(intent);
            }
        });

        userInterfaceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, User_interface.class);
                startActivity(intent);
            }
        });

        cardInterfaceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Card_interface.class);
                startActivity(intent);
            }
        });

        widgetInterfaceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Widget_interface.class);
                startActivity(intent);
            }
        });

    }

    public Bitmap getBitmapFromAssets(String fileName) throws IOException {
        AssetManager assetManager = getAssets();

        InputStream istr = assetManager.open(fileName);
        Bitmap bitmap = BitmapFactory.decodeStream(istr);

        return bitmap;
    }

}
