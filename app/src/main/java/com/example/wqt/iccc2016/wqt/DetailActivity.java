package com.example.wqt.iccc2016.wqt;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class DetailActivity extends AppCompatActivity {
    TextView mToolbarTitle;
    WebView mWebView;
    String tableName;
    String keyWord;
    String sessionIndex;
    String htmlFileName;
    final String htmlPrefix="file:///android_asset/htmls/";
    final String htmlSuffix=".html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mToolbarTitle= (TextView) findViewById(R.id.detail_toolbar_title);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mWebView= (WebView) findViewById(R.id.detail_web_view);
        WebSettings settings = mWebView.getSettings();
        settings.setDefaultFontSize(38);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(true);// 允许放大缩小
        settings.setBuiltInZoomControls(true);
        //settings.setBuiltInZoomControls(false);// 显示放大缩小按钮
        settings.setDisplayZoomControls(false);// api 11以上
        settings.setSupportMultipleWindows(false);
        settings.setGeolocationEnabled(false);// 启用地理定位
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        //mWebView.setInitialScale(200);
        mWebView.setHorizontalScrollBarEnabled(false);
        mWebView.setVerticalScrollBarEnabled(false);
        mWebView.setBackgroundColor(Color.TRANSPARENT); // 设置背景色

        Intent receivedIntent=this.getIntent();
        tableName=receivedIntent.getExtras().getString("tableName");
        keyWord=receivedIntent.getExtras().getString("keyWord");
        sessionIndex=receivedIntent.getExtras().getString("sessionIndex");

        if(keyWord!=null){
            htmlFileName=tableName+"-"+keyWord;
        }else{
            htmlFileName=tableName;
        }

        if (sessionIndex!=null){
            htmlFileName=htmlFileName+"-"+sessionIndex;
        }
        mWebView.loadUrl(htmlPrefix+htmlFileName+htmlSuffix);
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
                this.finish();
                break;
            default:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        //super.onPostCreate(savedInstanceState, persistentState);
        if(!isChild()){
            onTitleChanged(getTitle(),getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if(mToolbarTitle!=null){
            mToolbarTitle.setText(title);
        }
    }

}
