package com.tarikhakan.app.interfacebank.card_interface.personel_card_interfaces.interfaces.interface_1;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tarikhakan.app.interfacebank.R;

import java.io.IOException;
import java.io.InputStream;

public class Interface_1 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personel_card_interface_1);

        LinearLayout LinearUstMavi = (LinearLayout) findViewById(R.id.LinearUstMavi);
        Button ButtonLogoSol = (Button) findViewById(R.id.ButtonLogoSol);
        Button ButtonMenu = (Button) findViewById(R.id.ButtonMenu);
        ImageView ImageProfile = (ImageView) findViewById(R.id.ImageProfile);


        try
        {
            Bitmap bLinearUstMavi = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_1/ustmavi.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), bLinearUstMavi);
            LinearUstMavi.setBackground(background);

            Bitmap bButtonLogoSol = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_1/logosol.png");
            BitmapDrawable background2 = new BitmapDrawable(getResources(), bButtonLogoSol);
            ButtonLogoSol.setBackground(background2);

            Bitmap bButtonMenu = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_1/menu.png");
            BitmapDrawable background3 = new BitmapDrawable(getResources(), bButtonMenu);
            ButtonMenu.setBackground(background3);

            Bitmap bImageProfile = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_1/profil.png");
            BitmapDrawable background4 = new BitmapDrawable(getResources(), bImageProfile);
            ImageProfile.setBackground(background4);

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
