package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

/**
 * Created by 127-72 on 2016/7/4.
 */
public class MyGridViewAdapter extends BaseAdapter{
    Context mContext;
    //int[] imageIds;
    String[] textStrings;
    int[] iconIds;
    LayoutInflater mLayoutInflater;
    Typeface iconfont;

    public MyGridViewAdapter(Context mContext,int[] imageIds,String[] textStrings){

        this.mContext=mContext;
        iconfont=Typeface.createFromAsset(this.mContext.getAssets(),"iconfont/iconfont.ttf");
        this.iconIds=imageIds;
        //this.imageIds=imageIds;
        //iconIds=new int[]{R.string.icon_font_test,R.string.icon_font_test,R.string.icon_font_test,R.string.icon_font_test,R.string.icon_font_test,R.string.icon_font_test,R.string.icon_font_test};
        this.textStrings=textStrings;
        this.mLayoutInflater= (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return textStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView;
        if(view==null){
            itemView=mLayoutInflater.inflate(R.layout.item_main_grid_view_test,null);
        }else{
            itemView=view;
        }
        ((TextView)itemView.findViewById(R.id.icon_item_grid_view)).setText(iconIds[i]);
        ((TextView)itemView.findViewById(R.id.icon_item_grid_view)).setTypeface(iconfont);
        //((ImageView)itemView.findViewById(R.id.image_item_grid_view)).setImageResource(imageIds[i]);
        ((TextView)itemView.findViewById(R.id.text_item_grid_view)).setText(textStrings[i]);
        return itemView;
    }
}
