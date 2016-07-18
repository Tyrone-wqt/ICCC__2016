package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.List;

public class CommitteeActivity extends AppCompatActivity
{

    private ListView mLisetView;
    private List<Committee> mList=new ArrayList<Committee>();
    TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.committee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initCommittee();
        mLisetView.setAdapter(new CommitteeAdapter(CommitteeActivity.this,R.layout.item_committee,mList));
    }

    private void initCommittee() {
        Committee general=new Committee("General Chairs","—Shaoqian Li"+"\n"+"University of Electronic Science and Technology of China"+"\n"+"\n"
                +"—Xinsheng Zhang"+"\n"+"VP & Secretary, CIC");
        mList.add(general);
        Committee technical=new Committee("Technical Program Chairs","—Supeng Leng"+"\n"+"University of Electronic Science and Technology of China"+"\n"+"\n"
                +"—Yan Zhang"+"\n"+"Simula Research Lab & University of Oslo, Norway"+"\n"+"\n"
                +"—Nei Kato"+"\n"+"Tohoku University, Japan"+"\n"+"\n"
                +"—Guang Shi"+"\n"+"CIC");
        mList.add(technical);
        Committee steering =new Committee("Steering Committee","—Xuemin (Sherman) Shen"+"\n"+"University of Waterloo, Canada"+"\n"+"\n"
                +"—Ke Gong"+"\n"+"Nankai University, China"+"\n"+"\n"
                +"—Zhen Yang"+"\n"+" Nanjing University of Posts and Telecommunications, China"+"\n"+"\n"
                +"—Khaled B. Letaief"+"\n"+"Hong Kong University of Science and Technology"+"\n"+"\n"
                +"—Kwang-Cheng Chen"+"\n"+"National Taiwan University, China"+"\n"+"\n"
                +"—Steve Weinstein"+"\n"+"CTTC Consulting, US"+"\n"+"\n"
                +"—Tong Song"+"\n"+"CIC Deputy Secretary-General"+"\n"+"\n"
                +"—Yinghai Zhang"+"\n"+"Beijing University of Posts and Telecommunications, China"+"\n"+"\n"
                +"—Zhisheng Niu"+"\n"+"Tsinghua University, China");
        mList.add(steering);
        Committee publicity=new Committee("Publicity Chairs","—Wei Zhang"+"\n"+"The University of New South Wales, Australia"+"\n"+"\n"
                +"—Meixia Tao"+"\n"+"Shanghai Jiao Tong University, China"+"\n"+"\n"
                +"—Hongfang Yu"+"\n"+"University of Electronic Science and Technology of China"+"\n"+"\n"
                +"—Kun Yang"+"\n"+"University of Essex, UK");
        mList.add(publicity);
        Committee publication=new Committee("Publication Chairs","—Shui Yu"+"\n"+"Deakin University, Australia"+"\n"+"\n"
                +"—Kun Wang"+"\n"+"Nanjing University of Posts and Telecommunications, China");
        mList.add(publication);
        Committee local=new Committee("Local Arrangement Chairs","—Bo Yan"+"\n"+"University of Electronic Science and Technology of China"+"\n"+"\n"
                +"—Xiaoyan Huang"+"\n"+"University of Electronic Science and Technology of China"+"\n"+"\n"
                +"—Rongping Lin"+"\n"+"University of Electronic Science and Technology of China");
        mList.add(local);
        Committee tutorial=new Committee("Tutorial Chairs","—Sumei Sun"+"\n"+"I2R, Singapore"+"\n"+"\n"
                +"—Xuming Fang"+"\n"+"Southwest Jiaotong University, China");
        mList.add(tutorial);
        Committee workshop=new Committee("Workshop Chairs","—Yue Cao"+"\n"+"University of Surrey, UK"+"\n"+"\n"
                +"—Geyong Min"+"\n"+"University of Exeter, UK");
        mList.add(workshop);
        Committee keynotes=new Committee("Keynotes Inviting Chair","—Gang Wu"+"\n"+"University of Electronic Science and Technology of China");
        mList.add(keynotes);
        Committee invited =new Committee("Invited Track Chairs","—Pingyi Fan"+"\n"+"Tsinghua University, China"+"\n"+"\n"
                +"—Guodong Zhao"+"\n"+"University of Electronic Science and Technology of China");
        mList.add(invited);
        Committee financial=new Committee("Financial Chairs","—Bin Ma"+"\n"+"China Institute of Communications"+"\n"+"\n"
                +"—Bruce Worthman"+"\n"+"IEEE ComSoc");
        mList.add(financial);
        Committee registration=new Committee("Registration Chair","—Jingran Lin"+"\n"+"University of Electronic Science and Technology of China");
        mList.add(registration);
        Committee student=new Committee("Student Travel Grant Selecting Co-chairs","—Erwu Liu"+"\n"+"Tongji University, China"+"\n"+"\n"
                +"—Stephan Wang"+"\n"+"Toshiba, UK");
        mList.add(student);
    }

    private void initView()
    {
        mLisetView= (ListView) findViewById(R.id.lv_committee);
        mToolbarTitle= (TextView) findViewById(R.id.committee_toolbar_title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.show_pic, menu);
        return true;
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
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        //super.onPostCreate(savedInstanceState, persistentState);
        if(!isChild()){
            onTitleChanged(getTitle(),getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if(mToolbarTitle!=null){
            mToolbarTitle.setText(title);
        }
    }


}
