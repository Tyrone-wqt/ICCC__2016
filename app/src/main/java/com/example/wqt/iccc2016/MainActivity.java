package com.example.wqt.iccc2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.wqt.iccc2016.qpf.CommitteeActivity;
import com.example.wqt.iccc2016.qpf.VersionActivity;
import com.example.wqt.iccc2016.qpf.WelcomeActivity;
import com.example.wqt.iccc2016.wqt.HotelAndTravelActivity;
import com.example.wqt.iccc2016.wqt.MyGridViewAdapter;
import com.example.wqt.iccc2016.wqt.PatronActivity;
import com.example.wqt.iccc2016.wqt.ProgramActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    //private static final String filePath = "data/data/com.example.wqt.iccc2016/databases/data.db";
    //private static final String pathStr = "data/data/com.example.wqt.iccc2016/databases";
    //private final int BUFFER_SIZE = 4096;
    GridView mGridView;

    int[] mGridViewImageIds = new int[]{R.string.icon_font_welcome, R.string.icon_font_program, R.string.icon_font_map, R.string.icon_font_patrons, R.string.icon_font_commitee, R.string.icon_font_hotel_and_travel, R.string.icon_font_message, R.string.icon_font_version_update};

    String[] mGridViewTextStrings = new String[]{"Welcome", "Program", "Map", "Patrons", "Commitee", "Hotel/Travel", "Messages", "Version Update"};

    //ProgressBar mProgressBar;

    //Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridView = (GridView) findViewById(R.id.main_gridView);
        MyGridViewAdapter mAdapter = new MyGridViewAdapter(this, mGridViewImageIds, mGridViewTextStrings);
        mGridView.setAdapter(mAdapter);
        mGridView.setOnItemClickListener(this);
        //mProgressBar = (ProgressBar) findViewById(R.id.main_progress);
        //final SharedPreferences mSharedPreference = this.getSharedPreferences("firstSetting", Context.MODE_PRIVATE);
        //boolean isBdCopied = mSharedPreference.getBoolean("isDbCopied", false);
        //if (isBdCopied == false) {
        //    copyDb();
        //}else{
        //    mProgressBar.setVisibility(View.INVISIBLE);
        //    mGridView.setVisibility(View.VISIBLE);
        //}
        //mHandler = new Handler() {
        //    @Override
        //    public void handleMessage(Message msg) {
                //super.handleMessage(msg);
        //        if (msg.what == 0x01) {
         //           mProgressBar.setVisibility(View.INVISIBLE);
        //            mGridView.setVisibility(View.VISIBLE);
        //            mSharedPreference.edit().putBoolean("firstSetting",true).commit();
        //            System.out.println("success");
          //      }else if(msg.what==0x02){
          //          mProgressBar.setVisibility(View.INVISIBLE);
         //           mGridView.setVisibility(View.VISIBLE);
         //           Toast.makeText(MainActivity.this,"Database replication failed",Toast.LENGTH_LONG);
         //           System.out.println("fail");
        //        }
         //   }
        //};
        //DBManager mDBManager = new DBManager();
        //mDBManager.openDatabase(this);
        //mDBManager.closeDatabase();
        //mProgressBar.setVisibility(View.INVISIBLE);
        //mGridView.setVisibility(View.VISIBLE);
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
                        AssetManager am = MainActivity.this.getAssets();
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
                if(jhPath.exists()){
                    mHandler.sendEmptyMessage(0x01);
                }else{
                    mHandler.sendEmptyMessage(0x02);
                }

            }
        }).start();
    }
    */


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            //设置点击事件 intent跳转
            case 0:
                Intent intentForWelcome = new Intent(this, WelcomeActivity.class);
                startActivity(intentForWelcome);
                break;

            case 1:
                Intent intentForProgram = new Intent(this, ProgramActivity.class);
                startActivity(intentForProgram);
                break;
            case 2:
                break;
            case 3:
                Intent intentForPatron = new Intent(this, PatronActivity.class);
                startActivity(intentForPatron);
                break;
            case 4:
                Intent intentForCommittee = new Intent(this, CommitteeActivity.class);
                startActivity(intentForCommittee);
                break;
            case 5:
                Intent intentForHotelAndTravel = new Intent(this, HotelAndTravelActivity.class);
                startActivity(intentForHotelAndTravel);
                break;
            case 6:
                break;
            case 7:
                Intent intentForUpdate = new Intent(this, VersionActivity.class);
                startActivity(intentForUpdate);
                break;
        }
    }
}
