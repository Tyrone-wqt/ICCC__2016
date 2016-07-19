package com.example.wqt.iccc2016.wqt;

import java.util.List;

/**
 * Created by 127-72 on 2016/7/19.
 */
public class ProgramBean {
    public List<String> mContentAtTimeiDayj;

    public String[] mItemShowAtTimeiDayj;

    public String[] mItemDetailAtTimeiDayj;

    public ProgramBean(List<String> mContentAtTimeiDayj, String[] mItemShowAtTimeiDayj, String[] mItemDetailAtTimeiDayj) {
        this.mContentAtTimeiDayj = mContentAtTimeiDayj;
        this.mItemShowAtTimeiDayj = mItemShowAtTimeiDayj;
        this.mItemDetailAtTimeiDayj = mItemDetailAtTimeiDayj;
    }
}
