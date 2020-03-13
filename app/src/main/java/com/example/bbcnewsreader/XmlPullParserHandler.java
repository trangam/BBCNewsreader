package com.example.bbcnewsreader;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class XmlPullParserHandler  {
    private List<BBCNews> news= new ArrayList<BBCNews>();
    private BBCNews bbc;
    private String text;

    public List<BBCNews> getNews() {
        return news;
    }

    public List<BBCNews> parse(InputStream is) {
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser  parser = factory.newPullParser();

            parser.setInput(is, "UTF-8");

            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagname = parser.getName();
                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if (tagname.equalsIgnoreCase("item")) {
                            // create a new instance of employee
                            bbc = new BBCNews();
                        }
                        break;

                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    case XmlPullParser.END_TAG:
                        if (tagname.equalsIgnoreCase("item")) {
                            // add employee object to list
                            news.add(bbc);
                        }else if (tagname.equalsIgnoreCase("title")) {
                            bbc.setTitle(text);
                        }  else if (tagname.equalsIgnoreCase("description")) {
                            bbc.setData(text);
                        } else if (tagname.equalsIgnoreCase("link")) {
                            bbc.setLink(text);
                        }else if (tagname.equalsIgnoreCase("pubDate")) {
                            bbc.setDate(text);
                        }
                        break;

                    default:
                        break;
                }
                eventType = parser.next();
            }

        } catch (XmlPullParserException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}

        return news;
    }  }