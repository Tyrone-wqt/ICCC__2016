package com.example.wqt.iccc2016.qpf;

/**
 * Created by xoperxoper on 2016/7/4.
 */
public class Committee
{
    private String introduction;
    private String member;
    public Committee(String introduction, String member)
    {
        this.introduction = introduction;
        this.member = member;
    }

    public String getIntroduction()
    {
        return introduction;
    }

    public void setIntroduction(String introduction)
    {
        this.introduction = introduction;
    }

    public String getMember()
    {
        return member;
    }

    public void setMember(String member)
    {
        this.member = member;
    }
}
