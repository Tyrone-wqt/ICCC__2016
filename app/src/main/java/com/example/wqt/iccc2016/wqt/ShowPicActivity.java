package com.example.wqt.iccc2016.wqt;

import android.annotation.TargetApi;
import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;

import com.example.wqt.iccc2016.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import uk.co.senab.photoview.PhotoViewAttacher;


public class ShowPicActivity extends AppCompatActivity {

    //private DisplayMetrics dm;
    int dwidth;
    int dheight;
    private int orientation;

    public ProgressBar progressBar;
    PhotoViewAttacher mAttacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pic);
        // Show the Up button in the action bar.
        //setupActionBar();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        // create our manager instance after the content view is set
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        // enable status bar tint
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setTintResource(R.color.colorBlack);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);

        final ImageView view = (ImageView) findViewById(R.id.BigImage);

        final String source = getIntent().getExtras().getString("picUrl");
        Log.i("PicShow","source is"+source);

        progressBar = (ProgressBar) findViewById(R.id.leadProgressBar);
        view.setVisibility(ImageView.GONE);

        Display display = getWindowManager().getDefaultDisplay();
        dwidth = display.getWidth();
        dheight = display.getHeight();

        if (dwidth > dheight) {
            orientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;  //横屏
        } else {
            orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;  //竖屏
        }
        AssetManager assets = getAssets();
        InputStream is = null;

        try {
            is = assets.open(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmap = BitmapFactory.decodeStream(is, null, options);

        //ImageView image = (ImageView) findViewById(R.id.tushow);
        view.setImageBitmap(bitmap);
        mAttacher=new PhotoViewAttacher(view);
        view.setVisibility(View.VISIBLE);
        mAttacher.update();



        //view.setOnClickListener(new View.OnClickListener() {

           // @Override
           // public void onClick(View v) {
                //Intent i = new Intent(ShowPicActivity.this, MainActivity.class);
                //startActivity(i);
                //finish();
            //}
        //});

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAttacher.cleanup();
    }

    public Bitmap reSizePicture(String path) {
        Bitmap resizedBitmap = null;
        Bitmap bitmapOrg = null;
        try {
            InputStream a = getAssets().open(path);
            bitmapOrg = BitmapFactory.decodeStream(a);
            a.close();
//            int width = bitmapOrg.getWidth();
//            int height = bitmapOrg.getHeight();
//
//
//            int newWidth = dwidth;
//            int newHeight = dwidth * bitmapOrg.getHeight() / bitmapOrg.getWidth();
//
//            if (newWidth > width && newHeight > height) {
//                // calculate the scale - in this case = 0.4f
//                float scaleWidth = ((float) newWidth) / width;
//                float scaleHeight = ((float) newHeight) / height;
//
//                // createa matrix for the manipulation
//                Matrix matrix = new Matrix();
//                // resize the bit map
//                matrix.postScale(scaleWidth, scaleHeight);
//
//                resizedBitmap = Bitmap.createBitmap(bitmapOrg, 0, 0, width,
//                        height, matrix, true);
//            } else {
//                resizedBitmap = bitmapOrg;
//            }
            resizedBitmap=bitmapOrg;
        } catch (MalformedURLException e1) {
            e1.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }
        return resizedBitmap;

    }


    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.setRequestedOrientation(orientation);
    }

    protected void onResume() {
        orientation = ActivityInfo.SCREEN_ORIENTATION_USER;
        this.setRequestedOrientation(orientation);
        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
        if (width > height) {
            orientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        } else {
            orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        }
        super.onResume();
    }

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setupActionBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.show_pic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. Use NavUtils to allow users
                // to navigate up one level in the application structure. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back
                //
                //NavUtils.navigateUpFromSameTask(this);
                this.finish();
                break;
            default:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
