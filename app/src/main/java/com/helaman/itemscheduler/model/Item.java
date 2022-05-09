package com.helaman.itemscheduler.model;

public class Item {

    private String url;
    private String startDate;
    private String endDate;
    private String name;
    private String icon;
    private String venue;
    private String objType;
    private String loginRequired;

    public Item(String url, String startDate, String endDate, String name, String icon, String venue, String objType, String loginRequired) {
        this.url = url;
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.icon = icon;
        this.venue = venue;
        this.objType = objType;
        this.loginRequired = loginRequired;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
