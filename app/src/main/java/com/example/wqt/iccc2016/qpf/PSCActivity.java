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
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;
import com.example.wqt.iccc2016.qpf.util.Committee;
import com.example.wqt.iccc2016.qpf.util.CommitteeAdapter;

import java.util.ArrayList;
import java.util.List;

public class PSCActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Committee> mList = new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psc);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.psc_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initPSC();
        mListView.setAdapter(new CommitteeAdapter(PSCActivity.this, R.layout.item_committee, mList));
        mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.psc_toolbar_title);
        mListView = (ListView) findViewById(R.id.lv_psc);

    }

    private void initPSC() {
        Committee xiaojiang_du=new Committee(R.drawable.xiaojiang_du,"Xiaojiang Du","Temple University");
        mList.add(xiaojiang_du);
        Committee xiangyun_zhou=new Committee(R.drawable.xiangyun_zhou,"Xiangyun Zhou","Australia National University");
        mList.add(xiangyun_zhou);
        Committee hongwei_li=new Committee(R.drawable.hongwei_li,"Hongwei Li","UESTC");
        mList.add(hongwei_li);
    }

    AdapterView.OnItemClickListener myOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent i0 = new Intent(PSCActivity.this, CommitteeDetailsActivity.class);
                    i0.putExtra("committee_name", "xiaojiang_du");
                    startActivity(i0);
                    break;
                case 1:
                    Intent i1 = new Intent(PSCActivity.this, CommitteeDetailsActivity.class);
                    i1.putExtra("committee_name", "xiangyun_zhou");
                    startActivity(i1);
                    break;
                case 2:
                    Intent i2 = new Intent(PSCActivity.this, CommitteeDetailsActivity.class);
                    i2.putExtra("committee_name", "hongwei_li");
                    startActivity(i2);
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
