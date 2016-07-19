package com.example.wqt.iccc2016.qpf;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class WelcomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ImageView mWelcomeImage;
    private TextView mToolbarTitle;
    private ListView mListView;
    private String[] mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();
        mList=getResources().getStringArray(R.array.welcome_list);
        mListView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList));
        mListView.setOnItemClickListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.welcome_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    private void initView() {
        mWelcomeImage=(ImageView) findViewById(R.id.welcome_head_image);
        mToolbarTitle= (TextView) findViewById(R.id.welcome_toolbar_title);
        mListView=(ListView) findViewById(R.id.lv_welcome);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i)
        {
            case 0:
                Intent intentGeneral=new Intent(WelcomeActivity.this,GeneralChairsActivity.class);
                startActivity(intentGeneral);
                break;
            case 1:
                Intent intentTechnical=new Intent(WelcomeActivity.this,TechnicalProgramChairsActivity.class);
                startActivity(intentTechnical);
                break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState)
    {
        //super.onPostCreate(savedInstanceState, persistentState);
        if(!isChild()){
            onTitleChanged(getTitle(),getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color)
    {
        super.onTitleChanged(title, color);
        if(mToolbarTitle!=null){
            mToolbarTitle.setText(title);
        }
    }
}
