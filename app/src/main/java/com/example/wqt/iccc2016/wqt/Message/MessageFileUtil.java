package com.example.wqt.iccc2016.wqt.Message;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 * Created by 127-72 on 2016/7/20.
 */
public class MessageFileUtil {

    private String filePath = "data/data/com.example.wqt.iccc2016/record";

    private String fileName = "messageRecord.txt";

    private String fileAbsolutePath = filePath + "/" + fileName;

    private static MessageFileUtil mMessageFileUtilInstance;

    private static  File targetFile;

    private MessageFileUtil() {
        if(targetFile==null){
            targetFile=new File(fileAbsolutePath);
        }
        if(!targetFile.exists()){
            File fileDir=new File(filePath);
            if(fileDir.mkdir()){
                Log.i("dir","dir mk success");
            }else{
                Log.i("dir","dir mk fail");
            }
            try {
                targetFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static MessageFileUtil getInstance() {
        if(mMessageFileUtilInstance==null){
            mMessageFileUtilInstance=new MessageFileUtil();
        }
        return mMessageFileUtilInstance;
    }

    public  synchronized void writeMessage(MessageBean mMessag){
        if(targetFile.isFile()==false)
            return;

        LinkedList<MessageBean> msgList=readMessage();
        if (msgList==null){
            msgList=new LinkedList<>();
        }
        msgList.add(mMessag);

        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream(targetFile));
            oos.writeObject(msgList);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public synchronized  LinkedList<MessageBean> readMessage(){
        LinkedList<MessageBean> msgList=null;
        ObjectInputStream ois=null;
        try{
            ois=new ObjectInputStream(new FileInputStream(targetFile));
            msgList= (LinkedList<MessageBean>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msgList;
    }

    public synchronized void  writeMessage(LinkedList<MessageBean> msgList) {
        if(targetFile.isFile()==false)
            return;

        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream(targetFile));
            oos.writeObject(msgList);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
