package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;
import com.example.wqt.iccc2016.qpf.util.Committee;
import com.example.wqt.iccc2016.qpf.util.CommitteeAdapter;

import java.util.ArrayList;
import java.util.List;

public class WNMActivity extends AppCompatActivity {
    private ListView mListView;
    private List<Committee> mList = new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wnm);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.wnm_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initWNM();
        mListView.setAdapter(new CommitteeAdapter(WNMActivity.this, R.layout.item_committee, mList));
        //mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initWNM() {
        Committee honggang_wang=new Committee(R.drawable.honggang_wang,"Honggang Wang","Symposium Chair");
        mList.add(honggang_wang);
        Committee qingchun_chen=new Committee(R.drawable.qingchun_chen,"Qingchun Chen","Symposium Chair");
        mList.add(qingchun_chen);
        Committee yunjian_jia=new Committee(R.drawable.yunjian_jia,"Yunjian Jia","Symposium Chair");
        mList.add(yunjian_jia);
    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.wnm_toolbar_title);
        mListView = (ListView) findViewById(R.id.lv_wnm);

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

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (mToolbarTitle != null) {
            mToolbarTitle.setText(title);
        }
    }

}
