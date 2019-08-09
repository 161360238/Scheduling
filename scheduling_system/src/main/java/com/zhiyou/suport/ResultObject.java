package com.zhiyou.suport;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/6
 * @Description: com.zhiyou.suport
 * @version: 1.0
 */
import java.io.Serializable;

public class ResultObject implements Serializable {
    private Integer code;
    private String msg;
    private Object data;

    public ResultObject() {
    }

    public ResultObject(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultObject(Integer code, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toString() {
        return "ResultObject{code=" + this.code + ", msg='" + this.msg + '\'' + ", data=" + this.data + '}';
    }
}
