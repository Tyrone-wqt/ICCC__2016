package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;
import com.example.wqt.iccc2016.qpf.util.Committee;
import com.example.wqt.iccc2016.qpf.util.CommitteeAdapter;

import java.util.ArrayList;
import java.util.List;

public class STCActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Committee> mList=new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stc);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.stc_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initSTC();
        mListView.setAdapter(new CommitteeAdapter(STCActivity.this, R.layout.item_committee, mList));
        //mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initView() {
        mToolbarTitle=(TextView) findViewById(R.id.stc_toolbar_title);
        mListView=(ListView) findViewById(R.id.lv_stc);
    }

    private void initSTC() {
        Committee chau_yuen=new Committee(R.drawable.chau_yuen,"Chau Yuen","Symposium Chair");
        mList.add(chau_yuen);
        Committee chonggang_wang=new Committee(R.drawable.chonggang_wang,"Chonggang Wang","Symposium Chair");
        mList.add(chonggang_wang);
        Committee yifan_chen=new Committee(R.drawable.yifan_chen,"Yifan Chen","Symposium Chair");
        mList.add(yifan_chen);
        Committee renping_liu=new Committee(R.drawable.renping_liu,"Renping Liu","Symposium Chair");
        mList.add(renping_liu);
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
