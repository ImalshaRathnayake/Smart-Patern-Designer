package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import top.defaults.colorpicker.ColorPickerPopup;
import org.json.JSONObject;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.transform.Result;

public class Activity2 extends AppCompatActivity {

    /*
     7 6 5 4 3 2 1 0
     8 9 10 11 12 13 14 15
     23 22 21 20 19 18 17 16
     24 25 26 27 28 29 30 31
     39 38 37 36 35 34 33 32
     40 41 42 43 44 45 46 47
     55 54 53 52 51 50 49 48
     56 57 58 59 60 61 62 63
    */


    GridLayout gridLayout;

    // view box to preview the selected color
    private View mColorPreview;

    // this is the default color of the preview box
    private int mDefaultColor;

    String ipAddress;

    // two buttons to open color picker dialog and one to, set the color for GFG text
    private Button mSetColorButton,mClrColorButton, mPickColorButton, mExamplesButton;
    private Button m00,m01, m02,m03,m04,m05,m06,m07;
    private Button m08,m09, m10,m11,m12,m13,m14,m15;
    private Button m16,m17, m18,m19,m20,m21,m22,m23;
    private Button m24,m25, m26,m27,m28,m29,m30,m31;
    private Button m32,m33, m34,m35,m36,m37,m38,m39;
    private Button m40,m41, m42,m43,m44,m45,m46,m47;
    private Button m48,m49, m50,m51,m52,m53,m54,m55;
    private Button m56,m57, m58,m59,m60,m61,m62,m63;

    int[] example1 = {9,10,13,14,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,38,37,36,35,34,33,42,43,44,45,52,51};
    int[] example2 = {0,1,2,3,4,5,6,7,9,10,11,12,13,14,18,19,20,21,27,28,35,36,42,43,44,45,49,50,51,52,53,54,56,57,58,59,60,61,62,63};

