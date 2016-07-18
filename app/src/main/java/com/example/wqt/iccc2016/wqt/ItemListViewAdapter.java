package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.List;
import java.util.Map;

/**
 * Created by 127-72 on 2016/7/6.
 */
public class ItemListViewAdapter extends BaseAdapter{
    Context mContext;
    LayoutInflater mLayoutInflater;
    List<String> mTimeLine;
    Map<Integer,List<String>> mTimeLineContentMap;
    Drawable mSpacer;

    public ItemListViewAdapter(Context mContext,List<String> mTimeLine,Map<Integer,List<String>> mTimeLineContentMap){
        this.mContext=mContext;
        mLayoutInflater= (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mTimeLine=mTimeLine;
        this.mTimeLineContentMap=mTimeLineContentMap;
        this.mSpacer=this.mContext.getResources().getDrawable(R.drawable.spacer_small);
    }
    @Override
    public int getCount() {
        return mTimeLine.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        LinearLayout mLinearContainer;
        //if(convertView==null){
            itemView=mLayoutInflater.inflate(R.layout.item_list_program_activity,null);
        //}else{
            //itemView=convertView;
        //}
        mLinearContainer= (LinearLayout) itemView.findViewById(R.id.time_item_container);
        //mLinearContainer.setDividerDrawable(mSpacer);
        ((TextView)itemView.findViewById(R.id.text_time_line)).setText(mTimeLine.get(position));
        //((TextView)itemView.findViewById(R.id.text_time_line_content)).setText(mTimeLineContent.get(position));
        List<String> mTimeItemList=mTimeLineContentMap.get(position);
        for(int i=0;i<mTimeItemList.size();i++){
            //TextView mTextView=new TextView(this.mContext);
            //mTextView.setText(mTimeItemList.get(i));
            //mLinearContainer.addView(mTextView);
            View mItemContainer=mLayoutInflater.inflate(R.layout.item_list_program_card_view,null);
            ((TextView)(mItemContainer.findViewById(R.id.program_text_item))).setText(mTimeItemList.get(i));
            mLinearContainer.addView(mItemContainer);
        }
        return itemView;
    }
}
