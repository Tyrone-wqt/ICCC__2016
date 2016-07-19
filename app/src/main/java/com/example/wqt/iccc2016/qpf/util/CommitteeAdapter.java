package com.example.wqt.iccc2016.qpf.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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
            viewHolder.committeeIcon= (ImageView) view.findViewById(R.id.iv_committee_icon);
            viewHolder.committeeName=(TextView)view.findViewById(R.id.tv_committee_name);
            viewHolder.committeeLocation= (TextView) view.findViewById(R.id.tv_committee_location);
            view.setTag(viewHolder);
        }else
        {
            view=convertView;
            viewHolder= (ViewHolder) view.getTag();
        }

        viewHolder.committeeIcon.setVisibility(View.GONE);
        viewHolder.committeeName.setText(committee.getCommitteeName());
        viewHolder.committeeLocation.setText(committee.getCommitteeLocation());
        return view;
    }

    class ViewHolder
    {
        ImageView committeeIcon;
        TextView committeeName;
        TextView committeeLocation;
    }
}
