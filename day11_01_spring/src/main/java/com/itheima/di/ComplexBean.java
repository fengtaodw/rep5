package com.itheima.di;

import java.util.*;

public class ComplexBean {
    private String[] arr;
    private List<Person> list;
    private Set<String> set;
    private Map<String,Person> map;
    private Properties properties;

    public ComplexBean() {
    }

    public ComplexBean(String[] arr, List<Person> list, Set<String> set, Map<String, Person> map, Properties properties) {
        this.arr = arr;
        this.list = list;
        this.set = set;
        this.map = map;
        this.properties = properties;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, Person> getMap() {
        return map;
    }

    public void setMap(Map<String, Person> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ComplexBean{" +
                "arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
