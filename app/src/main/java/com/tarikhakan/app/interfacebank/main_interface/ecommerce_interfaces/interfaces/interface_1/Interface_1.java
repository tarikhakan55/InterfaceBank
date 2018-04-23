package com.tarikhakan.app.interfacebank.main_interface.ecommerce_interfaces.interfaces.interface_1;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.tarikhakan.app.interfacebank.R;

import java.io.IOException;
import java.io.InputStream;

public class Interface_1 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecommerce_interface_1);

        LinearLayout linearUstResim = (LinearLayout) findViewById(R.id.linearUstResim);
        ImageButton imageButtonHome = (ImageButton) findViewById(R.id.imageButtonHome);
        ImageButton imageButtonLogo = (ImageButton) findViewById(R.id.imageButtonLogo);
        ImageButton imageButtonUser = (ImageButton) findViewById(R.id.imageButtonUser);
        ImageButton imageButtonSearch = (ImageButton) findViewById(R.id.imageButtonSearch);
        LinearLayout linearWatches = (LinearLayout) findViewById(R.id.linearWatches);
        LinearLayout linearPc = (LinearLayout) findViewById(R.id.linearPc);
        LinearLayout linearNeckles = (LinearLayout) findViewById(R.id.linearNeckles);

        try
        {
            Bitmap blinearUstResim = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/ustresim.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), blinearUstResim);
            linearUstResim.setBackground(background);

            Bitmap bimageButtonHome = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/home.png");
            BitmapDrawable background2 = new BitmapDrawable(getResources(), bimageButtonHome);
            imageButtonHome.setBackground(background2);

            Bitmap bimageButtonLogo = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/logo.png");
            BitmapDrawable background3 = new BitmapDrawable(getResources(), bimageButtonLogo);
            imageButtonLogo.setBackground(background3);

            Bitmap bimageButtonUser = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/user.png");
            BitmapDrawable background4 = new BitmapDrawable(getResources(), bimageButtonUser);
            imageButtonUser.setBackground(background4);

            Bitmap bimageButtonSearch = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/search.png");
            BitmapDrawable background5 = new BitmapDrawable(getResources(), bimageButtonSearch);
            imageButtonSearch.setBackground(background5);

            Bitmap blinearWatches = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/watches.png");
            BitmapDrawable background6 = new BitmapDrawable(getResources(), blinearWatches);
            linearWatches.setBackground(background6);

            Bitmap blinearPc = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/pc.png");
            BitmapDrawable background7 = new BitmapDrawable(getResources(), blinearPc);
            linearPc.setBackground(background7);

            Bitmap blinearNeckles = getBitmapFromAssets("main_interface/ecommerce_interfaces/interfaces/interface_1/neckles.png");
            BitmapDrawable background8 = new BitmapDrawable(getResources(), blinearNeckles);
            linearNeckles.setBackground(background8);
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
