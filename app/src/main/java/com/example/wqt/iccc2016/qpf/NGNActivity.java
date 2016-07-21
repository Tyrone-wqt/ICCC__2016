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

public class NGNActivity extends AppCompatActivity {
    private ListView mListView;
    private List<Committee> mList = new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngn);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.ngn_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initNGN();
        mListView.setAdapter(new CommitteeAdapter(NGNActivity.this, R.layout.item_committee, mList));
        mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initNGN() {
        Committee shiwen_mao=new Committee(R.drawable.shiwen_mao,"Shiwen Mao","Auburn University");
        mList.add(shiwen_mao);
        Committee lei_shu=new Committee(R.drawable.lei_shu,"Lei Shu","Guangdong University of Petrochemical Technology");
        mList.add(lei_shu);
        Committee xiaohong_huang=new Committee(R.drawable.xiaohong_huang,"Xiaohong Huang","Beijing University of Posts and Telecommunications");
        mList.add(xiaohong_huang);
    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.ngn_toolbar_title);
        mListView = (ListView) findViewById(R.id.lv_ngn);

    }

    AdapterView.OnItemClickListener myOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent i0 = new Intent(NGNActivity.this, CommitteeDetailsActivity.class);
                    i0.putExtra("committee_name", "shiwen_mao");
                    startActivity(i0);
                    break;
                case 1:
                    Intent i1 = new Intent(NGNActivity.this, CommitteeDetailsActivity.class);
                    i1.putExtra("committee_name", "lei_shu");
                    startActivity(i1);
                    break;
                case 2:
                    Intent i2 = new Intent(NGNActivity.this, CommitteeDetailsActivity.class);
                    i2.putExtra("committee_name", "xiaohong_huang");
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
