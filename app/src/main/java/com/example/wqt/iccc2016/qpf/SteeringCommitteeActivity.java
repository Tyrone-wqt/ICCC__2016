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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.MainActivity;
import com.example.wqt.iccc2016.R;
import com.example.wqt.iccc2016.qpf.util.Committee;
import com.example.wqt.iccc2016.qpf.util.CommitteeAdapter;

import java.util.ArrayList;
import java.util.List;

import android.view.View.OnClickListener;

public class SteeringCommitteeActivity extends AppCompatActivity {

    private TextView mToolbarTitle;

    private ListView mChairListView;
    private ListView mViceListView;
    private ListView mMemberListView;

    private List<Committee> mChairList = new ArrayList<Committee>();
    private List<Committee> mViceChairList = new ArrayList<Committee>();
    private List<Committee> mMemberList = new ArrayList<Committee>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steering_committee);
        Toolbar toolbar = (Toolbar) findViewById(R.id.steering_committee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initView();
        initDatas();
        initControl();

    }

    private void initView()
    {
        mToolbarTitle = (TextView) findViewById(R.id.steering_committee_toolbar_title);
        mChairListView = (ListView) findViewById(R.id.lv_steering_chair);
        mViceListView = (ListView) findViewById(R.id.lv_steering__vice_chair);
        mMemberListView = (ListView) findViewById(R.id.lv_steering__member);
    }

    private void initControl()
    {
        mChairListView.setAdapter(new CommitteeAdapter(SteeringCommitteeActivity.this, R.layout.item_committee, mChairList));
        mViceListView.setAdapter(new CommitteeAdapter(SteeringCommitteeActivity.this, R.layout.item_committee, mViceChairList));
        mMemberListView.setAdapter(new CommitteeAdapter(SteeringCommitteeActivity.this, R.layout.item_committee, mMemberList));
        mChairListView.setOnItemClickListener(chairOnItemClickListener);
        mViceListView.setOnItemClickListener(viceOnItemClickListener);
        mMemberListView.setOnItemClickListener(memberOnItemClickListener);
    }

    AdapterView.OnItemClickListener chairOnItemClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent23=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
            intent23.putExtra("committee_name","xuemin_shen");
            startActivity(intent23);
        }
    };

    AdapterView.OnItemClickListener viceOnItemClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i)
            {
                case 0:
                    Intent intent24=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent24.putExtra("committee_name","ke_gong");
                    startActivity(intent24);
                    break;
                case 1:
                    Intent intent25=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent25.putExtra("committee_name","zhen_yang");
                    startActivity(intent25);
                    break;
            }
        }
    };


    private void initDatas()
    {
        Committee xuemin_shen = new Committee(R.drawable.xuemin_shen, getResources().getString(R.string.committee_xuemin_shen), "University of Waterloo");
        mChairList.add(xuemin_shen);
        Committee ke_gong = new Committee(R.drawable.ke_gong, getResources().getString(R.string.committee_ke_gong), "Nankai University");
        mViceChairList.add(ke_gong);
        Committee zhen_yang = new Committee(R.drawable.zhen_yang, getResources().getString(R.string.committee_zhen_yang), "Nanjing University of Posts and Telecommunications");
        mViceChairList.add(zhen_yang);
        Committee khaled = new Committee(R.drawable.khaled, getResources().getString(R.string.committee_khaled), "Hong Kong University of Science and Technology");
        mMemberList.add(khaled);
        Committee kwang = new Committee(R.drawable.kwang, getResources().getString(R.string.committee_kwang), "National Taiwan University");
        mMemberList.add(kwang);
        Committee steve = new Committee(R.drawable.steve, getResources().getString(R.string.committee_steve), "CTTC Consulting");
        mMemberList.add(steve);
        Committee tong_song = new Committee(R.drawable.tong_song, getResources().getString(R.string.committee_tong_song), "CIC");
        mMemberList.add(tong_song);
        Committee yinghai_zhang = new Committee(R.drawable.yinghai_zhang, getResources().getString(R.string.committee_yinghai_zhang), "Beijing University of Posts and Telecommunications");
        mMemberList.add(yinghai_zhang);
        Committee zhisheng_niu = new Committee(R.drawable.zhisheng_niu, getResources().getString(R.string.committee_zhisheng_niu), "Tsinghua University");
        mMemberList.add(zhisheng_niu);
    }

    AdapterView.OnItemClickListener memberOnItemClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i)
            {
                case 0:
                    Intent intent26=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent26.putExtra("committee_name","khaled");
                    startActivity(intent26);
                    break;
                case 1:
                    Intent intent27=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent27.putExtra("committee_name","kwang-cheng");
                    startActivity(intent27);
                    break;
                case 2:
                    Intent intent28=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent28.putExtra("committee_name","steve_weinstein");
                    startActivity(intent28);
                    break;
                case 3:
                    Intent intent29=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent29.putExtra("committee_name","tong_song");
                    startActivity(intent29);
                    break;
                case 4:
                    Intent intent30=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
                    intent30.putExtra("committee_name","yinghai_zhang");
                    startActivity(intent30);
                    break;
                case 5:
                    Intent intent31=new Intent(SteeringCommitteeActivity.this,CommitteeDetailsActivity.class);
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
