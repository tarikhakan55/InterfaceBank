package com.tarikhakan.app.interfacebank.widget_interface.weather_interfaces.interfaces.interface_1;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.tarikhakan.app.interfacebank.R;

import java.io.IOException;
import java.io.InputStream;

public class Interface_1 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_interface_1);

        LinearLayout LinearWeatherArka = (LinearLayout) findViewById(R.id.LinearWeatherArka);
        RelativeLayout RelativeWeatherFiltre = (RelativeLayout) findViewById(R.id.RelativeWeatherFiltre);
        RelativeLayout RelativeWeatherFiltre2 = (RelativeLayout) findViewById(R.id.RelativeWeatherFiltre2);
        LinearLayout LinearWeatherFiltre = (LinearLayout) findViewById(R.id.LinearWeatherFiltre);
        LinearLayout LinearWeatherSunny = (LinearLayout) findViewById(R.id.LinearWeatherSunny);
        ImageView ImageWeatherSun = (ImageView) findViewById(R.id.ImageWeatherSun);
        ImageView ImageWeatherSunhalf = (ImageView) findViewById(R.id.ImageWeatherSunhalf);
        ImageView ImageWeatherSunhalf2 = (ImageView) findViewById(R.id.ImageWeatherSunhalf2);
        ImageView ImageWeatherRain = (ImageView) findViewById(R.id.ImageWeatherRain);
        ImageView ImageWeatherRain2 = (ImageView) findViewById(R.id.ImageWeatherRain2);
        ImageView ImageWeatherRain2_2 = (ImageView) findViewById(R.id.ImageWeatherRain2_2);

        try
        {
            Bitmap bLinearWeatherArka = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weatherarka.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), bLinearWeatherArka);
            LinearWeatherArka.setBackground(background);

            Bitmap bRelativeWeatherFiltre = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weatherfiltre.png");
            BitmapDrawable background2 = new BitmapDrawable(getResources(), bRelativeWeatherFiltre);
            RelativeWeatherFiltre.setBackground(background2);

            Bitmap bRelativeWeatherFiltre2 = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weatherfiltre.png");
            BitmapDrawable background3 = new BitmapDrawable(getResources(), bRelativeWeatherFiltre2);
            RelativeWeatherFiltre2.setBackground(background3);

            Bitmap bLinearWeatherFiltre = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weatherfiltre.png");
            BitmapDrawable background4 = new BitmapDrawable(getResources(), bLinearWeatherFiltre);
            LinearWeatherFiltre.setBackground(background4);

            Bitmap bLinearWeatherSunny = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weathersunny.png");
            BitmapDrawable background5 = new BitmapDrawable(getResources(), bLinearWeatherSunny);
            LinearWeatherSunny.setBackground(background5);

            Bitmap bImageWeatherSun = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weathersun.png");
            BitmapDrawable background6 = new BitmapDrawable(getResources(), bImageWeatherSun);
            ImageWeatherSun.setBackground(background6);

            Bitmap bImageWeatherSunhalf = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weathersunhalf.png");
            BitmapDrawable background7 = new BitmapDrawable(getResources(), bImageWeatherSunhalf);
            ImageWeatherSunhalf.setBackground(background7);

            Bitmap bImageWeatherSunhalf2 = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weathersunhalf.png");
            BitmapDrawable background8 = new BitmapDrawable(getResources(), bImageWeatherSunhalf2);
            ImageWeatherSunhalf2.setBackground(background8);

            Bitmap bImageWeatherRain = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weatherrain.png");
            BitmapDrawable background9 = new BitmapDrawable(getResources(), bImageWeatherRain);
            ImageWeatherRain.setBackground(background9);

            Bitmap bImageWeatherRain2 = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weatherrain2.png");
            BitmapDrawable background10 = new BitmapDrawable(getResources(), bImageWeatherRain2);
            ImageWeatherRain2.setBackground(background10);

            Bitmap bImageWeatherRain2_2 = getBitmapFromAssets("widget_interface/weather_interfaces/interfaces/interface_1/weatherrain2.png");
            BitmapDrawable background11 = new BitmapDrawable(getResources(), bImageWeatherRain2_2);
            ImageWeatherRain2_2.setBackground(background11);
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
