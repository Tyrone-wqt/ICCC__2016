package com.example.wqt.iccc2016.wqt.DBHelper;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 127-72 on 2016/7/16.
 */
public class DBManager {
    private final int BUFFER_SIZE = 4096;
    public static final String DB_NAME = "data.db"; //保存的数据库文件名
    public static final String PACKAGE_NAME = "com.example.wqt.iccc2016";
    public static final String DB_PATH = "/data"
            + Environment.getDataDirectory().getAbsolutePath() + "/"
            + PACKAGE_NAME;  //在手机里存放数据库的位置

    public static final String filePath = "data/data/com.iccc2016.com/databases/data.db";
    public static final String pathStr = "data/data/com.iccc2016.com/databases";
    private SQLiteDatabase database;
    private Context context;

    public DBManager() {

    }

    public void openDatabase(Context mContext) {
        this.database = this.openDatabase(DB_PATH + "/" + DB_NAME, mContext);
    }

    private SQLiteDatabase openDatabase(String dbPath,Context mContext) {
        /*
        try {

            if (!(new File(dbfile).exists())) {
                //判断数据库文件是否存在，若不存在则执行导入，否则直接打开数据库
                Log.i("db", "is not exist");
                InputStream is = mContext.getAssets().open(DB_NAME); //欲导入的数据库
                FileOutputStream fos = new FileOutputStream(dbfile);
                byte[] buffer = new byte[BUFFER_SIZE];
                int count = 0;
                while ((count = is.read(buffer)) > 0) {
                    fos.write(buffer, 0, count);
                }
                fos.flush();
                fos.close();
                is.close();
            }

            SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(dbfile,
                    null);

            return db;
        } catch (FileNotFoundException e) {
            Log.e("Database", "File not found");
            e.printStackTrace();
        } catch (IOException e) {
            Log.e("Database", "IO exception");
            e.printStackTrace();
        }
        return null;*/
        System.out.println("filePath:"+filePath);
        File jhPath=new File(filePath);
        //查看数据库文件是否存在
        if(jhPath.exists()){
            Log.i("test", "存在数据库");
            //存在则直接返回打开的数据库

        }else{
            //不存在先创建文件夹
            File path=new File(pathStr);
            Log.i("test", "pathStr="+path);
            if (path.mkdir()){
                Log.i("test", "创建成功");
            }else{
                Log.i("test", "创建失败");
            };
            try {
                //得到资源
                AssetManager am= mContext.getAssets();
                //得到数据库的输入流
                InputStream is=am.open("data.db");
                Log.i("test", is+"");
                //用输出流写到SDcard上面
                FileOutputStream fos=new FileOutputStream(jhPath);
                Log.i("test", "fos="+fos);
                Log.i("test", "jhPath="+jhPath);
                //创建byte数组  用于1KB写一次
                byte[] buffer=new byte[BUFFER_SIZE];
                int count = 0;
                while((count = is.read(buffer))>0){
                    Log.i("test", "得到");
                    fos.write(buffer,0,count);
                }
                //最后关闭就可以了
                fos.flush();
                fos.close();
                is.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }

        }
        //return null;
        //如果没有这个数据库  我们已经把他写到SD卡上了，然后在执行一次这个方法 就可以返回数据库了
        return SQLiteDatabase.openOrCreateDatabase(jhPath, null);
    }


    public void closeDatabase() {
        if(this.database==null){
            System.out.println("database is null");
            return;
        }

        this.database.close();
    }
}


