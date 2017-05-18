package com.jiangwei.springtest.inherit;

/**
 * Created by Franco on 2017/5/14.
 */
public class Chinese extends Pepole {

    public void talk(Pepole pepole) {
        if(pepole instanceof Chinese) {
            System.out.println("user chinese languges");
        }
    }

    public void skinColor(Pepole pepole) {
        if(pepole instanceof Chinese) {
            System.out.println("the skin color is Yellow");
        }
    }
}
