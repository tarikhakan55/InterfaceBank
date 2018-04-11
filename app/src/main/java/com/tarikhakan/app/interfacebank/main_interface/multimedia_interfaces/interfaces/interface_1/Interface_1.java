package com.tarikhakan.app.interfacebank.main_interface.multimedia_interfaces.interfaces.interface_1;

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
        setContentView(R.layout.activity_interface_1);

        LinearLayout LinearMusicUst = (LinearLayout) findViewById(R.id.LinearMusicUst);
        Button menuButton = (Button) findViewById(R.id.menuButton);
        RelativeLayout relativeMusicSearch = (RelativeLayout) findViewById(R.id.relativeMusicSearch);
        RelativeLayout relativemusicList = (RelativeLayout) findViewById(R.id.relativemusicList);
        LinearLayout LinearmusicAlt = (LinearLayout) findViewById(R.id.LinearmusicAlt);
        RelativeLayout relativeMusicUst = (RelativeLayout) findViewById(R.id.relativeMusicUst);
        Button buttonMusicUser2 = (Button) findViewById(R.id.buttonMusicUser2);
        Button ButtonMusicDown = (Button) findViewById(R.id.ButtonMusicDown);
        RelativeLayout RelativeMusicUst2 = (RelativeLayout) findViewById(R.id.RelativeMusicUst2);
        Button buttonMusicUser1 = (Button) findViewById(R.id.buttonMusicUser1);
        Button ButtonMusicDown2 = (Button) findViewById(R.id.ButtonMusicDown2);
        RelativeLayout relativeMusicUst2 = (RelativeLayout) findViewById(R.id.relativeMusicUst2);
        Button buttonMusicUser2_2 = (Button) findViewById(R.id.buttonMusicUser2_2);
        Button ButtonMusicDown3 = (Button) findViewById(R.id.ButtonMusicDown3);
        RelativeLayout relativeMusicUst3 = (RelativeLayout) findViewById(R.id.relativeMusicUst3);



        try
        {
            Bitmap bLinearMusicUst = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicust.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), bLinearMusicUst);
            LinearMusicUst.setBackground(background);

            Bitmap bmenuButton = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/menu.png");
            BitmapDrawable background2 = new BitmapDrawable(getResources(), bmenuButton);
            menuButton.setBackground(background2);

            Bitmap brelativeMusicSearch = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicsearch.png");
            BitmapDrawable background3 = new BitmapDrawable(getResources(), brelativeMusicSearch);
            relativeMusicSearch.setBackground(background3);

            Bitmap brelativemusicList = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musiclist.png");
            BitmapDrawable background4 = new BitmapDrawable(getResources(), brelativemusicList);
            relativemusicList.setBackground(background4);

            Bitmap bLinearmusicAlt = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicalt.png");
            BitmapDrawable background5 = new BitmapDrawable(getResources(), bLinearmusicAlt);
            LinearmusicAlt.setBackground(background5);

            Bitmap brelativeMusicUst = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicust.png");
            BitmapDrawable background6 = new BitmapDrawable(getResources(), brelativeMusicUst);
            relativeMusicUst.setBackground(background6);

            Bitmap bbuttonMusicUser2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicuser2.png");
            BitmapDrawable background7 = new BitmapDrawable(getResources(), bbuttonMusicUser2);
            buttonMusicUser2.setBackground(background7);

            Bitmap bButtonMusicDown = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicdown.png");
            BitmapDrawable background8 = new BitmapDrawable(getResources(), bButtonMusicDown);
            ButtonMusicDown.setBackground(background8);

            Bitmap bRelativeMusicUst2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicust.png");
            BitmapDrawable background9 = new BitmapDrawable(getResources(), bRelativeMusicUst2);
            RelativeMusicUst2.setBackground(background9);

            Bitmap bbuttonMusicUser1 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicuser1.png");
            BitmapDrawable background10 = new BitmapDrawable(getResources(), bbuttonMusicUser1);
            buttonMusicUser1.setBackground(background10);

            Bitmap bButtonMusicDown2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicdown.png");
            BitmapDrawable background11 = new BitmapDrawable(getResources(), bButtonMusicDown2);
            ButtonMusicDown2.setBackground(background11);

            Bitmap brelativeMusicUst2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicust.png");
            BitmapDrawable background12 = new BitmapDrawable(getResources(), brelativeMusicUst2);
            relativeMusicUst2.setBackground(background12);

            Bitmap bbuttonMusicUser2_2 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicuser2.png");
            BitmapDrawable background13 = new BitmapDrawable(getResources(), bbuttonMusicUser2_2);
            buttonMusicUser2_2.setBackground(background13);

            Bitmap bButtonMusicDown3 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicdown.png");
            BitmapDrawable background14 = new BitmapDrawable(getResources(), bButtonMusicDown3);
            ButtonMusicDown3.setBackground(background14);

            Bitmap brelativeMusicUst3 = getBitmapFromAssets("main_interface/multimedia_interfaces/interfaces/interface_1/musicust.png");
            BitmapDrawable background15 = new BitmapDrawable(getResources(), brelativeMusicUst3);
            relativeMusicUst3.setBackground(background15);
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
