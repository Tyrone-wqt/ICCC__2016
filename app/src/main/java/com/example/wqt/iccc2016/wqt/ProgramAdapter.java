package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 127-72 on 2016/7/16.
 */
public class ProgramAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    final int viewTypeTimeLine = 1;
    final int viewTypeSession = 2;
    private OnItemClickListener mOnItemClickListener;
    Context mContext;
    List<String> mTimeLineList;
    Map<String, ProgramBean> mProgramSessionMap;
    Map<Integer, Integer> mPositionMap;
    //timeline在position中的位置
    List<Integer> mTimeLineIndexList;

    LayoutInflater mLayoutInflater;
    int mSessionNum;

    public ProgramAdapter(Context mContext, List<String> mTimeLineList, Map<String, ProgramBean> mProgramSessionMap) {
        this.mContext = mContext;
        mLayoutInflater = LayoutInflater.from(this.mContext);
        this.mProgramSessionMap = mProgramSessionMap;
        this.mTimeLineList = mTimeLineList;
        List<String> mSessionList;
        String mTimeListText;
        mPositionMap = new HashMap<>();
        mTimeLineIndexList = new ArrayList<>();

        mSessionNum = 0;
        for (int i = 0; i < this.mTimeLineList.size(); i++) {
            mTimeLineIndexList.add(mSessionNum);
            mPositionMap.put(mSessionNum, i);
            mTimeListText = this.mTimeLineList.get(i);
            Log.i("TimeLine", i + ":" + mTimeListText);
            mSessionList = this.mProgramSessionMap.get(mTimeListText).mContentAtTimeiDayj;
            mSessionNum = mSessionNum + mSessionList.size() + 1;
        }
        Log.i("totalNum", "==" + mSessionNum);
        //mSessionNum--;
    }

    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        //return super.getItemViewType(position);
        //return mPositionMap.get(position);
        if (mTimeLineIndexList.contains(position))
            return viewTypeTimeLine;
        else return viewTypeSession;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        if (viewType == viewTypeTimeLine) {
            viewHolder = new ProgramTimeLineHolder(mLayoutInflater.inflate(R.layout.item_program_recycler_timeline, null));
        } else if (viewType == viewTypeSession) {
            viewHolder = new ProgramSessionItemHolder(mLayoutInflater.inflate(R.layout.item_program_recycler_session, null));
        }
        viewHolder.setIsRecyclable(false);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof ProgramTimeLineHolder) {
            int mTimeLineIndex = mPositionMap.get(position);
            ((ProgramTimeLineHolder) holder).mTextTimeLine.setText(mTimeLineList.get(mTimeLineIndex));
        } else if (holder instanceof ProgramSessionItemHolder) {
            //Set<Integer> mKeySet =mPositionMap.keySet();
            int index = 1;
            int rest = 1;
            int i = 0;
            for (;i < mTimeLineIndexList.size(); i++) {
                if (mTimeLineIndexList.get(i) > position) {
                    index = i - 1;
                    rest = position - mTimeLineIndexList.get(index);
                    break;
                }
            }
            if(i==mTimeLineIndexList.size()){
                index=i-1;
                rest=position-mTimeLineIndexList.get(index);
            }
            final String mSessionItemText=mProgramSessionMap.get(mTimeLineList.get(index)).mContentAtTimeiDayj.get(rest-1);
            String textCatagory=mProgramSessionMap.get(mTimeLineList.get(index)).mItemShowAtTimeiDayj[rest-1];
            ((ProgramSessionItemHolder) holder).mTextSessionItem.setText(mSessionItemText);
            String[] textDetails=mProgramSessionMap.get(mTimeLineList.get(index)).mItemDetailAtTimeiDayj;

            if(textDetails!=null){
                String textDetail=textDetails[rest-1];
                ((ProgramSessionItemHolder) holder).mTextSessionDetail.setText(textDetail);
            }else{
                ((ProgramSessionItemHolder) holder).mTextSessionDetail.setVisibility(View.GONE);
            }
            //((ProgramSessionItemHolder) holder).mTextSessionAuthor.setVisibility(View.GONE);
            if (mOnItemClickListener != null) {
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mOnItemClickListener.onItemClick(mSessionItemText);
                    }
                });
            }
        }
    }

    private String getDatabaseTableName(final String mSessionItemText) {
        if (mSessionItemText.contains("Workshop"))
            return "workshops";
        else if (mSessionItemText.contains("Tutorial"))
            return "tutorials";
        else if (mSessionItemText.contains("Invited"))
            return "invitedtalks";
        else if (mSessionItemText.contains("Keynote Speech"))
            return "keynote";
        else if (mSessionItemText.contains("Welcome Opening"))
            return "opening";
        else if (mSessionItemText.contains("IAP"))
            return "iap";
        else if (mSessionItemText.contains("Poster Session"))
            return "postersession";
        else if (mSessionItemText.contains("WCS"))
            return "techprogram";
        else if (mSessionItemText.contains("CCT"))
            return "techprogram";
        else if (mSessionItemText.contains("SPC"))
            return "techprogram";
        else if (mSessionItemText.contains("NGN"))
            return "techprogram";
        else if (mSessionItemText.contains("WNM"))
            return "techprogram";
        else if (mSessionItemText.contains("STC"))
            return "techprogram";
        else if (mSessionItemText.contains("SNBD"))
            return "techprogram";
        else if (mSessionItemText.contains("OCGN"))
            return "techprogram";
        else if (mSessionItemText.contains("PSC"))
            return "techprogram";
        else
            return null;

    }

    private String getKeyWord(final String mSessionItemText) {
        if (mSessionItemText.contains("Tutorial"))
            return null;
        else if (mSessionItemText.contains("Invited"))
            return null;
        else if (mSessionItemText.contains("E-MIMO"))
            return "E-MIMO";
        else if (mSessionItemText.contains("WIN"))
            return "WIN";
        else if (mSessionItemText.contains("SIN"))
            return "SIN";
        else if (mSessionItemText.contains("ASDRAM"))
            return "ASDRAM";
        else return null;
    }

    private String getSessionIndex(final String mSessionItemText) {
        if (mSessionItemText.contains("1"))
            return "1";
        else if (mSessionItemText.contains("2"))
            return "2";
        else if (mSessionItemText.contains("3"))
            return "3";
        else if (mSessionItemText.contains("4"))
            return "4";
        else if (mSessionItemText.contains("5"))
            return "5";
        else if (mSessionItemText.contains("6"))
            return "6";
        else if (mSessionItemText.contains("7"))
            return "7";
        else if (mSessionItemText.contains("8"))
            return "8";
        else if (mSessionItemText.contains("9"))
            return "9";
        else return "0";

    }

    @Override
    public int getItemCount() {
        return mSessionNum;
    }

    public static class ProgramTimeLineHolder extends RecyclerView.ViewHolder {
        public TextView mTextTimeLine;

        public ProgramTimeLineHolder(View itemView) {
            super(itemView);
            mTextTimeLine = (TextView) itemView.findViewById(R.id.program_text_timeline);
        }
    }

    public static class ProgramSessionItemHolder extends RecyclerView.ViewHolder {
        public TextView mTextSessionItem;
        //public TextView mTextSessionAuthor;
        public TextView mTextSessionDetail;
        public ImageView mImageView;
        public ProgramSessionItemHolder(View itemView) {
            super(itemView);
            mTextSessionItem = (TextView) itemView.findViewById(R.id.item_session_catagory);
            //mTextSessionAuthor= (TextView) itemView.findViewById(R.id.item_session_author);
            mTextSessionDetail= (TextView) itemView.findViewById(R.id.item_session_detail);
            mImageView= (ImageView) itemView.findViewById(R.id.program_image_extend);
        }
    }
}
