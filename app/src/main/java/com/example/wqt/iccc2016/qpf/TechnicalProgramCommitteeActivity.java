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

public class TechnicalProgramCommitteeActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Committee> mList=new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_program_committee);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.technical_program_committee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initTPCCommittee();
        mListView.setAdapter(new CommitteeAdapter(TechnicalProgramCommitteeActivity.this, R.layout.item_committee, mList));
        mListView.setOnItemClickListener(myOnItemClickListener);
    }


    private void initTPCCommittee() {
        Committee supeng_leng=new Committee(R.drawable.supeng_leng,"Supeng Leng","TPC Chair");
        mList.add(supeng_leng);
        Committee yan_zhang=new Committee(R.drawable.yan_zhang,"Yan Zhang","TPC Chair");
        mList.add(yan_zhang);
        Committee nei_kato=new Committee(R.drawable.nei_kato,"Nei Kato","TPC Chair");
        mList.add(nei_kato);
        Committee guang_shi=new Committee(R.drawable.guang_shi,"Guang Shi","TPC Chair");
        mList.add(guang_shi);
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.lv_technical_program_committee);
        mToolbarTitle = (TextView) findViewById(R.id.technical_program_committee_toolbar_title);

    }

    AdapterView.OnItemClickListener myOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent i0 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i0.putExtra("committee_name", "supeng_leng");
                    startActivity(i0);
                    break;
                case 1:
                    Intent i1 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i1.putExtra("committee_name", "yan_zhang");
                    startActivity(i1);
                    break;
                case 2:
                    Intent i2 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i2.putExtra("committee_name", "nei_kato");
                    startActivity(i2);
                    break;
                case 3:
                    Intent i3 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i3.putExtra("committee_name", "guang_shi");
                    startActivity(i3);
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
