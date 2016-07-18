package com.example.wqt.iccc2016.wqt;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;
import com.example.wqt.iccc2016.wqt.Radio.SegmentedRadioGroup;

public class ProgramActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    SegmentedRadioGroup mRadioGroup;
    RadioButton mRadioButtonLeft;
    RadioButton mRadioButtonMiddle;
    RadioButton mRadioButtonRight;
    ViewPager mViewPager;
    TextView mToolbarTitle;
    //ProgressBar mProgressBar;
    //Handler mHandler;
    LinearLayout mLinearLayout;

    //private static final String filePath = "data/data/com.example.wqt.iccc2016/databases/data.db";
    //private static final String pathStr = "data/data/com.example.wqt.iccc2016/databases";
    //private final int BUFFER_SIZE = 4096;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
       // mProgressBar = (ProgressBar) findViewById(R.id.program_progress_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbarTitle = (TextView) findViewById(R.id.program_toolbar_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mLinearLayout= (LinearLayout) findViewById(R.id.program_content_layout);
        /*
        final SharedPreferences mSharedPreference = this.getSharedPreferences("firstSetting", Context.MODE_PRIVATE);
        boolean isBdCopied = mSharedPreference.getBoolean("isDbCopied", false);
        if (isBdCopied == false) {
            copyDb();
        }else{
            mProgressBar.setVisibility(View.INVISIBLE);
            mLinearLayout.setVisibility(View.VISIBLE);
        }
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                //super.handleMessage(msg);
                if (msg.what == 0x03) {
                    mProgressBar.setVisibility(View.INVISIBLE);
                    mLinearLayout.setVisibility(View.VISIBLE);
                    mSharedPreference.edit().putBoolean("firstSetting",true).commit();
                    System.out.println("success");
                }else if(msg.what==0x04){
                    mProgressBar.setVisibility(View.INVISIBLE);
                    mLinearLayout.setVisibility(View.VISIBLE);
                    Toast.makeText(ProgramActivity.this,"Database replication failed",Toast.LENGTH_LONG);
                    System.out.println("fail");
                }
            }
        };
        */
        mRadioGroup = (SegmentedRadioGroup) findViewById(R.id.segment_text);
        mRadioGroup.setOnCheckedChangeListener(this);
        mRadioButtonLeft = (RadioButton) findViewById(R.id.radio_button_left);
        mRadioButtonMiddle = (RadioButton) findViewById(R.id.radio_button_middle);
        mRadioButtonRight = (RadioButton) findViewById(R.id.radio_button_right);


        mViewPager = (ViewPager) findViewById(R.id.program_view_pager);
        mViewPager.setCurrentItem(0);
        mViewPager.setOnPageChangeListener(this);
        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(this);
        mViewPager.setAdapter(myViewPagerAdapter);

    }
    /*
    private void copyDb() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("filePath:" + filePath);
                File jhPath = new File(filePath);
                //查看数据库文件是否存在
                if (jhPath.exists()) {
                    Log.i("test", "存在数据库");
                    //存在则直接返回打开的数据库
                } else {
                    //不存在先创建文件夹
                    File path = new File(pathStr);
                    Log.i("test", "pathStr=" + path);
                    if (path.mkdir()) {
                        Log.i("test", "创建成功");
                    } else {
                        Log.i("test", "创建失败");
                    }

                    try {
                        //得到资源
                        AssetManager am = ProgramActivity.this.getAssets();
                        //得到数据库的输入流
                        InputStream is = am.open("data.db");
                        Log.i("test", is + "");
                        //用输出流写到SDcard上面
                        FileOutputStream fos = new FileOutputStream(jhPath);
                        Log.i("test", "fos=" + fos);
                        Log.i("test", "jhPath=" + jhPath);
                        //创建byte数组  用于1KB写一次
                        byte[] buffer = new byte[BUFFER_SIZE];
                        int count = 0;
                        while ((count = is.read(buffer)) > 0) {
                            Log.i("test", "得到");
                            fos.write(buffer, 0, count);
                        }
                        //最后关闭就可以了
                        fos.flush();
                        fos.close();
                        is.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (jhPath.exists()) {
                    mHandler.sendEmptyMessage(0x03);
                } else {
                    mHandler.sendEmptyMessage(0x04);
                }

            }
        }).start();
    }
       */

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:

                //mRadioGroup.check(R.id.radio_button_left);
                mRadioButtonLeft.setChecked(true);
                break;
            case 1:

                //mRadioGroup.check(R.id.radio_button_middle);
                mRadioButtonMiddle.setChecked(true);
                break;
            case 2:

                //mRadioGroup.check(R.id.radio_button_right);
                mRadioButtonRight.setChecked(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
//        int viewId=v.getId();
//        switch (viewId){
//            case R.id.radio_button_left:
//                mViewPager.setCurrentItem(0,true);
//                break;
//            case R.id.radio_button_middle:
//                mViewPager.setCurrentItem(1,true);
//                break;
//            case R.id.radio_button_right:
//                mViewPager.setCurrentItem(2,true);
//                break;
//        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radio_button_left:
                mViewPager.setCurrentItem(0, true);
                //group.check(R.id.radio_button_left);
                break;
            case R.id.radio_button_middle:
                mViewPager.setCurrentItem(1, true);
                //group.check(R.id.radio_button_middle);
                break;
            case R.id.radio_button_right:
                mViewPager.setCurrentItem(2, true);
                //group.check(R.id.radio_button_right);
                break;
        }
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
