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
import com.example.wqt.iccc2016.wqt.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class CommitteeActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Committee> mGeneralList = new ArrayList<Committee>();
    private List<Committee> mPublicityList = new ArrayList<Committee>();
    private List<Committee> mPublicationList = new ArrayList<Committee>();
    private List<Committee> mFinancialList = new ArrayList<Committee>();
    private List<Committee> mLocalList = new ArrayList<Committee>();
    private List<Committee> mRegistrationList = new ArrayList<Committee>();
    private List<Committee> mWorkshopList = new ArrayList<Committee>();
    private List<Committee> mTutorialList = new ArrayList<Committee>();
    private List<Committee> mKeynotesList = new ArrayList<Committee>();
    private List<Committee> mInvitedList = new ArrayList<Committee>();

    private TextView mToolbarTitle;
    private ListView mGeneralListView;
    private ListView mInvitedListView;
    private ListView mKeynotesListView;
    private ListView mTutorialListView;
    private ListView mPublicityListView;
    private ListView mPublicationListView;
    private ListView mFinancialListView;
    private ListView mLocalListView;
    private ListView mRegistrationListView;
    private ListView mWorkshopListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee);
        initView();
        initCommittee();
        initControl();
        Toolbar toolbar = (Toolbar) findViewById(R.id.committee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.committee_toolbar_title);
        mGeneralListView = (ListView) findViewById(R.id.lv_committee_general);
        mPublicityListView = (ListView) findViewById(R.id.lv_committee_publicity);
        mPublicationListView = (ListView) findViewById(R.id.lv_committee_publication);
        mFinancialListView = (ListView) findViewById(R.id.lv_committee_financial);
        mLocalListView = (ListView) findViewById(R.id.lv_committee_local);
        mRegistrationListView = (ListView) findViewById(R.id.lv_committee_registration);
        mWorkshopListView = (ListView) findViewById(R.id.lv_committee_workshop);
        mTutorialListView = (ListView) findViewById(R.id.lv_committee_tutorial);
        mKeynotesListView = (ListView) findViewById(R.id.lv_committee_keynotes);
        mInvitedListView = (ListView) findViewById(R.id.lv_committee_invited);
    }

    private void initControl() {
        mGeneralListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mGeneralList));
        mPublicityListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mPublicityList));
        mPublicationListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mPublicationList));
        mFinancialListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mFinancialList));
        mLocalListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mLocalList));
        mRegistrationListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mRegistrationList));
        mWorkshopListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mWorkshopList));
        mTutorialListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mTutorialList));
        mKeynotesListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mKeynotesList));
        mPublicityListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mPublicityList));
        mInvitedListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this, R.layout.item_committee, mInvitedList));
        mGeneralListView.setOnItemClickListener(generalClickListener);
        mPublicityListView.setOnItemClickListener(publicityClickListener);
        mPublicationListView.setOnItemClickListener(publicationClickListener);
        mFinancialListView.setOnItemClickListener(financialClickListener);
        mLocalListView.setOnItemClickListener(localClickListener);
        mRegistrationListView.setOnItemClickListener(registrationClickListener);
        mWorkshopListView.setOnItemClickListener(workshopClickListener);
        mTutorialListView.setOnItemClickListener(tutorialClickListener);
        mKeynotesListView.setOnItemClickListener(keynotesClickListener);
        mInvitedListView.setOnItemClickListener(invitedClickListener);
    }


    private void initCommittee() {
        Committee shaoqian_li = new Committee(R.drawable.shaoqian_li, getResources().getString(R.string.committee_shaoqian_li), "UESTC");
        mGeneralList.add(shaoqian_li);
        Committee xingsheng_zhang = new Committee(R.drawable.xingsheng_zhang, getResources().getString(R.string.committee_xingsheng_zhang), "CIC");
        mGeneralList.add(xingsheng_zhang);
        Committee wei_zhang = new Committee(R.drawable.wei_zhang, getResources().getString(R.string.committee_wei_zhang), "University of New South Wales");
        mPublicityList.add(wei_zhang);
        Committee meixia_tao = new Committee(R.drawable.meixia_tao, getResources().getString(R.string.committee_meixia_tao), "Shanghai Jiao Tong University");
        mPublicityList.add(meixia_tao);
        Committee hongfang_yu = new Committee(R.drawable.hongfang_yu, getResources().getString(R.string.committee_hongfang_yu), "UESTC");
        mPublicityList.add(hongfang_yu);
        Committee kun_yang = new Committee(R.drawable.kun_yang, getResources().getString(R.string.committee_kun_yang), "University of Essex");
        mPublicityList.add(kun_yang);
        Committee shui_yu = new Committee(R.drawable.shui_yu, getResources().getString(R.string.committee_shui_yu), "Deakin University");
        mPublicationList.add(shui_yu);
        Committee kun_wang = new Committee(R.drawable.kun_wang, getResources().getString(R.string.committee_kun_wang), "Nanjing University of P&T");
        mPublicationList.add(kun_wang);
        Committee bin_ma = new Committee(R.drawable.bin_ma, getResources().getString(R.string.committee_bin_ma), "China Institute of Communications");
        mFinancialList.add(bin_ma);
        Committee bruce_worthman = new Committee(R.drawable.bruce_worthman, getResources().getString(R.string.committee_bruce), "IEEE ComSoc");
        mFinancialList.add(bruce_worthman);
        Committee bo_yan = new Committee(R.drawable.bo_yan, getResources().getString(R.string.committee_bo_yan), "UESTC");
        mLocalList.add(bo_yan);
        Committee xiaoyan_huang = new Committee(R.drawable.xiaoyang_huang, getResources().getString(R.string.committee_xiaoyan_huang), "UESTC");
        mLocalList.add(xiaoyan_huang);
        Committee rongping_lin = new Committee(R.drawable.rongping_lin, getResources().getString(R.string.committee_rongping_lin), "UESTC");
        mLocalList.add(rongping_lin);
        Committee jingran_lin = new Committee(R.drawable.jingran_lin, getResources().getString(R.string.committee_jingran_lin), "UESTC");
        mRegistrationList.add(jingran_lin);
        Committee yue_cao = new Committee(R.drawable.yue_cao, getResources().getString(R.string.committee_yue_cao), "University of Surrey");
        mWorkshopList.add(yue_cao);
        Committee geyong_min = new Committee(R.drawable.geyong_min, getResources().getString(R.string.committee_geyong_min), "University of Exeter");
        mWorkshopList.add(geyong_min);
        Committee sumei_sun = new Committee(R.drawable.sumei_sun, getResources().getString(R.string.committee_sumei_sun), "I2R, Singapore");
        mTutorialList.add(sumei_sun);
        Committee xuming_fang = new Committee(R.drawable.xuming, getResources().getString(R.string.committee_xuming_fang), "Southwest Jiaotong University");
        mTutorialList.add(xuming_fang);
        Committee gang_wu = new Committee(R.drawable.gang_wu, getResources().getString(R.string.committee_gang_wu), "UESTC");
        mKeynotesList.add(gang_wu);
        Committee pingyi_fan = new Committee(R.drawable.pingyi_fan, getResources().getString(R.string.committee_pingyi_fan), "Tsinghua University");
        mInvitedList.add(pingyi_fan);
        Committee guodong_zhao = new Committee(R.drawable.guodong_zhao, getResources().getString(R.string.committee_guodong_zhao), "UESTC");
        mInvitedList.add(guodong_zhao);
        Committee fan_wu = new Committee(R.drawable.fan_wu, getResources().getString(R.string.committee_fan_wu), "UESTC");
        mPublicationList.add(fan_wu);
        Committee yunkai_wei = new Committee(R.drawable.yunkai_wei, getResources().getString(R.string.committee_yunkai_wei), "UESTC");
        mLocalList.add(yunkai_wei);


    }


    AdapterView.OnItemClickListener generalClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {

                case 0:
                    Intent intent0 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent0.putExtra("committee_name", "shaoqian_li");
                    startActivity(intent0);
                    break;
                case 1:
                    Intent intent1 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent1.putExtra("committee_name", "xingsheng_zhang");
                    startActivity(intent1);
                    break;
            }
        }
    };

    AdapterView.OnItemClickListener publicityClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {

                case 0:
                    Intent intent2 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent2.putExtra("committee_name", "wei_zhang");
                    startActivity(intent2);
                    break;
                case 1:
                    Intent intent3 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent3.putExtra("committee_name", "meixia_tao");
                    startActivity(intent3);
                    break;
                case 2:
                    Intent intent4 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent4.putExtra("committee_name", "hongfang_yu");
                    startActivity(intent4);
                    break;
                case 3:
                    Intent intent5 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent5.putExtra("committee_name", "kun_yang");
                    startActivity(intent5);
                    break;
            }
        }
    };

    AdapterView.OnItemClickListener publicationClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {

                case 0:
                    Intent intent6 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent6.putExtra("committee_name", "shui_yu");
                    startActivity(intent6);
                    break;
                case 1:
                    Intent intent7 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent7.putExtra("committee_name", "kun_wang");
                    startActivity(intent7);
                case 2:
                    Intent intent21 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent21.putExtra("committee_name", "fan_wu");
                    startActivity(intent21);
                    break;
            }
        }
    };

    AdapterView.OnItemClickListener financialClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent intent8 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent8.putExtra("committee_name", "bin_ma");
                    startActivity(intent8);
                    break;
                case 1:
                    Intent intent9 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent9.putExtra("committee_name", "bruce_worthman");
                    startActivity(intent9);
                    break;
            }
        }
    };

    AdapterView.OnItemClickListener localClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent intent10 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent10.putExtra("committee_name", "bo_yan");
                    startActivity(intent10);
                    break;
                case 1:
                    Intent intent11 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent11.putExtra("committee_name", "xiaoyan_huang");
                    startActivity(intent11);
                    break;
                case 2:
                    Intent intent12 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent12.putExtra("committee_name", "rongping_lin");
                    startActivity(intent12);
                    break;
                case 3:
                    Intent intent22 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent22.putExtra("committee_name", "yunkai_wei");
                    startActivity(intent22);
                    break;
            }
        }
    };

    AdapterView.OnItemClickListener registrationClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            Intent intent13 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
            intent13.putExtra("committee_name", "jingran_lin");
            startActivity(intent13);

        }
    };

    AdapterView.OnItemClickListener workshopClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent intent14 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent14.putExtra("committee_name", "yue_cao");
                    startActivity(intent14);
                    break;
                case 1:
                    Intent intent15 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent15.putExtra("committee_name", "geyong_min");
                    startActivity(intent15);
                    break;
            }
        }
    };

    AdapterView.OnItemClickListener tutorialClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent intent16 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent16.putExtra("committee_name", "sumei_sun");
                    startActivity(intent16);
                    break;
                case 1:
                    Intent intent17 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent17.putExtra("committee_name", "xuming_fang");
                    startActivity(intent17);
                    break;
            }
        }
    };

    AdapterView.OnItemClickListener keynotesClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent18 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
            intent18.putExtra("committee_name", "gang_wu");
            startActivity(intent18);

        }
    };

    AdapterView.OnItemClickListener invitedClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent intent19 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent19.putExtra("committee_name", "pingyi_fan");
                    startActivity(intent19);
                    break;
                case 1:
                    Intent intent20 = new Intent(CommitteeActivity.this, CommitteeDetailsActivity.class);
                    intent20.putExtra("committee_name", "guodong_zhao");
                    startActivity(intent20);
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
