package com.example.wqt.iccc2016.qpf;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;
import com.example.wqt.iccc2016.qpf.util.Committee;
import com.example.wqt.iccc2016.qpf.util.CommitteeAdapter;

import java.util.ArrayList;
import java.util.List;

public class CommitteeActivity extends AppCompatActivity
{

    private ListView mListView;
    private List<Committee> mList=new ArrayList<Committee>();

    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.committee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initCommittee();
        mListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mList));
        mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.lv_committee);
        mToolbarTitle = (TextView) findViewById(R.id.committee_toolbar_title);
    }


    private void initCommittee() {
        Committee shaoqian_li = new Committee(R.drawable.shaoqian_li, getResources().getString(R.string.committee_shaoqian_li), "General Chair");
        mList.add(shaoqian_li);
        Committee xingsheng_zhang = new Committee(R.drawable.xingsheng_zhang, getResources().getString(R.string.committee_xingsheng_zhang), "General Chair");
        mList.add(xingsheng_zhang);
        Committee wei_zhang = new Committee(R.drawable.wei_zhang, getResources().getString(R.string.committee_wei_zhang), "Publicity Chair");
        mList.add(wei_zhang);
        Committee meixia_tao = new Committee(R.drawable.meixia_tao, getResources().getString(R.string.committee_meixia_tao), "Publicity Chair");
        mList.add(meixia_tao);
        Committee hongfang_yu = new Committee(R.drawable.hongfang_yu, getResources().getString(R.string.committee_hongfang_yu), "Publicity Chair");
        mList.add(hongfang_yu);
        Committee kun_yang = new Committee(R.drawable.kun_yang, getResources().getString(R.string.committee_kun_yang), "Publicity Chair");
        mList.add(kun_yang);
        Committee shui_yu = new Committee(R.drawable.shui_yu, getResources().getString(R.string.committee_shui_yu), "Publication Chair");
        mList.add(shui_yu);
        Committee kun_wang = new Committee(R.drawable.kun_wang, getResources().getString(R.string.committee_kun_wang), "Publication Chair");
        mList.add(kun_wang);
        Committee bin_ma = new Committee(R.drawable.bin_ma, getResources().getString(R.string.committee_bin_ma), "Financial Chair");
        mList.add(bin_ma);
        Committee bruce_worthman = new Committee(R.drawable.bruce_worthman, getResources().getString(R.string.committee_bruce), "Financial Chair");
        mList.add(bruce_worthman);
        Committee bo_yan = new Committee(R.drawable.bo_yan, getResources().getString(R.string.committee_bo_yan), "Local Arrangement");
        mList.add(bo_yan);
        Committee xiaoyan_huang = new Committee(R.drawable.xiaoyang_huang, getResources().getString(R.string.committee_xiaoyan_huang), "Local Arrangement");
        mList.add(xiaoyan_huang);
        Committee rongping_lin = new Committee(R.drawable.rongping_lin, getResources().getString(R.string.committee_rongping_lin), "Local Arrangement");
        mList.add(rongping_lin);
        Committee jingran_lin = new Committee(R.drawable.jingran_lin, getResources().getString(R.string.committee_jingran_lin), "Registration Chair");
        mList.add(jingran_lin);
        Committee yue_cao = new Committee(R.drawable.yue_cao, getResources().getString(R.string.committee_yue_cao), "Workshop Chair");
        mList.add(yue_cao);
        Committee geyong_min = new Committee(R.drawable.geyong_min, getResources().getString(R.string.committee_geyong_min), "Workshop Chair");
        mList.add(geyong_min);
        Committee sumei_sun = new Committee(R.drawable.sumei_sun, getResources().getString(R.string.committee_sumei_sun), "Tutorial Chair");
        mList.add(sumei_sun);
        Committee xuming_fang = new Committee(R.drawable.xuming, getResources().getString(R.string.committee_xuming_fang), "Tutorial Chair");
        mList.add(xuming_fang);
        Committee gang_wu = new Committee(R.drawable.gang_wu, getResources().getString(R.string.committee_gang_wu), "Keynotes Inviting Chair");
        mList.add(gang_wu);
        Committee pingyi_fan = new Committee(R.drawable.pingyi_fan, getResources().getString(R.string.committee_pingyi_fan), "Invited Track Chair");
        mList.add(pingyi_fan);
        Committee guodong_zhao = new Committee(R.drawable.guodong_zhao, getResources().getString(R.string.committee_guodong_zhao), "Invited Track Chair");
        mList.add(guodong_zhao);
        Committee fan_wu = new Committee(R.drawable.fan_wu, getResources().getString(R.string.committee_fan_wu), "Publication Chair");
        mList.add(fan_wu);
        Committee yunkai_wei = new Committee(R.drawable.yunkai_wei, getResources().getString(R.string.committee_yunkai_wei), "Local Arrangement Chair");
        mList.add(yunkai_wei);
        Committee xuemin_shen = new Committee(R.drawable.xuemin_shen, getResources().getString(R.string.committee_xuemin_shen), "Chair");
        mList.add(xuemin_shen);
        Committee ke_gong = new Committee(R.drawable.ke_gong, getResources().getString(R.string.committee_ke_gong), "Vice Chair");
        mList.add(ke_gong);
        Committee zhen_yang = new Committee(R.drawable.zhen_yang, getResources().getString(R.string.committee_zhen_yang), "Vice Chair");
        mList.add(zhen_yang);
        Committee khaled = new Committee(R.drawable.khaled, getResources().getString(R.string.committee_khaled), "Member");
        mList.add(khaled);
        Committee kwang = new Committee(R.drawable.kwang, getResources().getString(R.string.committee_kwang), "Member");
        mList.add(kwang);
        Committee steve = new Committee(R.drawable.steve, getResources().getString(R.string.committee_steve), "Member");
        mList.add(steve);
        Committee tong_song = new Committee(R.drawable.tong_song, getResources().getString(R.string.committee_tong_song), "Member");
        mList.add(tong_song);
        Committee yinghai_zhang = new Committee(R.drawable.yinghai_zhang, getResources().getString(R.string.committee_yinghai_zhang), "Member");
        mList.add(yinghai_zhang);
        Committee zhisheng_niu = new Committee(R.drawable.zhisheng_niu, getResources().getString(R.string.committee_zhisheng_niu), "Member");
        mList.add(zhisheng_niu);

    }





    AdapterView.OnItemClickListener myOnItemClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i)
            {
                case 0:
                    Intent intent0=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent0.putExtra("committee_name","shaoqian_li");
                    startActivity(intent0);
                    break;
                case 1:
                    Intent intent1=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent1.putExtra("committee_name","xingsheng_zhang");
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent2=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent2.putExtra("committee_name","wei_zhang");
                    startActivity(intent2);
                    break;
                case 3:
                    Intent intent3=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent3.putExtra("committee_name","meixia_tao");
                    startActivity(intent3);
                    break;
                case 4:
                    Intent intent4=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent4.putExtra("committee_name","hongfang_yu");
                    startActivity(intent4);
                    break;
                case 5:
                    Intent intent5=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent5.putExtra("committee_name","kun_yang");
                    startActivity(intent5);
                    break;
                case 6:
                    Intent intent6=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent6.putExtra("committee_name","shui_yu");
                    startActivity(intent6);
                    break;
                case 7:
                    Intent intent7=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent7.putExtra("committee_name","kun_wang");
                    startActivity(intent7);
                    break;
                case 8:
                    Intent intent8=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent8.putExtra("committee_name","bin_ma");
                    startActivity(intent8);
                    break;
                case 9:
                    Intent intent9=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent9.putExtra("committee_name","bruce_worthman");
                    startActivity(intent9);
                    break;
                case 10:
                    Intent intent10=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent10.putExtra("committee_name","bo_yan");
                    startActivity(intent10);
                    break;
                case 11:
                    Intent intent11=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent11.putExtra("committee_name","xiaoyan_huang");
                    startActivity(intent11);
                    break;
                case 12:
                    Intent intent12=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent12.putExtra("committee_name","rongping_lin");
                    startActivity(intent12);
                    break;
                case 13:
                    Intent intent13=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent13.putExtra("committee_name","jingran_lin");
                    startActivity(intent13);
                    break;
                case 14:
                    Intent intent14=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent14.putExtra("committee_name","yue_cao");
                    startActivity(intent14);
                    break;
                case 15:
                    Intent intent15=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent15.putExtra("committee_name","geyong_min");
                    startActivity(intent15);
                    break;
                case 16:
                    Intent intent16=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent16.putExtra("committee_name","sumei_sun");
                    startActivity(intent16);
                    break;
                case 17:
                    Intent intent17=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent17.putExtra("committee_name","xuming_fang");
                    startActivity(intent17);
                    break;
                case 18:
                    Intent intent18=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent18.putExtra("committee_name","gang_wu");
                    startActivity(intent18);
                    break;
                case 19:
                    Intent intent19=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent19.putExtra("committee_name","pingyi_fan");
                    startActivity(intent19);
                    break;
                case 20:
                    Intent intent20=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent20.putExtra("committee_name","guodong_zhao");
                    startActivity(intent20);
                    break;
                case 21:
                    Intent intent21=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent21.putExtra("committee_name","fan_wu");
                    startActivity(intent21);
                    break;
                case 22:
                    Intent intent22=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent22.putExtra("committee_name","yunkai_wei");
                    startActivity(intent22);
                    break;
                case 23:
                    Intent intent23=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent23.putExtra("committee_name","xuemin_shen");
                    startActivity(intent23);
                    break;
                case 24:
                    Intent intent24=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent24.putExtra("committee_name","ke_gong");
                    startActivity(intent24);
                    break;
                case 25:
                    Intent intent25=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent25.putExtra("committee_name","zhen_yang");
                    startActivity(intent25);
                    break;
                case 26:
                    Intent intent26=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent26.putExtra("committee_name","khaled");
                    startActivity(intent26);
                    break;
                case 27:
                    Intent intent27=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent27.putExtra("committee_name","kwang-cheng");
                    startActivity(intent27);
                    break;
                case 28:
                    Intent intent28=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent28.putExtra("committee_name","steve_weinstein");
                    startActivity(intent28);
                    break;
                case 29:
                    Intent intent29=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent29.putExtra("committee_name","tong_song");
                    startActivity(intent29);
                    break;
                case 30:
                    Intent intent30=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent30.putExtra("committee_name","yinghai_zhang");
                    startActivity(intent30);
                    break;
                case 31:
                    Intent intent31=new Intent(CommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent31.putExtra("committee_name","zhisheng_niu");
                    startActivity(intent31);
                    break;
            }
        }
    };

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

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (mToolbarTitle != null) {
            mToolbarTitle.setText(title);
        }
    }

}
