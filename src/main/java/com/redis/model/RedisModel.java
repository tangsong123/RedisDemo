package com.redis.model;

public class RedisModel {
    private Long advId;

    private String imgUrl;

    private String advMessage;

    public RedisModel() {
    }

    public RedisModel(Long advId, String imgUrl, String advMessage) {
        this.advId = advId;
        this.imgUrl = imgUrl;
        this.advMessage = advMessage;
    }

    public Long getAdvId() {
        return advId;
    }

    public void setAdvId(Long advId) {
        this.advId = advId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getAdvMessage() {
        return advMessage;
    }

    public void setAdvMessage(String advMessage) {
        this.advMessage = advMessage;
    }
}