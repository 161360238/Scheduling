package com.zhiyou.pojo;

public class ResourceUrls {
    private Long imoocResourceImoocId;

    private String imoocUrls;

    public Long getImoocResourceImoocId() {
        return imoocResourceImoocId;
    }

    public void setImoocResourceImoocId(Long imoocResourceImoocId) {
        this.imoocResourceImoocId = imoocResourceImoocId;
    }

    public String getImoocUrls() {
        return imoocUrls;
    }

    public void setImoocUrls(String imoocUrls) {
        this.imoocUrls = imoocUrls == null ? null : imoocUrls.trim();
    }
}