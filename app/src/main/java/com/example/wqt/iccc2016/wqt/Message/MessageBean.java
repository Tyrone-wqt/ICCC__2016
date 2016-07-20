package com.example.wqt.iccc2016.wqt.Message;

import java.io.Serializable;

/**
 * Created by 127-72 on 2016/7/20.
 */
public class MessageBean implements Serializable{
    public String title;
    public String description;
    public boolean isRead;

    public MessageBean(String title, String description, boolean isRead) {
        this.title = title;
        this.description=description;
        this.isRead = isRead;
    }
}
