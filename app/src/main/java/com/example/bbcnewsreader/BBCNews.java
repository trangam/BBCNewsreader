package com.example.bbcnewsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BBCNews  {
private String title;
private String data;
private String date;
private String link;
public BBCNews(){}
public BBCNews(String title, String data, String date, String link){
    this.title=title;
    this.data=data;
    this.date=date;
    this.link=link;
}
public void setTitle(String title){
    this.title=title;
}
    public void setData(String data){
        this.data=data;
    }
    public void setDate(String date){
        this.date=date;
    }
    public void setLink(String link){
        this.link=link;
    }
public String getTitle(){return title;}
public String getData(){return data; }
public String getDate(){return date;}
public String getLink(){return link;}

}
