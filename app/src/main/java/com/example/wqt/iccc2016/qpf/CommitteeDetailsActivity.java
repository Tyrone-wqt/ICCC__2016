package com.example.wqt.iccc2016.qpf;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class CommitteeDetailsActivity extends AppCompatActivity {

    private TextView mToolbarTitle;
    private ImageView mHeadImage;
    private TextView mType;
    private TextView mPosition;
    private ImageView mDetailIcon;
    private TextView mName;
    private TextView mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee_details);
        initView();
        initData();
        Toolbar toolbar = (Toolbar) findViewById(R.id.committee_detail_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }

    private void initData() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("committee_name");
        switch (name) {
            case "shaoqian_li":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("General Chair");
                mDetailIcon.setImageResource(R.drawable.shaoqian_li);
                mName.setText("Shaoqian Li");
                mLocation.setText("Professor,UESTC");
                break;
            case "xingsheng_zhang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("General Chair");
                mDetailIcon.setImageResource(R.drawable.xingsheng_zhang);
                mName.setText("Xingsheng Zhang");
                mLocation.setText("VP & Secretary,CIC");
                break;
            case "wei_zhang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publicity Chair");
                mDetailIcon.setImageResource(R.drawable.wei_zhang);
                mName.setText("Wei Zhang");
                mLocation.setText("University of New South Wales,Australia");
                break;
            case "meixia_tao":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publicity Chair");
                mDetailIcon.setImageResource(R.drawable.meixia_tao);
                mName.setText("Meixia Tao");
                mLocation.setText("Shanghai Jiao Tong University,China");
                break;
            case "hongfang_yu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publicity Chair");
                mDetailIcon.setImageResource(R.drawable.hongfang_yu);
                mName.setText("Hongfang Yu");
                mLocation.setText("UESTC,China");
                break;
            case "kun_yang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publicity Chair");
                mDetailIcon.setImageResource(R.drawable.kun_yang);
                mName.setText("Kun Yang");
                mLocation.setText("University of Essex,UK");
                break;
            case "shui_yu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publication Chair");
                mDetailIcon.setImageResource(R.drawable.shui_yu);
                mName.setText("Shui Yu");
                mLocation.setText("Deakin University,Australia");
                break;
            case "kun_wang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publication Chair");
                mDetailIcon.setImageResource(R.drawable.kun_wang);
                mName.setText("Kun Wang");
                mLocation.setText("Nanjing University of P&T,China");
                break;
            case "bin_ma":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Financial Chair");
                mDetailIcon.setImageResource(R.drawable.bin_ma);
                mName.setText("Bin Ma");
                mLocation.setText("China Institute of Communications,China");
                break;
            case "bruce_worthman":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Financial Chair");
                mDetailIcon.setImageResource(R.drawable.bruce_worthman);
                mName.setText("Bruce Worthman");
                mLocation.setText("IEEE ComSoc,USA");
                break;
            case "bo_yan":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Local Arrangement Chair");
                mDetailIcon.setImageResource(R.drawable.bo_yan);
                mName.setText("Bo Yan");
                mLocation.setText("UESTC,China");
                break;
            case "xiaoyan_huang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Local Arrangement Chair");
                mDetailIcon.setImageResource(R.drawable.xiaoyang_huang);
                mName.setText("Xiaoyan Huang");
                mLocation.setText("UESTC,China");
                break;
            case "rongping_lin":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Local Arrangement Chair");
                mDetailIcon.setImageResource(R.drawable.rongping_lin);
                mName.setText("Rongping Lin");
                mLocation.setText("UESTC,China");
                break;
            case "jingran_lin":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Registration Chair");
                mDetailIcon.setImageResource(R.drawable.jingran_lin);
                mName.setText("Jingran Lin");
                mLocation.setText("UESTC,China");
                break;
            case "yue_cao":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Workshop Chair");
                mDetailIcon.setImageResource(R.drawable.yue_cao);
                mName.setText("Yue Cao");
                mLocation.setText("University of Surrey,UK");
                break;
            case "geyong_min":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Workshop Chair");
                mDetailIcon.setImageResource(R.drawable.geyong_min);
                mName.setText("Geyong Min");
                mLocation.setText("University of Exeter,UK");
                break;
            case "sumei_sun":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Tutorial Chair");
                mDetailIcon.setImageResource(R.drawable.sumei_sun);
                mName.setText("Sumei Sun");
                mLocation.setText("I2R, Singapore,Singapore");
                break;
            case "xuming_fang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Tutorial Chair");
                mDetailIcon.setImageResource(R.drawable.xuming);
                mName.setText("Xuming Fang");
                mLocation.setText("Southwest Jiaotong University,China");
                break;
            case "gang_wu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Keynotes Inviting Chair");
                mDetailIcon.setImageResource(R.drawable.gang_wu);
                mName.setText("Gang Wu");
                mLocation.setText("UESTC,China");
                break;
            case "pingyi_fan":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Invited Track Chair");
                mDetailIcon.setImageResource(R.drawable.pingyi_fan);
                mName.setText("Pingyi Fan");
                mLocation.setText("Tsinghua University,China");
                break;
            case "guodong_zhao":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Invited Track Chair");
                mDetailIcon.setImageResource(R.drawable.guodong_zhao);
                mName.setText("Guodong Zhao");
                mLocation.setText("UESTC,China");
                break;
            case "fan_wu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publication Chair");
                mDetailIcon.setImageResource(R.drawable.fan_wu);
                mName.setText("Fan Wu");
                mLocation.setText("UESTC,China");
                break;
            case "yunkai_wei":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Local Arrangement Chair");
                mDetailIcon.setImageResource(R.drawable.yunkai_wei);
                mName.setText("Yunkai Wei");
                mLocation.setText("UESTC,China");
                break;
            case "xuemin_shen":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Chair");
                mDetailIcon.setImageResource(R.drawable.xuemin_shen);
                mName.setText("Xuemin (Sherman) Shen");
                mLocation.setText("University of Waterloo,Canada");
                break;
            case "ke_gong":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Vice Chair");
                mDetailIcon.setImageResource(R.drawable.ke_gong);
                mName.setText("Ke Gong");
                mLocation.setText("Nankai University,China");
                break;
            case "zhen_yang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Vice Chair");
                mDetailIcon.setImageResource(R.drawable.zhen_yang);
                mName.setText("Zhen Yang");
                mLocation.setText("Nanjing University of Posts and Telecommunications,China");
                break;
            case "khaled":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Member");
                mDetailIcon.setImageResource(R.drawable.khaled);
                mName.setText("Khaled B. Letaief");
                mLocation.setText("Hong Kong University of Science and Technology,ComSoc VIP");
                break;
            case "kwang-cheng":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Member");
                mDetailIcon.setImageResource(R.drawable.kwang);
                mName.setText("Kwang-Cheng Chen");
                mLocation.setText("National Taiwan University,Taiwan,China");
                break;
            case "steve_weinstein":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Member");
                mDetailIcon.setImageResource(R.drawable.steve);
                mName.setText("Steve Weinstein");
                mLocation.setText("CTTC Consulting,USA");
                break;
            case "tong_song":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Member");
                mDetailIcon.setImageResource(R.drawable.tong_song);
                mName.setText("Tong Song");
                mLocation.setText("CIC,China");
                break;
            case "yinghai_zhang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Member");
                mDetailIcon.setImageResource(R.drawable.yinghai_zhang);
                mName.setText("Yinghai Zhang");
                mLocation.setText("Beijing University of Posts and Telecommunications,China");
                break;
            case "zhisheng_niu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Member");
                mDetailIcon.setImageResource(R.drawable.zhisheng_niu);
                mName.setText("Zhisheng Niu");
                mLocation.setText("Tsinghua University,China");
                break;
            case "supeng_leng":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.supeng_leng);
                mName.setText("Supeng Leng");
                mLocation.setText("UESTC,China");
                break;
            case "yan_zhang":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.yan_zhang);
                mName.setText("Yan Zhang");
                mLocation.setText("University of Oslo & Simula Research Laboratory,Norway");
                break;
            case "nei_kato":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.nei_kato);
                mName.setText("Nei Kato");
                mLocation.setText("Tohoku University,Japan");
                break;
            case "guang_shi":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.guang_shi);
                mName.setText("Guang Shi");
                mLocation.setText("CIC,China");
                break;

        }

    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.committee_detail_toolbar_title);
        mHeadImage = (ImageView) findViewById(R.id.committee_detail_head_image);
        mType = (TextView) findViewById(R.id.tv_committee_type);
        mPosition = (TextView) findViewById(R.id.tv_committee_position);
        mDetailIcon = (ImageView) findViewById(R.id.iv_committee_detail);
        mName = (TextView) findViewById(R.id.tv_committee_detail_name);
        mLocation = (TextView) findViewById(R.id.tv_committee_detail_location);
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
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        //super.onPostCreate(savedInstanceState, persistentState);
        if (!isChild()) {
            onTitleChanged(getTitle(), getTitleColor());
        }
    }

    /*@Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (mToolbarTitle != null) {
            mToolbarTitle.setText(title);
        }
    }*/
}
