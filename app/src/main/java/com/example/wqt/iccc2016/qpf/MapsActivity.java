package com.example.wqt.iccc2016.qpf;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MapsActivity extends AppCompatActivity {


    private ImageView mWelcomeImage;
    private TextView mToolbarTitle;
    private PhotoViewAttacher mMapAttacher;
    private PhotoViewAttacher mHotelAttacher;
    private ImageView mMapOfHotel;
    private ImageView mHotelAround;
    private TextView mMapText;
    private TextView mHotelText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        initView();
        //Test PhotoView
        Drawable map=getResources().getDrawable(R.drawable.hotel_map);
       // mMapOfHotel.setImageDrawable(map);
        mMapAttacher=new PhotoViewAttacher(mMapOfHotel);
        Drawable hotel=getResources().getDrawable(R.drawable.hotel_around);
        //mHotelAround.setImageDrawable(hotel);
        mHotelAttacher=new PhotoViewAttacher(mHotelAround);
       // mAttacher.update();


        Toolbar toolbar = (Toolbar) findViewById(R.id.maps_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initView() {
        mWelcomeImage=(ImageView) findViewById(R.id.maps_head_image);
        mToolbarTitle= (TextView) findViewById(R.id.maps_toolbar_title);
        mMapOfHotel= (ImageView) findViewById(R.id.iv_map_of_hotel);
        mHotelAround= (ImageView) findViewById(R.id.iv_hotel_around);
        mMapText= (TextView) findViewById(R.id.tv_map_of_hotel);
        mHotelText= (TextView) findViewById(R.id.tv_hotel_around);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState)
    {
        //super.onPostCreate(savedInstanceState, persistentState);
        if(!isChild()){
            onTitleChanged(getTitle(),getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color)
    {
        super.onTitleChanged(title, color);
        if(mToolbarTitle!=null){
            mToolbarTitle.setText(title);
        }
    }

}
