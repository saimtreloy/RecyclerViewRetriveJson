package com.moodybugs.saim.hospitalappointment;

/**
 * Created by sam on 12/7/16.
 */

public class Contact {

    String id, title, thumbnailUrl;

    public Contact(String id, String title, String thumbnailUrl) {
        this.id = id;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getthumbnailUrl() {
        return thumbnailUrl;
    }

    public void setthumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
