package com.jiangwei.springtest.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by weijiang
 * Date: 2017/1/18
 * Desc:
 */

public class Animals {

    private Cat cat;

    public Animals(Cat cat) {
        this.cat = cat;
    }

    public Animals() {
    }

    public void outCatName() {
        System.out.println(this.cat.getName());
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
