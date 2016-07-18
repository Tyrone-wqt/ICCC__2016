package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 127-72 on 2016\7\5.
 */
public class MyViewPagerAdapter extends PagerAdapter {


    final Context mContext;
    List<View> mList;
    View mListViewDay1;
    View mListViewDay2;
    View mListViewDay3;
    List<String> mTimeLine1;
    List<String> mTimeLine2;
    List<String> mTimeLine3;

    Map<String, List<String>> mTimeLineContentMap1;
    Map<String, List<String>> mTimeLineContentMap2;
    Map<String, List<String>> mTimeLineContentMap3;
    LayoutInflater mLayoutInflater;

    OnItemClickListener mOnItemClickListener;

    public MyViewPagerAdapter(final Context mContext) {
        this.mContext = mContext;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mOnItemClickListener = new OnItemClickListener() {
            @Override
            public void onItemClick(String mSessionItemText) {
                String keyWord = null;
                String tableName = null;
                String sessionIndex = null;
                tableName = getDatabaseTableName(mSessionItemText);
                keyWord = getKeyWord(mSessionItemText);
                sessionIndex = getSessionIndex(mSessionItemText);
                if (tableName != null) {
                    Intent intent = new Intent(mContext, DetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("tableName", tableName);
                    bundle.putString("keyWord", keyWord);
                    bundle.putString("sessionIndex", sessionIndex);
                    intent.putExtras(bundle);
                    mContext.startActivity(intent);
                }
            }
        };
        //day1 data
        mTimeLine1 = new ArrayList<>();
        mTimeLine1.add("08:00-09:00");
        mTimeLine1.add("09:00-10:30");
        mTimeLine1.add("10:30-11:00");
        mTimeLine1.add("11:00-12:30");
        mTimeLine1.add("12:30-14:00");
        mTimeLine1.add("14:00-15:30");
        mTimeLine1.add("15:30-16:00");
        mTimeLine1.add("16:00-17:30");
        mTimeLine1.add("18:30-21:00");

        mTimeLineContentMap1 = new HashMap<>();
        List<String> mContentAtTime0Day1 = new ArrayList<>();
        mContentAtTime0Day1.add("Conference Registration");
        mTimeLineContentMap1.put(mTimeLine1.get(0), mContentAtTime0Day1);

        List<String> mContentAtTime1Day1 = new ArrayList<>();
        mContentAtTime1Day1.add("E-MIMO Workshop-1");
        mContentAtTime1Day1.add("WIN Workshop-2");
        mContentAtTime1Day1.add("SIN Workshop-3");
        mContentAtTime1Day1.add("Tutorial#2");
        mContentAtTime1Day1.add("Tutorial#5");
        mContentAtTime1Day1.add("Tutorial#9");
        mTimeLineContentMap1.put(mTimeLine1.get(1), mContentAtTime1Day1);

        List<String> mContentAtTime2Day1 = new ArrayList<>();
        mContentAtTime2Day1.add("Coffee Break");
        mTimeLineContentMap1.put(mTimeLine1.get(2), mContentAtTime2Day1);

        List<String> mContentAtTime3Day1 = new ArrayList<>();
        mContentAtTime3Day1.add("E-MIMO Workshop-2");
        mContentAtTime3Day1.add("WIN Workshop-2");
        mContentAtTime3Day1.add("SIN Workshop-3");
        mContentAtTime3Day1.add("Tutorial#2");
        mContentAtTime3Day1.add("Tutorial#5");
        mContentAtTime3Day1.add("Tutorial#9");
        mTimeLineContentMap1.put(mTimeLine1.get(3), mContentAtTime3Day1);

        List<String> mContentAtTime4Day1 = new ArrayList<>();
        mContentAtTime4Day1.add("Lunch");
        mTimeLineContentMap1.put(mTimeLine1.get(4), mContentAtTime4Day1);

        List<String> mContentAtTime5Day1 = new ArrayList<>();
        mContentAtTime5Day1.add("Tutorial#3");
        mContentAtTime5Day1.add("Tutorial#1");
        mContentAtTime5Day1.add("Tutorial#6");
        mContentAtTime5Day1.add("Tutorial#4");
        mContentAtTime5Day1.add("Tutorial#7");
        mContentAtTime5Day1.add("Tutorial#8");
        mTimeLineContentMap1.put(mTimeLine1.get(5), mContentAtTime5Day1);

        List<String> mContentAtTime6Day1 = new ArrayList<>();
        mContentAtTime6Day1.add("Coffee Break");
        mTimeLineContentMap1.put(mTimeLine1.get(6), mContentAtTime6Day1);

        List<String> mContentAtTime7Day1 = new ArrayList<>();
        mContentAtTime7Day1.add("Tutorial#3");
        mContentAtTime7Day1.add("Tutorial#1");
        mContentAtTime7Day1.add("Tutorial#6");
        mContentAtTime7Day1.add("Tutorial#4");
        mContentAtTime7Day1.add("Tutorial#7");
        mContentAtTime7Day1.add("Tutorial#8");
        mTimeLineContentMap1.put(mTimeLine1.get(7), mContentAtTime7Day1);


        List<String> mContentAtTime8Day1 = new ArrayList<>();
        mContentAtTime8Day1.add("Reception");
        mTimeLineContentMap1.put(mTimeLine1.get(8), mContentAtTime8Day1);
        //********************************************

        //day2 data
        mTimeLine2 = new ArrayList<>();
        mTimeLine2.add("08:00-08:30");
        mTimeLine2.add("08:30-09:00");
        mTimeLine2.add("09:00-10:30");
        mTimeLine2.add("10:30-11:00");
        mTimeLine2.add("11:00-12:30");
        mTimeLine2.add("12:30-14:00");
        mTimeLine2.add("14:00-15:30");
        mTimeLine2.add("15:30-16:00");
        mTimeLine2.add("16:00-17:30");
        mTimeLine2.add("18:30-21:00");


        mTimeLineContentMap2 = new HashMap<>();
        List<String> mContentAtTime0Day2 = new ArrayList<>();
        mContentAtTime0Day2.add("Conference Registration");
        mTimeLineContentMap2.put(mTimeLine2.get(0), mContentAtTime0Day2);


        List<String> mContentAtTime1Day2 = new ArrayList<>();
        mContentAtTime1Day2.add("Welcome Opening");
        mTimeLineContentMap2.put(mTimeLine2.get(1), mContentAtTime1Day2);

        List<String> mContentAtTime2Day2 = new ArrayList<>();
        mContentAtTime2Day2.add("Keynote Speech #1");
        mContentAtTime2Day2.add("Keynote Speech #2");
        mTimeLineContentMap2.put(mTimeLine2.get(2), mContentAtTime2Day2);


        List<String> mContentAtTime3Day2 = new ArrayList<>();
        mContentAtTime3Day2.add("Coffee Break & Poster Session-1");
        mTimeLineContentMap2.put(mTimeLine2.get(3), mContentAtTime3Day2);


        List<String> mContentAtTime4Day2 = new ArrayList<>();
        mContentAtTime4Day2.add("WCS-1");
        mContentAtTime4Day2.add("CCT-1");
        mContentAtTime4Day2.add("SPC-1");
        mContentAtTime4Day2.add("IAP");
        mContentAtTime4Day2.add("Invited-1");
        mContentAtTime4Day2.add("Invited-2");
        mTimeLineContentMap2.put(mTimeLine2.get(4), mContentAtTime4Day2);


        List<String> mContentAtTime5Day2 = new ArrayList<>();
        mContentAtTime5Day2.add("Lunch");
        mTimeLineContentMap2.put(mTimeLine2.get(5), mContentAtTime5Day2);


        List<String> mContentAtTime6Day2 = new ArrayList<>();
        mContentAtTime6Day2.add("WCS-2");
        mContentAtTime6Day2.add("CCT-2");
        mContentAtTime6Day2.add("SPC-2");
        mContentAtTime6Day2.add("NGN-1");
        mContentAtTime6Day2.add("Invited-3");
        mContentAtTime6Day2.add("Invited-4");
        mContentAtTime6Day2.add("Steering Committee Meeting");
        mTimeLineContentMap2.put(mTimeLine2.get(6), mContentAtTime6Day2);


        List<String> mContentAtTime7Day2 = new ArrayList<>();
        mContentAtTime7Day2.add("Coffee Break");
        mTimeLineContentMap2.put(mTimeLine2.get(7), mContentAtTime7Day2);


        List<String> mContentAtTime8Day2 = new ArrayList<>();
        mContentAtTime8Day2.add("WCS-3");
        mContentAtTime8Day2.add("WCS-4");
        mContentAtTime8Day2.add("SPC-3");
        mContentAtTime8Day2.add("NGN-2");
        mContentAtTime8Day2.add("NGN-3");
        mContentAtTime8Day2.add("Invited-4");
        mContentAtTime8Day2.add("Steering Committee Meeting");
        mTimeLineContentMap2.put(mTimeLine2.get(8), mContentAtTime8Day2);


        List<String> mContentAtTime9Day2 = new ArrayList<>();
        mContentAtTime9Day2.add("Banquet");
        mTimeLineContentMap2.put(mTimeLine2.get(9), mContentAtTime9Day2);
        //***********************************8**************

        //day3 data
        mTimeLine3 = new ArrayList<>();
        mTimeLine3.add("08:00-09:00");
        mTimeLine3.add("09:00-10:30");
        mTimeLine3.add("10:30-11:00");
        mTimeLine3.add("11:00-12:30");
        mTimeLine3.add("12:30-14:00");
        mTimeLine3.add("14:00-15:30");
        mTimeLine3.add("15:30-16:00");
        mTimeLine3.add("16:00-17:30");

        mTimeLineContentMap3 = new HashMap<>();

        List<String> mContentAtTime0Day3 = new ArrayList<>();
        mContentAtTime0Day3.add("Conference Registration");
        mTimeLineContentMap3.put(mTimeLine3.get(0), mContentAtTime0Day3);

        List<String> mContentAtTime1Day3 = new ArrayList<>();
        mContentAtTime1Day3.add("Keynote Speech #3");
        mContentAtTime1Day3.add("Keynote Speech #4");
        mTimeLineContentMap3.put(mTimeLine3.get(1), mContentAtTime1Day3);

        List<String> mContentAtTime2Day3 = new ArrayList<>();
        mContentAtTime2Day3.add("Coffee Break & Poster Session-2");
        mTimeLineContentMap3.put(mTimeLine3.get(2), mContentAtTime2Day3);

        List<String> mContentAtTime3Day3 = new ArrayList<>();
        mContentAtTime3Day3.add("WNM-1");
        mContentAtTime3Day3.add("SPC-4");
        mContentAtTime3Day3.add("Invited-5");
        mContentAtTime3Day3.add("SNBD-1");
        mContentAtTime3Day3.add("PSC-1");
        mTimeLineContentMap3.put(mTimeLine3.get(3), mContentAtTime3Day3);


        List<String> mContentAtTime4Day3 = new ArrayList<>();
        mContentAtTime4Day3.add("Lunch");
        mTimeLineContentMap3.put(mTimeLine3.get(4), mContentAtTime4Day3);

        List<String> mContentAtTime5Day3 = new ArrayList<>();
        mContentAtTime5Day3.add("WNM-2");
        mContentAtTime5Day3.add("WCS-5");
        mContentAtTime5Day3.add("STC-1");
        mContentAtTime5Day3.add("OCSN-1");
        mContentAtTime5Day3.add("PSC-2");
        mTimeLineContentMap3.put(mTimeLine3.get(5), mContentAtTime5Day3);


        List<String> mContentAtTime6Day3 = new ArrayList<>();
        mContentAtTime6Day3.add("Coffee Break");
        mTimeLineContentMap3.put(mTimeLine3.get(6), mContentAtTime6Day3);

        List<String> mContentAtTime7Day3 = new ArrayList<>();
        mContentAtTime7Day3.add("WCS-6");
        mContentAtTime7Day3.add("WCS-7");
        mContentAtTime7Day3.add("STC-2");
        mContentAtTime7Day3.add("OCSN-2");
        mTimeLineContentMap3.put(mTimeLine3.get(7), mContentAtTime7Day3);


        mList = new ArrayList<>();
        mListViewDay1 = mLayoutInflater.inflate(R.layout.child_view_in_viewpager, null);

        ProgramAdapter mAdapter1 = new ProgramAdapter(mContext, mTimeLine1, mTimeLineContentMap1);
        mAdapter1.setmOnItemClickListener(mOnItemClickListener);
        RecyclerView childRecyclerView1 = (RecyclerView) mListViewDay1.findViewById(R.id.recycler_view_in_child_view);
        childRecyclerView1.setAdapter(mAdapter1);
        childRecyclerView1.setLayoutManager(new LinearLayoutManager(mContext));
        childRecyclerView1.addItemDecoration(new DividerItemDecoration(mContext,
                DividerItemDecoration.VERTICAL_LIST));


        mListViewDay2 = mLayoutInflater.inflate(R.layout.child_view_in_viewpager, null);
        ProgramAdapter mAdapter2 = new ProgramAdapter(mContext, mTimeLine2, mTimeLineContentMap2);
        mAdapter2.setmOnItemClickListener(mOnItemClickListener);

        RecyclerView childRecyclerView2 = (RecyclerView) mListViewDay2.findViewById(R.id.recycler_view_in_child_view);
        childRecyclerView2.setAdapter(mAdapter2);
        childRecyclerView2.setLayoutManager(new LinearLayoutManager(mContext));
        childRecyclerView2.addItemDecoration(new DividerItemDecoration(mContext,
                DividerItemDecoration.VERTICAL_LIST));

        mListViewDay3 =  mLayoutInflater.inflate(R.layout.child_view_in_viewpager, null);
        ProgramAdapter mAdapter3 = new ProgramAdapter(mContext, mTimeLine3, mTimeLineContentMap3);
        mAdapter3.setmOnItemClickListener(mOnItemClickListener);
        RecyclerView childRecyclerView3 = (RecyclerView) mListViewDay3.findViewById(R.id.recycler_view_in_child_view);
        childRecyclerView3.setAdapter(mAdapter3);
        childRecyclerView3.setLayoutManager(new LinearLayoutManager(mContext));
        childRecyclerView3.addItemDecoration(new DividerItemDecoration(mContext,
                DividerItemDecoration.VERTICAL_LIST));

        mList.add(mListViewDay1);
        mList.add(mListViewDay2);
        mList.add(mListViewDay3);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mList.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //return super.instantiateItem(container, position);

        container.addView(mList.get(position));

        return mList.get(position);
    }

    private String getDatabaseTableName(final String mSessionItemText) {
        if (mSessionItemText.contains("Workshop"))
            return "workshop";
        else if (mSessionItemText.contains("Tutorial"))
            return "tutorial";
        else if (mSessionItemText.contains("Invited"))
            return "invited";
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
        else if (mSessionItemText.contains("OCSN"))
            return "techprogram";
        else if (mSessionItemText.contains("PSC"))
            return "techprogram";
        else if (mSessionItemText.contains("Reception"))
            return "reception";
        else if (mSessionItemText.contains("Banquet"))
            return "banquet";
        else
            return null;
    }

    private String getKeyWord(final String mSessionItemText) {
        if (mSessionItemText.contains("Tutorial"))
            return null;
        else if (mSessionItemText.contains("Invited"))
            return null;
        else if (mSessionItemText.contains("Keynote"))
            return null;
        else if (mSessionItemText.contains("Poster Session"))
            return null;
        else if (mSessionItemText.contains("E-MIMO"))
            return "E-MIMO";
        else if (mSessionItemText.contains("WIN"))
            return "WIN";
        else if (mSessionItemText.contains("SIN"))
            return "SIN";
        else if (mSessionItemText.contains("ASDRAM"))
            return "ASDRAM";
        else if (mSessionItemText.contains("CCT"))
            return "CCT";
        else if (mSessionItemText.contains("NGN"))
            return "NGN";
        else if (mSessionItemText.contains("OCSN"))
            return "OCSN";
        else if (mSessionItemText.contains("PSC"))
            return "PSC";
        else if (mSessionItemText.contains("SNBD"))
            return "SNBD";
        else if (mSessionItemText.contains("SPC"))
            return "SPC";
        else if (mSessionItemText.contains("STC"))
            return "STC";
        else if (mSessionItemText.contains("WCS"))
            return "WCS";
        else if (mSessionItemText.contains("WNM"))
            return "WNM";
        else return null;
    }

    private String getSessionIndex(final String mSessionItemText) {
        if (mSessionItemText.contains("E-MIMO"))
            return null;
        else if (mSessionItemText.contains("WIN"))
            return null;
        else if (mSessionItemText.contains("SIN"))
            return null;
        else if (mSessionItemText.contains("ASDRAM"))
            return null;
        else if (mSessionItemText.contains("1"))
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


        else return null;

    }


}
