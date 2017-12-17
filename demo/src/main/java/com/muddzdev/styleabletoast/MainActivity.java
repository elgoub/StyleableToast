package com.muddzdev.styleabletoast;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

import static android.util.TypedValue.COMPLEX_UNIT_SP;

public class MainActivity extends AppCompatActivity {

    private StyleableToast styleableToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Toaster(View v) {
        switch (v.getId()) {
            case R.id.button1:

                new StyleableToast
                        .Builder(this)
                        .text("Saving image...")
                        .textColor(Color.BLACK)
                        .backgroundColor(Color.WHITE)
                        .solidBackground()
                        .length(Toast.LENGTH_LONG)
                        .iconResLeft(R.drawable.ic_airplanemode_inactive_black_24dp)
                        .show();

//                StyleableToast.makeText(this, "Turn off fly mode",Toast.LENGTH_LONG, R.style.defaultStyle).show();
                break;

            case R.id.button2:

                new StyleableToast
                        .Builder(this)
                        .text("Uploading...")
                        .iconResLeft(R.drawable.ic_b)
                        .show();


//                new StyleableToast
//                        .Builder(this)
//                        .text("Hello World")
//                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/b.otf"))
//                        .show();

//                StyleableToast.makeText(this, "Turn off fly mode", R.style.defaultStyle).show();
                //Length set to SHORT. Test default length
//                StyleableToast.makeText(this, "Turn off fly mode", Toast.LENGTH_LONG, R.style.defaultStyle).show();

                //TODO MAKE A BREAKING NEWS TOAST
                //TODO MAKE AN ALERT TOAST
//                new StyleableToast
//                        .Builder(this)
//                        .text("السلام عليكم")
//                        .stroke(1,Color.YELLOW)
//                        .textColor(Color.parseColor("#f2be93"))
//                        .backgroundColor(Color.parseColor("#721C47"))
//                        .show();


//                new StyleableToast
//                        .Builder(this)
//                        .text("New update available")
//                        .textColor(Color.WHITE)
//                        .iconResLeft(R.drawable.ic_file_download)
//                        .backgroundColor(Color.parseColor("#23ad33"))
//                        .show();
                break;

            case R.id.button3:
                new StyleableToast
                        .Builder(this)
                        .text("Battery low!")
                        .iconResLeft(R.drawable.ic_c)
                        .show();

//                new StyleableToast
//                        .Builder(this)
//                        .text("Hello World")
//                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/c.otf"))
//                        .show();

                //Nodes pink

//                new StyleableToast
//                        .Builder(this)
//                        .text("Shopping cart updated")
//                        .textColor(Color.WHITE)
//                        .backgroundColor(Color.parseColor("#ff4d79"))
//                        .show();


                //Soft red:
//
//                new StyleableToast
//                        .Builder(this)
//                        .text("Turn off fly mode")
//                        .textColor(Color.WHITE)
//                        .backgroundColor(Color.parseColor("#eb4a59"))
//                        .show();

                break;

            case R.id.button4:
                new StyleableToast
                        .Builder(this)
                        .text("Access denied")
                        .iconResLeft(R.drawable.ic_d)
                        .show();
//
//                new StyleableToast
//                        .Builder(this)
//                        .text("Hello World")
//                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/f.ttf"))
//                        .show();

                //Facebook blue
//                new StyleableToast
//                        .Builder(this)
//                        .text("Turn off fly mode")
//                        .textColor(Color.WHITE)
//                        .backgroundColor(Color.parseColor("#4267b2"))
//                        .show();


                //Twitter blue
//                new StyleableToast
//                        .Builder(this)
//                        .text("")
//                        .textColor(Color.WHITE)
//                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/arvo.ttf"))
//                        .backgroundColor(Color.parseColor("#6b2a18"))
//                        .show();


                break;

            case R.id.button5:
                new StyleableToast
                        .Builder(this)
                        .text("Hello World")
                        .iconResLeft(R.drawable.ic_e)
                        .show();
//                new StyleableToast
//                        .Builder(this)
//                        .text("Hello World")
//                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/g.ttf"))
//                        .show();
//
//                new StyleableToast
//                        .Builder(this)
//                        .text("Donation sent")
//                        .stroke(1, Color.parseColor("#6441a4"))
//                        .textColor(Color.parseColor("#6441a4"))
//                        .backgroundColor(Color.parseColor("#e8e8e8"))
//                        .show();
                break;

            case R.id.button6:
                new StyleableToast
                        .Builder(this)
                        .text("Hello World")
                        .iconResLeft(R.drawable.ic_f)
                        .show();
//                new StyleableToast
//                        .Builder(this)
//                        .text("Hello World")
//                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/h.otf"))
//                        .show();

//                new StyleableToast
//                        .Builder(this)
//                        .iconResLeft(R.drawable.ic_cloud_upload_black_24dp)
//                        .text("Uploading")
//                        .textColor(Color.WHITE)
//                        .backgroundColor(Color.parseColor("#6441a4"))
//                        .show();
                break;
        }

        if (styleableToast != null) {
            styleableToast.show();
            styleableToast = null;
        }
    }
}
