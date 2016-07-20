package com.example.wqt.iccc2016.wqt.Message;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.LinkedList;

public class MessageActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    TextView mToolbarTitle;
    TextView mTextNoMessage;
    ListView mMessageList;
    LinkedList<MessageBean> msgList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        mToolbarTitle = (TextView) findViewById(R.id.message_toolbar_title);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mTextNoMessage = (TextView) findViewById(R.id.message_no_message_text);
        mMessageList = (ListView) findViewById(R.id.message_item_list);
        msgList = MessageFileUtil.getInstance().readMessage();
        if (msgList == null) {
            mMessageList.setVisibility(View.GONE);
            mTextNoMessage.setVisibility(View.VISIBLE);
        } else {
            mMessageList.setVisibility(View.VISIBLE);
            mTextNoMessage.setVisibility(View.GONE);
            MessageItemAdapter mAdapter = new MessageItemAdapter(this, msgList);
            mMessageList.setAdapter(mAdapter);
            mMessageList.setOnItemClickListener(this);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.show_pic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        this.finish();
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        //super.onPostCreate(savedInstanceState, persistentState);
        if (!isChild()) {
            onTitleChanged(getTitle(), getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (mToolbarTitle != null) {
            mToolbarTitle.setText(title);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intentForMessageDetail = new Intent(this, MessageDetailActivity.class);
        Bundle bundle = new Bundle();
        MessageBean bean = msgList.get(msgList.size() - 1 - position);
        bundle.putString("title", bean.title);
        bundle.putString("description", bean.description);
        bean.isRead = true;

        ((MessageItemAdapter) parent.getAdapter()).notifyDataSetChanged();
        MessageFileUtil.getInstance().writeMessage(msgList);
        intentForMessageDetail.putExtras(bundle);
        startActivity(intentForMessageDetail);
    }

}
