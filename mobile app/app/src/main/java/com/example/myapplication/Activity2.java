package com.example.myapplication;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import top.defaults.colorpicker.ColorPickerPopup;
import static com.example.myapplication.Activity1.ipAddress;
public class Activity2 extends AppCompatActivity  {

    GridLayout gridLayout;

    // view box to preview the selected color
    private View mColorPreview;

    // this is the default color of the preview box
    private int mDefaultColor;

    // two buttons to open color picker dialog and one to, set the color for GFG text
    private Button mSetColorButton,mClrColorButton, mPickColorButton;
    private Button m01,m02, m03,m04,m05,m06,m07,m08;
    private Button m09,m10, m11,m12,m13,m14,m15,m16;
    private Button m17,m18, m19,m20,m21,m22,m23,m24;
    private Button m25,m26, m27,m28,m29,m30,m31,m32;
    private Button m33,m34, m35,m36,m37,m38,m39,m40;
    private Button m41,m42, m43,m44,m45,m46,m47,m48;
    private Button m49,m50, m51,m52,m53,m54,m55,m56;
    private Button m57,m58, m59,m60,m61,m62,m63,m64;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        gridLayout = findViewById(R.id.gridLayout);
        mPickColorButton = findViewById(R.id.pick_color_button);
        mSetColorButton = findViewById(R.id.set_color_button);
        mClrColorButton = findViewById(R.id.clear_color_button);

        m01 = findViewById(R.id.button_00);
        m02 = findViewById(R.id.button_01);
        m03 = findViewById(R.id.button_02);
        m04 = findViewById(R.id.button_03);
        m05 = findViewById(R.id.button_04);
        m06 = findViewById(R.id.button_05);
        m07 = findViewById(R.id.button_06);
        m08 = findViewById(R.id.button_07);
        m09 = findViewById(R.id.button_08);
        m10 = findViewById(R.id.button_09);
        m11 = findViewById(R.id.button_10);
        m12 = findViewById(R.id.button_11);
        m13 = findViewById(R.id.button_12);
        m14 = findViewById(R.id.button_13);
        m15 = findViewById(R.id.button_14);
        m16 = findViewById(R.id.button_15);
        m17 = findViewById(R.id.button_16);
        m18 = findViewById(R.id.button_17);
        m19 = findViewById(R.id.button_18);
        m20 = findViewById(R.id.button_19);
        m21 = findViewById(R.id.button_20);
        m22 = findViewById(R.id.button_21);
        m23 = findViewById(R.id.button_22);
        m24 = findViewById(R.id.button_23);
        m25 = findViewById(R.id.button_24);
        m26 = findViewById(R.id.button_25);
        m27 = findViewById(R.id.button_26);
        m28 = findViewById(R.id.button_27);
        m29 = findViewById(R.id.button_28);
        m30 = findViewById(R.id.button_29);
        m31 = findViewById(R.id.button_30);
        m32 = findViewById(R.id.button_31);
        m33 = findViewById(R.id.button_32);
        m34 = findViewById(R.id.button_33);
        m35 = findViewById(R.id.button_34);
        m36 = findViewById(R.id.button_35);
        m37 = findViewById(R.id.button_36);
        m38 = findViewById(R.id.button_37);
        m39 = findViewById(R.id.button_38);
        m40 = findViewById(R.id.button_39);
        m41 = findViewById(R.id.button_40);
        m42 = findViewById(R.id.button_41);
        m43 = findViewById(R.id.button_42);
        m44 = findViewById(R.id.button_43);
        m45 = findViewById(R.id.button_44);
        m46 = findViewById(R.id.button_45);
        m47 = findViewById(R.id.button_46);
        m48 = findViewById(R.id.button_47);
        m49 = findViewById(R.id.button_48);
        m50 = findViewById(R.id.button_49);
        m51 = findViewById(R.id.button_50);
        m52 = findViewById(R.id.button_51);
        m53 = findViewById(R.id.button_52);
        m54 = findViewById(R.id.button_53);
        m55 = findViewById(R.id.button_54);
        m56 = findViewById(R.id.button_55);
        m57 = findViewById(R.id.button_56);
        m58 = findViewById(R.id.button_57);
        m59 = findViewById(R.id.button_58);
        m60 = findViewById(R.id.button_59);
        m61 = findViewById(R.id.button_60);
        m62 = findViewById(R.id.button_61);
        m63 = findViewById(R.id.button_62);
        m64 = findViewById(R.id.button_63);


