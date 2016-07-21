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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class CommitteeMainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] mList;
    private ListView mListView;
    private TextView mToolbarTitle;
    private ImageView mWelcomeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee_main);
        initView();
        mList = getResources().getStringArray(R.array.committee_main_list);
        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mList));
        mListView.setOnItemClickListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.committee_main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initView() {
        mWelcomeImage = (ImageView) findViewById(R.id.committee_main_head_image);
        mToolbarTitle = (TextView) findViewById(R.id.committee_main_toolbar_title);
        mListView = (ListView) findViewById(R.id.lv_committee_main);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i) {
            case 0:
                Intent intentCommittee = new Intent(this, CommitteeActivity.class);
                startActivity(intentCommittee);
                break;
            case 1:
                Intent intentTechnical = new Intent(this, TechnicalProgramCommitteeActivity.class);
                startActivity(intentTechnical);
                break;
            case 2:
                Intent intentSteering=new Intent(this,SteeringCommitteeActivity.class);
                startActivity(intentSteering);
                break;
            /*case 2:
                Intent intentSTC = new Intent(this, STCActivity.class);
                startActivity(intentSTC);
                break;
            case 3:
                Intent intentSPC = new Intent(this, SPCActivity.class);
                startActivity(intentSPC);
                break;
            case 4:
                Intent intentOCSN=new Intent(this,OCSNActivity.class);
                startActivity(intentOCSN);
                break;
            case 5:
                Intent intentNGN=new Intent(this,NGNActivity.class);
                startActivity(intentNGN);
                break;
            case 6:
                Intent intentCCT=new Intent(this,CCTActivity.class);
                startActivity(intentCCT);
                break;
            case 7:
                Intent intentSNBD=new Intent(this,SNBDActivity.class);
                startActivity(intentSNBD);
                break;
            case 8:
                Intent intentWCS=new Intent(this,WCSActivity.class);
                startActivity(intentWCS);
                break;
            case 9:
                Intent intentWNM=new Intent(this,WNMActivity.class);
                startActivity(intentWNM);
                break;
            case 10:
                Intent intentPSC=new Intent(this,PSCActivity.class);
                startActivity(intentPSC);
                break;
            case 11:
                Intent intentMember = new Intent(this, MemberActivity.class);
                startActivity(intentMember);
                break;*/
        }
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
