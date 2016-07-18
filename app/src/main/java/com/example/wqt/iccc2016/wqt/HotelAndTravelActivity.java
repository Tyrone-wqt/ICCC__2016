package com.example.wqt.iccc2016.wqt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class HotelAndTravelActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mToolbarTitle;


    TextView mTitle1Text;
    TextView mTitle2Text;
    TextView mTitle3Text;
    TextView mTitle4Text;

    RelativeLayout mLayout1;
    RelativeLayout mLayout2;
    RelativeLayout mLayout3;
    RelativeLayout mLayout4;

    ImageView mImage1;
    ImageView mImage2;
    ImageView mImage3;
    ImageView mImage4;
    boolean isImage1Open = false;
    boolean isImage2Open = false;
    boolean isImage3Open = false;
    boolean isImage4Open = false;

    MTagHandler mMTagHandler;
    MImageGetter mMImageGetter;
    Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_and_travel);
        initViews();
        Toolbar toolbar = (Toolbar) findViewById(R.id.hotel_and_travel_toolbar);
        mToolbarTitle = (TextView) findViewById(R.id.hotel_and_travel_toolbar_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        mMTagHandler = new MTagHandler();
        mMImageGetter = new MImageGetter(this, 84);
        mHandler = new Handler() {
            public void handleMessage(Message msg) {
                int what = msg.what;
                if (what == 200) {
                    MessageSpan ms = (MessageSpan) msg.obj;
                    Object[] spans = (Object[]) ms.getObj();

                    for (Object span : spans) {
                        if (span instanceof ImageSpan) {
                            Intent intent = new Intent(HotelAndTravelActivity.this, ShowPicActivity.class);
                            Bundle bundle = new Bundle();

                            bundle.putString("picUrl", ((ImageSpan) span).getSource());
                            intent.putExtras(bundle);

                            startActivity(intent);

                        }
                    }
                }
            }

            ;
        };

        String text1 =
                "<p style=\"text-align: justify\">The Wang-Jiang Hotel (望江宾馆) is the headquarter hotel for IEEE ICCC 2016 conference with overflow accommodation.  Wang-Jiang Hotel is a five-star hotel in Chengdu next to the second ring road of the city.</p>\n" +
                        "<p>Address：Sha-He-Pu street, No. 42, Jinjiang District, Chengdu, Sichuan, P. R. China<br />\n" +
                        "Special Hotel Rates (Include tax):</p>\n" +
                        "<ul>\n" +
                        "<li>Deluxe Twin: 600 RMB/day</li>\n" +
                        "<li>Deluxe King Room: 600 RMB/day</li>\n" +
                        "<li>Standard Room: 500 RMB/day</li>\n" +
                        "</ul>\n" +
                        "<p>TO RESERVE YOUR HOTEL ROOM Please call 028-66009945 or Send Email to: &#50;&#x37;&#52;&#x35;&#52;&#x31;&#49;&#x38;&#48;&#x40;q&#x71;.&#x63;o&#x6d;</p>";
        mTitle1Text.setText(Html.fromHtml(text1, null, mMTagHandler));
        //************************************
        String text2 = "<p><strong>Hotel Address</strong>: Wangjiang Hotel, No.42, Xiashahepu Street, Chengdu, Sichuan, China<br />\n" +
                "<strong>Tel</strong>: +86-28-84790000<br />\n" +
                "<strong>Fax</strong>: +86-28-84791688<br />\n" +
                "<strong>Website</strong>: <a href=\"http://www.wangjianghotel.com/en/reservation.html\">www.wangjianghotel.com</a></p>\n" +
                "<p>Wangjiang Hotel Chengdu is an urban forest five-star hotel in Chengdu, combining South Asian charming landscape and Western Sichuan folk culture. Located in the east part of Chengdu, close to the eastern financial center and the East Train Station and national AAAA scenic spot—Sansheng Flower Town, this hotel has a convenient position, 6 km to the Downtown Tianfu Square, 4 km to the Train Station, 9 km to the North train station 16 km to the Airport.</p>\n" +
                "<p>Covering an area of 200 mu, gathering thousands of flowers and serving as the paradise for trees and birds, and featured by pavilions, streams and villas, it is an ideal place combining natural landscape with cultural attraction. Well decorated, elegantly impressed, it is a wonderful place for travel, meetings and business activities.<br />\n" +
                "<p><img src=\"images/hotelinfob01.jpg\" alt=\"#01\" width=\"100%\" /></p>\n" +
                "<p><img src=\"images/hotelinfob03.jpg\" alt=\"#02\" width=\"100%\" /></p>";
        mTitle2Text.setText(Html.fromHtml(text2, mMImageGetter, mMTagHandler));
        mTitle2Text.setMovementMethod(LinkMovementMethodExt.getInstance(mHandler, ImageSpan.class));
        //**********************************
        String text3 = "<h5>Getting to the hotel from Shuangliu Airport</h5>\n" +
                "<p><em>Taxi</em>: Fares of taxi are around CNY70 (USD 11.00) each way, and rental cars can be booked online.<br />\n" +
                "<em>Public Transport</em>: Take Airport Bus Line 2 from Shuangliu International Airport stop to Tianfu Square stop. Then take Take metro line 2 to Dongda Road stop and walk around 800m to the hotel.<br />\n" +
                "<p><img src=\"images/crop_1.png\" alt=\"crop_1\" width=\"1024\" height=\"588\"  </p>\n" +
                "<h5>Getting to the hotel from Chengdu East Railway Station</h5>\n" +
                "<p><em>Taxi</em>: Fares of taxi are around CNY20 (USD 3.00) each way, and rental cars can be booked online.<br />\n" +
                "<em>Public Transport</em>: Take metro line 2 to Dongda Road stop and walk around 800m to the hotel.<br />\n" +
                "<p><img src=\"images/crop_2.jpg\" </p>\n" +
                "<h5>Getting to the hotel from Chengdu Railway Station</h5>\n" +
                "<p><em>Taxi</em>: It takes about 21 minutes from Chengdu Railway Station to Wang Jiang Hotel by taxi, costing about 24RMB.<br />\n" +
                "<em>Public Transport</em>: You can also take metro line 1 from Chengdu Railway Station to Tianfu Square stop, then change to the metro line 2 to Dongda Road stop and walk around 800m to the hotel.<br />\n" +
                "<p><img src=\"images/crop_3.jpg\" alt=\"crop_1\" width=\"1024\" height=\"588\"  </p>\n";
        mTitle3Text.setText(Html.fromHtml(text3, mMImageGetter, mMTagHandler));
        mTitle3Text.setMovementMethod(LinkMovementMethodExt.getInstance(mHandler, ImageSpan.class));

        String text4=
                "<h5 style=\"text-align: justify\">1. Chengdu Giant Panda Breeding Research Base</h5>\n" +
                "<p style=\"text-align: justify\">The Research Base may be the best place to see them. There are bamboo-shaded paths, animal pens, research laboratories (no visitors allowed), and a museum housing exhibits on pandas, butterflies, and China's vertebrate animals, and at least a half-day visit to the base is appropriate. Eighty-five percent of the world's remaining wild giant pandas live in Sichuan, and the Research Base and Chengdu Zoo have 21 giant pandas, more than 20 lesser pandas, and many black-necked cranes and white storks. There are 14 kinds of bamboo and 300 other plant species at the Base.</p>\n" +
                "<p><img src=\"images/panda.jpg\" /></p>\n" +
                "\n" +
                "<h5 style=\"text-align: justify\">2. Wide & Narrow Lanes</h5>\n" +
                "<p style=\"text-align: justify\">Wide & Narrow Lanes, lying in the ancient Shao Cheng area of Chengdu, are composed of mostly buildings in the Ming and Qing Dynasties along the street and are one of the three major protect areas of the famous historical and cultural city block of Chengdu together with the Daci Temple and Wenshu Temple.</p>\n" +
                "<p><img src=\"images/widenarrow.jpg\" /></p>\n" +
                "\n" +
                "<h5 style=\"text-align: justify\">3. Wuhou Temple (the Temple of Martial Marquis</h5>\n" +
                "<p style=\"text-align: justify\">It was built in commemoration of the famous Martial Marquis Zhuge Liang , the Prime Minister of the Shu-Han Kingdom. Wuhou might be translated as \"minister or war\". That was the title given to Zhuge Liang, a famous military strategist of the Three Kingdoms period (220-280AD) immortalized in one of the classics of Chinese literature, The Tale of the Three Kingdoms. The temple displays the suppleness of the Chinese garden. There are numerous historical relics like horizontal cribbed boards, couplets, Inscribed tablets, penmanship, furnaces, Chinese tripods, etc.</p>\n" +
                "<p><img src=\"images/wuhou.jpg\" /></p>\n" +
                "\n" +
                "<h5 style=\"text-align: justify\">4. Dujiangyan (Barrier Lake)</h5>\n" +
                "<p style=\"text-align: justify\">It is one of the world’s first irrigation systems, located on the upper reaches of the Minjiang River, 35 kilometers from Chengdu. It was built between 306-251 BC by the local people under the guidance of Bing Li and his son. Dujiangyan is the oldest large-scale water conservancy project in China, a major historical site under state protection, as well as a national scenic area, characterized by its well-known irrigation system. Known as a “Field Museum of Irrigation Works”, Dujianyan was listed in the United Nations Education Scientific and Cultural Organization (UNESCO) List of World Heritage in 2000.</p>\n" +
                "<p><img src=\"images/dujiangyan.jpg\" /></p>\n" +
                "\n" +
                "<h5 style=\"text-align: justify\">5. Sichuan Opera </h5>\n" +
                "<p style=\"text-align: justify\">It is one of the most famous operas in China, and has a very long history. Bian Nian is the masterpiece and essence of the present Sichuan opera, which has been widely publicized and well known in China, and grasped only by few people. Face off or face change in English, Bian Nian is the one of the artistry of the stagecraft, which reflects the minds and sentiments of the stage performers in a romantic way.</p>\n" +
                "<p><img src=\"images/opera.jpg\" /></p>\n" +
                "\n";
        mTitle4Text.setText(Html.fromHtml(text4,mMImageGetter, mMTagHandler));
        mTitle4Text.setMovementMethod(LinkMovementMethodExt.getInstance(mHandler, ImageSpan.class));

    }

    private void initViews() {
        //mRootView = LayoutInflater.from(this).inflate(R.layout.fragment_hotel_and_travel, null);

        mTitle1Text = (TextView) findViewById(R.id.title1_textview);
        mTitle2Text = (TextView) findViewById(R.id.title2_textview);
        mTitle3Text = (TextView) findViewById(R.id.title3_textview);
        mTitle4Text= (TextView) findViewById(R.id.title4_textview);

        mLayout1 = (RelativeLayout) findViewById(R.id.title1_layout);
        mLayout1.setOnClickListener(this);
        mLayout2 = (RelativeLayout) findViewById(R.id.title2_layout);
        mLayout2.setOnClickListener(this);
        mLayout3 = (RelativeLayout) findViewById(R.id.title3_layout);
        mLayout3.setOnClickListener(this);
        mLayout4= (RelativeLayout) findViewById(R.id.title4_layout);
        mLayout4.setOnClickListener(this);

        mImage1 = (ImageView) findViewById(R.id.title1_image_open_close);
        //mImage1.setOnClickListener(this);
        mImage2 = (ImageView) findViewById(R.id.title2_image_open_close);
        //mImage2.setOnClickListener(this);
        mImage3 = (ImageView) findViewById(R.id.title3_image_open_close);
        //mImage3.setOnClickListener(this);
        mImage4= (ImageView) findViewById(R.id.title4_image_open_close);
    }


    @Override
    public void onClick(View v) {
        int itemId = v.getId();
        switch (itemId) {
            case R.id.title1_layout:
                if (!isImage1Open) {
                    findViewById(R.id.title1_cardview).setVisibility(View.VISIBLE);
                    mImage1.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

                } else {
                    findViewById(R.id.title1_cardview).setVisibility(View.GONE);
                    mImage1.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
                isImage1Open = !isImage1Open;
                break;
            case R.id.title2_layout:
                if (!isImage2Open) {
                    findViewById(R.id.title2_cardview).setVisibility(View.VISIBLE);
                    mImage2.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    findViewById(R.id.title2_cardview).setVisibility(View.GONE);
                    mImage2.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
                isImage2Open = !isImage2Open;
                break;
            case R.id.title3_layout:
                if (!isImage3Open) {
                    findViewById(R.id.title3_cardview).setVisibility(View.VISIBLE);
                    mImage3.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

                } else {
                    findViewById(R.id.title3_cardview).setVisibility(View.GONE);
                    mImage3.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
                isImage3Open = !isImage3Open;
                break;
            case R.id.title4_layout:
                if (!isImage4Open) {
                    findViewById(R.id.title4_cardview).setVisibility(View.VISIBLE);
                    mImage4.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

                } else {
                    findViewById(R.id.title4_cardview).setVisibility(View.GONE);
                    mImage4.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
                isImage4Open = !isImage4Open;
                break;
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
        super.onBackPressed();
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
}
