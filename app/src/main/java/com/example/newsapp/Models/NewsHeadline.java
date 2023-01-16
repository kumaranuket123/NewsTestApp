package com.example.newsapp.Models;

public class NewsHeadline {
    Source source=null;
    String title="";
    String description="";

    public NewsHeadline(Source source, String title, String description, String url, String urlRiImage) {
        this.source = source;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlRiImage = urlRiImage;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getUrlRiImage() {
        return urlRiImage;
    }

    public void setUrlRiImage(String urlRiImage) {
        this.urlRiImage = urlRiImage;
    }

    String url="";
    String urlRiImage="";
}
