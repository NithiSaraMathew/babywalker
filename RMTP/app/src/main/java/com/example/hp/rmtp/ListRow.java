package com.example.hp.rmtp;

/**
 * Created by Sandhya on 18-03-2018.
 */

public  class ListRow {

    String title,subTitle;

    public ListRow(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
