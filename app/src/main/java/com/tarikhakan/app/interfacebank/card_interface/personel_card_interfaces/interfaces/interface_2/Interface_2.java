package com.tarikhakan.app.interfacebank.card_interface.personel_card_interfaces.interfaces.interface_2;

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

public class Interface_2 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personel_card_interface_2);

        LinearLayout Linearpersonelpembeearka = (LinearLayout) findViewById(R.id.Linearpersonelpembeearka);
        ImageView Imageprev = (ImageView) findViewById(R.id.Imageprev);
        ImageView imageplus = (ImageView) findViewById(R.id.imageplus);
        RelativeLayout relativeProfilface = (RelativeLayout) findViewById(R.id.relativeProfilface);
        TextView Textviewtextarka1 = (TextView) findViewById(R.id.Textviewtextarka1);
        TextView Textviewtextarka2 = (TextView) findViewById(R.id.Textviewtextarka2);
        TextView Textviewtextarka3 = (TextView) findViewById(R.id.Textviewtextarka3);
        RelativeLayout relativemultitextarka = (RelativeLayout) findViewById(R.id.relativemultitextarka);
        TextView textViewbutonarka = (TextView) findViewById(R.id.textViewbutonarka);



        try
        {
            Bitmap bLinearpersonelpembeearka = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/personelpembearka.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), bLinearpersonelpembeearka);
            Linearpersonelpembeearka.setBackground(background);

            Bitmap bImageprev = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/prev.png");
            BitmapDrawable background2 = new BitmapDrawable(getResources(), bImageprev);
            Imageprev.setBackground(background2);

            Bitmap bimageplus = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/plus.png");
            BitmapDrawable background3 = new BitmapDrawable(getResources(), bimageplus);
            imageplus.setBackground(background3);

            Bitmap brelativeProfilface = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/profilface.png");
            BitmapDrawable background4 = new BitmapDrawable(getResources(), brelativeProfilface);
            relativeProfilface.setBackground(background4);

            Bitmap bTextviewtextarka1 = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/textarka1.png");
            BitmapDrawable background5 = new BitmapDrawable(getResources(), bTextviewtextarka1);
            Textviewtextarka1.setBackground(background5);

            Bitmap bTextviewtextarka2 = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/textarka2.png");
            BitmapDrawable background6 = new BitmapDrawable(getResources(), bTextviewtextarka2);
            Textviewtextarka2.setBackground(background6);

            Bitmap bTextviewtextarka3 = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/textarka3.png");
            BitmapDrawable background7 = new BitmapDrawable(getResources(), bTextviewtextarka3);
            Textviewtextarka3.setBackground(background7);

            Bitmap brelativemultitextarka = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/multitextarka.png");
            BitmapDrawable background8 = new BitmapDrawable(getResources(), brelativemultitextarka);
            relativemultitextarka.setBackground(background8);

            Bitmap btextViewbutonarka = getBitmapFromAssets("card_interface/personel_card_interfaces/interfaces/interface_2/butonarka.png");
            BitmapDrawable background9 = new BitmapDrawable(getResources(), btextViewbutonarka);
            textViewbutonarka.setBackground(background9);

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
