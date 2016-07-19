package com.example.wqt.iccc2016.qpf.util;

/**
 * Created by xoperxoper on 2016/7/4.
 */
public class Committee
{
    private int committeeIcon;
    private String committeeName;
    private String committeeLocation;

    public Committee(int committeeIcon, String committeeName, String committeeLocation)
    {
        this.committeeIcon = committeeIcon;
        this.committeeName = committeeName;
        this.committeeLocation = committeeLocation;
    }

    public int getCommitteeIcon() {
        return committeeIcon;
    }

    public void setCommitteeIcon(int committeeIcon) {
        this.committeeIcon = committeeIcon;
    }

    public String getCommitteeName() {
        return committeeName;
    }

    public void setCommitteeName(String committeeName) {
        this.committeeName = committeeName;
    }

    public String getCommitteeLocation() {
        return committeeLocation;
    }

    public void setCommitteeLocation(String committeeLocation) {
        this.committeeLocation = committeeLocation;
    }
}