        // and also register the view which shows the
        // preview of the color chosen by the user
        mColorPreview = findViewById(R.id.preview_selected_color);

        // set the default color to 0 as it is black
        mDefaultColor = 0;

        // handling the Pick Color Button to open color
        // picker dialog
        mPickColorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        new ColorPickerPopup.Builder(Activity2.this).initialColor(
                                        Color.RED) // set initial color
                                // of the color
                                // picker dialog
                                .enableBrightness(
                                        true) // enable color brightness
                                // slider or not
                                .enableAlpha(
                                        true) // enable color alpha
                                // changer on slider or
                                // not
                                .okTitle(
                                        "Choose") // this is top right
                                // Choose button
                                .cancelTitle(
                                        "Cancel") // this is top left
                                // Cancel button which
                                // closes the
                                .showIndicator(
                                        true) // this is the small box
                                // which shows the chosen
                                // color by user at the
                                // bottom of the cancel
                                // button
                                .showValue(
                                        true) // this is the value which
                                // shows the selected
                                // color hex code
                                // the above all values can be made
                                // false to disable them on the
                                // color picker dialog.
                                .build()
                                .show(
                                        v,
                                        new ColorPickerPopup.ColorPickerObserver() {
                                            @Override
                                            public void
                                            onColorPicked(int color) {
                                                // set the color
                                                // which is returned
                                                // by the color
                                                // picker
                                                mDefaultColor = color;

                                                // now as soon as
                                                // the dialog closes
                                                // set the preview
                                                // box to returned
                                                // color
                                                mColorPreview.setBackgroundColor(mDefaultColor);
                                            }
                                        });
                    }
                });

        // handling the Set Color button to set the selected
        // color for the GFG text.
        mSetColorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        for (int i = 0; i < gridLayout.getChildCount(); i++) {
                            Button button = (Button) gridLayout.getChildAt(i);
                            button.setBackgroundColor(mDefaultColor);
                        }
                    }
                });

        mClrColorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        for (int i = 0; i < gridLayout.getChildCount(); i++) {
                            Button button = (Button) gridLayout.getChildAt(i);
                            button.setBackgroundColor(Color.parseColor("#FF6200EE"));
                            mColorPreview.setBackgroundColor(Color.parseColor("#FF6200EE"));
                        }
                    }
                });

        m01.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(0);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m02.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(1);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m03.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(2);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m04.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(3);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m05.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(4);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m06.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(5);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m07.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(6);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m08.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(7);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m09.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(8);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(9);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(10);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(11);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(12);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(13);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(14);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(15);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(16);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(17);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(18);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(19);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m21.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(20);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m22.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(21);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m23.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(22);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m24.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(23);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m25.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(24);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m26.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(25);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m27.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(26);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m28.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(27);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m29.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(28);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m30.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(29);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m31.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(30);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m32.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(31);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m33.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(32);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m34.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(33);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m35.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(34);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m36.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(35);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m37.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(36);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m38.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(37);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m39.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(38);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m40.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(39);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m41.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(40);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m42.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(41);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m43.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(42);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m44.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(43);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m45.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(44);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m46.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(45);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m47.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(46);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m48.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(47);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m49.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(48);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m50.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(49);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m51.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(50);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m52.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(51);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m53.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(52);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m54.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(53);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m55.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(54);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m56.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(55);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m57.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(56);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m58.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(57);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m59.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(58);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m60.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(59);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m61.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(60);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m62.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(61);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m63.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(62);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
        m64.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(63);
                        button .setBackgroundColor(mDefaultColor);

                    }
                });
    }

}