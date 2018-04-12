package com.tarikhakan.app.interfacebank.user_interface.login_interfaces.interfaces.interface_1;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
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
        setContentView(R.layout.activity_login_interface_1);

        LinearLayout LinearLoginBack = (LinearLayout) findViewById(R.id.LinearLoginBack);

        try
        {
            Bitmap bLinearLoginBack = getBitmapFromAssets("user_interface/login_interfaces/interfaces/interface_1/loginback1.png");
            BitmapDrawable background = new BitmapDrawable(getResources(), bLinearLoginBack);
            LinearLoginBack.setBackground(background);

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
