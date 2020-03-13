package com.example.bbcnewsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.icu.util.RangeValueIterator;
import android.os.AsyncTask;
import android.os.Bundle;
import android.renderscript.Element;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String URL = "http://feeds.bbci.co.uk/news/world/us_and_canada/rss.xml";
    HttpURLConnection urlConnection;
    List<BBCNews> news;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.bbcList);
        news = null;

//        try {
//            java.net.URL url = new URL(this.URL);
//            urlConnection = (HttpURLConnection) url.openConnection();
//            XmlPullParserHandler parserHandler = new XmlPullParserHandler();
//            InputStream response = urlConnection.getInputStream();
//            news = parserHandler.parse(response);
//            news =new ArrayList<>();
//            MyListAdapter myListAdapter = new MyListAdapter(this, android.R.layout.simple_list_item_1, news);
//            listView.setAdapter(myListAdapter);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

}
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu., menu);
//        return true;
//    }
    private class MyListAdapter extends ArrayAdapter<BBCNews>{
        public MyListAdapter(Context context, int resource, List<BBCNews> list) {
            super(context, resource, list);
        }

//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            LayoutInflater inflater = (LayoutInflater) super.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            BBCNews  myMess = (BBCNews ) super.getItem(position);
//            if (convertView == null) {
//                convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_listview, parent, false);
//            }
//            TextView item = (TextView) convertView.findViewById(R.id.title);
//            item.setText(myMess.getTitle());
//
//            return convertView;
//        }
}}
