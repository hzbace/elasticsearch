package com.qfedu.elasticsearch.vo;

import java.io.Serializable;

public class ResultVo implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultVo setOK(Object o){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("ok");
        resultVo.setData(o);
        return resultVo;
    }

    public static ResultVo setERROR(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(0);
        resultVo.setMsg(msg);
        return resultVo;

    }
}
