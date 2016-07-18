package com.example.wqt.iccc2016.qpf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.List;

/**
 * Created by xoperxoper on 2016/7/4.
 */
public class CommitteeAdapter extends ArrayAdapter<Committee> {
    private int resourceId;

    public CommitteeAdapter(Context context, int resourceId, List<Committee> objects) {
        super(context, resourceId, objects);
        this.resourceId = resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Committee committee=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null)
        {
            view= LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder=new ViewHolder();
            viewHolder.committeeIntro=(TextView)view.findViewById(R.id.tv_committee_intro);
            viewHolder.committeeMember= (TextView) view.findViewById(R.id.tv_committee_member);
            view.setTag(viewHolder);
        }else
        {
            view=convertView;
            viewHolder= (ViewHolder) view.getTag();
        }
        viewHolder.committeeIntro.setText(committee.getIntroduction());
        viewHolder.committeeMember.setText(committee.getMember());
        return view;
    }

    class ViewHolder
    {
        TextView committeeIntro;
        TextView committeeMember;
    }
}
