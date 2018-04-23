package com.tarikhakan.app.interfacebank.main_interface.multimedia_interfaces.interfaces.interface_2;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tarikhakan.app.interfacebank.R;
import java.io.IOException;
import java.io.InputStream;

public class Interface_2 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia_interface_2);

        LinearLayout linearHeader = (LinearLayout) findViewById(R.id.linearHeader);
        LinearLayout linearSearch = (LinearLayout) findViewById(R.id.linearSearch);
        LinearLayout linearLogo = (LinearLayout) findViewById(R.id.linearLogo);
        LinearLayout linearBack = (LinearLayout) findViewById(R.id.linearBack);
        LinearLayout linearUstOrta = (LinearLayout) findViewById(R.id.linearUstOrta);
        LinearLayout linearFilm = (LinearLayout) findViewById(R.id.linearFilm);
        ImageButton imageGeriIcon = (ImageButton) findViewById(R.id.imageGeriIcon);
        ImageButton imageOrtaIcon = (ImageButton) findViewById(R.id.imageOrtaIcon);
        ImageButton imageOrtaIcon2 = (ImageButton) findViewById(R.id.imageOrtaIcon2);
        ImageButton imageIleriIcon = (ImageButton) findViewById(R.id.imageIleriIcon);
        LinearLayout linearAltOrta = (LinearLayout) findViewById(R.id.linearAltOrta);
        ImageButton imageFilm1 = (ImageButton) findViewById(R.id.imageFilm1);
        ImageButton imageFilm2 = (ImageButton) findViewById(R.id.imageFilm2);
        ImageButton imageFilm3 = (ImageButton) findViewById(R.id.imageFilm3);
        ImageButton imageFilm4 = (ImageButton) findViewById(R.id.imageFilm4);
        ImageButton imageFilm5 = (ImageButton) findViewById(R.id.imageFilm5);
        ImageButton imageFilm6 = (ImageButton) findViewById(R.id.imageFilm6);
        LinearLayout linearHeader2 = (LinearLayout) findViewById(R.id.linearHeader2);
        Button buttonTrail = (Button) findViewById(R.id.buttonTrail);
        Button buttonCalendar = (Button) findViewById(R.id.buttonCalendar);
        Button buttonTeaters = (Button) findViewById(R.id.buttonTeaters);
        Button buttonTop10 = (Button) findViewById(R.id.buttonTop10);
        Button buttonStar = (Button) findViewById(R.id.buttonStar);


        try
        {
            Bitmap blinearHeader = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/header.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), blinearHeader);
            linearHeader.setBackground(background);

            Bitmap blinearSearch = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/search.png");
            BitmapDrawable background2 = new BitmapDrawable(getResources(), blinearSearch);
            linearSearch.setBackground(background2);

            Bitmap blinearLogo = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/logo.png");
            BitmapDrawable background3 = new BitmapDrawable(getResources(), blinearLogo);
            linearLogo.setBackground(background3);

            Bitmap blinearBack = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/back.png");
            BitmapDrawable background4 = new BitmapDrawable(getResources(), blinearBack);
            linearBack.setBackground(background4);

            Bitmap blinearUstOrta = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/ustorta.png");
            BitmapDrawable background5 = new BitmapDrawable(getResources(), blinearUstOrta);
            linearUstOrta.setBackground(background5);

            Bitmap blinearFilm = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/film.png");
            BitmapDrawable background6 = new BitmapDrawable(getResources(), blinearFilm);
            linearFilm.setBackground(background6);

            Bitmap bimageGeriIcon = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/geriicon.png");
            BitmapDrawable background7 = new BitmapDrawable(getResources(), bimageGeriIcon);
            imageGeriIcon.setBackground(background7);

            Bitmap bimageOrtaIcon = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/ortaicon.png");
            BitmapDrawable background8 = new BitmapDrawable(getResources(), bimageOrtaIcon);
            imageOrtaIcon.setBackground(background8);

            Bitmap bimageOrtaIcon2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/ortaicon.png");
            BitmapDrawable background9 = new BitmapDrawable(getResources(), bimageOrtaIcon2);
            imageOrtaIcon2.setBackground(background9);

            Bitmap bimageIleriIcon = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/ileriicon.png");
            BitmapDrawable background10 = new BitmapDrawable(getResources(), bimageIleriIcon);
            imageIleriIcon.setBackground(background10);

            Bitmap blinearAltOrta = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/altorta.png");
            BitmapDrawable background11 = new BitmapDrawable(getResources(), blinearAltOrta);
            linearAltOrta.setBackground(background11);

            Bitmap bimageFilm1 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/film1.png");
            BitmapDrawable background12 = new BitmapDrawable(getResources(), bimageFilm1);
            imageFilm1.setBackground(background12);

            Bitmap bimageFilm2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/film2.png");
            BitmapDrawable background13 = new BitmapDrawable(getResources(), bimageFilm2);
            imageFilm2.setBackground(background13);

            Bitmap bimageFilm3 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/film3.png");
            BitmapDrawable background14 = new BitmapDrawable(getResources(), bimageFilm3);
            imageFilm3.setBackground(background14);

            Bitmap bimageFilm4 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/film4.png");
            BitmapDrawable background15 = new BitmapDrawable(getResources(), bimageFilm4);
            imageFilm4.setBackground(background15);

            Bitmap bimageFilm5 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/film5.png");
            BitmapDrawable background16 = new BitmapDrawable(getResources(), bimageFilm5);
            imageFilm5.setBackground(background16);

            Bitmap bimageFilm6 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/film6.png");
            BitmapDrawable background17 = new BitmapDrawable(getResources(), bimageFilm6);
            imageFilm6.setBackground(background17);

            Bitmap blinearHeader2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/header.png");
            BitmapDrawable background18 = new BitmapDrawable(getResources(), blinearHeader2);
            linearHeader2.setBackground(background18);

            Bitmap bbuttonTrail = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/trail.png");
            BitmapDrawable background19 = new BitmapDrawable(getResources(), bbuttonTrail);
            buttonTrail.setBackground(background19);

            Bitmap bbuttonCalendar = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/calender.png");
            BitmapDrawable background20 = new BitmapDrawable(getResources(), bbuttonCalendar);
            buttonCalendar.setBackground(background20);

            Bitmap bbuttonTeaters = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/teaters.png");
            BitmapDrawable background21 = new BitmapDrawable(getResources(), bbuttonTeaters);
            buttonTeaters.setBackground(background21);

            Bitmap bbuttonTop10 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/top10.png");
            BitmapDrawable background22 = new BitmapDrawable(getResources(), bbuttonTop10);
            buttonTop10.setBackground(background22);

            Bitmap bbuttonStar = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_2/star.png");
            BitmapDrawable background23 = new BitmapDrawable(getResources(), bbuttonStar);
            buttonStar.setBackground(background23);

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
