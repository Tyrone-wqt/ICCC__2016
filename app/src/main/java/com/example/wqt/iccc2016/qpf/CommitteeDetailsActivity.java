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
                mLocation.setText("Professor,UESTC" + "\n" + "lsq@uestc.edu.cn");
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
                mLocation.setText("University of New South Wales,Australia" + "\n" + "w.zhang@unsw.edu.au");
                break;
            case "meixia_tao":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publicity Chair");
                mDetailIcon.setImageResource(R.drawable.meixia_tao);
                mName.setText("Meixia Tao");
                mLocation.setText("Shanghai Jiao Tong University,China" + "\n" + "mxtao@sjtu.edu.cn");
                break;
            case "hongfang_yu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publicity Chair");
                mDetailIcon.setImageResource(R.drawable.hongfang_yu);
                mName.setText("Hongfang Yu");
                mLocation.setText("UESTC,China" + "\n" + "yuhf@uestc.edu.cn");
                break;
            case "kun_yang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publicity Chair");
                mDetailIcon.setImageResource(R.drawable.kun_yang);
                mName.setText("Kun Yang");
                mLocation.setText("University of Essex,UK" + "\n" + "kunyang@essex.ac.uk");
                break;
            case "shui_yu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publication Chair");
                mDetailIcon.setImageResource(R.drawable.shui_yu);
                mName.setText("Shui Yu");
                mLocation.setText("Deakin University,Australia" + "\n" + "shui.yu@deakin.edu.au");
                break;
            case "kun_wang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Publication Chair");
                mDetailIcon.setImageResource(R.drawable.kun_wang);
                mName.setText("Kun Wang");
                mLocation.setText("Nanjing University of P&T,China" + "\n" + "kwang@njupt.edu.cn");
                break;
            case "bin_ma":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Financial Chair");
                mDetailIcon.setImageResource(R.drawable.bin_ma);
                mName.setText("Bin Ma");
                mLocation.setText("China Institute of Communications,China" + "\n" + "mabin@china-cic.cn");
                break;
            case "bruce_worthman":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Financial Chair");
                mDetailIcon.setImageResource(R.drawable.bruce_worthman);
                mName.setText("Bruce Worthman");
                mLocation.setText("IEEE ComSoc,USA" + "\n" + "b.worthman@comsoc.org");
                break;
            case "bo_yan":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Local Arrangement Chair");
                mDetailIcon.setImageResource(R.drawable.bo_yan);
                mName.setText("Bo Yan");
                mLocation.setText("UESTC,China" + "\n" + "yanboyu@uestc.edu.cn");
                break;
            case "xiaoyan_huang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Local Arrangement Chair");
                mDetailIcon.setImageResource(R.drawable.xiaoyang_huang);
                mName.setText("Xiaoyan Huang");
                mLocation.setText("UESTC,China" + "\n" + "xyhuang@uestc.edu.cn");
                break;
            case "rongping_lin":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Local Arrangement Chair");
                mDetailIcon.setImageResource(R.drawable.rongping_lin);
                mName.setText("Rongping Lin");
                mLocation.setText("UESTC,China" + "\n" + "linrp@uestc.edu.cn");
                break;
            case "jingran_lin":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Registration Chair");
                mDetailIcon.setImageResource(R.drawable.jingran_lin);
                mName.setText("Jingran Lin");
                mLocation.setText("UESTC,China" + "\n" + "jingranlin@uestc.edu.cn");
                break;
            case "yue_cao":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Workshop Chair");
                mDetailIcon.setImageResource(R.drawable.yue_cao);
                mName.setText("Yue Cao");
                mLocation.setText("University of Surrey,UK" + "\n" + "y.cao@surrey.ac.uk");
                break;
            case "geyong_min":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Workshop Chair");
                mDetailIcon.setImageResource(R.drawable.geyong_min);
                mName.setText("Geyong Min");
                mLocation.setText("University of Exeter,UK" + "\n" + "G.Min@exeter.ac.uk");
                break;
            case "sumei_sun":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Tutorial Chair");
                mDetailIcon.setImageResource(R.drawable.sumei_sun);
                mName.setText("Sumei Sun");
                mLocation.setText("I2R, Singapore,Singapore" + "\n" + "sunsm@i2r.a-star.edu.sg");
                break;
            case "xuming_fang":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Tutorial Chair");
                mDetailIcon.setImageResource(R.drawable.xuming);
                mName.setText("Xuming Fang");
                mLocation.setText("Southwest Jiaotong University,China" + "\n" + "xmfang@home.swjtu.edu.cn");
                break;
            case "gang_wu":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Keynotes Inviting Chair");
                mDetailIcon.setImageResource(R.drawable.gang_wu);
                mName.setText("Gang Wu");
                mLocation.setText("UESTC,China" + "\n" + "wugang99@uestc.edu.cn");
                break;
            case "pingyi_fan":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Invited Track Chair");
                mDetailIcon.setImageResource(R.drawable.pingyi_fan);
                mName.setText("Pingyi Fan");
                mLocation.setText("Tsinghua University,China" + "\n" + "fpy@mail.tsinghua.edu.cn");
                break;
            case "guodong_zhao":
                mType.setText("ICCC COMMITTEE");
                mPosition.setText("Invited Track Chair");
                mDetailIcon.setImageResource(R.drawable.guodong_zhao);
                mName.setText("Guodong Zhao");
                mLocation.setText("UESTC,China" + "\n" + "gdngzhao@163.com");
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
                mLocation.setText("Tsinghua University,China" + "\n" + "niuzhs@tsinghua.edu.cn");
                break;
            case "supeng_leng":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.supeng_leng);
                mName.setText("Supeng Leng");
                mLocation.setText("UESTC,China" + "\n" + "spleng@uestc.edu.cn");
                break;
            case "yan_zhang":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.yan_zhang);
                mName.setText("Yan Zhang");
                mLocation.setText("University of Oslo & Simula Research Laboratory,Norway" + "\n" + "yanzhang@simula.no");
                break;
            case "nei_kato":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.nei_kato);
                mName.setText("Nei Kato");
                mLocation.setText("Tohoku University,Japan" + "\n" + "kato@it.ecei.tohoku.ac.jp");
                break;
            case "guang_shi":
                mType.setText("TECHNICAL PROGRAM COMMITTEE");
                mPosition.setText("TPC Chair");
                mDetailIcon.setImageResource(R.drawable.guang_shi);
                mName.setText("Guang Shi");
                mLocation.setText("CIC,China" + "\n" + "shiguang@china-cic.cn");
                break;
            case "chau_yuen":
                mType.setText("Selected Topice in Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.chau_yuen);
                mName.setText("Chau Yuen");
                mLocation.setText("Singapore University of Technology and Design,Singapore" + "\n" + "yuenchau@sutd.edu.sg");
                break;
            case "chonggang_wang":
                mType.setText("Selected Topice in Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.chonggang_wang);
                mName.setText("Chonggang Wang");
                mLocation.setText("InterDigital,USA" + "\n" + "drchongwang@gmail.com");
                break;
            case "yifan_chen":
                mType.setText("Selected Topice in Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.yifan_chen);
                mName.setText("Yifan Chen");
                mLocation.setText("South University of Science and Technology of China,China" + "\n" + "chenyf@sustc.edu.cn");
                break;
            case "renping_liu":
                mType.setText("Selected Topice in Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.renping_liu);
                mName.setText("Renping Liu");
                mLocation.setText("CSIRO,Australia" + "\n" + "Ren.Liu@csiro.au");
                break;
            case "xing_zhang":
                mType.setText("Signal Processing for Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.xing_zhang);
                mName.setText("Xing Zhang");
                mLocation.setText("Beijing University of Posts and Telecommunications,China" + "\n" + "hszhang@bupt.edu.cn");
                break;
            case "yue_gao":
                mType.setText("Signal Processing for Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.yue_gao);
                mName.setText("Yue Gao");
                mLocation.setText("Queen Mary University of London,UK" + "\n" + "yue.gao@qmul.ac.uk");
                break;
            case "tomohiko":
                mType.setText("Signal Processing for Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.tomohiko_taniguchi);
                mName.setText("Tomohiko Taniguchi");
                mLocation.setText("Fujitsu Labs Ltd,Japan" + "\n" + "t-taniguchi@jp.fujitsu.com");
                break;
            case "zhengyuan_xu":
                mType.setText("Optical Communication Systems and Network");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.zhengyuan_xu);
                mName.setText("Zhengyuan Xu");
                mLocation.setText("University of Science and Technology of China,China" + "\n" + "xuzy@ustc.edu.cn");
                break;
            case "jaafar":
                mType.setText("Optical Communication Systems and Network");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.jaafar_elmirghani);
                mName.setText("Jaafar Elmirghani");
                mLocation.setText("University of Leeds,UK" + "\n" + "J.M.H.Elmirghani@leeds.ac.uk");
                break;
            case "chongfu_zhang":
                mType.setText("Optical Communication Systems and Network");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.chongfu_zhang);
                mName.setText("Chongfu Zhang");
                mLocation.setText("UESTC,China" + "\n" + "cfzhang@uestc.edu.cn");
                break;
            case "shiwen_mao":
                mType.setText("Next Generation Networking");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.shiwen_mao);
                mName.setText("Shiwen Mao");
                mLocation.setText("Auburn University,USA" + "\n" + "shiwen.mao@gmail.com");
                break;
            case "lei_shu":
                mType.setText("Next Generation Networking");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.lei_shu);
                mName.setText("Lei Shu");
                mLocation.setText("Guangdong University of Petrochemical Technology,China" + "\n" + "lei.shu@live.ie");
                break;
            case "xiaohong_huang":
                mType.setText("Next Generation Networking");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.xiaohong_huang);
                mName.setText("Xiaohong Huang");
                mLocation.setText("Beijing University of Posts and Telecommunications,China" + "\n" + "huangxh@buptnet.edu.cn");
                break;
            case "jun_fang":
                mType.setText("Communication and Control Theory");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.jun_fang);
                mName.setText("Jun Fang");
                mLocation.setText("UESTC,China" + "\n" + "aquarius.fang@gmail.com");
                break;
            case "carlo":
                mType.setText("Communication and Control Theory");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.carlo);
                mName.setText("Carlo Fischione");
                mLocation.setText("The Royal Institute of Technology,Sweden" + "\n" + "carlofi@kth.se");
                break;
            case "zhiguo_shi":
                mType.setText("Communication and Control Theory");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.zhiguo_shi);
                mName.setText("Zhiguo Shi");
                mLocation.setText("Zhejiang University,China" + "\n" + "shizg@zju.edu.cn");
                break;
            case "song_guo":
                mType.setText("Social Networks and Big Data");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.song_guo);
                mName.setText("Song Guo");
                mLocation.setText("University of Aizu ,Japan" + "\n" + "shizg@zju.edu.cn");
                break;
            case "min_chen":
                mType.setText("Social Networks and Big Data");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.min_chen);
                mName.setText("Min Chen");
                mLocation.setText("Huazhong University of Science and Technology,China" + "\n" + "minchen2012@hust.edu.cn");
                break;
            case "pan_hui":
                mType.setText("Social Networks and Big Data");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.pan_hui);
                mName.setText("Pan Hui");
                mLocation.setText("Hong Kong University of Science and Technology,Hong Kong,China" + "\n" + "panhui@cse.ust.hk");
                break;
            case "zhu_han":
                mType.setText("Wireless Communications Systems");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.zhu_han);
                mName.setText("Zhu Han");
                mLocation.setText("University of Houston,USA" + "\n" + "hanzhu22@gmail.com");
                break;
            case "lingyang_song":
                mType.setText("Wireless Communications Systems");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.lingyang_song);
                mName.setText("Lingyang Song");
                mLocation.setText("Peking University,China" + "\n" + "lingyang.song@gmail.com");
                break;
            case "xijun_wang":
                mType.setText("Wireless Communications Systems");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.xijun_wang);
                mName.setText("Xijun Wang");
                mLocation.setText("Xidian University,China" + "\n" + "hanzhu22@gmail.com");
                break;
            case "honggang_wang":
                mType.setText("Wireless Networking and Multimedia");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.honggang_wang);
                mName.setText("Honggang Wang");
                mLocation.setText("University of Massachusetts Dartmouth,USA" + "\n" + "hwang1@umassd.edu");
                break;
            case "qingchun_chen":
                mType.setText("Wireless Networking and Multimedia");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.qingchun_chen);
                mName.setText("Qingchun Chen");
                mLocation.setText("Southwest Jiaotong University,China" + "\n" + "qcchen@swjtu.edu.cn");
                break;
            case "yunjian_jia":
                mType.setText("Wireless Networking and Multimedia");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.yunjian_jia);
                mName.setText("Yunjian Jia");
                mLocation.setText("Chongqing University,China" + "\n" + "yunjian@cqu.edu.cn");
                break;
            case "xiaojiang_du":
                mType.setText("Privacy and Securety in Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.xiaojiang_du);
                mName.setText("Xiaojiang Du");
                mLocation.setText("Temple University,USA" + "\n" + "xjdu@temple.edu");
                break;
            case "xiangyun_zhou":
                mType.setText("Privacy and Securety in Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.xiangyun_zhou);
                mName.setText("Xiangyun Zhou");
                mLocation.setText("Australia National University,Australia" + "\n" + "xiangyun.zhou@anu.edu.au");
                break;
            case "hongwei_li":
                mType.setText("Privacy and Securety in Communications");
                mPosition.setText("Symposium Chair");
                mDetailIcon.setImageResource(R.drawable.hongwei_li);
                mName.setText("Hongwei Li");
                mLocation.setText("UESTC,China" + "\n" + "hongweili@uestc.edu.cn");
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
