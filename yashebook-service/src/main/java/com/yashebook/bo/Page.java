package com.yashebook.bo;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Page {

    private boolean rel;

    private String msg;

    private List list;

    private int count;

    public boolean getRel() {
        return rel;
    }

    public void setRel(boolean rel) {
        this.rel = rel;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Page(boolean rel, List list, int count){
        super();
        this.rel = rel;
        this.list = list;
        this.count = count;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
