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

public class WCSActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Committee> mList = new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wcs);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.wcs_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initWCS();
        mListView.setAdapter(new CommitteeAdapter(WCSActivity.this, R.layout.item_committee, mList));
        //mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initWCS() {
        Committee zhu_han=new Committee(R.drawable.zhu_han,"Zhu Han","Symposium Chair");
        mList.add(zhu_han);
        Committee lingyang_song=new Committee(R.drawable.lingyang_song,"Lingyang Song","Symposium Chair");
        mList.add(lingyang_song);
        Committee xijun_wang=new Committee(R.drawable.xijun_wang,"Xijun Wang","Symposium Chair");
        mList.add(xijun_wang);

    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.wcs_toolbar_title);
        mListView = (ListView) findViewById(R.id.lv_wcs);

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