    int[] example3 = {0,1,2,3,4,5,6,7,8,15,16,18,19,20,21,23,24,26,29,31,32,34,37,39,40,42,43,44,45,47,48,55,56,57,58,59,60,61,62,63};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);



        Intent intent = getIntent();
        if (intent != null) {
            ipAddress = getIntent().getStringExtra("ipAddress");
            System.out.println("the ip address is :"+ipAddress);
        }

        gridLayout = findViewById(R.id.gridLayout);
        mPickColorButton = findViewById(R.id.pick_color_button);
        mSetColorButton = findViewById(R.id.set_color_button);
        mClrColorButton = findViewById(R.id.clear_color_button);
        mExamplesButton = findViewById(R.id.example_button);

        m00 = findViewById(R.id.button_00);
        m01 = findViewById(R.id.button_01);
        m02 = findViewById(R.id.button_02);
        m03 = findViewById(R.id.button_03);
        m04 = findViewById(R.id.button_04);
        m05 = findViewById(R.id.button_05);
        m06 = findViewById(R.id.button_06);
        m07 = findViewById(R.id.button_07);
        m08 = findViewById(R.id.button_08);
        m09 = findViewById(R.id.button_09);
        m10 = findViewById(R.id.button_10);
        m11 = findViewById(R.id.button_11);
        m12 = findViewById(R.id.button_12);
        m13 = findViewById(R.id.button_13);
        m14 = findViewById(R.id.button_14);
        m15 = findViewById(R.id.button_15);
        m16 = findViewById(R.id.button_16);
        m17 = findViewById(R.id.button_17);
        m18 = findViewById(R.id.button_18);
        m19 = findViewById(R.id.button_19);
        m20 = findViewById(R.id.button_20);
        m21 = findViewById(R.id.button_21);
        m22 = findViewById(R.id.button_22);
        m23 = findViewById(R.id.button_23);
        m24 = findViewById(R.id.button_24);
        m25 = findViewById(R.id.button_25);
        m26 = findViewById(R.id.button_26);
        m27 = findViewById(R.id.button_27);
        m28 = findViewById(R.id.button_28);
        m29 = findViewById(R.id.button_29);
        m30 = findViewById(R.id.button_30);
        m31 = findViewById(R.id.button_31);
        m32 = findViewById(R.id.button_32);
        m33 = findViewById(R.id.button_33);
        m34 = findViewById(R.id.button_34);
        m35 = findViewById(R.id.button_35);
        m36 = findViewById(R.id.button_36);
        m37 = findViewById(R.id.button_37);
        m38 = findViewById(R.id.button_38);
        m39 = findViewById(R.id.button_39);
        m40 = findViewById(R.id.button_40);
        m41 = findViewById(R.id.button_41);
        m42 = findViewById(R.id.button_42);
        m43 = findViewById(R.id.button_43);
        m44 = findViewById(R.id.button_44);
        m45 = findViewById(R.id.button_45);
        m46 = findViewById(R.id.button_46);
        m47 = findViewById(R.id.button_47);
        m48 = findViewById(R.id.button_48);
        m49 = findViewById(R.id.button_49);
        m50 = findViewById(R.id.button_50);
        m51 = findViewById(R.id.button_51);
        m52 = findViewById(R.id.button_52);
        m53 = findViewById(R.id.button_53);
        m54 = findViewById(R.id.button_54);
        m55 = findViewById(R.id.button_55);
        m56 = findViewById(R.id.button_56);
        m57 = findViewById(R.id.button_57);
        m58 = findViewById(R.id.button_58);
        m59 = findViewById(R.id.button_59);
        m60 = findViewById(R.id.button_60);
        m61 = findViewById(R.id.button_61);
        m62 = findViewById(R.id.button_62);
        m63 = findViewById(R.id.button_63);


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
                            changeLEDColor(i, mDefaultColor);
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
                            button.setBackgroundColor(Color.parseColor("#000000"));
                            mColorPreview.setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(i, Color.parseColor("#000000"));
                        }
                    }
                });

        mExamplesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Activity2.this, v);
                popupMenu.inflate(R.menu.menu_items);

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.example1:
                                // Code for example 1
                                for(int i=0;i< example1.length;i++){
                                    Button button = (Button) gridLayout.getChildAt(example1[i]);
                                    button .setBackgroundColor(Color.parseColor("#FF0000"));
                                    changeLEDColor(example1[i], Color.parseColor("#FF0000"));
                                }
                                return true;
                            case R.id.example2:
                                // Code for example 2
                                for(int i=0;i< example2.length;i++){
                                    Button button = (Button) gridLayout.getChildAt(example2[i]);
                                    button .setBackgroundColor(Color.parseColor("#FFFF00"));
                                    changeLEDColor(example2[i], Color.parseColor("#FFFF00"));
                                }
                                return true;
                            case R.id.example3:
                                // Code for example 3
                                for(int i=0;i< example3.length;i++){
                                    Button button = (Button) gridLayout.getChildAt(example3[i]);
                                    button .setBackgroundColor(Color.parseColor("#00FF00"));
                                    changeLEDColor(example3[i], Color.parseColor("#00FF00"));
                                }
                                return true;
                            default:
                                return false;
                        }
                    }
                });

                popupMenu.show();
            }
        });


        m00.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(0);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(7, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(7, mDefaultColor);
                        }
                        isColored=!isColored;

                    }
                });
        m01.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(1);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(6, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(6, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m02.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(2);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(5, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(5, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m03.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(3);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(4, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(4, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m04.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(4);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(3, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(3, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m05.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(5);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(2, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(2, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m06.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(6);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(1, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(1, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m07.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(7);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(0, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(0, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m08.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(8);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(8, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(8, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m09.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(9);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(9, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(9, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m10.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(10);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(10, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(10, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m11.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(11);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(11, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(11, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m12.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(12);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(12, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(12, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m13.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(13);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(13, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(13, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m14.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(14);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(14, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(14, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m15.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(15);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(15, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(15, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m16.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(16);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(23, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(23, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m17.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(17);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(22, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(22, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m18.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(18);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(21, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(21, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m19.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(19);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(20, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(20, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m20.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(20);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(19, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(19, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m21.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(21);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(18, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(18, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m22.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(22);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(17, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(17, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m23.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(23);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(16, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(16, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m24.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(24);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(24, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(24, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m25.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(25);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(25, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(25, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m26.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(26);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(26, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(26, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m27.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(27);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(27, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(27, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m28.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(28);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(28, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(28, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m29.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(29);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(29, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(29, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m30.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(30);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(30, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(30, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m31.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(31);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(31, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(31, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m32.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(32);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(39, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(39, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m33.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(33);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(38, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(38, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m34.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(34);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(37, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(37, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m35.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(35);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(36, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(36, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m36.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(36);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(35, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(35, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m37.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(37);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(34, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(34, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m38.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(38);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(33, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(33, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m39.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(39);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(32, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(32, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m40.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(40);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(40, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(40, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m41.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(41);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(41, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(41, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m42.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(42);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(42, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(42, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m43.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(43);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(43, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(43, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m44.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(44);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(44, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(44, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m45.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(45);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(45, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(45, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m46.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(46);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(46, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(46, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m47.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(47);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(47, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(47, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m48.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(48);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(55, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(55, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m49.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(49);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(54, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(54, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m50.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(50);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(53, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(53, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m51.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(51);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(52, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(52, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m52.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(52);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(51, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(51, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m53.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(53);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(50, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(50, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m54.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(54);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(49, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(49, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m55.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(55);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(48, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(48, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m56.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(56);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(56, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(56, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m57.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(57);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(57, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(57, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m58.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(58);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(58, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(58, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m59.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(59);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(59, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(59, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m60.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(60);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(60, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(60, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m61.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(61);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(61, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(61, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m62.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(62);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(62, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(62, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });
        m63.setOnClickListener(
                new View.OnClickListener() {
                    boolean isColored = false;
                    @Override
                    public void onClick(View v) {
                        // now change the value of the GFG text
                        // as well.

                        Button button = (Button) gridLayout.getChildAt(63);
                        if(isColored){
                            button .setBackgroundColor(Color.parseColor("#000000"));
                            changeLEDColor(63, Color.parseColor("#000000"));
                        }
                        else{
                            button .setBackgroundColor(mDefaultColor);
                            changeLEDColor(63, mDefaultColor);
                        }
                        isColored=!isColored;
                    }
                });


    }

    public void changeLEDColor(int button, int color) {
        ChangeLEDColorTask task = new ChangeLEDColorTask();
        task.execute(button, color);

    }


    private class ChangeLEDColorTask extends AsyncTask<Integer, Void, Void> {

        @Override
        protected Void doInBackground(Integer... params) {
            int button = params[0];
            int color = params[1];
            String url = "http://"+ipAddress+"/color-and-button"; // Replace <ESP32-IP-ADDRESS> with the IP address of your ESP32

            try {
                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();

                // Set request method
                con.setRequestMethod("POST");

                // Set request headers
                con.setRequestProperty("Content-Type", "application/json");

                // Set request body
                JSONObject requestBody = new JSONObject();
                requestBody.put("button", button);
                requestBody.put("color", color);
                String requestBodyString = requestBody.toString();

                // Send request
                con.setDoOutput(true);
                OutputStream os = con.getOutputStream();
                os.write(requestBodyString.getBytes());
                os.flush();
                os.close();

                // Get response
                int responseCode = con.getResponseCode();
                String responseMessage = con.getResponseMessage();
                System.out.println("Response code: " + responseCode);
                System.out.println("Response message: " + responseMessage);

            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }
    }


}
