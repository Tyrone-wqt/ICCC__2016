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

public class SPCActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Committee> mList = new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spc);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.spc_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initSPC();
        mListView.setAdapter(new CommitteeAdapter(SPCActivity.this, R.layout.item_committee, mList));
        mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initSPC() {
        Committee xing_zhang=new Committee(R.drawable.xing_zhang,"Xing Zhang","Symposium Chair");
        mList.add(xing_zhang);
        Committee yue_gao=new Committee(R.drawable.yue_gao,"Yue Gao","Symposium Chair");
        mList.add(yue_gao);
        Committee tomohiko=new Committee(R.drawable.tomohiko_taniguchi,"Tomohiko Taniguchi","Symposium Chair");
        mList.add(tomohiko);
    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.spc_toolbar_title);
        mListView = (ListView) findViewById(R.id.lv_spc);
    }

    AdapterView.OnItemClickListener myOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent i0 = new Intent(SPCActivity.this, CommitteeDetailsActivity.class);
                    i0.putExtra("committee_name", "xing_zhang");
                    startActivity(i0);
                    break;
                case 1:
                    Intent i1 = new Intent(SPCActivity.this, CommitteeDetailsActivity.class);
                    i1.putExtra("committee_name", "yue_gao");
                    startActivity(i1);
                    break;
                case 2:
                    Intent i2 = new Intent(SPCActivity.this, CommitteeDetailsActivity.class);
                    i2.putExtra("committee_name", "tomohiko");
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
