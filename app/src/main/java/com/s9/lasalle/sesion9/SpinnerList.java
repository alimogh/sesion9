package com.s9.lasalle.sesion9;

/**
 * Created by alexbruch on 18/1/17.
 */

public class SpinnerList {

    private String id;
    private String url;

    public SpinnerList(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
