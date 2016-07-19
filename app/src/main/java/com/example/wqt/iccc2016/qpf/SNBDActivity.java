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

public class SNBDActivity extends AppCompatActivity {
    private ListView mListView;
    private List<Committee> mList = new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snbd);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.snbd_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initSNBD();
        mListView.setAdapter(new CommitteeAdapter(SNBDActivity.this, R.layout.item_committee, mList));
        //mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initView() {
        mToolbarTitle = (TextView) findViewById(R.id.snbd_toolbar_title);
        mListView = (ListView) findViewById(R.id.lv_snbd);
    }

    private void initSNBD() {
        Committee song_guo=new Committee(R.drawable.song_guo,"Song Guo","Symposium Chair");
        mList.add(song_guo);
        Committee min_chen=new Committee(R.drawable.min_chen,"Min Chen","Symposium Chair");
        mList.add(min_chen);
        Committee pan_hui=new Committee(R.drawable.pan_hui,"Pan Hui","Symposium Chair");
        mList.add(pan_hui);
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
