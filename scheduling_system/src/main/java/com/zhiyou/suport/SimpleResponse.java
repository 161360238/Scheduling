package com.zhiyou.suport;

/**
 * @Auther: http://wangjie
 * @Date: 2019/7/22
 * @Description: com.wj.security.browser.suport
 * 简单封装返回数据
 * @version: 1.0
 */
public class SimpleResponse {
    public SimpleResponse(Object content){
        this.content=content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
