package com.example.client.controller;

import java.util.List;

public class DemoPojo {

    private List<String> list;

    public DemoPojo(List<String> list) {
        this.list = list;
    }

    public DemoPojo() {}

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

}
