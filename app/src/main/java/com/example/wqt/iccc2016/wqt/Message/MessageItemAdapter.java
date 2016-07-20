package com.example.wqt.iccc2016.wqt.Message;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.List;

/**
 * Created by 127-72 on 2016/7/20.
 */
public class MessageItemAdapter extends BaseAdapter{

    private Context mContext;

    private List<MessageBean> mMessageList;

    private LayoutInflater mLayoutInflater;

    public MessageItemAdapter(Context mContext, List<MessageBean> mMessageList) {
        this.mContext = mContext;
        this.mMessageList = mMessageList;
        this.mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mMessageList.size();
    }

    @Override
    public Object getItem(int position) {
        return mMessageList.get(getCount()-1-position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView=null;
        if(convertView==null){
            rootView=mLayoutInflater.inflate(R.layout.item_message_list,null);
        }else {
            rootView=convertView;
        }
        TextView mTextView=null;
        mTextView=(TextView)rootView.findViewById(R.id.message_text_item);
        mTextView.setText(mMessageList.get(getCount()-1-position).title);
        TextView mTextViewContent=null;
        mTextViewContent= (TextView) rootView.findViewById(R.id.message_text_content);
        mTextViewContent.setText(mMessageList.get(getCount()-1-position).description);
        if(mMessageList.get(getCount()-1-position).isRead==false){
            mTextView.setTextColor(Color.BLACK);
            mTextViewContent.setTextColor(Color.BLACK);
        }else{
            mTextView.setTextColor(Color.GRAY);
            mTextViewContent.setTextColor(Color.GRAY);
        }
        return rootView;
    }
}
