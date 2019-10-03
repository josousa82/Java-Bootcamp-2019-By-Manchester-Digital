package com.manchesterdigital.challenges.shoppinglistchallenge;


public class Item implements Comparable<Item>{

    private String name;
    private Integer codeBar;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getCodeBar() {
        return codeBar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCodeBar(Integer codeBar) {
        this.codeBar = codeBar;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", codeBar=" + codeBar +
                '}';
    }


    @Override
    public int compareTo(Item o) {
        if(this.getName() == o.getName()) return 1;
        return 0;
    }
}
