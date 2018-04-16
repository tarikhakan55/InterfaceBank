package com.tarikhakan.app.interfacebank.widget_interface.time_interfaces.interfaces.interface_1;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.tarikhakan.app.interfacebank.R;

import java.io.IOException;
import java.io.InputStream;

public class Interface_1 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_interface_1);

        RelativeLayout relativeTimeust = (RelativeLayout) findViewById(R.id.relativeTimeust);
        Button Buttonmenu = (Button) findViewById(R.id.Buttonmenu);
        Button ButtonfaceustOrta = (Button) findViewById(R.id.ButtonfaceustOrta);
        Button Buttonsearch = (Button) findViewById(R.id.Buttonsearch);
        Button ButtonPlus = (Button) findViewById(R.id.ButtonPlus);

        try
        {
            Bitmap brelativeTimeust = getBitmapFromAssets("widget_interface/time_interfaces/interfaces/interface_1/timeust.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), brelativeTimeust);
            relativeTimeust.setBackground(background);

            Bitmap bButtonmenu = getBitmapFromAssets("widget_interface/time_interfaces/interfaces/interface_1/menu.png");
            BitmapDrawable background2 = new BitmapDrawable(getResources(), bButtonmenu);
            Buttonmenu.setBackground(background2);

            Bitmap bButtonfaceustOrta = getBitmapFromAssets("widget_interface/time_interfaces/interfaces/interface_1/faceustorta.png");
            BitmapDrawable background3 = new BitmapDrawable(getResources(), bButtonfaceustOrta);
            ButtonfaceustOrta.setBackground(background3);

            Bitmap bButtonsearch = getBitmapFromAssets("widget_interface/time_interfaces/interfaces/interface_1/search.png");
            BitmapDrawable background4 = new BitmapDrawable(getResources(), bButtonsearch);
            Buttonsearch.setBackground(background4);

            Bitmap bButtonPlus = getBitmapFromAssets("widget_interface/time_interfaces/interfaces/interface_1/plus.png");
            BitmapDrawable background5 = new BitmapDrawable(getResources(), bButtonPlus);
            ButtonPlus.setBackground(background5);
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
